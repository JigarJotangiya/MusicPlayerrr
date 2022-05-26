package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5738xb {

    /* renamed from: a */
    static ca3 f25741a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m33633a(com.google.android.gms.internal.ads.C5701wb r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            com.google.android.gms.internal.ads.ca3 r0 = f25741a
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.ads.iz<java.lang.String> r0 = com.google.android.gms.internal.ads.C5503qz.f22369L1
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r2.mo20153b(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0035
        L_0x001b:
            r0 = 0
            if (r6 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.String r3 = "PDJGtr7hH5z8kziZtOwKBHfUklGaxsnuMOcaf4/XJNQXH5uqgOnO+ZxxlrN1G5R2"
            java.lang.String r4 = "8jFByxLLStK1ZA6Q/SQPKITUmXlRJfaQf0bJ+6rt27M="
            java.lang.reflect.Method r6 = r6.mo21785j(r3, r4)
            if (r6 != 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r6 = r6.invoke(r0, r3)
            java.lang.String r6 = (java.lang.String) r6
            r0 = r6
        L_0x0033:
            if (r0 == 0) goto L_0x0117
        L_0x0035:
            byte[] r6 = com.google.android.gms.internal.ads.C5144h9.m24732b(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0117 }
            com.google.android.gms.internal.ads.na3 r6 = com.google.android.gms.internal.ads.ra3.m30023a(r6)     // Catch:{  }
            com.google.android.gms.internal.ads.vi3 r0 = com.google.android.gms.internal.ads.ed3.f15932a     // Catch:{  }
            java.util.List r0 = r0.mo21511F()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0047:
            boolean r3 = r0.hasNext()     // Catch:{  }
            if (r3 == 0) goto L_0x010e
            java.lang.Object r3 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.uh3 r3 = (com.google.android.gms.internal.ads.uh3) r3     // Catch:{  }
            java.lang.String r4 = r3.mo21269H()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x0106
            java.lang.String r4 = r3.mo21268G()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00fe
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00f6
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkMac"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkHybridDecrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkHybridEncrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeySign"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeyVerify"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkStreamingAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            java.lang.String r5 = "TinkDeterministicAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo21267F()     // Catch:{  }
            com.google.android.gms.internal.ads.y93 r4 = com.google.android.gms.internal.ads.fb3.m23598a(r4)     // Catch:{  }
            com.google.android.gms.internal.ads.wa3 r5 = r4.zza()     // Catch:{  }
            com.google.android.gms.internal.ads.fb3.m23611n(r5)     // Catch:{  }
            r3.mo21269H()     // Catch:{  }
            r3.mo21268G()     // Catch:{  }
            r3.mo21266D()     // Catch:{  }
            com.google.android.gms.internal.ads.ea3 r4 = r4.mo22184a()     // Catch:{  }
            boolean r3 = r3.mo21270I()     // Catch:{  }
            com.google.android.gms.internal.ads.fb3.m23609l(r4, r3)     // Catch:{  }
            goto L_0x0047
        L_0x00f6:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x00fe:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x0106:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x010e:
            com.google.android.gms.internal.ads.ca3 r6 = com.google.android.gms.internal.ads.id3.m25159a(r6)     // Catch:{  }
            f25741a = r6     // Catch:{  }
            if (r6 == 0) goto L_0x0117
            return r1
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5738xb.m33633a(com.google.android.gms.internal.ads.wb):boolean");
    }
}
