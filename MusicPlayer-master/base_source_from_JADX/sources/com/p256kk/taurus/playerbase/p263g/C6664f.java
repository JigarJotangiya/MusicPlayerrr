package com.p256kk.taurus.playerbase.p263g;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.g.f */
/* compiled from: DefaultLevelCoverContainer */
public class C6664f extends C6661c {

    /* renamed from: d */
    private FrameLayout f30063d;

    /* renamed from: e */
    private FrameLayout f30064e;

    /* renamed from: f */
    private FrameLayout f30065f;

    public C6664f(Context context) {
        super(context);
    }

    /* renamed from: o */
    private ViewGroup.LayoutParams m38309o() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo25969h(C6660b bVar) {
        super.mo25969h(bVar);
        int D = bVar.mo10293D();
        if (D < 32) {
            this.f30063d.addView(bVar.mo25975E(), m38309o());
            C6640b.m38216a("DefaultLevelCoverContainer", "Low Level Cover Add : level = " + D);
        } else if (D < 64) {
            this.f30064e.addView(bVar.mo25975E(), m38309o());
            C6640b.m38216a("DefaultLevelCoverContainer", "Medium Level Cover Add : level = " + D);
        } else {
            this.f30065f.addView(bVar.mo25975E(), m38309o());
            C6640b.m38216a("DefaultLevelCoverContainer", "High Level Cover Add : level = " + D);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25970i(C6660b bVar) {
        super.mo25970i(bVar);
        this.f30063d.removeView(bVar.mo25975E());
        this.f30064e.removeView(bVar.mo25975E());
        this.f30065f.removeView(bVar.mo25975E());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo25973l() {
        super.mo25973l();
        this.f30063d.removeAllViews();
        this.f30064e.removeAllViews();
        this.f30065f.removeAllViews();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo25986n(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30063d = frameLayout;
        frameLayout.setBackgroundColor(0);
        mo25985m(this.f30063d, (ViewGroup.LayoutParams) null);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30064e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        mo25985m(this.f30064e, (ViewGroup.LayoutParams) null);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30065f = frameLayout3;
        frameLayout3.setBackgroundColor(0);
        mo25985m(this.f30065f, (ViewGroup.LayoutParams) null);
    }
}
