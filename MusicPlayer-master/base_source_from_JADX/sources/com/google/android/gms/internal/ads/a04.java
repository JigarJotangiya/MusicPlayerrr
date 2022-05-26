package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a04 {

    /* renamed from: g */
    private static final ArrayDeque<zz3> f13708g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f13709h = new Object();

    /* renamed from: a */
    private final MediaCodec f13710a;

    /* renamed from: b */
    private final HandlerThread f13711b;

    /* renamed from: c */
    private Handler f13712c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f13713d = new AtomicReference<>();

    /* renamed from: e */
    private final kv1 f13714e;

    /* renamed from: f */
    private boolean f13715f;

    public a04(MediaCodec mediaCodec, HandlerThread handlerThread) {
        kv1 kv1 = new kv1(ht1.f17758a);
        this.f13710a = mediaCodec;
        this.f13711b = handlerThread;
        this.f13714e = kv1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.gms.internal.ads.zz3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.android.gms.internal.ads.zz3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m20536a(com.google.android.gms.internal.ads.a04 r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0046
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f13713d
            r9.set(r0)
            goto L_0x0062
        L_0x001c:
            com.google.android.gms.internal.ads.kv1 r9 = r9.f13714e
            r9.mo19017e()
            goto L_0x0062
        L_0x0022:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.gms.internal.ads.zz3 r1 = (com.google.android.gms.internal.ads.zz3) r1
            int r3 = r1.f27090a
            int r10 = r1.f27091b
            android.media.MediaCodec$CryptoInfo r5 = r1.f27093d
            long r6 = r1.f27094e
            int r8 = r1.f27095f
            java.lang.Object r10 = f13709h     // Catch:{ RuntimeException -> 0x003f }
            monitor-enter(r10)     // Catch:{ RuntimeException -> 0x003f }
            android.media.MediaCodec r2 = r9.f13710a     // Catch:{ all -> 0x003c }
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x003c }
            monitor-exit(r10)     // Catch:{ all -> 0x003c }
            goto L_0x0062
        L_0x003c:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ RuntimeException -> 0x003f }
        L_0x003f:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f13713d
            r9.set(r10)
            goto L_0x0062
        L_0x0046:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.gms.internal.ads.zz3 r1 = (com.google.android.gms.internal.ads.zz3) r1
            int r3 = r1.f27090a
            int r10 = r1.f27091b
            int r5 = r1.f27092c
            long r6 = r1.f27094e
            int r8 = r1.f27095f
            android.media.MediaCodec r2 = r9.f13710a     // Catch:{ RuntimeException -> 0x005c }
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f13713d
            r9.set(r10)
        L_0x0062:
            if (r1 == 0) goto L_0x006f
            java.util.ArrayDeque<com.google.android.gms.internal.ads.zz3> r9 = f13708g
            monitor-enter(r9)
            r9.add(r1)     // Catch:{ all -> 0x006c }
            monitor-exit(r9)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x006c }
            throw r10
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a04.m20536a(com.google.android.gms.internal.ads.a04, android.os.Message):void");
    }

    /* renamed from: g */
    private static zz3 m20537g() {
        ArrayDeque<zz3> arrayDeque = f13708g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                zz3 zz3 = new zz3();
                return zz3;
            }
            zz3 removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    /* renamed from: h */
    private final void m20538h() {
        RuntimeException andSet = this.f13713d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: i */
    private static byte[] m20539i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: j */
    private static int[] m20540j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: b */
    public final void mo15626b() {
        if (this.f13715f) {
            try {
                Handler handler = this.f13712c;
                int i = wy2.f25579a;
                handler.removeCallbacksAndMessages((Object) null);
                this.f13714e.mo19015c();
                this.f13712c.obtainMessage(2).sendToTarget();
                this.f13714e.mo19013a();
                m20538h();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo15627c(int i, int i2, int i3, long j, int i4) {
        m20538h();
        zz3 g = m20537g();
        g.mo22451a(i, 0, i3, j, i4);
        Handler handler = this.f13712c;
        int i5 = wy2.f25579a;
        handler.obtainMessage(0, g).sendToTarget();
    }

    /* renamed from: d */
    public final void mo15628d(int i, int i2, g01 g01, long j, int i3) {
        m20538h();
        zz3 g = m20537g();
        g.mo22451a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g.f27093d;
        cryptoInfo.numSubSamples = g01.f16842f;
        cryptoInfo.numBytesOfClearData = m20540j(g01.f16840d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m20540j(g01.f16841e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i4 = m20539i(g01.f16838b, cryptoInfo.key);
        Objects.requireNonNull(i4);
        cryptoInfo.key = i4;
        byte[] i5 = m20539i(g01.f16837a, cryptoInfo.iv);
        Objects.requireNonNull(i5);
        cryptoInfo.iv = i5;
        cryptoInfo.mode = g01.f16839c;
        if (wy2.f25579a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(g01.f16843g, g01.f16844h));
        }
        this.f13712c.obtainMessage(1, g).sendToTarget();
    }

    /* renamed from: e */
    public final void mo15629e() {
        if (this.f13715f) {
            mo15626b();
            this.f13711b.quit();
        }
        this.f13715f = false;
    }

    /* renamed from: f */
    public final void mo15630f() {
        if (!this.f13715f) {
            this.f13711b.start();
            this.f13712c = new yz3(this, this.f13711b.getLooper());
            this.f13715f = true;
        }
    }
}
