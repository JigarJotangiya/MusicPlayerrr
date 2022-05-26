package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.l */
/* compiled from: TimeSource */
class C6010l {

    /* renamed from: c */
    private static final C6010l f28200c = new C6010l((Long) null, (TimeZone) null);

    /* renamed from: a */
    private final Long f28201a;

    /* renamed from: b */
    private final TimeZone f28202b;

    private C6010l(Long l, TimeZone timeZone) {
        this.f28201a = l;
        this.f28202b = timeZone;
    }

    /* renamed from: c */
    static C6010l m36099c() {
        return f28200c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo23763a() {
        return mo23764b(this.f28202b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Calendar mo23764b(TimeZone timeZone) {
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f28201a;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
