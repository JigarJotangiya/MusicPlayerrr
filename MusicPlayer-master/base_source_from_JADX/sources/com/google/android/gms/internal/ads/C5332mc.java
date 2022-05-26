package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p073w.C3120a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.mc */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5332mc extends C5111gd {
    public C5332mc(C5701wb wbVar, String str, String str2, C4920b8 b8Var, int i, int i2) {
        super(wbVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", b8Var, i, 24);
    }

    /* renamed from: c */
    private final void m27221c() {
        C3120a h = this.f17016a.mo21783h();
        if (h != null) {
            try {
                C3120a.C3121a c = h.mo11376c();
                String d = C5813zb.m34501d(c.mo11379a());
                if (d != null) {
                    synchronized (this.f17019d) {
                        this.f17019d.mo16127l0(d);
                        this.f17019d.mo16126k0(c.mo11380b());
                        this.f17019d.mo16106O(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15751a() throws IllegalAccessException, InvocationTargetException {
        if (!this.f17016a.mo21790q()) {
            synchronized (this.f17019d) {
                this.f17019d.mo16127l0((String) this.f17020e.invoke((Object) null, new Object[]{this.f17016a.mo21778b()}));
            }
            return;
        }
        m27221c();
    }

    /* renamed from: b */
    public final Void mo17895b() throws Exception {
        if (this.f17016a.mo21791r()) {
            super.mo17895b();
            return null;
        }
        if (this.f17016a.mo21790q()) {
            m27221c();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo17895b();
        return null;
    }
}
