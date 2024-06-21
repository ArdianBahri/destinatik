package com.dicoding.destinatik.core.domain.model

import com.google.gson.annotations.SerializedName

data class RecommendModel(
    @SerializedName("userId")
    val userId: Int,
    @SerializedName("city")
    val city: String,
)
