package p402l.p406b.p407a.p408e;

/* renamed from: l.b.a.e.m */
/* compiled from: ExtDouble */
public class C8960m {

    /* renamed from: a */
    byte[] f35359a;

    public C8960m(byte[] bArr) {
        this.f35359a = bArr;
    }

    /* renamed from: a */
    public double mo31297a() {
        byte[] bArr = this.f35359a;
        int i = bArr[0] >> 7;
        int i2 = ((bArr[1] | (bArr[0] << 8)) & 32767) - 16445;
        long j = 0;
        int i3 = 55;
        for (int i4 = 2; i4 < 9; i4++) {
            j |= (((long) this.f35359a[i4]) & 255) << i3;
            i3 -= 8;
        }
        double pow = Math.pow(2.0d, (double) i2) * ((double) (j | ((long) (this.f35359a[9] >>> 1))));
        return i != 0 ? -pow : pow;
    }
}
