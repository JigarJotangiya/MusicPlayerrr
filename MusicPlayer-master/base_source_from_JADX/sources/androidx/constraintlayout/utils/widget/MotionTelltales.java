package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0439f;

public class MotionTelltales extends MockView {

    /* renamed from: r */
    private Paint f2145r = new Paint();

    /* renamed from: s */
    MotionLayout f2146s;

    /* renamed from: t */
    float[] f2147t = new float[2];

    /* renamed from: u */
    Matrix f2148u = new Matrix();

    /* renamed from: v */
    int f2149v = 0;

    /* renamed from: w */
    int f2150w = -65281;

    /* renamed from: x */
    float f2151x = 0.25f;

    public MotionTelltales(Context context) {
        super(context);
        m2667a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m2667a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.MotionTelltales_telltales_tailColor) {
                    this.f2150w = obtainStyledAttributes.getColor(index, this.f2150w);
                } else if (index == C0439f.MotionTelltales_telltales_velocityMode) {
                    this.f2149v = obtainStyledAttributes.getInt(index, this.f2149v);
                } else if (index == C0439f.MotionTelltales_telltales_tailScale) {
                    this.f2151x = obtainStyledAttributes.getFloat(index, this.f2151x);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2145r.setColor(this.f2150w);
        this.f2145r.setStrokeWidth(5.0f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2148u);
        if (this.f2146s == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2146s = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f2146s.mo2482p0(this, f2, f, this.f2147t, this.f2149v);
                this.f2148u.mapVectors(this.f2147t);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.f2147t;
                float f5 = fArr2[0];
                float f6 = this.f2151x;
                float f7 = f4 - (fArr2[1] * f6);
                this.f2148u.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f2145r);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2082l = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2667a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2667a(context, attributeSet);
    }
}
