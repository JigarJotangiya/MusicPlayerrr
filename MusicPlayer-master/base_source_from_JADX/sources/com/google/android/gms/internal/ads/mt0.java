package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3015l1;
import com.google.android.gms.ads.p068a0.p069a.C2863f0;
import com.google.android.gms.ads.p068a0.p069a.C2873l;
import com.google.android.gms.ads.p068a0.p069a.C2877p;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class mt0 implements ty0 {

    /* renamed from: a */
    private static mt0 f20157a;

    @Deprecated
    /* renamed from: f */
    public static synchronized mt0 m27423f(zzcjf zzcjf, Context context, nx0 nx0) {
        mt0 mt0;
        synchronized (mt0.class) {
            if (f20157a == null) {
                wv0 wv0 = new wv0((vv0) null);
                nt0 nt0 = new nt0();
                nt0.mo19821d(zzcjf);
                nt0.mo19820c(context);
                wv0.mo21925b(new pt0(nt0, (ot0) null));
                wv0.mo21926c(new ox0(nx0));
                f20157a = wv0.mo21924a();
                C5503qz.m29790c(context);
                C2971s.m13213p().mo17569q(context, zzcjf);
                C2971s.m13201d().mo18471i(context);
                C2971s.m13214q().mo10987Z(context);
                C2971s.m13214q().mo10986Y(context);
                C2971s.m13214q().mo10982T(context);
                C3015l1.m13383a(context);
                C2971s.m13200c().mo21124d(context);
                C2971s.m13220w().mo11041b(context);
                dk0.m22545d(context);
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22469Z3)).booleanValue()) {
                    if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22561l0)).booleanValue()) {
                        C5790yp ypVar = new C5790yp(new C5012dq(context));
                        x02 x02 = new x02(new t02(context), f20157a.mo19512c());
                        C2971s.m13214q();
                        new p12(context, zzcjf, ypVar, x02, UUID.randomUUID().toString(), f20157a.mo19509D()).mo20178b(C2971s.m13213p().mo17562h().mo11065E());
                    }
                }
            }
            mt0 = f20157a;
        }
        return mt0;
    }

    @Deprecated
    /* renamed from: g */
    public static mt0 m27424g(Context context, int i) {
        synchronized (mt0.class) {
            mt0 mt0 = f20157a;
            if (mt0 != null) {
                return mt0;
            }
            return m27423f(new zzcjf(214106000, i, true, false), context, new nu0());
        }
    }

    /* renamed from: h */
    public static mt0 m27425h(Context context, cb0 cb0, int i) {
        mt0 g = m27424g(context, i);
        g.mo19523q().mo16362c(cb0);
        return g;
    }

    /* renamed from: A */
    public abstract en2 mo19506A();

    /* renamed from: B */
    public abstract uo2 mo19507B();

    /* renamed from: C */
    public abstract lq2<bp1> mo19508C();

    /* renamed from: D */
    public abstract gu2 mo19509D();

    /* renamed from: a */
    public final lh2 mo19510a(zzcdq zzcdq, int i) {
        return mo19530x(new ti2(zzcdq, i));
    }

    /* renamed from: b */
    public abstract zu2 mo19511b();

    /* renamed from: c */
    public abstract e93 mo19512c();

    /* renamed from: d */
    public abstract Executor mo19513d();

    /* renamed from: e */
    public abstract ScheduledExecutorService mo19514e();

    /* renamed from: i */
    public abstract yx0 mo19515i();

    /* renamed from: j */
    public abstract f11 mo19516j();

    /* renamed from: k */
    public abstract r11 mo19517k();

    /* renamed from: l */
    public abstract b31 mo19518l();

    /* renamed from: m */
    public abstract wa1 mo19519m();

    /* renamed from: n */
    public abstract oh1 mo19520n();

    /* renamed from: o */
    public abstract li1 mo19521o();

    /* renamed from: p */
    public abstract vp1 mo19522p();

    /* renamed from: q */
    public abstract br1 mo19523q();

    /* renamed from: r */
    public abstract ru1 mo19524r();

    /* renamed from: s */
    public abstract ew1 mo19525s();

    /* renamed from: t */
    public abstract g22 mo19526t();

    /* renamed from: u */
    public abstract C2873l mo19527u();

    /* renamed from: v */
    public abstract C2877p mo19528v();

    /* renamed from: w */
    public abstract C2863f0 mo19529w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract lh2 mo19530x(ti2 ti2);

    /* renamed from: y */
    public abstract tj2 mo19531y();

    /* renamed from: z */
    public abstract il2 mo19532z();
}
