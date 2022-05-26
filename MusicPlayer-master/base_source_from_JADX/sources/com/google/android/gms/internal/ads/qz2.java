package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.C3364i;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qz2 {

    /* renamed from: a */
    private final File f22684a;

    /* renamed from: b */
    final File f22685b;

    /* renamed from: c */
    private final SharedPreferences f22686c;

    /* renamed from: d */
    private final int f22687d;

    public qz2(Context context, int i) {
        this.f22686c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        rz2.m30471a(dir, false);
        this.f22684a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        rz2.m30471a(dir2, true);
        this.f22685b = dir2;
        this.f22687d = i;
    }

    /* renamed from: a */
    static String m29793a(C5407od odVar) {
        return C3364i.m14460a(odVar.mo21560b().zzE());
    }

    /* renamed from: e */
    private final File m29794e() {
        File file = new File(this.f22684a, Integer.toString(this.f22687d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: f */
    private final String m29795f() {
        int i = this.f22687d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* renamed from: g */
    private final String m29796g() {
        int i = this.f22687d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20540b(com.google.android.gms.internal.ads.C5296ld r8, com.google.android.gms.internal.ads.vz2 r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.od r0 = r8.mo19141F()
            java.lang.String r0 = r0.mo19963M()
            com.google.android.gms.internal.ads.kl3 r1 = r8.mo19143H()
            byte[] r1 = r1.zzE()
            com.google.android.gms.internal.ads.kl3 r2 = r8.mo19142G()
            byte[] r2 = r2.zzE()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x017d
        L_0x0026:
            java.io.File r3 = r7.f22685b
            com.google.android.gms.internal.ads.rz2.m30474d(r3)
            java.io.File r3 = r7.f22685b
            r3.mkdirs()
            java.io.File r3 = r7.f22685b
            java.io.File r3 = com.google.android.gms.internal.ads.rz2.m30473c(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.f22685b
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.rz2.m30472b(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.rz2.m30475e(r3, r1)
            if (r1 == 0) goto L_0x017d
        L_0x004c:
            java.io.File r1 = r7.f22685b
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.rz2.m30472b(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.rz2.m30475e(r0, r2)
            if (r0 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.od r0 = r8.mo19141F()
            java.lang.String r0 = r0.mo19963M()
            java.io.File r1 = r7.f22685b
            java.io.File r0 = com.google.android.gms.internal.ads.rz2.m30472b(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.mo19933a(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.od r9 = r8.mo19141F()
            java.lang.String r9 = r9.mo19963M()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = 0
            goto L_0x0137
        L_0x008a:
            java.io.File r0 = r7.f22685b
            java.io.File r0 = com.google.android.gms.internal.ads.rz2.m30472b(r9, r5, r0)
            java.io.File r2 = r7.f22685b
            java.io.File r2 = com.google.android.gms.internal.ads.rz2.m30472b(r9, r3, r2)
            java.io.File r6 = r7.m29794e()
            java.io.File r5 = com.google.android.gms.internal.ads.rz2.m30472b(r9, r5, r6)
            java.io.File r6 = r7.m29794e()
            java.io.File r9 = com.google.android.gms.internal.ads.rz2.m30472b(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.nd r9 = com.google.android.gms.internal.ads.C5407od.m28425G()
            com.google.android.gms.internal.ads.od r0 = r8.mo19141F()
            java.lang.String r0 = r0.mo19963M()
            r9.mo19706v(r0)
            com.google.android.gms.internal.ads.od r0 = r8.mo19141F()
            java.lang.String r0 = r0.mo19962L()
            r9.mo19702r(r0)
            com.google.android.gms.internal.ads.od r0 = r8.mo19141F()
            long r2 = r0.mo19959D()
            r9.mo19703s(r2)
            com.google.android.gms.internal.ads.od r0 = r8.mo19141F()
            long r2 = r0.mo19961F()
            r9.mo19705u(r2)
            com.google.android.gms.internal.ads.od r8 = r8.mo19141F()
            long r2 = r8.mo19960E()
            r9.mo19704t(r2)
            com.google.android.gms.internal.ads.qm3 r8 = r9.mo19761n()
            com.google.android.gms.internal.ads.od r8 = (com.google.android.gms.internal.ads.C5407od) r8
            com.google.android.gms.internal.ads.od r9 = r7.mo20541c(r1)
            android.content.SharedPreferences r0 = r7.f22686c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0125
            java.lang.String r2 = r8.mo19963M()
            java.lang.String r3 = r9.mo19963M()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r7.m29795f()
            java.lang.String r9 = m29793a(r9)
            r0.putString(r2, r9)
        L_0x0125:
            java.lang.String r9 = r7.m29796g()
            java.lang.String r8 = m29793a(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = 1
        L_0x0137:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.od r0 = r7.mo20541c(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = r0.mo19963M()
            r9.add(r0)
        L_0x0149:
            r0 = 2
            com.google.android.gms.internal.ads.od r0 = r7.mo20541c(r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.mo19963M()
            r9.add(r0)
        L_0x0157:
            java.io.File r0 = r7.m29794e()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0160:
            if (r4 >= r1) goto L_0x017c
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0179
            java.io.File r3 = r7.m29794e()
            java.io.File r2 = com.google.android.gms.internal.ads.rz2.m30473c(r2, r3)
            com.google.android.gms.internal.ads.rz2.m30474d(r2)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x017c:
            return r8
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qz2.mo20540b(com.google.android.gms.internal.ads.ld, com.google.android.gms.internal.ads.vz2):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C5407od mo20541c(int i) {
        String str;
        if (i == 1) {
            str = this.f22686c.getString(m29796g(), (String) null);
        } else {
            str = this.f22686c.getString(m29795f(), (String) null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C5407od J = C5407od.m28428J(kl3.zzv(C3364i.m14461b(str)));
            String M = J.mo19963M();
            File b = rz2.m30472b(M, "pcam.jar", m29794e());
            if (!b.exists()) {
                b = rz2.m30472b(M, "pcam", m29794e());
            }
            File b2 = rz2.m30472b(M, "pcbc", m29794e());
            if (!b.exists() || !b2.exists()) {
                return null;
            }
            return J;
        } catch (bn3 unused) {
        }
    }

    /* renamed from: d */
    public final pz2 mo20542d(int i) {
        C5407od c = mo20541c(1);
        if (c == null) {
            return null;
        }
        String M = c.mo19963M();
        File b = rz2.m30472b(M, "pcam.jar", m29794e());
        if (!b.exists()) {
            b = rz2.m30472b(M, "pcam", m29794e());
        }
        return new pz2(c, b, rz2.m30472b(M, "pcbc", m29794e()), rz2.m30472b(M, "pcopt", m29794e()));
    }
}
