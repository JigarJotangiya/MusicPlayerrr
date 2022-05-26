package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C2997g0;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.common.internal.C3292l;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l90 extends tm0<g80> {

    /* renamed from: c */
    private final Object f19262c = new Object();

    /* renamed from: d */
    private boolean f19263d = false;

    /* renamed from: e */
    private int f19264e = 0;

    public l90(C2997g0<g80> g0Var) {
    }

    /* renamed from: f */
    public final g90 mo19109f() {
        g90 g90 = new g90(this);
        synchronized (this.f19262c) {
            mo21119e(new h90(this, g90), new i90(this, g90));
            C3292l.m14242j(this.f19264e >= 0);
            this.f19264e++;
        }
        return g90;
    }

    /* renamed from: g */
    public final void mo19110g() {
        synchronized (this.f19262c) {
            C3292l.m14242j(this.f19264e >= 0);
            C3018m1.m13388k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f19263d = true;
            mo19111h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo19111h() {
        synchronized (this.f19262c) {
            C3292l.m14242j(this.f19264e >= 0);
            if (!this.f19263d || this.f19264e != 0) {
                C3018m1.m13388k("There are still references to the engine. Not destroying.");
            } else {
                C3018m1.m13388k("No reference is left (including root). Cleaning up engine.");
                mo21119e(new k90(this), new pm0());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo19112i() {
        synchronized (this.f19262c) {
            C3292l.m14242j(this.f19264e > 0);
            C3018m1.m13388k("Releasing 1 reference for JS Engine");
            this.f19264e--;
            mo19111h();
        }
    }
}
