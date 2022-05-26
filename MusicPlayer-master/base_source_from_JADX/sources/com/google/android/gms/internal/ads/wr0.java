package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.ads.internal.overlay.C2956o;
import com.google.android.gms.ads.internal.overlay.C2958q;
import com.google.android.gms.ads.internal.overlay.C2964w;
import com.google.android.gms.ads.internal.overlay.C2966y;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3041u0;
import com.google.android.gms.common.util.C3370o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p082e.p109h.p119p.C3774v;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class wr0 extends WebViewClient implements et0 {

    /* renamed from: I */
    public static final /* synthetic */ int f25489I = 0;

    /* renamed from: A */
    protected zi0 f25490A;

    /* renamed from: B */
    private lv2 f25491B;

    /* renamed from: C */
    private boolean f25492C;

    /* renamed from: D */
    private boolean f25493D;

    /* renamed from: E */
    private int f25494E;

    /* renamed from: F */
    private boolean f25495F;

    /* renamed from: G */
    private final HashSet<String> f25496G;

    /* renamed from: H */
    private View.OnAttachStateChangeListener f25497H;

    /* renamed from: g */
    private final pr0 f25498g;

    /* renamed from: h */
    private final C5790yp f25499h;

    /* renamed from: i */
    private final HashMap<String, List<y50<? super pr0>>> f25500i = new HashMap<>();

    /* renamed from: j */
    private final Object f25501j = new Object();

    /* renamed from: k */
    private C5497qt f25502k;

    /* renamed from: l */
    private C2958q f25503l;

    /* renamed from: m */
    private ct0 f25504m;

    /* renamed from: n */
    private dt0 f25505n;

    /* renamed from: o */
    private x40 f25506o;

    /* renamed from: p */
    private z40 f25507p;

    /* renamed from: q */
    private yf1 f25508q;

    /* renamed from: r */
    private boolean f25509r;

    /* renamed from: s */
    private boolean f25510s;

    /* renamed from: t */
    private boolean f25511t;

    /* renamed from: u */
    private boolean f25512u;

    /* renamed from: v */
    private boolean f25513v;

    /* renamed from: w */
    private C2966y f25514w;

    /* renamed from: x */
    private be0 f25515x;

    /* renamed from: y */
    private C2926b f25516y;

    /* renamed from: z */
    private wd0 f25517z;

    public wr0(pr0 pr0, C5790yp ypVar, boolean z) {
        be0 be0 = new be0(pr0, pr0.mo17653C(), new C5836zy(pr0.getContext()));
        this.f25499h = ypVar;
        this.f25498g = pr0;
        this.f25511t = z;
        this.f25515x = be0;
        this.f25517z = null;
        this.f25496G = new HashSet<>(Arrays.asList(((String) C5054ev.m23225c().mo20153b(C5503qz.f22676z3)).split(",")));
    }

    /* renamed from: g */
    private static WebResourceResponse m33279g() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22617s0)).booleanValue()) {
            return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: k */
    private final WebResourceResponse m33280k(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        String str2;
        String str3;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry next : map.entrySet()) {
                        openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        C2971s.m13214q().mo10981S(this.f25498g.getContext(), this.f25498g.zzp().f27376g, false, httpURLConnection, false, 60000);
                        tl0 tl0 = new tl0((String) null);
                        tl0.mo21105c(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        tl0.mo21107e(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            C2971s.m13214q();
                            WebResourceResponse t = C2979b2.m13272t(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    ul0.m31862g("Protocol is null");
                                    WebResourceResponse g = m33279g();
                                    TrafficStats.clearThreadStatsTag();
                                    return g;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    if (headerField.length() != 0) {
                                        str2 = "Redirecting to ".concat(headerField);
                                    } else {
                                        str2 = new String("Redirecting to ");
                                    }
                                    ul0.m31857b(str2);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    if (protocol.length() != 0) {
                                        str3 = "Unsupported scheme: ".concat(protocol);
                                    } else {
                                        str3 = new String("Unsupported scheme: ");
                                    }
                                    ul0.m31862g(str3);
                                    return m33279g();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            C2971s.m13214q();
            WebResourceResponse t2 = C2979b2.m13272t(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return t2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m33281n(Map<String, String> map, List<y50<? super pr0>> list, String str) {
        String str2;
        if (C3018m1.m13390m()) {
            if (str.length() != 0) {
                str2 = "Received GMSG: ".concat(str);
            } else {
                str2 = new String("Received GMSG: ");
            }
            C3018m1.m13388k(str2);
            for (String next : map.keySet()) {
                String str3 = map.get(next);
                StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(next);
                sb.append(": ");
                sb.append(str3);
                C3018m1.m13388k(sb.toString());
            }
        }
        for (y50<? super pr0> a : list) {
            a.mo15685a(this.f25498g, map);
        }
    }

    /* renamed from: p */
    private final void m33282p() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f25497H;
        if (onAttachStateChangeListener != null) {
            ((View) this.f25498g).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m33283r(View view, zi0 zi0, int i) {
        if (zi0.mo21069g() && i > 0) {
            zi0.mo21066b(view);
            if (zi0.mo21069g()) {
                C2979b2.f9980i.postDelayed(new rr0(this, view, zi0, i), 100);
            }
        }
    }

    /* renamed from: u */
    private static final boolean m33284u(boolean z, pr0 pr0) {
        return z && !pr0.mo17717y().mo18020i() && !pr0.mo17694j0().equals("interstitial_mb");
    }

    /* renamed from: A0 */
    public final void mo21874A0(boolean z, int i, String str, boolean z2) {
        C5497qt qtVar;
        vr0 vr0;
        yf1 yf1;
        boolean h0 = this.f25498g.mo17692h0();
        boolean u = m33284u(h0, this.f25498g);
        boolean z3 = true;
        if (!u && z2) {
            z3 = false;
        }
        if (u) {
            qtVar = null;
        } else {
            qtVar = this.f25502k;
        }
        if (h0) {
            vr0 = null;
        } else {
            vr0 = new vr0(this.f25498g, this.f25503l);
        }
        x40 x40 = this.f25506o;
        z40 z40 = this.f25507p;
        C2966y yVar = this.f25514w;
        pr0 pr0 = this.f25498g;
        zzcjf zzp = pr0.zzp();
        if (z3) {
            yf1 = null;
        } else {
            yf1 = this.f25508q;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(qtVar, vr0, x40, z40, yVar, pr0, z, i, str, zzp, yf1);
        mo21898y0(adOverlayInfoParcel);
    }

    /* renamed from: B0 */
    public final void mo21875B0(boolean z, int i, String str, String str2, boolean z2) {
        C5497qt qtVar;
        vr0 vr0;
        yf1 yf1;
        boolean h0 = this.f25498g.mo17692h0();
        boolean u = m33284u(h0, this.f25498g);
        boolean z3 = true;
        if (!u && z2) {
            z3 = false;
        }
        if (u) {
            qtVar = null;
        } else {
            qtVar = this.f25502k;
        }
        if (h0) {
            vr0 = null;
        } else {
            vr0 = new vr0(this.f25498g, this.f25503l);
        }
        x40 x40 = this.f25506o;
        z40 z40 = this.f25507p;
        C2966y yVar = this.f25514w;
        pr0 pr0 = this.f25498g;
        zzcjf zzp = pr0.zzp();
        if (z3) {
            yf1 = null;
        } else {
            yf1 = this.f25508q;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(qtVar, (C2958q) vr0, x40, z40, yVar, pr0, z, i, str, str2, zzp, yf1);
        mo21898y0(adOverlayInfoParcel);
    }

    /* renamed from: C0 */
    public final void mo21876C0(String str, y50<? super pr0> y50) {
        synchronized (this.f25501j) {
            List list = this.f25500i.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f25500i.put(str, list);
            }
            list.add(y50);
        }
    }

    /* renamed from: D0 */
    public final void mo21877D0() {
        zi0 zi0 = this.f25490A;
        if (zi0 != null) {
            zi0.zze();
            this.f25490A = null;
        }
        m33282p();
        synchronized (this.f25501j) {
            this.f25500i.clear();
            this.f25502k = null;
            this.f25503l = null;
            this.f25504m = null;
            this.f25505n = null;
            this.f25506o = null;
            this.f25507p = null;
            this.f25509r = false;
            this.f25511t = false;
            this.f25512u = false;
            this.f25514w = null;
            this.f25516y = null;
            this.f25515x = null;
            wd0 wd0 = this.f25517z;
            if (wd0 != null) {
                wd0.mo21804h(true);
                this.f25517z = null;
            }
            this.f25491B = null;
        }
    }

    /* renamed from: G0 */
    public final void mo17292G0(Uri uri) {
        String str;
        String path = uri.getPath();
        List list = this.f25500i.get(path);
        if (path == null || list == null) {
            String valueOf = String.valueOf(uri);
            String.valueOf(valueOf).length();
            C3018m1.m13388k("No GMSG handler found for GMSG: ".concat(String.valueOf(valueOf)));
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22303C4)).booleanValue() && C2971s.m13213p().mo17560f() != null) {
                hm0.f17708a.execute(new sr0((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22668y3)).booleanValue() && this.f25496G.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22286A3)).intValue()) {
                if (path.length() != 0) {
                    str = "Parsing gmsg query params on BG thread: ".concat(path);
                } else {
                    str = new String("Parsing gmsg query params on BG thread: ");
                }
                C3018m1.m13388k(str);
                s83.m30616r(C2971s.m13214q().mo10976J(uri), new ur0(this, list, path, uri), hm0.f17712e);
                return;
            }
        }
        C2971s.m13214q();
        m33281n(C2979b2.m13271s(uri), list, path);
    }

    /* renamed from: O */
    public final void mo17293O(C5497qt qtVar, x40 x40, C2958q qVar, z40 z40, C2966y yVar, boolean z, b60 b60, C2926b bVar, de0 de0, zi0 zi0, y12 y12, lv2 lv2, gt1 gt1, gu2 gu2, z50 z50, yf1 yf1) {
        x40 x402 = x40;
        z40 z402 = z40;
        b60 b602 = b60;
        de0 de02 = de0;
        zi0 zi02 = zi0;
        y12 y122 = y12;
        lv2 lv22 = lv2;
        z50 z502 = z50;
        yf1 yf12 = yf1;
        C2926b bVar2 = bVar == null ? new C2926b(this.f25498g.getContext(), zi02, (zzcde) null) : bVar;
        this.f25517z = new wd0(this.f25498g, de02);
        this.f25490A = zi02;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22665y0)).booleanValue()) {
            mo21876C0("/adMetadata", new w40(x402));
        }
        if (z402 != null) {
            mo21876C0("/appEvent", new y40(z402));
        }
        mo21876C0("/backButton", x50.f25670j);
        mo21876C0("/refresh", x50.f25671k);
        mo21876C0("/canOpenApp", x50.f25662b);
        mo21876C0("/canOpenURLs", x50.f25661a);
        mo21876C0("/canOpenIntents", x50.f25663c);
        mo21876C0("/close", x50.f25664d);
        mo21876C0("/customClose", x50.f25665e);
        mo21876C0("/instrument", x50.f25674n);
        mo21876C0("/delayPageLoaded", x50.f25676p);
        mo21876C0("/delayPageClosed", x50.f25677q);
        mo21876C0("/getLocationInfo", x50.f25678r);
        mo21876C0("/log", x50.f25667g);
        mo21876C0("/mraid", new g60(bVar2, this.f25517z, de02));
        be0 be0 = this.f25515x;
        if (be0 != null) {
            mo21876C0("/mraidLoaded", be0);
        }
        k60 k60 = r4;
        k60 k602 = new k60(bVar2, this.f25517z, y12, gt1, gu2);
        mo21876C0("/open", k60);
        mo21876C0("/precache", new fq0());
        mo21876C0("/touch", x50.f25669i);
        mo21876C0("/video", x50.f25672l);
        mo21876C0("/videoMeta", x50.f25673m);
        if (y122 == null || lv22 == null) {
            mo21876C0("/click", x50.m33571a(yf1));
            mo21876C0("/httpTrack", x50.f25666f);
        } else {
            mo21876C0("/click", new aq2(yf12, lv22, y122));
            mo21876C0("/httpTrack", new bq2(lv22, y122));
        }
        if (C2971s.m13212o().mo16673z(this.f25498g.getContext())) {
            mo21876C0("/logScionEvent", new e60(this.f25498g.getContext()));
        }
        if (b602 != null) {
            mo21876C0("/setInterstitialProperties", new a60(b602, (byte[]) null));
        }
        if (z502 != null) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue()) {
                mo21876C0("/inspectorNetworkExtras", z502);
            }
        }
        this.f25502k = qtVar;
        this.f25503l = qVar;
        this.f25506o = x402;
        this.f25507p = z402;
        this.f25514w = yVar;
        this.f25516y = bVar2;
        this.f25508q = yf12;
        this.f25509r = z;
        this.f25491B = lv22;
    }

    /* renamed from: T */
    public final void mo17294T() {
        synchronized (this.f25501j) {
            this.f25509r = false;
            this.f25511t = true;
            hm0.f17712e.execute(new qr0(this));
        }
    }

    /* renamed from: V */
    public final void mo21878V() {
        if (this.f25504m != null && ((this.f25492C && this.f25494E <= 0) || this.f25493D || this.f25510s)) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue() && this.f25498g.mo17244l() != null) {
                C5762xz.m33910a(this.f25498g.mo17244l().mo16805a(), this.f25498g.mo17242k(), "awfllc");
            }
            ct0 ct0 = this.f25504m;
            boolean z = false;
            if (!this.f25493D && !this.f25510s) {
                z = true;
            }
            ct0.mo10863B(z);
            this.f25504m = null;
        }
        this.f25498g.mo17693i0();
    }

    /* renamed from: W */
    public final void mo21879W(boolean z) {
        this.f25495F = z;
    }

    /* renamed from: X */
    public final void mo17295X(boolean z) {
        synchronized (this.f25501j) {
            this.f25513v = z;
        }
    }

    /* renamed from: X0 */
    public final void mo17296X0(boolean z) {
        synchronized (this.f25501j) {
            this.f25512u = true;
        }
    }

    /* renamed from: Y */
    public final void mo17297Y(int i, int i2, boolean z) {
        be0 be0 = this.f25515x;
        if (be0 != null) {
            be0.mo16221h(i, i2);
        }
        wd0 wd0 = this.f25517z;
        if (wd0 != null) {
            wd0.mo21806j(i, i2, false);
        }
    }

    /* renamed from: a */
    public final void mo21880a(boolean z) {
        this.f25509r = false;
    }

    /* renamed from: a0 */
    public final void mo17298a0(int i, int i2) {
        wd0 wd0 = this.f25517z;
        if (wd0 != null) {
            wd0.mo21807k(i, i2);
        }
    }

    /* renamed from: a1 */
    public final void mo17299a1(dt0 dt0) {
        this.f25505n = dt0;
    }

    /* renamed from: b */
    public final void mo21881b(String str, y50<? super pr0> y50) {
        synchronized (this.f25501j) {
            List list = this.f25500i.get(str);
            if (list != null) {
                list.remove(y50);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final /* synthetic */ void mo21882b0() {
        this.f25498g.mo17716x0();
        C2955n M = this.f25498g.mo17667M();
        if (M != null) {
            M.mo10869G();
        }
    }

    /* renamed from: c */
    public final void mo21883c(String str, C3370o<y50<? super pr0>> oVar) {
        synchronized (this.f25501j) {
            List<y50> list = this.f25500i.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (y50 y50 : list) {
                    if (oVar.apply(y50)) {
                        arrayList.add(y50);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo21884d() {
        boolean z;
        synchronized (this.f25501j) {
            z = this.f25513v;
        }
        return z;
    }

    /* renamed from: d1 */
    public final void mo17300d1(ct0 ct0) {
        this.f25504m = ct0;
    }

    /* renamed from: e */
    public final boolean mo21885e() {
        boolean z;
        synchronized (this.f25501j) {
            z = this.f25512u;
        }
        return z;
    }

    /* renamed from: f */
    public final C2926b mo17301f() {
        return this.f25516y;
    }

    /* renamed from: h */
    public final void mo17302h() {
        C5790yp ypVar = this.f25499h;
        if (ypVar != null) {
            ypVar.mo22273c(10005);
        }
        this.f25493D = true;
        mo21878V();
        this.f25498g.destroy();
    }

    /* renamed from: i */
    public final void mo17303i() {
        synchronized (this.f25501j) {
        }
        this.f25494E++;
        mo21878V();
    }

    /* renamed from: j */
    public final void mo17304j() {
        this.f25494E--;
        mo21878V();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* synthetic */ void mo21886k0(View view, zi0 zi0, int i) {
        m33283r(view, zi0, i - 1);
    }

    /* renamed from: l0 */
    public final void mo21887l0(zzc zzc, boolean z) {
        yf1 yf1;
        boolean h0 = this.f25498g.mo17692h0();
        boolean u = m33284u(h0, this.f25498g);
        boolean z2 = true;
        if (!u && z) {
            z2 = false;
        }
        C5497qt qtVar = u ? null : this.f25502k;
        C2958q qVar = h0 ? null : this.f25503l;
        C2966y yVar = this.f25514w;
        zzcjf zzp = this.f25498g.zzp();
        pr0 pr0 = this.f25498g;
        if (z2) {
            yf1 = null;
        } else {
            yf1 = this.f25508q;
        }
        mo21898y0(new AdOverlayInfoParcel(zzc, qtVar, qVar, yVar, zzp, pr0, yf1));
    }

    /* renamed from: n0 */
    public final void mo21888n0(C3041u0 u0Var, y12 y12, gt1 gt1, gu2 gu2, String str, String str2, int i) {
        pr0 pr0 = this.f25498g;
        mo21898y0(new AdOverlayInfoParcel(pr0, pr0.zzp(), u0Var, y12, gt1, gu2, str, str2, i));
    }

    /* renamed from: o */
    public final void mo15729o() {
        yf1 yf1 = this.f25508q;
        if (yf1 != null) {
            yf1.mo15729o();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Loading resource: ".concat(valueOf);
        } else {
            str2 = new String("Loading resource: ");
        }
        C3018m1.m13388k(str2);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo17292G0(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.f25505n = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        mo21878V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f25492C = true;
        r1 = r0.f25505n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f25501j
            monitor-enter(r1)
            com.google.android.gms.internal.ads.pr0 r2 = r0.f25498g     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo17666L0()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.pr0 r2 = r0.f25498g     // Catch:{ all -> 0x0029 }
            r2.mo17660H()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f25492C = r1
            com.google.android.gms.internal.ads.dt0 r1 = r0.f25505n
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.f25505n = r1
        L_0x0025:
            r0.mo21878V()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wr0.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f25510s = true;
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f25498g.mo17679U0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: s */
    public final boolean mo17305s() {
        boolean z;
        synchronized (this.f25501j) {
            z = this.f25511t;
        }
        return z;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo21899z(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "AdWebView shouldOverrideUrlLoading: ".concat(valueOf);
        } else {
            str2 = new String("AdWebView shouldOverrideUrlLoading: ");
        }
        C3018m1.m13388k(str2);
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f25509r && webView == this.f25498g.mo17664K()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    C5497qt qtVar = this.f25502k;
                    if (qtVar != null) {
                        qtVar.mo10632u0();
                        zi0 zi0 = this.f25490A;
                        if (zi0 != null) {
                            zi0.mo21064V(str);
                        }
                        this.f25502k = null;
                    }
                    yf1 yf1 = this.f25508q;
                    if (yf1 != null) {
                        yf1.mo15729o();
                        this.f25508q = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f25498g.mo17664K().willNotDraw()) {
                try {
                    C5737xa J = this.f25498g.mo17662J();
                    if (J != null && J.mo22002f(parse)) {
                        Context context = this.f25498g.getContext();
                        pr0 pr0 = this.f25498g;
                        parse = J.mo21997a(parse, context, (View) pr0, pr0.mo17241i());
                    }
                } catch (C5775ya unused) {
                    String valueOf2 = String.valueOf(str);
                    ul0.m31862g(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                C2926b bVar = this.f25516y;
                if (bVar == null || bVar.mo10829c()) {
                    mo21887l0(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (C2964w) null), true);
                } else {
                    this.f25516y.mo10828b(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                ul0.m31862g(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            mo17292G0(parse);
        }
        return true;
    }

    /* renamed from: t0 */
    public final void mo21895t0(boolean z, int i, boolean z2) {
        yf1 yf1;
        boolean u = m33284u(this.f25498g.mo17692h0(), this.f25498g);
        boolean z3 = true;
        if (!u && z2) {
            z3 = false;
        }
        C5497qt qtVar = u ? null : this.f25502k;
        C2958q qVar = this.f25503l;
        C2966y yVar = this.f25514w;
        pr0 pr0 = this.f25498g;
        zzcjf zzp = pr0.zzp();
        if (z3) {
            yf1 = null;
        } else {
            yf1 = this.f25508q;
        }
        mo21898y0(new AdOverlayInfoParcel(qtVar, qVar, yVar, pr0, z, i, zzp, yf1));
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        C5497qt qtVar = this.f25502k;
        if (qtVar != null) {
            qtVar.mo10632u0();
        }
    }

    /* renamed from: v */
    public final ViewTreeObserver.OnGlobalLayoutListener mo21896v() {
        synchronized (this.f25501j) {
        }
        return null;
    }

    /* renamed from: x */
    public final ViewTreeObserver.OnScrollChangedListener mo21897x() {
        synchronized (this.f25501j) {
        }
        return null;
    }

    /* renamed from: y0 */
    public final void mo21898y0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        wd0 wd0 = this.f25517z;
        boolean l = wd0 != null ? wd0.mo21808l() : false;
        C2971s.m13208k();
        C2956o.m13114a(this.f25498g.getContext(), adOverlayInfoParcel, !l);
        zi0 zi0 = this.f25490A;
        if (zi0 != null) {
            String str = adOverlayInfoParcel.f9861r;
            if (str == null && (zzc = adOverlayInfoParcel.f9850g) != null) {
                str = zzc.f9914h;
            }
            zi0.mo21064V(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final WebResourceResponse mo21899z(String str, Map<String, String> map) {
        zzbah b;
        try {
            if (g10.f16850a.mo20989e().booleanValue()) {
                if (this.f25491B != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.f25491B.mo19285b(str);
                    return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, new ByteArrayInputStream(new byte[0]));
                }
            }
            String c = ek0.m23025c(str, this.f25498g.getContext(), this.f25495F);
            if (!c.equals(str)) {
                return m33280k(c, map);
            }
            zzbak Y = zzbak.m34945Y(Uri.parse(str));
            if (Y != null && (b = C2971s.m13201d().mo18469b(Y)) != null && b.mo22528v0()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, b.mo22526n0());
            }
            if (!tl0.m31314l() || !c10.f14774b.mo20989e().booleanValue()) {
                return null;
            }
            return m33280k(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            C2971s.m13213p().mo17571s(e, "AdWebViewClient.interceptRequest");
            return m33279g();
        }
    }

    public final void zzp() {
        zi0 zi0 = this.f25490A;
        if (zi0 != null) {
            WebView K = this.f25498g.mo17664K();
            if (C3774v.m16180S(K)) {
                m33283r(K, zi0, 10);
                return;
            }
            m33282p();
            tr0 tr0 = new tr0(this, zi0);
            this.f25497H = tr0;
            ((View) this.f25498g).addOnAttachStateChangeListener(tr0);
        }
    }
}
