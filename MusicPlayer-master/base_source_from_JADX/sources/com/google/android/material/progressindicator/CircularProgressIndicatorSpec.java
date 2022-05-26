package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C6093m;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;

public final class CircularProgressIndicatorSpec extends C6129c {

    /* renamed from: g */
    public int f28629g;

    /* renamed from: h */
    public int f28630h;

    /* renamed from: i */
    public int f28631i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.circularProgressIndicatorStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24406e() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f28628u);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7492d.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C7492d.mtrl_progress_circular_inset_medium);
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.CircularProgressIndicator, i, i2, new int[0]);
        this.f28629g = Math.max(C7522c.m42016c(context, h, C7500l.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f28655a * 2);
        this.f28630h = C7522c.m42016c(context, h, C7500l.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f28631i = h.getInt(C7500l.CircularProgressIndicator_indicatorDirectionCircular, 0);
        h.recycle();
        mo24406e();
    }
}
