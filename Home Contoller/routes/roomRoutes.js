const express = require('express');
const router = express.Router();
const deviceController = require('../controllers/deviceController');
const auth = require('../middleware/authMiddleware');

router.get('/all', auth, deviceController.getDevices);

module.exports = router;