package com.google.android.play.core.appupdate;

import android.content.Context;
import p159f.p243f.p245b.p318c.p319a.p320a.C7607p;

/* renamed from: com.google.android.play.core.appupdate.e */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6295e {

    /* renamed from: a */
    private static C6296f f29281a;

    /* renamed from: a */
    static synchronized C6296f m37505a(Context context) {
        C6296f fVar;
        synchronized (C6295e.class) {
            if (f29281a == null) {
                C6291c0 c0Var = new C6291c0((C6289b0) null);
                c0Var.mo25161a(new C6302l(C7607p.m42395a(context)));
                f29281a = c0Var.mo25162b();
            }
            fVar = f29281a;
        }
        return fVar;
    }
}
