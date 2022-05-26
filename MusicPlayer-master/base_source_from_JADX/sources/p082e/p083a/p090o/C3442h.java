package p082e.p083a.p090o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3710b0;
import p082e.p109h.p119p.C3790z;

/* renamed from: e.a.o.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C3442h {

    /* renamed from: a */
    final ArrayList<C3790z> f10959a = new ArrayList<>();

    /* renamed from: b */
    private long f10960b = -1;

    /* renamed from: c */
    private Interpolator f10961c;

    /* renamed from: d */
    C3706a0 f10962d;

    /* renamed from: e */
    private boolean f10963e;

    /* renamed from: f */
    private final C3710b0 f10964f = new C3443a();

    /* renamed from: e.a.o.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C3443a extends C3710b0 {

        /* renamed from: a */
        private boolean f10965a = false;

        /* renamed from: b */
        private int f10966b = 0;

        C3443a() {
        }

        /* renamed from: b */
        public void mo585b(View view) {
            int i = this.f10966b + 1;
            this.f10966b = i;
            if (i == C3442h.this.f10959a.size()) {
                C3706a0 a0Var = C3442h.this.f10962d;
                if (a0Var != null) {
                    a0Var.mo585b((View) null);
                }
                mo12212d();
            }
        }

        /* renamed from: c */
        public void mo586c(View view) {
            if (!this.f10965a) {
                this.f10965a = true;
                C3706a0 a0Var = C3442h.this.f10962d;
                if (a0Var != null) {
                    a0Var.mo586c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo12212d() {
            this.f10966b = 0;
            this.f10965a = false;
            C3442h.this.mo12205b();
        }
    }

    /* renamed from: a */
    public void mo12204a() {
        if (this.f10963e) {
            Iterator<C3790z> it = this.f10959a.iterator();
            while (it.hasNext()) {
                it.next().mo13224b();
            }
            this.f10963e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12205b() {
        this.f10963e = false;
    }

    /* renamed from: c */
    public C3442h mo12206c(C3790z zVar) {
        if (!this.f10963e) {
            this.f10959a.add(zVar);
        }
        return this;
    }

    /* renamed from: d */
    public C3442h mo12207d(C3790z zVar, C3790z zVar2) {
        this.f10959a.add(zVar);
        zVar2.mo13231j(zVar.mo13225c());
        this.f10959a.add(zVar2);
        return this;
    }

    /* renamed from: e */
    public C3442h mo12208e(long j) {
        if (!this.f10963e) {
            this.f10960b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C3442h mo12209f(Interpolator interpolator) {
        if (!this.f10963e) {
            this.f10961c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C3442h mo12210g(C3706a0 a0Var) {
        if (!this.f10963e) {
            this.f10962d = a0Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo12211h() {
        if (!this.f10963e) {
            Iterator<C3790z> it = this.f10959a.iterator();
            while (it.hasNext()) {
                C3790z next = it.next();
                long j = this.f10960b;
                if (j >= 0) {
                    next.mo13228f(j);
                }
                Interpolator interpolator = this.f10961c;
                if (interpolator != null) {
                    next.mo13229g(interpolator);
                }
                if (this.f10962d != null) {
                    next.mo13230h(this.f10964f);
                }
                next.mo13233l();
            }
            this.f10963e = true;
        }
    }
}
