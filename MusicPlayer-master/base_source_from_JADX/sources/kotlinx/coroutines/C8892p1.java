package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.p1 */
/* compiled from: Exceptions.kt */
public final class C8892p1 {
    /* renamed from: a */
    public static final CancellationException m47753a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
