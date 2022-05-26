package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.n3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
abstract class C6393n3 {
    C6393n3() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo25337a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract long mo25338b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract String mo25339c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo25340d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo25341e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract byte[] mo25342f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo25343g() {
        if (mo25339c() == null) {
            return false;
        }
        return mo25339c().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo25344h() {
        return mo25337a() == 0;
    }
}
