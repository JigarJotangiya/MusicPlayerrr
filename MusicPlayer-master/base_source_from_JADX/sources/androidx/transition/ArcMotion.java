package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0533g;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {

    /* renamed from: d */
    private static final float f4481d = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    private float f4482a = 0.0f;

    /* renamed from: b */
    private float f4483b = 0.0f;

    /* renamed from: c */
    private float f4484c = f4481d;

    public ArcMotion() {
    }

    /* renamed from: e */
    private static float m6105e(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public Path mo5884a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f10 = f3 - f;
        float f11 = f4 - f2;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f + f3) / 2.0f;
        float f14 = (f2 + f4) / 2.0f;
        float f15 = 0.25f * f12;
        boolean z = f2 > f4;
        if (Math.abs(f10) < Math.abs(f11)) {
            float abs = Math.abs(f12 / (f11 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f4483b;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f16 + f;
            } else {
                f8 = f3 - f16;
                f9 = f4;
            }
            f5 = this.f4482a;
        }
        float f17 = f15 * f5 * f5;
        float f18 = f13 - f6;
        float f19 = f14 - f7;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.f4484c;
        float f22 = f15 * f21 * f21;
        if (f20 >= f17) {
            f17 = f20 > f22 ? f22 : 0.0f;
        }
        if (f17 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f17 / f20));
            f6 = ((f6 - f13) * sqrt) + f13;
            f7 = f14 + (sqrt * (f7 - f14));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public void mo5885b(float f) {
        this.f4484c = m6105e(f);
    }

    /* renamed from: c */
    public void mo5886c(float f) {
        this.f4482a = m6105e(f);
    }

    /* renamed from: d */
    public void mo5887d(float f) {
        this.f4483b = m6105e(f);
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4736h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo5887d(C0533g.m3247f(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        mo5886c(C0533g.m3247f(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        mo5885b(C0533g.m3247f(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
}
