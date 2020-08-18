package pl.jaworskimateusz.machineservice.utilities

import android.app.DatePickerDialog
import android.content.Context
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*

internal class DatePicker(
        private val context: Context,
        val calendar: Calendar,
        private val etDate: EditText) : View.OnClickListener, DatePickerDialog.OnDateSetListener {

    init {
        this.etDate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        DatePickerDialog(
                context,
                this,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        ).show()
    }

    override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, monthOfYear)
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        etDate.setText(SimpleDateFormat(DateUtils.DATE_PATTERN, Locale.US).format(calendar.time))
    }

}