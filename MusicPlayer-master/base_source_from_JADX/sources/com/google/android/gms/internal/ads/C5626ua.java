package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.ua */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5626ua implements C5589ta {

    /* renamed from: z */
    protected static volatile C5701wb f24244z;

    /* renamed from: g */
    protected MotionEvent f24245g;

    /* renamed from: h */
    protected final LinkedList<MotionEvent> f24246h = new LinkedList<>();

    /* renamed from: i */
    protected long f24247i = 0;

    /* renamed from: j */
    protected long f24248j = 0;

    /* renamed from: k */
    protected long f24249k = 0;

    /* renamed from: l */
    protected long f24250l = 0;

    /* renamed from: m */
    protected long f24251m = 0;

    /* renamed from: n */
    protected long f24252n = 0;

    /* renamed from: o */
    protected long f24253o = 0;

    /* renamed from: p */
    protected double f24254p;

    /* renamed from: q */
    private double f24255q;

    /* renamed from: r */
    private double f24256r;

    /* renamed from: s */
    protected float f24257s;

    /* renamed from: t */
    protected float f24258t;

    /* renamed from: u */
    protected float f24259u;

    /* renamed from: v */
    protected float f24260v;

    /* renamed from: w */
    private boolean f24261w = false;

    /* renamed from: x */
    protected boolean f24262x = false;

    /* renamed from: y */
    protected DisplayMetrics f24263y;

    protected C5626ua(Context context) {
        try {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22376M1)).booleanValue()) {
                C5292l9.m26591d();
            } else {
                C5738xb.m33633a(f24244z);
            }
            this.f24263y = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    private final void m31723m() {
        this.f24251m = 0;
        this.f24247i = 0;
        this.f24248j = 0;
        this.f24249k = 0;
        this.f24250l = 0;
        this.f24252n = 0;
        this.f24253o = 0;
        if (this.f24246h.size() > 0) {
            Iterator it = this.f24246h.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f24246h.clear();
        } else {
            MotionEvent motionEvent = this.f24245g;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f24245g = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc A[SYNTHETIC, Splitter:B:47:0x00bc] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m31724n(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.C5503qz.f22300C1
            com.google.android.gms.internal.ads.oz r8 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r7 = r8.mo20153b(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.wb r10 = f24244z
            if (r10 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.wb r10 = f24244z
            com.google.android.gms.internal.ads.sa r10 = r10.mo21780d()
            goto L_0x002e
        L_0x002d:
            r10 = r9
        L_0x002e:
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.C5503qz.f22376M1
            com.google.android.gms.internal.ads.oz r12 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r11 = r12.mo20153b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r8 == r11) goto L_0x0043
            java.lang.String r11 = "te"
            goto L_0x0048
        L_0x0043:
            java.lang.String r11 = "be"
            goto L_0x0048
        L_0x0046:
            r10 = r9
            r11 = r10
        L_0x0048:
            r15 = 2
            r14 = 3
            if (r2 != r14) goto L_0x005f
            com.google.android.gms.internal.ads.b8 r9 = r1.mo21237i(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r1.f24261w = r8     // Catch:{ Exception -> 0x0057 }
            r0 = 1002(0x3ea, float:1.404E-42)
            r13 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            r18 = r0
            r8 = 3
            goto L_0x0091
        L_0x005c:
            r0 = move-exception
            r8 = 3
            goto L_0x008f
        L_0x005f:
            if (r2 != r15) goto L_0x006b
            com.google.android.gms.internal.ads.b8 r0 = r1.mo21239k(r0, r3, r4)     // Catch:{ Exception -> 0x005c }
            r3 = 1008(0x3f0, float:1.413E-42)
            r9 = r0
            r13 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0074
        L_0x006b:
            com.google.android.gms.internal.ads.b8 r0 = r1.mo21238j(r0, r9)     // Catch:{ Exception -> 0x005c }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9 = r0
            r13 = 1000(0x3e8, float:1.401E-42)
        L_0x0074:
            if (r7 == 0) goto L_0x008c
            if (r10 == 0) goto L_0x008c
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x005c }
            long r3 = r3 - r5
            r0 = -1
            r18 = 0
            r12 = r10
            r8 = 3
            r14 = r0
            r15 = r3
            r17 = r11
            r12.mo20812c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r0 = move-exception
            goto L_0x008f
        L_0x008c:
            r8 = 3
        L_0x008d:
            r3 = 2
            goto L_0x00b6
        L_0x008f:
            r18 = r0
        L_0x0091:
            if (r7 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            if (r2 != r8) goto L_0x009d
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r13 = 1003(0x3eb, float:1.406E-42)
            goto L_0x00aa
        L_0x009d:
            r3 = 2
            if (r2 != r3) goto L_0x00a5
            r0 = 1009(0x3f1, float:1.414E-42)
            r13 = 1009(0x3f1, float:1.414E-42)
            goto L_0x00aa
        L_0x00a5:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r13 = 1001(0x3e9, float:1.403E-42)
        L_0x00aa:
            r14 = -1
            long r15 = java.lang.System.currentTimeMillis()
            long r15 = r15 - r5
            r12 = r10
            r17 = r11
            r12.mo20812c(r13, r14, r15, r17, r18)
        L_0x00b6:
            long r4 = java.lang.System.currentTimeMillis()
            if (r9 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.qm3 r0 = r9.mo19761n()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.r8 r0 = (com.google.android.gms.internal.ads.C5513r8) r0     // Catch:{ Exception -> 0x0101 }
            int r0 = r0.mo20471g()     // Catch:{ Exception -> 0x0101 }
            if (r0 != 0) goto L_0x00c9
            goto L_0x00fb
        L_0x00c9:
            com.google.android.gms.internal.ads.qm3 r0 = r9.mo19761n()     // Catch:{ Exception -> 0x0101 }
            com.google.android.gms.internal.ads.r8 r0 = (com.google.android.gms.internal.ads.C5513r8) r0     // Catch:{ Exception -> 0x0101 }
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.C5292l9.m26588a(r0, r6)     // Catch:{ Exception -> 0x0101 }
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x00e0
            r6 = 1006(0x3ee, float:1.41E-42)
            r13 = 1006(0x3ee, float:1.41E-42)
            goto L_0x00eb
        L_0x00e0:
            if (r2 != r3) goto L_0x00e7
            r6 = 1010(0x3f2, float:1.415E-42)
            r13 = 1010(0x3f2, float:1.415E-42)
            goto L_0x00eb
        L_0x00e7:
            r6 = 1004(0x3ec, float:1.407E-42)
            r13 = 1004(0x3ec, float:1.407E-42)
        L_0x00eb:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0101 }
            long r15 = r14 - r4
            r14 = -1
            r18 = 0
            r12 = r10
            r17 = r11
            r12.mo20812c(r13, r14, r15, r17, r18)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x00fb:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x012c
        L_0x0101:
            r0 = move-exception
            r18 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x012c
            if (r2 != r8) goto L_0x0114
            r2 = 1007(0x3ef, float:1.411E-42)
            r13 = 1007(0x3ef, float:1.411E-42)
            goto L_0x011f
        L_0x0114:
            if (r2 != r3) goto L_0x011b
            r2 = 1011(0x3f3, float:1.417E-42)
            r13 = 1011(0x3f3, float:1.417E-42)
            goto L_0x011f
        L_0x011b:
            r2 = 1005(0x3ed, float:1.408E-42)
            r13 = 1005(0x3ed, float:1.408E-42)
        L_0x011f:
            r14 = -1
            long r2 = java.lang.System.currentTimeMillis()
            long r15 = r2 - r4
            r12 = r10
            r17 = r11
            r12.mo20812c(r13, r14, r15, r17, r18)
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5626ua.m31724n(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* renamed from: b */
    public final String mo10840b(Context context) {
        if (!C5813zb.m34503f()) {
            return m31724n(context, (String) null, 1, (View) null, (Activity) null, (byte[]) null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    /* renamed from: c */
    public final synchronized void mo10841c(int i, int i2, int i3) {
        synchronized (this) {
            if (this.f24245g != null) {
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22284A1)).booleanValue()) {
                    m31723m();
                } else {
                    this.f24245g.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f24263y;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f24245g = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f24245g = null;
            }
            this.f24262x = false;
        }
    }

    /* renamed from: d */
    public final String mo10842d(Context context, String str, View view, Activity activity) {
        return m31724n(context, str, 3, view, activity, (byte[]) null);
    }

    /* renamed from: e */
    public final synchronized void mo10843e(MotionEvent motionEvent) {
        Long l;
        if (this.f24261w) {
            m31723m();
            this.f24261w = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f24254p = 0.0d;
            this.f24255q = (double) motionEvent.getRawX();
            this.f24256r = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = rawX - this.f24255q;
            double d2 = rawY - this.f24256r;
            this.f24254p += Math.sqrt((d * d) + (d2 * d2));
            this.f24255q = rawX;
            this.f24256r = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f24257s = motionEvent.getX();
            this.f24258t = motionEvent.getY();
            this.f24259u = motionEvent.getRawX();
            this.f24260v = motionEvent.getRawY();
            this.f24247i++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f24245g = obtain;
            this.f24246h.add(obtain);
            if (this.f24246h.size() > 6) {
                this.f24246h.remove().recycle();
            }
            this.f24249k++;
            this.f24251m = mo21236h(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f24248j += (long) (motionEvent.getHistorySize() + 1);
            try {
                C5776yb l2 = mo21240l(motionEvent);
                Long l3 = l2.f26320e;
                if (!(l3 == null || l2.f26323h == null)) {
                    this.f24252n += l3.longValue() + l2.f26323h.longValue();
                }
                if (!(this.f24263y == null || (l = l2.f26321f) == null || l2.f26324i == null)) {
                    this.f24253o += l.longValue() + l2.f26324i.longValue();
                }
            } catch (C5405ob unused) {
            }
        } else if (action2 == 3) {
            this.f24250l++;
        }
        this.f24262x = true;
    }

    /* renamed from: f */
    public final String mo10844f(Context context, View view, Activity activity) {
        return m31724n(context, (String) null, 2, view, (Activity) null, (byte[]) null);
    }

    /* renamed from: g */
    public final String mo10845g(Context context, String str, View view) {
        return m31724n(context, str, 3, view, (Activity) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract long mo21236h(StackTraceElement[] stackTraceElementArr) throws C5405ob;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C4920b8 mo21237i(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C4920b8 mo21238j(Context context, C5623u7 u7Var);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C4920b8 mo21239k(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C5776yb mo21240l(MotionEvent motionEvent) throws C5405ob;
}
