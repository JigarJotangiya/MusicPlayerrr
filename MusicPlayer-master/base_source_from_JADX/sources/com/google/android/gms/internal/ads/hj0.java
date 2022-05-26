package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3024o1;
import com.google.android.gms.common.util.C3359d;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hj0 {

    /* renamed from: a */
    private Context f17671a;

    /* renamed from: b */
    private C3359d f17672b;

    /* renamed from: c */
    private C3024o1 f17673c;

    /* renamed from: d */
    private ck0 f17674d;

    /* synthetic */ hj0(gj0 gj0) {
    }

    /* renamed from: a */
    public final hj0 mo18150a(C3024o1 o1Var) {
        this.f17673c = o1Var;
        return this;
    }

    /* renamed from: b */
    public final hj0 mo18151b(Context context) {
        Objects.requireNonNull(context);
        this.f17671a = context;
        return this;
    }

    /* renamed from: c */
    public final hj0 mo18152c(C3359d dVar) {
        Objects.requireNonNull(dVar);
        this.f17672b = dVar;
        return this;
    }

    /* renamed from: d */
    public final hj0 mo18153d(ck0 ck0) {
        this.f17674d = ck0;
        return this;
    }

    /* renamed from: e */
    public final dk0 mo18154e() {
        gs3.m24491c(this.f17671a, Context.class);
        gs3.m24491c(this.f17672b, C3359d.class);
        gs3.m24491c(this.f17673c, C3024o1.class);
        gs3.m24491c(this.f17674d, ck0.class);
        return new jj0(this.f17671a, this.f17672b, this.f17673c, this.f17674d, (ij0) null);
    }
}
