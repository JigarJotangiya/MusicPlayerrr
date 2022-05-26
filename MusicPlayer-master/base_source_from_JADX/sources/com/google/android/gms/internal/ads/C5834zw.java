package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.zw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5834zw {

    /* renamed from: a */
    private final String f26930a;

    /* renamed from: b */
    private final C5797yw f26931b;

    public C5834zw(C5797yw ywVar) {
        String str;
        this.f26931b = ywVar;
        try {
            str = ywVar.zze();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            str = null;
        }
        this.f26930a = str;
    }

    public final String toString() {
        return this.f26930a;
    }
}
