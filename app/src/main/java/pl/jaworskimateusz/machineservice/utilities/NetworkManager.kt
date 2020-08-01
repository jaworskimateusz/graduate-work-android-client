package pl.jaworskimateusz.machineservice.utilities

import android.content.Context
import android.net.ConnectivityManager

class NetworkManager () {

    companion object {
        fun isNetworkAvailable(context: Context) : Boolean {
            val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
            val networkInfo = manager!!.activeNetworkInfo
            var isAvailable = false
            if (networkInfo != null && networkInfo!!.isConnected()) {
                isAvailable = true
            }
            return isAvailable
        }
    }
}

