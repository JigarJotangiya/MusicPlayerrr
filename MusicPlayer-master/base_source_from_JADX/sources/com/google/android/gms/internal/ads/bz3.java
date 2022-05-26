package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bz3 extends iy3 {

    /* renamed from: i */
    private int f14738i;

    /* renamed from: j */
    private boolean f14739j;

    /* renamed from: k */
    private byte[] f14740k;

    /* renamed from: l */
    private byte[] f14741l;

    /* renamed from: m */
    private int f14742m;

    /* renamed from: n */
    private int f14743n;

    /* renamed from: o */
    private int f14744o;

    /* renamed from: p */
    private boolean f14745p;

    /* renamed from: q */
    private long f14746q;

    public bz3() {
        byte[] bArr = wy2.f25584f;
        this.f14740k = bArr;
        this.f14741l = bArr;
    }

    /* renamed from: q */
    private final int m21605q(long j) {
        return (int) ((j * ((long) this.f18277b.f18271a)) / 1000000);
    }

    /* renamed from: r */
    private final int m21606r(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f14738i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: s */
    private final void m21607s(byte[] bArr, int i) {
        mo18520j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f14745p = true;
        }
    }

    /* renamed from: t */
    private final void m21608t(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f14744o);
        int i2 = this.f14744o - min;
        System.arraycopy(bArr, i - i2, this.f14741l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f14741l, i2, min);
    }

    /* renamed from: d */
    public final boolean mo16432d() {
        return this.f14739j;
    }

    /* renamed from: h */
    public final void mo15991h(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo18521n()) {
            int i = this.f14742m;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f14740k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f14738i;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f14742m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo18520j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f14745p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int r = m21606r(byteBuffer);
                byteBuffer.limit(r);
                this.f14746q += (long) (byteBuffer.remaining() / this.f14738i);
                m21608t(byteBuffer, this.f14741l, this.f14744o);
                if (r < limit3) {
                    m21607s(this.f14741l, this.f14744o);
                    this.f14742m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int r2 = m21606r(byteBuffer);
                int position2 = r2 - byteBuffer.position();
                byte[] bArr = this.f14740k;
                int length = bArr.length;
                int i3 = this.f14743n;
                int i4 = length - i3;
                if (r2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f14740k, this.f14743n, min);
                    int i5 = this.f14743n + min;
                    this.f14743n = i5;
                    byte[] bArr2 = this.f14740k;
                    if (i5 == bArr2.length) {
                        if (this.f14745p) {
                            m21607s(bArr2, this.f14744o);
                            long j = this.f14746q;
                            int i6 = this.f14743n;
                            int i7 = this.f14744o;
                            this.f14746q = j + ((long) ((i6 - (i7 + i7)) / this.f14738i));
                            i5 = i6;
                        } else {
                            this.f14746q += (long) ((i5 - this.f14744o) / this.f14738i);
                        }
                        m21608t(byteBuffer, this.f14740k, i5);
                        this.f14743n = 0;
                        this.f14742m = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m21607s(bArr, i3);
                    this.f14743n = 0;
                    this.f14742m = 0;
                }
            }
        }
    }

    /* renamed from: i */
    public final ix3 mo15992i(ix3 ix3) throws jx3 {
        if (ix3.f18273c == 2) {
            return this.f14739j ? ix3 : ix3.f18270e;
        }
        throw new jx3(ix3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo16433k() {
        if (this.f14739j) {
            this.f14738i = this.f18277b.f18274d;
            int q = m21605q(150000) * this.f14738i;
            if (this.f14740k.length != q) {
                this.f14740k = new byte[q];
            }
            int q2 = m21605q(20000) * this.f14738i;
            this.f14744o = q2;
            if (this.f14741l.length != q2) {
                this.f14741l = new byte[q2];
            }
        }
        this.f14742m = 0;
        this.f14746q = 0;
        this.f14743n = 0;
        this.f14745p = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo16434l() {
        int i = this.f14743n;
        if (i > 0) {
            m21607s(this.f14740k, i);
        }
        if (!this.f14745p) {
            this.f14746q += (long) (this.f14744o / this.f14738i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo16435m() {
        this.f14739j = false;
        this.f14744o = 0;
        byte[] bArr = wy2.f25584f;
        this.f14740k = bArr;
        this.f14741l = bArr;
    }

    /* renamed from: o */
    public final long mo16436o() {
        return this.f14746q;
    }

    /* renamed from: p */
    public final void mo16437p(boolean z) {
        this.f14739j = z;
    }
}
