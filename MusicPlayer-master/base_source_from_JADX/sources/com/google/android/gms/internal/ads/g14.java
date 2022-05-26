package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g14 implements k04 {

    /* renamed from: a */
    private final MediaCodec f16858a;

    /* renamed from: b */
    private ByteBuffer[] f16859b;

    /* renamed from: c */
    private ByteBuffer[] f16860c;

    /* synthetic */ g14(MediaCodec mediaCodec, Surface surface, e14 e14) {
        this.f16858a = mediaCodec;
        if (wy2.f25579a < 21) {
            this.f16859b = mediaCodec.getInputBuffers();
            this.f16860c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: N */
    public final void mo17794N(Bundle bundle) {
        this.f16858a.setParameters(bundle);
    }

    /* renamed from: a */
    public final void mo17795a(int i, int i2, int i3, long j, int i4) {
        this.f16858a.queueInputBuffer(i, 0, i3, j, i4);
    }

    /* renamed from: b */
    public final MediaFormat mo17796b() {
        return this.f16858a.getOutputFormat();
    }

    /* renamed from: c */
    public final void mo17797c(Surface surface) {
        this.f16858a.setOutputSurface(surface);
    }

    /* renamed from: d */
    public final void mo17798d(int i, int i2, g01 g01, long j, int i3) {
        this.f16858a.queueSecureInputBuffer(i, 0, g01.mo17790a(), j, 0);
    }

    /* renamed from: e */
    public final void mo17799e(int i) {
        this.f16858a.setVideoScalingMode(i);
    }

    /* renamed from: f */
    public final void mo17800f(int i, boolean z) {
        this.f16858a.releaseOutputBuffer(i, z);
    }

    /* renamed from: g */
    public final void mo17801g() {
        this.f16858a.flush();
    }

    /* renamed from: h */
    public final int mo17802h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f16858a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (wy2.f25579a < 21) {
                    this.f16860c = this.f16858a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: i */
    public final void mo17803i(int i, long j) {
        this.f16858a.releaseOutputBuffer(i, j);
    }

    /* renamed from: j */
    public final void mo17804j() {
        this.f16859b = null;
        this.f16860c = null;
        this.f16858a.release();
    }

    /* renamed from: w */
    public final ByteBuffer mo17805w(int i) {
        if (wy2.f25579a >= 21) {
            return this.f16858a.getOutputBuffer(i);
        }
        ByteBuffer[] byteBufferArr = this.f16860c;
        wy2.m33436c(byteBufferArr);
        return byteBufferArr[i];
    }

    /* renamed from: z */
    public final ByteBuffer mo17806z(int i) {
        if (wy2.f25579a >= 21) {
            return this.f16858a.getInputBuffer(i);
        }
        ByteBuffer[] byteBufferArr = this.f16859b;
        wy2.m33436c(byteBufferArr);
        return byteBufferArr[i];
    }

    public final int zza() {
        return this.f16858a.dequeueInputBuffer(0);
    }

    public final boolean zzr() {
        return false;
    }
}
