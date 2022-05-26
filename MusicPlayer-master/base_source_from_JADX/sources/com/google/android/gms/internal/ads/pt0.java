package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2933i;
import com.google.android.gms.ads.internal.C2971s;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pt0 {

    /* renamed from: a */
    private final zzcjf f21503a;

    /* renamed from: b */
    private final Context f21504b;

    /* renamed from: c */
    private final WeakReference<Context> f21505c;

    /* synthetic */ pt0(nt0 nt0, ot0 ot0) {
        this.f21503a = nt0.f20715a;
        this.f21504b = nt0.f20716b;
        this.f21505c = nt0.f20717c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo20311a() {
        return this.f21504b;
    }

    /* renamed from: b */
    public final C5737xa mo20312b() {
        return new C5737xa(new C2933i(this.f21504b, this.f21503a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final y10 mo20313c() {
        return new y10(this.f21504b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzcjf mo20314d() {
        return this.f21503a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo20315e() {
        return C2971s.m13214q().mo10977L(this.f21504b, this.f21503a.f27376g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final WeakReference<Context> mo20316f() {
        return this.f21505c;
    }
}
