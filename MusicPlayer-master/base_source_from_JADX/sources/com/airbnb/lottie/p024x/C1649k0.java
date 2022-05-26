package com.airbnb.lottie.p024x;

import com.airbnb.lottie.p024x.p025n0.C1657c;

/* renamed from: com.airbnb.lottie.x.k0 */
/* compiled from: ShapeStrokeParser */
class C1649k0 {

    /* renamed from: a */
    private static C1657c.C1658a f6260a = C1657c.C1658a.m8335a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C1657c.C1658a f6261b = C1657c.C1658a.m8335a("n", "v");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.p019v.p021k.C1598q m8309a(com.airbnb.lottie.p024x.p025n0.C1657c r18, com.airbnb.lottie.C1464d r19) throws java.io.IOException {
        /*
            r0 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0012:
            boolean r13 = r18.mo7427H()
            if (r13 == 0) goto L_0x00fc
            com.airbnb.lottie.x.n0.c$a r13 = f6260a
            int r13 = r0.mo7439v0(r13)
            r14 = 1
            switch(r13) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00ad;
                case 8: goto L_0x0028;
                default: goto L_0x0022;
            }
        L_0x0022:
            r2 = r19
            r18.mo7425A0()
            goto L_0x0012
        L_0x0028:
            r18.mo7433d()
        L_0x002b:
            boolean r13 = r18.mo7427H()
            if (r13 == 0) goto L_0x0099
            r18.mo7438p()
            r13 = 0
            r15 = 0
        L_0x0036:
            boolean r16 = r18.mo7427H()
            if (r16 == 0) goto L_0x0057
            com.airbnb.lottie.x.n0.c$a r2 = f6261b
            int r2 = r0.mo7439v0(r2)
            if (r2 == 0) goto L_0x0052
            if (r2 == r14) goto L_0x004d
            r18.mo7441z0()
            r18.mo7425A0()
            goto L_0x0036
        L_0x004d:
            com.airbnb.lottie.v.j.b r15 = com.airbnb.lottie.p024x.C1634d.m8278e(r18, r19)
            goto L_0x0036
        L_0x0052:
            java.lang.String r13 = r18.mo7435i0()
            goto L_0x0036
        L_0x0057:
            r18.mo7426E()
            r13.hashCode()
            int r17 = r13.hashCode()
            switch(r17) {
                case 100: goto L_0x007c;
                case 103: goto L_0x0071;
                case 111: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            r2 = -1
            goto L_0x0086
        L_0x0066:
            java.lang.String r2 = "o"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x006f
            goto L_0x0064
        L_0x006f:
            r2 = 2
            goto L_0x0086
        L_0x0071:
            java.lang.String r2 = "g"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x007a
            goto L_0x0064
        L_0x007a:
            r2 = 1
            goto L_0x0086
        L_0x007c:
            java.lang.String r2 = "d"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0085
            goto L_0x0064
        L_0x0085:
            r2 = 0
        L_0x0086:
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0090;
                case 2: goto L_0x008c;
                default: goto L_0x0089;
            }
        L_0x0089:
            r2 = r19
            goto L_0x002b
        L_0x008c:
            r2 = r19
            r5 = r15
            goto L_0x002b
        L_0x0090:
            r2 = r19
            r2.mo7023u(r14)
            r3.add(r15)
            goto L_0x002b
        L_0x0099:
            r2 = r19
            r18.mo7440x()
            int r13 = r3.size()
            if (r13 != r14) goto L_0x0012
            java.lang.Object r13 = r3.get(r1)
            r3.add(r13)
            goto L_0x0012
        L_0x00ad:
            r2 = r19
            boolean r11 = r18.mo7429K()
            goto L_0x0012
        L_0x00b5:
            r2 = r19
            double r13 = r18.mo7430Q()
            float r10 = (float) r13
            goto L_0x0012
        L_0x00be:
            r2 = r19
            com.airbnb.lottie.v.k.q$c[] r9 = com.airbnb.lottie.p019v.p021k.C1598q.C1601c.values()
            int r13 = r18.mo7431T()
            int r13 = r13 - r14
            r9 = r9[r13]
            goto L_0x0012
        L_0x00cd:
            r2 = r19
            com.airbnb.lottie.v.k.q$b[] r8 = com.airbnb.lottie.p019v.p021k.C1598q.C1600b.values()
            int r13 = r18.mo7431T()
            int r13 = r13 - r14
            r8 = r8[r13]
            goto L_0x0012
        L_0x00dc:
            r2 = r19
            com.airbnb.lottie.v.j.d r12 = com.airbnb.lottie.p024x.C1634d.m8281h(r18, r19)
            goto L_0x0012
        L_0x00e4:
            r2 = r19
            com.airbnb.lottie.v.j.b r7 = com.airbnb.lottie.p024x.C1634d.m8278e(r18, r19)
            goto L_0x0012
        L_0x00ec:
            r2 = r19
            com.airbnb.lottie.v.j.a r6 = com.airbnb.lottie.p024x.C1634d.m8276c(r18, r19)
            goto L_0x0012
        L_0x00f4:
            r2 = r19
            java.lang.String r4 = r18.mo7435i0()
            goto L_0x0012
        L_0x00fc:
            if (r12 != 0) goto L_0x0113
            com.airbnb.lottie.v.j.d r0 = new com.airbnb.lottie.v.j.d
            com.airbnb.lottie.z.a r1 = new com.airbnb.lottie.z.a
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            r12 = r0
        L_0x0113:
            com.airbnb.lottie.v.k.q r13 = new com.airbnb.lottie.v.k.q
            r0 = r13
            r1 = r4
            r2 = r5
            r4 = r6
            r5 = r12
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p024x.C1649k0.m8309a(com.airbnb.lottie.x.n0.c, com.airbnb.lottie.d):com.airbnb.lottie.v.k.q");
    }
}
