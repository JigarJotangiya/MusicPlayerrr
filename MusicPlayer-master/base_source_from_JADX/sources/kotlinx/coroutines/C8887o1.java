package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8859z;

/* renamed from: kotlinx.coroutines.o1 */
/* compiled from: EventLoop.common.kt */
public final class C8887o1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C8859z f35283a = new C8859z("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C8859z f35284b = new C8859z("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m47746c(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
