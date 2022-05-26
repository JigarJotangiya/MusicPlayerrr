package p369i.p376f0;

/* renamed from: i.f0.c */
/* compiled from: Char.kt */
class C8421c extends C8420b {
    /* renamed from: d */
    public static final boolean m46474d(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }
}
