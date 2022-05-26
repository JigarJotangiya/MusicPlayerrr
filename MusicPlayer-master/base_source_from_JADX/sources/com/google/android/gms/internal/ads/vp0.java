package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2977b0;
import com.google.android.gms.ads.internal.util.C2979b2;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vp0 extends C2977b0 {

    /* renamed from: c */
    final eo0 f24891c;

    /* renamed from: d */
    final eq0 f24892d;

    /* renamed from: e */
    private final String f24893e;

    /* renamed from: f */
    private final String[] f24894f;

    vp0(eo0 eo0, eq0 eq0, String str, String[] strArr) {
        this.f24891c = eo0;
        this.f24892d = eq0;
        this.f24893e = str;
        this.f24894f = strArr;
        C2971s.m13223z().mo21870p(this);
    }

    /* renamed from: a */
    public final void mo10867a() {
        try {
            this.f24892d.mo17273v(this.f24893e, this.f24894f);
        } finally {
            C2979b2.f9980i.post(new up0(this));
        }
    }

    /* renamed from: b */
    public final d93<?> mo10973b() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22570m1)).booleanValue() || !(this.f24892d instanceof nq0)) {
            return super.mo10973b();
        }
        return hm0.f17712e.mo17138A0(new tp0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo21595d() throws Exception {
        return Boolean.valueOf(this.f24892d.mo17274w(this.f24893e, this.f24894f, this));
    }

    /* renamed from: e */
    public final String mo21596e() {
        return this.f24893e;
    }
}
