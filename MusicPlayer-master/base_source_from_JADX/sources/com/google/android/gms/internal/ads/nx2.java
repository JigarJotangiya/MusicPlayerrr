package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nx2 implements rw2 {

    /* renamed from: g */
    private static final nx2 f20754g = new nx2();

    /* renamed from: h */
    private static final Handler f20755h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Handler f20756i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f20757j = new jx2();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f20758k = new kx2();

    /* renamed from: a */
    private final List<mx2> f20759a = new ArrayList();

    /* renamed from: b */
    private int f20760b;

    /* renamed from: c */
    private final tw2 f20761c = new tw2();

    /* renamed from: d */
    private final gx2 f20762d = new gx2();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final hx2 f20763e = new hx2(new qx2());

    /* renamed from: f */
    private long f20764f;

    nx2() {
    }

    /* renamed from: d */
    public static nx2 m28132d() {
        return f20754g;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m28135g(nx2 nx2) {
        nx2.f20760b = 0;
        nx2.f20764f = System.nanoTime();
        nx2.f20762d.mo18043i();
        long nanoTime = System.nanoTime();
        sw2 a = nx2.f20761c.mo21181a();
        if (nx2.f20762d.mo18039e().size() > 0) {
            Iterator<String> it = nx2.f20762d.mo18039e().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = bx2.m21580a(0, 0, 0, 0);
                View a3 = nx2.f20762d.mo18035a(next);
                sw2 b = nx2.f20761c.mo21182b();
                String c = nx2.f20762d.mo18037c(next);
                if (c != null) {
                    JSONObject c2 = b.mo20976c(a3);
                    bx2.m21581b(c2, next);
                    bx2.m21584e(c2, c);
                    bx2.m21582c(a2, c2);
                }
                bx2.m21587h(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                nx2.f20763e.mo18225c(a2, hashSet, nanoTime);
            }
        }
        if (nx2.f20762d.mo18040f().size() > 0) {
            JSONObject a4 = bx2.m21580a(0, 0, 0, 0);
            nx2.m28136k((View) null, a, a4, 1);
            bx2.m21587h(a4);
            nx2.f20763e.mo18226d(a4, nx2.f20762d.mo18040f(), nanoTime);
        } else {
            nx2.f20763e.mo18224b();
        }
        nx2.f20762d.mo18041g();
        long nanoTime2 = System.nanoTime() - nx2.f20764f;
        if (nx2.f20759a.size() > 0) {
            for (mx2 next2 : nx2.f20759a) {
                int i = nx2.f20760b;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                next2.mo19570a();
                if (next2 instanceof lx2) {
                    int i2 = nx2.f20760b;
                    ((lx2) next2).zza();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m28136k(View view, sw2 sw2, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        sw2.mo20975a(view, jSONObject, this, z);
    }

    /* renamed from: l */
    private static final void m28137l() {
        Handler handler = f20756i;
        if (handler != null) {
            handler.removeCallbacks(f20758k);
            f20756i = null;
        }
    }

    /* renamed from: a */
    public final void mo19860a(View view, sw2 sw2, JSONObject jSONObject) {
        int j;
        if (ex2.m23309b(view) == null && (j = this.f20762d.mo18044j(view)) != 3) {
            JSONObject c = sw2.mo20976c(view);
            bx2.m21582c(jSONObject, c);
            String d = this.f20762d.mo18038d(view);
            if (d != null) {
                bx2.m21581b(c, d);
                this.f20762d.mo18042h();
            } else {
                fx2 b = this.f20762d.mo18036b(view);
                if (b != null) {
                    bx2.m21583d(c, b);
                }
                m28136k(view, sw2, c, j);
            }
            this.f20760b++;
        }
    }

    /* renamed from: h */
    public final void mo19861h() {
        m28137l();
    }

    /* renamed from: i */
    public final void mo19862i() {
        if (f20756i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f20756i = handler;
            handler.post(f20757j);
            f20756i.postDelayed(f20758k, 200);
        }
    }

    /* renamed from: j */
    public final void mo19863j() {
        m28137l();
        this.f20759a.clear();
        f20755h.post(new ix2(this));
    }
}
