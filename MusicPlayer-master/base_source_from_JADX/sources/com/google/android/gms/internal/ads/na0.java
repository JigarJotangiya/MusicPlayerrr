package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class na0<I, O> implements y73<I, O> {

    /* renamed from: a */
    private final String f20568a = "google.afma.activeView.handleUpdate";

    /* renamed from: b */
    private final d93<n90> f20569b;

    na0(d93<n90> d93, String str, u90<I> u90, s90<O> s90) {
        this.f20569b = d93;
    }

    /* renamed from: a */
    public final d93<O> mo19664a(I i) {
        return s83.m30612n(this.f20569b, new la0(this, i), hm0.f17713f);
    }

    /* renamed from: b */
    public final d93<O> mo10692b(I i) throws Exception {
        return mo19664a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo19665c(Object obj, n90 n90) throws Exception {
        mm0 mm0 = new mm0();
        C2971s.m13214q();
        String uuid = UUID.randomUUID().toString();
        x50.f25675o.mo19617c(uuid, new ma0(this, mm0));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        n90.mo17684c1(this.f20568a, jSONObject);
        return mm0;
    }
}
