package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5018dw;
import com.google.android.gms.internal.ads.C5130gw;
import com.google.android.gms.internal.ads.C5203iv;
import com.google.android.gms.internal.ads.C5205ix;
import com.google.android.gms.internal.ads.C5278kw;
import com.google.android.gms.internal.ads.C5314lv;
import com.google.android.gms.internal.ads.C5316lx;
import com.google.android.gms.internal.ads.C5389nw;
import com.google.android.gms.internal.ads.C5427ox;
import com.google.android.gms.internal.ads.C5462pv;
import com.google.android.gms.internal.ads.C5714wo;
import com.google.android.gms.internal.ads.C5737xa;
import com.google.android.gms.internal.ads.C5775ya;
import com.google.android.gms.internal.ads.C5796yv;
import com.google.android.gms.internal.ads.hf0;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.kf0;
import com.google.android.gms.internal.ads.lh0;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.v00;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfi;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.Map;
import java.util.concurrent.Future;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.ads.internal.r */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2970r extends C5796yv {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzcjf f9930g;

    /* renamed from: h */
    private final zzbfi f9931h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Future<C5737xa> f9932i = hm0.f17708a.mo17138A0(new C2938n(this));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Context f9933j;

    /* renamed from: k */
    private final C2969q f9934k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WebView f9935l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C5314lv f9936m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C5737xa f9937n;

    /* renamed from: o */
    private AsyncTask<Void, Void, String> f9938o;

    public C2970r(Context context, zzbfi zzbfi, String str, zzcjf zzcjf) {
        this.f9933j = context;
        this.f9930g = zzcjf;
        this.f9931h = zzbfi;
        this.f9935l = new WebView(context);
        this.f9934k = new C2969q(context, str);
        mo10941e7(0);
        this.f9935l.setVerticalScrollBarEnabled(false);
        this.f9935l.getSettings().setJavaScriptEnabled(true);
        this.f9935l.setWebViewClient(new C2936l(this));
        this.f9935l.setOnTouchListener(new C2937m(this));
    }

    /* renamed from: k7 */
    static /* bridge */ /* synthetic */ String m13152k7(C2970r rVar, String str) {
        if (rVar.f9937n == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = rVar.f9937n.mo21997a(parse, rVar.f9933j, (View) null, (Activity) null);
        } catch (C5775ya e) {
            ul0.m31863h("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: n7 */
    static /* bridge */ /* synthetic */ void m13155n7(C2970r rVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        rVar.f9933j.startActivity(intent);
    }

    /* renamed from: B */
    public final void mo10923B() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: B1 */
    public final void mo10924B1(C5389nw nwVar) {
    }

    /* renamed from: E2 */
    public final void mo10925E2(zzbjd zzbjd) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: G */
    public final void mo10926G() throws RemoteException {
        C3292l.m14236d("destroy must be called on the main UI thread.");
        this.f9938o.cancel(true);
        this.f9932i.cancel(true);
        this.f9935l.destroy();
        this.f9935l = null;
    }

    /* renamed from: I */
    public final void mo10927I() throws RemoteException {
        C3292l.m14236d("resume must be called on the main UI thread.");
    }

    /* renamed from: J0 */
    public final boolean mo10928J0() throws RemoteException {
        return false;
    }

    /* renamed from: J2 */
    public final void mo10929J2(C5278kw kwVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: J5 */
    public final void mo10930J5(m00 m00) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: M5 */
    public final boolean mo10931M5() throws RemoteException {
        return false;
    }

    /* renamed from: N4 */
    public final void mo10932N4(lh0 lh0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: O */
    public final void mo10933O() throws RemoteException {
        C3292l.m14236d("pause must be called on the main UI thread.");
    }

    /* renamed from: O5 */
    public final boolean mo10934O5(zzbfd zzbfd) throws RemoteException {
        C3292l.m14241i(this.f9935l, "This Search Ad has already been torn down");
        this.f9934k.mo10922f(zzbfd, this.f9930g);
        this.f9938o = new C2968p(this, (C2939o) null).execute(new Void[0]);
        return true;
    }

    /* renamed from: Q0 */
    public final void mo10935Q0(C5203iv ivVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: R6 */
    public final void mo10936R6(boolean z) throws RemoteException {
    }

    /* renamed from: S6 */
    public final void mo10937S6(zzbkq zzbkq) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: W0 */
    public final void mo10938W0(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: X5 */
    public final void mo10939X5(zzbfo zzbfo) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: d */
    public final zzbfi mo10940d() throws RemoteException {
        return this.f9931h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e7 */
    public final void mo10941e7(int i) {
        if (this.f9935l != null) {
            this.f9935l.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* renamed from: f */
    public final Bundle mo10942f() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: f0 */
    public final void mo10943f0() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: g */
    public final C5314lv mo10944g() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: h */
    public final C5130gw mo10945h() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: h3 */
    public final void mo10946h3(C5205ix ixVar) {
    }

    /* renamed from: i */
    public final C5316lx mo10947i() {
        return null;
    }

    /* renamed from: j */
    public final C5427ox mo10948j() {
        return null;
    }

    /* renamed from: j4 */
    public final void mo10949j4(kf0 kf0, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: k */
    public final C4863a mo10950k() throws RemoteException {
        C3292l.m14236d("getAdFrame must be called on the main UI thread.");
        return C4865b.m20503f2(this.f9935l);
    }

    /* renamed from: k2 */
    public final void mo10951k2(C5130gw gwVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: k5 */
    public final void mo10952k5(C5314lv lvVar) throws RemoteException {
        this.f9936m = lvVar;
    }

    /* renamed from: n */
    public final String mo10953n() throws RemoteException {
        return null;
    }

    /* renamed from: n6 */
    public final void mo10954n6(C5714wo woVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo10955o() {
        String b = this.f9934k.mo10918b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        String e = v00.f24530d.mo20989e();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 8 + String.valueOf(e).length());
        sb.append("https://");
        sb.append(b);
        sb.append(e);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo10956p(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C4980cv.m22123b();
            return nl0.m27927s(this.f9933j, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: q6 */
    public final void mo10957q6(hf0 hf0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: s5 */
    public final void mo10958s5(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: s6 */
    public final void mo10959s6(C5018dw dwVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: v5 */
    public final void mo10960v5(zzbfi zzbfi) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: x1 */
    public final void mo10961x1(zzbfd zzbfd, C5462pv pvVar) {
    }

    /* renamed from: x2 */
    public final void mo10962x2(C4863a aVar) {
    }

    /* renamed from: y2 */
    public final void mo10963y2(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(v00.f24530d.mo20989e());
        builder.appendQueryParameter("query", this.f9934k.mo10920d());
        builder.appendQueryParameter("pubId", this.f9934k.mo10919c());
        builder.appendQueryParameter("mappver", this.f9934k.mo10917a());
        Map<String, String> e = this.f9934k.mo10921e();
        for (String next : e.keySet()) {
            builder.appendQueryParameter(next, e.get(next));
        }
        Uri build = builder.build();
        C5737xa xaVar = this.f9937n;
        if (xaVar != null) {
            try {
                build = xaVar.mo21998b(build, this.f9933j);
            } catch (C5775ya e2) {
                ul0.m31863h("Unable to process ad data", e2);
            }
        }
        String o = mo10955o();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(o.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(o);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String zzs() throws RemoteException {
        return null;
    }
}
