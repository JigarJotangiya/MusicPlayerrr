package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sv2 {

    /* renamed from: a */
    private boolean f23644a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20971a(Context context) {
        dx2.m22729b(context, "Application Context cannot be null");
        if (!this.f23644a) {
            this.f23644a = true;
            qw2.m29759b().mo20517c(context);
            lw2.m26991a().mo19291c(context);
            bx2.m21585f(context);
            nw2.m28123b().mo19859c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo20972b() {
        return this.f23644a;
    }
}
