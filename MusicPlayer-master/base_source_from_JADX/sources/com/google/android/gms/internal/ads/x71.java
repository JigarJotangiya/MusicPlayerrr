package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.List;
import org.json.JSONException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x71 extends C5279kx {

    /* renamed from: g */
    private final String f25698g;

    /* renamed from: h */
    private final String f25699h;

    /* renamed from: i */
    private final String f25700i;

    /* renamed from: j */
    private final List<zzbfm> f25701j;

    /* renamed from: k */
    private final long f25702k;

    /* renamed from: l */
    private final String f25703l;

    public x71(bp2 bp2, String str, p22 p22, ep2 ep2) {
        String str2;
        String str3;
        String str4 = null;
        if (bp2 == null) {
            str2 = null;
        } else {
            str2 = bp2.f14633Y;
        }
        this.f25699h = str2;
        if (ep2 == null) {
            str3 = null;
        } else {
            str3 = ep2.f16050b;
        }
        this.f25700i = str3;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str4 = bp2.f14668w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f25698g = str4 != null ? str4 : str;
        this.f25701j = p22.mo20181b();
        this.f25702k = C2971s.m13198a().mo11988a() / 1000;
        this.f25703l = (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22551j6)).booleanValue() || ep2 == null || TextUtils.isEmpty(ep2.f16056h)) ? BuildConfig.FLAVOR : ep2.f16056h;
    }

    /* renamed from: b */
    public final long mo21982b() {
        return this.f25702k;
    }

    /* renamed from: c */
    public final String mo18760c() {
        return this.f25699h;
    }

    /* renamed from: d */
    public final List<zzbfm> mo18761d() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22654w5)).booleanValue()) {
            return null;
        }
        return this.f25701j;
    }

    /* renamed from: e */
    public final String mo21983e() {
        return this.f25700i;
    }

    /* renamed from: f */
    public final String mo21984f() {
        return this.f25703l;
    }

    public final String zze() {
        return this.f25698g;
    }
}
