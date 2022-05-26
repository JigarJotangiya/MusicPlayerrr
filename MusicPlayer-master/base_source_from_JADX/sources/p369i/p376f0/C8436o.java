package p369i.p376f0;

import p369i.p387z.p389d.C8594l;

/* renamed from: i.f0.o */
/* compiled from: StringsJVM.kt */
class C8436o extends C8435n {
    /* renamed from: j */
    public static int m46516j(String str, String str2, boolean z) {
        C8594l.m46771e(str, "$this$compareTo");
        C8594l.m46771e(str2, "other");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    /* renamed from: k */
    public static final boolean m46517k(String str, String str2, boolean z) {
        C8594l.m46771e(str, "$this$endsWith");
        C8594l.m46771e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m46521o(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m46518l(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m46517k(str, str2, z);
    }

    /* renamed from: m */
    public static boolean m46519m(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m46520n(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            p369i.p387z.p389d.C8594l.m46771e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            i.c0.c r0 = p369i.p376f0.C8437p.m46568x(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            i.u.y r3 = (p369i.p377u.C8495y) r3
            int r3 = r3.mo30365b()
            char r3 = r4.charAt(r3)
            boolean r3 = p369i.p376f0.C8420b.m46473c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p369i.p376f0.C8436o.m46520n(java.lang.CharSequence):boolean");
    }

    /* renamed from: o */
    public static final boolean m46521o(String str, int i, String str2, int i2, int i3, boolean z) {
        C8594l.m46771e(str, "$this$regionMatches");
        C8594l.m46771e(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: p */
    public static final String m46522p(String str, String str2, String str3, boolean z) {
        C8594l.m46771e(str, "$this$replace");
        C8594l.m46771e(str2, "oldValue");
        C8594l.m46771e(str3, "newValue");
        int i = 0;
        int A = C8437p.m46526A(str, str2, 0, z);
        if (A < 0) {
            return str;
        }
        int length = str2.length();
        int a = C8392f.m46450a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i, A);
                sb.append(str3);
                i = A + length;
                if (A >= str.length() || (A = C8437p.m46526A(str, str2, A + a, z)) <= 0) {
                    sb.append(str, i, str.length());
                    String sb2 = sb.toString();
                    C8594l.m46770d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i, A);
                sb.append(str3);
                i = A + length;
                break;
            } while ((A = C8437p.m46526A(str, str2, A + a, z)) <= 0);
            sb.append(str, i, str.length());
            String sb22 = sb.toString();
            C8594l.m46770d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: q */
    public static /* synthetic */ String m46523q(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m46522p(str, str2, str3, z);
    }

    /* renamed from: r */
    public static final boolean m46524r(String str, String str2, boolean z) {
        C8594l.m46771e(str, "$this$startsWith");
        C8594l.m46771e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m46521o(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m46525s(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m46524r(str, str2, z);
    }
}
