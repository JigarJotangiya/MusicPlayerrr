package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ot1 {

    /* renamed from: a */
    protected final Map<String, String> f21140a = new HashMap();

    /* renamed from: b */
    protected final Executor f21141b;

    /* renamed from: c */
    protected final am0 f21142c;

    /* renamed from: d */
    protected final boolean f21143d;

    /* renamed from: e */
    private final ru2 f21144e;

    protected ot1(Executor executor, am0 am0, ru2 ru2) {
        String e = a10.f13718b.mo20989e();
        this.f21141b = executor;
        this.f21142c = am0;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue()) {
            this.f21143d = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22578n1)).booleanValue();
        } else {
            this.f21143d = ((double) C4980cv.m22126e().nextFloat()) <= a10.f13717a.mo20989e().doubleValue();
        }
        this.f21144e = ru2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo20113a(Map<String, String> map) {
        return this.f21144e.mo20742a(map);
    }

    /* renamed from: b */
    public final void mo20114b(Map<String, String> map) {
        String a = this.f21144e.mo20742a(map);
        if (this.f21143d) {
            this.f21141b.execute(new nt1(this, a));
        }
        C3018m1.m13388k(a);
    }
}
