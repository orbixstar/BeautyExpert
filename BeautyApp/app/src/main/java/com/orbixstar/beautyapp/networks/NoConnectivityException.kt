package com.orbixstar.beautyapp.networks

import java.io.IOException

class NoConnectivityException: IOException() {
    override val message: String = "No Internet Connection"
}