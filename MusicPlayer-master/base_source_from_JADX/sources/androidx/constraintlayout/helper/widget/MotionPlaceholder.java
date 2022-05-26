package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3535i;
import p082e.p099f.p100a.p104m.C3538l;
import p082e.p099f.p100a.p104m.C3539m;

public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: r */
    C3538l f1616r;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        super.mo2380o(attributeSet);
        this.f2158j = new C3538l();
        mo2858w();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo2410x(this.f1616r, i, i2);
    }

    /* renamed from: u */
    public void mo2426u(C3530f fVar, C3535i iVar, SparseArray<C3527e> sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
