package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p082e.p099f.p100a.p104m.C3521a;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3536j;

public class Barrier extends ConstraintHelper {

    /* renamed from: p */
    private int f2152p;

    /* renamed from: q */
    private int f2153q;

    /* renamed from: r */
    private C3521a f2154r;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: x */
    private void m2668x(C3527e eVar, int i, boolean z) {
        this.f2153q = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f2152p;
            if (i2 == 5) {
                this.f2153q = 0;
            } else if (i2 == 6) {
                this.f2153q = 1;
            }
        } else if (z) {
            int i3 = this.f2152p;
            if (i3 == 5) {
                this.f2153q = 1;
            } else if (i3 == 6) {
                this.f2153q = 0;
            }
        } else {
            int i4 = this.f2152p;
            if (i4 == 5) {
                this.f2153q = 0;
            } else if (i4 == 6) {
                this.f2153q = 1;
            }
        }
        if (eVar instanceof C3521a) {
            ((C3521a) eVar).mo12590x1(this.f2153q);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2154r.mo12583r1();
    }

    public int getMargin() {
        return this.f2154r.mo12585t1();
    }

    public int getType() {
        return this.f2152p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        super.mo2380o(attributeSet);
        this.f2154r = new C3521a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0439f.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2154r.mo12589w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0439f.ConstraintLayout_Layout_barrierMargin) {
                    this.f2154r.mo12591y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2158j = this.f2154r;
        mo2858w();
    }

    /* renamed from: p */
    public void mo2384p(C0430c.C0431a aVar, C3536j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C3527e> sparseArray) {
        super.mo2384p(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof C3521a) {
            C3521a aVar2 = (C3521a) jVar;
            m2668x(aVar2, aVar.f2329e.f2383f0, ((C3530f) jVar.mo12639M()).mo12734M1());
            aVar2.mo12589w1(aVar.f2329e.f2399n0);
            aVar2.mo12591y1(aVar.f2329e.f2385g0);
        }
    }

    /* renamed from: q */
    public void mo2385q(C3527e eVar, boolean z) {
        m2668x(eVar, this.f2152p, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2154r.mo12589w1(z);
    }

    public void setDpMargin(int i) {
        C3521a aVar = this.f2154r;
        aVar.mo12591y1((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2154r.mo12591y1(i);
    }

    public void setType(int i) {
        this.f2152p = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
