package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p24 {

    /* renamed from: a */
    public final int f21303a;

    /* renamed from: b */
    public final f24 f21304b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<o24> f21305c;

    public p24() {
        this(new CopyOnWriteArrayList(), 0, (f24) null, 0);
    }

    private p24(CopyOnWriteArrayList<o24> copyOnWriteArrayList, int i, f24 f24, long j) {
        this.f21305c = copyOnWriteArrayList;
        this.f21303a = i;
        this.f21304b = f24;
    }

    /* renamed from: n */
    private static final long m28843n(long j) {
        long d = bw3.m21570d(j);
        if (d == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return d;
    }

    /* renamed from: a */
    public final p24 mo20190a(int i, f24 f24, long j) {
        return new p24(this.f21305c, i, f24, 0);
    }

    /* renamed from: b */
    public final void mo20191b(Handler handler, q24 q24) {
        this.f21305c.add(new o24(handler, q24));
    }

    /* renamed from: c */
    public final void mo20192c(c24 c24) {
        Iterator<o24> it = this.f21305c.iterator();
        while (it.hasNext()) {
            o24 next = it.next();
            wy2.m33458u(next.f20885a, new n24(this, next.f20886b, c24));
        }
    }

    /* renamed from: d */
    public final void mo20193d(int i, C5689w wVar, int i2, Object obj, long j) {
        mo20192c(new c24(1, i, wVar, 0, (Object) null, m28843n(j), -9223372036854775807L));
    }

    /* renamed from: e */
    public final void mo20194e(x14 x14, c24 c24) {
        Iterator<o24> it = this.f21305c.iterator();
        while (it.hasNext()) {
            o24 next = it.next();
            wy2.m33458u(next.f20885a, new j24(this, next.f20886b, x14, c24));
        }
    }

    /* renamed from: f */
    public final void mo20195f(x14 x14, int i, int i2, C5689w wVar, int i3, Object obj, long j, long j2) {
        x14 x142 = x14;
        mo20194e(x14, new c24(1, -1, (C5689w) null, 0, (Object) null, m28843n(j), m28843n(j2)));
    }

    /* renamed from: g */
    public final void mo20196g(x14 x14, c24 c24) {
        Iterator<o24> it = this.f21305c.iterator();
        while (it.hasNext()) {
            o24 next = it.next();
            wy2.m33458u(next.f20885a, new k24(this, next.f20886b, x14, c24));
        }
    }

    /* renamed from: h */
    public final void mo20197h(x14 x14, int i, int i2, C5689w wVar, int i3, Object obj, long j, long j2) {
        x14 x142 = x14;
        mo20196g(x14, new c24(1, -1, (C5689w) null, 0, (Object) null, m28843n(j), m28843n(j2)));
    }

    /* renamed from: i */
    public final void mo20198i(x14 x14, c24 c24, IOException iOException, boolean z) {
        Iterator<o24> it = this.f21305c.iterator();
        while (it.hasNext()) {
            o24 next = it.next();
            wy2.m33458u(next.f20885a, new m24(this, next.f20886b, x14, c24, iOException, z));
        }
    }

    /* renamed from: j */
    public final void mo20199j(x14 x14, int i, int i2, C5689w wVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        x14 x142 = x14;
        mo20198i(x14, new c24(1, -1, (C5689w) null, 0, (Object) null, m28843n(j), m28843n(j2)), iOException, z);
    }

    /* renamed from: k */
    public final void mo20200k(x14 x14, c24 c24) {
        Iterator<o24> it = this.f21305c.iterator();
        while (it.hasNext()) {
            o24 next = it.next();
            wy2.m33458u(next.f20885a, new l24(this, next.f20886b, x14, c24));
        }
    }

    /* renamed from: l */
    public final void mo20201l(x14 x14, int i, int i2, C5689w wVar, int i3, Object obj, long j, long j2) {
        x14 x142 = x14;
        mo20200k(x14, new c24(1, -1, (C5689w) null, 0, (Object) null, m28843n(j), m28843n(j2)));
    }

    /* renamed from: m */
    public final void mo20202m(q24 q24) {
        Iterator<o24> it = this.f21305c.iterator();
        while (it.hasNext()) {
            o24 next = it.next();
            if (next.f20886b == q24) {
                this.f21305c.remove(next);
            }
        }
    }
}
