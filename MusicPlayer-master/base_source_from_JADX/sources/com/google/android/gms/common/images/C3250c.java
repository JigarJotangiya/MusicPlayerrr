package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C3258c;
import p159f.p243f.p245b.p246a.p293c.p296c.C7443e;

/* renamed from: com.google.android.gms.common.images.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C3250c {

    /* renamed from: a */
    protected int f10528a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11718a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11719b(Context context, Bitmap bitmap, boolean z) {
        C3258c.m14106c(bitmap);
        mo11718a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11720c(Context context, C7443e eVar, boolean z) {
        int i = this.f10528a;
        mo11718a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }
}
