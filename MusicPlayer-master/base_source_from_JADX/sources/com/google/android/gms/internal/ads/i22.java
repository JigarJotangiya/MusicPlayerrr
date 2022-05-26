package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i22 implements re0 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zv2 m25038a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0043
            if (r4 == r3) goto L_0x0040
            if (r4 == r2) goto L_0x003d
            r4 = 0
            return r4
        L_0x003d:
            com.google.android.gms.internal.ads.zv2 r4 = com.google.android.gms.internal.ads.zv2.VIDEO
            return r4
        L_0x0040:
            com.google.android.gms.internal.ads.zv2 r4 = com.google.android.gms.internal.ads.zv2.NATIVE_DISPLAY
            return r4
        L_0x0043:
            com.google.android.gms.internal.ads.zv2 r4 = com.google.android.gms.internal.ads.zv2.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i22.m25038a(java.lang.String):com.google.android.gms.internal.ads.zv2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.bw2 m25039b(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L_0x0020
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x0044
            if (r4 == r3) goto L_0x0041
            if (r4 == r2) goto L_0x003e
            com.google.android.gms.internal.ads.bw2 r4 = com.google.android.gms.internal.ads.bw2.UNSPECIFIED
            return r4
        L_0x003e:
            com.google.android.gms.internal.ads.bw2 r4 = com.google.android.gms.internal.ads.bw2.ONE_PIXEL
            return r4
        L_0x0041:
            com.google.android.gms.internal.ads.bw2 r4 = com.google.android.gms.internal.ads.bw2.DEFINED_BY_JAVASCRIPT
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.bw2 r4 = com.google.android.gms.internal.ads.bw2.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i22.m25039b(java.lang.String):com.google.android.gms.internal.ads.bw2");
    }

    /* renamed from: c */
    private static cw2 m25040c(String str) {
        if ("native".equals(str)) {
            return cw2.NATIVE;
        }
        if ("javascript".equals(str)) {
            return cw2.JAVASCRIPT;
        }
        return cw2.NONE;
    }

    /* renamed from: P */
    public final void mo18275P(C4863a aVar) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() && rv2.m30435b()) {
            Object K0 = C4865b.m20502K0(aVar);
            if (K0 instanceof uv2) {
                ((uv2) K0).mo21383e();
            }
        }
    }

    /* renamed from: Q */
    public final String mo18276Q(Context context) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
            return null;
        }
        return "a.1.3.3-google_20200416";
    }

    /* renamed from: R */
    public final void mo18277R(C4863a aVar, View view) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() && rv2.m30435b()) {
            Object K0 = C4865b.m20502K0(aVar);
            if (K0 instanceof uv2) {
                ((uv2) K0).mo21380b(view, aw2.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    /* renamed from: S */
    public final C4863a mo18278S(String str, WebView webView, String str2, String str3, String str4, te0 te0, se0 se0, String str5) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() || !rv2.m30435b()) {
            return null;
        }
        dw2 a = dw2.m22714a("Google", str);
        cw2 c = m25040c("javascript");
        zv2 a2 = m25038a(se0.toString());
        cw2 cw2 = cw2.NONE;
        if (c == cw2) {
            ul0.m31862g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (a2 == null) {
            String valueOf = String.valueOf(se0);
            String.valueOf(valueOf).length();
            ul0.m31862g("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(valueOf)));
            return null;
        } else {
            cw2 c2 = m25040c(str4);
            if (a2 == zv2.VIDEO && c2 == cw2) {
                String valueOf2 = String.valueOf(str4);
                ul0.m31862g(valueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
                return null;
            }
            return C4865b.m20503f2(uv2.m32069a(vv2.m32723a(a2, m25039b(te0.toString()), c, c2, true), wv2.m33373b(a, webView, str5, BuildConfig.FLAVOR)));
        }
    }

    /* renamed from: T */
    public final void mo18279T(C4863a aVar, View view) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() && rv2.m30435b()) {
            Object K0 = C4865b.m20502K0(aVar);
            if (K0 instanceof uv2) {
                ((uv2) K0).mo21382d(view);
            }
        }
    }

    /* renamed from: U */
    public final C4863a mo18280U(String str, WebView webView, String str2, String str3, String str4, String str5, te0 te0, se0 se0, String str6) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() || !rv2.m30435b()) {
            return null;
        }
        dw2 a = dw2.m22714a(str5, str);
        cw2 c = m25040c("javascript");
        cw2 c2 = m25040c(str4);
        zv2 a2 = m25038a(se0.toString());
        cw2 cw2 = cw2.NONE;
        if (c == cw2) {
            ul0.m31862g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (a2 == null) {
            String valueOf = String.valueOf(se0);
            String.valueOf(valueOf).length();
            ul0.m31862g("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(valueOf)));
            return null;
        } else if (a2 == zv2.VIDEO && c2 == cw2) {
            String valueOf2 = String.valueOf(str4);
            ul0.m31862g(valueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
            return null;
        } else {
            return C4865b.m20503f2(uv2.m32069a(vv2.m32723a(a2, m25039b(te0.toString()), c, c2, true), wv2.m33374c(a, webView, str6, BuildConfig.FLAVOR)));
        }
    }

    /* renamed from: V */
    public final boolean mo18281V(Context context) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
            ul0.m31862g("Omid flag is disabled");
            return false;
        } else if (rv2.m30435b()) {
            return true;
        } else {
            rv2.m30434a(context);
            return rv2.m30435b();
        }
    }

    public final void zze(C4863a aVar) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() && rv2.m30435b()) {
            Object K0 = C4865b.m20502K0(aVar);
            if (K0 instanceof uv2) {
                ((uv2) K0).mo21381c();
            }
        }
    }
}
