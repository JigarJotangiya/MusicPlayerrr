package p082e.p099f.p100a.p104m.p105o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.m.o.f */
/* compiled from: DependencyNode */
public class C3548f implements C3546d {

    /* renamed from: a */
    public C3546d f11523a = null;

    /* renamed from: b */
    public boolean f11524b = false;

    /* renamed from: c */
    public boolean f11525c = false;

    /* renamed from: d */
    C3562p f11526d;

    /* renamed from: e */
    C3549a f11527e = C3549a.UNKNOWN;

    /* renamed from: f */
    int f11528f;

    /* renamed from: g */
    public int f11529g;

    /* renamed from: h */
    int f11530h = 1;

    /* renamed from: i */
    C3550g f11531i = null;

    /* renamed from: j */
    public boolean f11532j = false;

    /* renamed from: k */
    List<C3546d> f11533k = new ArrayList();

    /* renamed from: l */
    List<C3548f> f11534l = new ArrayList();

    /* renamed from: e.f.a.m.o.f$a */
    /* compiled from: DependencyNode */
    enum C3549a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C3548f(C3562p pVar) {
        this.f11526d = pVar;
    }

    /* renamed from: a */
    public void mo12819a(C3546d dVar) {
        for (C3548f fVar : this.f11534l) {
            if (!fVar.f11532j) {
                return;
            }
        }
        this.f11525c = true;
        C3546d dVar2 = this.f11523a;
        if (dVar2 != null) {
            dVar2.mo12819a(this);
        }
        if (this.f11524b) {
            this.f11526d.mo12819a(this);
            return;
        }
        C3548f fVar2 = null;
        int i = 0;
        for (C3548f next : this.f11534l) {
            if (!(next instanceof C3550g)) {
                i++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.f11532j) {
            C3550g gVar = this.f11531i;
            if (gVar != null) {
                if (gVar.f11532j) {
                    this.f11528f = this.f11530h * gVar.f11529g;
                } else {
                    return;
                }
            }
            mo12837d(fVar2.f11529g + this.f11528f);
        }
        C3546d dVar3 = this.f11523a;
        if (dVar3 != null) {
            dVar3.mo12819a(this);
        }
    }

    /* renamed from: b */
    public void mo12835b(C3546d dVar) {
        this.f11533k.add(dVar);
        if (this.f11532j) {
            dVar.mo12819a(dVar);
        }
    }

    /* renamed from: c */
    public void mo12836c() {
        this.f11534l.clear();
        this.f11533k.clear();
        this.f11532j = false;
        this.f11529g = 0;
        this.f11525c = false;
        this.f11524b = false;
    }

    /* renamed from: d */
    public void mo12837d(int i) {
        if (!this.f11532j) {
            this.f11532j = true;
            this.f11529g = i;
            for (C3546d next : this.f11533k) {
                next.mo12819a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11526d.f11556b.mo12712v());
        sb.append(":");
        sb.append(this.f11527e);
        sb.append("(");
        sb.append(this.f11532j ? Integer.valueOf(this.f11529g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f11534l.size());
        sb.append(":d=");
        sb.append(this.f11533k.size());
        sb.append(">");
        return sb.toString();
    }
}
