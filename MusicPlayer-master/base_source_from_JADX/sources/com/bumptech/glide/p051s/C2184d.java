package com.bumptech.glide.p051s;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.s.d */
/* compiled from: ExceptionPassthroughInputStream */
public final class C2184d extends InputStream {

    /* renamed from: i */
    private static final Queue<C2184d> f7424i = C2194k.m10276f(0);

    /* renamed from: g */
    private InputStream f7425g;

    /* renamed from: h */
    private IOException f7426h;

    C2184d() {
    }

    /* renamed from: d */
    public static C2184d m10246d(InputStream inputStream) {
        C2184d poll;
        Queue<C2184d> queue = f7424i;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C2184d();
        }
        poll.mo8490x(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f7425g.available();
    }

    /* renamed from: c */
    public IOException mo8480c() {
        return this.f7426h;
    }

    public void close() throws IOException {
        this.f7425g.close();
    }

    public void mark(int i) {
        this.f7425g.mark(i);
    }

    public boolean markSupported() {
        return this.f7425g.markSupported();
    }

    /* renamed from: p */
    public void mo8484p() {
        this.f7426h = null;
        this.f7425g = null;
        Queue<C2184d> queue = f7424i;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public int read() throws IOException {
        try {
            return this.f7425g.read();
        } catch (IOException e) {
            this.f7426h = e;
            throw e;
        }
    }

    public synchronized void reset() throws IOException {
        this.f7425g.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f7425g.skip(j);
        } catch (IOException e) {
            this.f7426h = e;
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo8490x(InputStream inputStream) {
        this.f7425g = inputStream;
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f7425g.read(bArr);
        } catch (IOException e) {
            this.f7426h = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f7425g.read(bArr, i, i2);
        } catch (IOException e) {
            this.f7426h = e;
            throw e;
        }
    }
}
