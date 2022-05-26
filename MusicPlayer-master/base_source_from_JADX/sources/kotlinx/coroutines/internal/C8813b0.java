package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.b0 */
/* compiled from: SystemProps.kt */
final /* synthetic */ class C8813b0 {

    /* renamed from: a */
    private static final int f35204a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m47512a() {
        return f35204a;
    }

    /* renamed from: b */
    public static final String m47513b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
