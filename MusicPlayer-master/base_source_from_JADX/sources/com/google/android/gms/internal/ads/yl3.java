package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yl3 {

    /* renamed from: a */
    private final xl3 f26403a;

    private yl3(xl3 xl3) {
        zm3.m34701f(xl3, "output");
        this.f26403a = xl3;
        xl3.f25874a = this;
    }

    /* renamed from: l */
    public static yl3 m34157l(xl3 xl3) {
        yl3 yl3 = xl3.f25874a;
        return yl3 != null ? yl3 : new yl3(xl3);
    }

    /* renamed from: A */
    public final void mo22217A(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21320l(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21319k(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo22218B(int i, Object obj, to3 to3) throws IOException {
        xl3 xl3 = this.f26403a;
        xl3.mo21327s(i, 3);
        to3.mo16706e((zn3) obj, xl3.f25874a);
        xl3.mo21327s(i, 4);
    }

    /* renamed from: C */
    public final void mo22219C(int i, int i2) throws IOException {
        this.f26403a.mo21323o(i, i2);
    }

    /* renamed from: D */
    public final void mo22220D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xl3.m33739z(list.get(i4).intValue());
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21324p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21323o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo22221E(int i, long j) throws IOException {
        this.f26403a.mo21330v(i, j);
    }

    /* renamed from: F */
    public final void mo22222F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xl3.m33734b(list.get(i4).longValue());
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21331w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21330v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo22223G(int i, Object obj, to3 to3) throws IOException {
        zn3 zn3 = (zn3) obj;
        ul3 ul3 = (ul3) this.f26403a;
        ul3.mo21329u((i << 3) | 2);
        vk3 vk3 = (vk3) zn3;
        int d = vk3.mo20468d();
        if (d == -1) {
            d = to3.mo16703b(vk3);
            vk3.mo20474j(d);
        }
        ul3.mo21329u(d);
        to3.mo16706e(zn3, ul3.f25874a);
    }

    /* renamed from: H */
    public final void mo22224H(int i, int i2) throws IOException {
        this.f26403a.mo21319k(i, i2);
    }

    /* renamed from: I */
    public final void mo22225I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21320l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21319k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public final void mo22226J(int i, long j) throws IOException {
        this.f26403a.mo21321m(i, j);
    }

    /* renamed from: K */
    public final void mo22227K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21322n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21321m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo22228a(int i, int i2) throws IOException {
        this.f26403a.mo21328t(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: b */
    public final void mo22229b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += xl3.m33733a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                xl3 xl3 = this.f26403a;
                int intValue2 = list.get(i2).intValue();
                xl3.mo21329u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            xl3 xl32 = this.f26403a;
            int intValue3 = list.get(i2).intValue();
            xl32.mo21328t(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo22230c(int i, long j) throws IOException {
        this.f26403a.mo21330v(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: d */
    public final void mo22231d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += xl3.m33734b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                xl3 xl3 = this.f26403a;
                long longValue2 = list.get(i2).longValue();
                xl3.mo21331w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            xl3 xl32 = this.f26403a;
            long longValue3 = list.get(i2).longValue();
            xl32.mo21330v(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo22232e(int i) throws IOException {
        this.f26403a.mo21327s(i, 3);
    }

    /* renamed from: f */
    public final void mo22233f(int i, String str) throws IOException {
        this.f26403a.mo21326r(i, str);
    }

    /* renamed from: g */
    public final void mo22234g(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof hn3) {
            hn3 hn3 = (hn3) list;
            while (i2 < list.size()) {
                Object z = hn3.mo17996z(i2);
                if (z instanceof String) {
                    this.f26403a.mo21326r(i, (String) z);
                } else {
                    this.f26403a.mo21318j(i, (kl3) z);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21326r(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo22235h(int i, int i2) throws IOException {
        this.f26403a.mo21328t(i, i2);
    }

    /* renamed from: i */
    public final void mo22236i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xl3.m33733a(list.get(i4).intValue());
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21329u(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21328t(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo22237j(int i, long j) throws IOException {
        this.f26403a.mo21330v(i, j);
    }

    /* renamed from: k */
    public final void mo22238k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xl3.m33734b(list.get(i4).longValue());
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21331w(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21330v(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo22239m(int i, boolean z) throws IOException {
        this.f26403a.mo21317i(i, z);
    }

    /* renamed from: n */
    public final void mo22240n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21316h(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21317i(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo22241o(int i, kl3 kl3) throws IOException {
        this.f26403a.mo21318j(i, kl3);
    }

    /* renamed from: p */
    public final void mo22242p(int i, List<kl3> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f26403a.mo21318j(i, list.get(i2));
        }
    }

    /* renamed from: q */
    public final void mo22243q(int i, double d) throws IOException {
        this.f26403a.mo21321m(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: r */
    public final void mo22244r(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21322n(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21321m(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    /* renamed from: s */
    public final void mo22245s(int i) throws IOException {
        this.f26403a.mo21327s(i, 4);
    }

    /* renamed from: t */
    public final void mo22246t(int i, int i2) throws IOException {
        this.f26403a.mo21323o(i, i2);
    }

    /* renamed from: u */
    public final void mo22247u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += xl3.m33739z(list.get(i4).intValue());
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21324p(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21323o(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo22248v(int i, int i2) throws IOException {
        this.f26403a.mo21319k(i, i2);
    }

    /* renamed from: w */
    public final void mo22249w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21320l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21319k(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: x */
    public final void mo22250x(int i, long j) throws IOException {
        this.f26403a.mo21321m(i, j);
    }

    /* renamed from: y */
    public final void mo22251y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f26403a.mo21327s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f26403a.mo21329u(i3);
            while (i2 < list.size()) {
                this.f26403a.mo21322n(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f26403a.mo21321m(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo22252z(int i, float f) throws IOException {
        this.f26403a.mo21319k(i, Float.floatToRawIntBits(f));
    }
}
