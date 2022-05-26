package net.coocent.android.xmlparser.widget.view.tabs.p454a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p082e.p137o.p138a.p139a.C4096a;
import p082e.p137o.p138a.p139a.C4097b;
import p082e.p137o.p138a.p139a.C4098c;

/* renamed from: net.coocent.android.xmlparser.widget.view.tabs.a.a */
/* compiled from: AnimationUtils */
public class C9553a {

    /* renamed from: a */
    public static final TimeInterpolator f36698a = new C4097b();

    static {
        new LinearInterpolator();
        new C4096a();
        new C4098c();
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static int m50143a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
