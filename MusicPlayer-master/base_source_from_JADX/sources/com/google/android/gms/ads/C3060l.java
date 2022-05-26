package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.l */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C3060l extends C2851a {

    /* renamed from: e */
    private final C3112s f10147e;

    public C3060l(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, C2851a aVar, C3112s sVar) {
        super(i, str, str2, aVar);
        this.f10147e = sVar;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public final JSONObject mo10669e() throws JSONException {
        JSONObject e = super.mo10669e();
        C3112s f = mo11169f();
        if (f == null) {
            e.put("Response Info", "null");
        } else {
            e.put("Response Info", f.mo11348d());
        }
        return e;
    }

    @RecentlyNullable
    /* renamed from: f */
    public C3112s mo11169f() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22654w5)).booleanValue()) {
            return this.f10147e;
        }
        return null;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo10669e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
