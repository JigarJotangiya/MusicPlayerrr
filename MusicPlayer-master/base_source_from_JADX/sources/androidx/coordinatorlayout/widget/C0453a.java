package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p082e.p098e.C3478g;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3701g;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: DirectedAcyclicGraph */
public final class C0453a<T> {

    /* renamed from: a */
    private final C3700f<ArrayList<T>> f2511a = new C3701g(10);

    /* renamed from: b */
    private final C3478g<T, ArrayList<T>> f2512b = new C3478g<>();

    /* renamed from: c */
    private final ArrayList<T> f2513c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2514d = new HashSet<>();

    /* renamed from: e */
    private void m2934e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f2512b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2934e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m2935f() {
        ArrayList<T> b = this.f2511a.mo8513b();
        return b == null ? new ArrayList<>() : b;
    }

    /* renamed from: k */
    private void m2936k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2511a.mo8512a(arrayList);
    }

    /* renamed from: a */
    public void mo3107a(T t, T t2) {
        if (!this.f2512b.containsKey(t) || !this.f2512b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f2512b.get(t);
        if (arrayList == null) {
            arrayList = m2935f();
            this.f2512b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo3108b(T t) {
        if (!this.f2512b.containsKey(t)) {
            this.f2512b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo3109c() {
        int size = this.f2512b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2512b.mo12397m(i);
            if (m != null) {
                m2936k(m);
            }
        }
        this.f2512b.clear();
    }

    /* renamed from: d */
    public boolean mo3110d(T t) {
        return this.f2512b.containsKey(t);
    }

    /* renamed from: g */
    public List mo3111g(T t) {
        return this.f2512b.get(t);
    }

    /* renamed from: h */
    public List<T> mo3112h(T t) {
        int size = this.f2512b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2512b.mo12397m(i);
            if (m != null && m.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2512b.mo12395i(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo3113i() {
        this.f2513c.clear();
        this.f2514d.clear();
        int size = this.f2512b.size();
        for (int i = 0; i < size; i++) {
            m2934e(this.f2512b.mo12395i(i), this.f2513c, this.f2514d);
        }
        return this.f2513c;
    }

    /* renamed from: j */
    public boolean mo3114j(T t) {
        int size = this.f2512b.size();
        for (int i = 0; i < size; i++) {
            ArrayList m = this.f2512b.mo12397m(i);
            if (m != null && m.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
