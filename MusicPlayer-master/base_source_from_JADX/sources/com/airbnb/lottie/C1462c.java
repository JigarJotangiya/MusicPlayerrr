package com.airbnb.lottie;

import android.content.Context;
import com.airbnb.lottie.p023w.C1621b;
import com.airbnb.lottie.p023w.C1624e;
import com.airbnb.lottie.p023w.C1625f;
import com.airbnb.lottie.p023w.C1626g;
import com.airbnb.lottie.p023w.C1627h;
import java.io.File;
import p082e.p109h.p115l.C3656k;

/* renamed from: com.airbnb.lottie.c */
/* compiled from: L */
public class C1462c {

    /* renamed from: a */
    public static boolean f5612a = false;

    /* renamed from: b */
    private static boolean f5613b = false;

    /* renamed from: c */
    private static String[] f5614c;

    /* renamed from: d */
    private static long[] f5615d;

    /* renamed from: e */
    private static int f5616e;

    /* renamed from: f */
    private static int f5617f;

    /* renamed from: g */
    private static C1625f f5618g;

    /* renamed from: h */
    private static C1624e f5619h;

    /* renamed from: i */
    private static volatile C1627h f5620i;

    /* renamed from: j */
    private static volatile C1626g f5621j;

    /* renamed from: com.airbnb.lottie.c$a */
    /* compiled from: L */
    class C1463a implements C1624e {

        /* renamed from: a */
        final /* synthetic */ Context f5622a;

        C1463a(Context context) {
            this.f5622a = context;
        }

        /* renamed from: a */
        public File mo7001a() {
            return new File(this.f5622a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m7603a(String str) {
        if (f5613b) {
            int i = f5616e;
            if (i == 20) {
                f5617f++;
                return;
            }
            f5614c[i] = str;
            f5615d[i] = System.nanoTime();
            C3656k.m15717a(str);
            f5616e++;
        }
    }

    /* renamed from: b */
    public static float m7604b(String str) {
        int i = f5617f;
        if (i > 0) {
            f5617f = i - 1;
            return 0.0f;
        } else if (!f5613b) {
            return 0.0f;
        } else {
            int i2 = f5616e - 1;
            f5616e = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f5614c[i2])) {
                C3656k.m15718b();
                return ((float) (System.nanoTime() - f5615d[f5616e])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f5614c[f5616e] + ".");
            }
        }
    }

    /* renamed from: c */
    public static C1626g m7605c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C1626g gVar = f5621j;
        if (gVar == null) {
            synchronized (C1626g.class) {
                gVar = f5621j;
                if (gVar == null) {
                    C1624e eVar = f5619h;
                    if (eVar == null) {
                        eVar = new C1463a(applicationContext);
                    }
                    gVar = new C1626g(eVar);
                    f5621j = gVar;
                }
            }
        }
        return gVar;
    }

    /* renamed from: d */
    public static C1627h m7606d(Context context) {
        C1627h hVar = f5620i;
        if (hVar == null) {
            synchronized (C1627h.class) {
                hVar = f5620i;
                if (hVar == null) {
                    C1626g c = m7605c(context);
                    C1625f fVar = f5618g;
                    if (fVar == null) {
                        fVar = new C1621b();
                    }
                    hVar = new C1627h(c, fVar);
                    f5620i = hVar;
                }
            }
        }
        return hVar;
    }
}
