package com.example.mykotlinproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mykotlinproject.databinding.ActivityStatusBinding
import org.json.JSONObject

class StatusActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckStatus.setOnClickListener {
            checkVehicleStatus()
        }
    }

    private fun checkVehicleStatus() {
        val vehicleNumber = binding.etVehicleNumberStatus.text.toString().trim()

        if (vehicleNumber.isEmpty()) {
            Toast.makeText(this, "Please enter the vehicle number", Toast.LENGTH_SHORT).show()
            return
        }

        val url = "https://kotlinproject.onrender.com/api/vehicle/status?vehicleNumber=$vehicleNumber"
        val requestQueue = Volley.newRequestQueue(this)

        val stringRequest = StringRequest(Request.Method.GET, url, { response ->
            val jsonResponse = JSONObject(response)
            val health