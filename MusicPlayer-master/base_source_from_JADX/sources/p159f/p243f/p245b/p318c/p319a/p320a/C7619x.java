package p159f.p243f.p245b.p318c.p319a.p320a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: f.f.b.c.a.a.x */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7619x extends C7618w {

    /* renamed from: g */
    private final C7618w f32977g;

    /* renamed from: h */
    private final long f32978h;

    /* renamed from: i */
    private final long f32979i;

    public C7619x(C7618w wVar, long j, long j2) {
        this.f32977g = wVar;
        long x = m42427x(j);
        this.f32978h = x;
        this.f32979i = m42427x(x + j2);
    }

    /* renamed from: x */
    private final long m42427x(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f32977g.mo25294c() ? this.f32977g.mo25294c() : j;
    }

    /* renamed from: c */
    public final long mo25294c() {
        return this.f32979i - this.f32978h;
    }

    public final void close() throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final InputStream mo25296d(long j, long j2) throws IOException {
        long x = m42427x(this.f32978h);
        return this.f32977g.mo25296d(x, m42427x(j2 + x) - x);
    }
}
