package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.overlay.C2955n;
import com.google.android.gms.common.util.C3370o;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public interface pr0 extends C5497qt, yf1, gr0, d80, ns0, rs0, p80, C5824zm, vs0, C2935k, ys0, zs0, eo0, at0 {
    /* renamed from: A */
    void mo17227A(String str, eq0 eq0);

    /* renamed from: B */
    ep2 mo17651B();

    /* renamed from: C */
    Context mo17653C();

    /* renamed from: D */
    void mo17654D(boolean z);

    /* renamed from: E */
    C5381no mo17655E();

    /* renamed from: E0 */
    void mo17656E0(gt0 gt0);

    /* renamed from: F */
    void mo17657F(bp2 bp2, ep2 ep2);

    /* renamed from: F0 */
    C4863a mo17658F0();

    /* renamed from: G */
    void mo17659G(C5381no noVar);

    /* renamed from: H */
    void mo17660H();

    /* renamed from: I */
    void mo17661I(C2955n nVar);

    /* renamed from: J */
    C5737xa mo17662J();

    /* renamed from: J0 */
    void mo17663J0();

    /* renamed from: K */
    WebView mo17664K();

    /* renamed from: L0 */
    boolean mo17666L0();

    /* renamed from: M */
    C2955n mo17667M();

    /* renamed from: M0 */
    void mo17668M0(int i);

    /* renamed from: N */
    boolean mo17669N();

    /* renamed from: O0 */
    d93<String> mo17670O0();

    /* renamed from: P */
    void mo17671P();

    /* renamed from: Q */
    boolean mo17672Q();

    /* renamed from: Q0 */
    et0 mo17673Q0();

    /* renamed from: R0 */
    void mo17674R0(Context context);

    /* renamed from: S */
    void mo17675S(boolean z);

    /* renamed from: S0 */
    void mo17676S0();

    /* renamed from: T0 */
    void mo17677T0(boolean z);

    /* renamed from: U */
    e20 mo17678U();

    /* renamed from: U0 */
    boolean mo17679U0(boolean z, int i);

    /* renamed from: V0 */
    void mo17680V0(C4863a aVar);

    /* renamed from: Z */
    View mo15939Z();

    /* renamed from: Z0 */
    void mo17682Z0(e20 e20);

    /* renamed from: c0 */
    boolean mo17683c0();

    boolean canGoBack();

    /* renamed from: d0 */
    void mo17686d0(String str, y50<? super pr0> y50);

    void destroy();

    /* renamed from: e0 */
    void mo17688e0(String str, y50<? super pr0> y50);

    /* renamed from: f0 */
    void mo17689f0();

    /* renamed from: g0 */
    void mo17690g0(int i);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* renamed from: h0 */
    boolean mo17692h0();

    /* renamed from: i */
    Activity mo17241i();

    /* renamed from: i0 */
    void mo17693i0();

    /* renamed from: j0 */
    String mo17694j0();

    /* renamed from: l */
    d00 mo17244l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    C2925a mo17245m();

    /* renamed from: m0 */
    void mo17699m0(boolean z);

    void measure(int i, int i2);

    /* renamed from: o0 */
    void mo17700o0(c20 c20);

    void onPause();

    void onResume();

    /* renamed from: p0 */
    void mo17703p0(String str, C3370o<y50<? super pr0>> oVar);

    /* renamed from: q */
    C2955n mo17704q();

    /* renamed from: q0 */
    boolean mo17705q0();

    /* renamed from: r0 */
    void mo17706r0(boolean z);

    /* renamed from: s */
    WebViewClient mo17707s();

    /* renamed from: s0 */
    void mo17708s0();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t */
    void mo17248t(ms0 ms0);

    /* renamed from: v0 */
    void mo17713v0(C2955n nVar);

    /* renamed from: w */
    bp2 mo17714w();

    /* renamed from: w0 */
    void mo17715w0(String str, String str2, String str3);

    /* renamed from: x0 */
    void mo17716x0();

    /* renamed from: y */
    gt0 mo17717y();

    /* renamed from: z0 */
    void mo17719z0(boolean z);

    zzcjf zzp();

    ms0 zzs();
}
