package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y63 {

    /* renamed from: b */
    static final y63 f26279b = new y63(new C5771a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    final Throwable f26280a;

    /* renamed from: com.google.android.gms.internal.ads.y63$a */
    /* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
    class C5771a extends Throwable {
        C5771a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    y63(Throwable th) {
        Objects.requireNonNull(th);
        this.f26280a = th;
    }
}
