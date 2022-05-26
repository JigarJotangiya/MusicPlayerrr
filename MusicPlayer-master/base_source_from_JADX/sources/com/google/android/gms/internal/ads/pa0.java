package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class pa0 extends am0 {
    public pa0(oa0 oa0, String str) {
        super(str);
    }

    /* renamed from: p */
    public final void mo11120p(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "LeibnizHttpUrlPinger pinging URL: ".concat(valueOf);
        } else {
            str2 = new String("LeibnizHttpUrlPinger pinging URL: ");
        }
        ul0.m31857b(str2);
        if (!"oda".equals(Uri.parse(str).getScheme())) {
            ul0.m31857b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
            super.mo11120p(str);
        }
    }
}
