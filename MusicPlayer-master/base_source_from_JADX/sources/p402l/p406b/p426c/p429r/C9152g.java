package p402l.p406b.p426c.p429r;

import java.util.Objects;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p431t.C9190g;

/* renamed from: l.b.c.r.g */
/* compiled from: ByteArraySizeTerminated */
public class C9152g extends C9146a {
    public C9152g(String str, C9190g gVar) {
        super(str, gVar);
    }

    /* renamed from: c */
    public int mo31776c() {
        Object obj = this.f35771a;
        if (obj != null) {
            return ((byte[]) obj).length;
        }
        return 0;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Objects.requireNonNull(bArr, "Byte array is null");
        if (i < 0) {
            throw new IndexOutOfBoundsException("Offset to byte array is out of bounds: offset = " + i + ", array.length = " + bArr.length);
        } else if (i >= bArr.length) {
            this.f35771a = null;
        } else {
            int length = bArr.length - i;
            byte[] bArr2 = new byte[length];
            this.f35771a = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, length);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9152g) && super.equals(obj);
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        Logger logger = C9146a.f35770e;
        logger.config("Writing byte array" + mo31775b());
        return (byte[]) this.f35771a;
    }

    public String toString() {
        return mo31776c() + " bytes";
    }
}
