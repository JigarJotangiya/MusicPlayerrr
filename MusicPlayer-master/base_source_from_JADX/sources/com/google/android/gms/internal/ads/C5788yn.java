package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3369n;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.yn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5788yn extends Thread {

    /* renamed from: g */
    private boolean f26408g = false;

    /* renamed from: h */
    private boolean f26409h = false;

    /* renamed from: i */
    private final Object f26410i;

    /* renamed from: j */
    private final C5454pn f26411j;

    /* renamed from: k */
    private final int f26412k;

    /* renamed from: l */
    private final int f26413l;

    /* renamed from: m */
    private final int f26414m;

    /* renamed from: n */
    private final int f26415n;

    /* renamed from: o */
    private final int f26416o;

    /* renamed from: p */
    private final int f26417p;

    /* renamed from: q */
    private final int f26418q;

    /* renamed from: r */
    private final int f26419r;

    /* renamed from: s */
    private final String f26420s;

    /* renamed from: t */
    private final boolean f26421t;

    /* renamed from: u */
    private final boolean f26422u;

    /* renamed from: v */
    private final boolean f26423v;

    public C5788yn() {
        C5454pn pnVar = new C5454pn();
        this.f26411j = pnVar;
        this.f26410i = new Object();
        this.f26413l = y00.f26181d.mo20989e().intValue();
        this.f26414m = y00.f26178a.mo20989e().intValue();
        this.f26415n = y00.f26182e.mo20989e().intValue();
        this.f26416o = y00.f26180c.mo20989e().intValue();
        this.f26417p = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22360K)).intValue();
        this.f26418q = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22367L)).intValue();
        this.f26419r = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22374M)).intValue();
        this.f26412k = y00.f26183f.mo20989e().intValue();
        this.f26420s = (String) C5054ev.m23225c().mo20153b(C5503qz.f22388O);
        this.f26421t = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22395P)).booleanValue();
        this.f26422u = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22402Q)).booleanValue();
        this.f26423v = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22409R)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    public final C5417on mo22257a() {
        return this.f26411j.mo20284a(this.f26423v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5750xn mo22258b(View view, C5417on onVar) {
        if (view == null) {
            return new C5750xn(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C5750xn(this, 0, 0);
            }
            onVar.mo20044k(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new C5750xn(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof pr0)) {
            WebView webView = (WebView) view;
            if (!C3369n.m14473e()) {
                return new C5750xn(this, 0, 0);
            }
            onVar.mo20040h();
            webView.post(new C5713wn(this, onVar, webView, globalVisibleRect));
            return new C5750xn(this, 0, 1);
        } else if (!(view instanceof ViewGroup)) {
            return new C5750xn(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C5750xn b = mo22258b(viewGroup.getChildAt(i3), onVar);
                i += b.f25894a;
                i2 += b.f25895b;
            }
            return new C5750xn(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22259c(View view) {
        try {
            C5417on onVar = new C5417on(this.f26413l, this.f26414m, this.f26415n, this.f26416o, this.f26417p, this.f26418q, this.f26419r, this.f26422u);
            Context b = C2971s.m13200c().mo21122b();
            if (b != null && !TextUtils.isEmpty(this.f26420s)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) C5054ev.m23225c().mo20153b(C5503qz.f22381N), "id", b.getPackageName()));
                if (str != null) {
                    if (str.equals(this.f26420s)) {
                        return;
                    }
                }
            }
            C5750xn b2 = mo22258b(view, onVar);
            onVar.mo20046m();
            if (b2.f25894a == 0) {
                if (b2.f25895b == 0) {
                    return;
                }
            }
            if (b2.f25895b == 0) {
                if (onVar.mo20034c() == 0) {
                    return;
                }
            }
            if (b2.f25895b == 0) {
                if (this.f26411j.mo20287d(onVar)) {
                    return;
                }
            }
            this.f26411j.mo20285b(onVar);
        } catch (Exception e) {
            ul0.m31860e("Exception in fetchContentOnUIThread", e);
            C2971s.m13213p().mo17571s(e, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo22260d(C5417on onVar, WebView webView, String str, boolean z) {
        onVar.mo20039g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f26421t || TextUtils.isEmpty(webView.getTitle())) {
                    onVar.mo20045l(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    onVar.mo20045l(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (onVar.mo20048o()) {
                this.f26411j.mo20286c(onVar);
            }
        } catch (JSONException unused) {
            ul0.m31857b("Json string may be malformed.");
        } catch (Throwable th) {
            ul0.m31858c("Failed to get webview content.", th);
            C2971s.m13213p().mo17571s(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: e */
    public final void mo22261e() {
        synchronized (this.f26410i) {
            if (this.f26408g) {
                ul0.m31857b("Content hash thread already started, quiting...");
                return;
            }
            this.f26408g = true;
            start();
        }
    }

    /* renamed from: f */
    public final void mo22262f() {
        synchronized (this.f26410i) {
            this.f26409h = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            ul0.m31857b(sb.toString());
        }
    }

    /* renamed from: g */
    public final void mo22263g() {
        synchronized (this.f26410i) {
            this.f26409h = false;
            this.f26410i.notifyAll();
            ul0.m31857b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: h */
    public final boolean mo22264h() {
        return this.f26409h;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00dc */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc A[LOOP:2: B:48:0x00dc->B:62:0x00dc, LOOP_START, SYNTHETIC] */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            com.google.android.gms.internal.ads.tn r0 = com.google.android.gms.ads.internal.C2971s.m13200c()     // Catch:{ all -> 0x00a8 }
            android.content.Context r0 = r0.mo21122b()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x000c
            goto L_0x00b2
        L_0x000c:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch:{ all -> 0x00a8 }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            if (r2 == 0) goto L_0x00b2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x00b2
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00a8 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x00a8 }
            int r4 = android.os.Process.myPid()     // Catch:{ all -> 0x00a8 }
            int r5 = r3.pid     // Catch:{ all -> 0x00a8 }
            if (r4 != r5) goto L_0x002a
            int r1 = r3.importance     // Catch:{ all -> 0x00a8 }
            r3 = 100
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00a8 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.tn r0 = com.google.android.gms.ads.internal.C2971s.m13200c()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            android.app.Activity r0 = r0.mo21121a()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.ul0.m31857b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo22262f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x006d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x008e }
            if (r2 == 0) goto L_0x009d
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x008e }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x008e }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch:{ Exception -> 0x008e }
            goto L_0x009d
        L_0x008e:
            r0 = move-exception
            com.google.android.gms.internal.ads.fl0 r2 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo17571s(r0, r3)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.ul0.m31857b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x009d:
            if (r1 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.un r0 = new com.google.android.gms.internal.ads.un     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00ba
        L_0x00a8:
            r0 = move-exception
            com.google.android.gms.internal.ads.fl0 r1 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.mo17571s(r0, r2)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00b2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.ul0.m31857b(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            r6.mo22262f()     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
        L_0x00ba:
            int r0 = r6.f26412k     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00d3, Exception -> 0x00c3 }
            goto L_0x00d9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.ul0.m31860e(r1, r0)
            com.google.android.gms.internal.ads.fl0 r1 = com.google.android.gms.ads.internal.C2971s.m13213p()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo17571s(r0, r2)
            goto L_0x00d9
        L_0x00d3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.ul0.m31860e(r1, r0)
        L_0x00d9:
            java.lang.Object r0 = r6.f26410i
            monitor-enter(r0)
        L_0x00dc:
            boolean r1 = r6.f26409h     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.ul0.m31857b(r1)     // Catch:{ InterruptedException -> 0x00dc }
            java.lang.Object r1 = r6.f26410i     // Catch:{ InterruptedException -> 0x00dc }
            r1.wait()     // Catch:{ InterruptedException -> 0x00dc }
            goto L_0x00dc
        L_0x00eb:
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            goto L_0x0000
        L_0x00ee:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ee }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5788yn.run():void");
    }
}
