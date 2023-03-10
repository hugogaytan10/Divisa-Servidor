package com.example.divisaserver.network


import com.squareup.moshi.Json

data class Response (
    @Json(name="time_last_update_utc") val time_last_update_utc: String,
    @Json(name = "rates") val rates: Map<String, Double>
)
