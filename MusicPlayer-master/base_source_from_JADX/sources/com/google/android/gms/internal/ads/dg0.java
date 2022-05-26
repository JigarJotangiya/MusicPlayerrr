package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C2927c;
import com.google.android.gms.common.internal.C3261d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dg0 extends C2927c<ig0> {
    public dg0(Context context, Looper looper, C3261d.C3262a aVar, C3261d.C3263b bVar) {
        super(dh0.m22514a(context), looper, 8, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: i0 */
    public final ig0 mo16925i0() throws DeadObjectException {
        return (ig0) super.mo11772C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo11805s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof ig0 ? (ig0) queryLocalInterface : new gg0(iBinder);
    }
}
