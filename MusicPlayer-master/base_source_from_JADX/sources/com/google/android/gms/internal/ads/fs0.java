package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C2996g;
import com.google.android.gms.ads.internal.util.C3041u0;
import com.google.android.gms.common.util.C3370o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fs0 extends FrameLayout implements pr0 {

    /* renamed from: g */
    private final pr0 f16745g;

    /* renamed from: h */
    private final sn0 f16746h;

    /* renamed from: i */
    private final AtomicBoolean f16747i = new AtomicBoolean();

    public fs0(pr0 pr0) {
        super(pr0.getContext());
        this.f16745g = pr0;
        this.f16746h = new sn0(pr0.mo17653C(), this, this);
        addView((View) pr0);
    }

    /* renamed from: A */
    public final void mo17227A(String str, eq0 eq0) {
        this.f16745g.mo17227A(str, eq0);
    }

    /* renamed from: A0 */
    public final void mo10853A0() {
        this.f16745g.mo10853A0();
    }

    /* renamed from: B */
    public final ep2 mo17651B() {
        return this.f16745g.mo17651B();
    }

    /* renamed from: B0 */
    public final void mo17652B0(zzc zzc, boolean z) {
        this.f16745g.mo17652B0(zzc, z);
    }

    /* renamed from: C */
    public final Context mo17653C() {
        return this.f16745g.mo17653C();
    }

    /* renamed from: D */
    public final void mo17654D(boolean z) {
        this.f16745g.mo17654D(z);
    }

    /* renamed from: E */
    public final C5381no mo17655E() {
        return this.f16745g.mo17655E();
    }

    /* renamed from: E0 */
    public final void mo17656E0(gt0 gt0) {
        this.f16745g.mo17656E0(gt0);
    }

    /* renamed from: F */
    public final void mo17657F(bp2 bp2, ep2 ep2) {
        this.f16745g.mo17657F(bp2, ep2);
    }

    /* renamed from: F0 */
    public final C4863a mo17658F0() {
        return this.f16745g.mo17658F0();
    }

    /* renamed from: G */
    public final void mo17659G(C5381no noVar) {
        this.f16745g.mo17659G(noVar);
    }

    /* renamed from: H */
    public final void mo17660H() {
        this.f16746h.mo20885d();
        this.f16745g.mo17660H();
    }

    /* renamed from: H0 */
    public final void mo16484H0(C5749xm xmVar) {
        this.f16745g.mo16484H0(xmVar);
    }

    /* renamed from: I */
    public final void mo17661I(C2955n nVar) {
        this.f16745g.mo17661I(nVar);
    }

    /* renamed from: I0 */
    public final void mo17228I0(boolean z, long j) {
        this.f16745g.mo17228I0(z, j);
    }

    /* renamed from: J */
    public final C5737xa mo17662J() {
        return this.f16745g.mo17662J();
    }

    /* renamed from: J0 */
    public final void mo17663J0() {
        this.f16745g.mo17663J0();
    }

    /* renamed from: K */
    public final WebView mo17664K() {
        return (WebView) this.f16745g;
    }

    /* renamed from: K0 */
    public final void mo17665K0(boolean z, int i, boolean z2) {
        this.f16745g.mo17665K0(z, i, z2);
    }

    /* renamed from: L */
    public final void mo17229L(boolean z) {
        this.f16745g.mo17229L(false);
    }

    /* renamed from: L0 */
    public final boolean mo17666L0() {
        return this.f16745g.mo17666L0();
    }

    /* renamed from: M */
    public final C2955n mo17667M() {
        return this.f16745g.mo17667M();
    }

    /* renamed from: M0 */
    public final void mo17668M0(int i) {
        this.f16745g.mo17668M0(i);
    }

    /* renamed from: N */
    public final boolean mo17669N() {
        return this.f16745g.mo17669N();
    }

    /* renamed from: N0 */
    public final sn0 mo17230N0() {
        return this.f16746h;
    }

    /* renamed from: O0 */
    public final d93<String> mo17670O0() {
        return this.f16745g.mo17670O0();
    }

    /* renamed from: P */
    public final void mo17671P() {
        TextView textView = new TextView(getContext());
        C2971s.m13214q();
        textView.setText(C2979b2.m13251d());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: P0 */
    public final eq0 mo17231P0(String str) {
        return this.f16745g.mo17231P0(str);
    }

    /* renamed from: Q */
    public final boolean mo17672Q() {
        return this.f16745g.mo17672Q();
    }

    /* renamed from: Q0 */
    public final et0 mo17673Q0() {
        return ((js0) this.f16745g).mo18713f1();
    }

    /* renamed from: R */
    public final void mo17232R() {
        this.f16745g.mo17232R();
    }

    /* renamed from: R0 */
    public final void mo17674R0(Context context) {
        this.f16745g.mo17674R0(context);
    }

    /* renamed from: S */
    public final void mo17675S(boolean z) {
        this.f16745g.mo17675S(z);
    }

    /* renamed from: S0 */
    public final void mo17676S0() {
        pr0 pr0 = this.f16745g;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C2971s.m13216s().mo11032e()));
        hashMap.put("app_volume", String.valueOf(C2971s.m13216s().mo11029a()));
        js0 js0 = (js0) pr0;
        hashMap.put("device_volume", String.valueOf(C2996g.m13346b(js0.getContext())));
        js0.mo16880n0("volume", hashMap);
    }

    /* renamed from: T0 */
    public final void mo17677T0(boolean z) {
        this.f16745g.mo17677T0(z);
    }

    /* renamed from: U */
    public final e20 mo17678U() {
        return this.f16745g.mo17678U();
    }

    /* renamed from: U0 */
    public final boolean mo17679U0(boolean z, int i) {
        if (!this.f16747i.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22633u0)).booleanValue()) {
            return false;
        }
        if (this.f16745g.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f16745g.getParent()).removeView((View) this.f16745g);
        }
        this.f16745g.mo17679U0(z, i);
        return true;
    }

    /* renamed from: V0 */
    public final void mo17680V0(C4863a aVar) {
        this.f16745g.mo17680V0(aVar);
    }

    /* renamed from: W */
    public final void mo17233W(int i) {
        this.f16745g.mo17233W(i);
    }

    /* renamed from: W0 */
    public final void mo17681W0(boolean z, int i, String str, String str2, boolean z2) {
        this.f16745g.mo17681W0(z, i, str, str2, z2);
    }

    /* renamed from: Z */
    public final View mo15939Z() {
        return this;
    }

    /* renamed from: Z0 */
    public final void mo17682Z0(e20 e20) {
        this.f16745g.mo17682Z0(e20);
    }

    /* renamed from: a */
    public final void mo17508a(String str, String str2) {
        this.f16745g.mo17508a("window.inspectorInfo", str2);
    }

    /* renamed from: b0 */
    public final void mo17234b0(int i) {
        this.f16746h.mo20887f(i);
    }

    /* renamed from: b1 */
    public final void mo10854b1() {
        this.f16745g.mo10854b1();
    }

    /* renamed from: c */
    public final int mo17235c() {
        return this.f16745g.mo17235c();
    }

    /* renamed from: c0 */
    public final boolean mo17683c0() {
        return this.f16745g.mo17683c0();
    }

    /* renamed from: c1 */
    public final void mo17684c1(String str, JSONObject jSONObject) {
        ((js0) this.f16745g).mo17508a(str, jSONObject.toString());
    }

    public final boolean canGoBack() {
        return this.f16745g.canGoBack();
    }

    /* renamed from: d */
    public final int mo17236d() {
        return this.f16745g.mo17236d();
    }

    /* renamed from: d0 */
    public final void mo17686d0(String str, y50<? super pr0> y50) {
        this.f16745g.mo17686d0(str, y50);
    }

    public final void destroy() {
        C4863a F0 = mo17658F0();
        if (F0 != null) {
            w03 w03 = C2979b2.f9980i;
            w03.post(new es0(F0));
            pr0 pr0 = this.f16745g;
            pr0.getClass();
            w03.postDelayed(new ds0(pr0), (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22532h3)).intValue());
            return;
        }
        this.f16745g.destroy();
    }

    /* renamed from: e */
    public final int mo17237e() {
        return this.f16745g.mo17237e();
    }

    /* renamed from: e0 */
    public final void mo17688e0(String str, y50<? super pr0> y50) {
        this.f16745g.mo17688e0(str, y50);
    }

    /* renamed from: f0 */
    public final void mo17689f0() {
        this.f16745g.mo17689f0();
    }

    /* renamed from: g */
    public final int mo17238g() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22539i2)).booleanValue()) {
            return this.f16745g.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    /* renamed from: g0 */
    public final void mo17690g0(int i) {
        this.f16745g.mo17690g0(i);
    }

    public final void goBack() {
        this.f16745g.goBack();
    }

    /* renamed from: h */
    public final int mo17240h() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22539i2)).booleanValue()) {
            return this.f16745g.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    /* renamed from: h0 */
    public final boolean mo17692h0() {
        return this.f16745g.mo17692h0();
    }

    /* renamed from: i */
    public final Activity mo17241i() {
        return this.f16745g.mo17241i();
    }

    /* renamed from: i0 */
    public final void mo17693i0() {
        this.f16745g.mo17693i0();
    }

    /* renamed from: j0 */
    public final String mo17694j0() {
        return this.f16745g.mo17694j0();
    }

    /* renamed from: k */
    public final c00 mo17242k() {
        return this.f16745g.mo17242k();
    }

    /* renamed from: k0 */
    public final void mo17243k0(int i) {
        this.f16745g.mo17243k0(i);
    }

    /* renamed from: l */
    public final d00 mo17244l() {
        return this.f16745g.mo17244l();
    }

    /* renamed from: l0 */
    public final void mo17695l0(boolean z, int i, String str, boolean z2) {
        this.f16745g.mo17695l0(z, i, str, z2);
    }

    public final void loadData(String str, String str2, String str3) {
        this.f16745g.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f16745g.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.f16745g.loadUrl(str);
    }

    /* renamed from: m */
    public final C2925a mo17245m() {
        return this.f16745g.mo17245m();
    }

    /* renamed from: m0 */
    public final void mo17699m0(boolean z) {
        this.f16745g.mo17699m0(z);
    }

    /* renamed from: n */
    public final String mo17246n() {
        return this.f16745g.mo17246n();
    }

    /* renamed from: n0 */
    public final void mo16880n0(String str, Map<String, ?> map) {
        this.f16745g.mo16880n0(str, map);
    }

    /* renamed from: o */
    public final void mo15729o() {
        pr0 pr0 = this.f16745g;
        if (pr0 != null) {
            pr0.mo15729o();
        }
    }

    /* renamed from: o0 */
    public final void mo17700o0(c20 c20) {
        this.f16745g.mo17700o0(c20);
    }

    public final void onPause() {
        this.f16746h.mo20886e();
        this.f16745g.onPause();
    }

    public final void onResume() {
        this.f16745g.onResume();
    }

    /* renamed from: p */
    public final void mo17509p(String str) {
        ((js0) this.f16745g).mo18717k1(str);
    }

    /* renamed from: p0 */
    public final void mo17703p0(String str, C3370o<y50<? super pr0>> oVar) {
        this.f16745g.mo17703p0(str, oVar);
    }

    /* renamed from: q */
    public final C2955n mo17704q() {
        return this.f16745g.mo17704q();
    }

    /* renamed from: q0 */
    public final boolean mo17705q0() {
        return this.f16747i.get();
    }

    /* renamed from: r */
    public final void mo16881r(String str, JSONObject jSONObject) {
        this.f16745g.mo16881r(str, jSONObject);
    }

    /* renamed from: r0 */
    public final void mo17706r0(boolean z) {
        this.f16745g.mo17706r0(z);
    }

    /* renamed from: s */
    public final WebViewClient mo17707s() {
        return this.f16745g.mo17707s();
    }

    /* renamed from: s0 */
    public final void mo17708s0() {
        setBackgroundColor(0);
        this.f16745g.setBackgroundColor(0);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f16745g.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f16745g.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f16745g.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f16745g.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public final void mo17248t(ms0 ms0) {
        this.f16745g.mo17248t(ms0);
    }

    /* renamed from: t0 */
    public final void mo17249t0(int i) {
        this.f16745g.mo17249t0(i);
    }

    /* renamed from: u */
    public final String mo17250u() {
        return this.f16745g.mo17250u();
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        pr0 pr0 = this.f16745g;
        if (pr0 != null) {
            pr0.mo10632u0();
        }
    }

    /* renamed from: v0 */
    public final void mo17713v0(C2955n nVar) {
        this.f16745g.mo17713v0(nVar);
    }

    /* renamed from: w */
    public final bp2 mo17714w() {
        return this.f16745g.mo17714w();
    }

    /* renamed from: w0 */
    public final void mo17715w0(String str, String str2, String str3) {
        this.f16745g.mo17715w0(str, str2, (String) null);
    }

    /* renamed from: x */
    public final void mo17251x() {
        this.f16745g.mo17251x();
    }

    /* renamed from: x0 */
    public final void mo17716x0() {
        this.f16745g.mo17716x0();
    }

    /* renamed from: y */
    public final gt0 mo17717y() {
        return this.f16745g.mo17717y();
    }

    /* renamed from: y0 */
    public final void mo17718y0(C3041u0 u0Var, y12 y12, gt1 gt1, gu2 gu2, String str, String str2, int i) {
        this.f16745g.mo17718y0(u0Var, y12, gt1, gu2, str, str2, i);
    }

    /* renamed from: z0 */
    public final void mo17719z0(boolean z) {
        this.f16745g.mo17719z0(z);
    }

    public final zzcjf zzp() {
        return this.f16745g.zzp();
    }

    public final ms0 zzs() {
        return this.f16745g.zzs();
    }
}
