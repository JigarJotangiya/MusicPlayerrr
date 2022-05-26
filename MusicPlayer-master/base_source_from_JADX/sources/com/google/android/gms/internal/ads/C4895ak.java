package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ak */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4895ak extends C5741xe {

    /* renamed from: d */
    private static final Object f13930d = new Object();

    /* renamed from: b */
    private final long f13931b;

    /* renamed from: c */
    private final long f13932c;

    public C4895ak(long j, boolean z) {
        this.f13931b = j;
        this.f13932c = j;
    }

    /* renamed from: a */
    public final int mo15822a(Object obj) {
        return f13930d.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo15823b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo15824c() {
        return 1;
    }

    /* renamed from: d */
    public final C5667ve mo15825d(int i, C5667ve veVar, boolean z) {
        C5304ll.m26772a(i, 0, 1);
        Object obj = z ? f13930d : null;
        long j = this.f13931b;
        veVar.f24696a = obj;
        veVar.f24697b = obj;
        veVar.f24698c = j;
        return veVar;
    }

    /* renamed from: e */
    public final C5704we mo15826e(int i, C5704we weVar, boolean z, long j) {
        C5304ll.m26772a(i, 0, 1);
        weVar.f25370a = this.f13932c;
        return weVar;
    }
}
