package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rd2 implements rg2<Bundle> {

    /* renamed from: a */
    public final String f22826a;

    /* renamed from: b */
    public final boolean f22827b;

    public rd2(String str, boolean z) {
        this.f22826a = str;
        this.f22827b = z;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f22826a);
        if (this.f22827b) {
            bundle.putString("de", "1");
        }
    }
}
