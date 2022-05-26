package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2926b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bp1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final vo1 f14597a = new vo1((uo1) null);

    /* renamed from: b */
    private final C2925a f14598b;

    /* renamed from: c */
    private final Context f14599c;

    /* renamed from: d */
    private final gt1 f14600d;

    /* renamed from: e */
    private final gu2 f14601e;

    /* renamed from: f */
    private final Executor f14602f;

    /* renamed from: g */
    private final C5737xa f14603g;

    /* renamed from: h */
    private final zzcjf f14604h;

    /* renamed from: i */
    private final n60 f14605i;

    /* renamed from: j */
    private final y12 f14606j;

    /* renamed from: k */
    private final lv2 f14607k;

    /* renamed from: l */
    private d93<pr0> f14608l;

    bp1(yo1 yo1) {
        this.f14599c = yo1.f26449c;
        this.f14602f = yo1.f26453g;
        this.f14603g = yo1.f26454h;
        this.f14604h = yo1.f26455i;
        this.f14598b = yo1.f26447a;
        cs0 unused = yo1.f26448b;
        this.f14605i = new n60();
        this.f14606j = yo1.f26452f;
        this.f14607k = yo1.f26456j;
        this.f14600d = yo1.f26450d;
        this.f14601e = yo1.f26451e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ pr0 mo16348a(pr0 pr0) {
        pr0 pr02 = pr0;
        pr02.mo17686d0("/result", this.f14605i);
        et0 Q0 = pr0.mo17673Q0();
        vo1 vo1 = this.f14597a;
        C2926b bVar = r2;
        C2926b bVar2 = new C2926b(this.f14599c, (zi0) null, (zzcde) null);
        Q0.mo17293O((C5497qt) null, vo1, vo1, vo1, vo1, false, (b60) null, bVar, (de0) null, (zi0) null, this.f14606j, this.f14607k, this.f14600d, this.f14601e, (z50) null, (yf1) null);
        return pr02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo16349c(String str, JSONObject jSONObject, pr0 pr0) throws Exception {
        return this.f14605i.mo19616b(pr0, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized d93<JSONObject> mo16350d(String str, JSONObject jSONObject) {
        d93<pr0> d93 = this.f14608l;
        if (d93 == null) {
            return s83.m30607i(null);
        }
        return s83.m30612n(d93, new oo1(this, str, jSONObject), this.f14602f);
    }

    /* renamed from: e */
    public final synchronized void mo16351e(bp2 bp2, ep2 ep2) {
        d93<pr0> d93 = this.f14608l;
        if (d93 != null) {
            s83.m30616r(d93, new to1(this, bp2, ep2), this.f14602f);
        }
    }

    /* renamed from: f */
    public final synchronized void mo16352f() {
        d93<pr0> d93 = this.f14608l;
        if (d93 != null) {
            s83.m30616r(d93, new po1(this), this.f14602f);
            this.f14608l = null;
        }
    }

    /* renamed from: g */
    public final synchronized void mo16353g(String str, Map<String, ?> map) {
        d93<pr0> d93 = this.f14608l;
        if (d93 != null) {
            s83.m30616r(d93, new so1(this, "sendMessageToNativeJs", map), this.f14602f);
        }
    }

    /* renamed from: h */
    public final synchronized void mo16354h() {
        Context context = this.f14599c;
        zzcjf zzcjf = this.f14604h;
        C5207iz izVar = C5503qz.f22483b2;
        d93<pr0> m = s83.m30611m(s83.m30610l(new zr0(context, this.f14603g, zzcjf, this.f14598b, (String) C5054ev.m23225c().mo20153b(izVar)), hm0.f17712e), new no1(this), this.f14602f);
        this.f14608l = m;
        km0.m26271a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void mo16355i(String str, y50<Object> y50) {
        d93<pr0> d93 = this.f14608l;
        if (d93 != null) {
            s83.m30616r(d93, new qo1(this, str, y50), this.f14602f);
        }
    }

    /* renamed from: j */
    public final <T> void mo16356j(WeakReference<T> weakReference, String str, y50<T> y50) {
        mo16355i(str, new ap1(this, weakReference, str, y50, (zo1) null));
    }

    /* renamed from: k */
    public final synchronized void mo16357k(String str, y50<Object> y50) {
        d93<pr0> d93 = this.f14608l;
        if (d93 != null) {
            s83.m30616r(d93, new ro1(this, str, y50), this.f14602f);
        }
    }
}
