package p342g.p343a.p344a.p358i;

/* renamed from: g.a.a.i.g */
/* compiled from: FastUtils */
public class C8315g {

    /* renamed from: a */
    private static long f34739a;

    /* renamed from: a */
    public static synchronized boolean m45979a() {
        boolean z;
        synchronized (C8315g.class) {
            long currentTimeMillis = System.currentTimeMillis();
            z = currentTimeMillis - f34739a <= 500;
            f34739a = currentTimeMillis;
        }
        return z;
    }
}
