package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hx2 {

    /* renamed from: a */
    private JSONObject f17784a;

    /* renamed from: b */
    private final qx2 f17785b;

    public hx2(qx2 qx2) {
        this.f17785b = qx2;
    }

    /* renamed from: a */
    public final JSONObject mo18223a() {
        return this.f17784a;
    }

    /* renamed from: b */
    public final void mo18224b() {
        this.f17785b.mo20527b(new rx2(this, (byte[]) null));
    }

    /* renamed from: c */
    public final void mo18225c(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f17785b.mo20527b(new sx2(this, hashSet, jSONObject, j, (long) null));
    }

    /* renamed from: d */
    public final void mo18226d(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f17785b.mo20527b(new tx2(this, hashSet, jSONObject, j, (long) null));
    }

    /* renamed from: e */
    public final void mo18227e(JSONObject jSONObject) {
        this.f17784a = jSONObject;
    }
}
