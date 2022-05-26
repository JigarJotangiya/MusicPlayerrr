package kotlinx.coroutines.p401i3;

import kotlinx.coroutines.internal.C8859z;

/* renamed from: kotlinx.coroutines.i3.d */
/* compiled from: Mutex.kt */
public final class C8809d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C8859z f35196a = new C8859z("UNLOCK_FAIL");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C8859z f35197b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C8859z f35198c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C8800a f35199d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8800a f35200e;

    static {
        C8859z zVar = new C8859z("LOCKED");
        f35197b = zVar;
        C8859z zVar2 = new C8859z("UNLOCKED");
        f35198c = zVar2;
        f35199d = new C8800a(zVar);
        f35200e = new C8800a(zVar2);
    }

    /* renamed from: a */
    public static final C8801b m47494a(boolean z) {
        return new C8802c(z);
    }

    /* renamed from: b */
    public static /* synthetic */ C8801b m47495b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m47494a(z);
    }
}
