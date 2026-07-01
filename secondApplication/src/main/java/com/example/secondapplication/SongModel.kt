package com.example.secondapplication

import kotlinx.serialization.Serializable

@Serializable
data class SongModel(
    val id: Int,
    val imageLink: String,
    val albumName: String? = null,
    val songTitle: String,
    val singer: String,
    val releaseYear: Int? = null
)