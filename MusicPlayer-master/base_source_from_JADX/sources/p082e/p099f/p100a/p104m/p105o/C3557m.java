package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import p082e.p099f.p100a.p104m.C3530f;

/* renamed from: e.f.a.m.o.m */
/* compiled from: RunGroup */
class C3557m {

    /* renamed from: d */
    public static int f11542d;

    /* renamed from: a */
    public boolean f11543a;

    /* renamed from: b */
    C3562p f11544b = null;

    /* renamed from: c */
    ArrayList<C3562p> f11545c = new ArrayList<>();

    public C3557m(C3562p pVar, int i) {
        f11542d++;
        this.f11544b = pVar;
    }

    /* renamed from: c */
    private long m15481c(C3548f fVar, long j) {
        C3562p pVar = fVar.f11526d;
        if (pVar instanceof C3554k) {
            return j;
        }
        int size = fVar.f11533k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3546d dVar = fVar.f11533k.get(i);
            if (dVar instanceof C3548f) {
                C3548f fVar2 = (C3548f) dVar;
                if (fVar2.f11526d != pVar) {
                    j2 = Math.min(j2, m15481c(fVar2, ((long) fVar2.f11528f) + j));
                }
            }
        }
        if (fVar != pVar.f11563i) {
            return j2;
        }
        long j3 = j - pVar.mo12823j();
        return Math.min(Math.min(j2, m15481c(pVar.f11562h, j3)), j3 - ((long) pVar.f11562h.f11528f));
    }

    /* renamed from: d */
    private long m15482d(C3548f fVar, long j) {
        C3562p pVar = fVar.f11526d;
        if (pVar instanceof C3554k) {
            return j;
        }
        int size = fVar.f11533k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C3546d dVar = fVar.f11533k.get(i);
            if (dVar instanceof C3548f) {
                C3548f fVar2 = (C3548f) dVar;
                if (fVar2.f11526d != pVar) {
                    j2 = Math.max(j2, m15482d(fVar2, ((long) fVar2.f11528f) + j));
                }
            }
        }
        if (fVar != pVar.f11562h) {
            return j2;
        }
        long j3 = j + pVar.mo12823j();
        return Math.max(Math.max(j2, m15482d(pVar.f11563i, j3)), j3 - ((long) pVar.f11563i.f11528f));
    }

    /* renamed from: a */
    public void mo12841a(C3562p pVar) {
        this.f11545c.add(pVar);
    }

    /* renamed from: b */
    public long mo12842b(C3530f fVar, int i) {
        int i2;
        long j;
        C3562p pVar = this.f11544b;
        long j2 = 0;
        if (pVar instanceof C3545c) {
            if (((C3545c) pVar).f11560f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(pVar instanceof C3555l)) {
                return 0;
            }
        } else if (!(pVar instanceof C3558n)) {
            return 0;
        }
        C3548f fVar2 = (i == 0 ? fVar.f11361d : fVar.f11363e).f11562h;
        C3548f fVar3 = (i == 0 ? fVar.f11361d : fVar.f11363e).f11563i;
        boolean contains = pVar.f11562h.f11534l.contains(fVar2);
        boolean contains2 = this.f11544b.f11563i.f11534l.contains(fVar3);
        long j3 = this.f11544b.mo12823j();
        if (contains && contains2) {
            long d = m15482d(this.f11544b.f11562h, 0);
            long c = m15481c(this.f11544b.f11563i, 0);
            long j4 = d - j3;
            C3562p pVar2 = this.f11544b;
            int i3 = pVar2.f11563i.f11528f;
            if (j4 >= ((long) (-i3))) {
                j4 += (long) i3;
            }
            int i4 = pVar2.f11562h.f11528f;
            long j5 = ((-c) - j3) - ((long) i4);
            if (j5 >= ((long) i4)) {
                j5 -= (long) i4;
            }
            float s = pVar2.f11556b.mo12706s(i);
            if (s > 0.0f) {
                j2 = (long) ((((float) j5) / s) + (((float) j4) / (1.0f - s)));
            }
            float f = (float) j2;
            long j6 = ((long) ((f * s) + 0.5f)) + j3 + ((long) ((f * (1.0f - s)) + 0.5f));
            C3562p pVar3 = this.f11544b;
            j = ((long) pVar3.f11562h.f11528f) + j6;
            i2 = pVar3.f11563i.f11528f;
        } else if (contains) {
            C3548f fVar4 = this.f11544b.f11562h;
            return Math.max(m15482d(fVar4, (long) fVar4.f11528f), ((long) this.f11544b.f11562h.f11528f) + j3);
        } else if (contains2) {
            C3548f fVar5 = this.f11544b.f11563i;
            return Math.max(-m15481c(fVar5, (long) fVar5.f11528f), ((long) (-this.f11544b.f11563i.f11528f)) + j3);
        } else {
            C3562p pVar4 = this.f11544b;
            j = ((long) pVar4.f11562h.f11528f) + pVar4.mo12823j();
            i2 = this.f11544b.f11563i.f11528f;
        }
        return j - ((long) i2);
    }
}
