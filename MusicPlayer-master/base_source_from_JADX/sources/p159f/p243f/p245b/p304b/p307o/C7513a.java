package p159f.p243f.p245b.p304b.p307o;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p082e.p109h.p110h.C3621a;
import p159f.p243f.p245b.p304b.p312t.C7521b;

/* renamed from: f.f.b.b.o.a */
/* compiled from: MaterialColors */
public class C7513a {
    /* renamed from: a */
    public static int m41977a(int i, int i2) {
        return C3621a.m15595m(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: b */
    public static int m41978b(Context context, int i, int i2) {
        TypedValue a = C7521b.m42009a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: c */
    public static int m41979c(Context context, int i, String str) {
        return C7521b.m42012d(context, i, str);
    }

    /* renamed from: d */
    public static int m41980d(View view, int i) {
        return C7521b.m42013e(view, i);
    }

    /* renamed from: e */
    public static int m41981e(View view, int i, int i2) {
        return m41978b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static int m41982f(int i, int i2) {
        return C3621a.m15591i(i2, i);
    }

    /* renamed from: g */
    public static int m41983g(int i, int i2, float f) {
        return m41982f(i, C3621a.m15595m(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: h */
    public static int m41984h(View view, int i, int i2, float f) {
        return m41983g(m41980d(view, i), m41980d(view, i2), f);
    }
}
