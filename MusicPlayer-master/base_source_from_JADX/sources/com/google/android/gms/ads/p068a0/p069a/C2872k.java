package com.google.android.gms.ads.p068a0.p069a;

import android.webkit.ValueCallback;
import com.google.android.gms.ads.p070b0.C2892b;
import com.google.android.gms.ads.p070b0.C2893c;
import com.google.android.gms.internal.ads.ul0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.a0.a.k */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2872k extends C2893c {

    /* renamed from: a */
    final /* synthetic */ String f9742a;

    /* renamed from: b */
    final /* synthetic */ C2852a f9743b;

    C2872k(C2852a aVar, String str) {
        this.f9743b = aVar;
        this.f9742a = str;
    }

    /* renamed from: a */
    public final void mo10699a(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Failed to generate query info for the tagging library, error: ".concat(valueOf);
        } else {
            str2 = new String("Failed to generate query info for the tagging library, error: ");
        }
        ul0.m31862g(str2);
        this.f9743b.f9675b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[]{this.f9742a, str}), (ValueCallback) null);
    }

    /* renamed from: b */
    public final void mo10700b(C2892b bVar) {
        String str;
        String b = bVar.mo10720b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f9742a);
            jSONObject.put("signal", b);
            str = String.format("window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[]{this.f9742a, bVar.mo10720b()});
        }
        this.f9743b.f9675b.evaluateJavascript(str, (ValueCallback) null);
    }
}
