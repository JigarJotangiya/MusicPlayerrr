package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.C3360e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ms0 extends C5390nx {

    /* renamed from: g */
    private final eo0 f20138g;

    /* renamed from: h */
    private final Object f20139h = new Object();

    /* renamed from: i */
    private final boolean f20140i;

    /* renamed from: j */
    private final boolean f20141j;

    /* renamed from: k */
    private int f20142k;

    /* renamed from: l */
    private C5575sx f20143l;

    /* renamed from: m */
    private boolean f20144m;

    /* renamed from: n */
    private boolean f20145n = true;

    /* renamed from: o */
    private float f20146o;

    /* renamed from: p */
    private float f20147p;

    /* renamed from: q */
    private float f20148q;

    /* renamed from: r */
    private boolean f20149r;

    /* renamed from: s */
    private boolean f20150s;

    /* renamed from: t */
    private x30 f20151t;

    public ms0(eo0 eo0, float f, boolean z, boolean z2) {
        this.f20138g = eo0;
        this.f20146o = f;
        this.f20140i = z;
        this.f20141j = z2;
    }

    /* renamed from: l7 */
    private final void m27400l7(int i, int i2, boolean z, boolean z2) {
        hm0.f17712e.execute(new ks0(this, i, i2, z, z2));
    }

    /* renamed from: m7 */
    private final void m27401m7(String str, Map<String, String> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        hm0.f17712e.execute(new ls0(this, hashMap));
    }

    /* renamed from: b2 */
    public final void mo15828b2(boolean z) {
        m27401m7(true != z ? "unmute" : "mute", (Map<String, String>) null);
    }

    /* renamed from: c */
    public final float mo15829c() {
        float f;
        synchronized (this.f20139h) {
            f = this.f20147p;
        }
        return f;
    }

    /* renamed from: d */
    public final float mo15830d() {
        float f;
        synchronized (this.f20139h) {
            f = this.f20146o;
        }
        return f;
    }

    /* renamed from: e */
    public final int mo15831e() {
        int i;
        synchronized (this.f20139h) {
            i = this.f20142k;
        }
        return i;
    }

    /* renamed from: f7 */
    public final void mo19499f7(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.f20139h) {
            z2 = true;
            if (f2 == this.f20146o) {
                if (f3 == this.f20148q) {
                    z2 = false;
                }
            }
            this.f20146o = f2;
            this.f20147p = f;
            z3 = this.f20145n;
            this.f20145n = z;
            i2 = this.f20142k;
            this.f20142k = i;
            float f4 = this.f20148q;
            this.f20148q = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.f20138g.mo15939Z().invalidate();
            }
        }
        if (z2) {
            try {
                x30 x30 = this.f20151t;
                if (x30 != null) {
                    x30.zze();
                }
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
        m27400l7(i2, i, z3, z);
    }

    /* renamed from: g */
    public final C5575sx mo15832g() throws RemoteException {
        C5575sx sxVar;
        synchronized (this.f20139h) {
            sxVar = this.f20143l;
        }
        return sxVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g7 */
    public final /* synthetic */ void mo19500g7(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        C5575sx sxVar;
        C5575sx sxVar2;
        C5575sx sxVar3;
        synchronized (this.f20139h) {
            boolean z5 = this.f20144m;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i3 = 1;
                z3 = true;
            }
            if (i == i2 || i3 != 1) {
                z4 = false;
            } else {
                i3 = 1;
                z4 = true;
            }
            boolean z7 = i != i2 && i3 == 2;
            boolean z8 = i != i2 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            this.f20144m = z6;
            if (z3) {
                try {
                    C5575sx sxVar4 = this.f20143l;
                    if (sxVar4 != null) {
                        sxVar4.mo20523g();
                    }
                } catch (RemoteException e) {
                    ul0.m31864i("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (sxVar3 = this.f20143l) != null) {
                sxVar3.mo20522e();
            }
            if (z7 && (sxVar2 = this.f20143l) != null) {
                sxVar2.mo20521d();
            }
            if (z8) {
                C5575sx sxVar5 = this.f20143l;
                if (sxVar5 != null) {
                    sxVar5.zze();
                }
                this.f20138g.mo17251x();
            }
            if (!(z == z2 || (sxVar = this.f20143l) == null)) {
                sxVar.mo20524w5(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h7 */
    public final /* synthetic */ void mo19501h7(Map map) {
        this.f20138g.mo16880n0("pubVideoCmd", map);
    }

    /* renamed from: i */
    public final void mo15833i() {
        m27401m7("pause", (Map<String, String>) null);
    }

    /* renamed from: i7 */
    public final void mo19502i7(zzbkq zzbkq) {
        boolean z = zzbkq.f27245g;
        boolean z2 = zzbkq.f27246h;
        boolean z3 = zzbkq.f27247i;
        synchronized (this.f20139h) {
            this.f20149r = z2;
            this.f20150s = z3;
        }
        m27401m7("initialState", C3360e.m14440a("muteStart", true != z ? "0" : "1", "customControlsRequested", true != z2 ? "0" : "1", "clickToExpandRequested", true != z3 ? "0" : "1"));
    }

    /* renamed from: j */
    public final void mo15834j() {
        m27401m7("play", (Map<String, String>) null);
    }

    /* renamed from: j7 */
    public final void mo19503j7(float f) {
        synchronized (this.f20139h) {
            this.f20147p = f;
        }
    }

    /* renamed from: k */
    public final void mo15835k() {
        m27401m7("stop", (Map<String, String>) null);
    }

    /* renamed from: k7 */
    public final void mo19504k7(x30 x30) {
        synchronized (this.f20139h) {
            this.f20151t = x30;
        }
    }

    /* renamed from: l */
    public final boolean mo15836l() {
        boolean z;
        boolean zzp = zzp();
        synchronized (this.f20139h) {
            z = false;
            if (!zzp) {
                try {
                    if (this.f20150s && this.f20141j) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    /* renamed from: o */
    public final boolean mo15837o() {
        boolean z;
        synchronized (this.f20139h) {
            z = this.f20145n;
        }
        return z;
    }

    /* renamed from: o3 */
    public final void mo15838o3(C5575sx sxVar) {
        synchronized (this.f20139h) {
            this.f20143l = sxVar;
        }
    }

    /* renamed from: u */
    public final void mo19505u() {
        boolean z;
        int i;
        synchronized (this.f20139h) {
            z = this.f20145n;
            i = this.f20142k;
            this.f20142k = 3;
        }
        m27400l7(i, 3, z, z);
    }

    public final float zze() {
        float f;
        synchronized (this.f20139h) {
            f = this.f20148q;
        }
        return f;
    }

    public final boolean zzp() {
        boolean z;
        synchronized (this.f20139h) {
            z = false;
            if (this.f20140i && this.f20149r) {
                z = true;
            }
        }
        return z;
    }
}
