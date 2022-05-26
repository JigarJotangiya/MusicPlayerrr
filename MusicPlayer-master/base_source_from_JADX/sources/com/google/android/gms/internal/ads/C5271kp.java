package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.C2902e0;
import com.google.android.gms.ads.internal.C2927c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.util.C3356a;

/* renamed from: com.google.android.gms.internal.ads.kp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5271kp extends C2927c<C5345mp> {
    C5271kp(Context context, Looper looper, C3261d.C3262a aVar, C3261d.C3263b bVar) {
        super(dh0.m22514a(context), looper, 123, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: i0 */
    public final boolean mo18954i0() {
        return ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && C3356a.m14426b(mo11800m(), C2902e0.f9769a);
    }

    /* renamed from: j0 */
    public final C5345mp mo18955j0() throws DeadObjectException {
        return (C5345mp) super.mo11772C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo11805s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof C5345mp ? (C5345mp) queryLocalInterface : new C5345mp(iBinder);
    }

    /* renamed from: v */
    public final Feature[] mo11808v() {
        return C2902e0.f9770b;
    }
}
