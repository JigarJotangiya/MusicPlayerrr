package p082e.p099f.p100a.p104m.p105o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.p104m.C3522b;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;

/* renamed from: e.f.a.m.o.o */
/* compiled from: WidgetGroup */
public class C3560o {

    /* renamed from: f */
    static int f11549f;

    /* renamed from: a */
    ArrayList<C3527e> f11550a = new ArrayList<>();

    /* renamed from: b */
    int f11551b = -1;

    /* renamed from: c */
    int f11552c = 0;

    /* renamed from: d */
    ArrayList<C3561a> f11553d = null;

    /* renamed from: e */
    private int f11554e = -1;

    /* renamed from: e.f.a.m.o.o$a */
    /* compiled from: WidgetGroup */
    class C3561a {
        public C3561a(C3560o oVar, C3527e eVar, C3484d dVar, int i) {
            new WeakReference(eVar);
            dVar.mo12483x(eVar.f11339M);
            dVar.mo12483x(eVar.f11341N);
            dVar.mo12483x(eVar.f11343O);
            dVar.mo12483x(eVar.f11344P);
            dVar.mo12483x(eVar.f11345Q);
        }
    }

    public C3560o(int i) {
        int i2 = f11549f;
        f11549f = i2 + 1;
        this.f11551b = i2;
        this.f11552c = i;
    }

    /* renamed from: e */
    private String m15491e() {
        int i = this.f11552c;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m15492j(C3484d dVar, ArrayList<C3527e> arrayList, int i) {
        int x;
        int x2;
        C3530f fVar = (C3530f) arrayList.get(0).mo12639M();
        dVar.mo12465D();
        fVar.mo12577g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo12577g(dVar, false);
        }
        if (i == 0 && fVar.f11419Z0 > 0) {
            C3522b.m15120b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.f11420a1 > 0) {
            C3522b.m15120b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.mo12484z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f11553d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f11553d.add(new C3561a(this, arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            x = dVar.mo12483x(fVar.f11339M);
            x2 = dVar.mo12483x(fVar.f11343O);
            dVar.mo12465D();
        } else {
            x = dVar.mo12483x(fVar.f11341N);
            x2 = dVar.mo12483x(fVar.f11344P);
            dVar.mo12465D();
        }
        return x2 - x;
    }

    /* renamed from: a */
    public boolean mo12845a(C3527e eVar) {
        if (this.f11550a.contains(eVar)) {
            return false;
        }
        this.f11550a.add(eVar);
        return true;
    }

    /* renamed from: b */
    public void mo12846b(ArrayList<C3560o> arrayList) {
        int size = this.f11550a.size();
        if (this.f11554e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C3560o oVar = arrayList.get(i);
                if (this.f11554e == oVar.f11551b) {
                    mo12850g(this.f11552c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int mo12847c() {
        return this.f11551b;
    }

    /* renamed from: d */
    public int mo12848d() {
        return this.f11552c;
    }

    /* renamed from: f */
    public int mo12849f(C3484d dVar, int i) {
        if (this.f11550a.size() == 0) {
            return 0;
        }
        return m15492j(dVar, this.f11550a, i);
    }

    /* renamed from: g */
    public void mo12850g(int i, C3560o oVar) {
        Iterator<C3527e> it = this.f11550a.iterator();
        while (it.hasNext()) {
            C3527e next = it.next();
            oVar.mo12845a(next);
            if (i == 0) {
                next.f11340M0 = oVar.mo12847c();
            } else {
                next.f11342N0 = oVar.mo12847c();
            }
        }
        this.f11554e = oVar.f11551b;
    }

    /* renamed from: h */
    public void mo12851h(boolean z) {
    }

    /* renamed from: i */
    public void mo12852i(int i) {
        this.f11552c = i;
    }

    public String toString() {
        String str = m15491e() + " [" + this.f11551b + "] <";
        Iterator<C3527e> it = this.f11550a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo12712v();
        }
        return str + " >";
    }
}
