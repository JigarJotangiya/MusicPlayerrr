package p082e.p099f.p100a.p104m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p082e.p099f.p100a.p104m.p105o.C3552i;
import p082e.p099f.p100a.p104m.p105o.C3560o;

/* renamed from: e.f.a.m.j */
/* compiled from: HelperWidget */
public class C3536j extends C3527e implements C3535i {

    /* renamed from: P0 */
    public C3527e[] f11482P0 = new C3527e[4];

    /* renamed from: Q0 */
    public int f11483Q0 = 0;

    /* renamed from: a */
    public void mo12787a() {
        this.f11483Q0 = 0;
        Arrays.fill(this.f11482P0, (Object) null);
    }

    /* renamed from: b */
    public void mo12788b(C3527e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f11483Q0 + 1;
            C3527e[] eVarArr = this.f11482P0;
            if (i > eVarArr.length) {
                this.f11482P0 = (C3527e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C3527e[] eVarArr2 = this.f11482P0;
            int i2 = this.f11483Q0;
            eVarArr2[i2] = eVar;
            this.f11483Q0 = i2 + 1;
        }
    }

    /* renamed from: c */
    public void mo12789c(C3530f fVar) {
    }

    /* renamed from: n */
    public void mo12580n(C3527e eVar, HashMap<C3527e, C3527e> hashMap) {
        super.mo12580n(eVar, hashMap);
        C3536j jVar = (C3536j) eVar;
        this.f11483Q0 = 0;
        int i = jVar.f11483Q0;
        for (int i2 = 0; i2 < i; i2++) {
            mo12788b(hashMap.get(jVar.f11482P0[i2]));
        }
    }

    /* renamed from: o1 */
    public void mo12790o1(ArrayList<C3560o> arrayList, int i, C3560o oVar) {
        for (int i2 = 0; i2 < this.f11483Q0; i2++) {
            oVar.mo12845a(this.f11482P0[i2]);
        }
        for (int i3 = 0; i3 < this.f11483Q0; i3++) {
            C3552i.m15458a(this.f11482P0[i3], i, arrayList, oVar);
        }
    }

    /* renamed from: p1 */
    public int mo12791p1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f11483Q0; i4++) {
            C3527e eVar = this.f11482P0[i4];
            if (i == 0 && (i3 = eVar.f11340M0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = eVar.f11342N0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
