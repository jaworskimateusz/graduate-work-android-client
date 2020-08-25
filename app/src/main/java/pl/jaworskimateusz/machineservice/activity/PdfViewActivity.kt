package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import pl.jaworskimateusz.machineservice.R
import java.io.File

class PdfViewActivity: AppCompatActivity() {

    private lateinit var pdfView: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.service_instruction_view)
        pdfView = findViewById(R.id.pdfView)
        val filePath = intent.extras.getString("filePath")
        pdfView.fromFile(File(filePath))
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .load()
        super.onCreate(savedInstanceState)
    }

}