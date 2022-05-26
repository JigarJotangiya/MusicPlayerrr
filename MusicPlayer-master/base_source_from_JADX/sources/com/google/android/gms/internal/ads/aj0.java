package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.util.C3024o1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aj0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g */
    private final Context f13898g;

    /* renamed from: h */
    private final SharedPreferences f13899h;

    /* renamed from: i */
    private final C3024o1 f13900i;

    /* renamed from: j */
    private final ck0 f13901j;

    /* renamed from: k */
    private String f13902k = "-1";

    /* renamed from: l */
    private int f13903l = -1;

    aj0(Context context, C3024o1 o1Var, ck0 ck0) {
        this.f13899h = PreferenceManager.getDefaultSharedPreferences(context);
        this.f13900i = o1Var;
        this.f13898g = context;
        this.f13901j = ck0;
    }

    /* renamed from: b */
    private final void m20738b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22569m0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22553k0)).booleanValue()) {
            this.f13900i.mo11087c0(z);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22469Z3)).booleanValue() && z && (context = this.f13898g) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22521g0)).booleanValue()) {
            this.f13901j.mo16672y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15796a() {
        this.f13899h.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f13899h, "IABTCF_PurposeConsents");
        onSharedPreferenceChanged(this.f13899h, "gad_has_consent_for_cookies");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            java.lang.String r1 = "-1"
            java.lang.String r2 = r9.getString(r0, r1)
            java.lang.String r3 = "gad_has_consent_for_cookies"
            r4 = -1
            int r9 = r9.getInt(r3, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r5 = r10.hashCode()
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L_0x002b
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L_0x0023
            goto L_0x0033
        L_0x0023:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0033
            r10 = 1
            goto L_0x0034
        L_0x002b:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x0033
            r10 = 0
            goto L_0x0034
        L_0x0033:
            r10 = -1
        L_0x0034:
            if (r10 == 0) goto L_0x0057
            if (r10 == r7) goto L_0x0039
            return
        L_0x0039:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.C5503qz.f22569m0
            com.google.android.gms.internal.ads.oz r0 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r10 = r0.mo20153b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x006a
            if (r9 == r4) goto L_0x006a
            int r10 = r8.f13903l
            if (r10 == r9) goto L_0x006a
            r8.f13903l = r9
            r8.m20738b(r2, r9)
            return
        L_0x0057:
            boolean r10 = r2.equals(r1)
            if (r10 != 0) goto L_0x006a
            java.lang.String r10 = r8.f13902k
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L_0x006a
            r8.f13902k = r2
            r8.m20738b(r2, r9)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
