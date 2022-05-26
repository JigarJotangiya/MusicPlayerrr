package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fa0<I, O> implements q90<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final s90<O> f16488a;

    /* renamed from: b */
    private final u90<I> f16489b;

    /* renamed from: c */
    private final m90 f16490c;

    /* renamed from: d */
    private final String f16491d;

    fa0(m90 m90, String str, u90<I> u90, s90<O> s90) {
        this.f16490c = m90;
        this.f16491d = str;
        this.f16489b = u90;
        this.f16488a = s90;
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m23553d(fa0 fa0, g90 g90, n90 n90, Object obj, mm0 mm0) {
        try {
            C2971s.m13214q();
            String uuid = UUID.randomUUID().toString();
            x50.f25675o.mo19617c(uuid, new ea0(fa0, g90, mm0));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", fa0.f16489b.mo18249a(obj));
            n90.mo17684c1(fa0.f16491d, jSONObject);
        } catch (Exception e) {
            mm0.mo19451e(e);
            ul0.m31860e("Unable to invokeJavascript", e);
            g90.mo17885g();
        } catch (Throwable th) {
            g90.mo17885g();
            throw th;
        }
    }

    /* renamed from: a */
    public final d93<O> mo17513a(I i) {
        mm0 mm0 = new mm0();
        g90 b = this.f16490c.mo19354b((C5737xa) null);
        b.mo21119e(new ca0(this, b, i, mm0), new da0(this, mm0, b));
        return mm0;
    }

    /* renamed from: b */
    public final d93<O> mo10692b(I i) throws Exception {
        return mo17513a(i);
    }
}
