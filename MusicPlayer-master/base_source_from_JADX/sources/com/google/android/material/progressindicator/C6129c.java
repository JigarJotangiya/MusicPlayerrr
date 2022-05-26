package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C6093m;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7522c;

/* renamed from: com.google.android.material.progressindicator.c */
/* compiled from: BaseProgressIndicatorSpec */
public abstract class C6129c {

    /* renamed from: a */
    public int f28655a;

    /* renamed from: b */
    public int f28656b;

    /* renamed from: c */
    public int[] f28657c = new int[0];

    /* renamed from: d */
    public int f28658d;

    /* renamed from: e */
    public int f28659e;

    /* renamed from: f */
    public int f28660f;

    protected C6129c(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7492d.mtrl_progress_track_thickness);
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.BaseProgressIndicator, i, i2, new int[0]);
        this.f28655a = C7522c.m42016c(context, h, C7500l.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f28656b = Math.min(C7522c.m42016c(context, h, C7500l.BaseProgressIndicator_trackCornerRadius, 0), this.f28655a / 2);
        this.f28659e = h.getInt(C7500l.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f28660f = h.getInt(C7500l.BaseProgressIndicator_hideAnimationBehavior, 0);
        m36708c(context, h);
        m36709d(context, h);
        h.recycle();
    }

    /* renamed from: c */
    private void m36708c(Context context, TypedArray typedArray) {
        int i = C7500l.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.f28657c = new int[]{C7513a.m41978b(context, C7490b.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f28657c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f28657c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    private void m36709d(Context context, TypedArray typedArray) {
        int i = C7500l.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            this.f28658d = typedArray.getColor(i, -1);
            return;
        }
        this.f28658d = this.f28657c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f28658d = C7513a.m41977a(this.f28658d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean mo24448a() {
        return this.f28660f != 0;
    }

    /* renamed from: b */
    public boolean mo24449b() {
        return this.f28659e != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo24406e();
}
