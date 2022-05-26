package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.C6292d;

/* renamed from: com.google.android.play.core.appupdate.y */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6315y extends C6292d.C6293a {

    /* renamed from: a */
    private Integer f29322a;

    /* renamed from: b */
    private Boolean f29323b;

    C6315y() {
    }

    /* renamed from: a */
    public final C6292d mo25163a() {
        Integer num = this.f29322a;
        if (num != null && this.f29323b != null) {
            return new C6287a0(num.intValue(), this.f29323b.booleanValue(), (C6316z) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29322a == null) {
            sb.append(" appUpdateType");
        }
        if (this.f29323b == null) {
            sb.append(" allowAssetPackDeletion");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: b */
    public final C6292d.C6293a mo25164b(boolean z) {
        this.f29323b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final C6292d.C6293a mo25179c(int i) {
        this.f29322a = Integer.valueOf(i);
        return this;
    }
}
