package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.util.C3056z0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ul1 {

    /* renamed from: a */
    private final oq1 f24363a;

    /* renamed from: b */
    private final bp1 f24364b;

    /* renamed from: c */
    private ViewTreeObserver.OnScrollChangedListener f24365c = null;

    public ul1(oq1 oq1, bp1 bp1) {
        this.f24363a = oq1;
        this.f24364b = bp1;
    }

    /* renamed from: f */
    private static final int m31866f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C4980cv.m22123b();
        return nl0.m27927s(context, i);
    }

    /* renamed from: a */
    public final View mo21307a(View view, WindowManager windowManager) throws bs0 {
        pr0 a = this.f24363a.mo20090a(zzbfi.m34950n0(), (bp2) null, (ep2) null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.mo17686d0("/sendMessageToSdk", new pl1(this));
        a.mo17686d0("/hideValidatorOverlay", new rl1(this, windowManager, view));
        a.mo17686d0("/open", new k60((C2926b) null, (wd0) null, (y12) null, (gt1) null, (gu2) null));
        this.f24364b.mo16356j(new WeakReference(a), "/loadNativeAdPolicyViolations", new ql1(this, view, windowManager));
        this.f24364b.mo16356j(new WeakReference(a), "/showValidatorOverlay", sl1.f23533a);
        return view2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo21308b(pr0 pr0, Map map) {
        this.f24364b.mo16353g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo21309c(WindowManager windowManager, View view, pr0 pr0, Map map) {
        ul0.m31857b("Hide native ad policy validator overlay.");
        pr0.mo15939Z().setVisibility(8);
        if (pr0.mo15939Z().getWindowToken() != null) {
            windowManager.removeView(pr0.mo15939Z());
        }
        pr0.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f24365c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f24365c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo21310d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f24364b.mo16353g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo21311e(View view, WindowManager windowManager, pr0 pr0, Map map) {
        int i;
        pr0.mo17673Q0().mo17300d1(new tl1(this, map));
        if (map != null) {
            Context context = view.getContext();
            int f = m31866f(context, (String) map.get("validator_width"), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22550j5)).intValue());
            int f2 = m31866f(context, (String) map.get("validator_height"), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22558k5)).intValue());
            int f3 = m31866f(context, (String) map.get("validator_x"), 0);
            int f4 = m31866f(context, (String) map.get("validator_y"), 0);
            pr0.mo17656E0(gt0.m24493b(f, f2));
            try {
                pr0.mo17664K().getSettings().setUseWideViewPort(((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22566l5)).booleanValue());
                pr0.mo17664K().getSettings().setLoadWithOverviewMode(((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22574m5)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams b = C3056z0.m13516b();
            b.x = f3;
            b.y = f4;
            windowManager.updateViewLayout(pr0.mo15939Z(), b);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.f24365c = new ol1(view, pr0, str, b, i - f4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f24365c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                pr0.loadUrl(str2);
            }
        }
    }
}
