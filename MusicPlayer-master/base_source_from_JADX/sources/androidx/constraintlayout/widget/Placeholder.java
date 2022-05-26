package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p082e.p099f.p100a.p104m.C3527e;

public class Placeholder extends View {

    /* renamed from: g */
    private int f2280g = -1;

    /* renamed from: h */
    private View f2281h = null;

    /* renamed from: i */
    private int f2282i = 4;

    public Placeholder(Context context) {
        super(context);
        m2724a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m2724a(AttributeSet attributeSet) {
        super.setVisibility(this.f2282i);
        this.f2280g = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_placeholder_content) {
                    this.f2280g = obtainStyledAttributes.getResourceId(index, this.f2280g);
                } else if (index == C0439f.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f2282i = obtainStyledAttributes.getInt(index, this.f2282i);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo2911b(ConstraintLayout constraintLayout) {
        if (this.f2281h != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2281h.getLayoutParams();
            layoutParams2.f2247s0.mo12681g1(0);
            C3527e.C3529b C = layoutParams.f2247s0.mo12619C();
            C3527e.C3529b bVar = C3527e.C3529b.FIXED;
            if (C != bVar) {
                layoutParams.f2247s0.mo12683h1(layoutParams2.f2247s0.mo12657V());
            }
            if (layoutParams.f2247s0.mo12651S() != bVar) {
                layoutParams.f2247s0.mo12632I0(layoutParams2.f2247s0.mo12720z());
            }
            layoutParams2.f2247s0.mo12681g1(8);
        }
    }

    /* renamed from: c */
    public void mo2912c(ConstraintLayout constraintLayout) {
        if (this.f2280g == -1 && !isInEditMode()) {
            setVisibility(this.f2282i);
        }
        View findViewById = constraintLayout.findViewById(this.f2280g);
        this.f2281h = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f2223g0 = true;
            this.f2281h.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2281h;
    }

    public int getEmptyVisibility() {
        return this.f2282i;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2280g != i) {
            View view = this.f2281h;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f2281h.getLayoutParams()).f2223g0 = false;
                this.f2281h = null;
            }
            this.f2280g = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2282i = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2724a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2724a(attributeSet);
    }
}
