package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pu3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f21527a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ht1 f21528b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public b54 f21529c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final r24 f21530d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public rt3 f21531e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final l54 f21532f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ex3 f21533g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Looper f21534h = wy2.m33432a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final fc3 f21535i = fc3.f16529c;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ou3 f21536j = ou3.f21194d;

    /* renamed from: k */
    private boolean f21537k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ar0 f21538l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final hd3 f21539m = new hd3(0.97f, 1.03f, 1000, 1.0E-7f, bw3.m21569c(20), bw3.m21569c(500), 0.999f, (gc3) null);

    @Deprecated
    public pu3(Context context, ar0 ar0, byte[] bArr) {
        Context context2 = context;
        u84 u84 = new u84();
        v44 v44 = new v44(context2);
        t14 t14 = new t14(context2, u84);
        ie3 ie3 = new ie3();
        u54 d = u54.m31668d(context);
        ht1 ht1 = ht1.f17758a;
        ex3 ex3 = new ex3(ht1);
        this.f21527a = context2;
        this.f21538l = ar0;
        this.f21529c = v44;
        this.f21530d = t14;
        this.f21531e = ie3;
        this.f21532f = d;
        this.f21533g = ex3;
        this.f21528b = ht1;
    }

    @Deprecated
    /* renamed from: g */
    public final pu3 mo20321g(rt3 rt3) {
        gs1.m24488f(!this.f21537k);
        this.f21531e = rt3;
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public final pu3 mo20322h(b54 b54) {
        gs1.m24488f(!this.f21537k);
        this.f21529c = b54;
        return this;
    }

    @Deprecated
    /* renamed from: i */
    public final uu3 mo20323i() {
        gs1.m24488f(!this.f21537k);
        this.f21537k = true;
        return new uu3(this);
    }
}
