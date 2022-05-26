package p159f.p243f.p245b.p318c.p319a.p320a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f.f.b.c.a.a.w */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7618w implements Closeable {
    /* renamed from: c */
    public abstract long mo25294c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract InputStream mo25296d(long j, long j2) throws IOException;

    /* renamed from: p */
    public final synchronized InputStream mo28610p() throws IOException {
        return mo25296d(0, mo25294c());
    }
}
