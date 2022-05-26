package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.C2926b;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nq1 {

    /* renamed from: a */
    private final c81 f20691a;

    /* renamed from: b */
    private final wf1 f20692b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final m91 f20693c;

    /* renamed from: d */
    private final aa1 f20694d;

    /* renamed from: e */
    private final ma1 f20695e;

    /* renamed from: f */
    private final gd1 f20696f;

    /* renamed from: g */
    private final Executor f20697g;

    /* renamed from: h */
    private final sf1 f20698h;

    /* renamed from: i */
    private final m01 f20699i;

    /* renamed from: j */
    private final C2926b f20700j;

    /* renamed from: k */
    private final zi0 f20701k;

    /* renamed from: l */
    private final C5737xa f20702l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final xc1 f20703m;

    /* renamed from: n */
    private final y12 f20704n;

    /* renamed from: o */
    private final lv2 f20705o;

    /* renamed from: p */
    private final gt1 f20706p;

    /* renamed from: q */
    private final gu2 f20707q;

    public nq1(c81 c81, m91 m91, aa1 aa1, ma1 ma1, gd1 gd1, Executor executor, sf1 sf1, m01 m01, C2926b bVar, zi0 zi0, C5737xa xaVar, xc1 xc1, y12 y12, lv2 lv2, gt1 gt1, gu2 gu2, wf1 wf1) {
        this.f20691a = c81;
        this.f20693c = m91;
        this.f20694d = aa1;
        this.f20695e = ma1;
        this.f20696f = gd1;
        this.f20697g = executor;
        this.f20698h = sf1;
        this.f20699i = m01;
        this.f20700j = bVar;
        this.f20701k = zi0;
        this.f20702l = xaVar;
        this.f20703m = xc1;
        this.f20704n = y12;
        this.f20705o = lv2;
        this.f20706p = gt1;
        this.f20707q = gu2;
        this.f20692b = wf1;
    }

    /* renamed from: j */
    public static final d93<?> m28037j(pr0 pr0, String str, String str2) {
        mm0 mm0 = new mm0();
        pr0.mo17673Q0().mo17300d1(new lq1(mm0));
        pr0.mo17715w0(str, str2, (String) null);
        return mm0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo19812c() {
        this.f20691a.mo10632u0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo19813d(String str, String str2) {
        this.f20696f.mo17588W(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo19814e() {
        this.f20693c.mo19361a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo19815f(View view) {
        this.f20700j.mo10827a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo19816g(pr0 pr0, pr0 pr02, Map map) {
        this.f20699i.mo19313d(pr0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ boolean mo19817h(View view, MotionEvent motionEvent) {
        this.f20700j.mo10827a();
        return false;
    }

    /* renamed from: i */
    public final void mo19818i(pr0 pr0, boolean z, b60 b60) {
        C5589ta c;
        pr0 pr02 = pr0;
        et0 Q0 = pr0.mo17673Q0();
        hq1 hq1 = r4;
        hq1 hq12 = new hq1(this);
        aa1 aa1 = this.f20694d;
        ma1 ma1 = this.f20695e;
        iq1 iq1 = r7;
        iq1 iq12 = new iq1(this);
        kq1 kq1 = r10;
        kq1 kq12 = new kq1(this);
        C2926b bVar = this.f20700j;
        mq1 mq1 = r12;
        mq1 mq12 = new mq1(this);
        Q0.mo17293O(hq1, aa1, ma1, iq1, kq1, z, b60, bVar, mq1, this.f20701k, this.f20704n, this.f20705o, this.f20706p, this.f20707q, (z50) null, this.f20692b);
        pr0 pr03 = pr0;
        pr03.setOnTouchListener(new fq1(this));
        pr03.setOnClickListener(new dq1(this));
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22332G1)).booleanValue() && (c = this.f20702l.mo21999c()) != null) {
            c.mo10839a((View) pr03);
        }
        this.f20698h.mo21251D0(pr03, this.f20697g);
        this.f20698h.mo21251D0(new gq1(pr03), this.f20697g);
        this.f20698h.mo20839N0((View) pr03);
        pr03.mo17686d0("/trackActiveViewUnit", new jq1(this, pr03));
        this.f20699i.mo19314e(pr03);
    }
}
