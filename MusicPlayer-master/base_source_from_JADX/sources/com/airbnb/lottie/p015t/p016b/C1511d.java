package com.airbnb.lottie.p015t.p016b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1551p;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.C1561f;
import com.airbnb.lottie.p019v.p020j.C1576l;
import com.airbnb.lottie.p019v.p021k.C1581c;
import com.airbnb.lottie.p019v.p021k.C1596o;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.d */
/* compiled from: ContentGroup */
public class C1511d implements C1512e, C1521m, C1529a.C1531b, C1561f {

    /* renamed from: a */
    private Paint f5784a;

    /* renamed from: b */
    private RectF f5785b;

    /* renamed from: c */
    private final Matrix f5786c;

    /* renamed from: d */
    private final Path f5787d;

    /* renamed from: e */
    private final RectF f5788e;

    /* renamed from: f */
    private final String f5789f;

    /* renamed from: g */
    private final boolean f5790g;

    /* renamed from: h */
    private final List<C1510c> f5791h;

    /* renamed from: i */
    private final C1473f f5792i;

    /* renamed from: j */
    private List<C1521m> f5793j;

    /* renamed from: k */
    private C1551p f5794k;

    public C1511d(C1473f fVar, C1604a aVar, C1596o oVar) {
        this(fVar, aVar, oVar.mo7333c(), oVar.mo7334d(), m7785e(fVar, aVar, oVar.mo7332b()), m7786h(oVar.mo7332b()));
    }

    /* renamed from: e */
    private static List<C1510c> m7785e(C1473f fVar, C1604a aVar, List<C1581c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C1510c a = list.get(i).mo7249a(fVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    static C1576l m7786h(List<C1581c> list) {
        for (int i = 0; i < list.size(); i++) {
            C1581c cVar = list.get(i);
            if (cVar instanceof C1576l) {
                return (C1576l) cVar;
            }
        }
        return null;
    }

    /* renamed from: k */
    private boolean m7787k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f5791h.size(); i2++) {
            if ((this.f5791h.get(i2) instanceof C1512e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo7132a() {
        this.f5792i.invalidateSelf();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f5791h.size());
        arrayList.addAll(list);
        for (int size = this.f5791h.size() - 1; size >= 0; size--) {
            C1510c cVar = this.f5791h.get(size);
            cVar.mo7133b(arrayList, this.f5791h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        if (eVar.mo7234g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo7230a(getName());
                if (eVar.mo7231c(getName(), i)) {
                    list.add(eVar2.mo7236i(this));
                }
            }
            if (eVar.mo7235h(getName(), i)) {
                int e = i + eVar.mo7233e(getName(), i);
                for (int i2 = 0; i2 < this.f5791h.size(); i2++) {
                    C1510c cVar = this.f5791h.get(i2);
                    if (cVar instanceof C1561f) {
                        ((C1561f) cVar).mo7134c(eVar, e, list, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        this.f5786c.set(matrix);
        C1551p pVar = this.f5794k;
        if (pVar != null) {
            this.f5786c.preConcat(pVar.mo7206f());
        }
        this.f5788e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f5791h.size() - 1; size >= 0; size--) {
            C1510c cVar = this.f5791h.get(size);
            if (cVar instanceof C1512e) {
                ((C1512e) cVar).mo7135d(this.f5788e, this.f5786c, z);
                rectF.union(this.f5788e);
            }
        }
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f5790g) {
            this.f5786c.set(matrix);
            C1551p pVar = this.f5794k;
            if (pVar != null) {
                this.f5786c.preConcat(pVar.mo7206f());
                i = (int) ((((((float) (this.f5794k.mo7208h() == null ? 100 : this.f5794k.mo7208h().mo7157h().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z = this.f5792i.mo7046J() && m7787k() && i != 255;
            if (z) {
                this.f5785b.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo7135d(this.f5785b, this.f5786c, true);
                this.f5784a.setAlpha(i);
                C1683h.m8467m(canvas, this.f5785b, this.f5784a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f5791h.size() - 1; size >= 0; size--) {
                C1510c cVar = this.f5791h.get(size);
                if (cVar instanceof C1512e) {
                    ((C1512e) cVar).mo7136f(canvas, this.f5786c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        C1551p pVar = this.f5794k;
        if (pVar != null) {
            pVar.mo7204c(t, cVar);
        }
    }

    public String getName() {
        return this.f5789f;
    }

    public Path getPath() {
        this.f5786c.reset();
        C1551p pVar = this.f5794k;
        if (pVar != null) {
            this.f5786c.set(pVar.mo7206f());
        }
        this.f5787d.reset();
        if (this.f5790g) {
            return this.f5787d;
        }
        for (int size = this.f5791h.size() - 1; size >= 0; size--) {
            C1510c cVar = this.f5791h.get(size);
            if (cVar instanceof C1521m) {
                this.f5787d.addPath(((C1521m) cVar).getPath(), this.f5786c);
            }
        }
        return this.f5787d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public List<C1521m> mo7142i() {
        if (this.f5793j == null) {
            this.f5793j = new ArrayList();
            for (int i = 0; i < this.f5791h.size(); i++) {
                C1510c cVar = this.f5791h.get(i);
                if (cVar instanceof C1521m) {
                    this.f5793j.add((C1521m) cVar);
                }
            }
        }
        return this.f5793j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Matrix mo7143j() {
        C1551p pVar = this.f5794k;
        if (pVar != null) {
            return pVar.mo7206f();
        }
        this.f5786c.reset();
        return this.f5786c;
    }

    C1511d(C1473f fVar, C1604a aVar, String str, boolean z, List<C1510c> list, C1576l lVar) {
        this.f5784a = new C1505a();
        this.f5785b = new RectF();
        this.f5786c = new Matrix();
        this.f5787d = new Path();
        this.f5788e = new RectF();
        this.f5789f = str;
        this.f5792i = fVar;
        this.f5790g = z;
        this.f5791h = list;
        if (lVar != null) {
            C1551p b = lVar.mo7250b();
            this.f5794k = b;
            b.mo7202a(aVar);
            this.f5794k.mo7203b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C1510c cVar = list.get(size);
            if (cVar instanceof C1517j) {
                arrayList.add((C1517j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C1517j) arrayList.get(size2)).mo7144e(list.listIterator(list.size()));
        }
    }
}
