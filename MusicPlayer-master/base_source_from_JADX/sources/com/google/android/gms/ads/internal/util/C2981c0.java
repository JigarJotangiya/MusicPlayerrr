package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3365j;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.dw1;
import com.google.android.gms.internal.ads.ew1;
import com.google.android.gms.internal.ads.ul0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.c0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2981c0 {

    /* renamed from: a */
    private final Object f9991a = new Object();

    /* renamed from: b */
    private String f9992b = BuildConfig.FLAVOR;

    /* renamed from: c */
    private String f9993c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private boolean f9994d = false;

    /* renamed from: e */
    private boolean f9995e = false;

    /* renamed from: f */
    protected String f9996f = BuildConfig.FLAVOR;

    /* renamed from: g */
    private ew1 f9997g;

    /* renamed from: o */
    protected static final String m13292o(Context context, String str, String str2) {
        String str3;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C2971s.m13214q().mo10977L(context, str2));
        d93<String> b = new C3032r0(context).mo11110b(0, str, hashMap, (byte[]) null);
        try {
            return b.get((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22426T2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3 = "Timeout while retrieving a response from: ".concat(valueOf);
            } else {
                str3 = new String("Timeout while retrieving a response from: ");
            }
            ul0.m31860e(str3, e);
            b.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str4 = "Interrupted while retrieving a response from: ".concat(valueOf2);
            } else {
                str4 = new String("Interrupted while retrieving a response from: ");
            }
            ul0.m31860e(str4, e2);
            b.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                str5 = "Error retrieving a response from: ".concat(valueOf3);
            } else {
                str5 = new String("Error retrieving a response from: ");
            }
            ul0.m31860e(str5, e3);
            return null;
        }
    }

    /* renamed from: p */
    private final Uri m13293p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f9991a) {
            if (TextUtils.isEmpty(this.f9992b)) {
                C2971s.m13214q();
                try {
                    str5 = new String(C3365j.m14465d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    ul0.m31857b("Error reading from internal storage.");
                    str5 = BuildConfig.FLAVOR;
                }
                this.f9992b = str5;
                if (TextUtils.isEmpty(str5)) {
                    C2971s.m13214q();
                    this.f9992b = UUID.randomUUID().toString();
                    C2971s.m13214q();
                    String str6 = this.f9992b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        ul0.m31860e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f9992b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    public final ew1 mo10990a() {
        return this.f9997g;
    }

    /* renamed from: b */
    public final String mo10991b() {
        String str;
        synchronized (this.f9991a) {
            str = this.f9993c;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo10992c(Context context) {
        ew1 ew1;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue() && (ew1 = this.f9997g) != null) {
            ew1.mo17368g(new C3052y(this, context), dw1.DEBUG_MENU);
        }
    }

    /* renamed from: d */
    public final void mo10993d(Context context, String str, String str2) {
        C2971s.m13214q();
        C2979b2.m13277y(context, m13293p(context, (String) C5054ev.m23225c().mo20153b(C5503qz.f22398P2), str, str2));
    }

    /* renamed from: e */
    public final void mo10994e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m13293p(context, (String) C5054ev.m23225c().mo20153b(C5503qz.f22419S2), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C2971s.m13214q();
        C2979b2.m13267o(context, str, buildUpon.build().toString());
    }

    /* renamed from: f */
    public final void mo10995f(boolean z) {
        synchronized (this.f9991a) {
            this.f9995e = z;
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue()) {
                C2971s.m13213p().mo17562h().mo11081Z(z);
                ew1 ew1 = this.f9997g;
                if (ew1 != null) {
                    ew1.mo17370i(z);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo10996g(ew1 ew1) {
        this.f9997g = ew1;
    }

    /* renamed from: h */
    public final void mo10997h(boolean z) {
        synchronized (this.f9991a) {
            this.f9994d = z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo10998i(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            ul0.m31861f("Can not create dialog without Activity Context");
        } else {
            C2979b2.f9980i.post(new C2973a0(this, context, str, z, z2));
        }
    }

    /* renamed from: j */
    public final boolean mo10999j(Context context, String str, String str2) {
        String o = m13292o(context, m13293p(context, (String) C5054ev.m23225c().mo20153b(C5503qz.f22412R2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            ul0.m31857b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o.trim()).optString("debug_mode"));
            mo10995f(equals);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue()) {
                C3024o1 h = C2971s.m13213p().mo17562h();
                if (true != equals) {
                    str = BuildConfig.FLAVOR;
                }
                h.mo11079X(str);
            }
            return equals;
        } catch (JSONException e) {
            ul0.m31863h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11000k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.iz<java.lang.String> r0 = com.google.android.gms.internal.ads.C5503qz.f22405Q2
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.m13293p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = m13292o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.ul0.m31857b(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            r3.f9996f = r6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.C5503qz.f22535h6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ JSONException -> 0x0083 }
            java.lang.Object r6 = r1.mo20153b(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0083 }
            r1 = 1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f9996f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f9996f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            r3.mo10995f(r6)     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.fl0 r2 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.ads.internal.util.o1 r2 = r2.mo17562h()     // Catch:{ JSONException -> 0x0083 }
            if (r1 == r6) goto L_0x0076
            java.lang.String r5 = ""
        L_0x0076:
            r2.mo11079X(r5)     // Catch:{ JSONException -> 0x0083 }
        L_0x0079:
            java.lang.Object r5 = r3.f9991a
            monitor-enter(r5)
            r3.f9993c = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x0080:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r4
        L_0x0083:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.ul0.m31863h(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C2981c0.mo11000k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: l */
    public final boolean mo11001l() {
        boolean z;
        synchronized (this.f9991a) {
            z = this.f9995e;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo11002m() {
        boolean z;
        synchronized (this.f9991a) {
            z = this.f9994d;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo11003n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !mo11002m()) {
            return false;
        }
        ul0.m31857b("Sending troubleshooting signals to the server.");
        mo10994e(context, str, str2, str3);
        return true;
    }
}
