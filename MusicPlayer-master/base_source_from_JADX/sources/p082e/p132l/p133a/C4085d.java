package p082e.p132l.p133a;

import p082e.p132l.p133a.C4072b;

/* renamed from: e.l.a.d */
/* compiled from: SpringAnimation */
public final class C4085d extends C4072b<C4085d> {

    /* renamed from: s */
    private C4086e f12282s = null;

    /* renamed from: t */
    private float f12283t = Float.MAX_VALUE;

    /* renamed from: u */
    private boolean f12284u = false;

    public <K> C4085d(K k, C4084c<K> cVar) {
        super(k, cVar);
    }

    /* renamed from: o */
    private void m18075o() {
        C4086e eVar = this.f12282s;
        if (eVar != null) {
            double a = (double) eVar.mo14148a();
            if (a > ((double) this.f12274g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f12275h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: j */
    public void mo14127j() {
        m18075o();
        this.f12282s.mo14153g((double) mo14123e());
        super.mo14127j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo14128l(long j) {
        if (this.f12284u) {
            float f = this.f12283t;
            if (f != Float.MAX_VALUE) {
                this.f12282s.mo14151e(f);
                this.f12283t = Float.MAX_VALUE;
            }
            this.f12269b = this.f12282s.mo14148a();
            this.f12268a = 0.0f;
            this.f12284u = false;
            return true;
        }
        if (this.f12283t != Float.MAX_VALUE) {
            this.f12282s.mo14148a();
            long j2 = j / 2;
            C4072b.C4080h h = this.f12282s.mo14154h((double) this.f12269b, (double) this.f12268a, j2);
            this.f12282s.mo14151e(this.f12283t);
            this.f12283t = Float.MAX_VALUE;
            C4072b.C4080h h2 = this.f12282s.mo14154h((double) h.f12280a, (double) h.f12281b, j2);
            this.f12269b = h2.f12280a;
            this.f12268a = h2.f12281b;
        } else {
            C4072b.C4080h h3 = this.f12282s.mo14154h((double) this.f12269b, (double) this.f12268a, j);
            this.f12269b = h3.f12280a;
            this.f12268a = h3.f12281b;
        }
        float max = Math.max(this.f12269b, this.f12275h);
        this.f12269b = max;
        float min = Math.min(max, this.f12274g);
        this.f12269b = min;
        if (!mo14146n(min, this.f12268a)) {
            return false;
        }
        this.f12269b = this.f12282s.mo14148a();
        this.f12268a = 0.0f;
        return true;
    }

    /* renamed from: m */
    public void mo14145m(float f) {
        if (mo14124f()) {
            this.f12283t = f;
            return;
        }
        if (this.f12282s == null) {
            this.f12282s = new C4086e(f);
        }
        this.f12282s.mo14151e(f);
        mo14127j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo14146n(float f, float f2) {
        return this.f12282s.mo14149c(f, f2);
    }

    /* renamed from: p */
    public C4085d mo14147p(C4086e eVar) {
        this.f12282s = eVar;
        return this;
    }
}
