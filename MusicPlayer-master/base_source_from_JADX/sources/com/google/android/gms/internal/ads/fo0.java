package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3001h0;
import com.google.android.gms.ads.internal.util.C3005i0;
import com.google.android.gms.ads.internal.util.C3011k0;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fo0 {

    /* renamed from: a */
    private final Context f16689a;

    /* renamed from: b */
    private final String f16690b;

    /* renamed from: c */
    private final zzcjf f16691c;

    /* renamed from: d */
    private final c00 f16692d;

    /* renamed from: e */
    private final f00 f16693e;

    /* renamed from: f */
    private final C3011k0 f16694f;

    /* renamed from: g */
    private final long[] f16695g;

    /* renamed from: h */
    private final String[] f16696h;

    /* renamed from: i */
    private boolean f16697i = false;

    /* renamed from: j */
    private boolean f16698j = false;

    /* renamed from: k */
    private boolean f16699k = false;

    /* renamed from: l */
    private boolean f16700l = false;

    /* renamed from: m */
    private boolean f16701m;

    /* renamed from: n */
    private kn0 f16702n;

    /* renamed from: o */
    private boolean f16703o;

    /* renamed from: p */
    private boolean f16704p;

    /* renamed from: q */
    private long f16705q = -1;

    public fo0(Context context, zzcjf zzcjf, String str, f00 f00, c00 c00) {
        C3005i0 i0Var = new C3005i0();
        C3005i0 i0Var2 = i0Var;
        i0Var2.mo11039a("min_1", Double.MIN_VALUE, 1.0d);
        i0Var2.mo11039a("1_5", 1.0d, 5.0d);
        i0Var2.mo11039a("5_10", 5.0d, 10.0d);
        i0Var2.mo11039a("10_20", 10.0d, 20.0d);
        i0Var2.mo11039a("20_30", 20.0d, 30.0d);
        i0Var2.mo11039a("30_max", 30.0d, Double.MAX_VALUE);
        this.f16694f = i0Var.mo11040b();
        this.f16689a = context;
        this.f16691c = zzcjf;
        this.f16690b = str;
        this.f16693e = f00;
        this.f16692d = c00;
        String str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22616s);
        if (str2 == null) {
            this.f16696h = new String[0];
            this.f16695g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f16696h = new String[length];
        this.f16695g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f16695g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                ul0.m31863h("Unable to parse frame hash target time number.", e);
                this.f16695g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo17581a(kn0 kn0) {
        C5762xz.m33910a(this.f16693e, this.f16692d, "vpc2");
        this.f16697i = true;
        this.f16693e.mo17448d("vpn", kn0.mo18437q());
        this.f16702n = kn0;
    }

    /* renamed from: b */
    public final void mo17582b() {
        if (this.f16697i && !this.f16698j) {
            C5762xz.m33910a(this.f16693e, this.f16692d, "vfr2");
            this.f16698j = true;
        }
    }

    /* renamed from: c */
    public final void mo17583c() {
        this.f16701m = true;
        if (this.f16698j && !this.f16699k) {
            C5762xz.m33910a(this.f16693e, this.f16692d, "vfp2");
            this.f16699k = true;
        }
    }

    /* renamed from: d */
    public final void mo17584d() {
        String str;
        if (t10.f23681a.mo20989e().booleanValue() && !this.f16703o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f16690b);
            bundle.putString("player", this.f16702n.mo18437q());
            for (C3001h0 next : this.f16694f.mo11046a()) {
                String valueOf = String.valueOf(next.f10010a);
                if (valueOf.length() != 0) {
                    str = "fps_c_".concat(valueOf);
                } else {
                    str = new String("fps_c_");
                }
                bundle.putString(str, Integer.toString(next.f10014e));
                String valueOf2 = String.valueOf(next.f10010a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(next.f10013d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.f16695g;
                if (i < jArr.length) {
                    String str2 = this.f16696h[i];
                    if (str2 != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
                    }
                    i++;
                } else {
                    C2971s.m13214q().mo10983V(this.f16689a, this.f16691c.f27376g, "gmob-apps", bundle, true);
                    this.f16703o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo17585e() {
        this.f16701m = false;
    }

    /* renamed from: f */
    public final void mo17586f(kn0 kn0) {
        if (this.f16699k && !this.f16700l) {
            if (C3018m1.m13390m() && !this.f16700l) {
                C3018m1.m13388k("VideoMetricsMixin first frame");
            }
            C5762xz.m33910a(this.f16693e, this.f16692d, "vff2");
            this.f16700l = true;
        }
        long c = C2971s.m13198a().mo11990c();
        if (this.f16701m && this.f16704p && this.f16705q != -1) {
            this.f16694f.mo11047b(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f16705q)));
        }
        this.f16704p = this.f16701m;
        this.f16705q = c;
        long longValue = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22624t)).longValue();
        long h = (long) kn0.mo18417h();
        int i = 0;
        while (true) {
            String[] strArr = this.f16696h;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(h - this.f16695g[i])) {
                String[] strArr2 = this.f16696h;
                int i2 = 8;
                Bitmap bitmap = kn0.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
            kn0 kn02 = kn0;
            i++;
        }
    }
}
