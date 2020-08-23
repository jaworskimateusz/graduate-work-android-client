package pl.jaworskimateusz.machineservice.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import me.dm7.barcodescanner.zxing.ZXingScannerView
import me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
import com.google.zxing.Result

class QrScannerActivity : Activity(), ResultHandler {

    private lateinit var scannerView: ZXingScannerView

    override fun onCreate(state: Bundle?) {
        super.onCreate(state)
        scannerView = ZXingScannerView(this)
        setContentView(scannerView)
    }

    override fun handleResult(result: Result) {
        Log.v("RESULT", result.text)
        val intent = Intent(this, MachineDetailActivity::class.java)
        intent.putExtra("code", result.text)
        finish()
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()
        scannerView.setResultHandler(this)
        scannerView.startCamera()
    }

    override fun onPause() {
        super.onPause()
        scannerView.stopCamera()
    }
}