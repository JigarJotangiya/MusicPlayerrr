package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C2927c;
import com.google.android.gms.common.internal.C3261d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v60 extends C2927c<b70> {
    v60(Context context, Looper looper, C3261d.C3262a aVar, C3261d.C3263b bVar) {
        super(dh0.m22514a(context), looper, 166, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: i0 */
    public final b70 mo21434i0() throws DeadObjectException {
        return (b70) super.mo11772C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo11805s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof b70 ? (b70) queryLocalInterface : new b70(iBinder);
    }
}
