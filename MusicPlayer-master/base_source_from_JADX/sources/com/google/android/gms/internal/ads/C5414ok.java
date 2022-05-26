package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ok */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5414ok {

    /* renamed from: a */
    private int f21021a;

    /* renamed from: b */
    private final C5118gk[] f21022b;

    public C5414ok(C5118gk[] gkVarArr, byte... bArr) {
        this.f21022b = gkVarArr;
    }

    /* renamed from: a */
    public final C5118gk mo20012a(int i) {
        return this.f21022b[i];
    }

    /* renamed from: b */
    public final C5118gk[] mo20013b() {
        return (C5118gk[]) this.f21022b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5414ok.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21022b, ((C5414ok) obj).f21022b);
    }

    public final int hashCode() {
        int i = this.f21021a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f21022b) + 527;
        this.f21021a = hashCode;
        return hashCode;
    }
}
