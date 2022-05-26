package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ol1 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: g */
    public final /* synthetic */ View f21030g;

    /* renamed from: h */
    public final /* synthetic */ pr0 f21031h;

    /* renamed from: i */
    public final /* synthetic */ String f21032i;

    /* renamed from: j */
    public final /* synthetic */ WindowManager.LayoutParams f21033j;

    /* renamed from: k */
    public final /* synthetic */ int f21034k;

    /* renamed from: l */
    public final /* synthetic */ WindowManager f21035l;

    public /* synthetic */ ol1(View view, pr0 pr0, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f21030g = view;
        this.f21031h = pr0;
        this.f21032i = str;
        this.f21033j = layoutParams;
        this.f21034k = i;
        this.f21035l = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f21030g;
        pr0 pr0 = this.f21031h;
        String str = this.f21032i;
        WindowManager.LayoutParams layoutParams = this.f21033j;
        int i = this.f21034k;
        WindowManager windowManager = this.f21035l;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && pr0.mo15939Z().getWindowToken() != null) {
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(pr0.mo15939Z(), layoutParams);
        }
    }
}
