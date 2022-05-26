package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.q3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5471q3 {

    /* renamed from: a */
    private final List<C5689w> f21798a;

    /* renamed from: b */
    private final da4[] f21799b;

    public C5471q3(List<C5689w> list) {
        this.f21798a = list;
        this.f21799b = new da4[list.size()];
    }

    /* renamed from: a */
    public final void mo20386a(long j, no2 no2) {
        q84.m29409a(j, no2, this.f21799b);
    }

    /* renamed from: b */
    public final void mo20387b(b94 b94, C4953c4 c4Var) {
        String str;
        for (int i = 0; i < this.f21799b.length; i++) {
            c4Var.mo16483c();
            da4 s = b94.mo15724s(c4Var.mo16481a(), 3);
            C5689w wVar = this.f21798a.get(i);
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
            String str3 = wVar.f25122a;
            if (str3 == null) {
                str3 = c4Var.mo16482b();
            }
            jb4 jb4 = new jb4();
            jb4.mo18587h(str3);
            jb4.mo18599s(str2);
            jb4.mo18601u(wVar.f25125d);
            jb4.mo18591k(wVar.f25124c);
            jb4.mo18578c0(wVar.f25119D);
            jb4.mo18589i(wVar.f25135n);
            s.mo16885a(jb4.mo18605y());
            this.f21799b[i] = s;
        }
    }
}
