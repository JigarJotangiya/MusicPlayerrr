package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.p019v.C1558c;
import com.airbnb.lottie.p019v.C1559d;
import com.airbnb.lottie.p019v.C1563h;
import com.airbnb.lottie.p019v.p022l.C1610d;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1682g;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p082e.p098e.C3470d;
import p082e.p098e.C3479h;

/* renamed from: com.airbnb.lottie.d */
/* compiled from: LottieComposition */
public class C1464d {

    /* renamed from: a */
    private final C1498n f5623a = new C1498n();

    /* renamed from: b */
    private final HashSet<String> f5624b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C1610d>> f5625c;

    /* renamed from: d */
    private Map<String, C1489g> f5626d;

    /* renamed from: e */
    private Map<String, C1558c> f5627e;

    /* renamed from: f */
    private List<C1563h> f5628f;

    /* renamed from: g */
    private C3479h<C1559d> f5629g;

    /* renamed from: h */
    private C3470d<C1610d> f5630h;

    /* renamed from: i */
    private List<C1610d> f5631i;

    /* renamed from: j */
    private Rect f5632j;

    /* renamed from: k */
    private float f5633k;

    /* renamed from: l */
    private float f5634l;

    /* renamed from: m */
    private float f5635m;

    /* renamed from: n */
    private boolean f5636n;

    /* renamed from: o */
    private int f5637o = 0;

    /* renamed from: a */
    public void mo7002a(String str) {
        C1679d.m8416c(str);
        this.f5624b.add(str);
    }

    /* renamed from: b */
    public Rect mo7003b() {
        return this.f5632j;
    }

    /* renamed from: c */
    public C3479h<C1559d> mo7004c() {
        return this.f5629g;
    }

    /* renamed from: d */
    public float mo7005d() {
        return (float) ((long) ((mo7006e() / this.f5635m) * 1000.0f));
    }

    /* renamed from: e */
    public float mo7006e() {
        return this.f5634l - this.f5633k;
    }

    /* renamed from: f */
    public float mo7007f() {
        return this.f5634l;
    }

    /* renamed from: g */
    public Map<String, C1558c> mo7008g() {
        return this.f5627e;
    }

    /* renamed from: h */
    public float mo7009h(float f) {
        return C1682g.m8452k(this.f5633k, this.f5634l, f);
    }

    /* renamed from: i */
    public float mo7010i() {
        return this.f5635m;
    }

    /* renamed from: j */
    public Map<String, C1489g> mo7011j() {
        return this.f5626d;
    }

    /* renamed from: k */
    public List<C1610d> mo7012k() {
        return this.f5631i;
    }

    /* renamed from: l */
    public C1563h mo7013l(String str) {
        int size = this.f5628f.size();
        for (int i = 0; i < size; i++) {
            C1563h hVar = this.f5628f.get(i);
            if (hVar.mo7240a(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int mo7014m() {
        return this.f5637o;
    }

    /* renamed from: n */
    public C1498n mo7015n() {
        return this.f5623a;
    }

    /* renamed from: o */
    public List<C1610d> mo7016o(String str) {
        return this.f5625c.get(str);
    }

    /* renamed from: p */
    public float mo7017p() {
        return this.f5633k;
    }

    /* renamed from: q */
    public boolean mo7018q() {
        return this.f5636n;
    }

    /* renamed from: r */
    public void mo7019r(int i) {
        this.f5637o += i;
    }

    /* renamed from: s */
    public void mo7020s(Rect rect, float f, float f2, float f3, List<C1610d> list, C3470d<C1610d> dVar, Map<String, List<C1610d>> map, Map<String, C1489g> map2, C3479h<C1559d> hVar, Map<String, C1558c> map3, List<C1563h> list2) {
        this.f5632j = rect;
        this.f5633k = f;
        this.f5634l = f2;
        this.f5635m = f3;
        this.f5631i = list;
        this.f5630h = dVar;
        this.f5625c = map;
        this.f5626d = map2;
        this.f5629g = hVar;
        this.f5627e = map3;
        this.f5628f = list2;
    }

    /* renamed from: t */
    public C1610d mo7021t(long j) {
        return this.f5630h.mo12304h(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C1610d y : this.f5631i) {
            sb.append(y.mo7398y("\t"));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo7023u(boolean z) {
        this.f5636n = z;
    }

    /* renamed from: v */
    public void mo7024v(boolean z) {
        this.f5623a.mo7128b(z);
    }
}
