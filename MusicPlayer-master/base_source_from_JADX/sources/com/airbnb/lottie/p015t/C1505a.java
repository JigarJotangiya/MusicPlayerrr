package com.airbnb.lottie.p015t;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: com.airbnb.lottie.t.a */
/* compiled from: LPaint */
public class C1505a extends Paint {
    public C1505a() {
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public C1505a(int i) {
        super(i);
    }

    public C1505a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C1505a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
