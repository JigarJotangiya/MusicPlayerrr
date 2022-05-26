package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5316lx;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.zzbfm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.s */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C3112s {

    /* renamed from: a */
    private final C5316lx f10205a;

    /* renamed from: b */
    private final List<C2924i> f10206b = new ArrayList();

    private C3112s(C5316lx lxVar) {
        this.f10205a = lxVar;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22654w5)).booleanValue() && lxVar != null) {
            try {
                List<zzbfm> d = lxVar.mo18761d();
                if (d != null) {
                    for (zzbfm a : d) {
                        C2924i a2 = C2924i.m13032a(a);
                        if (a2 != null) {
                            this.f10206b.add(a2);
                        }
                    }
                }
            } catch (RemoteException e) {
                ul0.m31860e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    /* renamed from: c */
    public static C3112s m13667c(C5316lx lxVar) {
        if (lxVar != null) {
            return new C3112s(lxVar);
        }
        return null;
    }

    @RecentlyNullable
    /* renamed from: a */
    public String mo11346a() {
        try {
            C5316lx lxVar = this.f10205a;
            if (lxVar != null) {
                return lxVar.zze();
            }
            return null;
        } catch (RemoteException e) {
            ul0.m31860e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @RecentlyNullable
    /* renamed from: b */
    public String mo11347b() {
        try {
            C5316lx lxVar = this.f10205a;
            if (lxVar != null) {
                return lxVar.mo18760c();
            }
            return null;
        } catch (RemoteException e) {
            ul0.m31860e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @RecentlyNonNull
    /* renamed from: d */
    public final JSONObject mo11348d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String b = mo11347b();
        if (b == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", b);
        }
        String a = mo11346a();
        if (a == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", a);
        }
        JSONArray jSONArray = new JSONArray();
        for (C2924i b2 : this.f10206b) {
            jSONArray.put(b2.mo10811b());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo11348d().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
