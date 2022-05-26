package com.google.android.gms.ads.p068a0.p069a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.C2890b;
import com.google.android.gms.ads.internal.util.C3056z0;
import com.google.android.gms.internal.ads.C4905au;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5737xa;
import com.google.android.gms.internal.ads.C5775ya;
import com.google.android.gms.internal.ads.bp1;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.e93;
import com.google.android.gms.internal.ads.ft1;
import com.google.android.gms.internal.ads.fu2;
import com.google.android.gms.internal.ads.gt1;
import com.google.android.gms.internal.ads.gu2;
import com.google.android.gms.internal.ads.j83;
import com.google.android.gms.internal.ads.lk0;
import com.google.android.gms.internal.ads.lq2;
import com.google.android.gms.internal.ads.lv2;
import com.google.android.gms.internal.ads.mt0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.o71;
import com.google.android.gms.internal.ads.s83;
import com.google.android.gms.internal.ads.sp2;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.vd1;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzchx;
import com.google.android.gms.internal.ads.zzcjf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.a0.a.f0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2863f0 extends nk0 {

    /* renamed from: E */
    protected static final List<String> f9693E = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click"}));

    /* renamed from: F */
    protected static final List<String> f9694F = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: G */
    protected static final List<String> f9695G = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion"}));

    /* renamed from: H */
    protected static final List<String> f9696H = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: I */
    public static final /* synthetic */ int f9697I = 0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final AtomicInteger f9698A = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final zzcjf f9699B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f9700C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final String f9701D;

    /* renamed from: g */
    private final mt0 f9702g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f9703h;

    /* renamed from: i */
    private final C5737xa f9704i;

    /* renamed from: j */
    private final lq2<bp1> f9705j;

    /* renamed from: k */
    private final e93 f9706k;

    /* renamed from: l */
    private final ScheduledExecutorService f9707l;

    /* renamed from: m */
    private zzcco f9708m;

    /* renamed from: n */
    private Point f9709n = new Point();

    /* renamed from: o */
    private Point f9710o = new Point();

    /* renamed from: p */
    private final Set<WebView> f9711p = Collections.newSetFromMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C2873l f9712q;

    /* renamed from: r */
    private final gt1 f9713r;

    /* renamed from: s */
    private final gu2 f9714s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final lv2 f9715t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final boolean f9716u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final boolean f9717v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final boolean f9718w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final boolean f9719x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final String f9720y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final String f9721z;

    public C2863f0(mt0 mt0, Context context, C5737xa xaVar, lq2<bp1> lq2, e93 e93, ScheduledExecutorService scheduledExecutorService, gt1 gt1, gu2 gu2, lv2 lv2, zzcjf zzcjf) {
        this.f9702g = mt0;
        this.f9703h = context;
        this.f9704i = xaVar;
        this.f9705j = lq2;
        this.f9706k = e93;
        this.f9707l = scheduledExecutorService;
        this.f9712q = mt0.mo19527u();
        this.f9713r = gt1;
        this.f9714s = gu2;
        this.f9715t = lv2;
        this.f9699B = zzcjf;
        this.f9716u = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22421S4)).booleanValue();
        this.f9717v = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22414R4)).booleanValue();
        this.f9718w = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22428T4)).booleanValue();
        this.f9719x = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22442V4)).booleanValue();
        this.f9720y = (String) C5054ev.m23225c().mo20153b(C5503qz.f22435U4);
        this.f9721z = (String) C5054ev.m23225c().mo20153b(C5503qz.f22449W4);
        this.f9701D = (String) C5054ev.m23225c().mo20153b(C5503qz.f22456X4);
    }

    /* renamed from: G7 */
    static /* bridge */ /* synthetic */ void m12859G7(C2863f0 f0Var, String str, String str2, String str3) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue()) {
                gu2 gu2 = f0Var.f9714s;
                fu2 b = fu2.m23966b(str);
                b.mo17738a(str2, str3);
                gu2.mo18029a(b);
                return;
            }
            ft1 a = f0Var.f9713r.mo18022a();
            a.mo17730b("action", str);
            a.mo17730b(str2, str3);
            a.mo17734f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f27284h;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m12860J() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzcco r0 = r1.f9708m
            if (r0 == 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r0 = r0.f27284h
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p068a0.p069a.C2863f0.m12860J():boolean");
    }

    /* renamed from: j7 */
    static boolean m12865j7(Uri uri) {
        return m12870o7(uri, f9695G, f9696H);
    }

    /* renamed from: k7 */
    static final /* synthetic */ Uri m12866k7(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m12871p7(uri, "nas", str) : uri;
    }

    /* renamed from: l7 */
    static final /* synthetic */ ArrayList m12867l7(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!m12865j7(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m12871p7(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* renamed from: m7 */
    private final C2878q m12868m7(Context context, String str, String str2, zzbfi zzbfi, zzbfd zzbfd) {
        C2877p v = this.f9702g.mo19528v();
        o71 o71 = new o71();
        o71.mo19907c(context);
        sp2 sp2 = new sp2();
        if (str == null) {
            str = "adUnitId";
        }
        sp2.mo20915H(str);
        if (zzbfd == null) {
            zzbfd = new C4905au().mo15950a();
        }
        sp2.mo20926d(zzbfd);
        if (zzbfi == null) {
            zzbfi = new zzbfi();
        }
        sp2.mo20914G(zzbfi);
        o71.mo19910f(sp2.mo20928f());
        v.mo10706c(o71.mo19911g());
        C2867h0 h0Var = new C2867h0();
        h0Var.mo10693a(str2);
        v.mo10704a(new C2871j0(h0Var, (C2869i0) null));
        new vd1();
        return v.mo10705b();
    }

    /* renamed from: n7 */
    private final d93<String> m12869n7(String str) {
        bp1[] bp1Arr = new bp1[1];
        d93<O> n = s83.m30612n(this.f9705j.mo19271a(), new C2885x(this, bp1Arr, str), this.f9706k);
        n.mo15945h(new C2886y(this, bp1Arr), this.f9706k);
        return s83.m30604f(s83.m30611m((j83) s83.m30613o(j83.m25564E(n), (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22470Z4)).intValue(), TimeUnit.MILLISECONDS, this.f9707l), C2882u.f9751a, this.f9706k), Exception.class, C2881t.f9750a, this.f9706k);
    }

    /* renamed from: o7 */
    private static boolean m12870o7(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            for (String contains : list) {
                if (path.contains(contains)) {
                    for (String endsWith : list2) {
                        if (host.endsWith(endsWith)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p7 */
    public static final Uri m12871p7(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D7 */
    public final /* synthetic */ ArrayList mo10680D7(List list, C4863a aVar) throws Exception {
        String f = this.f9704i.mo21999c() != null ? this.f9704i.mo21999c().mo10844f(this.f9703h, (View) C4865b.m20502K0(aVar), (Activity) null) : BuildConfig.FLAVOR;
        if (!TextUtils.isEmpty(f)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!m12865j7(uri)) {
                    String valueOf = String.valueOf(uri);
                    String.valueOf(valueOf).length();
                    ul0.m31862g("Not a Google URL: ".concat(String.valueOf(valueOf)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(m12871p7(uri, "ms", f));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H7 */
    public final /* synthetic */ void mo10681H7(bp1[] bp1Arr) {
        bp1 bp1 = bp1Arr[0];
        if (bp1 != null) {
            this.f9705j.mo19272b(s83.m30607i(bp1));
        }
    }

    /* renamed from: P */
    public final void mo10682P(C4863a aVar) {
        View view;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22463Y4)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) C4865b.m20502K0(aVar);
            zzcco zzcco = this.f9708m;
            if (zzcco == null) {
                view = null;
            } else {
                view = zzcco.f27283g;
            }
            this.f9709n = C3056z0.m13515a(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.f9710o = this.f9709n;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f9709n;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f9704i.mo22000d(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: T1 */
    public final void mo10683T1(C4863a aVar, zzchx zzchx, lk0 lk0) {
        Context context = (Context) C4865b.m20502K0(aVar);
        this.f9703h = context;
        s83.m30616r(m12868m7(context, zzchx.f27372g, zzchx.f27373h, zzchx.f27374i, zzchx.f27375j).mo10707a(), new C2855b0(this, lk0), this.f9702g.mo19513d());
    }

    /* renamed from: Y6 */
    public final void mo10684Y6(List<Uri> list, C4863a aVar, nf0 nf0) {
        try {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22463Y4)).booleanValue()) {
                nf0.mo19164q("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                nf0.mo19164q("There should be only 1 click URL.");
            } else {
                Uri uri = list.get(0);
                if (!m12870o7(uri, f9693E, f9694F)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    ul0.m31862g(sb.toString());
                    nf0.mo19163G1(list);
                    return;
                }
                d93 A0 = this.f9706k.mo17138A0(new C2887z(this, uri, aVar));
                if (m12860J()) {
                    A0 = s83.m30612n(A0, new C2883v(this), this.f9706k);
                } else {
                    ul0.m31861f("Asset view map is empty.");
                }
                s83.m30616r(A0, new C2859d0(this, nf0), this.f9702g.mo19513d());
            }
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: m0 */
    public final void mo10685m0(C4863a aVar) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22559k6)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                ul0.m31862g("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22567l6)).booleanValue()) {
                s83.m30616r(m12868m7(this.f9703h, (String) null, C2890b.BANNER.name(), (zzbfi) null, (zzbfd) null).mo10707a(), new C2861e0(this), this.f9702g.mo19513d());
            }
            WebView webView = (WebView) C4865b.m20502K0(aVar);
            if (webView == null) {
                ul0.m31859d("The webView cannot be null.");
            } else if (this.f9711p.contains(webView)) {
                ul0.m31861f("This webview has already been registered.");
            } else {
                this.f9711p.add(webView);
                webView.addJavascriptInterface(new C2852a(webView, this.f9704i), "gmaSdk");
            }
        }
    }

    /* renamed from: o4 */
    public final void mo10686o4(List<Uri> list, C4863a aVar, nf0 nf0) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22463Y4)).booleanValue()) {
            try {
                nf0.mo19164q("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                ul0.m31860e(BuildConfig.FLAVOR, e);
            }
        } else {
            d93 A0 = this.f9706k.mo17138A0(new C2853a0(this, list, aVar));
            if (m12860J()) {
                A0 = s83.m30612n(A0, new C2884w(this), this.f9706k);
            } else {
                ul0.m31861f("Asset view map is empty.");
            }
            s83.m30616r(A0, new C2857c0(this, nf0), this.f9702g.mo19513d());
        }
    }

    /* renamed from: s4 */
    public final void mo10687s4(zzcco zzcco) {
        this.f9708m = zzcco;
        this.f9705j.mo19273c(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s7 */
    public final /* synthetic */ Uri mo10688s7(Uri uri, C4863a aVar) throws Exception {
        try {
            uri = this.f9704i.mo21997a(uri, this.f9703h, (View) C4865b.m20502K0(aVar), (Activity) null);
        } catch (C5775ya e) {
            ul0.m31863h(BuildConfig.FLAVOR, e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w7 */
    public final /* synthetic */ d93 mo10689w7(bp1[] bp1Arr, String str, bp1 bp1) throws Exception {
        bp1Arr[0] = bp1;
        Context context = this.f9703h;
        zzcco zzcco = this.f9708m;
        Map<String, WeakReference<View>> map = zzcco.f27284h;
        JSONObject d = C3056z0.m13518d(context, map, map, zzcco.f27283g);
        JSONObject g = C3056z0.m13521g(this.f9703h, this.f9708m.f27283g);
        JSONObject f = C3056z0.m13520f(this.f9708m.f27283g);
        JSONObject e = C3056z0.m13519e(this.f9703h, this.f9708m.f27283g);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d);
        jSONObject.put("ad_view_signal", g);
        jSONObject.put("scroll_view_signal", f);
        jSONObject.put("lock_screen_signal", e);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", C3056z0.m13517c((String) null, this.f9703h, this.f9710o, this.f9709n));
        }
        return bp1.mo16350d(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x7 */
    public final /* synthetic */ d93 mo10690x7(Uri uri) throws Exception {
        return s83.m30611m(m12869n7("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new C2879r(this, uri), this.f9706k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y7 */
    public final /* synthetic */ d93 mo10691y7(ArrayList arrayList) throws Exception {
        return s83.m30611m(m12869n7("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new C2880s(this, arrayList), this.f9706k);
    }
}
