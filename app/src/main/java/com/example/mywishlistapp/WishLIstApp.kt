package com.example.mywishlistapp

import android.app.Application

class WishLIstApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}