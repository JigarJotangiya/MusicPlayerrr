package p402l.p406b.p426c.p429r;

import java.util.Objects;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;
import p402l.p406b.p426c.p431t.C9238m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.k */
/* compiled from: NumberFixedLength */
public class C9156k extends C9146a {
    public C9156k(String str, C9190g gVar, int i) {
        super(str, gVar);
        if (i >= 0) {
            this.f35774d = i;
            return;
        }
        throw new IllegalArgumentException("Length is less than zero: " + i);
    }

    /* renamed from: c */
    public int mo31776c() {
        return this.f35774d;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Objects.requireNonNull(bArr, "Byte array is null");
        if (i < 0 || i >= bArr.length) {
            throw new C9124d("Offset to byte array is out of bounds: offset = " + i + ", array.length = " + bArr.length);
        } else if (this.f35774d + i <= bArr.length) {
            long j = 0;
            for (int i2 = i; i2 < this.f35774d + i; i2++) {
                j = (j << 8) + ((long) (bArr[i2] & 255));
            }
            this.f35771a = Long.valueOf(j);
            Logger logger = C9146a.f35770e;
            logger.config("Read NumberFixedlength:" + this.f35771a);
        } else {
            throw new C9124d("Offset plus size to byte array is out of bounds: offset = " + i + ", size = " + this.f35774d + " + arr.length " + bArr.length);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9156k) && this.f35774d == ((C9156k) obj).f35774d && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo31781g(Object obj) {
        if (obj instanceof Number) {
            super.mo31781g(obj);
            return;
        }
        throw new IllegalArgumentException("Invalid value type for NumberFixedLength:" + obj.getClass());
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        byte[] bArr = new byte[this.f35774d];
        Object obj = this.f35771a;
        if (obj != null) {
            long k = C9238m.m49072k(obj);
            for (int i = this.f35774d - 1; i >= 0; i--) {
                bArr[i] = (byte) ((int) (255 & k));
                k >>= 8;
            }
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
