package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;

/* renamed from: com.google.android.gms.common.x */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3376x {

    /* renamed from: a */
    static final C3374v f10777a = new C3340r(C3354t.m14421f2("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: b */
    static final C3374v f10778b = new C3341s(C3354t.m14421f2("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: c */
    private static Context f10779c;

    static {
        new C3338p(C3354t.m14421f2("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new C3339q(C3354t.m14421f2("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    /* renamed from: a */
    static synchronized void m14485a(Context context) {
        synchronized (C3376x.class) {
            if (f10779c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f10779c = context.getApplicationContext();
            }
        }
    }
}
