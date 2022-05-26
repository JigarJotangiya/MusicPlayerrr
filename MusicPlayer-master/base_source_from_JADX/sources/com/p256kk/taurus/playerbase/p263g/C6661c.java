package com.p256kk.taurus.playerbase.p263g;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.g.c */
/* compiled from: BaseLevelCoverContainer */
public abstract class C6661c extends C6659a {
    public C6661c(Context context) {
        super(context);
        mo25986n(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public ViewGroup mo25967f() {
        FrameLayout frameLayout = new FrameLayout(this.f30055a);
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo25969h(C6660b bVar) {
        C6640b.m38216a("base_cover_container", "on available cover add : now count = " + mo25966e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25970i(C6660b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo25971j(C6660b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo25972k(C6660b bVar) {
        C6640b.m38216a("base_cover_container", "on cover remove : now count = " + mo25966e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo25973l() {
        C6640b.m38216a("base_cover_container", "on covers remove all ...");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo25985m(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        if (mo25965d() != null) {
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            mo25965d().addView(viewGroup, layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo25986n(Context context);
}
