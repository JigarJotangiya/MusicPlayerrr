package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.z */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3378z {
    /* renamed from: a */
    static int m14486a(int i) {
        int[] iArr = {1, 2, 3, 4, 5};
        int i2 = 0;
        while (i2 < 5) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        return 1;
    }
}
