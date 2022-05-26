package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sa4 extends xa4 {

    /* renamed from: e */
    private static final int[] f23404e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f23405b;

    /* renamed from: c */
    private boolean f23406c;

    /* renamed from: d */
    private int f23407d;

    public sa4(da4 da4) {
        super(da4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo20817a(no2 no2) throws wa4 {
        if (!this.f23405b) {
            int s = no2.mo19792s();
            int i = s >> 4;
            this.f23407d = i;
            if (i == 2) {
                int i2 = f23404e[(s >> 2) & 3];
                jb4 jb4 = new jb4();
                jb4.mo18599s("audio/mpeg");
                jb4.mo18582e0(1);
                jb4.mo18600t(i2);
                this.f25740a.mo16885a(jb4.mo18605y());
                this.f23406c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                jb4 jb42 = new jb4();
                jb42.mo18599s(str);
                jb42.mo18582e0(1);
                jb42.mo18600t(8000);
                this.f25740a.mo16885a(jb42.mo18605y());
                this.f23406c = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new wa4(sb.toString());
            }
            this.f23405b = true;
        } else {
            no2.mo19780g(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo20818b(no2 no2, long j) throws C5464px {
        if (this.f23407d == 2) {
            int i = no2.mo19782i();
            this.f25740a.mo16888d(no2, i);
            this.f25740a.mo16889e(j, 1, i, 0, (ca4) null);
            return true;
        }
        int s = no2.mo19792s();
        if (s == 0 && !this.f23406c) {
            int i2 = no2.mo19782i();
            byte[] bArr = new byte[i2];
            no2.mo19775b(bArr, 0, i2);
            z74 a = a84.m20625a(bArr);
            jb4 jb4 = new jb4();
            jb4.mo18599s("audio/mp4a-latm");
            jb4.mo18584f0(a.f26704c);
            jb4.mo18582e0(a.f26703b);
            jb4.mo18600t(a.f26702a);
            jb4.mo18589i(Collections.singletonList(bArr));
            this.f25740a.mo16885a(jb4.mo18605y());
            this.f23406c = true;
            return false;
        } else if (this.f23407d == 10 && s != 1) {
            return false;
        } else {
            int i3 = no2.mo19782i();
            this.f25740a.mo16888d(no2, i3);
            this.f25740a.mo16889e(j, 1, i3, 0, (ca4) null);
            return true;
        }
    }
}
