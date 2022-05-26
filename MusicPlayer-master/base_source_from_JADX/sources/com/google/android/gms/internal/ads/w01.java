package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.common.util.C3359d;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w01 implements C5824zm {

    /* renamed from: g */
    private pr0 f25161g;

    /* renamed from: h */
    private final Executor f25162h;

    /* renamed from: i */
    private final i01 f25163i;

    /* renamed from: j */
    private final C3359d f25164j;

    /* renamed from: k */
    private boolean f25165k = false;

    /* renamed from: l */
    private boolean f25166l = false;

    /* renamed from: m */
    private final l01 f25167m = new l01();

    public w01(Executor executor, i01 i01, C3359d dVar) {
        this.f25162h = executor;
        this.f25163i = i01;
        this.f25164j = dVar;
    }

    /* renamed from: f */
    private final void m32844f() {
        try {
            JSONObject b = this.f25163i.mo18249a(this.f25167m);
            if (this.f25161g != null) {
                this.f25162h.execute(new v01(this, b));
            }
        } catch (JSONException e) {
            C3018m1.m13389l("Failed to call video active view js", e);
        }
    }

    /* renamed from: H0 */
    public final void mo16484H0(C5749xm xmVar) {
        boolean z;
        l01 l01 = this.f25167m;
        if (this.f25166l) {
            z = false;
        } else {
            z = xmVar.f25884j;
        }
        l01.f19128a = z;
        l01.f19131d = this.f25164j.mo11989b();
        this.f25167m.f19133f = xmVar;
        if (this.f25165k) {
            m32844f();
        }
    }

    /* renamed from: a */
    public final void mo21672a() {
        this.f25165k = false;
    }

    /* renamed from: b */
    public final void mo21673b() {
        this.f25165k = true;
        m32844f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo21674c(JSONObject jSONObject) {
        this.f25161g.mo17684c1("AFMA_updateActiveView", jSONObject);
    }

    /* renamed from: d */
    public final void mo21675d(boolean z) {
        this.f25166l = z;
    }

    /* renamed from: e */
    public final void mo21676e(pr0 pr0) {
        this.f25161g = pr0;
    }
}
