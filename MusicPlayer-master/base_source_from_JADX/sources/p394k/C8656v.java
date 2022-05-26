package p394k;

import p369i.p387z.p389d.C8594l;

/* renamed from: k.v */
/* compiled from: Segment.kt */
public final class C8656v {

    /* renamed from: a */
    public final byte[] f35012a;

    /* renamed from: b */
    public int f35013b;

    /* renamed from: c */
    public int f35014c;

    /* renamed from: d */
    public boolean f35015d;

    /* renamed from: e */
    public boolean f35016e;

    /* renamed from: f */
    public C8656v f35017f;

    /* renamed from: g */
    public C8656v f35018g;

    public C8656v() {
        this.f35012a = new byte[8192];
        this.f35016e = true;
        this.f35015d = false;
    }

    /* renamed from: a */
    public final void mo30846a() {
        C8656v vVar = this.f35018g;
        int i = 0;
        if (vVar != this) {
            C8594l.m46769c(vVar);
            if (vVar.f35016e) {
                int i2 = this.f35014c - this.f35013b;
                C8656v vVar2 = this.f35018g;
                C8594l.m46769c(vVar2);
                int i3 = 8192 - vVar2.f35014c;
                C8656v vVar3 = this.f35018g;
                C8594l.m46769c(vVar3);
                if (!vVar3.f35015d) {
                    C8656v vVar4 = this.f35018g;
                    C8594l.m46769c(vVar4);
                    i = vVar4.f35013b;
                }
                if (i2 <= i3 + i) {
                    C8656v vVar5 = this.f35018g;
                    C8594l.m46769c(vVar5);
                    mo30851f(vVar5, i2);
                    mo30847b();
                    C8657w.m47057b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C8656v mo30847b() {
        C8656v vVar = this.f35017f;
        if (vVar == this) {
            vVar = null;
        }
        C8656v vVar2 = this.f35018g;
        C8594l.m46769c(vVar2);
        vVar2.f35017f = this.f35017f;
        C8656v vVar3 = this.f35017f;
        C8594l.m46769c(vVar3);
        vVar3.f35018g = this.f35018g;
        this.f35017f = null;
        this.f35018g = null;
        return vVar;
    }

    /* renamed from: c */
    public final C8656v mo30848c(C8656v vVar) {
        C8594l.m46771e(vVar, "segment");
        vVar.f35018g = this;
        vVar.f35017f = this.f35017f;
        C8656v vVar2 = this.f35017f;
        C8594l.m46769c(vVar2);
        vVar2.f35018g = vVar;
        this.f35017f = vVar;
        return vVar;
    }

    /* renamed from: d */
    public final C8656v mo30849d() {
        this.f35015d = true;
        return new C8656v(this.f35012a, this.f35013b, this.f35014c, true, false);
    }

    /* renamed from: e */
    public final C8656v mo30850e(int i) {
        C8656v vVar;
        if (i > 0 && i <= this.f35014c - this.f35013b) {
            if (i >= 1024) {
                vVar = mo30849d();
            } else {
                vVar = C8657w.m47058c();
                byte[] bArr = this.f35012a;
                byte[] bArr2 = vVar.f35012a;
                int i2 = this.f35013b;
                byte[] unused = C8475g.m46618e(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            vVar.f35014c = vVar.f35013b + i;
            this.f35013b += i;
            C8656v vVar2 = this.f35018g;
            C8594l.m46769c(vVar2);
            vVar2.mo30848c(vVar);
            return vVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final void mo30851f(C8656v vVar, int i) {
        C8594l.m46771e(vVar, "sink");
        if (vVar.f35016e) {
            int i2 = vVar.f35014c;
            if (i2 + i > 8192) {
                if (!vVar.f35015d) {
                    int i3 = vVar.f35013b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = vVar.f35012a;
                        byte[] unused = C8475g.m46618e(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        vVar.f35014c -= vVar.f35013b;
                        vVar.f35013b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f35012a;
            byte[] bArr3 = vVar.f35012a;
            int i4 = vVar.f35014c;
            int i5 = this.f35013b;
            byte[] unused2 = C8475g.m46616c(bArr2, bArr3, i4, i5, i5 + i);
            vVar.f35014c += i;
            this.f35013b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C8656v(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C8594l.m46771e(bArr, "data");
        this.f35012a = bArr;
        this.f35013b = i;
        this.f35014c = i2;
        this.f35015d = z;
        this.f35016e = z2;
    }
}
