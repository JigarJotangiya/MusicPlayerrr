package p159f.p243f.p245b.p304b.p309q;

import android.content.Context;
import android.graphics.Color;
import p082e.p109h.p110h.C3621a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7521b;

/* renamed from: f.f.b.b.q.a */
/* compiled from: ElevationOverlayProvider */
public class C7515a {

    /* renamed from: a */
    private final boolean f32722a;

    /* renamed from: b */
    private final int f32723b;

    /* renamed from: c */
    private final int f32724c;

    /* renamed from: d */
    private final float f32725d;

    public C7515a(Context context) {
        this.f32722a = C7521b.m42010b(context, C7490b.elevationOverlayEnabled, false);
        this.f32723b = C7513a.m41978b(context, C7490b.elevationOverlayColor, 0);
        this.f32724c = C7513a.m41978b(context, C7490b.colorSurface, 0);
        this.f32725d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: f */
    private boolean m41987f(int i) {
        return C3621a.m15595m(i, 255) == this.f32724c;
    }

    /* renamed from: a */
    public float mo28402a(float f) {
        float f2 = this.f32725d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo28403b(int i, float f) {
        float a = mo28402a(f);
        return C3621a.m15595m(C7513a.m41983g(C3621a.m15595m(i, 255), this.f32723b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo28404c(int i, float f) {
        return (!this.f32722a || !m41987f(i)) ? i : mo28403b(i, f);
    }

    /* renamed from: d */
    public int mo28405d(float f) {
        return mo28404c(this.f32724c, f);
    }

    /* renamed from: e */
    public boolean mo28406e() {
        return this.f32722a;
    }
}
