package com.bumptech.glide.load.p036p.p037d;

import com.bumptech.glide.load.p030n.p031a0.C1802b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.d.w */
/* compiled from: RecyclableBufferedInputStream */
public class C2049w extends FilterInputStream {

    /* renamed from: g */
    private volatile byte[] f7083g;

    /* renamed from: h */
    private int f7084h;

    /* renamed from: i */
    private int f7085i;

    /* renamed from: j */
    private int f7086j;

    /* renamed from: k */
    private int f7087k;

    /* renamed from: l */
    private final C1802b f7088l;

    /* renamed from: com.bumptech.glide.load.p.d.w$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C2050a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C2050a(String str) {
            super(str);
        }
    }

    public C2049w(InputStream inputStream, C1802b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: c */
    private int m9623c(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f7086j;
        if (i2 == -1 || this.f7087k - i2 >= (i = this.f7085i)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f7086j = -1;
                this.f7087k = 0;
                this.f7084h = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f7084h == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f7088l.mo7771e(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f7083g = bArr2;
            this.f7088l.mo7770d(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f7087k - this.f7086j;
        this.f7087k = i3;
        this.f7086j = 0;
        this.f7084h = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f7087k;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f7084h = i4;
        return read2;
    }

    /* renamed from: x */
    private static IOException m9624x() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f7083g == null || inputStream == null) {
            m9624x();
            throw null;
        }
        return (this.f7084h - this.f7087k) + inputStream.available();
    }

    public void close() throws IOException {
        if (this.f7083g != null) {
            this.f7088l.mo7770d(this.f7083g);
            this.f7083g = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: d */
    public synchronized void mo8146d() {
        this.f7085i = this.f7083g.length;
    }

    public synchronized void mark(int i) {
        this.f7085i = Math.max(this.f7085i, i);
        this.f7086j = this.f7087k;
    }

    public boolean markSupported() {
        return true;
    }

    /* renamed from: p */
    public synchronized void mo8149p() {
        if (this.f7083g != null) {
            this.f7088l.mo7770d(this.f7083g);
            this.f7083g = null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x0039=Splitter:B:28:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f7083g     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f7087k     // Catch:{ all -> 0x003d }
            int r4 = r6.f7084h     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.m9623c(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f7083g     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f7083g     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m9624x()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x0026:
            int r1 = r6.f7084h     // Catch:{ all -> 0x003d }
            int r2 = r6.f7087k     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f7087k = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            m9624x()     // Catch:{ all -> 0x003d }
            throw r2
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p036p.p037d.C2049w.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f7083g != null) {
            int i = this.f7086j;
            if (-1 != i) {
                this.f7087k = i;
            } else {
                throw new C2050a("Mark has been invalidated, pos: " + this.f7087k + " markLimit: " + this.f7085i);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f7083g;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f7084h;
                int i2 = this.f7087k;
                if (((long) (i - i2)) >= j) {
                    this.f7087k = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f7087k = i;
                if (this.f7086j == -1 || j > ((long) this.f7085i)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f7086j = -1;
                    }
                    return j2 + skip;
                } else if (m9623c(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f7084h;
                    int i4 = this.f7087k;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f7087k = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f7087k = i3;
                    return j3;
                }
            } else {
                m9624x();
                throw null;
            }
        } else {
            m9624x();
            throw null;
        }
    }

    C2049w(InputStream inputStream, C1802b bVar, int i) {
        super(inputStream);
        this.f7086j = -1;
        this.f7088l = bVar;
        this.f7083g = (byte[]) bVar.mo7771e(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.f7083g     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x000b
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x000b:
            java.io.InputStream r2 = r7.in     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0086
            int r3 = r7.f7087k     // Catch:{ all -> 0x008e }
            int r4 = r7.f7084h     // Catch:{ all -> 0x008e }
            if (r3 >= r4) goto L_0x0033
            int r5 = r4 - r3
            if (r5 < r10) goto L_0x001b
            r4 = r10
            goto L_0x001c
        L_0x001b:
            int r4 = r4 - r3
        L_0x001c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r3 = r7.f7087k     // Catch:{ all -> 0x008e }
            int r3 = r3 + r4
            r7.f7087k = r3     // Catch:{ all -> 0x008e }
            if (r4 == r10) goto L_0x0031
            int r3 = r2.available()     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L_0x0034
        L_0x0031:
            monitor-exit(r7)
            return r4
        L_0x0033:
            r3 = r10
        L_0x0034:
            int r4 = r7.f7086j     // Catch:{ all -> 0x008e }
            r5 = -1
            if (r4 != r5) goto L_0x0049
            int r4 = r0.length     // Catch:{ all -> 0x008e }
            if (r3 < r4) goto L_0x0049
            int r4 = r2.read(r8, r9, r3)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0076
            if (r3 != r10) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            int r5 = r10 - r3
        L_0x0047:
            monitor-exit(r7)
            return r5
        L_0x0049:
            int r4 = r7.m9623c(r2, r0)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0056
            if (r3 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r5 = r10 - r3
        L_0x0054:
            monitor-exit(r7)
            return r5
        L_0x0056:
            byte[] r4 = r7.f7083g     // Catch:{ all -> 0x008e }
            if (r0 == r4) goto L_0x0063
            byte[] r0 = r7.f7083g     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            m9624x()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x0063:
            int r4 = r7.f7084h     // Catch:{ all -> 0x008e }
            int r5 = r7.f7087k     // Catch:{ all -> 0x008e }
            int r6 = r4 - r5
            if (r6 < r3) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            int r4 = r4 - r5
        L_0x006e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r5 = r7.f7087k     // Catch:{ all -> 0x008e }
            int r5 = r5 + r4
            r7.f7087k = r5     // Catch:{ all -> 0x008e }
        L_0x0076:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x007b
            monitor-exit(r7)
            return r10
        L_0x007b:
            int r5 = r2.available()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0084
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L_0x0084:
            int r9 = r9 + r4
            goto L_0x0034
        L_0x0086:
            m9624x()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008a:
            m9624x()     // Catch:{ all -> 0x008e }
            throw r1
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p036p.p037d.C2049w.read(byte[], int, int):int");
    }
}
