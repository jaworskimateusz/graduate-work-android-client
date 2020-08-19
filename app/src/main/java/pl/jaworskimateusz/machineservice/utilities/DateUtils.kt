package pl.jaworskimateusz.machineservice.utilities

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateUtils {
    companion object {

        const val DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm"
        const val DATE_TIME_PATTERN_ISO = "yyyy-MM-dd'T'HH:mm"
        const val DATE_TIME_SEC_PATTERN = "yyyy-MM-dd HH:mm:ss"
        const val DATE_PATTERN = "dd-MM-yyyy"
        const val DATE_PATTERN_SEC = "yyyy-MM-dd"
        const val TIME_PATTERN = "HH:mm"

        fun dateToString(date: Date?) : String {
            if (date == null)
                return ""
            val format = SimpleDateFormat(DATE_TIME_PATTERN)
            return format.format(date)
        }

        fun dateToString(date: Calendar): String {
            val format = SimpleDateFormat(DATE_PATTERN)
            return format.format(date.time)
        }

        fun stringToDate(string: String): Date {
            val format = SimpleDateFormat(DATE_PATTERN)
            return format.parse(string)
        }

    }
}