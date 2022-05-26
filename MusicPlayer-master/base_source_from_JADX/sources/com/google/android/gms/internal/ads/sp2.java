package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C3292l;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sp2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzbfd f23573a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzbfi f23574b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f23575c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zzbkq f23576d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f23577e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<String> f23578f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<String> f23579g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public zzbnw f23580h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzbfo f23581i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AdManagerAdViewOptions f23582j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public PublisherAdViewOptions f23583k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5130gw f23584l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f23585m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public zzbtz f23586n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final hp2 f23587o = new hp2();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f23588p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public v92 f23589q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C5278kw f23590r;

    /* renamed from: D */
    public final hp2 mo20911D() {
        return this.f23587o;
    }

    /* renamed from: E */
    public final sp2 mo20912E(up2 up2) {
        this.f23587o.mo18181a(up2.f24406o.f18564a);
        this.f23573a = up2.f24395d;
        this.f23574b = up2.f24396e;
        this.f23590r = up2.f24408q;
        this.f23575c = up2.f24397f;
        this.f23576d = up2.f24392a;
        this.f23578f = up2.f24398g;
        this.f23579g = up2.f24399h;
        this.f23580h = up2.f24400i;
        this.f23581i = up2.f24401j;
        mo20913F(up2.f24403l);
        mo20925c(up2.f24404m);
        this.f23588p = up2.f24407p;
        this.f23589q = up2.f24394c;
        return this;
    }

    /* renamed from: F */
    public final sp2 mo20913F(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f23582j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.f23577e = adManagerAdViewOptions.mo10743Y();
        }
        return this;
    }

    /* renamed from: G */
    public final sp2 mo20914G(zzbfi zzbfi) {
        this.f23574b = zzbfi;
        return this;
    }

    /* renamed from: H */
    public final sp2 mo20915H(String str) {
        this.f23575c = str;
        return this;
    }

    /* renamed from: I */
    public final sp2 mo20916I(zzbfo zzbfo) {
        this.f23581i = zzbfo;
        return this;
    }

    /* renamed from: J */
    public final sp2 mo20917J(v92 v92) {
        this.f23589q = v92;
        return this;
    }

    /* renamed from: K */
    public final sp2 mo20918K(zzbtz zzbtz) {
        this.f23586n = zzbtz;
        this.f23576d = new zzbkq(false, true, false);
        return this;
    }

    /* renamed from: L */
    public final sp2 mo20919L(boolean z) {
        this.f23588p = z;
        return this;
    }

    /* renamed from: M */
    public final sp2 mo20920M(boolean z) {
        this.f23577e = z;
        return this;
    }

    /* renamed from: N */
    public final sp2 mo20921N(int i) {
        this.f23585m = i;
        return this;
    }

    /* renamed from: O */
    public final sp2 mo20922O(zzbnw zzbnw) {
        this.f23580h = zzbnw;
        return this;
    }

    /* renamed from: a */
    public final sp2 mo20923a(ArrayList<String> arrayList) {
        this.f23578f = arrayList;
        return this;
    }

    /* renamed from: b */
    public final sp2 mo20924b(ArrayList<String> arrayList) {
        this.f23579g = arrayList;
        return this;
    }

    /* renamed from: c */
    public final sp2 mo20925c(PublisherAdViewOptions publisherAdViewOptions) {
        this.f23583k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f23577e = publisherAdViewOptions.mo10750n0();
            this.f23584l = publisherAdViewOptions.mo10748Y();
        }
        return this;
    }

    /* renamed from: d */
    public final sp2 mo20926d(zzbfd zzbfd) {
        this.f23573a = zzbfd;
        return this;
    }

    /* renamed from: e */
    public final sp2 mo20927e(zzbkq zzbkq) {
        this.f23576d = zzbkq;
        return this;
    }

    /* renamed from: f */
    public final up2 mo20928f() {
        C3292l.m14241i(this.f23575c, "ad unit must not be null");
        C3292l.m14241i(this.f23574b, "ad size must not be null");
        C3292l.m14241i(this.f23573a, "ad request must not be null");
        return new up2(this, (tp2) null);
    }

    /* renamed from: h */
    public final String mo20929h() {
        return this.f23575c;
    }

    /* renamed from: m */
    public final boolean mo20930m() {
        return this.f23588p;
    }

    /* renamed from: o */
    public final sp2 mo20931o(C5278kw kwVar) {
        this.f23590r = kwVar;
        return this;
    }

    /* renamed from: t */
    public final zzbfd mo20932t() {
        return this.f23573a;
    }

    /* renamed from: v */
    public final zzbfi mo20933v() {
        return this.f23574b;
    }
}
