package com.example.skyline

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform