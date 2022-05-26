package com.google.android.gms.ads;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.zzbew;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class C2851a {

    /* renamed from: a */
    private final int f9670a;

    /* renamed from: b */
    private final String f9671b;

    /* renamed from: c */
    private final String f9672c;

    /* renamed from: d */
    private final C2851a f9673d;

    public C2851a(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i, str, str2, (C2851a) null);
    }

    public C2851a(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, C2851a aVar) {
        this.f9670a = i;
        this.f9671b = str;
        this.f9672c = str2;
        this.f9673d = aVar;
    }

    /* renamed from: a */
    public int mo10665a() {
        return this.f9670a;
    }

    /* renamed from: b */
    public String mo10666b() {
        return this.f9672c;
    }

    /* renamed from: c */
    public String mo10667c() {
        return this.f9671b;
    }

    /* renamed from: d */
    public final zzbew mo10668d() {
        zzbew zzbew;
        C2851a aVar = this.f9673d;
        if (aVar == null) {
            zzbew = null;
        } else {
            zzbew = new zzbew(aVar.f9670a, aVar.f9671b, aVar.f9672c, (zzbew) null, (IBinder) null);
        }
        return new zzbew(this.f9670a, this.f9671b, this.f9672c, zzbew, (IBinder) null);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public JSONObject mo10669e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f9670a);
        jSONObject.put("Message", this.f9671b);
        jSONObject.put("Domain", this.f9672c);
        C2851a aVar = this.f9673d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", aVar.mo10669e());
        }
        return jSONObject;
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
