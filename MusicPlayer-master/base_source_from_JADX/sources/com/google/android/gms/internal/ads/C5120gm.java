package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5120gm {

    /* renamed from: a */
    public final List<byte[]> f17197a;

    /* renamed from: b */
    public final int f17198b;

    private C5120gm(List<byte[]> list, int i) {
        this.f17197a = list;
        this.f17198b = i;
    }

    /* renamed from: a */
    public static C5120gm m24446a(C5600tl tlVar) throws C5445pe {
        List list;
        try {
            tlVar.mo21104w(21);
            int g = tlVar.mo21088g() & 3;
            int g2 = tlVar.mo21088g();
            int c = tlVar.mo21084c();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                tlVar.mo21104w(1);
                int j = tlVar.mo21091j();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = tlVar.mo21091j();
                    i += j2 + 4;
                    tlVar.mo21104w(j2);
                }
            }
            tlVar.mo21103v(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                tlVar.mo21104w(1);
                int j3 = tlVar.mo21091j();
                for (int i6 = 0; i6 < j3; i6++) {
                    int j4 = tlVar.mo21091j();
                    System.arraycopy(C5526rl.f22891a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(tlVar.f23918a, tlVar.mo21084c(), bArr, i7, j4);
                    i4 = i7 + j4;
                    tlVar.mo21104w(j4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C5120gm(list, g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C5445pe("Error parsing HEVC config", e);
        }
    }
}
