package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;

public final class CircularProgressIndicator extends C6124b<CircularProgressIndicatorSpec> {

    /* renamed from: u */
    public static final int f28628u = C7499k.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: s */
    private void m36679s() {
        setIndeterminateDrawable(C6144j.m36793s(getContext(), (CircularProgressIndicatorSpec) this.f28638g));
        setProgressDrawable(C6136f.m36746u(getContext(), (CircularProgressIndicatorSpec) this.f28638g));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f28638g).f28631i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f28638g).f28630h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f28638g).f28629g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public CircularProgressIndicatorSpec mo24400i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f28638g).f28631i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f28638g;
        if (((CircularProgressIndicatorSpec) s).f28630h != i) {
            ((CircularProgressIndicatorSpec) s).f28630h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f28638g;
        if (((CircularProgressIndicatorSpec) s).f28629g != max) {
            ((CircularProgressIndicatorSpec) s).f28629g = max;
            ((CircularProgressIndicatorSpec) s).mo24406e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f28638g).mo24406e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f28628u);
        m36679s();
    }
}
