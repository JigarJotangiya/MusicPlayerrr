package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.api.C3226j;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class eq0 implements C3226j {

    /* renamed from: g */
    protected final Context f16059g;

    /* renamed from: h */
    protected final String f16060h;

    /* renamed from: i */
    protected final WeakReference<eo0> f16061i;

    public eq0(eo0 eo0) {
        Context context = eo0.getContext();
        this.f16059g = context;
        this.f16060h = C2971s.m13214q().mo10977L(context, eo0.zzp().f27376g);
        this.f16061i = new WeakReference<>(eo0);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m23083g(eq0 eq0, String str, Map map) {
        eo0 eo0 = (eo0) eq0.f16061i.get();
        if (eo0 != null) {
            eo0.mo16880n0("onPrecacheEvent", map);
        }
    }

    /* renamed from: a */
    public void mo11667a() {
    }

    /* renamed from: i */
    public abstract void mo17262i();

    /* renamed from: j */
    public final void mo17263j(String str, String str2, String str3, String str4) {
        nl0.f20646b.post(new dq0(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo17264k(String str, String str2, int i) {
        nl0.f20646b.post(new bq0(this, str, str2, i));
    }

    /* renamed from: l */
    public final void mo17265l(String str, String str2, long j) {
        nl0.f20646b.post(new cq0(this, str, str2, j));
    }

    /* renamed from: m */
    public final void mo17266m(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        nl0.f20646b.post(new aq0(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* renamed from: n */
    public final void mo17267n(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = nl0.f20646b;
        zp0 zp0 = r0;
        zp0 zp02 = new zp0(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(zp0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo17268o(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo17269p(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo17270q(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo17271s(int i) {
    }

    /* renamed from: u */
    public abstract boolean mo17272u(String str);

    /* renamed from: v */
    public boolean mo17273v(String str, String[] strArr) {
        return mo17272u(str);
    }

    /* renamed from: w */
    public boolean mo17274w(String str, String[] strArr, vp0 vp0) {
        return mo17272u(str);
    }
}
