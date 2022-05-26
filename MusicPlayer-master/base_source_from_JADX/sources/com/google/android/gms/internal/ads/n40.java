package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C3114t;
import com.google.android.gms.ads.formats.C2907b;
import com.google.android.gms.ads.formats.C2913e;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class n40 extends C2913e {

    /* renamed from: a */
    private final m40 f20503a;

    /* renamed from: b */
    private final List<C2907b> f20504b = new ArrayList();

    /* renamed from: c */
    private final r20 f20505c;

    /* renamed from: d */
    private final C3114t f20506d = new C3114t();

    /* renamed from: e */
    private final List<Object> f20507e = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n40(com.google.android.gms.internal.ads.m40 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f20504b = r1
            com.google.android.gms.ads.t r1 = new com.google.android.gms.ads.t
            r1.<init>()
            r5.f20506d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f20507e = r1
            r5.f20503a = r6
            r1 = 0
            java.util.List r6 = r6.mo18814u()     // Catch:{ RemoteException -> 0x005b }
            if (r6 == 0) goto L_0x005f
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005b }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005b }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005b }
            if (r3 == 0) goto L_0x004d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005b }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.q20     // Catch:{ RemoteException -> 0x005b }
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.q20 r3 = (com.google.android.gms.internal.ads.q20) r3     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x0047:
            com.google.android.gms.internal.ads.o20 r3 = new com.google.android.gms.internal.ads.o20     // Catch:{ RemoteException -> 0x005b }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.b> r2 = r5.f20504b     // Catch:{ RemoteException -> 0x005b }
            com.google.android.gms.internal.ads.r20 r4 = new com.google.android.gms.internal.ads.r20     // Catch:{ RemoteException -> 0x005b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005b }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0027
        L_0x005b:
            r6 = move-exception
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r6)
        L_0x005f:
            com.google.android.gms.internal.ads.m40 r6 = r5.f20503a     // Catch:{ RemoteException -> 0x008e }
            java.util.List r6 = r6.mo18813t()     // Catch:{ RemoteException -> 0x008e }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008e }
        L_0x006b:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008e }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008e }
            if (r3 == 0) goto L_0x0080
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.internal.ads.yw r2 = com.google.android.gms.internal.ads.C5759xw.m33857e7(r2)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x006b
            java.util.List<java.lang.Object> r3 = r5.f20507e     // Catch:{ RemoteException -> 0x008e }
            com.google.android.gms.internal.ads.zw r4 = new com.google.android.gms.internal.ads.zw     // Catch:{ RemoteException -> 0x008e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r6 = move-exception
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r6)
        L_0x0092:
            com.google.android.gms.internal.ads.m40 r6 = r5.f20503a     // Catch:{ RemoteException -> 0x00a1 }
            com.google.android.gms.internal.ads.q20 r6 = r6.mo18806i()     // Catch:{ RemoteException -> 0x00a1 }
            if (r6 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.r20 r2 = new com.google.android.gms.internal.ads.r20     // Catch:{ RemoteException -> 0x00a1 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x00a1 }
            r1 = r2
            goto L_0x00a5
        L_0x00a1:
            r6 = move-exception
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r6)
        L_0x00a5:
            r5.f20505c = r1
            com.google.android.gms.internal.ads.m40 r6 = r5.f20503a     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.j20 r6 = r6.mo18804g()     // Catch:{ RemoteException -> 0x00bb }
            if (r6 == 0) goto L_0x00bf
            com.google.android.gms.internal.ads.k20 r6 = new com.google.android.gms.internal.ads.k20     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.m40 r1 = r5.f20503a     // Catch:{ RemoteException -> 0x00bb }
            com.google.android.gms.internal.ads.j20 r1 = r1.mo18804g()     // Catch:{ RemoteException -> 0x00bb }
            r6.<init>(r1)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00bf
        L_0x00bb:
            r6 = move-exception
            com.google.android.gms.internal.ads.ul0.m31860e(r0, r6)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n40.<init>(com.google.android.gms.internal.ads.m40):void");
    }

    /* renamed from: a */
    public final String mo10773a() {
        try {
            return this.f20503a.mo18808k();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo10774b() {
        try {
            return this.f20503a.mo18809l();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo10775c() {
        try {
            return this.f20503a.zzp();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo10776d() {
        try {
            return this.f20503a.mo18812o();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2907b mo10777e() {
        return this.f20505c;
    }

    /* renamed from: f */
    public final List<C2907b> mo10778f() {
        return this.f20504b;
    }

    /* renamed from: g */
    public final String mo10779g() {
        try {
            return this.f20503a.zzs();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: h */
    public final Double mo10780h() {
        try {
            double zze = this.f20503a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo10781i() {
        try {
            return this.f20503a.mo18811n();
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    /* renamed from: j */
    public final C3114t mo10782j() {
        try {
            if (this.f20503a.mo18803e() != null) {
                this.f20506d.mo11362d(this.f20503a.mo18803e());
            }
        } catch (RemoteException e) {
            ul0.m31860e("Exception occurred while getting video controller", e);
        }
        return this.f20506d;
    }

    /* renamed from: k */
    public final Object mo10783k() {
        try {
            C4863a j = this.f20503a.mo18807j();
            if (j != null) {
                return C4865b.m20502K0(j);
            }
            return null;
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
            return null;
        }
    }
}
