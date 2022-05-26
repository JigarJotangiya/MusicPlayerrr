package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3292l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ab2 implements rg2<Bundle> {

    /* renamed from: a */
    final up2 f13835a;

    /* renamed from: b */
    private final long f13836b;

    public ab2(up2 up2, long j) {
        C3292l.m14241i(up2, "the targeting must not be null");
        this.f13835a = up2;
        this.f13836b = j;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzbfd zzbfd = this.f13835a.f24395d;
        bundle.putInt("http_timeout_millis", zzbfd.f27193C);
        bundle.putString("slotname", this.f13835a.f24397f);
        int i = this.f13835a.f24406o.f18564a;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.f13836b);
            fq2.m23783g(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzbfd.f27196h)), zzbfd.f27196h != -1);
            fq2.m23778b(bundle, "extras", zzbfd.f27197i);
            fq2.m23782f(bundle, "cust_gender", Integer.valueOf(zzbfd.f27198j), zzbfd.f27198j != -1);
            fq2.m23780d(bundle, "kw", zzbfd.f27199k);
            fq2.m23782f(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzbfd.f27201m), zzbfd.f27201m != -1);
            if (zzbfd.f27200l) {
                bundle.putBoolean("test_request", true);
            }
            fq2.m23782f(bundle, "d_imp_hdr", 1, zzbfd.f27195g >= 2 && zzbfd.f27202n);
            String str = zzbfd.f27203o;
            fq2.m23783g(bundle, "ppid", str, zzbfd.f27195g >= 2 && !TextUtils.isEmpty(str));
            Location location = zzbfd.f27205q;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", valueOf.floatValue());
                bundle2.putLong("lat", valueOf3.longValue());
                bundle2.putLong("long", valueOf4.longValue());
                bundle2.putLong("time", valueOf2.longValue());
                bundle.putBundle("uule", bundle2);
            }
            fq2.m23779c(bundle, "url", zzbfd.f27206r);
            fq2.m23780d(bundle, "neighboring_content_urls", zzbfd.f27192B);
            fq2.m23778b(bundle, "custom_targeting", zzbfd.f27208t);
            fq2.m23780d(bundle, "category_exclusions", zzbfd.f27209u);
            fq2.m23779c(bundle, "request_agent", zzbfd.f27210v);
            fq2.m23779c(bundle, "request_pkg", zzbfd.f27211w);
            fq2.m23781e(bundle, "is_designed_for_families", Boolean.valueOf(zzbfd.f27212x), zzbfd.f27195g >= 7);
            if (zzbfd.f27195g >= 8) {
                Integer valueOf5 = Integer.valueOf(zzbfd.f27214z);
                if (zzbfd.f27214z == -1) {
                    z = false;
                }
                fq2.m23782f(bundle, "tag_for_under_age_of_consent", valueOf5, z);
                fq2.m23779c(bundle, "max_ad_content_rating", zzbfd.f27191A);
                return;
            }
            return;
        }
        throw null;
    }
}
