package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rw0 implements en2 {

    /* renamed from: a */
    private final mx0 f23214a;

    /* renamed from: b */
    private Context f23215b;

    /* renamed from: c */
    private String f23216c;

    /* renamed from: d */
    private zzbfi f23217d;

    /* synthetic */ rw0(mx0 mx0, qw0 qw0) {
        this.f23214a = mx0;
    }

    /* renamed from: Q */
    public final /* synthetic */ en2 mo17222Q(Context context) {
        Objects.requireNonNull(context);
        this.f23215b = context;
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ en2 mo17223a(zzbfi zzbfi) {
        Objects.requireNonNull(zzbfi);
        this.f23217d = zzbfi;
        return this;
    }

    /* renamed from: f */
    public final fn2 mo17224f() {
        gs3.m24491c(this.f23215b, Context.class);
        gs3.m24491c(this.f23216c, String.class);
        gs3.m24491c(this.f23217d, zzbfi.class);
        return new tw0(this.f23214a, this.f23215b, this.f23216c, this.f23217d, (sw0) null);
    }

    /* renamed from: p */
    public final /* synthetic */ en2 mo17225p(String str) {
        Objects.requireNonNull(str);
        this.f23216c = str;
        return this;
    }
}
