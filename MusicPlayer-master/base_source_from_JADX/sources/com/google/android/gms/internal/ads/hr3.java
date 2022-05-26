package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class hr3 extends er3 implements C5142h7 {

    /* renamed from: o */
    private int f17754o;

    protected hr3(String str) {
        super("mvhd");
    }

    /* renamed from: e */
    public final int mo18207e() {
        if (!this.f16077h) {
            mo17278c();
        }
        return this.f17754o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo18208f(ByteBuffer byteBuffer) {
        this.f17754o = C5105g7.m24185c(byteBuffer.get());
        C5105g7.m24186d(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
