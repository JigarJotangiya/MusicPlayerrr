package com.google.android.gms.ads.p073w;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C3245g;

/* renamed from: com.google.android.gms.ads.w.c */
public final class C3124c {

    /* renamed from: a */
    private SharedPreferences f10232a;

    public C3124c(Context context) {
        try {
            Context c = C3245g.m14047c(context);
            this.f10232a = c == null ? null : c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f10232a = null;
        }
    }

    /* renamed from: a */
    public final boolean mo11384a(String str, boolean z) {
        try {
            SharedPreferences sharedPreferences = this.f10232a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo11385b(String str, float f) {
        try {
            SharedPreferences sharedPreferences = this.f10232a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo11386c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f10232a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
