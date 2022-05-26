package p402l.p406b.p426c.p429r;

import java.util.Objects;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9124d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.h */
/* compiled from: ID3v2LyricLine */
public class C9153h extends C9146a {

    /* renamed from: f */
    String f35781f = BuildConfig.FLAVOR;

    /* renamed from: g */
    long f35782g = 0;

    public C9153h(C9153h hVar) {
        super(hVar);
        this.f35781f = hVar.f35781f;
        this.f35782g = hVar.f35782g;
    }

    /* renamed from: c */
    public int mo31776c() {
        return this.f35781f.length() + 1 + 4;
    }

    /* renamed from: e */
    public void mo31778e(byte[] bArr, int i) throws C9124d {
        Objects.requireNonNull(bArr, "Byte array is null");
        if (i < 0 || i >= bArr.length) {
            throw new IndexOutOfBoundsException("Offset to byte array is out of bounds: offset = " + i + ", array.length = " + bArr.length);
        }
        this.f35781f = C9057i.m48314q(bArr, i, (bArr.length - i) - 4, "ISO-8859-1");
        this.f35782g = 0;
        for (int length = bArr.length - 4; length < bArr.length; length++) {
            long j = this.f35782g << 8;
            this.f35782g = j;
            this.f35782g = j + ((long) bArr[length]);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9153h)) {
            return false;
        }
        C9153h hVar = (C9153h) obj;
        if (this.f35781f.equals(hVar.f35781f) && this.f35782g == hVar.f35782g && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public byte[] mo31782h() {
        byte[] bArr = new byte[mo31776c()];
        int i = 0;
        while (i < this.f35781f.length()) {
            bArr[i] = (byte) this.f35781f.charAt(i);
            i++;
        }
        int i2 = i + 1;
        bArr[i] = 0;
        int i3 = i2 + 1;
        long j = this.f35782g;
        bArr[i2] = (byte) ((int) ((-16777216 & j) >> 24));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((16711680 & j) >> 16));
        bArr[i4] = (byte) ((int) ((65280 & j) >> 8));
        bArr[i4 + 1] = (byte) ((int) (255 & j));
        return bArr;
    }

    /* renamed from: i */
    public String mo31795i() {
        return this.f35781f;
    }

    /* renamed from: j */
    public long mo31796j() {
        return this.f35782g;
    }

    public String toString() {
        return this.f35782g + " " + this.f35781f;
    }
}
