const mongoose = require('mongoose');

const RoomSchema = new mongoose.Schema({
    name: { type: String, required: true },
    devices: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Device' }],
});

module.exports = mongoose.model('Room', RoomSchema);