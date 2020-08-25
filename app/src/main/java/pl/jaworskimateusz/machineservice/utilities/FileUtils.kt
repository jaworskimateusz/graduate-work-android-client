package pl.jaworskimateusz.machineservice.utilities

import android.content.Context
import android.util.Log
import okhttp3.ResponseBody
import java.io.*


class FileUtils {
    companion object {
        fun writeResponseBodyToMemory(context: Context, body: ResponseBody, fileName: String): File? {
            return try {
                val file = File(context.externalCacheDir, fileName)
                var inputStream: InputStream? = null
                var outputStream: OutputStream? = null
                try {
                    val fileReader = ByteArray(4096)
                    val fileSize = body.contentLength()
                    var fileSizeDownloaded: Long = 0
                    inputStream = body.byteStream()
                    outputStream = FileOutputStream(file)
                    while (true) {
                        val read: Int = inputStream.read(fileReader)
                        if (read == -1) {
                            break
                        }
                        outputStream.write(fileReader, 0, read)
                        fileSizeDownloaded += read.toLong()
                        Log.d(TAG, "file download: $fileSizeDownloaded of $fileSize")
                    }
                    outputStream.flush()
                    return file
                } catch (e: IOException) {
                    Log.e(TAG, e.message)
                    null
                } finally {
                    inputStream?.close()
                    outputStream?.close()
                }
            } catch (e: IOException) {
                return null
            }
        }
        private const val TAG = "File Utils"
    }
}