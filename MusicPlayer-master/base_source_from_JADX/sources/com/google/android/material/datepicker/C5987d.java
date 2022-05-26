package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: DaysOfWeekAdapter */
class C5987d extends BaseAdapter {

    /* renamed from: j */
    private static final int f28148j = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: g */
    private final Calendar f28149g;

    /* renamed from: h */
    private final int f28150h;

    /* renamed from: i */
    private final int f28151i;

    public C5987d() {
        Calendar k = C6011m.m36112k();
        this.f28149g = k;
        this.f28150h = k.getMaximum(7);
        this.f28151i = k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m36041b(int i) {
        int i2 = i + this.f28151i;
        int i3 = this.f28150h;
        return i2 > i3 ? i2 - i3 : i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f28150h) {
            return null;
        }
        return Integer.valueOf(m36041b(i));
    }

    public int getCount() {
        return this.f28150h;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p159f.p243f.p245b.p304b.C7496h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f28149g
            int r6 = r5.m36041b(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f28149g
            int r3 = f28148j
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p159f.p243f.p245b.p304b.C7498j.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f28149g
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C5987d.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
