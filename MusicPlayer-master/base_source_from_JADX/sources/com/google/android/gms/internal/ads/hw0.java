package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hw0 implements ru1 {

    /* renamed from: a */
    private final mx0 f17765a;

    /* renamed from: b */
    private Context f17766b;

    /* renamed from: c */
    private s60 f17767c;

    /* synthetic */ hw0(mx0 mx0, gw0 gw0) {
        this.f17765a = mx0;
    }

    /* renamed from: a */
    public final /* synthetic */ ru1 mo18216a(Context context) {
        Objects.requireNonNull(context);
        this.f17766b = context;
        return this;
    }

    /* renamed from: b */
    public final su1 mo18217b() {
        gs3.m24491c(this.f17766b, Context.class);
        gs3.m24491c(this.f17767c, s60.class);
        return new jw0(this.f17765a, this.f17766b, this.f17767c, (iw0) null);
    }

    /* renamed from: c */
    public final /* synthetic */ ru1 mo18218c(s60 s60) {
        Objects.requireNonNull(s60);
        this.f17767c = s60;
        return this;
    }
}
