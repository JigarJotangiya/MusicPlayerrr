package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.m */
/* compiled from: UtcDates */
class C6011m {

    /* renamed from: a */
    static AtomicReference<C6010l> f28203a = new AtomicReference<>();

    /* renamed from: a */
    static long m36102a(long j) {
        Calendar k = m36112k();
        k.setTimeInMillis(j);
        return m36105d(k).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    static DateFormat m36103b(Locale locale) {
        return m36104c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m36104c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m36111j());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m36105d(Calendar calendar) {
        Calendar l = m36113l(calendar);
        Calendar k = m36112k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m36106e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m36109h());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m36107f(Locale locale) {
        return m36106e(0, locale);
    }

    /* renamed from: g */
    static C6010l m36108g() {
        C6010l lVar = f28203a.get();
        return lVar == null ? C6010l.m36099c() : lVar;
    }

    /* renamed from: h */
    private static TimeZone m36109h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: i */
    static Calendar m36110i() {
        Calendar a = m36108g().mo23763a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m36109h());
        return a;
    }

    @TargetApi(24)
    /* renamed from: j */
    private static android.icu.util.TimeZone m36111j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: k */
    static Calendar m36112k() {
        return m36113l((Calendar) null);
    }

    /* renamed from: l */
    static Calendar m36113l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m36109h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: m */
    static DateFormat m36114m(Locale locale) {
        return m36104c("yMMMEd", locale);
    }
}
