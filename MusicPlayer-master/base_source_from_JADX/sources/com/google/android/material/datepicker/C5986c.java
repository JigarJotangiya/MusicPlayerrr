package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: DateStrings */
class C5986c {
    /* renamed from: a */
    static String m36036a(long j) {
        return m36037b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m36037b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C6011m.m36103b(locale).format(new Date(j));
        }
        return C6011m.m36107f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m36038c(Context context, long j) {
        return DateUtils.formatDateTime(context, j - ((long) TimeZone.getDefault().getOffset(j)), 36);
    }

    /* renamed from: d */
    static String m36039d(long j) {
        return m36040e(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m36040e(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C6011m.m36114m(locale).format(new Date(j));
        }
        return C6011m.m36107f(locale).format(new Date(j));
    }
}
