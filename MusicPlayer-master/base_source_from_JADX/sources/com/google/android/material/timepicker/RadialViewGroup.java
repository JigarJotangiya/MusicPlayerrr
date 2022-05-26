package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.ConstraintLayout;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7496h;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7547k;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: A */
    private final Runnable f29223A;

    /* renamed from: B */
    private int f29224B;

    /* renamed from: C */
    private C7541h f29225C;

    /* renamed from: com.google.android.material.timepicker.RadialViewGroup$a */
    class C6269a implements Runnable {
        C6269a() {
        }

        public void run() {
            RadialViewGroup.this.mo25108F();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private Drawable m37417B() {
        C7541h hVar = new C7541h();
        this.f29225C = hVar;
        hVar.mo28461Y(new C7547k(0.5f));
        this.f29225C.mo28463a0(ColorStateList.valueOf(-1));
        return this.f29225C;
    }

    /* renamed from: E */
    private static boolean m37418E(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: G */
    private void m37419G() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f29223A);
            handler.post(this.f29223A);
        }
    }

    /* renamed from: C */
    public int mo25107C() {
        return this.f29224B;
    }

    /* renamed from: D */
    public void mo25089D(int i) {
        this.f29224B = i;
        mo25108F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo25108F() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m37418E(getChildAt(i2))) {
                i++;
            }
        }
        C0430c cVar = new C0430c();
        cVar.mo2961p(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = C7494f.circle_center;
            if (id != i4 && !m37418E(childAt)) {
                cVar.mo2964s(childAt.getId(), i4, this.f29224B, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        cVar.mo2955i(this);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C3774v.m16208k());
        }
        m37419G();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo25108F();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m37419G();
    }

    public void setBackgroundColor(int i) {
        this.f29225C.mo28463a0(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C7496h.material_radial_view_group, this);
        C3774v.m16223r0(this, m37417B());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.RadialViewGroup, i, 0);
        this.f29224B = obtainStyledAttributes.getDimensionPixelSize(C7500l.RadialViewGroup_materialCircleRadius, 0);
        this.f29223A = new C6269a();
        obtainStyledAttributes.recycle();
    }
}
