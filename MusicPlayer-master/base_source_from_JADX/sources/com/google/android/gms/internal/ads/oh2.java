package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oh2 implements sg2<ph2> {

    /* renamed from: a */
    private final Executor f21008a;

    /* renamed from: b */
    private final String f21009b;

    public oh2(xk0 xk0, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.f21008a = executor;
        this.f21009b = str;
    }

    /* renamed from: a */
    public final d93<ph2> mo15767a() {
        return s83.m30605g(s83.m30611m(s83.m30607i(this.f21009b), mh2.f20046a, this.f21008a), Throwable.class, new nh2(this), this.f21008a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ d93 mo19997b(Throwable th) throws Exception {
        return s83.m30607i(new ph2(this.f21009b));
    }
}
