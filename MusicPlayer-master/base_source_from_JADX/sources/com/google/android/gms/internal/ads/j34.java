package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j34 implements r24 {

    /* renamed from: a */
    private final pa1 f18346a;

    /* renamed from: b */
    private int f18347b = 1048576;

    /* renamed from: c */
    private final i34 f18348c;

    /* renamed from: d */
    private final x54 f18349d = new x54(-1);

    public j34(pa1 pa1, f94 f94) {
        i34 i34 = new i34(f94);
        this.f18346a = pa1;
        this.f18348c = i34;
    }

    /* renamed from: a */
    public final j34 mo18537a(int i) {
        this.f18347b = i;
        return this;
    }

    /* renamed from: b */
    public final l34 mo18538b(C5825zn znVar) {
        Objects.requireNonNull(znVar.f26839b);
        return new l34(znVar, this.f18346a, this.f18348c, oz3.f21254a, this.f18349d, this.f18347b, (k34) null, (byte[]) null);
    }
}
