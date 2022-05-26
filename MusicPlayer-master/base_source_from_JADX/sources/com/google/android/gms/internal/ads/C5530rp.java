package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.rp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5530rp extends PushbackInputStream {

    /* renamed from: g */
    final /* synthetic */ C5567sp f22943g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5530rp(C5567sp spVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f22943g = spVar;
    }

    public final synchronized void close() throws IOException {
        C5641up.m31946e(this.f22943g.f23572c);
        super.close();
    }
}
