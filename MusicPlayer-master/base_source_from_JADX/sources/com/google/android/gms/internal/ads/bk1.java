package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import p082e.p098e.C3478g;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bk1 {

    /* renamed from: a */
    private int f14504a;

    /* renamed from: b */
    private C5427ox f14505b;

    /* renamed from: c */
    private j20 f14506c;

    /* renamed from: d */
    private View f14507d;

    /* renamed from: e */
    private List<?> f14508e;

    /* renamed from: f */
    private List<C5020dy> f14509f = Collections.emptyList();

    /* renamed from: g */
    private C5020dy f14510g;

    /* renamed from: h */
    private Bundle f14511h;

    /* renamed from: i */
    private pr0 f14512i;

    /* renamed from: j */
    private pr0 f14513j;

    /* renamed from: k */
    private pr0 f14514k;

    /* renamed from: l */
    private C4863a f14515l;

    /* renamed from: m */
    private View f14516m;

    /* renamed from: n */
    private View f14517n;

    /* renamed from: o */
    private C4863a f14518o;

    /* renamed from: p */
    private double f14519p;

    /* renamed from: q */
    private q20 f14520q;

    /* renamed from: r */
    private q20 f14521r;

    /* renamed from: s */
    private String f14522s;

    /* renamed from: t */
    private final C3478g<String, d20> f14523t = new C3478g<>();

    /* renamed from: u */
    private final C3478g<String, String> f14524u = new C3478g<>();

    /* renamed from: v */
    private float f14525v;

    /* renamed from: w */
    private String f14526w;

    /* renamed from: C */
    public static bk1 m21349C(nb0 nb0) {
        try {
            ak1 G = m21353G(nb0.mo19689l3(), (rb0) null);
            j20 y3 = nb0.mo19694y3();
            String l = nb0.mo19688l();
            List<?> e7 = nb0.mo19680e7();
            String m = nb0.mo19690m();
            Bundle c = nb0.mo19678c();
            String k = nb0.mo19687k();
            C4863a j = nb0.mo19685j();
            String o = nb0.mo19692o();
            String zzp = nb0.zzp();
            double zze = nb0.zze();
            q20 o5 = nb0.mo19693o5();
            bk1 bk1 = new bk1();
            bk1.f14504a = 2;
            bk1.f14505b = G;
            bk1.f14506c = y3;
            bk1.f14507d = (View) m21355I(nb0.mo19676F5());
            bk1.mo16302u("headline", l);
            bk1.f14508e = e7;
            bk1.mo16302u("body", m);
            bk1.f14511h = c;
            bk1.mo16302u("call_to_action", k);
            bk1.f14516m = (View) m21355I(nb0.mo19679d7());
            bk1.f14518o = j;
            bk1.mo16302u("store", o);
            bk1.mo16302u("price", zzp);
            bk1.f14519p = zze;
            bk1.f14520q = o5;
            return bk1;
        } catch (RemoteException e) {
            ul0.m31863h("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: D */
    public static bk1 m21350D(ob0 ob0) {
        try {
            ak1 G = m21353G(ob0.mo19950l3(), (rb0) null);
            j20 y3 = ob0.mo19953y3();
            String l = ob0.mo19949l();
            List<?> e7 = ob0.mo19939e7();
            String m = ob0.mo19951m();
            Bundle zze = ob0.zze();
            String k = ob0.mo19947k();
            C4863a d7 = ob0.mo19938d7();
            String j = ob0.mo19945j();
            q20 o5 = ob0.mo19952o5();
            bk1 bk1 = new bk1();
            bk1.f14504a = 1;
            bk1.f14505b = G;
            bk1.f14506c = y3;
            bk1.f14507d = (View) m21355I(ob0.mo19941g());
            bk1.mo16302u("headline", l);
            bk1.f14508e = e7;
            bk1.mo16302u("body", m);
            bk1.f14511h = zze;
            bk1.mo16302u("call_to_action", k);
            bk1.f14516m = (View) m21355I(ob0.mo19937F5());
            bk1.f14518o = d7;
            bk1.mo16302u("advertiser", j);
            bk1.f14521r = o5;
            return bk1;
        } catch (RemoteException e) {
            ul0.m31863h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: E */
    public static bk1 m21351E(nb0 nb0) {
        try {
            return m21354H(m21353G(nb0.mo19689l3(), (rb0) null), nb0.mo19694y3(), (View) m21355I(nb0.mo19676F5()), nb0.mo19688l(), nb0.mo19680e7(), nb0.mo19690m(), nb0.mo19678c(), nb0.mo19687k(), (View) m21355I(nb0.mo19679d7()), nb0.mo19685j(), nb0.mo19692o(), nb0.zzp(), nb0.zze(), nb0.mo19693o5(), (String) null, 0.0f);
        } catch (RemoteException e) {
            ul0.m31863h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    /* renamed from: F */
    public static bk1 m21352F(ob0 ob0) {
        try {
            return m21354H(m21353G(ob0.mo19950l3(), (rb0) null), ob0.mo19953y3(), (View) m21355I(ob0.mo19941g()), ob0.mo19949l(), ob0.mo19939e7(), ob0.mo19951m(), ob0.zze(), ob0.mo19947k(), (View) m21355I(ob0.mo19937F5()), ob0.mo19938d7(), (String) null, (String) null, -1.0d, ob0.mo19952o5(), ob0.mo19945j(), 0.0f);
        } catch (RemoteException e) {
            ul0.m31863h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    /* renamed from: G */
    private static ak1 m21353G(C5427ox oxVar, rb0 rb0) {
        if (oxVar == null) {
            return null;
        }
        return new ak1(oxVar, rb0);
    }

    /* renamed from: H */
    private static bk1 m21354H(C5427ox oxVar, j20 j20, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, C4863a aVar, String str4, String str5, double d, q20 q20, String str6, float f) {
        bk1 bk1 = new bk1();
        bk1.f14504a = 6;
        bk1.f14505b = oxVar;
        bk1.f14506c = j20;
        bk1.f14507d = view;
        String str7 = str;
        bk1.mo16302u("headline", str);
        bk1.f14508e = list;
        String str8 = str2;
        bk1.mo16302u("body", str2);
        bk1.f14511h = bundle;
        String str9 = str3;
        bk1.mo16302u("call_to_action", str3);
        bk1.f14516m = view2;
        bk1.f14518o = aVar;
        String str10 = str4;
        bk1.mo16302u("store", str4);
        String str11 = str5;
        bk1.mo16302u("price", str5);
        bk1.f14519p = d;
        bk1.f14520q = q20;
        bk1.mo16302u("advertiser", str6);
        bk1.mo16297p(f);
        return bk1;
    }

    /* renamed from: I */
    private static <T> T m21355I(C4863a aVar) {
        if (aVar == null) {
            return null;
        }
        return C4865b.m20502K0(aVar);
    }

    /* renamed from: a0 */
    public static bk1 m21356a0(rb0 rb0) {
        try {
            return m21354H(m21353G(rb0.mo19125h(), rb0), rb0.mo19126i(), (View) m21355I(rb0.mo19130m()), rb0.zzs(), rb0.mo19134t(), rb0.mo19132o(), rb0.mo19124g(), rb0.zzr(), (View) m21355I(rb0.mo19128k()), rb0.mo19129l(), rb0.mo19135u(), rb0.mo19131n(), rb0.zze(), rb0.mo19127j(), rb0.zzp(), rb0.mo19121c());
        } catch (RemoteException e) {
            ul0.m31863h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* renamed from: A */
    public final synchronized double mo16256A() {
        return this.f14519p;
    }

    /* renamed from: B */
    public final synchronized void mo16257B(C4863a aVar) {
        this.f14515l = aVar;
    }

    /* renamed from: J */
    public final synchronized float mo16258J() {
        return this.f14525v;
    }

    /* renamed from: K */
    public final synchronized int mo16259K() {
        return this.f14504a;
    }

    /* renamed from: L */
    public final synchronized Bundle mo16260L() {
        if (this.f14511h == null) {
            this.f14511h = new Bundle();
        }
        return this.f14511h;
    }

    /* renamed from: M */
    public final synchronized View mo16261M() {
        return this.f14507d;
    }

    /* renamed from: N */
    public final synchronized View mo16262N() {
        return this.f14516m;
    }

    /* renamed from: O */
    public final synchronized View mo16263O() {
        return this.f14517n;
    }

    /* renamed from: P */
    public final synchronized C3478g<String, d20> mo16264P() {
        return this.f14523t;
    }

    /* renamed from: Q */
    public final synchronized C3478g<String, String> mo16265Q() {
        return this.f14524u;
    }

    /* renamed from: R */
    public final synchronized C5427ox mo16266R() {
        return this.f14505b;
    }

    /* renamed from: S */
    public final synchronized C5020dy mo16267S() {
        return this.f14510g;
    }

    /* renamed from: T */
    public final synchronized j20 mo16268T() {
        return this.f14506c;
    }

    /* renamed from: U */
    public final q20 mo16269U() {
        List<?> list = this.f14508e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.f14508e.get(0);
            if (obj instanceof IBinder) {
                return p20.m28834e7((IBinder) obj);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final synchronized q20 mo16270V() {
        return this.f14520q;
    }

    /* renamed from: W */
    public final synchronized q20 mo16271W() {
        return this.f14521r;
    }

    /* renamed from: X */
    public final synchronized pr0 mo16272X() {
        return this.f14513j;
    }

    /* renamed from: Y */
    public final synchronized pr0 mo16273Y() {
        return this.f14514k;
    }

    /* renamed from: Z */
    public final synchronized pr0 mo16274Z() {
        return this.f14512i;
    }

    /* renamed from: a */
    public final synchronized String mo16275a() {
        return this.f14526w;
    }

    /* renamed from: b */
    public final synchronized String mo16276b() {
        return mo16280d("price");
    }

    /* renamed from: b0 */
    public final synchronized C4863a mo16277b0() {
        return this.f14518o;
    }

    /* renamed from: c */
    public final synchronized String mo16278c() {
        return mo16280d("store");
    }

    /* renamed from: c0 */
    public final synchronized C4863a mo16279c0() {
        return this.f14515l;
    }

    /* renamed from: d */
    public final synchronized String mo16280d(String str) {
        return this.f14524u.get(str);
    }

    /* renamed from: d0 */
    public final synchronized String mo16281d0() {
        return mo16280d("advertiser");
    }

    /* renamed from: e */
    public final synchronized List<?> mo16282e() {
        return this.f14508e;
    }

    /* renamed from: e0 */
    public final synchronized String mo16283e0() {
        return mo16280d("body");
    }

    /* renamed from: f */
    public final synchronized List<C5020dy> mo16284f() {
        return this.f14509f;
    }

    /* renamed from: f0 */
    public final synchronized String mo16285f0() {
        return mo16280d("call_to_action");
    }

    /* renamed from: g */
    public final synchronized void mo16286g() {
        pr0 pr0 = this.f14512i;
        if (pr0 != null) {
            pr0.destroy();
            this.f14512i = null;
        }
        pr0 pr02 = this.f14513j;
        if (pr02 != null) {
            pr02.destroy();
            this.f14513j = null;
        }
        pr0 pr03 = this.f14514k;
        if (pr03 != null) {
            pr03.destroy();
            this.f14514k = null;
        }
        this.f14515l = null;
        this.f14523t.clear();
        this.f14524u.clear();
        this.f14505b = null;
        this.f14506c = null;
        this.f14507d = null;
        this.f14508e = null;
        this.f14511h = null;
        this.f14516m = null;
        this.f14517n = null;
        this.f14518o = null;
        this.f14520q = null;
        this.f14521r = null;
        this.f14522s = null;
    }

    /* renamed from: g0 */
    public final synchronized String mo16287g0() {
        return this.f14522s;
    }

    /* renamed from: h */
    public final synchronized void mo16288h(j20 j20) {
        this.f14506c = j20;
    }

    /* renamed from: h0 */
    public final synchronized String mo16289h0() {
        return mo16280d("headline");
    }

    /* renamed from: i */
    public final synchronized void mo16290i(String str) {
        this.f14522s = str;
    }

    /* renamed from: j */
    public final synchronized void mo16291j(C5020dy dyVar) {
        this.f14510g = dyVar;
    }

    /* renamed from: k */
    public final synchronized void mo16292k(q20 q20) {
        this.f14520q = q20;
    }

    /* renamed from: l */
    public final synchronized void mo16293l(String str, d20 d20) {
        if (d20 == null) {
            this.f14523t.remove(str);
        } else {
            this.f14523t.put(str, d20);
        }
    }

    /* renamed from: m */
    public final synchronized void mo16294m(pr0 pr0) {
        this.f14513j = pr0;
    }

    /* renamed from: n */
    public final synchronized void mo16295n(List<d20> list) {
        this.f14508e = list;
    }

    /* renamed from: o */
    public final synchronized void mo16296o(q20 q20) {
        this.f14521r = q20;
    }

    /* renamed from: p */
    public final synchronized void mo16297p(float f) {
        this.f14525v = f;
    }

    /* renamed from: q */
    public final synchronized void mo16298q(List<C5020dy> list) {
        this.f14509f = list;
    }

    /* renamed from: r */
    public final synchronized void mo16299r(pr0 pr0) {
        this.f14514k = pr0;
    }

    /* renamed from: s */
    public final synchronized void mo16300s(String str) {
        this.f14526w = str;
    }

    /* renamed from: t */
    public final synchronized void mo16301t(double d) {
        this.f14519p = d;
    }

    /* renamed from: u */
    public final synchronized void mo16302u(String str, String str2) {
        if (str2 == null) {
            this.f14524u.remove(str);
        } else {
            this.f14524u.put(str, str2);
        }
    }

    /* renamed from: v */
    public final synchronized void mo16303v(int i) {
        this.f14504a = i;
    }

    /* renamed from: w */
    public final synchronized void mo16304w(C5427ox oxVar) {
        this.f14505b = oxVar;
    }

    /* renamed from: x */
    public final synchronized void mo16305x(View view) {
        this.f14516m = view;
    }

    /* renamed from: y */
    public final synchronized void mo16306y(pr0 pr0) {
        this.f14512i = pr0;
    }

    /* renamed from: z */
    public final synchronized void mo16307z(View view) {
        this.f14517n = view;
    }
}
