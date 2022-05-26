package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C2927c;
import com.google.android.gms.common.internal.C3261d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kz2 extends C2927c<nz2> {

    /* renamed from: E */
    private final int f19116E;

    public kz2(Context context, Looper looper, C3261d.C3262a aVar, C3261d.C3263b bVar, int i) {
        super(context, looper, 116, aVar, bVar, (String) null);
        this.f19116E = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: i0 */
    public final nz2 mo19042i0() throws DeadObjectException {
        return (nz2) super.mo11772C();
    }

    /* renamed from: l */
    public final int mo11799l() {
        return this.f19116E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo11805s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof nz2 ? (nz2) queryLocalInterface : new nz2(iBinder);
    }
}
