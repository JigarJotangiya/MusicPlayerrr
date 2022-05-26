package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tx1 implements ty1 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Pattern f24050f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    private final tw1 f24051a;

    /* renamed from: b */
    private final e93 f24052b;

    /* renamed from: c */
    private final up2 f24053c;

    /* renamed from: d */
    private final ScheduledExecutorService f24054d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final b12 f24055e;

    tx1(up2 up2, tw1 tw1, e93 e93, ScheduledExecutorService scheduledExecutorService, b12 b12) {
        this.f24053c = up2;
        this.f24051a = tw1;
        this.f24052b = e93;
        this.f24054d = scheduledExecutorService;
        this.f24055e = b12;
    }

    /* renamed from: a */
    public final d93<np2> mo20753a(zzcdq zzcdq) {
        d93<np2> n = s83.m30612n(this.f24051a.mo21179b(zzcdq), new qx1(this), this.f24052b);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22628t3)).booleanValue()) {
            n = s83.m30605g(s83.m30613o(n, (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22636u3)).intValue(), TimeUnit.SECONDS, this.f24054d), TimeoutException.class, rx1.f23219a, hm0.f17713f);
        }
        s83.m30616r(n, new sx1(this), hm0.f17713f);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo21185c(InputStream inputStream) throws Exception {
        return s83.m30607i(new np2(new kp2(this.f24053c), mp2.m27384a(new InputStreamReader(inputStream))));
    }
}
