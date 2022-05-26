package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.C0439f;

public class MotionButton extends AppCompatButton {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f2088i = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f2089j = Float.NaN;

    /* renamed from: k */
    private Path f2090k;

    /* renamed from: l */
    ViewOutlineProvider f2091l;

    /* renamed from: m */
    RectF f2092m;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    class C0417a extends ViewOutlineProvider {
        C0417a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionButton.this.f2088i) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    class C0418b extends ViewOutlineProvider {
        C0418b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2089j);
        }
    }

    public MotionButton(Context context) {
        super(context);
        m2654c(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m2654c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ImageFilterView_round) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == C0439f.ImageFilterView_roundPercent && Build.VERSION.SDK_INT >= 21) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2089j == 0.0f || this.f2090k == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2090k);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getRound() {
        return this.f2089j;
    }

    public float getRoundPercent() {
        return this.f2088i;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2089j = f;
            float f2 = this.f2088i;
            this.f2088i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2089j != f;
        this.f2089j = f;
        if (f != 0.0f) {
            if (this.f2090k == null) {
                this.f2090k = new Path();
            }
            if (this.f2092m == null) {
                this.f2092m = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2091l == null) {
                    C0418b bVar = new C0418b();
                    this.f2091l = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.f2092m.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2090k.reset();
            Path path = this.f2090k;
            RectF rectF = this.f2092m;
            float f3 = this.f2089j;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f2088i != f;
        this.f2088i = f;
        if (f != 0.0f) {
            if (this.f2090k == null) {
                this.f2090k = new Path();
            }
            if (this.f2092m == null) {
                this.f2092m = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2091l == null) {
                    C0417a aVar = new C0417a();
                    this.f2091l = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2088i) / 2.0f;
            this.f2092m.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2090k.reset();
            this.f2090k.addRoundRect(this.f2092m, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2654c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2654c(context, attributeSet);
    }
}
