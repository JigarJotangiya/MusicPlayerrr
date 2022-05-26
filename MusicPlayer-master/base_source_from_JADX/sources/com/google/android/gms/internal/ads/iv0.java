package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class iv0 implements tj2 {

    /* renamed from: a */
    private final mx0 f18170a;

    /* renamed from: b */
    private Context f18171b;

    /* renamed from: c */
    private String f18172c;

    /* synthetic */ iv0(mx0 mx0, hv0 hv0) {
        this.f18170a = mx0;
    }

    /* renamed from: a */
    public final /* synthetic */ tj2 mo18509a(Context context) {
        Objects.requireNonNull(context);
        this.f18171b = context;
        return this;
    }

    /* renamed from: b */
    public final uj2 mo18510b() {
        gs3.m24491c(this.f18171b, Context.class);
        gs3.m24491c(this.f18172c, String.class);
        return new kv0(this.f18170a, this.f18171b, this.f18172c, (jv0) null);
    }

    /* renamed from: p */
    public final /* synthetic */ tj2 mo18511p(String str) {
        Objects.requireNonNull(str);
        this.f18172c = str;
        return this;
    }
}
