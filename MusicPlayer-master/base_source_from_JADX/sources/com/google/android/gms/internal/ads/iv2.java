package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.C3359d;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iv2 {

    /* renamed from: a */
    private final b62 f18175a;

    /* renamed from: b */
    private final String f18176b;

    /* renamed from: c */
    private final String f18177c;

    /* renamed from: d */
    private final String f18178d;

    /* renamed from: e */
    private final Context f18179e;

    /* renamed from: f */
    private final pp2 f18180f;

    /* renamed from: g */
    private final C3359d f18181g;

    /* renamed from: h */
    private final C5737xa f18182h;

    public iv2(b62 b62, zzcjf zzcjf, String str, String str2, Context context, pp2 pp2, C3359d dVar, C5737xa xaVar) {
        this.f18175a = b62;
        this.f18176b = zzcjf.f27376g;
        this.f18177c = str;
        this.f18178d = str2;
        this.f18179e = context;
        this.f18180f = pp2;
        this.f18181g = dVar;
        this.f18182h = xaVar;
    }

    /* renamed from: d */
    public static final List<String> m25421d(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String f : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i2);
            arrayList.add(m25423f(f, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static String m25422e(String str) {
        return (TextUtils.isEmpty(str) || !tl0.m31314l()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: f */
    private static String m25423f(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = BuildConfig.FLAVOR;
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public final List<String> mo18513a(np2 np2, bp2 bp2, List<String> list) {
        return mo18514b(np2, bp2, false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, list);
    }

    /* renamed from: b */
    public final List<String> mo18514b(np2 np2, bp2 bp2, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        for (String f : list) {
            String f2 = m25423f(m25423f(m25423f(f, "@gw_adlocid@", np2.f20682a.f18953a.f24397f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f18176b);
            if (bp2 != null) {
                f2 = ek0.m23025c(m25423f(m25423f(m25423f(f2, "@gw_qdata@", bp2.f14671z), "@gw_adnetid@", bp2.f14670y), "@gw_allocid@", bp2.f14669x), this.f18179e, bp2.f14628T);
            }
            String f3 = m25423f(m25423f(m25423f(f2, "@gw_adnetstatus@", this.f18175a.mo16084f()), "@gw_seqnum@", this.f18177c), "@gw_sessid@", this.f18178d);
            boolean z2 = false;
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22439V1)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(f3);
                }
            }
            if (this.f18182h.mo22002f(Uri.parse(f3))) {
                Uri.Builder buildUpon = Uri.parse(f3).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                f3 = buildUpon.build().toString();
            }
            arrayList.add(f3);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<String> mo18515c(bp2 bp2, List<String> list, fh0 fh0) {
        String str;
        ArrayList arrayList = new ArrayList();
        long a = this.f18181g.mo11988a();
        try {
            String b = fh0.mo16633b();
            String num = Integer.toString(fh0.mo16632a());
            pp2 pp2 = this.f18180f;
            String str2 = BuildConfig.FLAVOR;
            if (pp2 == null) {
                str = str2;
            } else {
                str = m25422e(pp2.f21453a);
            }
            pp2 pp22 = this.f18180f;
            if (pp22 != null) {
                str2 = m25422e(pp22.f21454b);
            }
            for (String f : list) {
                arrayList.add(ek0.m23025c(m25423f(m25423f(m25423f(m25423f(m25423f(m25423f(f, "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(a)), "@gw_rwd_itm@", Uri.encode(b)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f18176b), this.f18179e, bp2.f14628T));
            }
            return arrayList;
        } catch (RemoteException e) {
            ul0.m31860e("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
