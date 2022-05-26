package p402l.p406b.p426c.p429r;

import java.util.Objects;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.C9238m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.m */
/* compiled from: NumberVariableLength */
public class C9158m extends C9146a {

    /* renamed from: f */
    int f35790f = 1;

    public C9158m(String str, C9190g gVar, int i) {
        super(str, gVar);
        this.f35790f = i;
    }

    /* renamed from: c */
    public int mo31776c() {
        Object obj = this.f35771a;
        int i = 0;
        if (obj == null) {
            return 0;
        }
        long k = C9238m.m49072k(obj);
        for (int i2 = 1; i2 <= 8; i2++) {
            if ((((byte) ((int) k)) & 255) != 0) {
                i = i2;
            }
            k >>= 8;
        }
        int i3 = this.f35790f;
        return i3 > i ? i3 : i;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Objects.requireNonNull(bArr, "Byte array is null");
        if (i >= 0) {
            long j = 0;
            if (i < bArr.length) {
                while (i < bArr.length) {
                    j = (j << 8) + ((long) (bArr[i] & 255));
                    i++;
                }
                this.f35771a = Long.valueOf(j);
            } else if (this.f35790f == 0) {
                this.f35771a = 0L;
            } else {
                throw new C9124d("Offset to byte array is out of bounds: offset = " + i + ", array.length = " + bArr.length);
            }
        } else {
            throw new IllegalArgumentException("negativer offset into an array offset:" + i);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9158m) && this.f35790f == ((C9158m) obj).f35790f && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        int c = mo31776c();
        if (c == 0) {
            return new byte[0];
        }
        long k = C9238m.m49072k(this.f35771a);
        byte[] bArr = new byte[c];
        for (int i = c - 1; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & k));
            k >>= 8;
        }
        return bArr;
    }

    public String toString() {
        Object obj = this.f35771a;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        return obj.toString();
    }
}
