const Device = require('../models/Device');

exports.getDevices = async (req, res) => {
    try {
        const devices = await Device.find().populate('room');
        res.json(devices);
    } catch (err) {
        res.status(500).send('Server error');
    }
};