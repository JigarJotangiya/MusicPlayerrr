package p402l.p406b.p426c.p431t.p432k0;

import java.nio.ByteBuffer;
import p402l.p406b.p426c.C9127g;
import p402l.p406b.p426c.p429r.C9152g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.k0.z */
/* compiled from: FrameBodyUnsupported */
public class C9228z extends C9203c implements C9206d0, C9204c0 {

    /* renamed from: k */
    private String f35919k = BuildConfig.FLAVOR;

    public C9228z() {
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9228z) && this.f35919k.equals(((C9228z) obj).f35919k) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo31857g() {
        return this.f35919k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo31948t() {
        this.f35860i.add(new C9152g("Data", this));
    }

    public String toString() {
        return mo31857g();
    }

    public C9228z(String str) {
        this.f35919k = str;
    }

    public C9228z(String str, byte[] bArr) {
        this.f35919k = str;
        mo31946r("Data", bArr);
    }

    public C9228z(C9228z zVar) {
        super(zVar);
        this.f35919k = zVar.f35919k;
    }

    public C9228z(ByteBuffer byteBuffer, int i) throws C9127g {
        super(byteBuffer, i);
    }
}
