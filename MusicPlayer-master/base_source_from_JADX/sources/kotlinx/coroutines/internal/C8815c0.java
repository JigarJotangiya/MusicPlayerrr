package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.c0 */
/* compiled from: SystemProps.common.kt */
final /* synthetic */ class C8815c0 {
    /* renamed from: a */
    public static final int m47514a(String str, int i, int i2, int i3) {
        return (int) C8811a0.m47507c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m47515b(String str, long j, long j2, long j3) {
        String d = C8811a0.m47508d(str);
        if (d == null) {
            return j;
        }
        Long h = C8435n.m46514h(d);
        if (h != null) {
            long longValue = h.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m47516c(String str, boolean z) {
        String d = C8811a0.m47508d(str);
        return d == null ? z : Boolean.parseBoolean(d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m47517d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C8811a0.m47506b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m47518e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C8811a0.m47507c(str, j, j4, j3);
    }
}
