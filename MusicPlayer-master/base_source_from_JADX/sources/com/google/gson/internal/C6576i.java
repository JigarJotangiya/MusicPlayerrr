package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.gson.internal.i */
/* compiled from: PreJava9DateFormatProvider */
public class C6576i {
    /* renamed from: a */
    private static String m38024a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: b */
    private static String m38025b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i);
    }

    /* renamed from: c */
    public static DateFormat m38026c(int i, int i2) {
        return new SimpleDateFormat(m38024a(i) + " " + m38025b(i2), Locale.US);
    }
}
