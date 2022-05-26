package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xz3 implements k04 {

    /* renamed from: a */
    private final MediaCodec f26140a;

    /* renamed from: b */
    private final c04 f26141b;

    /* renamed from: c */
    private final a04 f26142c;

    /* renamed from: d */
    private boolean f26143d;

    /* renamed from: e */
    private int f26144e = 0;

    /* synthetic */ xz3(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, wz3 wz3) {
        this.f26140a = mediaCodec;
        this.f26141b = new c04(handlerThread);
        this.f26142c = new a04(mediaCodec, handlerThread2);
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m33914m(xz3 xz3, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        xz3.f26141b.mo16449e(xz3.f26140a);
        uw2.m32078a("configureCodec");
        xz3.f26140a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        uw2.m32079b();
        xz3.f26142c.mo15630f();
        uw2.m32078a("startCodec");
        xz3.f26140a.start();
        uw2.m32079b();
        xz3.f26144e = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static String m33915n(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: N */
    public final void mo17794N(Bundle bundle) {
        this.f26140a.setParameters(bundle);
    }

    /* renamed from: a */
    public final void mo17795a(int i, int i2, int i3, long j, int i4) {
        this.f26142c.mo15627c(i, 0, i3, j, i4);
    }

    /* renamed from: b */
    public final MediaFormat mo17796b() {
        return this.f26141b.mo16447c();
    }

    /* renamed from: c */
    public final void mo17797c(Surface surface) {
        this.f26140a.setOutputSurface(surface);
    }

    /* renamed from: d */
    public final void mo17798d(int i, int i2, g01 g01, long j, int i3) {
        this.f26142c.mo15628d(i, 0, g01, j, 0);
    }

    /* renamed from: e */
    public final void mo17799e(int i) {
        this.f26140a.setVideoScalingMode(i);
    }

    /* renamed from: f */
    public final void mo17800f(int i, boolean z) {
        this.f26140a.releaseOutputBuffer(i, z);
    }

    /* renamed from: g */
    public final void mo17801g() {
        this.f26142c.mo15626b();
        this.f26140a.flush();
        c04 c04 = this.f26141b;
        MediaCodec mediaCodec = this.f26140a;
        mediaCodec.getClass();
        c04.mo16448d(new sz3(mediaCodec));
    }

    /* renamed from: h */
    public final int mo17802h(MediaCodec.BufferInfo bufferInfo) {
        return this.f26141b.mo16446b(bufferInfo);
    }

    /* renamed from: i */
    public final void mo17803i(int i, long j) {
        this.f26140a.releaseOutputBuffer(i, j);
    }

    /* renamed from: j */
    public final void mo17804j() {
        try {
            if (this.f26144e == 1) {
                this.f26142c.mo15629e();
                this.f26141b.mo16451g();
            }
            this.f26144e = 2;
            if (!this.f26143d) {
                this.f26140a.release();
                this.f26143d = true;
            }
        } catch (Throwable th) {
            if (!this.f26143d) {
                this.f26140a.release();
                this.f26143d = true;
            }
            throw th;
        }
    }

    /* renamed from: w */
    public final ByteBuffer mo17805w(int i) {
        return this.f26140a.getOutputBuffer(i);
    }

    /* renamed from: z */
    public final ByteBuffer mo17806z(int i) {
        return this.f26140a.getInputBuffer(i);
    }

    public final int zza() {
        return this.f26141b.mo16445a();
    }

    public final boolean zzr() {
        return false;
    }
}
