package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class tg2 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ sg2 f23870g;

    /* renamed from: h */
    public final /* synthetic */ long f23871h;

    public /* synthetic */ tg2(sg2 sg2, long j) {
        this.f23870g = sg2;
        this.f23871h = j;
    }

    public final void run() {
        sg2 sg2 = this.f23870g;
        long j = this.f23871h;
        String canonicalName = sg2.getClass().getCanonicalName();
        long b = C2971s.m13198a().mo11989b();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b - j);
        C3018m1.m13388k(sb.toString());
    }
}
