package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.C0439f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3531g;
import p082e.p099f.p100a.p104m.C3536j;
import p082e.p099f.p100a.p104m.C3539m;

public class Flow extends VirtualLayout {

    /* renamed from: r */
    private C3531g f1589r;

    public Flow(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        super.mo2380o(attributeSet);
        this.f1589r = new C3531g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_Layout_android_orientation) {
                    this.f1589r.mo12768z2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_android_padding) {
                    this.f1589r.mo12797F1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_android_paddingStart) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f1589r.mo12802K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == C0439f.ConstraintLayout_Layout_android_paddingEnd) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        this.f1589r.mo12799H1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                    }
                } else if (index == C0439f.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1589r.mo12800I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1589r.mo12803L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1589r.mo12801J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1589r.mo12798G1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1589r.mo12753E2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1589r.mo12761t2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1589r.mo12752D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1589r.mo12755n2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1589r.mo12763v2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1589r.mo12757p2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1589r.mo12765x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1589r.mo12759r2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1589r.mo12754m2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1589r.mo12762u2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1589r.mo12756o2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1589r.mo12764w2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1589r.mo12750B2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1589r.mo12758q2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1589r.mo12749A2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1589r.mo12760s2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1589r.mo12751C2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1589r.mo12766y2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2158j = this.f1589r;
        mo2858w();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2410x(this.f1589r, i, i2);
    }

    /* renamed from: p */
    public void mo2384p(C0430c.C0431a aVar, C3536j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C3527e> sparseArray) {
        super.mo2384p(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof C3531g) {
            C3531g gVar = (C3531g) jVar;
            int i = layoutParams.f2206W;
            if (i != -1) {
                gVar.mo12768z2(i);
            }
        }
    }

    /* renamed from: q */
    public void mo2385q(C3527e eVar, boolean z) {
        this.f1589r.mo12804q1(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1589r.mo12754m2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1589r.mo12755n2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1589r.mo12756o2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1589r.mo12757p2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1589r.mo12758q2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1589r.mo12759r2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1589r.mo12760s2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1589r.mo12761t2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f1589r.mo12762u2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1589r.mo12763v2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f1589r.mo12764w2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1589r.mo12765x2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1589r.mo12766y2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1589r.mo12768z2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f1589r.mo12797F1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1589r.mo12798G1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1589r.mo12800I1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1589r.mo12801J1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1589r.mo12803L1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1589r.mo12749A2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1589r.mo12750B2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1589r.mo12751C2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1589r.mo12752D2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1589r.mo12753E2(i);
        requestLayout();
    }

    /* renamed from: x */
    public void mo2410x(C3539m mVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mVar != null) {
            mVar.mo12767z1(mode, size, mode2, size2);
            setMeasuredDimension(mVar.mo12808u1(), mVar.mo12807t1());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
