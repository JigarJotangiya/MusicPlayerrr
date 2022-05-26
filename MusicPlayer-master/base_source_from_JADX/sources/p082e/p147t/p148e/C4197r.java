package p082e.p147t.p148e;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4150f;
import p082e.p147t.p148e.C4168j0;

/* renamed from: e.t.e.r */
/* compiled from: GridModel */
final class C4197r<K> {

    /* renamed from: a */
    private final C4199b<K> f12558a;

    /* renamed from: b */
    private final C4206t<K> f12559b;

    /* renamed from: c */
    private final C4168j0.C4175c<K> f12560c;

    /* renamed from: d */
    private final List<C4203f<K>> f12561d = new ArrayList();

    /* renamed from: e */
    private final SparseArray<SparseIntArray> f12562e = new SparseArray<>();

    /* renamed from: f */
    private final List<C4200c> f12563f = new ArrayList();

    /* renamed from: g */
    private final List<C4200c> f12564g = new ArrayList();

    /* renamed from: h */
    private final SparseBooleanArray f12565h = new SparseBooleanArray();

    /* renamed from: i */
    private final Set<K> f12566i = new LinkedHashSet();

    /* renamed from: j */
    private Point f12567j;

    /* renamed from: k */
    private C4202e f12568k;

    /* renamed from: l */
    private C4202e f12569l;

    /* renamed from: m */
    private boolean f12570m;

    /* renamed from: n */
    private int f12571n = -1;

    /* renamed from: o */
    private final RecyclerView.C0817t f12572o;

    /* renamed from: e.t.e.r$a */
    /* compiled from: GridModel */
    class C4198a extends RecyclerView.C0817t {
        C4198a() {
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            C4197r.this.mo14369q(recyclerView, i, i2);
        }
    }

    /* renamed from: e.t.e.r$b */
    /* compiled from: GridModel */
    static abstract class C4199b<K> extends C4150f.C4153c<K> {
        C4199b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract Point mo14280e(Point point);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract Rect mo14281f(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract int mo14282g(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract int mo14283h();

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract int mo14284i();

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract boolean mo14285j(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract void mo14286k(RecyclerView.C0817t tVar);
    }

    /* renamed from: e.t.e.r$c */
    /* compiled from: GridModel */
    private static class C4200c implements Comparable<C4200c> {

        /* renamed from: g */
        public int f12574g;

        /* renamed from: h */
        public int f12575h;

        C4200c(int i, int i2) {
            this.f12574g = i;
            this.f12575h = i2;
        }

        /* renamed from: c */
        public int compareTo(C4200c cVar) {
            return this.f12574g - cVar.f12574g;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4200c)) {
                return false;
            }
            C4200c cVar = (C4200c) obj;
            if (cVar.f12574g == this.f12574g && cVar.f12575h == this.f12575h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f12574g ^ this.f12575h;
        }

        public String toString() {
            return "(" + this.f12574g + ", " + this.f12575h + ")";
        }
    }

    /* renamed from: e.t.e.r$d */
    /* compiled from: GridModel */
    private static class C4201d implements Comparable<C4201d> {

        /* renamed from: g */
        public final int f12576g;

        /* renamed from: h */
        public C4200c f12577h;

        /* renamed from: i */
        public C4200c f12578i;

        /* renamed from: j */
        public C4200c f12579j;

        /* renamed from: k */
        public C4200c f12580k;

        C4201d(List<C4200c> list, int i) {
            int binarySearch = Collections.binarySearch(list, new C4200c(i, i));
            if (binarySearch >= 0) {
                this.f12576g = 3;
                this.f12577h = list.get(binarySearch);
                return;
            }
            int i2 = ~binarySearch;
            if (i2 == 0) {
                this.f12576g = 1;
                this.f12579j = list.get(0);
            } else if (i2 == list.size()) {
                C4200c cVar = list.get(list.size() - 1);
                if (cVar.f12574g > i || i > cVar.f12575h) {
                    this.f12576g = 0;
                    this.f12580k = cVar;
                    return;
                }
                this.f12576g = 3;
                this.f12577h = cVar;
            } else {
                int i3 = i2 - 1;
                C4200c cVar2 = list.get(i3);
                if (cVar2.f12574g > i || i > cVar2.f12575h) {
                    this.f12576g = 2;
                    this.f12577h = list.get(i3);
                    this.f12578i = list.get(i2);
                    return;
                }
                this.f12576g = 3;
                this.f12577h = list.get(i3);
            }
        }

        /* renamed from: c */
        public int compareTo(C4201d dVar) {
            return mo14380d() - dVar.mo14380d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo14380d() {
            int i = this.f12576g;
            if (i == 1) {
                return this.f12579j.f12574g - 1;
            }
            if (i == 0) {
                return this.f12580k.f12575h + 1;
            }
            if (i == 2) {
                return this.f12577h.f12575h + 1;
            }
            return this.f12577h.f12574g;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof C4201d) && mo14380d() == ((C4201d) obj).mo14380d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f12579j.f12574g ^ this.f12580k.f12575h;
            C4200c cVar = this.f12577h;
            return (i ^ cVar.f12575h) ^ cVar.f12574g;
        }
    }

    /* renamed from: e.t.e.r$e */
    /* compiled from: GridModel */
    private static class C4202e {

        /* renamed from: a */
        final C4201d f12581a;

        /* renamed from: b */
        final C4201d f12582b;

        C4202e(C4201d dVar, C4201d dVar2) {
            this.f12581a = dVar;
            this.f12582b = dVar2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4202e)) {
                return false;
            }
            C4202e eVar = (C4202e) obj;
            if (!this.f12581a.equals(eVar.f12581a) || !this.f12582b.equals(eVar.f12582b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f12581a.mo14380d() ^ this.f12582b.mo14380d();
        }
    }

    /* renamed from: e.t.e.r$f */
    /* compiled from: GridModel */
    public static abstract class C4203f<K> {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo14270a(Set<K> set);
    }

    C4197r(C4199b<K> bVar, C4206t<K> tVar, C4168j0.C4175c<K> cVar) {
        boolean z = true;
        C3703i.m15824a(bVar != null);
        C3703i.m15824a(tVar != null);
        C3703i.m15824a(cVar == null ? false : z);
        this.f12558a = bVar;
        this.f12559b = tVar;
        this.f12560c = cVar;
        C4198a aVar = new C4198a();
        this.f12572o = aVar;
        bVar.mo14271a(aVar);
    }

    /* renamed from: b */
    private boolean m18467b(C4202e eVar, C4202e eVar2) {
        return m18472h(eVar.f12581a, eVar2.f12581a) && m18472h(eVar.f12582b, eVar2.f12582b);
    }

    /* renamed from: c */
    private boolean m18468c(K k) {
        return this.f12560c.mo14326c(k, true);
    }

    /* renamed from: d */
    private Rect m18469d() {
        Rect rect = new Rect();
        rect.left = m18473i(m18477n(this.f12568k.f12581a, this.f12569l.f12581a), this.f12563f, true);
        rect.right = m18473i(m18476m(this.f12568k.f12581a, this.f12569l.f12581a), this.f12563f, false);
        rect.top = m18473i(m18477n(this.f12568k.f12582b, this.f12569l.f12582b), this.f12564g, true);
        rect.bottom = m18473i(m18476m(this.f12568k.f12582b, this.f12569l.f12582b), this.f12564g, false);
        return rect;
    }

    /* renamed from: e */
    private int m18470e() {
        C4201d dVar = this.f12568k.f12582b;
        int i = dVar.equals(m18477n(dVar, this.f12569l.f12582b)) ? 0 : 1;
        C4201d dVar2 = this.f12568k.f12581a;
        return dVar2.equals(m18477n(dVar2, this.f12569l.f12581a)) ? i | 0 : i | 2;
    }

    /* renamed from: f */
    private void m18471f() {
        if (m18467b(this.f12569l, this.f12568k)) {
            m18484z(m18469d());
            return;
        }
        this.f12566i.clear();
        this.f12571n = -1;
    }

    /* renamed from: h */
    private boolean m18472h(C4201d dVar, C4201d dVar2) {
        int i = dVar.f12576g;
        if (i == 1 && dVar2.f12576g == 1) {
            return false;
        }
        if (i == 0 && dVar2.f12576g == 0) {
            return false;
        }
        return i != 2 || dVar2.f12576g != 2 || !dVar.f12577h.equals(dVar2.f12577h) || !dVar.f12578i.equals(dVar2.f12578i);
    }

    /* renamed from: i */
    private int m18473i(C4201d dVar, List<C4200c> list, boolean z) {
        int i = dVar.f12576g;
        if (i == 0) {
            return list.get(list.size() - 1).f12575h;
        }
        if (i == 1) {
            return list.get(0).f12574g;
        }
        if (i != 2) {
            if (i == 3) {
                return dVar.f12577h.f12574g;
            }
            throw new RuntimeException("Invalid coordinate value.");
        } else if (z) {
            return dVar.f12578i.f12574g;
        } else {
            return dVar.f12577h.f12575h;
        }
    }

    /* renamed from: k */
    private boolean m18474k() {
        return this.f12563f.size() == 0 || this.f12564g.size() == 0;
    }

    /* renamed from: l */
    private boolean m18475l(int i, int i2, int i3, int i4, int i5, int i6) {
        int e = m18470e();
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    if (e == 3) {
                        return i4 == i6;
                    }
                    throw new RuntimeException("Invalid corner type.");
                } else if (i == i3 && i4 == i5) {
                    return true;
                } else {
                    return false;
                }
            } else if (i == i2 && i4 == i6) {
                return true;
            } else {
                return false;
            }
        } else if (i == i2 && i4 == i5) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: m */
    private C4201d m18476m(C4201d dVar, C4201d dVar2) {
        return dVar.compareTo(dVar2) > 0 ? dVar : dVar2;
    }

    /* renamed from: n */
    private C4201d m18477n(C4201d dVar, C4201d dVar2) {
        return dVar.compareTo(dVar2) < 0 ? dVar : dVar2;
    }

    /* renamed from: o */
    private void m18478o() {
        for (C4203f<K> a : this.f12561d) {
            a.mo14270a(this.f12566i);
        }
    }

    /* renamed from: r */
    private void m18479r(Rect rect, int i) {
        if (this.f12563f.size() != this.f12558a.mo14283h()) {
            m18480s(this.f12563f, new C4200c(rect.left, rect.right));
        }
        m18480s(this.f12564g, new C4200c(rect.top, rect.bottom));
        SparseIntArray sparseIntArray = this.f12562e.get(rect.left);
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray();
            this.f12562e.put(rect.left, sparseIntArray);
        }
        sparseIntArray.put(rect.top, i);
    }

    /* renamed from: s */
    private void m18480s(List<C4200c> list, C4200c cVar) {
        int binarySearch = Collections.binarySearch(list, cVar);
        if (binarySearch < 0) {
            list.add(~binarySearch, cVar);
        }
    }

    /* renamed from: t */
    private void m18481t() {
        for (int i = 0; i < this.f12558a.mo14284i(); i++) {
            int g = this.f12558a.mo14282g(i);
            if (this.f12558a.mo14285j(g) && this.f12560c.mo14325b(g, true) && !this.f12565h.get(g)) {
                this.f12565h.put(g, true);
                m18479r(this.f12558a.mo14281f(i), g);
            }
        }
    }

    /* renamed from: x */
    private void m18482x() {
        C4202e eVar = this.f12569l;
        C4202e g = mo14366g(this.f12567j);
        this.f12569l = g;
        if (!g.equals(eVar)) {
            m18471f();
            m18478o();
        }
    }

    /* renamed from: y */
    private void m18483y(int i, int i2, int i3, int i4) {
        this.f12566i.clear();
        for (int i5 = i; i5 <= i2; i5++) {
            SparseIntArray sparseIntArray = this.f12562e.get(this.f12563f.get(i5).f12574g);
            for (int i6 = i3; i6 <= i4; i6++) {
                int i7 = sparseIntArray.get(this.f12564g.get(i6).f12574g, -1);
                if (i7 != -1) {
                    K a = this.f12559b.mo10099a(i7);
                    if (a != null && m18468c(a)) {
                        this.f12566i.add(a);
                    }
                    if (m18475l(i5, i, i2, i6, i3, i4)) {
                        this.f12571n = i7;
                    }
                }
            }
        }
    }

    /* renamed from: z */
    private void m18484z(Rect rect) {
        List<C4200c> list = this.f12563f;
        int i = rect.left;
        int binarySearch = Collections.binarySearch(list, new C4200c(i, i));
        C3703i.m15825b(binarySearch >= 0, "Rect doesn't intesect any known column.");
        int i2 = binarySearch;
        int i3 = i2;
        while (i2 < this.f12563f.size() && this.f12563f.get(i2).f12574g <= rect.right) {
            i3 = i2;
            i2++;
        }
        List<C4200c> list2 = this.f12564g;
        int i4 = rect.top;
        int binarySearch2 = Collections.binarySearch(list2, new C4200c(i4, i4));
        if (binarySearch2 < 0) {
            this.f12571n = -1;
            return;
        }
        int i5 = binarySearch2;
        int i6 = i5;
        while (i5 < this.f12564g.size() && this.f12564g.get(i5).f12574g <= rect.bottom) {
            i6 = i5;
            i5++;
        }
        m18483y(binarySearch, i3, binarySearch2, i6);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14365a(C4203f<K> fVar) {
        this.f12561d.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C4202e mo14366g(Point point) {
        return new C4202e(new C4201d(this.f12563f, point.x), new C4201d(this.f12564g, point.y));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo14367j() {
        return this.f12571n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo14368p() {
        this.f12561d.clear();
        this.f12558a.mo14286k(this.f12572o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo14369q(RecyclerView recyclerView, int i, int i2) {
        if (this.f12570m) {
            Point point = this.f12567j;
            point.x += i;
            point.y += i2;
            m18481t();
            m18482x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo14370u(Point point) {
        this.f12567j = this.f12558a.mo14280e(point);
        m18482x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo14371v(Point point) {
        m18481t();
        if (!m18474k()) {
            this.f12570m = true;
            Point e = this.f12558a.mo14280e(point);
            this.f12567j = e;
            this.f12568k = mo14366g(e);
            this.f12569l = mo14366g(this.f12567j);
            m18471f();
            m18478o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo14372w() {
        this.f12570m = false;
    }
}
