package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i93 extends e73<Void> implements Runnable {

    /* renamed from: n */
    private final Runnable f17926n;

    public i93(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f17926n = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo18099i() {
        String valueOf = String.valueOf(this.f17926n);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        try {
            this.f17926n.run();
        } catch (Throwable th) {
            mo18106x(th);
            f23.m23432b(th);
            throw new RuntimeException(th);
        }
    }
}
