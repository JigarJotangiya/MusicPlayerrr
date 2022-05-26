package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c04 extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f14756a = new Object();

    /* renamed from: b */
    private final HandlerThread f14757b;

    /* renamed from: c */
    private Handler f14758c;

    /* renamed from: d */
    private final h04 f14759d;

    /* renamed from: e */
    private final h04 f14760e;

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f14761f;

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f14762g;

    /* renamed from: h */
    private MediaFormat f14763h;

    /* renamed from: i */
    private MediaFormat f14764i;

    /* renamed from: j */
    private MediaCodec.CodecException f14765j;

    /* renamed from: k */
    private long f14766k;

    /* renamed from: l */
    private boolean f14767l;

    /* renamed from: m */
    private IllegalStateException f14768m;

    c04(HandlerThread handlerThread) {
        this.f14757b = handlerThread;
        this.f14759d = new h04();
        this.f14760e = new h04();
        this.f14761f = new ArrayDeque<>();
        this.f14762g = new ArrayDeque<>();
    }

    /* renamed from: h */
    private final void m21625h(MediaFormat mediaFormat) {
        this.f14760e.mo18056b(-2);
        this.f14762g.add(mediaFormat);
    }

    /* renamed from: i */
    private final void m21626i() {
        if (!this.f14762g.isEmpty()) {
            this.f14764i = this.f14762g.getLast();
        }
        this.f14759d.mo18057c();
        this.f14760e.mo18057c();
        this.f14761f.clear();
        this.f14762g.clear();
        this.f14765j = null;
    }

    /* renamed from: j */
    private final void m21627j() {
        IllegalStateException illegalStateException = this.f14768m;
        if (illegalStateException != null) {
            this.f14768m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: k */
    private final void m21628k() {
        MediaCodec.CodecException codecException = this.f14765j;
        if (codecException != null) {
            this.f14765j = null;
            throw codecException;
        }
    }

    /* renamed from: l */
    private final void m21629l(IllegalStateException illegalStateException) {
        synchronized (this.f14756a) {
            this.f14768m = illegalStateException;
        }
    }

    /* renamed from: m */
    private final boolean m21630m() {
        return this.f14766k > 0 || this.f14767l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16445a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14756a
            monitor-enter(r0)
            boolean r1 = r3.m21630m()     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x000c:
            r3.m21627j()     // Catch:{ all -> 0x0023 }
            r3.m21628k()     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.h04 r1 = r3.f14759d     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.mo18058d()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.h04 r1 = r3.f14759d     // Catch:{ all -> 0x0023 }
            int r2 = r1.mo18055a()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c04.mo16445a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16446b(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f14756a
            monitor-enter(r0)
            boolean r1 = r9.m21630m()     // Catch:{ all -> 0x004e }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x000c:
            r9.m21627j()     // Catch:{ all -> 0x004e }
            r9.m21628k()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.h04 r1 = r9.f14760e     // Catch:{ all -> 0x004e }
            boolean r1 = r1.mo18058d()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x001c:
            com.google.android.gms.internal.ads.h04 r1 = r9.f14760e     // Catch:{ all -> 0x004e }
            int r1 = r1.mo18055a()     // Catch:{ all -> 0x004e }
            r2 = -2
            if (r1 < 0) goto L_0x003f
            android.media.MediaFormat r2 = r9.f14763h     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.gs1.m24484b(r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f14761f     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004e }
            int r4 = r2.offset     // Catch:{ all -> 0x004e }
            int r5 = r2.size     // Catch:{ all -> 0x004e }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004e }
            int r8 = r2.flags     // Catch:{ all -> 0x004e }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f14762g     // Catch:{ all -> 0x004e }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004e }
            r9.f14763h = r10     // Catch:{ all -> 0x004e }
            r1 = -2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c04.mo16446b(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: c */
    public final MediaFormat mo16447c() {
        MediaFormat mediaFormat;
        synchronized (this.f14756a) {
            mediaFormat = this.f14763h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: d */
    public final void mo16448d(Runnable runnable) {
        synchronized (this.f14756a) {
            this.f14766k++;
            Handler handler = this.f14758c;
            int i = wy2.f25579a;
            handler.post(new b04(this, runnable));
        }
    }

    /* renamed from: e */
    public final void mo16449e(MediaCodec mediaCodec) {
        gs1.m24488f(this.f14758c == null);
        this.f14757b.start();
        Handler handler = new Handler(this.f14757b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f14758c = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo16450f(Runnable runnable) {
        synchronized (this.f14756a) {
            if (!this.f14767l) {
                long j = this.f14766k - 1;
                this.f14766k = j;
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i <= 0) {
                    if (i < 0) {
                        m21629l(new IllegalStateException());
                    } else {
                        m21626i();
                        try {
                            ((sz3) runnable).f23660g.start();
                        } catch (IllegalStateException e) {
                            m21629l(e);
                        } catch (Exception e2) {
                            m21629l(new IllegalStateException(e2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo16451g() {
        synchronized (this.f14756a) {
            this.f14767l = true;
            this.f14757b.quit();
            m21626i();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f14756a) {
            this.f14765j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f14756a) {
            this.f14759d.mo18056b(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f14756a) {
            MediaFormat mediaFormat = this.f14764i;
            if (mediaFormat != null) {
                m21625h(mediaFormat);
                this.f14764i = null;
            }
            this.f14760e.mo18056b(i);
            this.f14761f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f14756a) {
            m21625h(mediaFormat);
            this.f14764i = null;
        }
    }
}
