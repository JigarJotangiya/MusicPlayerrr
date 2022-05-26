package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5067f7 extends jr3 implements Closeable {
    static {
        qr3.m29672b(C5067f7.class);
    }

    public C5067f7(kr3 kr3, C5030e7 e7Var) throws IOException {
        mo18707H(kr3, kr3.mo19006b(), e7Var);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.f18572h.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
