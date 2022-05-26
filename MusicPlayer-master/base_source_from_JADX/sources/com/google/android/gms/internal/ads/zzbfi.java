package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfi> CREATOR = new C5053eu();

    /* renamed from: g */
    public final String f27215g;

    /* renamed from: h */
    public final int f27216h;

    /* renamed from: i */
    public final int f27217i;

    /* renamed from: j */
    public final boolean f27218j;

    /* renamed from: k */
    public final int f27219k;

    /* renamed from: l */
    public final int f27220l;

    /* renamed from: m */
    public final zzbfi[] f27221m;

    /* renamed from: n */
    public final boolean f27222n;

    /* renamed from: o */
    public final boolean f27223o;

    /* renamed from: p */
    public boolean f27224p;

    /* renamed from: q */
    public boolean f27225q;

    /* renamed from: r */
    public boolean f27226r;

    /* renamed from: s */
    public boolean f27227s;

    /* renamed from: t */
    public boolean f27228t;

    /* renamed from: u */
    public boolean f27229u;

    public zzbfi() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzbfi[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: Y */
    public static int m34948Y(DisplayMetrics displayMetrics) {
        return (int) (((float) m34953z0(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: m0 */
    public static zzbfi m34949m0() {
        return new zzbfi("interstitial_mb", 0, 0, false, 0, 0, (zzbfi[]) null, false, false, false, false, true, false, false, false);
    }

    /* renamed from: n0 */
    public static zzbfi m34950n0() {
        return new zzbfi("320x50_mb", 0, 0, false, 0, 0, (zzbfi[]) null, true, false, false, false, false, false, false, false);
    }

    /* renamed from: o0 */
    public static zzbfi m34951o0() {
        return new zzbfi("reward_mb", 0, 0, true, 0, 0, (zzbfi[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: v0 */
    public static zzbfi m34952v0() {
        return new zzbfi("invalid", 0, 0, false, 0, 0, (zzbfi[]) null, false, false, false, true, false, false, false, false);
    }

    /* renamed from: z0 */
    private static int m34953z0(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 2, this.f27215g, false);
        C3315b.m14316h(parcel, 3, this.f27216h);
        C3315b.m14316h(parcel, 4, this.f27217i);
        C3315b.m14311c(parcel, 5, this.f27218j);
        C3315b.m14316h(parcel, 6, this.f27219k);
        C3315b.m14316h(parcel, 7, this.f27220l);
        C3315b.m14325q(parcel, 8, this.f27221m, i, false);
        C3315b.m14311c(parcel, 9, this.f27222n);
        C3315b.m14311c(parcel, 10, this.f27223o);
        C3315b.m14311c(parcel, 11, this.f27224p);
        C3315b.m14311c(parcel, 12, this.f27225q);
        C3315b.m14311c(parcel, 13, this.f27226r);
        C3315b.m14311c(parcel, 14, this.f27227s);
        C3315b.m14311c(parcel, 15, this.f27228t);
        C3315b.m14311c(parcel, 16, this.f27229u);
        C3315b.m14310b(parcel, a);
    }

    public zzbfi(Context context, C2921g gVar) {
        this(context, new C2921g[]{gVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbfi(android.content.Context r13, com.google.android.gms.ads.C2921g[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f27218j = r0
            boolean r2 = r1.mo10799f()
            r12.f27223o = r2
            boolean r3 = com.google.android.gms.ads.C2899d0.m12945f(r1)
            r12.f27227s = r3
            boolean r3 = com.google.android.gms.ads.C2899d0.m12946g(r1)
            r12.f27228t = r3
            boolean r3 = com.google.android.gms.ads.C2899d0.m12947h(r1)
            r12.f27229u = r3
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.ads.g r2 = com.google.android.gms.ads.C2921g.f9793i
            int r3 = r2.mo10796d()
            r12.f27219k = r3
            int r2 = r2.mo10794b()
            r12.f27216h = r2
            goto L_0x005d
        L_0x0031:
            boolean r2 = r12.f27228t
            if (r2 == 0) goto L_0x0042
            int r2 = r1.mo10796d()
            r12.f27219k = r2
            int r2 = com.google.android.gms.ads.C2899d0.m12940a(r1)
            r12.f27216h = r2
            goto L_0x005d
        L_0x0042:
            if (r3 == 0) goto L_0x0051
            int r2 = r1.mo10796d()
            r12.f27219k = r2
            int r2 = com.google.android.gms.ads.C2899d0.m12941b(r1)
            r12.f27216h = r2
            goto L_0x005d
        L_0x0051:
            int r2 = r1.mo10796d()
            r12.f27219k = r2
            int r2 = r1.mo10794b()
            r12.f27216h = r2
        L_0x005d:
            int r3 = r12.f27219k
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r5 = -1
            if (r3 != r5) goto L_0x0130
            com.google.android.gms.internal.ads.C4980cv.m22123b()
            android.content.res.Resources r6 = r13.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 == r7) goto L_0x007c
            goto L_0x0118
        L_0x007c:
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r7 = r6.heightPixels
            float r7 = (float) r7
            float r6 = r6.density
            float r7 = r7 / r6
            int r6 = (int) r7
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L_0x0118
            com.google.android.gms.internal.ads.C4980cv.m22123b()
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            java.lang.String r7 = "window"
            java.lang.Object r7 = r13.getSystemService(r7)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            if (r7 == 0) goto L_0x0118
            android.view.Display r7 = r7.getDefaultDisplay()
            boolean r8 = com.google.android.gms.common.util.C3369n.m14471c()
            if (r8 == 0) goto L_0x00b6
            r7.getRealMetrics(r6)
            int r8 = r6.heightPixels
            int r9 = r6.widthPixels
            goto L_0x00ea
        L_0x00b6:
            java.lang.Class<android.view.Display> r8 = android.view.Display.class
            java.lang.String r9 = "getRawHeight"
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ Exception -> 0x0118 }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.Object r8 = r8.invoke(r7, r9)     // Catch:{ Exception -> 0x0118 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0118 }
            java.lang.Class<android.view.Display> r9 = android.view.Display.class
            java.lang.String r10 = "getRawWidth"
            java.lang.Class[] r11 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ Exception -> 0x0118 }
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0118 }
            java.lang.Object r9 = r9.invoke(r7, r10)     // Catch:{ Exception -> 0x0118 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x0118 }
            if (r8 != 0) goto L_0x00de
            r8 = 0
            goto L_0x00e2
        L_0x00de:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0118 }
        L_0x00e2:
            if (r9 != 0) goto L_0x00e6
            r9 = 0
            goto L_0x00ea
        L_0x00e6:
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0118 }
        L_0x00ea:
            r7.getMetrics(r6)
            int r7 = r6.heightPixels
            int r6 = r6.widthPixels
            if (r7 != r8) goto L_0x0118
            if (r6 != r9) goto L_0x0118
            int r6 = r4.widthPixels
            com.google.android.gms.internal.ads.C4980cv.m22123b()
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = "navigation_bar_width"
            java.lang.String r9 = "dimen"
            java.lang.String r10 = "android"
            int r7 = r7.getIdentifier(r8, r9, r10)
            if (r7 <= 0) goto L_0x0113
            android.content.res.Resources r8 = r13.getResources()
            int r7 = r8.getDimensionPixelSize(r7)
            goto L_0x0114
        L_0x0113:
            r7 = 0
        L_0x0114:
            int r6 = r6 - r7
            r12.f27220l = r6
            goto L_0x011c
        L_0x0118:
            int r6 = r4.widthPixels
            r12.f27220l = r6
        L_0x011c:
            float r6 = (float) r6
            float r7 = r4.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x013d
            int r8 = r8 + 1
            goto L_0x013d
        L_0x0130:
            int r8 = r12.f27219k
            com.google.android.gms.internal.ads.C4980cv.m22123b()
            int r6 = r12.f27219k
            int r6 = com.google.android.gms.internal.ads.nl0.m27919k(r4, r6)
            r12.f27220l = r6
        L_0x013d:
            r6 = -2
            if (r2 != r6) goto L_0x0145
            int r7 = m34953z0(r4)
            goto L_0x0147
        L_0x0145:
            int r7 = r12.f27216h
        L_0x0147:
            com.google.android.gms.internal.ads.C4980cv.m22123b()
            int r4 = com.google.android.gms.internal.ads.nl0.m27919k(r4, r7)
            r12.f27217i = r4
            java.lang.String r4 = "_as"
            java.lang.String r9 = "x"
            r10 = 26
            if (r3 == r5) goto L_0x018e
            if (r2 != r6) goto L_0x015b
            goto L_0x018e
        L_0x015b:
            boolean r2 = r12.f27228t
            if (r2 != 0) goto L_0x0172
            boolean r2 = r12.f27229u
            if (r2 == 0) goto L_0x0164
            goto L_0x0172
        L_0x0164:
            boolean r2 = r12.f27223o
            if (r2 == 0) goto L_0x016b
            java.lang.String r1 = "320x50_mb"
            goto L_0x018b
        L_0x016b:
            java.lang.String r1 = r1.toString()
            r12.f27215g = r1
            goto L_0x01a5
        L_0x0172:
            int r1 = r12.f27219k
            int r2 = r12.f27216h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x018b:
            r12.f27215g = r1
            goto L_0x01a5
        L_0x018e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r8)
            r1.append(r9)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r12.f27215g = r1
        L_0x01a5:
            int r1 = r14.length
            r2 = 1
            if (r1 <= r2) goto L_0x01bf
            com.google.android.gms.internal.ads.zzbfi[] r1 = new com.google.android.gms.internal.ads.zzbfi[r1]
            r12.f27221m = r1
            r1 = 0
        L_0x01ae:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x01c2
            com.google.android.gms.internal.ads.zzbfi[] r2 = r12.f27221m
            com.google.android.gms.internal.ads.zzbfi r3 = new com.google.android.gms.internal.ads.zzbfi
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.C2921g) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x01ae
        L_0x01bf:
            r13 = 0
            r12.f27221m = r13
        L_0x01c2:
            r12.f27222n = r0
            r12.f27224p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfi.<init>(android.content.Context, com.google.android.gms.ads.g[]):void");
    }

    zzbfi(String str, int i, int i2, boolean z, int i3, int i4, zzbfi[] zzbfiArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f27215g = str;
        this.f27216h = i;
        this.f27217i = i2;
        this.f27218j = z;
        this.f27219k = i3;
        this.f27220l = i4;
        this.f27221m = zzbfiArr;
        this.f27222n = z2;
        this.f27223o = z3;
        this.f27224p = z4;
        this.f27225q = z5;
        this.f27226r = z6;
        this.f27227s = z7;
        this.f27228t = z8;
        this.f27229u = z9;
    }
}
