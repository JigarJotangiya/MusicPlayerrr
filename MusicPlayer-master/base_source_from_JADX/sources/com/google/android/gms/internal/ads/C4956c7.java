package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.c7 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4956c7 extends ThreadLocal<ByteBuffer> {
    C4956c7(C4993d7 d7Var) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
