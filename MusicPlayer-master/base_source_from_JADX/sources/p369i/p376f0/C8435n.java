package p369i.p376f0;

import com.un4seen.bass.BASS;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.f0.n */
/* compiled from: StringNumberConversions.kt */
class C8435n extends C8434m {
    /* renamed from: f */
    public static Integer m46512f(String str) {
        C8594l.m46771e(str, "$this$toIntOrNull");
        return m46513g(str, 10);
    }

    /* renamed from: g */
    public static final Integer m46513g(String str, int i) {
        boolean z;
        int i2;
        C8594l.m46771e(str, "$this$toIntOrNull");
        int unused = C8420b.m46471a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int g = C8594l.m46773g(charAt, 48);
        int i4 = BASS.BASS_DATA_FFT512;
        int i5 = 1;
        if (g >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int b = C8420b.m46472b(str.charAt(i5), i);
            if (b < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + b) {
                return null;
            }
            i3 = i2 - b;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* renamed from: h */
    public static Long m46514h(String str) {
        C8594l.m46771e(str, "$this$toLongOrNull");
        return m46515i(str, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long m46515i(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "$this$toLongOrNull"
            p369i.p387z.p389d.C8594l.m46771e(r0, r2)
            int unused = p369i.p376f0.C8420b.m46471a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = p369i.p387z.p389d.C8594l.m46773g(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L_0x0039
            if (r2 != r9) goto L_0x002a
            return r3
        L_0x002a:
            r6 = 45
            if (r5 != r6) goto L_0x0032
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x003a
        L_0x0032:
            r6 = 43
            if (r5 != r6) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            return r3
        L_0x0039:
            r9 = 0
        L_0x003a:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L_0x0042:
            if (r4 >= r2) goto L_0x0073
            char r14 = r0.charAt(r4)
            int r14 = p369i.p376f0.C8420b.m46472b(r14, r1)
            if (r14 >= 0) goto L_0x004f
            return r3
        L_0x004f:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x005e
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005f
        L_0x005e:
            return r3
        L_0x005f:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r5 = (long) r14
            long r16 = r7 + r5
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x006a
            return r3
        L_0x006a:
            long r10 = r10 - r5
            int r4 = r4 + 1
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x0042
        L_0x0073:
            if (r9 == 0) goto L_0x007a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x007f
        L_0x007a:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p369i.p376f0.C8435n.m46515i(java.lang.String, int):java.lang.Long");
    }
}
