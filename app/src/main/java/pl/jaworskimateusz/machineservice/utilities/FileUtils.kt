package pl.jaworskimateusz.machineservice.utilities

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import android.util.Log
import okhttp3.ResponseBody
import java.io.*
import java.lang.Exception


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

        fun bitmapToString(bitmap: Bitmap): String {
            val byteArrayOutputStream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
            val byteArray = byteArrayOutputStream.toByteArray()
            return Base64.encodeToString(byteArray, Base64.DEFAULT)


        }

        fun stringToBitmap(string: String): Bitmap? {
            return try {
                val imageBytes = Base64.decode(string, 0)
                val bitmap= BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
                bitmap
            } catch (e: Exception) {
                Log.e(TAG, e.message)
                null
            }
        }
        private const val TAG = "File Utils"
    }
}