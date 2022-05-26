package p369i.p376f0;

import p369i.p373c0.C8388c;

/* renamed from: i.f0.b */
/* compiled from: CharJVM.kt */
class C8420b {
    /* renamed from: a */
    public static int m46471a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C8388c(2, 36));
    }

    /* renamed from: b */
    public static final int m46472b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m46473c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
