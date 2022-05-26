package com.coocent.video.videoplayercore.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p369i.p387z.p389d.C8594l;

/* compiled from: TimeUtils.kt */
public final class TimeUtilsKt {
    public static final String formatTime(long j, String str) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(date);
        C8594l.m46770d(format, "simpleDateFormat.format(date)");
        return format;
    }

    public static final String getTimeFormat(long j) {
        return j / ((long) 1000) >= 3600 ? "HH:mm:ss" : "mm:ss";
    }
}
