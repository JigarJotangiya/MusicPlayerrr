package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6349f0 {
    /* renamed from: a */
    public static boolean m37610a(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: b */
    public static boolean m37611b(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: c */
    static boolean m37612c(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i2 != 6 && i2 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m37613d(int i) {
        return i == 5 || i == 6 || i == 4;
    }
}