package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C2907b;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class r20 extends C2907b {

    /* renamed from: a */
    private final q20 f22710a;

    /* renamed from: b */
    private final Drawable f22711b;

    /* renamed from: c */
    private final Uri f22712c;

    /* renamed from: d */
    private final double f22713d;

    /* renamed from: e */
    private final int f22714e;

    /* renamed from: f */
    private final int f22715f;

    public r20(q20 q20) {
        Drawable drawable;
        double d;
        int i;
        this.f22710a = q20;
        Uri uri = null;
        try {
            C4863a c = q20.mo16823c();
            if (c != null) {
                drawable = (Drawable) C4865b.m20502K0(c);
                this.f22711b = drawable;
                uri = this.f22710a.zze();
                this.f22712c = uri;
                d = this.f22710a.mo16821a();
                this.f22713d = d;
                int i2 = -1;
                i = this.f22710a.mo16824f();
                this.f22714e = i;
                i2 = this.f22710a.mo16822b();
                this.f22715f = i2;
            }
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
        drawable = null;
        this.f22711b = drawable;
        try {
            uri = this.f22710a.zze();
        } catch (RemoteException e2) {
            ul0.m31860e(BuildConfig.FLAVOR, e2);
        }
        this.f22712c = uri;
        try {
            d = this.f22710a.mo16821a();
        } catch (RemoteException e3) {
            ul0.m31860e(BuildConfig.FLAVOR, e3);
            d = 1.0d;
        }
        this.f22713d = d;
        int i22 = -1;
        try {
            i = this.f22710a.mo16824f();
        } catch (RemoteException e4) {
            ul0.m31860e(BuildConfig.FLAVOR, e4);
            i = -1;
        }
        this.f22714e = i;
        try {
            i22 = this.f22710a.mo16822b();
        } catch (RemoteException e5) {
            ul0.m31860e(BuildConfig.FLAVOR, e5);
        }
        this.f22715f = i22;
    }

    /* renamed from: a */
    public final Drawable mo10752a() {
        return this.f22711b;
    }

    /* renamed from: b */
    public final double mo10753b() {
        return this.f22713d;
    }

    /* renamed from: c */
    public final Uri mo10754c() {
        return this.f22712c;
    }

    /* renamed from: d */
    public final int mo10755d() {
        return this.f22715f;
    }

    /* renamed from: e */
    public final int mo10756e() {
        return this.f22714e;
    }
}
