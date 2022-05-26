package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C6093m;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7500l;

public final class LinearProgressIndicatorSpec extends C6129c {

    /* renamed from: g */
    public int f28633g;

    /* renamed from: h */
    public int f28634h;

    /* renamed from: i */
    boolean f28635i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.linearProgressIndicatorStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24406e() {
        if (this.f28633g != 0) {
            return;
        }
        if (this.f28656b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f28657c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f28632u);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        boolean z = false;
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.LinearProgressIndicator, C7490b.linearProgressIndicatorStyle, LinearProgressIndicator.f28632u, new int[0]);
        this.f28633g = h.getInt(C7500l.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f28634h = h.getInt(C7500l.LinearProgressIndicator_indicatorDirectionLinear, 0);
        h.recycle();
        mo24406e();
        this.f28635i = this.f28634h == 1 ? true : z;
    }
}
