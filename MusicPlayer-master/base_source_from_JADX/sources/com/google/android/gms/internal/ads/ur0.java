package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ur0 implements o83<Map<String, String>> {

    /* renamed from: a */
    final /* synthetic */ List f24416a;

    /* renamed from: b */
    final /* synthetic */ String f24417b;

    /* renamed from: c */
    final /* synthetic */ Uri f24418c;

    /* renamed from: d */
    final /* synthetic */ wr0 f24419d;

    ur0(wr0 wr0, List list, String str, Uri uri) {
        this.f24419d = wr0;
        this.f24416a = list;
        this.f24417b = str;
        this.f24418c = uri;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        this.f24419d.m33281n((Map) obj, this.f24416a, this.f24417b);
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        String valueOf = String.valueOf(this.f24418c);
        String.valueOf(valueOf).length();
        ul0.m31862g("Failed to parse gmsg params for: ".concat(String.valueOf(valueOf)));
    }
}
