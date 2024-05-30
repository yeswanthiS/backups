package com.example.mykotlinproject


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mykotlinproject.databinding.ActivityRegisterBinding
import org.json.JSONObject

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            registerVehicle()
        }
    }

    private fun registerVehicle() {
        val vehicleNumber = binding.etVehicleNumber.text.toString().trim()
        val chassisNumber = binding.etChassisNumber.text.toString().trim()
        val aadharNumber = binding.etAadharNumber.text.toString().trim()
        val name = binding.etName.text.toString().trim()
        val mobileNumber = binding.etMobileNumber.text.toString().trim()
        val healthCondition = binding.etHealthCondition.text.toString().trim()

        if (vehicleNumber.isEmpty() || chassisNumber.isEmpty() || aadharNumber.isEmpty() ||
            name.isEmpty() || mobileNumber.isEmpty() || healthCondition.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        val url = "https://kotlinproject.onrender.com/api/vehicle/register"
        val requestQueue = Volley.newRequestQueue(this)

        val jsonRequest = object : StringRequest(Request.Method.POST, url, {
            Toast.makeText(this, "Vehicle registered successfully", Toast.LENGTH_SHORT).show()
            finish()
        }, {
            Toast.makeText(this, "Failed to register vehicle", Toast.LENGTH_SHORT).show()
        }) {
            override fun getHeaders(): MutableMap<String, String> {
                return HashMap()
            }

            override fun getBody(): ByteArray {
                val params = HashMap<String, String>()
                params["vehicleNumber"] = vehicleNumber
                params["chassisNumber"] = chassisNumber
                params["aadharNumber"] = aadharNumber
                params["name"] = name
                params["mobileNumber"] = mobileNumber
                params["healthCondition"] = healthCondition
                return JSONObject(params as Map<*, *>).toString().toByteArray()
            }

            override fun getBodyContentType(): String {
                return "application/json; charset=utf-8"
            }
        }

        requestQueue.add(jsonRequest)
    }
}