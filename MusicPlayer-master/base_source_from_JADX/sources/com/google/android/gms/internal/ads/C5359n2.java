package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5359n2 implements C4916b4 {

    /* renamed from: a */
    private final List<C5689w> f20463a = g43.zzo();

    public C5359n2(int i) {
    }

    /* renamed from: b */
    private final C5471q3 m27651b(C4879a4 a4Var) {
        return new C5471q3(m27653d(a4Var));
    }

    /* renamed from: c */
    private final C5064f4 m27652c(C4879a4 a4Var) {
        return new C5064f4(m27653d(a4Var));
    }

    /* renamed from: d */
    private final List<C5689w> m27653d(C4879a4 a4Var) {
        String str;
        int i;
        List list;
        no2 no2 = new no2(a4Var.f13774d);
        List<C5689w> list2 = this.f20463a;
        while (no2.mo19782i() > 0) {
            int s = no2.mo19792s();
            int k = no2.mo19784k() + no2.mo19792s();
            if (s == 134) {
                list2 = new ArrayList<>();
                int s2 = no2.mo19792s() & 31;
                for (int i2 = 0; i2 < s2; i2++) {
                    String F = no2.mo19771F(3, g13.f16857b);
                    int s3 = no2.mo19792s();
                    int i3 = s3 & 128;
                    if (i3 != 0) {
                        i = s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte s4 = (byte) no2.mo19792s();
                    no2.mo19780g(1);
                    if (i3 != 0) {
                        int i4 = ju1.f18642c;
                        list = Collections.singletonList((s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    jb4 jb4 = new jb4();
                    jb4.mo18599s(str);
                    jb4.mo18591k(F);
                    jb4.mo18578c0(i);
                    jb4.mo18589i(list);
                    list2.add(jb4.mo18605y());
                }
            }
            no2.mo19779f(k);
        }
        return list2;
    }

    /* renamed from: a */
    public final C4990d4 mo16043a(int i, C4879a4 a4Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C5101g3(new C4989d3(a4Var.f13772b));
            }
            if (i == 21) {
                return new C5101g3(new C4915b3());
            }
            if (i == 27) {
                return new C5101g3(new C5766y2(m27651b(a4Var), false, false));
            }
            if (i == 36) {
                return new C5101g3(new C4878a3(m27651b(a4Var)));
            }
            if (i == 89) {
                return new C5101g3(new C5433p2(a4Var.f13773c));
            }
            if (i == 138) {
                return new C5101g3(new C5396o2(a4Var.f13772b));
            }
            if (i == 172) {
                return new C5101g3(new C5211j2(a4Var.f13772b));
            }
            if (i == 257) {
                return new C5434p3(new C5063f3("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new C5434p3(new C5063f3("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new C5101g3(new C5322m2(false, a4Var.f13772b));
                            case 16:
                                return new C5101g3(new C5655v2(m27652c(a4Var)));
                            case 17:
                                return new C5101g3(new C4952c3(a4Var.f13772b));
                            default:
                                return null;
                        }
                    }
                }
                return new C5101g3(new C5100g2(a4Var.f13772b));
            }
        }
        return new C5101g3(new C5544s2(m27652c(a4Var)));
    }
}
