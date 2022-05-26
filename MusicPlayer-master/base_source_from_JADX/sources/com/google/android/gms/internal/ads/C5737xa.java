package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xa */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5737xa {

    /* renamed from: d */
    private static final String[] f25726d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private final String f25727a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f25728b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final C5589ta f25729c;

    @Deprecated
    public C5737xa(C5589ta taVar) {
        this.f25729c = taVar;
    }

    /* renamed from: g */
    private final Uri m33622g(Uri uri, String str) throws C5775ya {
        Objects.requireNonNull(uri);
        try {
            if (uri.getHost().equals(this.f25727a)) {
                try {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new C5775ya("Parameter already exists: dc_ms");
                } catch (UnsupportedOperationException unused) {
                    throw new C5775ya("Provided Uri is not in a valid state");
                }
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        }
        throw new C5775ya("Query parameter already exists: ms");
    }

    @Deprecated
    /* renamed from: a */
    public final Uri mo21997a(Uri uri, Context context, View view, Activity activity) throws C5775ya {
        try {
            return m33622g(uri, this.f25729c.mo10842d(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new C5775ya("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* renamed from: b */
    public final Uri mo21998b(Uri uri, Context context) throws C5775ya {
        return m33622g(uri, this.f25729c.mo10840b(context));
    }

    @Deprecated
    /* renamed from: c */
    public final C5589ta mo21999c() {
        return this.f25729c;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo22000d(MotionEvent motionEvent) {
        this.f25729c.mo10843e(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo22001e(Uri uri) {
        if (mo22002f(uri)) {
            String[] strArr = f25726d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo22002f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f25728b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
