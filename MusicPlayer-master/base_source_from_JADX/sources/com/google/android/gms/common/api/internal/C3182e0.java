package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3158b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.internal.C3294m;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.C3356a;
import p159f.p243f.p245b.p246a.p303f.C7466d;
import p159f.p243f.p245b.p246a.p303f.C7470h;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3182e0<T> implements C7466d<T> {

    /* renamed from: a */
    private final C3181e f10394a;

    /* renamed from: b */
    private final int f10395b;

    /* renamed from: c */
    private final C3173b<?> f10396c;

    /* renamed from: d */
    private final long f10397d;

    C3182e0(C3181e eVar, int i, C3173b<?> bVar, long j, String str, String str2) {
        this.f10394a = eVar;
        this.f10395b = i;
        this.f10396c = bVar;
        this.f10397d = j;
    }

    /* renamed from: b */
    static <T> C3182e0<T> m13882b(C3181e eVar, int i, C3173b<?> bVar) {
        boolean z;
        if (!eVar.mo11583s()) {
            return null;
        }
        RootTelemetryConfiguration a = C3294m.m14245b().mo11858a();
        if (a == null) {
            z = true;
        } else if (!a.mo11741n0()) {
            return null;
        } else {
            z = a.mo11742o0();
            C3224z p = eVar.mo11580p(bVar);
            if (p != null) {
                if (!(p.mo11649s() instanceof C3261d)) {
                    return null;
                }
                C3261d dVar = (C3261d) p.mo11649s();
                if (dVar.mo11778I() && !dVar.mo11793e()) {
                    ConnectionTelemetryConfiguration c = m13883c(p, dVar, i);
                    if (c == null) {
                        return null;
                    }
                    p.mo11644G();
                    z = c.mo11733v0();
                }
            }
        }
        return new C3182e0(eVar, i, bVar, z ? System.currentTimeMillis() : 0, (String) null, (String) null);
    }

    /* renamed from: c */
    private static ConnectionTelemetryConfiguration m13883c(C3224z<?> zVar, C3261d<?> dVar, int i) {
        int[] m0;
        int[] n0;
        ConnectionTelemetryConfiguration G = dVar.mo11776G();
        if (G == null || !G.mo11732o0() || ((m0 = G.mo11730m0()) != null ? !C3356a.m14425a(m0, i) : !((n0 = G.mo11731n0()) == null || !C3356a.m14425a(n0, i))) || zVar.mo11643F() >= G.mo11729Y()) {
            return null;
        }
        return G;
    }

    /* renamed from: a */
    public final void mo11556a(C7470h<T> hVar) {
        C3224z p;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f10394a.mo11583s()) {
            RootTelemetryConfiguration a = C3294m.m14245b().mo11858a();
            if ((a == null || a.mo11741n0()) && (p = this.f10394a.mo11580p(this.f10396c)) != null && (p.mo11649s() instanceof C3261d)) {
                C3261d dVar = (C3261d) p.mo11649s();
                boolean z = true;
                boolean z2 = this.f10397d > 0;
                int y = dVar.mo11811y();
                if (a != null) {
                    boolean o0 = z2 & a.mo11742o0();
                    int Y = a.mo11739Y();
                    int m0 = a.mo11740m0();
                    i3 = a.mo11743v0();
                    if (dVar.mo11778I() && !dVar.mo11793e()) {
                        ConnectionTelemetryConfiguration c = m13883c(p, dVar, this.f10395b);
                        if (c != null) {
                            if (!c.mo11733v0() || this.f10397d <= 0) {
                                z = false;
                            }
                            m0 = c.mo11729Y();
                            o0 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = Y;
                    i = m0;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                C3181e eVar = this.f10394a;
                if (hVar.mo28343m()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (hVar.mo28341k()) {
                        i5 = 100;
                    } else {
                        Exception i7 = hVar.mo28339i();
                        if (i7 instanceof C3158b) {
                            Status status = ((C3158b) i7).getStatus();
                            int n0 = status.mo11491n0();
                            ConnectionResult Y2 = status.mo11487Y();
                            if (Y2 == null) {
                                i6 = -1;
                            } else {
                                i6 = Y2.mo11443Y();
                            }
                            i4 = i6;
                            i5 = n0;
                        } else {
                            i5 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f10397d;
                    j = System.currentTimeMillis();
                    j2 = j3;
                } else {
                    j2 = 0;
                    j = 0;
                }
                eVar.mo11586v(new MethodInvocation(this.f10395b, i5, i4, j2, j, (String) null, (String) null, y), i3, (long) i2, i);
            }
        }
    }
}
