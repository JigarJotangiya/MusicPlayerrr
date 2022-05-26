package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a62 implements o83 {

    /* renamed from: a */
    final /* synthetic */ long f13785a;

    /* renamed from: b */
    final /* synthetic */ String f13786b;

    /* renamed from: c */
    final /* synthetic */ bp2 f13787c;

    /* renamed from: d */
    final /* synthetic */ ep2 f13788d;

    /* renamed from: e */
    final /* synthetic */ iv2 f13789e;

    /* renamed from: f */
    final /* synthetic */ np2 f13790f;

    /* renamed from: g */
    final /* synthetic */ b62 f13791g;

    a62(b62 b62, long j, String str, bp2 bp2, ep2 ep2, iv2 iv2, np2 np2) {
        this.f13791g = b62;
        this.f13785a = j;
        this.f13786b = str;
        this.f13787c = bp2;
        this.f13788d = ep2;
        this.f13789e = iv2;
        this.f13790f = np2;
    }

    /* renamed from: a */
    public final void mo10677a(Object obj) {
        long b = this.f13791g.f14338a.mo11989b() - this.f13785a;
        b62.m21114g(this.f13791g, this.f13786b, 0, b, this.f13787c.f14642d0);
        if (this.f13791g.f14342e) {
            this.f13791g.f14339b.mo16505a(this.f13788d, this.f13787c, 0, (o22) null, b);
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22654w5)).booleanValue()) {
            this.f13791g.f14343f.mo20183d(this.f13787c, b, (zzbew) null);
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        int i;
        zzbew zzbew;
        long b = this.f13791g.f14338a.mo11989b() - this.f13785a;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof p52) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zp2) {
            i = 5;
        } else {
            i = (!(th instanceof pw1) || nq2.m28045a(th).f27186g != 3) ? 6 : 1;
        }
        b62.m21114g(this.f13791g, this.f13786b, i, b, this.f13787c.f14642d0);
        if (this.f13791g.f14342e) {
            this.f13791g.f14339b.mo16505a(this.f13788d, this.f13787c, i, th instanceof o22 ? (o22) th : null, b);
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22670y5)).booleanValue()) {
            lv2 c = this.f13791g.f14340c;
            iv2 iv2 = this.f13789e;
            np2 np2 = this.f13790f;
            bp2 bp2 = this.f13787c;
            c.mo19286c(iv2.mo18513a(np2, bp2, bp2.f14660o));
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22654w5)).booleanValue()) {
            zzbew a = nq2.m28045a(th);
            int i2 = a.f27186g;
            if ((i2 == 3 || i2 == 0) && (zzbew = a.f27189j) != null && !zzbew.f27188i.equals("com.google.android.gms.ads")) {
                a = nq2.m28045a(new o22(13, a.f27189j));
            }
            this.f13791g.f14343f.mo20183d(this.f13787c, b, a);
        }
    }
}
