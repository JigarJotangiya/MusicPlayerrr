package p082e.p147t.p148e;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4148e0;
import p082e.p147t.p148e.C4168j0;

/* renamed from: e.t.e.h */
/* compiled from: DefaultSelectionTracker */
public class C4160h<K> extends C4168j0<K> implements C4159g0 {

    /* renamed from: g */
    private final C4163h0<K> f12491g = new C4163h0<>();

    /* renamed from: h */
    private final List<C4168j0.C4174b<K>> f12492h = new ArrayList(1);

    /* renamed from: i */
    private final C4206t<K> f12493i;

    /* renamed from: j */
    private final C4168j0.C4175c<K> f12494j;

    /* renamed from: k */
    private final C4160h<K>.C1427b f12495k;

    /* renamed from: l */
    private final C4161a f12496l;

    /* renamed from: m */
    private final boolean f12497m;

    /* renamed from: n */
    private C4148e0 f12498n;

    /* renamed from: e.t.e.h$a */
    /* compiled from: DefaultSelectionTracker */
    private static final class C4161a extends RecyclerView.C0800j {

        /* renamed from: a */
        private final C4160h<?> f12499a;

        C4161a(C4160h<?> hVar) {
            C3703i.m15824a(hVar != null);
            this.f12499a = hVar;
        }

        /* renamed from: a */
        public void mo4834a() {
            this.f12499a.mo14288E();
        }

        /* renamed from: c */
        public void mo4836c(int i, int i2, Object obj) {
            if (!"Selection-Changed".equals(obj)) {
                this.f12499a.mo14288E();
            }
        }

        /* renamed from: d */
        public void mo4837d(int i, int i2) {
            this.f12499a.mo14309x();
        }

        /* renamed from: e */
        public void mo4838e(int i, int i2, int i3) {
            this.f12499a.mo14309x();
        }

        /* renamed from: f */
        public void mo4839f(int i, int i2) {
            this.f12499a.mo14309x();
            this.f12499a.mo14288E();
        }
    }

    /* renamed from: e.t.e.h$b */
    /* compiled from: DefaultSelectionTracker */
    private final class C4162b extends C4148e0.C4149a {
        C4162b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14268a(int i, int i2, boolean z, int i3) {
            if (i3 == 0) {
                C4160h.this.mo14290H(i, i2, z);
            } else if (i3 == 1) {
                C4160h.this.mo14289G(i, i2, z);
            } else {
                throw new IllegalArgumentException("Invalid range type: " + i3);
            }
        }
    }

    public C4160h(String str, C4206t<K> tVar, C4168j0.C4175c<K> cVar, C4177k0<K> k0Var) {
        boolean z = false;
        C3703i.m15824a(str != null);
        C3703i.m15824a(!str.trim().isEmpty());
        C3703i.m15824a(tVar != null);
        C3703i.m15824a(cVar != null);
        C3703i.m15824a(k0Var != null ? true : z);
        this.f12493i = tVar;
        this.f12494j = cVar;
        this.f12495k = new C4162b();
        this.f12497m = !cVar.mo14324a();
        this.f12496l = new C4161a(this);
    }

    /* renamed from: A */
    private void m18337A() {
        for (int size = this.f12492h.size() - 1; size >= 0; size--) {
            this.f12492h.get(size).mo10079b();
        }
    }

    /* renamed from: B */
    private void m18338B() {
        for (C4168j0.C4174b<K> c : this.f12492h) {
            c.mo14279c();
        }
    }

    /* renamed from: C */
    private void m18339C(C4163h0<K> h0Var) {
        for (K z : h0Var.f12501g) {
            m18346z(z, false);
        }
        for (K z2 : h0Var.f12502h) {
            m18346z(z2, false);
        }
    }

    /* renamed from: D */
    private void m18340D() {
        for (int size = this.f12492h.size() - 1; size >= 0; size--) {
            this.f12492h.get(size).mo14333d();
        }
    }

    /* renamed from: F */
    private boolean m18341F(Iterable<K> iterable, boolean z) {
        boolean z2 = false;
        for (K next : iterable) {
            boolean z3 = true;
            if (!z ? !m18342s(next, false) || !this.f12491g.remove(next) : !m18342s(next, true) || !this.f12491g.add(next)) {
                z3 = false;
            }
            if (z3) {
                m18346z(next, z);
            }
            z2 |= z3;
        }
        return z2;
    }

    /* renamed from: s */
    private boolean m18342s(K k, boolean z) {
        return this.f12494j.mo14326c(k, z);
    }

    /* renamed from: t */
    private void m18343t() {
        if (mo14299k()) {
            m18339C(m18344v());
            m18337A();
        }
    }

    /* renamed from: v */
    private C4163h0<K> m18344v() {
        this.f12498n = null;
        C4210x xVar = new C4210x();
        if (mo14299k()) {
            mo14308w(xVar);
            this.f12491g.clear();
        }
        return xVar;
    }

    /* renamed from: y */
    private void m18345y(int i, int i2) {
        if (!mo14300l()) {
            Log.e("DefaultSelectionTracker", "Ignoring attempt to extend unestablished range. Ignoring.");
        } else if (i == -1) {
            Log.w("DefaultSelectionTracker", "Ignoring attempt to extend range to invalid position: " + i);
        } else {
            this.f12498n.mo14266b(i, i2);
            m18337A();
        }
    }

    /* renamed from: z */
    private void m18346z(K k, boolean z) {
        C3703i.m15824a(k != null);
        for (int size = this.f12492h.size() - 1; size >= 0; size--) {
            this.f12492h.get(size).mo14332a(k, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo14288E() {
        if (this.f12491g.isEmpty()) {
            Log.d("DefaultSelectionTracker", "Ignoring onDataSetChange. No active selection.");
            return;
        }
        this.f12491g.mo14313d();
        m18340D();
        ArrayList<Object> arrayList = null;
        Iterator<K> it = this.f12491g.iterator();
        while (it.hasNext()) {
            K next = it.next();
            if (this.f12493i.mo10100b(next) == -1 || !m18342s(next, true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
            } else {
                for (int size = this.f12492h.size() - 1; size >= 0; size--) {
                    this.f12492h.get(size).mo14332a(next, true);
                }
            }
        }
        if (arrayList != null) {
            for (Object f : arrayList) {
                mo14294f(f);
            }
        }
        m18337A();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14289G(int r5, int r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 < r5) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            p082e.p109h.p118o.C3703i.m15824a(r2)
        L_0x000a:
            if (r5 > r6) goto L_0x0041
            e.t.e.t<K> r2 = r4.f12493i
            java.lang.Object r2 = r2.mo10099a(r5)
            if (r2 != 0) goto L_0x0015
            goto L_0x003e
        L_0x0015:
            if (r7 == 0) goto L_0x0031
            boolean r3 = r4.m18342s(r2, r1)
            if (r3 == 0) goto L_0x002f
            e.t.e.h0<K> r3 = r4.f12491g
            java.util.Set<K> r3 = r3.f12501g
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L_0x002f
            e.t.e.h0<K> r3 = r4.f12491g
            java.util.Set<K> r3 = r3.f12502h
            r3.add(r2)
            goto L_0x0038
        L_0x002f:
            r3 = 0
            goto L_0x0039
        L_0x0031:
            e.t.e.h0<K> r3 = r4.f12491g
            java.util.Set<K> r3 = r3.f12502h
            r3.remove(r2)
        L_0x0038:
            r3 = 1
        L_0x0039:
            if (r3 == 0) goto L_0x003e
            r4.m18346z(r2, r7)
        L_0x003e:
            int r5 = r5 + 1
            goto L_0x000a
        L_0x0041:
            r4.m18337A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p147t.p148e.C4160h.mo14289G(int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo14290H(int i, int i2, boolean z) {
        C3703i.m15824a(i2 >= i);
        while (i <= i2) {
            K a = this.f12493i.mo10099a(i);
            if (a != null) {
                if (z) {
                    mo14303o(a);
                } else {
                    mo14294f(a);
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    public void mo14260a() {
        mo14293e();
        this.f12498n = null;
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return mo14299k() || mo14300l();
    }

    /* renamed from: c */
    public void mo14291c(C4168j0.C4174b<K> bVar) {
        C3703i.m15824a(bVar != null);
        this.f12492h.add(bVar);
    }

    /* renamed from: d */
    public void mo14292d(int i) {
        C3703i.m15824a(i != -1);
        C3703i.m15824a(this.f12491g.contains(this.f12493i.mo10099a(i)));
        this.f12498n = new C4148e0(i, this.f12495k);
    }

    /* renamed from: e */
    public boolean mo14293e() {
        if (!mo14299k()) {
            return false;
        }
        mo14307u();
        m18343t();
        m18338B();
        return true;
    }

    /* renamed from: f */
    public boolean mo14294f(K k) {
        C3703i.m15824a(k != null);
        if (!this.f12491g.contains(k) || !m18342s(k, false)) {
            return false;
        }
        this.f12491g.remove(k);
        m18346z(k, false);
        m18337A();
        if (this.f12491g.isEmpty() && mo14300l()) {
            mo14309x();
        }
        return true;
    }

    /* renamed from: g */
    public void mo14295g(int i) {
        if (!this.f12497m) {
            m18345y(i, 1);
        }
    }

    /* renamed from: h */
    public void mo14296h(int i) {
        m18345y(i, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public RecyclerView.C0800j mo14297i() {
        return this.f12496l;
    }

    /* renamed from: j */
    public C4163h0<K> mo14298j() {
        return this.f12491g;
    }

    /* renamed from: k */
    public boolean mo14299k() {
        return !this.f12491g.isEmpty();
    }

    /* renamed from: l */
    public boolean mo14300l() {
        return this.f12498n != null;
    }

    /* renamed from: m */
    public boolean mo14301m(K k) {
        return this.f12491g.contains(k);
    }

    /* renamed from: n */
    public void mo14302n() {
        this.f12491g.mo14321t();
        m18337A();
    }

    /* renamed from: o */
    public boolean mo14303o(K k) {
        C3703i.m15824a(k != null);
        if (this.f12491g.contains(k) || !m18342s(k, true)) {
            return false;
        }
        if (this.f12497m && mo14299k()) {
            m18339C(m18344v());
        }
        this.f12491g.add(k);
        m18346z(k, true);
        m18337A();
        return true;
    }

    /* renamed from: p */
    public boolean mo14304p(Iterable<K> iterable, boolean z) {
        boolean F = m18341F(iterable, z);
        m18337A();
        return F;
    }

    /* renamed from: q */
    public void mo14305q(Set<K> set) {
        if (!this.f12497m) {
            for (Map.Entry next : this.f12491g.mo14323u(set).entrySet()) {
                m18346z(next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
            m18337A();
        }
    }

    /* renamed from: r */
    public void mo14306r(int i) {
        if (this.f12491g.contains(this.f12493i.mo10099a(i)) || mo14303o(this.f12493i.mo10099a(i))) {
            mo14292d(i);
        }
    }

    /* renamed from: u */
    public void mo14307u() {
        for (K z : this.f12491g.f12502h) {
            m18346z(z, false);
        }
        this.f12491g.mo14313d();
    }

    /* renamed from: w */
    public void mo14308w(C4210x<K> xVar) {
        xVar.mo14318p(this.f12491g);
    }

    /* renamed from: x */
    public void mo14309x() {
        this.f12498n = null;
        mo14307u();
    }
}
