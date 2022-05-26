package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.C3237c;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zu2 implements Runnable {

    /* renamed from: n */
    static Boolean f26915n;

    /* renamed from: g */
    private final Context f26916g;

    /* renamed from: h */
    private final zzcjf f26917h;

    /* renamed from: i */
    private final ev2 f26918i = hv2.m24928E();

    /* renamed from: j */
    private String f26919j;

    /* renamed from: k */
    private int f26920k;

    /* renamed from: l */
    private boolean f26921l = false;

    /* renamed from: m */
    private final bh0 f26922m;

    public zu2(Context context, zzcjf zzcjf, b02 b02, bh0 bh0, byte[] bArr) {
        this.f26916g = context;
        this.f26917h = zzcjf;
        this.f26922m = bh0;
    }

    /* renamed from: b */
    public static synchronized boolean m34798b() {
        boolean booleanValue;
        synchronized (zu2.class) {
            if (f26915n == null) {
                if (!z00.f26611b.mo20989e().booleanValue()) {
                    f26915n = Boolean.FALSE;
                } else {
                    f26915n = Boolean.valueOf(Math.random() < z00.f26610a.mo20989e().doubleValue());
                }
            }
            booleanValue = f26915n.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: c */
    private final synchronized void m34799c() {
        if (!this.f26921l) {
            this.f26921l = true;
            if (m34798b()) {
                C2971s.m13214q();
                this.f26919j = C2979b2.m13252d0(this.f26916g);
                this.f26920k = C3237c.m14031f().mo11693a(this.f26916g);
                long intValue = (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22387N5)).intValue();
                hm0.f17711d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: d */
    private final synchronized void m34800d() {
        try {
            new a02(this.f26916g, this.f26917h.f27376g, this.f26922m, Binder.getCallingUid(), (byte[]) null).mo15625b(new yz1((String) C5054ev.m23225c().mo20153b(C5503qz.f22380M5), 60000, new HashMap(), ((hv2) this.f26918i.mo19761n()).mo21561e(), "application/x-protobuf"));
        } catch (Exception e) {
            if (!(e instanceof pw1) || ((pw1) e).zza() != 3) {
                C2971s.m13213p().mo17570r(e, "CuiMonitor.sendCuiPing");
            } else {
                this.f26918i.mo17360t();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo22435a(yu2 yu2) {
        if (!this.f26921l) {
            m34799c();
        }
        if (m34798b()) {
            if (yu2 != null) {
                ev2 ev2 = this.f26918i;
                fv2 D = gv2.m24558D();
                bv2 D2 = cv2.m22171D();
                D2.mo16400G(7);
                D2.mo16397D(yu2.mo22294h());
                D2.mo16407v(yu2.mo22288b());
                D2.mo16402I(3);
                D2.mo16396C(this.f26917h.f27376g);
                D2.mo16403r(this.f26919j);
                D2.mo16394A(Build.VERSION.RELEASE);
                D2.mo16398E(Build.VERSION.SDK_INT);
                D2.mo16401H(yu2.mo22296j());
                D2.mo16410z(yu2.mo22287a());
                D2.mo16405t((long) this.f26920k);
                D2.mo16399F(yu2.mo22295i());
                D2.mo16404s(yu2.mo22289c());
                D2.mo16406u(yu2.mo22290d());
                D2.mo16408w(yu2.mo22291e());
                D2.mo16409y(yu2.mo22292f());
                D2.mo16395B(yu2.mo22293g());
                D.mo17759r(D2);
                ev2.mo17359s(D);
            }
        }
    }

    public final synchronized void run() {
        if (m34798b()) {
            if (this.f26918i.mo17358r() != 0) {
                m34800d();
            }
        }
    }
}
