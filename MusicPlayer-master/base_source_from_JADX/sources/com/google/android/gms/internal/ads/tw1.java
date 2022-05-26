package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tw1 {

    /* renamed from: a */
    private final e93 f24044a;

    /* renamed from: b */
    private final e93 f24045b;

    /* renamed from: c */
    private final cy1 f24046c;

    /* renamed from: d */
    private final sr3<wz1> f24047d;

    public tw1(e93 e93, e93 e932, cy1 cy1, sr3<wz1> sr3) {
        this.f24044a = e93;
        this.f24045b = e932;
        this.f24046c = cy1;
        this.f24047d = sr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ d93 mo21178a(zzcdq zzcdq, int i, uy1 uy1) throws Exception {
        return this.f24047d.mo10679a().mo21938f7(zzcdq, i);
    }

    /* renamed from: b */
    public final d93<InputStream> mo21179b(zzcdq zzcdq) {
        d93<V> d93;
        String str = zzcdq.f27351j;
        C2971s.m13214q();
        if (C2979b2.m13257g(str)) {
            d93 = s83.m30606h(new uy1(1));
        } else {
            d93 = s83.m30605g(this.f24044a.mo17138A0(new sw1(this, zzcdq)), ExecutionException.class, rw1.f23218a, this.f24045b);
        }
        return s83.m30605g(d93, uy1.class, new qw1(this, zzcdq, Binder.getCallingUid()), this.f24045b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ InputStream mo21180c(zzcdq zzcdq) throws Exception {
        mm0<InputStream> mm0;
        cy1 cy1 = this.f24046c;
        synchronized (cy1.f16371b) {
            if (cy1.f16372c) {
                mm0 = cy1.f16370a;
            } else {
                cy1.f16372c = true;
                cy1.f16374e = zzcdq;
                cy1.f16375f.mo11803q();
                cy1.f16370a.mo15945h(new by1(cy1), hm0.f17713f);
                mm0 = cy1.f16370a;
            }
        }
        return (InputStream) mm0.get((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22636u3)).intValue(), TimeUnit.SECONDS);
    }
}
