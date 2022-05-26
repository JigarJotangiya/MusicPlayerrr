package com.google.android.play.core.assetpacks;

import android.content.Context;
import p159f.p243f.p245b.p318c.p319a.p320a.C7607p;

/* renamed from: com.google.android.play.core.assetpacks.v1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6431v1 {

    /* renamed from: a */
    private static C6342e f29681a;

    /* renamed from: a */
    static synchronized C6342e m37811a(Context context) {
        C6342e eVar;
        synchronized (C6431v1.class) {
            if (f29681a == null) {
                C6445y0 y0Var = new C6445y0((C6440x0) null);
                y0Var.mo25378b(new C6433v3(C7607p.m42395a(context)));
                f29681a = y0Var.mo25377a();
            }
            eVar = f29681a;
        }
        return eVar;
    }
}
