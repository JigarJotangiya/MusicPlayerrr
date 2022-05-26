package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eu1 implements cb1, C5497qt, e81, z81, a91, u91, h81, C5666vd, xt2 {

    /* renamed from: g */
    private final List<Object> f16115g;

    /* renamed from: h */
    private final st1 f16116h;

    /* renamed from: i */
    private long f16117i;

    public eu1(st1 st1, mt0 mt0) {
        this.f16116h = st1;
        this.f16115g = Collections.singletonList(mt0);
    }

    /* renamed from: v */
    private final void m23181v(Class<?> cls, String str, Object... objArr) {
        st1 st1 = this.f16116h;
        List<Object> list = this.f16115g;
        String valueOf = String.valueOf(cls.getSimpleName());
        st1.mo20962a(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    /* renamed from: L */
    public final void mo15740L(np2 np2) {
    }

    /* renamed from: a */
    public final void mo17079a(pt2 pt2, String str) {
        m23181v(ot2.class, "onTaskStarted", str);
    }

    /* renamed from: b */
    public final void mo15713b(Context context) {
        m23181v(a91.class, "onPause", context);
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        m23181v(h81.class, "onAdFailedToLoad", Integer.valueOf(zzbew.f27186g), zzbew.f27187h, zzbew.f27188i);
    }

    /* renamed from: d */
    public final void mo15612d(fh0 fh0, String str, String str2) {
        m23181v(e81.class, "onRewarded", fh0, str, str2);
    }

    /* renamed from: e */
    public final void mo17080e(pt2 pt2, String str, Throwable th) {
        m23181v(ot2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    /* renamed from: g */
    public final void mo17081g(pt2 pt2, String str) {
        m23181v(ot2.class, "onTaskSucceeded", str);
    }

    /* renamed from: h */
    public final void mo15613h() {
        m23181v(e81.class, "onAdClosed", new Object[0]);
    }

    /* renamed from: j */
    public final void mo15614j() {
        m23181v(z81.class, "onAdImpression", new Object[0]);
    }

    /* renamed from: k */
    public final void mo15615k() {
        long b = C2971s.m13198a().mo11989b();
        long j = this.f16117i;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b - j);
        C3018m1.m13388k(sb.toString());
        m23181v(u91.class, "onAdLoaded", new Object[0]);
    }

    /* renamed from: l */
    public final void mo15616l() {
        m23181v(e81.class, "onAdOpened", new Object[0]);
    }

    /* renamed from: m */
    public final void mo15617m() {
        m23181v(e81.class, "onAdLeftApplication", new Object[0]);
    }

    /* renamed from: n */
    public final void mo15618n() {
        m23181v(e81.class, "onRewardedVideoCompleted", new Object[0]);
    }

    /* renamed from: o */
    public final void mo15714o(Context context) {
        m23181v(a91.class, "onResume", context);
    }

    /* renamed from: p */
    public final void mo17341p(String str, String str2) {
        m23181v(C5666vd.class, "onAppEvent", str, str2);
    }

    /* renamed from: r */
    public final void mo17082r(pt2 pt2, String str) {
        m23181v(ot2.class, "onTaskCreated", str);
    }

    /* renamed from: u */
    public final void mo15715u(Context context) {
        m23181v(a91.class, "onDestroy", context);
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        m23181v(C5497qt.class, "onAdClicked", new Object[0]);
    }

    /* renamed from: y0 */
    public final void mo15741y0(zzcdq zzcdq) {
        this.f16117i = C2971s.m13198a().mo11989b();
        m23181v(cb1.class, "onAdRequest", new Object[0]);
    }

    public final void zzr() {
        m23181v(e81.class, "onRewardedVideoStarted", new Object[0]);
    }
}
