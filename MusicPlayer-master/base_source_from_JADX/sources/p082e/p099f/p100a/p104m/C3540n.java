package p082e.p099f.p100a.p104m;

import java.util.ArrayList;
import p082e.p099f.p100a.C3483c;

/* renamed from: e.f.a.m.n */
/* compiled from: WidgetContainer */
public class C3540n extends C3527e {

    /* renamed from: P0 */
    public ArrayList<C3527e> f11496P0 = new ArrayList<>();

    /* renamed from: b */
    public void mo12813b(C3527e eVar) {
        this.f11496P0.add(eVar);
        if (eVar.mo12639M() != null) {
            ((C3540n) eVar.mo12639M()).mo12815q1(eVar);
        }
        eVar.mo12666Z0(this);
    }

    /* renamed from: o1 */
    public ArrayList<C3527e> mo12814o1() {
        return this.f11496P0;
    }

    /* renamed from: p1 */
    public void mo12744p1() {
        ArrayList<C3527e> arrayList = this.f11496P0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3527e eVar = this.f11496P0.get(i);
                if (eVar instanceof C3540n) {
                    ((C3540n) eVar).mo12744p1();
                }
            }
        }
    }

    /* renamed from: q1 */
    public void mo12815q1(C3527e eVar) {
        this.f11496P0.remove(eVar);
        eVar.mo12707s0();
    }

    /* renamed from: r1 */
    public void mo12816r1() {
        this.f11496P0.clear();
    }

    /* renamed from: s0 */
    public void mo12707s0() {
        this.f11496P0.clear();
        super.mo12707s0();
    }

    /* renamed from: w0 */
    public void mo12715w0(C3483c cVar) {
        super.mo12715w0(cVar);
        int size = this.f11496P0.size();
        for (int i = 0; i < size; i++) {
            this.f11496P0.get(i).mo12715w0(cVar);
        }
    }
}
