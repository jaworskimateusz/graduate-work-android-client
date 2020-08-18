package pl.jaworskimateusz.machineservice.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lpl/jaworskimateusz/machineservice/utilities/DatePicker;", "Landroid/view/View$OnClickListener;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "context", "Landroid/content/Context;", "calendar", "Ljava/util/Calendar;", "etDate", "Landroid/widget/EditText;", "(Landroid/content/Context;Ljava/util/Calendar;Landroid/widget/EditText;)V", "getCalendar", "()Ljava/util/Calendar;", "onClick", "", "v", "Landroid/view/View;", "onDateSet", "view", "Landroid/widget/DatePicker;", "year", "", "monthOfYear", "dayOfMonth", "app_debug"})
public final class DatePicker implements android.view.View.OnClickListener, android.app.DatePickerDialog.OnDateSetListener {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Calendar calendar = null;
    private final android.widget.EditText etDate = null;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.NotNull()
    android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getCalendar() {
        return null;
    }
    
    public DatePicker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar, @org.jetbrains.annotations.NotNull()
    android.widget.EditText etDate) {
        super();
    }
}