package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.C2971s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jd2 implements sg2<id2> {

    /* renamed from: a */
    private final Context f18461a;

    /* renamed from: b */
    private final e93 f18462b;

    jd2(Context context, e93 e93) {
        this.f18461a = context;
        this.f18462b = e93;
    }

    /* renamed from: a */
    public final d93<id2> mo15767a() {
        return this.f18462b.mo17138A0(new gd2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ id2 mo18607b() throws Exception {
        String str;
        Bundle bundle;
        C2971s.m13214q();
        Context context = this.f18461a;
        boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22420S3)).booleanValue();
        String str2 = BuildConfig.FLAVOR;
        if (!booleanValue) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22434U3)).booleanValue()) {
            str2 = this.f18461a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        C2971s.m13214q();
        Context context2 = this.f18461a;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22427T3)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new id2(str, str2, bundle, (hd2) null);
    }
}
