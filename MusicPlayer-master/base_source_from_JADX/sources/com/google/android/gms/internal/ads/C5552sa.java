package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.sa */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5552sa {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConditionVariable f23390c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile c03 f23391d = null;

    /* renamed from: e */
    private static volatile Random f23392e = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5701wb f23393a;

    /* renamed from: b */
    protected volatile Boolean f23394b;

    public C5552sa(C5701wb wbVar) {
        this.f23393a = wbVar;
        wbVar.mo21786k().execute(new C5515ra(this));
    }

    /* renamed from: d */
    public static final int m30631d() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return m30632e().nextInt();
        } catch (RuntimeException unused) {
            return m30632e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m30632e() {
        if (f23392e == null) {
            synchronized (C5552sa.class) {
                if (f23392e == null) {
                    f23392e = new Random();
                }
            }
        }
        return f23392e;
    }

    /* renamed from: c */
    public final void mo20812c(int i, int i2, long j, String str, Exception exc) {
        try {
            f23390c.block();
            if (this.f23394b.booleanValue() && f23391d != null) {
                C5364n7 D = C5512r7.m29884D();
                D.mo19619r(this.f23393a.f25311a.getPackageName());
                D.mo19623v(j);
                if (str != null) {
                    D.mo19620s(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    D.mo19624w(stringWriter.toString());
                    D.mo19622u(exc.getClass().getName());
                }
                b03 a = f23391d.mo16444a(((C5512r7) D.mo19761n()).mo21561e());
                a.mo15993a(i);
                if (i2 != -1) {
                    a.mo15994b(i2);
                }
                a.mo15995c();
            }
        } catch (Exception unused) {
        }
    }
}
