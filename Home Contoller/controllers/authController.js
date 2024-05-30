const User = require('../models/User');
const bcrypt = require('bcryptjs');

exports.signup = async (req, res) => {
    const { username, password } = req.body;
    try {
        const user = new User({ username, password });
        user.password = await bcrypt.hash(password, 10);
        await user.save();
        res.status(201).json({ message: 'User registered successfully' });
    } catch (err) {
        res.status(500).send('Server error');
    }
};

exports.login = async (req, res) => {
    const { username, password } = req.body;
    try {
        const user = await User.findOne({ username });
        if (!user || !(await bcrypt.compare(password, user.password))) {
            return res.status(401).json({ message: 'Invalid credentials' });
        }
        req.session.userId = user._id;
        res.json({ message: 'User logged in successfully' });
    } catch (err) {
        res.status(500).send('Server error');
    }
};