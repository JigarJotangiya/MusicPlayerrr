package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.C2908c;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class up2 {

    /* renamed from: a */
    public final zzbkq f24392a;

    /* renamed from: b */
    public final zzbtz f24393b;

    /* renamed from: c */
    public final v92 f24394c;

    /* renamed from: d */
    public final zzbfd f24395d;

    /* renamed from: e */
    public final zzbfi f24396e;

    /* renamed from: f */
    public final String f24397f;

    /* renamed from: g */
    public final ArrayList<String> f24398g;

    /* renamed from: h */
    public final ArrayList<String> f24399h;

    /* renamed from: i */
    public final zzbnw f24400i;

    /* renamed from: j */
    public final zzbfo f24401j;

    /* renamed from: k */
    public final int f24402k;

    /* renamed from: l */
    public final AdManagerAdViewOptions f24403l;

    /* renamed from: m */
    public final PublisherAdViewOptions f24404m;

    /* renamed from: n */
    public final C5130gw f24405n;

    /* renamed from: o */
    public final jp2 f24406o;

    /* renamed from: p */
    public final boolean f24407p;

    /* renamed from: q */
    public final C5278kw f24408q;

    /* synthetic */ up2(sp2 sp2, tp2 tp2) {
        zzbkq zzbkq;
        zzbnw zzbnw;
        this.f24396e = sp2.f23574b;
        this.f24397f = sp2.f23575c;
        this.f24408q = sp2.f23590r;
        int i = sp2.f23573a.f27195g;
        long j = sp2.f23573a.f27196h;
        Bundle bundle = sp2.f23573a.f27197i;
        int i2 = sp2.f23573a.f27198j;
        List<String> list = sp2.f23573a.f27199k;
        boolean z = sp2.f23573a.f27200l;
        int i3 = sp2.f23573a.f27201m;
        boolean z2 = true;
        if (!sp2.f23573a.f27202n && !sp2.f23577e) {
            z2 = false;
        }
        this.f24395d = new zzbfd(i, j, bundle, i2, list, z, i3, z2, sp2.f23573a.f27203o, sp2.f23573a.f27204p, sp2.f23573a.f27205q, sp2.f23573a.f27206r, sp2.f23573a.f27207s, sp2.f23573a.f27208t, sp2.f23573a.f27209u, sp2.f23573a.f27210v, sp2.f23573a.f27211w, sp2.f23573a.f27212x, sp2.f23573a.f27213y, sp2.f23573a.f27214z, sp2.f23573a.f27191A, sp2.f23573a.f27192B, C2979b2.m13232A(sp2.f23573a.f27193C), sp2.f23573a.f27194D);
        if (sp2.f23576d != null) {
            zzbkq = sp2.f23576d;
        } else {
            zzbkq = sp2.f23580h != null ? sp2.f23580h.f27253l : null;
        }
        this.f24392a = zzbkq;
        this.f24398g = sp2.f23578f;
        this.f24399h = sp2.f23579g;
        if (sp2.f23578f == null) {
            zzbnw = null;
        } else {
            zzbnw = sp2.f23580h == null ? new zzbnw(new C2908c.C2909a().mo10764a()) : sp2.f23580h;
        }
        this.f24400i = zzbnw;
        this.f24401j = sp2.f23581i;
        this.f24402k = sp2.f23585m;
        this.f24403l = sp2.f23582j;
        this.f24404m = sp2.f23583k;
        this.f24405n = sp2.f23584l;
        this.f24393b = sp2.f23586n;
        this.f24406o = new jp2(sp2.f23587o, (ip2) null);
        this.f24407p = sp2.f23588p;
        this.f24394c = sp2.f23589q;
    }

    /* renamed from: a */
    public final g40 mo21347a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f24404m;
        if (publisherAdViewOptions == null && this.f24403l == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.mo10749m0();
        }
        return this.f24403l.mo10744m0();
    }
}
