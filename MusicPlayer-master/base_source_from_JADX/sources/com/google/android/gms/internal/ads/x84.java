package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x84 implements da4 {

    /* renamed from: a */
    private final byte[] f25721a = new byte[4096];

    /* renamed from: a */
    public final void mo16885a(C5689w wVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ int mo16886b(o91 o91, int i, boolean z) {
        return ba4.m21198a(this, o91, i, true);
    }

    /* renamed from: c */
    public final int mo16887c(o91 o91, int i, boolean z, int i2) throws IOException {
        int c = o91.mo15695c(this.f25721a, 0, Math.min(4096, i));
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo16888d(no2 no2, int i) {
        ba4.m21199b(this, no2, i);
    }

    /* renamed from: e */
    public final void mo16889e(long j, int i, int i2, int i3, ca4 ca4) {
    }

    /* renamed from: f */
    public final void mo16890f(no2 no2, int i, int i2) {
        no2.mo19780g(i);
    }
}
