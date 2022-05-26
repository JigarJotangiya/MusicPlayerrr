package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vw0 implements uo2 {

    /* renamed from: a */
    private final mx0 f25029a;

    /* renamed from: b */
    private Context f25030b;

    /* renamed from: c */
    private String f25031c;

    /* synthetic */ vw0(mx0 mx0, uw0 uw0) {
        this.f25029a = mx0;
    }

    /* renamed from: a */
    public final /* synthetic */ uo2 mo21342a(Context context) {
        Objects.requireNonNull(context);
        this.f25030b = context;
        return this;
    }

    /* renamed from: b */
    public final vo2 mo21343b() {
        gs3.m24491c(this.f25030b, Context.class);
        return new xw0(this.f25029a, this.f25030b, this.f25031c, (ww0) null);
    }

    /* renamed from: p */
    public final /* synthetic */ uo2 mo21344p(String str) {
        this.f25031c = str;
        return this;
    }
}
