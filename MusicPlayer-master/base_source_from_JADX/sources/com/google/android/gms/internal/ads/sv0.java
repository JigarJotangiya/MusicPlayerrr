package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sv0 implements il2 {

    /* renamed from: a */
    private final mx0 f23634a;

    /* renamed from: b */
    private Context f23635b;

    /* renamed from: c */
    private String f23636c;

    /* renamed from: d */
    private zzbfi f23637d;

    /* synthetic */ sv0(mx0 mx0, rv0 rv0) {
        this.f23634a = mx0;
    }

    /* renamed from: Q */
    public final /* synthetic */ il2 mo18390Q(Context context) {
        Objects.requireNonNull(context);
        this.f23635b = context;
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ il2 mo18391a(zzbfi zzbfi) {
        Objects.requireNonNull(zzbfi);
        this.f23637d = zzbfi;
        return this;
    }

    /* renamed from: f */
    public final ll2 mo18392f() {
        gs3.m24491c(this.f23635b, Context.class);
        gs3.m24491c(this.f23636c, String.class);
        gs3.m24491c(this.f23637d, zzbfi.class);
        return new uv0(this.f23634a, this.f23635b, this.f23636c, this.f23637d, (tv0) null);
    }

    /* renamed from: p */
    public final /* synthetic */ il2 mo18393p(String str) {
        Objects.requireNonNull(str);
        this.f23636c = str;
        return this;
    }
}
