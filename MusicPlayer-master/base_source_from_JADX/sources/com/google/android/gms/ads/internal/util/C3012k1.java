package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.um0;

/* renamed from: com.google.android.gms.ads.internal.util.k1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3012k1 {

    /* renamed from: a */
    private final View f10035a;

    /* renamed from: b */
    private Activity f10036b;

    /* renamed from: c */
    private boolean f10037c;

    /* renamed from: d */
    private boolean f10038d;

    /* renamed from: e */
    private boolean f10039e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f10040f;

    public C3012k1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f10036b = activity;
        this.f10035a = view;
        this.f10040f = onGlobalLayoutListener;
    }

    /* renamed from: f */
    private static ViewTreeObserver m13374f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: g */
    private final void m13375g() {
        if (!this.f10037c) {
            Activity activity = this.f10036b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10040f;
                ViewTreeObserver f = m13374f(activity);
                if (f != null) {
                    f.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            C2971s.m13222y();
            um0.m31897a(this.f10035a, this.f10040f);
            this.f10037c = true;
        }
    }

    /* renamed from: h */
    private final void m13376h() {
        Activity activity = this.f10036b;
        if (activity != null && this.f10037c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10040f;
            ViewTreeObserver f = m13374f(activity);
            if (f != null) {
                C2971s.m13215r();
                f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f10037c = false;
        }
    }

    /* renamed from: a */
    public final void mo11048a() {
        this.f10039e = false;
        m13376h();
    }

    /* renamed from: b */
    public final void mo11049b() {
        this.f10039e = true;
        if (this.f10038d) {
            m13375g();
        }
    }

    /* renamed from: c */
    public final void mo11050c() {
        this.f10038d = true;
        if (this.f10039e) {
            m13375g();
        }
    }

    /* renamed from: d */
    public final void mo11051d() {
        this.f10038d = false;
        m13376h();
    }

    /* renamed from: e */
    public final void mo11052e(Activity activity) {
        this.f10036b = activity;
    }
}
