package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0440g;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ReactiveGuide extends View implements C0440g.C0441a {

    /* renamed from: g */
    private int f2283g = -1;

    /* renamed from: h */
    private boolean f2284h = false;

    /* renamed from: i */
    private int f2285i = 0;

    /* renamed from: j */
    private boolean f2286j = true;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        m2727a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m2727a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f2283g = obtainStyledAttributes.getResourceId(index, this.f2283g);
                } else if (index == C0439f.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f2284h = obtainStyledAttributes.getBoolean(index, this.f2284h);
                } else if (index == C0439f.f2451x2694048c) {
                    this.f2285i = obtainStyledAttributes.getResourceId(index, this.f2285i);
                } else if (index == C0439f.f2450xfdeff96) {
                    this.f2286j = obtainStyledAttributes.getBoolean(index, this.f2286j);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2283g != -1) {
            ConstraintLayout.getSharedValues().mo2988a(this.f2283g, this);
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f2285i;
    }

    public int getAttributeId() {
        return this.f2283g;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f2284h = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f2285i = i;
    }

    public void setAttributeId(int i) {
        C0440g sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f2283g;
        if (i2 != -1) {
            sharedValues.mo2989b(i2, this);
        }
        this.f2283g = i;
        if (i != -1) {
            sharedValues.mo2988a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2210a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2212b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2214c = f;
        setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        m2727a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        m2727a(attributeSet);
    }
}
