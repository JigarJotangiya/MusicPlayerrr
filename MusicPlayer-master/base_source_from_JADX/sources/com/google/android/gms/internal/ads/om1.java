package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class om1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ d93 f21052a;

    /* renamed from: b */
    public final /* synthetic */ d93 f21053b;

    /* renamed from: c */
    public final /* synthetic */ d93 f21054c;

    /* renamed from: d */
    public final /* synthetic */ d93 f21055d;

    /* renamed from: e */
    public final /* synthetic */ d93 f21056e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f21057f;

    /* renamed from: g */
    public final /* synthetic */ d93 f21058g;

    /* renamed from: h */
    public final /* synthetic */ d93 f21059h;

    /* renamed from: i */
    public final /* synthetic */ d93 f21060i;

    /* renamed from: j */
    public final /* synthetic */ d93 f21061j;

    public /* synthetic */ om1(pm1 pm1, d93 d93, d93 d932, d93 d933, d93 d934, d93 d935, JSONObject jSONObject, d93 d936, d93 d937, d93 d938, d93 d939) {
        this.f21052a = d93;
        this.f21053b = d932;
        this.f21054c = d933;
        this.f21055d = d934;
        this.f21056e = d935;
        this.f21057f = jSONObject;
        this.f21058g = d936;
        this.f21059h = d937;
        this.f21060i = d938;
        this.f21061j = d939;
    }

    public final Object call() {
        d93 d93 = this.f21052a;
        d93 d932 = this.f21053b;
        d93 d933 = this.f21054c;
        d93 d934 = this.f21055d;
        d93 d935 = this.f21056e;
        JSONObject jSONObject = this.f21057f;
        d93 d936 = this.f21058g;
        d93 d937 = this.f21059h;
        d93 d938 = this.f21060i;
        d93 d939 = this.f21061j;
        bk1 bk1 = (bk1) d93.get();
        bk1.mo16295n((List) d932.get());
        bk1.mo16292k((q20) d933.get());
        bk1.mo16296o((q20) d934.get());
        bk1.mo16288h((j20) d935.get());
        bk1.mo16298q(dn1.m22569j(jSONObject));
        bk1.mo16291j(dn1.m22568i(jSONObject));
        pr0 pr0 = (pr0) d936.get();
        if (pr0 != null) {
            bk1.mo16306y(pr0);
            bk1.mo16305x(pr0.mo15939Z());
            bk1.mo16304w(pr0.zzs());
        }
        pr0 pr02 = (pr0) d937.get();
        if (pr02 != null) {
            bk1.mo16294m(pr02);
            bk1.mo16307z(pr02.mo15939Z());
        }
        pr0 pr03 = (pr0) d938.get();
        if (pr03 != null) {
            bk1.mo16299r(pr03);
        }
        for (hn1 hn1 : (List) d939.get()) {
            if (hn1.f17716a != 1) {
                bk1.mo16293l(hn1.f17717b, hn1.f17719d);
            } else {
                bk1.mo16302u(hn1.f17717b, hn1.f17718c);
            }
        }
        return bk1;
    }
}
