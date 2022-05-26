package p159f.p166c.p177d.p178h;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: f.c.d.h.b */
/* compiled from: LyricLayout */
public class C4349b {

    /* renamed from: a */
    private float f12930a = Float.MIN_VALUE;

    /* renamed from: b */
    private StaticLayout f12931b;

    public C4349b(StaticLayout staticLayout) {
        this.f12931b = staticLayout;
    }

    /* renamed from: a */
    public static StaticLayout m18961a(CharSequence charSequence, TextPaint textPaint, int i, int i2) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (i2 != 0) {
            if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 2) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, false);
    }

    /* renamed from: d */
    public static int m18962d(float f, float f2, float f3, float f4, int i) {
        float f5 = f - f4;
        int i2 = (int) (f5 / 2.0f);
        return i == 0 ? i2 : i == 1 ? (int) f2 : i == 2 ? (int) (f5 - f3) : i2;
    }

    /* renamed from: e */
    public static int m18963e(float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        float f6;
        float f7;
        int i2;
        int i3 = (int) (z ? (f + f4) / 2.0f : ((f - f4) / 2.0f) + f5);
        if (i == 0) {
            if (z) {
                f7 = (f + f4) / 2.0f;
                i2 = (int) f7;
                return i2;
            }
            f6 = (f - f4) / 2.0f;
        } else if (i == 1) {
            i2 = (int) (z ? f2 + f4 : f2 + f5);
            return i2;
        } else if (i != 2) {
            return i3;
        } else {
            if (z) {
                f7 = f - f3;
                i2 = (int) f7;
                return i2;
            }
            f6 = (f - f4) - f3;
        }
        f7 = f6 + f5;
        i2 = (int) f7;
        return i2;
    }

    /* renamed from: b */
    public int mo14760b() {
        StaticLayout staticLayout = this.f12931b;
        if (staticLayout != null) {
            return staticLayout.getHeight();
        }
        return 0;
    }

    /* renamed from: c */
    public float mo14761c() {
        return this.f12930a;
    }

    /* renamed from: f */
    public StaticLayout mo14762f() {
        return this.f12931b;
    }

    /* renamed from: g */
    public void mo14763g(float f) {
        this.f12930a = f;
    }
}
