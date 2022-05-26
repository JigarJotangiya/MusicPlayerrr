package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fz3 extends iy3 {

    /* renamed from: i */
    private int f16823i;

    /* renamed from: j */
    private int f16824j;

    /* renamed from: k */
    private boolean f16825k;

    /* renamed from: l */
    private int f16826l;

    /* renamed from: m */
    private byte[] f16827m = wy2.f25584f;

    /* renamed from: n */
    private int f16828n;

    /* renamed from: o */
    private long f16829o;

    /* renamed from: a */
    public final ByteBuffer mo17059a() {
        int i;
        if (super.mo17062e() && (i = this.f16828n) > 0) {
            mo18520j(i).put(this.f16827m, 0, this.f16828n).flip();
            this.f16828n = 0;
        }
        return super.mo17059a();
    }

    /* renamed from: e */
    public final boolean mo17062e() {
        return super.mo17062e() && this.f16828n == 0;
    }

    /* renamed from: h */
    public final void mo15991h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f16826l);
            this.f16829o += (long) (min / this.f18277b.f18274d);
            this.f16826l -= min;
            byteBuffer.position(position + min);
            if (this.f16826l <= 0) {
                int i2 = i - min;
                int length = (this.f16828n + i2) - this.f16827m.length;
                ByteBuffer j = mo18520j(length);
                int L = wy2.m33417L(length, 0, this.f16828n);
                j.put(this.f16827m, 0, L);
                int L2 = wy2.m33417L(length - L, 0, i2);
                byteBuffer.limit(byteBuffer.position() + L2);
                j.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - L2;
                int i4 = this.f16828n - L;
                this.f16828n = i4;
                byte[] bArr = this.f16827m;
                System.arraycopy(bArr, L, bArr, 0, i4);
                byteBuffer.get(this.f16827m, this.f16828n, i3);
                this.f16828n += i3;
                j.flip();
            }
        }
    }

    /* renamed from: i */
    public final ix3 mo15992i(ix3 ix3) throws jx3 {
        if (ix3.f18273c == 2) {
            this.f16825k = true;
            return (this.f16823i == 0 && this.f16824j == 0) ? ix3.f18270e : ix3;
        }
        throw new jx3(ix3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo16433k() {
        if (this.f16825k) {
            this.f16825k = false;
            int i = this.f16824j;
            int i2 = this.f18277b.f18274d;
            this.f16827m = new byte[(i * i2)];
            this.f16826l = this.f16823i * i2;
        }
        this.f16828n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo16434l() {
        if (this.f16825k) {
            int i = this.f16828n;
            if (i > 0) {
                this.f16829o += (long) (i / this.f18277b.f18274d);
            }
            this.f16828n = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo16435m() {
        this.f16827m = wy2.f25584f;
    }

    /* renamed from: o */
    public final long mo17780o() {
        return this.f16829o;
    }

    /* renamed from: p */
    public final void mo17781p() {
        this.f16829o = 0;
    }

    /* renamed from: q */
    public final void mo17782q(int i, int i2) {
        this.f16823i = i;
        this.f16824j = i2;
    }
}
