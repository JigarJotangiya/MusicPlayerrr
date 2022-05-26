package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g41;
import com.google.android.gms.internal.ads.n71;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tl2<R extends n71<AdT>, AdT extends g41> implements om2<R, AdT> {

    /* renamed from: a */
    private final om2<R, AdT> f23930a;

    /* renamed from: b */
    private final om2<R, yl2<R, AdT>> f23931b;

    /* renamed from: c */
    private final zr2<R, AdT> f23932c;

    /* renamed from: d */
    private final String f23933d;

    /* renamed from: e */
    private R f23934e;

    /* renamed from: f */
    private final Executor f23935f;

    public tl2(om2<R, AdT> om2, om2<R, yl2<R, AdT>> om22, zr2<R, AdT> zr2, String str, Executor executor) {
        this.f23930a = om2;
        this.f23931b = om22;
        this.f23932c = zr2;
        this.f23933d = str;
        this.f23935f = executor;
    }

    /* renamed from: g */
    private final d93<AdT> m31329g(lr2<R, AdT> lr2, pm2 pm2) {
        R r = lr2.f19512a;
        this.f23934e = r;
        if (lr2.f19514c != null) {
            if (r.mo16756c() != null) {
                lr2.f19514c.mo17842f().mo16976b(lr2.f19512a.mo16756c());
            }
            return s83.m30607i(lr2.f19514c);
        }
        r.mo16754a().mo18850k(lr2.f19513b);
        return ((dm2) this.f23930a).mo16952c(pm2, (nm2) null, lr2.f19512a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ d93 mo16681a(pm2 pm2, nm2 nm2, Object obj) {
        return mo21114e(pm2, nm2, (n71) null);
    }

    /* renamed from: b */
    public final synchronized R mo16684f() {
        return this.f23934e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo21112c(pm2 pm2, sl2 sl2, nm2 nm2, n71 n71, yl2 yl2) throws Exception {
        if (yl2 != null) {
            sl2 sl22 = new sl2(sl2.f23534a, sl2.f23535b, sl2.f23536c, sl2.f23537d, sl2.f23538e, sl2.f23539f, yl2.f26400a);
            if (yl2.f26402c != null) {
                this.f23934e = null;
                this.f23932c.mo22427e(sl22);
                return m31329g(yl2.f26402c, pm2);
            }
            d93<wr2<R, AdT>> a = this.f23932c.mo22426a(sl22);
            if (a != null) {
                this.f23934e = null;
                return s83.m30612n(a, new pl2(this), this.f23935f);
            }
            this.f23932c.mo22427e(sl22);
            pm2 = new pm2(pm2.f21429b, yl2.f26401b);
        }
        d93 c = ((dm2) this.f23930a).mo16952c(pm2, nm2, n71);
        this.f23934e = n71;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ d93 mo21113d(wr2 wr2) throws Exception {
        yr2<U, A> yr2;
        if (wr2 == null || wr2.f25520a == null || (yr2 = wr2.f25521b) == null) {
            throw new pw1(1, "Empty prefetch");
        }
        C5309lq D = C5531rq.m30292D();
        C5235jq D2 = C5272kq.m26345D();
        D2.mo18700u(2);
        D2.mo18698s(C5420oq.m28651F());
        D.mo19269r(D2);
        wr2.f25520a.f19512a.mo16754a().mo18842c().mo16371r((C5531rq) D.mo19761n());
        return m31329g(wr2.f25520a, ((sl2) yr2).f23535b);
    }

    /* renamed from: e */
    public final synchronized d93<AdT> mo21114e(pm2 pm2, nm2<R> nm2, R r) {
        pm2 pm22 = pm2;
        nm2<R> nm22 = nm2;
        synchronized (this) {
            l71<R> a = nm22.mo18001a(pm22.f21429b);
            a.mo16421o(new ul2(this.f23933d));
            R r2 = (n71) a.mo16419e();
            r2.mo16757d();
            r2.mo16757d();
            zzbfd zzbfd = r2.mo16757d().f24395d;
            if (zzbfd.f27213y == null) {
                if (zzbfd.f27194D == null) {
                    up2 d = r2.mo16757d();
                    nm2<R> nm23 = nm2;
                    pm2 pm23 = pm2;
                    d93<AdT> n = s83.m30612n(j83.m25564E(((zl2) this.f23931b).mo22385c(pm22, nm22, r2)), new ql2(this, pm2, new sl2(nm23, pm23, d.f24395d, d.f24397f, this.f23935f, d.f24401j, (mr2) null), nm2, r2), this.f23935f);
                    return n;
                }
            }
            this.f23934e = r2;
            d93<AdT> c = ((dm2) this.f23930a).mo16952c(pm22, nm22, r2);
            return c;
        }
    }
}
