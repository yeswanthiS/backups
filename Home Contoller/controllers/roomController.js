const Room = require('../models/Room');
const Device = require('../models/Device');

exports.createRoom = async (req, res) => {
    const { name } = req.body;
    try {
        const room = new Room({ name });
        await room.save();
        res.json(room);
    } catch (err) {
        res.status(500).send('Server error');
    }
};

exports.getRooms = async (req, res) => {
    try {
        const rooms = await Room.find().populate('devices');
        res.json(rooms);
    } catch (err) {
        res.status(500).send('Server error');
    }
};

exports.addDeviceToRoom = async (req, res) => {
    const { roomId, deviceName, deviceType } = req.body;
    try {
        const device = new Device({ name: deviceName, type: deviceType, room: roomId });
        await device.save();
        const room = await Room.findById(roomId);
        room.devices.push(device);
        await room.save();
        res.json(room);
    } catch (err) {
        res.status(500).send('Server error');
    }
};