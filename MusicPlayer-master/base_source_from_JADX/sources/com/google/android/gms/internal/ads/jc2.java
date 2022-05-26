package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jc2 implements sg2 {

    /* renamed from: g */
    private static final Object f18451g = new Object();

    /* renamed from: a */
    private final String f18452a;

    /* renamed from: b */
    private final String f18453b;

    /* renamed from: c */
    private final u51 f18454c;

    /* renamed from: d */
    private final tq2 f18455d;

    /* renamed from: e */
    private final up2 f18456e;

    /* renamed from: f */
    private final C3024o1 f18457f = C2971s.m13213p().mo17562h();

    public jc2(String str, String str2, u51 u51, tq2 tq2, up2 up2) {
        this.f18452a = str;
        this.f18453b = str2;
        this.f18454c = u51;
        this.f18455d = tq2;
        this.f18456e = up2;
    }

    /* renamed from: a */
    public final d93 mo15767a() {
        Bundle bundle = new Bundle();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22660x3)).booleanValue()) {
            this.f18454c.mo21226c(this.f18456e.f24395d);
            bundle.putAll(this.f18455d.mo21141a());
        }
        return s83.m30607i(new ic2(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo18606b(Bundle bundle, Bundle bundle2) {
        String str;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22660x3)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22652w3)).booleanValue()) {
                synchronized (f18451g) {
                    this.f18454c.mo21226c(this.f18456e.f24395d);
                    bundle2.putBundle("quality_signals", this.f18455d.mo21141a());
                }
            } else {
                this.f18454c.mo21226c(this.f18456e.f24395d);
                bundle2.putBundle("quality_signals", this.f18455d.mo21141a());
            }
        }
        bundle2.putString("seq_num", this.f18452a);
        if (this.f18457f.mo11065E()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = this.f18453b;
        }
        bundle2.putString("session_id", str);
    }
}
