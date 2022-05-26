package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l34 extends i14 implements c34 {

    /* renamed from: g */
    private final C5825zn f19179g;

    /* renamed from: h */
    private final C5745xi f19180h;

    /* renamed from: i */
    private final pa1 f19181i;

    /* renamed from: j */
    private final oz3 f19182j;

    /* renamed from: k */
    private final int f19183k;

    /* renamed from: l */
    private boolean f19184l = true;

    /* renamed from: m */
    private long f19185m = -9223372036854775807L;

    /* renamed from: n */
    private boolean f19186n;

    /* renamed from: o */
    private boolean f19187o;

    /* renamed from: p */
    private fr1 f19188p;

    /* renamed from: q */
    private final i34 f19189q;

    /* renamed from: r */
    private final x54 f19190r;

    /* synthetic */ l34(C5825zn znVar, pa1 pa1, i34 i34, oz3 oz3, x54 x54, int i, k34 k34, byte[] bArr) {
        C5745xi xiVar = znVar.f26839b;
        Objects.requireNonNull(xiVar);
        this.f19180h = xiVar;
        this.f19179g = znVar;
        this.f19181i = pa1;
        this.f19189q = i34;
        this.f19182j = oz3;
        this.f19190r = x54;
        this.f19183k = i;
    }

    /* renamed from: z */
    private final void m26520z() {
        long j = this.f19185m;
        boolean z = this.f19186n;
        boolean z2 = this.f19187o;
        C5825zn znVar = this.f19179g;
        y34 y34 = r1;
        y34 y342 = new y34(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, znVar, z2 ? znVar.f26840c : null);
        mo18272u(this.f19184l ? new h34(this, y34) : y34);
    }

    /* renamed from: d */
    public final void mo16480d(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f19185m;
        }
        if (this.f19184l || this.f19185m != j || this.f19186n != z || this.f19187o != z2) {
            this.f19185m = j;
            this.f19186n = z;
            this.f19187o = z2;
            this.f19184l = false;
            m26520z();
        }
    }

    /* renamed from: e */
    public final void mo16022e(e24 e24) {
        ((g34) e24).mo17835y();
    }

    /* renamed from: i */
    public final e24 mo16023i(f24 f24, r54 r54, long j) {
        qb1 zza = this.f19181i.zza();
        fr1 fr1 = this.f19188p;
        if (fr1 != null) {
            zza.mo19648l(fr1);
        }
        Uri uri = this.f19180h.f25834a;
        k14 k14 = new k14(this.f19189q.f17881a);
        oz3 oz3 = this.f19182j;
        iz3 l = mo18265l(f24);
        x54 x54 = this.f19190r;
        p24 o = mo18268o(f24);
        String str = this.f19180h.f25839f;
        return new g34(uri, zza, k14, oz3, l, x54, o, this, r54, (String) null, this.f19183k, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo16024s(fr1 fr1) {
        this.f19188p = fr1;
        m26520z();
    }

    /* renamed from: t */
    public final void mo16025t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo16026v() {
    }

    /* renamed from: x */
    public final C5825zn mo16027x() {
        return this.f19179g;
    }
}
