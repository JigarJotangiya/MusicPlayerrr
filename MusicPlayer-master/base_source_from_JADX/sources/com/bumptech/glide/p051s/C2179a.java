package com.bumptech.glide.p051s;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.s.a */
/* compiled from: ByteBufferUtil */
public final class C2179a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f7415a = new AtomicReference<>();

    /* renamed from: com.bumptech.glide.s.a$b */
    /* compiled from: ByteBufferUtil */
    static final class C2181b {

        /* renamed from: a */
        final int f7418a;

        /* renamed from: b */
        final int f7419b;

        /* renamed from: c */
        final byte[] f7420c;

        C2181b(byte[] bArr, int i, int i2) {
            this.f7420c = bArr;
            this.f7418a = i;
            this.f7419b = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|(2:10|11)|12|13|14) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049 A[SYNTHETIC, Splitter:B:25:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC, Splitter:B:29:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m10235a(java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0045 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x003d
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0045 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r8
        L_0x0033:
            r8 = move-exception
            goto L_0x0047
        L_0x0035:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x003d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r8 = move-exception
            r7 = r0
        L_0x0047:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r7 == 0) goto L_0x0053
            r7.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p051s.C2179a.m10235a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: b */
    public static ByteBuffer m10236b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f7415a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f7415a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    /* renamed from: c */
    private static C2181b m10237c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C2181b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: d */
    public static byte[] m10238d(ByteBuffer byteBuffer) {
        C2181b c = m10237c(byteBuffer);
        if (c != null && c.f7418a == 0 && c.f7419b == c.f7420c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10239e(java.nio.ByteBuffer r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0027 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r1.force(r0)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r2 = r1
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p051s.C2179a.m10239e(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: f */
    public static InputStream m10240f(ByteBuffer byteBuffer) {
        return new C2180a(byteBuffer);
    }

    /* renamed from: com.bumptech.glide.s.a$a */
    /* compiled from: ByteBufferUtil */
    private static class C2180a extends InputStream {

        /* renamed from: g */
        private final ByteBuffer f7416g;

        /* renamed from: h */
        private int f7417h = -1;

        C2180a(ByteBuffer byteBuffer) {
            this.f7416g = byteBuffer;
        }

        public int available() {
            return this.f7416g.remaining();
        }

        public synchronized void mark(int i) {
            this.f7417h = this.f7416g.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f7416g.hasRemaining()) {
                return -1;
            }
            return this.f7416g.get() & 255;
        }

        public synchronized void reset() throws IOException {
            int i = this.f7417h;
            if (i != -1) {
                this.f7416g.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) throws IOException {
            if (!this.f7416g.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f7416g;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f7416g.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f7416g.get(bArr, i, min);
            return min;
        }
    }
}
