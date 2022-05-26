package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5064f4 {

    /* renamed from: a */
    private final List<C5689w> f16425a;

    /* renamed from: b */
    private final da4[] f16426b;

    public C5064f4(List<C5689w> list) {
        this.f16425a = list;
        this.f16426b = new da4[list.size()];
    }

    /* renamed from: a */
    public final void mo17483a(long j, no2 no2) {
        if (no2.mo19782i() >= 9) {
            int m = no2.mo19786m();
            int m2 = no2.mo19786m();
            int s = no2.mo19792s();
            if (m == 434 && m2 == 1195456820 && s == 3) {
                q84.m29410b(j, no2, this.f16426b);
            }
        }
    }

    /* renamed from: b */
    public final void mo17484b(b94 b94, C4953c4 c4Var) {
        String str;
        for (int i = 0; i < this.f16426b.length; i++) {
            c4Var.mo16483c();
            da4 s = b94.mo15724s(c4Var.mo16481a(), 3);
            C5689w wVar = this.f16425a.get(i);
            String str2 = wVar.f25133l;
            boolean z = true;
            if (!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) {
                z = false;
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "Invalid closed caption mime type provided: ".concat(valueOf);
            } else {
                str = new String("Invalid closed caption mime type provided: ");
            }
            gs1.m24487e(z, str);
            jb4 jb4 = new jb4();
            jb4.mo18587h(c4Var.mo16482b());
            jb4.mo18599s(str2);
            jb4.mo18601u(wVar.f25125d);
            jb4.mo18591k(wVar.f25124c);
            jb4.mo18578c0(wVar.f25119D);
            jb4.mo18589i(wVar.f25135n);
            s.mo16885a(jb4.mo18605y());
            this.f16426b[i] = s;
        }
    }
}
