package p402l.p406b.p426c.p429r;

import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.f */
/* compiled from: BooleanString */
public class C9151f extends C9146a {
    public C9151f(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: c */
    public int mo31776c() {
        return 1;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        this.f35771a = Boolean.valueOf(bArr[i] != 48);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9151f) && super.equals(obj);
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        byte[] bArr = new byte[1];
        Object obj = this.f35771a;
        if (obj == null) {
            bArr[0] = 48;
        } else if (((Boolean) obj).booleanValue()) {
            bArr[0] = 48;
        } else {
            bArr[0] = 49;
        }
        return bArr;
    }

    public String toString() {
        return BuildConfig.FLAVOR + this.f35771a;
    }
}
