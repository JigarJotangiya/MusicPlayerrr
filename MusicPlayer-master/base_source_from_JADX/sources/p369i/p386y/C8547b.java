package p369i.p386y;

import java.io.Closeable;

/* renamed from: i.y.b */
/* compiled from: Closeable.kt */
public final class C8547b {
    /* renamed from: a */
    public static final void m46749a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C8375b.m46425a(th, th2);
            }
        }
    }
}
