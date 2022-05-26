package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vo0 extends kn0 implements TextureView.SurfaceTextureListener, tn0 {

    /* renamed from: A */
    private int f24862A;

    /* renamed from: B */
    private float f24863B;

    /* renamed from: i */
    private final eo0 f24864i;

    /* renamed from: j */
    private final fo0 f24865j;

    /* renamed from: k */
    private final boolean f24866k;

    /* renamed from: l */
    private final do0 f24867l;

    /* renamed from: m */
    private jn0 f24868m;

    /* renamed from: n */
    private Surface f24869n;

    /* renamed from: o */
    private un0 f24870o;

    /* renamed from: p */
    private String f24871p;

    /* renamed from: q */
    private String[] f24872q;

    /* renamed from: r */
    private boolean f24873r;

    /* renamed from: s */
    private int f24874s = 1;

    /* renamed from: t */
    private co0 f24875t;

    /* renamed from: u */
    private final boolean f24876u;

    /* renamed from: v */
    private boolean f24877v;

    /* renamed from: w */
    private boolean f24878w;

    /* renamed from: x */
    private int f24879x;

    /* renamed from: y */
    private int f24880y;

    /* renamed from: z */
    private int f24881z;

    public vo0(Context context, fo0 fo0, eo0 eo0, boolean z, boolean z2, do0 do0) {
        super(context);
        this.f24866k = z2;
        this.f24864i = eo0;
        this.f24865j = fo0;
        this.f24876u = z;
        this.f24867l = do0;
        setSurfaceTextureListener(this);
        fo0.mo17581a(this);
    }

    /* renamed from: R */
    private static String m32496R(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: S */
    private final void m32497S() {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17613K(true);
        }
    }

    /* renamed from: T */
    private final void m32498T() {
        if (!this.f24877v) {
            this.f24877v = true;
            C2979b2.f9980i.post(new mo0(this));
            mo18178k();
            this.f24865j.mo17582b();
            if (this.f24878w) {
                mo18439s();
            }
        }
    }

    /* renamed from: U */
    private final void m32499U(boolean z) {
        if ((this.f24870o == null || z) && this.f24871p != null && this.f24869n != null) {
            if (z) {
                if (m32507c0()) {
                    this.f24870o.mo17617O();
                    m32501W();
                } else {
                    ul0.m31862g("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.f24871p.startsWith("cache:")) {
                eq0 P0 = this.f24864i.mo17231P0(this.f24871p);
                if (P0 instanceof nq0) {
                    un0 x = ((nq0) P0).mo19810x();
                    this.f24870o = x;
                    if (!x.mo17618P()) {
                        ul0.m31862g("Precached video player has been released.");
                        return;
                    }
                } else if (P0 instanceof kq0) {
                    kq0 kq0 = (kq0) P0;
                    String E = mo21574E();
                    ByteBuffer y = kq0.mo18958y();
                    boolean z2 = kq0.mo18959z();
                    String x2 = kq0.mo18957x();
                    if (x2 == null) {
                        ul0.m31862g("Stream cache URL is null.");
                        return;
                    }
                    un0 D = mo21573D();
                    this.f24870o = D;
                    D.mo17604A(new Uri[]{Uri.parse(x2)}, E, y, z2);
                } else {
                    String valueOf = String.valueOf(this.f24871p);
                    ul0.m31862g(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.f24870o = mo21573D();
                String E2 = mo21574E();
                Uri[] uriArr = new Uri[this.f24872q.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.f24872q;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.f24870o.mo17648z(uriArr, E2);
            }
            this.f24870o.mo17609G(this);
            m32503Y(this.f24869n, false);
            if (this.f24870o.mo17618P()) {
                int T = this.f24870o.mo17621T();
                this.f24874s = T;
                if (T == 3) {
                    m32498T();
                }
            }
        }
    }

    /* renamed from: V */
    private final void m32500V() {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17613K(false);
        }
    }

    /* renamed from: W */
    private final void m32501W() {
        if (this.f24870o != null) {
            m32503Y((Surface) null, true);
            un0 un0 = this.f24870o;
            if (un0 != null) {
                un0.mo17609G((tn0) null);
                this.f24870o.mo17605C();
                this.f24870o = null;
            }
            this.f24874s = 1;
            this.f24873r = false;
            this.f24877v = false;
            this.f24878w = false;
        }
    }

    /* renamed from: X */
    private final void m32502X(float f, boolean z) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            try {
                un0.mo17616N(f, z);
            } catch (IOException e) {
                ul0.m31863h(BuildConfig.FLAVOR, e);
            }
        } else {
            ul0.m31862g("Trying to set volume before player is initialized.");
        }
    }

    /* renamed from: Y */
    private final void m32503Y(Surface surface, boolean z) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            try {
                un0.mo17615M(surface, z);
            } catch (IOException e) {
                ul0.m31863h(BuildConfig.FLAVOR, e);
            }
        } else {
            ul0.m31862g("Trying to set surface before player is initialized.");
        }
    }

    /* renamed from: Z */
    private final void m32504Z() {
        m32505a0(this.f24879x, this.f24880y);
    }

    /* renamed from: a0 */
    private final void m32505a0(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f24863B != f) {
            this.f24863B = f;
            requestLayout();
        }
    }

    /* renamed from: b0 */
    private final boolean m32506b0() {
        return m32507c0() && this.f24874s != 1;
    }

    /* renamed from: c0 */
    private final boolean m32507c0() {
        un0 un0 = this.f24870o;
        return un0 != null && un0.mo17618P() && !this.f24873r;
    }

    /* renamed from: A */
    public final void mo18929A(int i) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17608F(i);
        }
    }

    /* renamed from: B */
    public final void mo18930B(int i) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17610H(i);
        }
    }

    /* renamed from: C */
    public final void mo18931C(int i) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17611I(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final un0 mo21573D() {
        if (this.f24867l.f15695l) {
            return new fr0(this.f24864i.getContext(), this.f24867l, this.f24864i);
        }
        return new lp0(this.f24864i.getContext(), this.f24867l, this.f24864i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo21574E() {
        return C2971s.m13214q().mo10977L(this.f24864i.getContext(), this.f24864i.zzp().f27376g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void mo21575F(String str) {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18674a("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ void mo21576G() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.zza();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final /* synthetic */ void mo21577H() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18676c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final /* synthetic */ void mo21578I(boolean z, long j) {
        this.f24864i.mo17228I0(z, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final /* synthetic */ void mo21579J(String str) {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18673H0("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final /* synthetic */ void mo21580K() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18677d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo21581L() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18678e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo21582M() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18680g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo21583N(int i, int i2) {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18675b(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo21584O(int i) {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo21585P() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.mo18679f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo21586Q() {
        jn0 jn0 = this.f24868m;
        if (jn0 != null) {
            jn0.zze();
        }
    }

    /* renamed from: a */
    public final void mo18932a(int i) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17614L(i);
        }
    }

    /* renamed from: b */
    public final void mo19804b(String str, Exception exc) {
        String str2;
        String R = m32496R("onLoadException", exc);
        if (R.length() != 0) {
            str2 = "ExoPlayerAdapter exception: ".concat(R);
        } else {
            str2 = new String("ExoPlayerAdapter exception: ");
        }
        ul0.m31862g(str2);
        C2971s.m13213p().mo17570r(exc, "AdExoPlayerView.onException");
        C2979b2.f9980i.post(new ko0(this, R));
    }

    /* renamed from: c */
    public final void mo19805c(int i) {
        if (this.f24874s != i) {
            this.f24874s = i;
            if (i == 3) {
                m32498T();
            } else if (i == 4) {
                if (this.f24867l.f15684a) {
                    m32500V();
                }
                this.f24865j.mo17585e();
                this.f18929h.mo18451c();
                C2979b2.f9980i.post(new jo0(this));
            }
        }
    }

    /* renamed from: d */
    public final void mo19806d(boolean z, long j) {
        if (this.f24864i != null) {
            hm0.f17712e.execute(new lo0(this, z, j));
        }
    }

    /* renamed from: e */
    public final void mo19807e(String str, Exception exc) {
        String str2;
        String R = m32496R(str, exc);
        if (R.length() != 0) {
            str2 = "ExoPlayerAdapter error: ".concat(R);
        } else {
            str2 = new String("ExoPlayerAdapter error: ");
        }
        ul0.m31862g(str2);
        this.f24873r = true;
        if (this.f24867l.f15684a) {
            m32500V();
        }
        C2979b2.f9980i.post(new uo0(this, R));
        C2971s.m13213p().mo17570r(exc, "AdExoPlayerView.onError");
    }

    /* renamed from: f */
    public final void mo19808f(int i, int i2) {
        this.f24879x = i;
        this.f24880y = i2;
        m32504Z();
    }

    /* renamed from: g */
    public final void mo18933g(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.f24872q = new String[]{str};
            } else {
                this.f24872q = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.f24871p;
            if (!this.f24867l.f15696m || str2 == null || str.equals(str2) || this.f24874s != 4) {
                z = false;
            }
            this.f24871p = str;
            m32499U(z);
        }
    }

    /* renamed from: h */
    public final int mo18417h() {
        if (m32506b0()) {
            return (int) this.f24870o.mo17625Y();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo18418i() {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            return un0.mo17620R();
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo18419j() {
        if (m32506b0()) {
            return (int) this.f24870o.mo17626Z();
        }
        return 0;
    }

    /* renamed from: k */
    public final void mo18178k() {
        m32502X(this.f18929h.mo18449a(), false);
    }

    /* renamed from: l */
    public final int mo18420l() {
        return this.f24880y;
    }

    /* renamed from: m */
    public final int mo18421m() {
        return this.f24879x;
    }

    /* renamed from: n */
    public final long mo18422n() {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            return un0.mo17624X();
        }
        return -1;
    }

    /* renamed from: o */
    public final long mo18423o() {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            return un0.mo17628a0();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[LOOP:0: B:30:0x007a->B:35:0x0097, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r10 = r9.getMeasuredWidth()
            int r11 = r9.getMeasuredHeight()
            float r0 = r9.f24863B
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.co0 r2 = r9.f24875t
            if (r2 != 0) goto L_0x0028
            float r2 = (float) r10
            float r3 = (float) r11
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r11 = (int) r2
        L_0x0020:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0028
            float r10 = (float) r11
            float r10 = r10 * r0
            int r10 = (int) r10
        L_0x0028:
            r9.setMeasuredDimension(r10, r11)
            com.google.android.gms.internal.ads.co0 r0 = r9.f24875t
            if (r0 == 0) goto L_0x0032
            r0.mo16693b(r10, r11)
        L_0x0032:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a6
            int r0 = r9.f24881z
            if (r0 <= 0) goto L_0x003e
            if (r0 != r10) goto L_0x0044
        L_0x003e:
            int r0 = r9.f24862A
            if (r0 <= 0) goto L_0x00a2
            if (r0 == r11) goto L_0x00a2
        L_0x0044:
            boolean r0 = r9.f24866k
            if (r0 != 0) goto L_0x0049
            goto L_0x00a2
        L_0x0049:
            boolean r0 = r9.m32507c0()
            if (r0 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.un0 r0 = r9.f24870o
            long r2 = r0.mo17625Y()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a2
            com.google.android.gms.internal.ads.un0 r0 = r9.f24870o
            boolean r0 = r0.mo17619Q()
            if (r0 != 0) goto L_0x00a2
            r0 = 1
            r9.m32502X(r1, r0)
            com.google.android.gms.internal.ads.un0 r1 = r9.f24870o
            r1.mo17612J(r0)
            com.google.android.gms.internal.ads.un0 r0 = r9.f24870o
            long r0 = r0.mo17625Y()
            com.google.android.gms.common.util.d r2 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r2 = r2.mo11988a()
        L_0x007a:
            boolean r4 = r9.m32507c0()
            if (r4 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.un0 r4 = r9.f24870o
            long r4 = r4.mo17625Y()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0099
            com.google.android.gms.common.util.d r4 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r4 = r4.mo11988a()
            long r4 = r4 - r2
            r6 = 250(0xfa, double:1.235E-321)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007a
        L_0x0099:
            com.google.android.gms.internal.ads.un0 r0 = r9.f24870o
            r1 = 0
            r0.mo17612J(r1)
            r9.mo18178k()
        L_0x00a2:
            r9.f24881z = r10
            r9.f24862A = r11
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vo0.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f24876u) {
            co0 co0 = new co0(getContext());
            this.f24875t = co0;
            co0.mo16694c(surfaceTexture, i, i2);
            this.f24875t.start();
            SurfaceTexture a = this.f24875t.mo16692a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.f24875t.mo16695d();
                this.f24875t = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f24869n = surface;
        if (this.f24870o == null) {
            m32499U(false);
        } else {
            m32503Y(surface, true);
            if (!this.f24867l.f15684a) {
                m32497S();
            }
        }
        if (this.f24879x == 0 || this.f24880y == 0) {
            m32505a0(i, i2);
        } else {
            m32504Z();
        }
        C2979b2.f9980i.post(new oo0(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo18438r();
        co0 co0 = this.f24875t;
        if (co0 != null) {
            co0.mo16695d();
            this.f24875t = null;
        }
        if (this.f24870o != null) {
            m32500V();
            Surface surface = this.f24869n;
            if (surface != null) {
                surface.release();
            }
            this.f24869n = null;
            m32503Y((Surface) null, true);
        }
        C2979b2.f9980i.post(new po0(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        co0 co0 = this.f24875t;
        if (co0 != null) {
            co0.mo16693b(i, i2);
        }
        C2979b2.f9980i.post(new to0(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f24865j.mo17586f(this);
        this.f18928g.mo22266a(surfaceTexture, this.f24868m);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        C3018m1.m13388k(sb.toString());
        C2979b2.f9980i.post(new so0(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final long mo18436p() {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            return un0.mo17630b0();
        }
        return -1;
    }

    /* renamed from: q */
    public final String mo18437q() {
        String str = true != this.f24876u ? BuildConfig.FLAVOR : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    /* renamed from: r */
    public final void mo18438r() {
        if (m32506b0()) {
            if (this.f24867l.f15684a) {
                m32500V();
            }
            this.f24870o.mo17612J(false);
            this.f24865j.mo17585e();
            this.f18929h.mo18451c();
            C2979b2.f9980i.post(new qo0(this));
        }
    }

    /* renamed from: s */
    public final void mo18439s() {
        if (m32506b0()) {
            if (this.f24867l.f15684a) {
                m32497S();
            }
            this.f24870o.mo17612J(true);
            this.f24865j.mo17583c();
            this.f18929h.mo18450b();
            this.f18928g.mo22267b();
            C2979b2.f9980i.post(new ro0(this));
            return;
        }
        this.f24878w = true;
    }

    /* renamed from: t */
    public final void mo19809t() {
        C2979b2.f9980i.post(new no0(this));
    }

    /* renamed from: u */
    public final void mo18441u(int i) {
        if (m32506b0()) {
            this.f24870o.mo17606D((long) i);
        }
    }

    /* renamed from: v */
    public final void mo18442v(jn0 jn0) {
        this.f24868m = jn0;
    }

    /* renamed from: w */
    public final void mo18443w(String str) {
        if (str != null) {
            mo18933g(str, (String[]) null);
        }
    }

    /* renamed from: x */
    public final void mo18444x() {
        if (m32507c0()) {
            this.f24870o.mo17617O();
            m32501W();
        }
        this.f24865j.mo17585e();
        this.f18929h.mo18451c();
        this.f24865j.mo17584d();
    }

    /* renamed from: y */
    public final void mo18445y(float f, float f2) {
        co0 co0 = this.f24875t;
        if (co0 != null) {
            co0.mo16696e(f, f2);
        }
    }

    /* renamed from: z */
    public final void mo18934z(int i) {
        un0 un0 = this.f24870o;
        if (un0 != null) {
            un0.mo17607E(i);
        }
    }
}
