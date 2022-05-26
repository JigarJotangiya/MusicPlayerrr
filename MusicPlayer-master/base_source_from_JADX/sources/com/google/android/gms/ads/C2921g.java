package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import androidx.recyclerview.widget.C0885l;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.zzbfi;

/* renamed from: com.google.android.gms.ads.g */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C2921g {
    @RecentlyNonNull

    /* renamed from: i */
    public static final C2921g f9793i = new C2921g(320, 50, "320x50_mb");
    @RecentlyNonNull

    /* renamed from: j */
    public static final C2921g f9794j = new C2921g(468, 60, "468x60_as");
    @RecentlyNonNull

    /* renamed from: k */
    public static final C2921g f9795k = new C2921g(320, 100, "320x100_as");
    @RecentlyNonNull

    /* renamed from: l */
    public static final C2921g f9796l = new C2921g(728, 90, "728x90_as");
    @RecentlyNonNull

    /* renamed from: m */
    public static final C2921g f9797m = new C2921g(300, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    @RecentlyNonNull

    /* renamed from: n */
    public static final C2921g f9798n = new C2921g(160, 600, "160x600_as");
    @RecentlyNonNull
    @Deprecated

    /* renamed from: o */
    public static final C2921g f9799o = new C2921g(-1, -2, "smart_banner");
    @RecentlyNonNull

    /* renamed from: p */
    public static final C2921g f9800p = new C2921g(-3, -4, "fluid");
    @RecentlyNonNull

    /* renamed from: q */
    public static final C2921g f9801q = new C2921g(0, 0, "invalid");
    @RecentlyNonNull

    /* renamed from: r */
    public static final C2921g f9802r = new C2921g(50, 50, "50x50_mb");

    /* renamed from: a */
    private final int f9803a;

    /* renamed from: b */
    private final int f9804b;

    /* renamed from: c */
    private final String f9805c;

    /* renamed from: d */
    private boolean f9806d;

    /* renamed from: e */
    private boolean f9807e;

    /* renamed from: f */
    private int f9808f;

    /* renamed from: g */
    private boolean f9809g;

    /* renamed from: h */
    private int f9810h;

    static {
        new C2921g(-3, 0, "search_v2");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2921g(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        L_0x000a:
            r1 = -2
            if (r7 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.C2921g.<init>(int, int):void");
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C2921g m13016a(@RecentlyNonNull Context context, int i) {
        C2921g c = nl0.m27914c(context, i, 50, 0);
        c.f9806d = true;
        return c;
    }

    /* renamed from: b */
    public int mo10794b() {
        return this.f9804b;
    }

    /* renamed from: c */
    public int mo10795c(@RecentlyNonNull Context context) {
        int i = this.f9804b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzbfi.m34948Y(context.getResources().getDisplayMetrics());
        }
        C4980cv.m22123b();
        return nl0.m27927s(context, this.f9804b);
    }

    /* renamed from: d */
    public int mo10796d() {
        return this.f9803a;
    }

    /* renamed from: e */
    public int mo10797e(@RecentlyNonNull Context context) {
        int i = this.f9803a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            C4980cv.m22123b();
            return nl0.m27927s(context, this.f9803a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzbfi> creator = zzbfi.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2921g)) {
            return false;
        }
        C2921g gVar = (C2921g) obj;
        return this.f9803a == gVar.f9803a && this.f9804b == gVar.f9804b && this.f9805c.equals(gVar.f9805c);
    }

    /* renamed from: f */
    public boolean mo10799f() {
        return this.f9803a == -3 && this.f9804b == -4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo10800g() {
        return this.f9810h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo10801h() {
        return this.f9808f;
    }

    public int hashCode() {
        return this.f9805c.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo10803i(int i) {
        this.f9808f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo10804j(int i) {
        this.f9810h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo10805k(boolean z) {
        this.f9807e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo10806l(boolean z) {
        this.f9809g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo10807m() {
        return this.f9806d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo10808n() {
        return this.f9807e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo10809o() {
        return this.f9809g;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f9805c;
    }

    C2921g(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f9803a = i;
            this.f9804b = i2;
            this.f9805c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
