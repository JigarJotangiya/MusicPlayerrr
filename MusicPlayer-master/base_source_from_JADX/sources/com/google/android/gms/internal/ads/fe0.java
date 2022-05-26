package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C3098a;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class fe0 extends C3098a.C3100b {

    /* renamed from: a */
    private final q20 f16556a;

    /* renamed from: b */
    private final Drawable f16557b;

    public fe0(q20 q20) {
        this.f16556a = q20;
        Drawable drawable = null;
        try {
            C4863a c = q20.mo16823c();
            if (c != null) {
                drawable = (Drawable) C4865b.m20502K0(c);
            }
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
        this.f16557b = drawable;
        try {
            this.f16556a.zze();
        } catch (RemoteException e2) {
            ul0.m31860e(BuildConfig.FLAVOR, e2);
        }
        try {
            this.f16556a.mo16821a();
        } catch (RemoteException e3) {
            ul0.m31860e(BuildConfig.FLAVOR, e3);
        }
        try {
            this.f16556a.mo16824f();
        } catch (RemoteException e4) {
            ul0.m31860e(BuildConfig.FLAVOR, e4);
        }
        try {
            this.f16556a.mo16822b();
        } catch (RemoteException e5) {
            ul0.m31860e(BuildConfig.FLAVOR, e5);
        }
    }

    /* renamed from: a */
    public final Drawable mo11323a() {
        return this.f16557b;
    }
}
