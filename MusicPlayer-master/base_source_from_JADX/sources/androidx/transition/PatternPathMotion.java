package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.p003d.C0533g;
import org.xmlpull.v1.XmlPullParser;
import p082e.p109h.p110h.C3623c;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    private final Path f4561a;

    /* renamed from: b */
    private final Matrix f4562b;

    public PatternPathMotion() {
        Path path = new Path();
        this.f4561a = path;
        this.f4562b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    /* renamed from: b */
    private static float m6199b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    public Path mo5884a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m6199b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f4562b.setScale(b, b);
        this.f4562b.postRotate((float) Math.toDegrees(atan2));
        this.f4562b.postTranslate(f, f2);
        Path path = new Path();
        this.f4561a.transform(this.f4562b, path);
        return path;
    }

    /* renamed from: c */
    public void mo5955c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f4562b.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m6199b(f5, f6);
        this.f4562b.postScale(b, b);
        this.f4562b.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f4562b, this.f4561a);
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f4561a = new Path();
        this.f4562b = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4737i);
        try {
            String i = C0533g.m3250i(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (i != null) {
                mo5955c(C3623c.m15605e(i));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
