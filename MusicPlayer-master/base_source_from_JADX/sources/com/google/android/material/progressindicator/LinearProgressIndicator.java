package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;

public final class LinearProgressIndicator extends C6124b<LinearProgressIndicatorSpec> {

    /* renamed from: u */
    public static final int f28632u = C7499k.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: s */
    private void m36683s() {
        setIndeterminateDrawable(C6144j.m36794t(getContext(), (LinearProgressIndicatorSpec) this.f28638g));
        setProgressDrawable(C6136f.m36747v(getContext(), (LinearProgressIndicatorSpec) this.f28638g));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f28638g).f28633g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f28638g).f28634h;
    }

    /* renamed from: o */
    public void mo24409o(int i, boolean z) {
        S s = this.f28638g;
        if (s == null || ((LinearProgressIndicatorSpec) s).f28633g != 0 || !isIndeterminate()) {
            super.mo24409o(i, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f28638g;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (!(((LinearProgressIndicatorSpec) s).f28634h == 1 || ((C3774v.m16151B(this) == 1 && ((LinearProgressIndicatorSpec) this.f28638g).f28634h == 2) || (C3774v.m16151B(this) == 0 && ((LinearProgressIndicatorSpec) this.f28638g).f28634h == 3)))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f28635i = z2;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C6144j indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C6136f progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public LinearProgressIndicatorSpec mo24400i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f28638g).f28633g != i) {
            if (!mo24436q() || !isIndeterminate()) {
                S s = this.f28638g;
                ((LinearProgressIndicatorSpec) s).f28633g = i;
                ((LinearProgressIndicatorSpec) s).mo24406e();
                if (i == 0) {
                    getIndeterminateDrawable().mo24515w(new C6146l((LinearProgressIndicatorSpec) this.f28638g));
                } else {
                    getIndeterminateDrawable().mo24515w(new C6149m(getContext(), (LinearProgressIndicatorSpec) this.f28638g));
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f28638g).mo24406e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f28638g;
        ((LinearProgressIndicatorSpec) s).f28634h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (!(i == 1 || ((C3774v.m16151B(this) == 1 && ((LinearProgressIndicatorSpec) this.f28638g).f28634h == 2) || (C3774v.m16151B(this) == 0 && i == 3)))) {
            z = false;
        }
        linearProgressIndicatorSpec.f28635i = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f28638g).mo24406e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f28632u);
        m36683s();
    }
}
