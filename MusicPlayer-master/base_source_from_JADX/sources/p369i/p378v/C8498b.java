package p369i.p378v;

/* renamed from: i.v.b */
/* compiled from: Comparisons.kt */
class C8498b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m46698a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
