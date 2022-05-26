package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class qe0 implements re0 {

    /* renamed from: b */
    private static final Object f21909b = new Object();

    /* renamed from: c */
    static boolean f21910c = false;

    /* renamed from: d */
    static boolean f21911d = false;

    /* renamed from: a */
    pv2 f21912a;

    /* renamed from: P */
    public final void mo18275P(C4863a aVar) {
        synchronized (f21909b) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
                if (f21910c) {
                    try {
                        this.f21912a.mo19852u0(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        ul0.m31864i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public final String mo18276Q(Context context) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
            return null;
        }
        try {
            mo20434a(context);
            String valueOf = String.valueOf(this.f21912a.mo19850d());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: R */
    public final void mo18277R(C4863a aVar, View view) {
        synchronized (f21909b) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
                if (f21910c) {
                    try {
                        this.f21912a.mo19853x0(aVar, C4865b.m20503f2(view));
                    } catch (RemoteException | NullPointerException e) {
                        ul0.m31864i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        com.google.android.gms.internal.ads.ul0.m31864i("#007 Could not call remote method.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0023, B:15:0x0045] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p159f.p243f.p245b.p246a.p248b.C4863a mo18278S(java.lang.String r14, android.webkit.WebView r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.internal.ads.te0 r19, com.google.android.gms.internal.ads.se0 r20, java.lang.String r21) {
        /*
            r13 = this;
            java.lang.String r4 = ""
            java.lang.String r5 = "javascript"
            java.lang.String r7 = "Google"
            java.lang.Object r1 = f21909b
            monitor-enter(r1)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22524g3     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r2.mo20153b(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0047 }
            r11 = 0
            if (r0 == 0) goto L_0x0044
            boolean r0 = f21910c     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0021
            goto L_0x0044
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            r12 = r13
            com.google.android.gms.internal.ads.pv2 r1 = r12.f21912a     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            f.f.b.a.b.a r3 = p159f.p243f.p245b.p246a.p248b.C4865b.m20503f2(r15)     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            java.lang.String r8 = r19.toString()     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            java.lang.String r9 = r20.toString()     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            r2 = r14
            r6 = r18
            r10 = r21
            f.f.b.a.b.a r11 = r1.mo19846H5(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ RemoteException -> 0x003d, NullPointerException -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r0 = move-exception
            goto L_0x003e
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.ul0.m31864i(r1, r0)
            goto L_0x0046
        L_0x0044:
            r12 = r13
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
        L_0x0046:
            return r11
        L_0x0047:
            r0 = move-exception
            r12 = r13
        L_0x0049:
            monitor-exit(r1)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qe0.mo18278S(java.lang.String, android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.te0, com.google.android.gms.internal.ads.se0, java.lang.String):f.f.b.a.b.a");
    }

    /* renamed from: T */
    public final void mo18279T(C4863a aVar, View view) {
        synchronized (f21909b) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
                if (f21910c) {
                    try {
                        this.f21912a.mo19851k3(aVar, C4865b.m20503f2(view));
                    } catch (RemoteException | NullPointerException e) {
                        ul0.m31864i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: U */
    public final C4863a mo18280U(String str, WebView webView, String str2, String str3, String str4, String str5, te0 te0, se0 se0, String str6) {
        synchronized (f21909b) {
            try {
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
                    if (f21910c) {
                        try {
                            return this.f21912a.mo19847P4(str, C4865b.m20503f2(webView), BuildConfig.FLAVOR, "javascript", str4, str5, te0.toString(), se0.toString(), str6);
                        } catch (RemoteException | NullPointerException e) {
                            ul0.m31864i("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: V */
    public final boolean mo18281V(Context context) {
        synchronized (f21909b) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
                return false;
            }
            if (f21910c) {
                return true;
            }
            try {
                mo20434a(context);
                boolean a0 = this.f21912a.mo19849a0(C4865b.m20503f2(context));
                f21910c = a0;
                return a0;
            } catch (RemoteException e) {
                e = e;
                ul0.m31864i("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                ul0.m31864i("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20434a(Context context) {
        synchronized (f21909b) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue() && !f21911d) {
                try {
                    f21911d = true;
                    this.f21912a = (pv2) zl0.m34659b(context, "com.google.android.gms.ads.omid.DynamiteOmid", pe0.f21392a);
                } catch (yl0 e) {
                    ul0.m31864i("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zze(C4863a aVar) {
        synchronized (f21909b) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
                if (f21910c) {
                    try {
                        this.f21912a.mo19848X(aVar);
                    } catch (RemoteException | NullPointerException e) {
                        ul0.m31864i("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
