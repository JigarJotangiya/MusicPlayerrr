package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uu3 extends zt3 implements t90 {

    /* renamed from: A */
    private boolean f24444A;

    /* renamed from: B */
    private boolean f24445B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public e04 f24446C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public cw0 f24447D;

    /* renamed from: b */
    protected final lu3[] f24448b;

    /* renamed from: c */
    private final kv1 f24449c;

    /* renamed from: d */
    private final Context f24450d;

    /* renamed from: e */
    private final et3 f24451e;

    /* renamed from: f */
    private final ru3 f24452f;

    /* renamed from: g */
    private final tu3 f24453g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet<w60> f24454h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ex3 f24455i;

    /* renamed from: j */
    private final b83 f24456j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final bv3 f24457k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5689w f24458l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C5689w f24459m;

    /* renamed from: n */
    private AudioTrack f24460n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Object f24461o;

    /* renamed from: p */
    private Surface f24462p;

    /* renamed from: q */
    private int f24463q;

    /* renamed from: r */
    private int f24464r;

    /* renamed from: s */
    private int f24465s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public da3 f24466t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public da3 f24467u;

    /* renamed from: v */
    private int f24468v;

    /* renamed from: w */
    private fc3 f24469w;

    /* renamed from: x */
    private float f24470x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f24471y;

    /* renamed from: z */
    private List f24472z;

    protected uu3(pu3 pu3) {
        uu3 uu3;
        Handler handler;
        tu3 tu3;
        ru3 ru3;
        et3 et3;
        kv1 kv1 = new kv1(ht1.f17758a);
        this.f24449c = kv1;
        try {
            Context applicationContext = pu3.f21527a.getApplicationContext();
            this.f24450d = applicationContext;
            ex3 j = pu3.f21533g;
            this.f24455i = j;
            this.f24469w = pu3.f21535i;
            this.f24463q = 1;
            this.f24471y = false;
            ru3 ru32 = new ru3(this, (qu3) null);
            this.f24452f = ru32;
            tu3 tu32 = new tu3((su3) null);
            this.f24453g = tu32;
            this.f24454h = new CopyOnWriteArraySet<>();
            Handler handler2 = new Handler(pu3.f21534h);
            lu3[] a = pu3.f21538l.mo15932a(handler2, ru32, ru32, ru32, ru32);
            this.f24448b = a;
            this.f24470x = 1.0f;
            if (wy2.f25579a < 21) {
                AudioTrack audioTrack = this.f24460n;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.f24460n.release();
                    this.f24460n = null;
                }
                if (this.f24460n == null) {
                    this.f24460n = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f24468v = this.f24460n.getAudioSessionId();
            } else {
                this.f24468v = bw3.m21567a(applicationContext);
            }
            this.f24472z = Collections.emptyList();
            this.f24444A = true;
            g30 g30 = new g30();
            int[] iArr = new int[8];
            iArr[0] = 20;
            iArr[1] = 21;
            iArr[2] = 22;
            iArr[3] = 23;
            try {
                iArr[4] = 24;
                iArr[5] = 25;
                iArr[6] = 26;
                iArr[7] = 27;
                g30.mo17823c(iArr);
                e50 e = g30.mo17825e();
                et3 et32 = r1;
                handler = handler2;
                tu3 = tu32;
                ru3 = ru32;
                et3 et33 = new et3(a, pu3.f21529c, pu3.f21530d, pu3.f21531e, pu3.f21532f, j, true, pu3.f21536j, 5000, 15000, pu3.f21539m, 500, false, pu3.f21528b, pu3.f21534h, this, e, (byte[]) null);
                uu3 = this;
                et3 = et32;
            } catch (Throwable th) {
                th = th;
                uu3 = this;
                uu3.f24449c.mo19017e();
                throw th;
            }
            try {
                uu3.f24451e = et3;
                ru3 ru33 = ru3;
                et3.mo17316M(ru33);
                et3.mo17315L(ru33);
                Handler handler3 = handler;
                new n33(pu3.f21527a, handler3, ru33);
                uu3.f24456j = new b83(pu3.f21527a, handler3, ru33);
                wy2.m33453p((Object) null, (Object) null);
                bv3 bv3 = new bv3(pu3.f21527a, handler3, ru33);
                uu3.f24457k = bv3;
                int i = uu3.f24469w.f16530a;
                bv3.mo16414f(3);
                new cv3(pu3.f21527a);
                new dv3(pu3.f21527a);
                uu3.f24446C = m32017Q(bv3);
                cw0 cw0 = cw0.f15354e;
                uu3.m32019S(1, 10, Integer.valueOf(uu3.f24468v));
                uu3.m32019S(2, 10, Integer.valueOf(uu3.f24468v));
                uu3.m32019S(1, 3, uu3.f24469w);
                uu3.m32019S(2, 4, Integer.valueOf(uu3.f24463q));
                uu3.m32019S(2, 5, 0);
                uu3.m32019S(1, 9, Boolean.valueOf(uu3.f24471y));
                tu3 tu33 = tu3;
                uu3.m32019S(2, 7, tu33);
                uu3.m32019S(6, 8, tu33);
                kv1.mo19017e();
            } catch (Throwable th2) {
                th = th2;
                uu3.f24449c.mo19017e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            uu3 = this;
            uu3.f24449c.mo19017e();
            throw th;
        }
    }

    /* renamed from: C */
    static /* synthetic */ void m32014C(uu3 uu3) {
        int Y = uu3.mo21376Y();
        if (Y == 2 || Y == 3) {
            uu3.m32023W();
            uu3.f24451e.mo17335v();
            uu3.mo21375O();
            uu3.mo21375O();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static int m32016P(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static e04 m32017Q(bv3 bv3) {
        return new e04(0, bv3.mo16412b(), bv3.mo16411a());
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m32018R(int i, int i2) {
        if (i != this.f24464r || i2 != this.f24465s) {
            this.f24464r = i;
            this.f24465s = i2;
            this.f24455i.mo17418l(i, i2);
            Iterator<w60> it = this.f24454h.iterator();
            while (it.hasNext()) {
                it.next().mo17418l(i, i2);
            }
        }
    }

    /* renamed from: S */
    private final void m32019S(int i, int i2, Object obj) {
        lu3[] lu3Arr = this.f24448b;
        int length = lu3Arr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            lu3 lu3 = lu3Arr[i3];
            if (lu3.mo16557a() == i) {
                iu3 K = this.f24451e.mo17314K(lu3);
                K.mo18504f(i2);
                K.mo18503e(obj);
                K.mo18502d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public final void m32020T() {
        m32019S(1, 2, Float.valueOf(this.f24470x * this.f24456j.mo16148a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final void m32021U(Object obj) {
        boolean z;
        ArrayList<iu3> arrayList = new ArrayList<>();
        lu3[] lu3Arr = this.f24448b;
        int length = lu3Arr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            lu3 lu3 = lu3Arr[i];
            if (lu3.mo16557a() == 2) {
                iu3 K = this.f24451e.mo17314K(lu3);
                K.mo18504f(1);
                K.mo18503e(obj);
                K.mo18502d();
                arrayList.add(K);
            }
            i++;
        }
        Object obj2 = this.f24461o;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (iu3 i2 : arrayList) {
                    i2.mo18507i(2000);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f24461o;
            Surface surface = this.f24462p;
            if (obj3 == surface) {
                surface.release();
                this.f24462p = null;
            }
        }
        this.f24461o = obj;
        if (z) {
            this.f24451e.mo17334u(false, ji3.zzd(new pt3(3), 1003));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public final void m32022V(boolean z, int i, int i2) {
        int i3 = 1;
        boolean z2 = z && i != -1;
        if (!z2 || i == 1) {
            i3 = 0;
        }
        this.f24451e.mo17333t(z2, i3, i2);
    }

    /* renamed from: W */
    private final void m32023W() {
        IllegalStateException illegalStateException;
        this.f24449c.mo19014b();
        if (Thread.currentThread() != this.f24451e.mo17313J().getThread()) {
            String d = wy2.m33438d("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f24451e.mo17313J().getThread().getName());
            if (!this.f24444A) {
                if (this.f24445B) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                y92.m34068b("SimpleExoPlayer", d, illegalStateException);
                this.f24445B = true;
                return;
            }
            throw new IllegalStateException(d);
        }
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m32039x(uu3 uu3) {
        uu3.f24455i.mo17400a(uu3.f24471y);
        Iterator<w60> it = uu3.f24454h.iterator();
        while (it.hasNext()) {
            it.next().mo17400a(uu3.f24471y);
        }
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m32041z(uu3 uu3, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        uu3.m32021U(surface);
        uu3.f24462p = surface;
    }

    /* renamed from: D */
    public final void mo21365D(gx3 gx3) {
        this.f24455i.mo17384J(gx3);
    }

    /* renamed from: E */
    public final void mo21366E() {
        m32023W();
        boolean O = mo21375O();
        int b = this.f24456j.mo16149b(O, 2);
        m32022V(O, b, m32016P(O, b));
        this.f24451e.mo17330q();
    }

    /* renamed from: F */
    public final void mo21367F() {
        AudioTrack audioTrack;
        m32023W();
        if (wy2.f25579a < 21 && (audioTrack = this.f24460n) != null) {
            audioTrack.release();
            this.f24460n = null;
        }
        this.f24457k.mo16413e();
        this.f24456j.mo16150d();
        this.f24451e.mo17331r();
        this.f24455i.mo17389O();
        Surface surface = this.f24462p;
        if (surface != null) {
            surface.release();
            this.f24462p = null;
        }
        this.f24472z = Collections.emptyList();
    }

    /* renamed from: G */
    public final void mo21368G(gx3 gx3) {
        this.f24455i.mo17390P(gx3);
    }

    /* renamed from: H */
    public final void mo21369H(i24 i24) {
        m32023W();
        this.f24451e.mo17332s(Collections.singletonList(i24), true);
    }

    /* renamed from: I */
    public final void mo21370I(boolean z) {
        m32023W();
        int b = this.f24456j.mo16149b(z, mo21376Y());
        m32022V(z, b, m32016P(z, b));
    }

    @Deprecated
    /* renamed from: J */
    public final void mo21371J(boolean z) {
        this.f24444A = false;
    }

    /* renamed from: K */
    public final void mo21372K(Surface surface) {
        m32023W();
        m32021U(surface);
        int i = surface == null ? 0 : -1;
        m32018R(i, i);
    }

    /* renamed from: L */
    public final void mo21373L(float f) {
        m32023W();
        float A = wy2.m33406A(f, 0.0f, 1.0f);
        if (this.f24470x != A) {
            this.f24470x = A;
            m32020T();
            this.f24455i.mo17378B(A);
            Iterator<w60> it = this.f24454h.iterator();
            while (it.hasNext()) {
                it.next().mo17378B(A);
            }
        }
    }

    @Deprecated
    /* renamed from: M */
    public final void mo21374M(boolean z) {
        m32023W();
        this.f24456j.mo16149b(mo21375O(), 1);
        this.f24451e.mo17334u(false, (ji3) null);
        this.f24472z = Collections.emptyList();
    }

    /* renamed from: O */
    public final boolean mo21375O() {
        m32023W();
        return this.f24451e.mo17336w();
    }

    /* renamed from: Y */
    public final int mo21376Y() {
        m32023W();
        return this.f24451e.mo17309F();
    }

    /* renamed from: Z */
    public final int mo21377Z() {
        m32023W();
        this.f24451e.mo17310G();
        return 2;
    }

    /* renamed from: a */
    public final void mo17319a(int i, long j) {
        m32023W();
        this.f24455i.mo17388N();
        this.f24451e.mo17319a(i, j);
    }

    /* renamed from: a0 */
    public final long mo21378a0() {
        m32023W();
        return this.f24451e.mo17311H();
    }

    /* renamed from: b0 */
    public final long mo21379b0() {
        m32023W();
        return this.f24451e.mo17312I();
    }

    /* renamed from: c */
    public final int mo17320c() {
        m32023W();
        return this.f24451e.mo17320c();
    }

    /* renamed from: d */
    public final int mo17321d() {
        m32023W();
        return this.f24451e.mo17321d();
    }

    /* renamed from: e */
    public final int mo17322e() {
        m32023W();
        return this.f24451e.mo17322e();
    }

    /* renamed from: g */
    public final int mo17323g() {
        m32023W();
        return 0;
    }

    /* renamed from: h */
    public final long mo17324h() {
        m32023W();
        return this.f24451e.mo17324h();
    }

    /* renamed from: i */
    public final long mo17325i() {
        m32023W();
        return this.f24451e.mo17325i();
    }

    /* renamed from: j */
    public final long mo17326j() {
        m32023W();
        return this.f24451e.mo17326j();
    }

    /* renamed from: l */
    public final boolean mo17327l() {
        m32023W();
        return false;
    }

    /* renamed from: m */
    public final bg0 mo17328m() {
        m32023W();
        return this.f24451e.mo17328m();
    }

    public final int zze() {
        m32023W();
        return this.f24451e.zze();
    }

    public final boolean zzp() {
        m32023W();
        return this.f24451e.zzp();
    }
}
