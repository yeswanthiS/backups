const mongoose = require('mongoose');

const DeviceSchema = new mongoose.Schema({
    name: { type: String, required: true },
    type: { type: String, required: true },
    status: { type: Boolean, default: false },
    room: { type: mongoose.Schema.Types.ObjectId, ref: 'Room' },
});

module.exports = mongoose.model('Device', DeviceSchema);