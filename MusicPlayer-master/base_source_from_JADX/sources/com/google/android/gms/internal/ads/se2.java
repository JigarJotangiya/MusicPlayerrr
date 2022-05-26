package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class se2 implements sg2<te2> {

    /* renamed from: a */
    private final e93 f23428a;

    /* renamed from: b */
    private final up2 f23429b;

    /* renamed from: c */
    private final PackageInfo f23430c;

    /* renamed from: d */
    private final C3024o1 f23431d;

    public se2(e93 e93, up2 up2, PackageInfo packageInfo, C3024o1 o1Var) {
        this.f23428a = e93;
        this.f23429b = up2;
        this.f23430c = packageInfo;
        this.f23431d = o1Var;
    }

    /* renamed from: b */
    public static /* synthetic */ te2 m30689b(se2 se2) {
        ArrayList<String> arrayList = se2.f23429b.f24398g;
        if (arrayList == null) {
            return pe2.f21394a;
        }
        return arrayList.isEmpty() ? qe2.f21914a : new oe2(se2, arrayList);
    }

    /* renamed from: a */
    public final d93<te2> mo15767a() {
        return this.f23428a.mo17138A0(new re2(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r9 == 3) goto L_0x0107;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20837c(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            java.util.ArrayList<java.lang.String> r9 = r9.f24399h
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f24400i
            int r9 = r9.f27248g
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L_0x004f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f24400i
            int r9 = r9.f27255n
            if (r9 == r6) goto L_0x0043
            if (r9 == r5) goto L_0x0041
            if (r9 == r1) goto L_0x003f
            r7 = 4
            if (r9 == r7) goto L_0x003c
            r9 = r4
            goto L_0x0044
        L_0x003c:
            java.lang.String r9 = "square"
            goto L_0x0044
        L_0x003f:
            r9 = r2
            goto L_0x0044
        L_0x0041:
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x004f:
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f24400i
            int r9 = r9.f27250i
            if (r9 == 0) goto L_0x005f
            if (r9 == r6) goto L_0x005d
            if (r9 == r5) goto L_0x0060
            r0 = r4
            goto L_0x0060
        L_0x005d:
            r0 = r2
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x006b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x006b:
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f24400i
            boolean r9 = r9.f27251j
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.zzbnw r9 = r9.f24400i
            boolean r9 = r9.f27254m
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.f23430c
            if (r9 != 0) goto L_0x0087
            r9 = 0
            goto L_0x0089
        L_0x0087:
            int r9 = r9.versionCode
        L_0x0089:
            com.google.android.gms.ads.internal.util.o1 r0 = r8.f23431d
            int r0 = r0.zza()
            if (r9 <= r0) goto L_0x009b
            com.google.android.gms.ads.internal.util.o1 r0 = r8.f23431d
            r0.mo11099o()
            com.google.android.gms.ads.internal.util.o1 r0 = r8.f23431d
            r0.mo11077V(r9)
        L_0x009b:
            com.google.android.gms.ads.internal.util.o1 r9 = r8.f23431d
            org.json.JSONObject r9 = r9.mo11097k()
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.up2 r2 = r8.f23429b
            java.lang.String r2 = r2.f24397f
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto L_0x00b2
            java.lang.String r0 = r9.toString()
        L_0x00b2:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        L_0x00bd:
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            int r9 = r9.f24402k
            if (r9 <= r6) goto L_0x00c8
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00c8:
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.zzbtz r9 = r9.f24393b
            if (r9 == 0) goto L_0x0119
            java.lang.String r0 = r9.f27275i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x010d
            int r0 = r9.f27273g
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00e5
            int r9 = r9.f27276j
            if (r9 == r5) goto L_0x0106
            if (r9 == r1) goto L_0x0107
            goto L_0x0106
        L_0x00e5:
            int r9 = r9.f27274h
            if (r9 == r6) goto L_0x0106
            if (r9 == r5) goto L_0x0107
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 52
            r0.<init>(r1)
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.internal.ads.ul0.m31859d(r9)
        L_0x0106:
            r2 = r3
        L_0x0107:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0114
        L_0x010d:
            java.lang.String r9 = r9.f27275i
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0114:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0119:
            com.google.android.gms.internal.ads.up2 r9 = r8.f23429b
            com.google.android.gms.internal.ads.g40 r9 = r9.mo21347a()
            if (r9 == 0) goto L_0x0126
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.se2.mo20837c(java.util.ArrayList, android.os.Bundle):void");
    }
}
