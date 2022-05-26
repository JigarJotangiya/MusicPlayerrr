package com.coocent.videoplayer.p061s;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.s.e */
/* compiled from: TimeUtils.kt */
public final class C2725e {
    /* renamed from: a */
    public static final String m12317a(long j, String str) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(date);
        C8594l.m46770d(format, "simpleDateFormat.format(date)");
        return format;
    }

    /* renamed from: b */
    public static final String m12318b(long j) {
        return j / ((long) 1000) >= 3600 ? "HH:mm:ss" : "mm:ss";
    }
}
