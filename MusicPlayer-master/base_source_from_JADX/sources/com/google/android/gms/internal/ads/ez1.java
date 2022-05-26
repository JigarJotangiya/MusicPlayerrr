package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ez1 {

    /* renamed from: a */
    private final e93 f16382a;

    /* renamed from: b */
    private final ky1 f16383b;

    /* renamed from: c */
    private final sr3<wz1> f16384c;

    public ez1(e93 e93, ky1 ky1, sr3<wz1> sr3) {
        this.f16382a = e93;
        this.f16383b = ky1;
        this.f16384c = sr3;
    }

    /* renamed from: g */
    private final <RetT> d93<RetT> m23388g(zzcdq zzcdq, dz1<InputStream> dz1, dz1<InputStream> dz12, y73<InputStream, RetT> y73) {
        d93<V> d93;
        String str = zzcdq.f27351j;
        C2971s.m13214q();
        if (C2979b2.m13257g(str)) {
            d93 = s83.m30606h(new uy1(1));
        } else {
            d93 = s83.m30605g(dz1.mo17055a(zzcdq), ExecutionException.class, cz1.f15373a, this.f16382a);
        }
        return s83.m30605g(s83.m30612n(j83.m25564E(d93), y73, this.f16382a), uy1.class, new az1(this, dz12, zzcdq, y73), this.f16382a);
    }

    /* renamed from: a */
    public final d93<zzcdq> mo17439a(zzcdq zzcdq) {
        return m23388g(zzcdq, new vy1(this.f16383b), new wy1(this), new zy1(zzcdq));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ d93 mo17440b(dz1 dz1, zzcdq zzcdq, y73 y73, uy1 uy1) throws Exception {
        return s83.m30612n(dz1.mo17055a(zzcdq), y73, this.f16382a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo17441c(zzcdq zzcdq) {
        return this.f16384c.mo10679a().mo21937e7(zzcdq, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ d93 mo17442d(zzcdq zzcdq) {
        String str;
        ky1 ky1 = this.f16383b;
        if (l10.f19145c.mo20989e().booleanValue()) {
            str = zzcdq.f27355n;
        } else {
            str = zzcdq.f27357p;
        }
        return ky1.mo19037c(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ d93 mo17443e(zzcdq zzcdq) {
        String str;
        wz1 a = this.f16384c.mo10679a();
        if (l10.f19145c.mo20989e().booleanValue()) {
            str = zzcdq.f27355n;
        } else {
            str = zzcdq.f27357p;
        }
        return a.mo21940h7(str);
    }

    /* renamed from: f */
    public final d93<Void> mo17444f(zzcdq zzcdq) {
        if (C5813zb.m34504g(zzcdq.f27357p)) {
            return s83.m30606h(new pw1(2, "Pool key missing from removeUrl call."));
        }
        return m23388g(zzcdq, new xy1(this), new yy1(this), bz1.f14737a);
    }
}
