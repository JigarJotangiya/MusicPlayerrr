package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class u13 extends z13 {

    /* renamed from: l */
    final /* synthetic */ v13 f24145l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u13(v13 v13, b23 b23, CharSequence charSequence) {
        super(b23, charSequence);
        this.f24145l = v13;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo21206d(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo21207e(int i) {
        f13 f13 = this.f24145l.f24543a;
        CharSequence charSequence = this.f26620i;
        int length = charSequence.length();
        s13.m30499b(i, length, "index");
        while (i < length) {
            if (f13.mo16456a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
