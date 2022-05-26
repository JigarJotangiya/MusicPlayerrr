package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ml1 {

    /* renamed from: a */
    private final oq1 f20076a;

    /* renamed from: b */
    private final bp1 f20077b;

    /* renamed from: c */
    private final w01 f20078c;

    /* renamed from: d */
    private final jk1 f20079d;

    public ml1(oq1 oq1, bp1 bp1, w01 w01, jk1 jk1) {
        this.f20076a = oq1;
        this.f20077b = bp1;
        this.f20078c = w01;
        this.f20079d = jk1;
    }

    /* renamed from: a */
    public final View mo19411a() throws bs0 {
        pr0 a = this.f20076a.mo20090a(zzbfi.m34950n0(), (bp2) null, (ep2) null);
        View view = (View) a;
        view.setVisibility(8);
        a.mo17686d0("/sendMessageToSdk", new gl1(this));
        a.mo17686d0("/adMuted", new hl1(this));
        this.f20077b.mo16356j(new WeakReference(a), "/loadHtml", new il1(this));
        this.f20077b.mo16356j(new WeakReference(a), "/showOverlay", new jl1(this));
        this.f20077b.mo16356j(new WeakReference(a), "/hideOverlay", new kl1(this));
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo19412b(pr0 pr0, Map map) {
        this.f20077b.mo16353g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo19413c(pr0 pr0, Map map) {
        this.f20079d.mo15802c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo19414d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f20077b.mo16353g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo19415e(pr0 pr0, Map map) {
        ul0.m31861f("Showing native ads overlay.");
        pr0.mo15939Z().setVisibility(0);
        this.f20078c.mo21675d(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo19416f(pr0 pr0, Map map) {
        ul0.m31861f("Hiding native ads overlay.");
        pr0.mo15939Z().setVisibility(8);
        this.f20078c.mo21675d(false);
    }
}
