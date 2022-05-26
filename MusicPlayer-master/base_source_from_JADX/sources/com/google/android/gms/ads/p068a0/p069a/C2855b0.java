package com.google.android.gms.ads.p068a0.p069a;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.lk0;
import com.google.android.gms.internal.ads.o83;
import com.google.android.gms.internal.ads.ul0;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.a0.a.b0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2855b0 implements o83<C2870j> {

    /* renamed from: a */
    final /* synthetic */ lk0 f9680a;

    /* renamed from: b */
    final /* synthetic */ C2863f0 f9681b;

    C2855b0(C2863f0 f0Var, lk0 lk0) {
        this.f9681b = f0Var;
        this.f9680a = lk0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        C2870j jVar = (C2870j) obj;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22463Y4)).booleanValue()) {
            try {
                this.f9680a.mo18645p("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                ul0.m31859d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
        } else if (jVar == null) {
            try {
                this.f9680a.mo18644R1((String) null, (String) null, (Bundle) null);
                C2863f0.m12859G7(this.f9681b, "sgs", "rid", "-1");
            } catch (RemoteException e2) {
                ul0.m31860e(BuildConfig.FLAVOR, e2);
            }
        } else {
            try {
                String optString = new JSONObject(jVar.f9739b).optString("request_id", BuildConfig.FLAVOR);
                if (TextUtils.isEmpty(optString)) {
                    ul0.m31862g("The request ID is empty in request JSON.");
                    this.f9680a.mo18645p("Internal error: request ID is empty in request JSON.");
                    C2863f0.m12859G7(this.f9681b, "sgf", "sgf_reason", "rid_missing");
                    return;
                }
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22365K4)).booleanValue()) {
                    this.f9681b.f9712q.mo10702c(optString, jVar.f9739b);
                }
                Bundle bundle = jVar.f9740c;
                if (this.f9681b.f9719x && bundle != null && bundle.getInt(this.f9681b.f9721z, -1) == -1) {
                    bundle.putInt(this.f9681b.f9721z, this.f9681b.f9698A.get());
                }
                if (this.f9681b.f9718w && bundle != null && TextUtils.isEmpty(bundle.getString(this.f9681b.f9720y))) {
                    if (TextUtils.isEmpty(this.f9681b.f9700C)) {
                        this.f9681b.f9700C = C2971s.m13214q().mo10977L(this.f9681b.f9703h, this.f9681b.f9699B.f27376g);
                    }
                    bundle.putString(this.f9681b.f9720y, this.f9681b.f9700C);
                }
                this.f9680a.mo18644R1(jVar.f9738a, jVar.f9739b, bundle);
                C2863f0.m12859G7(this.f9681b, "sgs", "rid", optString);
            } catch (JSONException e3) {
                ul0.m31862g("Failed to create JSON object from the request string.");
                lk0 lk0 = this.f9680a;
                String obj2 = e3.toString();
                StringBuilder sb = new StringBuilder(obj2.length() + 33);
                sb.append("Internal error for request JSON: ");
                sb.append(obj2);
                lk0.mo18645p(sb.toString());
                C2863f0.m12859G7(this.f9681b, "sgf", "sgf_reason", "request_invalid");
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        String message = th.getMessage();
        C2971s.m13213p().mo17571s(th, "SignalGeneratorImpl.generateSignals");
        C2863f0.m12859G7(this.f9681b, "sgf", "sgf_reason", message);
        try {
            lk0 lk0 = this.f9680a;
            String valueOf = String.valueOf(message);
            lk0.mo18645p(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
