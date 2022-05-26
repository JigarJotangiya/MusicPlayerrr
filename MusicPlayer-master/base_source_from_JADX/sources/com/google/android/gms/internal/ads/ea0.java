package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ea0 implements m60 {

    /* renamed from: a */
    private final g90 f15895a;

    /* renamed from: b */
    private final mm0 f15896b;

    /* renamed from: c */
    final /* synthetic */ fa0 f15897c;

    public ea0(fa0 fa0, g90 g90, mm0 mm0) {
        this.f15897c = fa0;
        this.f15895a = g90;
        this.f15896b = mm0;
    }

    /* renamed from: a */
    public final void mo17140a(JSONObject jSONObject) {
        g90 g90;
        try {
            this.f15896b.mo19449c(this.f15897c.f16488a.mo18050b(jSONObject));
            g90 = this.f15895a;
        } catch (IllegalStateException unused) {
            g90 = this.f15895a;
        } catch (JSONException e) {
            this.f15896b.mo19451e(e);
            g90 = this.f15895a;
        } catch (Throwable th) {
            this.f15895a.mo17885g();
            throw th;
        }
        g90.mo17885g();
    }

    /* renamed from: p */
    public final void mo17141p(String str) {
        g90 g90;
        if (str == null) {
            try {
                this.f15896b.mo19451e(new p90());
            } catch (IllegalStateException unused) {
                g90 = this.f15895a;
            } catch (Throwable th) {
                this.f15895a.mo17885g();
                throw th;
            }
        } else {
            this.f15896b.mo19451e(new p90(str));
        }
        g90 = this.f15895a;
        g90.mo17885g();
    }
}
