package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class vm1 implements i13 {

    /* renamed from: a */
    public final /* synthetic */ String f24844a;

    /* renamed from: b */
    public final /* synthetic */ double f24845b;

    /* renamed from: c */
    public final /* synthetic */ int f24846c;

    /* renamed from: d */
    public final /* synthetic */ int f24847d;

    public /* synthetic */ vm1(String str, double d, int i, int i2) {
        this.f24844a = str;
        this.f24845b = d;
        this.f24846c = i;
        this.f24847d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f24844a;
        return new d20(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f24845b, this.f24846c, this.f24847d);
    }
}
