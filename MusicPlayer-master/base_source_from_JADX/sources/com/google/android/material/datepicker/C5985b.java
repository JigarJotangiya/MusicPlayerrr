package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7521b;
import p159f.p243f.p245b.p304b.p312t.C7522c;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: CalendarStyle */
final class C5985b {

    /* renamed from: a */
    final C5984a f28140a;

    /* renamed from: b */
    final C5984a f28141b;

    /* renamed from: c */
    final C5984a f28142c;

    /* renamed from: d */
    final C5984a f28143d;

    /* renamed from: e */
    final C5984a f28144e;

    /* renamed from: f */
    final C5984a f28145f;

    /* renamed from: g */
    final C5984a f28146g;

    /* renamed from: h */
    final Paint f28147h;

    C5985b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7521b.m42012d(context, C7490b.materialCalendarStyle, C5988e.class.getCanonicalName()), C7500l.MaterialCalendar);
        this.f28140a = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_dayStyle, 0));
        this.f28146g = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_dayInvalidStyle, 0));
        this.f28141b = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_daySelectedStyle, 0));
        this.f28142c = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C7522c.m42014a(context, obtainStyledAttributes, C7500l.MaterialCalendar_rangeFillColor);
        this.f28143d = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_yearStyle, 0));
        this.f28144e = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_yearSelectedStyle, 0));
        this.f28145f = C5984a.m36032a(context, obtainStyledAttributes.getResourceId(C7500l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f28147h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
