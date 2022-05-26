package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8859z;

/* renamed from: kotlinx.coroutines.j2 */
/* compiled from: JobSupport.kt */
public final class C8863j2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C8859z f35259a = new C8859z("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C8859z f35260b = new C8859z("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C8859z f35261c = new C8859z("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C8859z f35262d = new C8859z("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8859z f35263e = new C8859z("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8862j1 f35264f = new C8862j1(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8862j1 f35265g = new C8862j1(true);

    /* renamed from: g */
    public static final Object m47670g(Object obj) {
        return obj instanceof C8920v1 ? new C8924w1((C8920v1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m47671h(Object obj) {
        C8924w1 w1Var = obj instanceof C8924w1 ? (C8924w1) obj : null;
        return w1Var == null ? obj : w1Var.f35310a;
    }
}
