package p159f.p334h.p337b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p394k.C8637g;

/* renamed from: f.h.b.w */
/* compiled from: ResponseBody */
public abstract class C7845w implements Closeable {
    /* renamed from: c */
    public final InputStream mo29261c() throws IOException {
        return mo29265x().inputStream();
    }

    public void close() throws IOException {
        mo29265x().close();
    }

    /* renamed from: d */
    public abstract long mo29263d() throws IOException;

    /* renamed from: p */
    public abstract C7832q mo29264p();

    /* renamed from: x */
    public abstract C8637g mo29265x() throws IOException;
}
