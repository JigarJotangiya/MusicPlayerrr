package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.ArrayList;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.on */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5417on {

    /* renamed from: a */
    private final int f21062a;

    /* renamed from: b */
    private final int f21063b;

    /* renamed from: c */
    private final int f21064c;

    /* renamed from: d */
    private final boolean f21065d;

    /* renamed from: e */
    private final C5047eo f21066e;

    /* renamed from: f */
    private final C5344mo f21067f;

    /* renamed from: g */
    private final Object f21068g = new Object();

    /* renamed from: h */
    private final ArrayList<String> f21069h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<String> f21070i = new ArrayList<>();

    /* renamed from: j */
    private final ArrayList<C4899ao> f21071j = new ArrayList<>();

    /* renamed from: k */
    private int f21072k = 0;

    /* renamed from: l */
    private int f21073l = 0;

    /* renamed from: m */
    private int f21074m = 0;

    /* renamed from: n */
    private int f21075n;

    /* renamed from: o */
    private String f21076o = BuildConfig.FLAVOR;

    /* renamed from: p */
    private String f21077p = BuildConfig.FLAVOR;

    /* renamed from: q */
    private String f21078q = BuildConfig.FLAVOR;

    public C5417on(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f21062a = i;
        this.f21063b = i2;
        this.f21064c = i3;
        this.f21065d = z;
        this.f21066e = new C5047eo(i4);
        this.f21067f = new C5344mo(i5, i6, i7);
    }

    /* renamed from: p */
    private final void m28593p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f21064c) {
            synchronized (this.f21068g) {
                this.f21069h.add(str);
                this.f21072k += str.length();
                if (z) {
                    this.f21070i.add(str);
                    this.f21071j.add(new C4899ao(f, f2, f3, f4, this.f21070i.size() - 1));
                }
            }
        }
    }

    /* renamed from: q */
    private static final String m28594q(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append(arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo20032a(int i, int i2) {
        return this.f21065d ? this.f21063b : (i * this.f21062a) + (i2 * this.f21063b);
    }

    /* renamed from: b */
    public final int mo20033b() {
        return this.f21075n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo20034c() {
        return this.f21072k;
    }

    /* renamed from: d */
    public final String mo20035d() {
        return this.f21076o;
    }

    /* renamed from: e */
    public final String mo20036e() {
        return this.f21077p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5417on)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C5417on) obj).f21076o;
        return str != null && str.equals(this.f21076o);
    }

    /* renamed from: f */
    public final String mo20038f() {
        return this.f21078q;
    }

    /* renamed from: g */
    public final void mo20039g() {
        synchronized (this.f21068g) {
            this.f21074m--;
        }
    }

    /* renamed from: h */
    public final void mo20040h() {
        synchronized (this.f21068g) {
            this.f21074m++;
        }
    }

    public final int hashCode() {
        return this.f21076o.hashCode();
    }

    /* renamed from: i */
    public final void mo20042i() {
        synchronized (this.f21068g) {
            this.f21075n -= 100;
        }
    }

    /* renamed from: j */
    public final void mo20043j(int i) {
        this.f21073l = i;
    }

    /* renamed from: k */
    public final void mo20044k(String str, boolean z, float f, float f2, float f3, float f4) {
        m28593p(str, z, f, f2, f3, f4);
    }

    /* renamed from: l */
    public final void mo20045l(String str, boolean z, float f, float f2, float f3, float f4) {
        m28593p(str, z, f, f2, f3, f4);
        synchronized (this.f21068g) {
            if (this.f21074m < 0) {
                ul0.m31857b("ActivityContent: negative number of WebViews.");
            }
            mo20046m();
        }
    }

    /* renamed from: m */
    public final void mo20046m() {
        synchronized (this.f21068g) {
            int a = mo20032a(this.f21072k, this.f21073l);
            if (a > this.f21075n) {
                this.f21075n = a;
                if (!C2971s.m13213p().mo17562h().mo11067K()) {
                    this.f21076o = this.f21066e.mo17226a(this.f21069h);
                    this.f21077p = this.f21066e.mo17226a(this.f21070i);
                }
                if (!C2971s.m13213p().mo17562h().mo11100s()) {
                    this.f21078q = this.f21067f.mo19479a(this.f21070i, this.f21071j);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo20047n() {
        synchronized (this.f21068g) {
            int a = mo20032a(this.f21072k, this.f21073l);
            if (a > this.f21075n) {
                this.f21075n = a;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo20048o() {
        boolean z;
        synchronized (this.f21068g) {
            z = this.f21074m == 0;
        }
        return z;
    }

    public final String toString() {
        int i = this.f21073l;
        int i2 = this.f21075n;
        int i3 = this.f21072k;
        String q = m28594q(this.f21069h, 100);
        String q2 = m28594q(this.f21070i, 100);
        String str = this.f21076o;
        String str2 = this.f21077p;
        String str3 = this.f21078q;
        int length = String.valueOf(q).length();
        int length2 = String.valueOf(q2).length();
        int length3 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + length3 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(q);
        sb.append("\n viewableText");
        sb.append(q2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
