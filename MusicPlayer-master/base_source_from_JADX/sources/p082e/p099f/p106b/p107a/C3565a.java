package p082e.p099f.p106b.p107a;

import androidx.constraintlayout.motion.widget.C0398o;
import p082e.p099f.p100a.p101k.p102a.C3513k;
import p082e.p099f.p100a.p101k.p102a.C3515m;
import p082e.p099f.p100a.p101k.p102a.C3516n;

/* renamed from: e.f.b.a.a */
/* compiled from: StopLogic */
public class C3565a extends C0398o {

    /* renamed from: a */
    private C3516n f11567a;

    /* renamed from: b */
    private C3513k f11568b;

    /* renamed from: c */
    private C3515m f11569c;

    public C3565a() {
        C3516n nVar = new C3516n();
        this.f11567a = nVar;
        this.f11569c = nVar;
    }

    /* renamed from: a */
    public float mo2510a() {
        return this.f11569c.mo12558b();
    }

    /* renamed from: b */
    public void mo12863b(float f, float f2, float f3, float f4, float f5, float f6) {
        C3516n nVar = this.f11567a;
        this.f11569c = nVar;
        nVar.mo12561d(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: c */
    public boolean mo12864c() {
        return this.f11569c.mo12557a();
    }

    /* renamed from: d */
    public void mo12865d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f11568b == null) {
            this.f11568b = new C3513k();
        }
        C3513k kVar = this.f11568b;
        this.f11569c = kVar;
        kVar.mo12559d(f, f2, f3, f4, f5, f6, f7, i);
    }

    public float getInterpolation(float f) {
        return this.f11569c.getInterpolation(f);
    }
}
