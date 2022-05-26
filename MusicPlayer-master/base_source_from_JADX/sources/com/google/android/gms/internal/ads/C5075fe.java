package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.fe */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5075fe implements C4963ce {

    /* renamed from: a */
    private final C5519re[] f16535a;

    /* renamed from: b */
    private final C5488qk f16536b;

    /* renamed from: c */
    private final C5414ok f16537c;

    /* renamed from: d */
    private final Handler f16538d;

    /* renamed from: e */
    private final C5297le f16539e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<C5815zd> f16540f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    private final C5704we f16541g;

    /* renamed from: h */
    private final C5667ve f16542h;

    /* renamed from: i */
    private boolean f16543i;

    /* renamed from: j */
    private boolean f16544j = false;

    /* renamed from: k */
    private int f16545k = 1;

    /* renamed from: l */
    private int f16546l;

    /* renamed from: m */
    private int f16547m;

    /* renamed from: n */
    private boolean f16548n;

    /* renamed from: o */
    private C5741xe f16549o;

    /* renamed from: p */
    private Object f16550p;

    /* renamed from: q */
    private C4969ck f16551q;

    /* renamed from: r */
    private C5414ok f16552r;

    /* renamed from: s */
    private C5482qe f16553s;

    /* renamed from: t */
    private C5186ie f16554t;

    /* renamed from: u */
    private long f16555u;

    @SuppressLint({"HandlerLeak"})
    public C5075fe(C5519re[] reVarArr, C5488qk qkVar, bp0 bp0, byte[] bArr) {
        String str = C4934bm.f14556e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.f16535a = reVarArr;
        Objects.requireNonNull(qkVar);
        this.f16536b = qkVar;
        C5414ok okVar = new C5414ok(new C5118gk[2], (byte[]) null);
        this.f16537c = okVar;
        this.f16549o = C5741xe.f25777a;
        this.f16541g = new C5704we();
        this.f16542h = new C5667ve();
        this.f16551q = C4969ck.f14994d;
        this.f16552r = okVar;
        this.f16553s = C5482qe.f21905d;
        C5037ee eeVar = new C5037ee(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f16538d = eeVar;
        C5186ie ieVar = new C5186ie(0, 0);
        this.f16554t = ieVar;
        this.f16539e = new C5297le(reVarArr, qkVar, bp0, this.f16544j, 0, eeVar, ieVar, this, (byte[]) null);
    }

    /* renamed from: I0 */
    public final void mo16592I0(boolean z) {
        if (this.f16544j != z) {
            this.f16544j = z;
            this.f16539e.mo19157z(z);
            Iterator<C5815zd> it = this.f16540f.iterator();
            while (it.hasNext()) {
                it.next().mo19248w(z, this.f16545k);
            }
        }
    }

    /* renamed from: J0 */
    public final void mo16593J0(int i) {
        this.f16539e.mo19156y(i);
    }

    /* renamed from: K0 */
    public final void mo16594K0(C4926be... beVarArr) {
        this.f16539e.mo19154w(beVarArr);
    }

    /* renamed from: L0 */
    public final void mo16595L0(C5815zd zdVar) {
        this.f16540f.remove(zdVar);
    }

    /* renamed from: M0 */
    public final void mo16596M0(long j) {
        mo17521e();
        if (this.f16549o.mo22027h() || this.f16549o.mo15824c() > 0) {
            this.f16546l++;
            if (!this.f16549o.mo22027h()) {
                this.f16549o.mo22026g(0, this.f16541g, false);
                long a = C5740xd.m33642a(j);
                long j2 = this.f16549o.mo15825d(0, this.f16542h, false).f24698c;
                if (j2 != -9223372036854775807L) {
                    int i = (a > j2 ? 1 : (a == j2 ? 0 : -1));
                }
            }
            this.f16555u = j;
            this.f16539e.mo19153v(this.f16549o, 0, C5740xd.m33642a(j));
            Iterator<C5815zd> it = this.f16540f.iterator();
            while (it.hasNext()) {
                it.next().zze();
            }
            return;
        }
        throw new C5408oe(this.f16549o, 0, j);
    }

    /* renamed from: N0 */
    public final void mo16597N0(C5339mj mjVar) {
        if (!this.f16549o.mo22027h() || this.f16550p != null) {
            this.f16549o = C5741xe.f25777a;
            this.f16550p = null;
            Iterator<C5815zd> it = this.f16540f.iterator();
            while (it.hasNext()) {
                it.next().mo19236e(this.f16549o, this.f16550p);
            }
        }
        if (this.f16543i) {
            this.f16543i = false;
            this.f16551q = C4969ck.f14994d;
            this.f16552r = this.f16537c;
            this.f16536b.mo19399b((Object) null);
            Iterator<C5815zd> it2 = this.f16540f.iterator();
            while (it2.hasNext()) {
                it2.next().mo19233c(this.f16551q, this.f16552r);
            }
        }
        this.f16547m++;
        this.f16539e.mo19151t(mjVar, true);
    }

    /* renamed from: O0 */
    public final void mo16598O0(C4926be... beVarArr) {
        this.f16539e.mo19149r(beVarArr);
    }

    /* renamed from: P0 */
    public final void mo16599P0(C5815zd zdVar) {
        this.f16540f.add(zdVar);
    }

    /* renamed from: a */
    public final long mo16600a() {
        if (this.f16549o.mo22027h() || this.f16546l > 0) {
            return this.f16555u;
        }
        this.f16549o.mo15825d(this.f16554t.f17961a, this.f16542h, false);
        return C5740xd.m33643b(0) + C5740xd.m33643b(this.f16554t.f17964d);
    }

    /* renamed from: b */
    public final long mo16601b() {
        if (this.f16549o.mo22027h() || this.f16546l > 0) {
            return this.f16555u;
        }
        this.f16549o.mo15825d(this.f16554t.f17961a, this.f16542h, false);
        return C5740xd.m33643b(0) + C5740xd.m33643b(this.f16554t.f17963c);
    }

    /* renamed from: c */
    public final void mo16602c(int i) {
        this.f16539e.mo19155x(i);
    }

    /* renamed from: d */
    public final void mo16603d() {
        this.f16539e.mo19150s();
    }

    /* renamed from: e */
    public final int mo17521e() {
        if (!this.f16549o.mo22027h() && this.f16546l <= 0) {
            this.f16549o.mo15825d(this.f16554t.f17961a, this.f16542h, false);
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo16604f() {
        if (this.f16549o.mo22027h()) {
            return -9223372036854775807L;
        }
        C5741xe xeVar = this.f16549o;
        mo17521e();
        return C5740xd.m33643b(xeVar.mo22026g(0, this.f16541g, false).f25370a);
    }

    /* renamed from: g */
    public final void mo16605g() {
        this.f16539e.mo19152u();
        this.f16538d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo17522h(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.f16547m--;
                return;
            case 1:
                this.f16545k = message.arg1;
                Iterator<C5815zd> it = this.f16540f.iterator();
                while (it.hasNext()) {
                    it.next().mo19248w(this.f16544j, this.f16545k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.f16548n = z;
                Iterator<C5815zd> it2 = this.f16540f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo19232B(this.f16548n);
                }
                return;
            case 3:
                if (this.f16547m == 0) {
                    C5525rk rkVar = (C5525rk) message.obj;
                    this.f16543i = true;
                    this.f16551q = rkVar.f22884a;
                    this.f16552r = rkVar.f22885b;
                    this.f16536b.mo19399b(rkVar.f22886c);
                    Iterator<C5815zd> it3 = this.f16540f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo19233c(this.f16551q, this.f16552r);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.f16546l - 1;
                this.f16546l = i;
                if (i == 0) {
                    this.f16554t = (C5186ie) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<C5815zd> it4 = this.f16540f.iterator();
                        while (it4.hasNext()) {
                            it4.next().zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f16546l == 0) {
                    this.f16554t = (C5186ie) message.obj;
                    Iterator<C5815zd> it5 = this.f16540f.iterator();
                    while (it5.hasNext()) {
                        it5.next().zze();
                    }
                    return;
                }
                return;
            case 6:
                C5260ke keVar = (C5260ke) message.obj;
                this.f16546l -= keVar.f18867d;
                if (this.f16547m == 0) {
                    this.f16549o = keVar.f18864a;
                    this.f16550p = keVar.f18865b;
                    this.f16554t = keVar.f18866c;
                    Iterator<C5815zd> it6 = this.f16540f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo19236e(this.f16549o, this.f16550p);
                    }
                    return;
                }
                return;
            case 7:
                C5482qe qeVar = (C5482qe) message.obj;
                if (!this.f16553s.equals(qeVar)) {
                    this.f16553s = qeVar;
                    Iterator<C5815zd> it7 = this.f16540f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo19246s(qeVar);
                    }
                    return;
                }
                return;
            case 8:
                C5778yd ydVar = (C5778yd) message.obj;
                Iterator<C5815zd> it8 = this.f16540f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo19238f(ydVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public final boolean mo16606o() {
        return this.f16544j;
    }

    public final int zza() {
        return this.f16545k;
    }

    public final void zzp() {
        this.f16539e.mo19145A();
    }
}
