package com.airbnb.lottie.p026y;

import android.view.Choreographer;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1464d;

/* renamed from: com.airbnb.lottie.y.e */
/* compiled from: LottieValueAnimator */
public class C1680e extends C1676a implements Choreographer.FrameCallback {

    /* renamed from: i */
    private float f6315i = 1.0f;

    /* renamed from: j */
    private boolean f6316j = false;

    /* renamed from: k */
    private long f6317k = 0;

    /* renamed from: l */
    private float f6318l = 0.0f;

    /* renamed from: m */
    private int f6319m = 0;

    /* renamed from: n */
    private float f6320n = -2.14748365E9f;

    /* renamed from: o */
    private float f6321o = 2.14748365E9f;

    /* renamed from: p */
    private C1464d f6322p;

    /* renamed from: q */
    protected boolean f6323q = false;

    /* renamed from: E */
    private void m8418E() {
        if (this.f6322p != null) {
            float f = this.f6318l;
            if (f < this.f6320n || f > this.f6321o) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f6320n), Float.valueOf(this.f6321o), Float.valueOf(this.f6318l)}));
            }
        }
    }

    /* renamed from: k */
    private float m8419k() {
        C1464d dVar = this.f6322p;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.mo7010i()) / Math.abs(this.f6315i);
    }

    /* renamed from: o */
    private boolean m8420o() {
        return mo7478n() < 0.0f;
    }

    /* renamed from: A */
    public void mo7462A(float f) {
        mo7463B(this.f6320n, f);
    }

    /* renamed from: B */
    public void mo7463B(float f, float f2) {
        if (f <= f2) {
            C1464d dVar = this.f6322p;
            float p = dVar == null ? -3.4028235E38f : dVar.mo7017p();
            C1464d dVar2 = this.f6322p;
            float f3 = dVar2 == null ? Float.MAX_VALUE : dVar2.mo7007f();
            float c = C1682g.m8444c(f, p, f3);
            float c2 = C1682g.m8444c(f2, p, f3);
            if (c != this.f6320n || c2 != this.f6321o) {
                this.f6320n = c;
                this.f6321o = c2;
                mo7488z((float) ((int) C1682g.m8444c(this.f6318l, c, c2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: C */
    public void mo7464C(int i) {
        mo7463B((float) i, (float) ((int) this.f6321o));
    }

    /* renamed from: D */
    public void mo7465D(float f) {
        this.f6315i = f;
    }

    public void cancel() {
        mo7446a();
        mo7483t();
    }

    public void doFrame(long j) {
        mo7481s();
        if (this.f6322p != null && isRunning()) {
            C1462c.m7603a("LottieValueAnimator#doFrame");
            long j2 = this.f6317k;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float k = ((float) j3) / m8419k();
            float f = this.f6318l;
            if (m8420o()) {
                k = -k;
            }
            float f2 = f + k;
            this.f6318l = f2;
            boolean z = !C1682g.m8446e(f2, mo7477m(), mo7476l());
            this.f6318l = C1682g.m8444c(this.f6318l, mo7477m(), mo7476l());
            this.f6317k = j;
            mo7452f();
            if (z) {
                if (getRepeatCount() == -1 || this.f6319m < getRepeatCount()) {
                    mo7450c();
                    this.f6319m++;
                    if (getRepeatMode() == 2) {
                        this.f6316j = !this.f6316j;
                        mo7486w();
                    } else {
                        this.f6318l = m8420o() ? mo7476l() : mo7477m();
                    }
                    this.f6317k = j;
                } else {
                    this.f6318l = this.f6315i < 0.0f ? mo7477m() : mo7476l();
                    mo7483t();
                    mo7449b(m8420o());
                }
            }
            m8418E();
            C1462c.m7604b("LottieValueAnimator#doFrame");
        }
    }

    /* renamed from: g */
    public void mo7468g() {
        this.f6322p = null;
        this.f6320n = -2.14748365E9f;
        this.f6321o = 2.14748365E9f;
    }

    public float getAnimatedFraction() {
        float m;
        float l;
        float m2;
        if (this.f6322p == null) {
            return 0.0f;
        }
        if (m8420o()) {
            m = mo7476l() - this.f6318l;
            l = mo7476l();
            m2 = mo7477m();
        } else {
            m = this.f6318l - mo7477m();
            l = mo7476l();
            m2 = mo7477m();
        }
        return m / (l - m2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo7473i());
    }

    public long getDuration() {
        C1464d dVar = this.f6322p;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.mo7005d();
    }

    /* renamed from: h */
    public void mo7472h() {
        mo7483t();
        mo7449b(m8420o());
    }

    /* renamed from: i */
    public float mo7473i() {
        C1464d dVar = this.f6322p;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.f6318l - dVar.mo7017p()) / (this.f6322p.mo7007f() - this.f6322p.mo7017p());
    }

    public boolean isRunning() {
        return this.f6323q;
    }

    /* renamed from: j */
    public float mo7475j() {
        return this.f6318l;
    }

    /* renamed from: l */
    public float mo7476l() {
        C1464d dVar = this.f6322p;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f6321o;
        return f == 2.14748365E9f ? dVar.mo7007f() : f;
    }

    /* renamed from: m */
    public float mo7477m() {
        C1464d dVar = this.f6322p;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f6320n;
        return f == -2.14748365E9f ? dVar.mo7017p() : f;
    }

    /* renamed from: n */
    public float mo7478n() {
        return this.f6315i;
    }

    /* renamed from: q */
    public void mo7479q() {
        mo7483t();
    }

    /* renamed from: r */
    public void mo7480r() {
        this.f6323q = true;
        mo7451e(m8420o());
        mo7488z((float) ((int) (m8420o() ? mo7476l() : mo7477m())));
        this.f6317k = 0;
        this.f6319m = 0;
        mo7481s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo7481s() {
        if (isRunning()) {
            mo7484u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f6316j) {
            this.f6316j = false;
            mo7486w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo7483t() {
        mo7484u(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo7484u(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f6323q = false;
        }
    }

    /* renamed from: v */
    public void mo7485v() {
        this.f6323q = true;
        mo7481s();
        this.f6317k = 0;
        if (m8420o() && mo7475j() == mo7477m()) {
            this.f6318l = mo7476l();
        } else if (!m8420o() && mo7475j() == mo7476l()) {
            this.f6318l = mo7477m();
        }
    }

    /* renamed from: w */
    public void mo7486w() {
        mo7465D(-mo7478n());
    }

    /* renamed from: y */
    public void mo7487y(C1464d dVar) {
        boolean z = this.f6322p == null;
        this.f6322p = dVar;
        if (z) {
            mo7463B((float) ((int) Math.max(this.f6320n, dVar.mo7017p())), (float) ((int) Math.min(this.f6321o, dVar.mo7007f())));
        } else {
            mo7463B((float) ((int) dVar.mo7017p()), (float) ((int) dVar.mo7007f()));
        }
        float f = this.f6318l;
        this.f6318l = 0.0f;
        mo7488z((float) ((int) f));
        mo7452f();
    }

    /* renamed from: z */
    public void mo7488z(float f) {
        if (this.f6318l != f) {
            this.f6318l = C1682g.m8444c(f, mo7477m(), mo7476l());
            this.f6317k = 0;
            mo7452f();
        }
    }
}
