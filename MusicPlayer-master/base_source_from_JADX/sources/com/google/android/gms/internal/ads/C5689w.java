package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5689w {

    /* renamed from: A */
    public final int f25116A;

    /* renamed from: B */
    public final int f25117B;

    /* renamed from: C */
    public final int f25118C;

    /* renamed from: D */
    public final int f25119D;

    /* renamed from: E */
    public final int f25120E;

    /* renamed from: F */
    private int f25121F;

    /* renamed from: a */
    public final String f25122a;

    /* renamed from: b */
    public final String f25123b;

    /* renamed from: c */
    public final String f25124c;

    /* renamed from: d */
    public final int f25125d;

    /* renamed from: e */
    public final int f25126e;

    /* renamed from: f */
    public final int f25127f;

    /* renamed from: g */
    public final int f25128g;

    /* renamed from: h */
    public final int f25129h;

    /* renamed from: i */
    public final String f25130i;

    /* renamed from: j */
    public final zzdd f25131j;

    /* renamed from: k */
    public final String f25132k;

    /* renamed from: l */
    public final String f25133l;

    /* renamed from: m */
    public final int f25134m;

    /* renamed from: n */
    public final List<byte[]> f25135n;

    /* renamed from: o */
    public final zzs f25136o;

    /* renamed from: p */
    public final long f25137p;

    /* renamed from: q */
    public final int f25138q;

    /* renamed from: r */
    public final int f25139r;

    /* renamed from: s */
    public final float f25140s;

    /* renamed from: t */
    public final int f25141t;

    /* renamed from: u */
    public final float f25142u;

    /* renamed from: v */
    public final byte[] f25143v;

    /* renamed from: w */
    public final int f25144w;

    /* renamed from: x */
    public final dy3 f25145x;

    /* renamed from: y */
    public final int f25146y;

    /* renamed from: z */
    public final int f25147z;

    static {
        new C5689w(new jb4());
        j94 j94 = j94.f18402a;
    }

    private C5689w(jb4 jb4) {
        this.f25122a = jb4.f18423a;
        this.f25123b = jb4.f18424b;
        this.f25124c = wy2.m33448k(jb4.f18425c);
        this.f25125d = jb4.f18426d;
        int i = 0;
        this.f25126e = 0;
        int L = jb4.f18427e;
        this.f25127f = L;
        int T = jb4.f18428f;
        this.f25128g = T;
        this.f25129h = T != -1 ? T : L;
        this.f25130i = jb4.f18429g;
        this.f25131j = jb4.f18430h;
        this.f25132k = jb4.f18431i;
        this.f25133l = jb4.f18432j;
        this.f25134m = jb4.f18433k;
        this.f25135n = jb4.f18434l == null ? Collections.emptyList() : jb4.f18434l;
        zzs b0 = jb4.f18435m;
        this.f25136o = b0;
        this.f25137p = jb4.f18436n;
        this.f25138q = jb4.f18437o;
        this.f25139r = jb4.f18438p;
        this.f25140s = jb4.f18439q;
        this.f25141t = jb4.f18440r == -1 ? 0 : jb4.f18440r;
        this.f25142u = jb4.f18441s == -1.0f ? 1.0f : jb4.f18441s;
        this.f25143v = jb4.f18442t;
        this.f25144w = jb4.f18443u;
        this.f25145x = jb4.f18444v;
        this.f25146y = jb4.f18445w;
        this.f25147z = jb4.f18446x;
        this.f25116A = jb4.f18447y;
        this.f25117B = jb4.f18448z == -1 ? 0 : jb4.f18448z;
        this.f25118C = jb4.f18420A != -1 ? jb4.f18420A : i;
        this.f25119D = jb4.f18421B;
        this.f25120E = (jb4.f18422C != 0 || b0 == null) ? jb4.f18422C : 1;
    }

    /* renamed from: a */
    public final int mo21656a() {
        int i;
        int i2 = this.f25138q;
        if (i2 == -1 || (i = this.f25139r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final jb4 mo21657b() {
        return new jb4(this, (ka4) null);
    }

    /* renamed from: c */
    public final C5689w mo21658c(int i) {
        jb4 jb4 = new jb4(this, (ka4) null);
        jb4.mo18575a(i);
        return new C5689w(jb4);
    }

    /* renamed from: d */
    public final boolean mo21659d(C5689w wVar) {
        if (this.f25135n.size() != wVar.f25135n.size()) {
            return false;
        }
        for (int i = 0; i < this.f25135n.size(); i++) {
            if (!Arrays.equals(this.f25135n.get(i), wVar.f25135n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C5689w.class == obj.getClass()) {
            C5689w wVar = (C5689w) obj;
            int i2 = this.f25121F;
            if ((i2 == 0 || (i = wVar.f25121F) == 0 || i2 == i) && this.f25125d == wVar.f25125d && this.f25127f == wVar.f25127f && this.f25128g == wVar.f25128g && this.f25134m == wVar.f25134m && this.f25137p == wVar.f25137p && this.f25138q == wVar.f25138q && this.f25139r == wVar.f25139r && this.f25141t == wVar.f25141t && this.f25144w == wVar.f25144w && this.f25146y == wVar.f25146y && this.f25147z == wVar.f25147z && this.f25116A == wVar.f25116A && this.f25117B == wVar.f25117B && this.f25118C == wVar.f25118C && this.f25119D == wVar.f25119D && this.f25120E == wVar.f25120E && Float.compare(this.f25140s, wVar.f25140s) == 0 && Float.compare(this.f25142u, wVar.f25142u) == 0 && wy2.m33453p(this.f25122a, wVar.f25122a) && wy2.m33453p(this.f25123b, wVar.f25123b) && wy2.m33453p(this.f25130i, wVar.f25130i) && wy2.m33453p(this.f25132k, wVar.f25132k) && wy2.m33453p(this.f25133l, wVar.f25133l) && wy2.m33453p(this.f25124c, wVar.f25124c) && Arrays.equals(this.f25143v, wVar.f25143v) && wy2.m33453p(this.f25131j, wVar.f25131j) && wy2.m33453p(this.f25145x, wVar.f25145x) && wy2.m33453p(this.f25136o, wVar.f25136o) && mo21659d(wVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f25121F;
        if (i6 != 0) {
            return i6;
        }
        String str = this.f25122a;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = (i + 527) * 31;
        String str2 = this.f25123b;
        int hashCode = (i8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25124c;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i9 = (((((((hashCode + i2) * 31) + this.f25125d) * 961) + this.f25127f) * 31) + this.f25128g) * 31;
        String str4 = this.f25130i;
        if (str4 == null) {
            i3 = 0;
        } else {
            i3 = str4.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        zzdd zzdd = this.f25131j;
        if (zzdd == null) {
            i4 = 0;
        } else {
            i4 = zzdd.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        String str5 = this.f25132k;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str6 = this.f25133l;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((i12 + i7) * 31) + this.f25134m) * 31) + ((int) this.f25137p)) * 31) + this.f25138q) * 31) + this.f25139r) * 31) + Float.floatToIntBits(this.f25140s)) * 31) + this.f25141t) * 31) + Float.floatToIntBits(this.f25142u)) * 31) + this.f25144w) * 31) + this.f25146y) * 31) + this.f25147z) * 31) + this.f25116A) * 31) + this.f25117B) * 31) + this.f25118C) * 31) + this.f25119D) * 31) + this.f25120E;
        this.f25121F = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String str = this.f25122a;
        String str2 = this.f25123b;
        String str3 = this.f25132k;
        String str4 = this.f25133l;
        String str5 = this.f25130i;
        int i = this.f25129h;
        String str6 = this.f25124c;
        int i2 = this.f25138q;
        int i3 = this.f25139r;
        float f = this.f25140s;
        int i4 = this.f25146y;
        int i5 = this.f25147z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }
}
