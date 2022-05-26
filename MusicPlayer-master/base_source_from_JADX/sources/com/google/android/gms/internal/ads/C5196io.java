package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.io */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5196io {

    /* renamed from: a */
    final long f18122a;

    /* renamed from: b */
    final String f18123b;

    /* renamed from: c */
    final int f18124c;

    C5196io(long j, String str, int i) {
        this.f18122a = j;
        this.f18123b = str;
        this.f18124c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5196io)) {
            C5196io ioVar = (C5196io) obj;
            if (ioVar.f18122a == this.f18122a && ioVar.f18124c == this.f18124c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f18122a;
    }
}
