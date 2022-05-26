package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ya4 extends xa4 {

    /* renamed from: b */
    private final no2 f26311b = new no2(df2.f15600a);

    /* renamed from: c */
    private final no2 f26312c = new no2(4);

    /* renamed from: d */
    private int f26313d;

    /* renamed from: e */
    private boolean f26314e;

    /* renamed from: f */
    private boolean f26315f;

    /* renamed from: g */
    private int f26316g;

    public ya4(da4 da4) {
        super(da4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20817a(no2 no2) throws wa4 {
        int s = no2.mo19792s();
        int i = s >> 4;
        int i2 = s & 15;
        if (i2 == 7) {
            this.f26316g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new wa4(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo20818b(no2 no2, long j) throws C5464px {
        int s = no2.mo19792s();
        long n = j + (((long) no2.mo19787n()) * 1000);
        if (s == 0) {
            if (!this.f26314e) {
                no2 no22 = new no2(new byte[no2.mo19782i()]);
                no2.mo19775b(no22.mo19781h(), 0, no2.mo19782i());
                h84 a = h84.m24729a(no22);
                this.f26313d = a.f17577b;
                jb4 jb4 = new jb4();
                jb4.mo18599s("video/avc");
                jb4.mo18584f0(a.f17581f);
                jb4.mo18604x(a.f17578c);
                jb4.mo18583f(a.f17579d);
                jb4.mo18596p(a.f17580e);
                jb4.mo18589i(a.f17576a);
                this.f25740a.mo16885a(jb4.mo18605y());
                this.f26314e = true;
                return false;
            }
        } else if (s == 1 && this.f26314e) {
            int i = this.f26316g == 1 ? 1 : 0;
            if (!this.f26315f && i == 0) {
                return false;
            }
            byte[] h = this.f26312c.mo19781h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i2 = 4 - this.f26313d;
            int i3 = 0;
            while (no2.mo19782i() > 0) {
                no2.mo19775b(this.f26312c.mo19781h(), i2, this.f26313d);
                this.f26312c.mo19779f(0);
                int v = this.f26312c.mo19795v();
                this.f26311b.mo19779f(0);
                this.f25740a.mo16888d(this.f26311b, 4);
                this.f25740a.mo16888d(no2, v);
                i3 = i3 + 4 + v;
            }
            this.f25740a.mo16889e(n, i, i3, 0, (ca4) null);
            this.f26315f = true;
            return true;
        }
        return false;
    }
}
