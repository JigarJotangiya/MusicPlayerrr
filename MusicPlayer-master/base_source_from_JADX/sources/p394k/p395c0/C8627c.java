package p394k.p395c0;

import p369i.p387z.p389d.C8594l;
import p394k.C8658x;

/* renamed from: k.c0.c */
/* compiled from: SegmentedByteString.kt */
public final class C8627c {
    /* renamed from: a */
    public static final int m46839a(int[] iArr, int i, int i2, int i3) {
        C8594l.m46771e(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m46840b(C8658x xVar, int i) {
        C8594l.m46771e(xVar, "$this$segment");
        int a = m46839a(xVar.getDirectory$okio(), i + 1, 0, xVar.getSegments$okio().length);
        return a >= 0 ? a : ~a;
    }
}
