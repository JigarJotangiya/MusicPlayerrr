package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class d20 extends p20 {

    /* renamed from: g */
    private final Drawable f15464g;

    /* renamed from: h */
    private final Uri f15465h;

    /* renamed from: i */
    private final double f15466i;

    /* renamed from: j */
    private final int f15467j;

    /* renamed from: k */
    private final int f15468k;

    public d20(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f15464g = drawable;
        this.f15465h = uri;
        this.f15466i = d;
        this.f15467j = i;
        this.f15468k = i2;
    }

    /* renamed from: a */
    public final double mo16821a() {
        return this.f15466i;
    }

    /* renamed from: b */
    public final int mo16822b() {
        return this.f15468k;
    }

    /* renamed from: c */
    public final C4863a mo16823c() throws RemoteException {
        return C4865b.m20503f2(this.f15464g);
    }

    /* renamed from: f */
    public final int mo16824f() {
        return this.f15467j;
    }

    public final Uri zze() throws RemoteException {
        return this.f15465h;
    }
}
