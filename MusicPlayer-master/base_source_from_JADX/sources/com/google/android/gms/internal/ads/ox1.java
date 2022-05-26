package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ox1 {

    /* renamed from: a */
    private final ScheduledExecutorService f21222a;

    /* renamed from: b */
    private final e93 f21223b;

    /* renamed from: c */
    private final gy1 f21224c;

    /* renamed from: d */
    private final sr3<wz1> f21225d;

    public ox1(ScheduledExecutorService scheduledExecutorService, e93 e93, gy1 gy1, sr3<wz1> sr3) {
        this.f21222a = scheduledExecutorService;
        this.f21223b = e93;
        this.f21224c = gy1;
        this.f21225d = sr3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ d93 mo20146a(zzcdq zzcdq, int i, Throwable th) throws Exception {
        return this.f21225d.mo10679a().mo21939g7(zzcdq, i);
    }

    /* renamed from: b */
    public final d93<InputStream> mo20147b(zzcdq zzcdq) {
        d93 d93;
        String str = zzcdq.f27351j;
        C2971s.m13214q();
        if (C2979b2.m13257g(str)) {
            d93 = s83.m30606h(new uy1(1));
        } else {
            gy1 gy1 = this.f21224c;
            synchronized (gy1.f16371b) {
                if (gy1.f16372c) {
                    d93 = gy1.f16370a;
                } else {
                    gy1.f16372c = true;
                    gy1.f16374e = zzcdq;
                    gy1.f16375f.mo11803q();
                    gy1.f16370a.mo15945h(new fy1(gy1), hm0.f17713f);
                    d93 = gy1.f16370a;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        j83 E = j83.m25564E(d93);
        long intValue = (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22636u3)).intValue();
        return s83.m30605g((j83) s83.m30613o(E, intValue, TimeUnit.SECONDS, this.f21222a), Throwable.class, new nx1(this, zzcdq, callingUid), this.f21223b);
    }
}
