package com.p256kk.taurus.playerbase.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p256kk.taurus.playerbase.extension.C6643a;
import com.p256kk.taurus.playerbase.extension.C6644b;
import com.p256kk.taurus.playerbase.extension.C6647e;
import com.p256kk.taurus.playerbase.extension.C6648f;
import com.p256kk.taurus.playerbase.extension.C6649g;
import com.p256kk.taurus.playerbase.p260d.C6622b;
import com.p256kk.taurus.playerbase.p260d.C6636c;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.p263g.C6660b;
import com.p256kk.taurus.playerbase.p263g.C6663e;
import com.p256kk.taurus.playerbase.p263g.C6664f;
import com.p256kk.taurus.playerbase.p263g.C6666h;
import com.p256kk.taurus.playerbase.p263g.C6667i;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p263g.C6673k;
import com.p256kk.taurus.playerbase.p263g.C6676n;
import com.p256kk.taurus.playerbase.p266j.C6693a;
import com.p256kk.taurus.playerbase.p266j.C6694b;
import com.p256kk.taurus.playerbase.p266j.C6695c;

/* renamed from: com.kk.taurus.playerbase.widget.a */
/* compiled from: SuperContainer */
public class C6734a extends FrameLayout implements C6695c {

    /* renamed from: g */
    private FrameLayout f30147g;

    /* renamed from: h */
    private C6666h f30148h;

    /* renamed from: i */
    private C6668j f30149i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6636c f30150j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6673k f30151k;

    /* renamed from: l */
    private C6694b f30152l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6647e f30153m;

    /* renamed from: n */
    private C6676n f30154n;

    /* renamed from: o */
    private C6644b f30155o = new C6735a();

    /* renamed from: p */
    private C6668j.C6672d f30156p = new C6737c();

    /* renamed from: q */
    private C6673k f30157q = new C6738d();

    /* renamed from: com.kk.taurus.playerbase.widget.a$a */
    /* compiled from: SuperContainer */
    class C6735a implements C6644b {
        C6735a() {
        }

        /* renamed from: a */
        public void mo25946a(String str, Object obj, C6668j.C6671c cVar) {
            if (C6734a.this.f30150j != null) {
                C6734a.this.f30150j.mo25931j(str, obj, cVar);
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.a$b */
    /* compiled from: SuperContainer */
    class C6736b implements C6668j.C6670b {
        C6736b() {
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            C6734a.this.m38504g(iVar);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.a$c */
    /* compiled from: SuperContainer */
    class C6737c implements C6668j.C6672d {
        C6737c() {
        }

        /* renamed from: a */
        public void mo26012a(String str, C6667i iVar) {
            C6734a.this.m38505i(iVar);
        }

        /* renamed from: b */
        public void mo26013b(String str, C6667i iVar) {
            C6734a.this.m38504g(iVar);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.a$d */
    /* compiled from: SuperContainer */
    class C6738d implements C6673k {
        C6738d() {
        }

        /* renamed from: d */
        public void mo10237d(int i, Bundle bundle) {
            if (C6734a.this.f30151k != null) {
                C6734a.this.f30151k.mo10237d(i, bundle);
            }
            if (C6734a.this.f30150j != null) {
                C6734a.this.f30150j.mo25923b(i, bundle);
            }
            C6734a.this.f30153m.mo25953h().mo25949d(i, bundle);
        }
    }

    public C6734a(Context context) {
        super(context);
        m38506m(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m38504g(C6667i iVar) {
        iVar.mo25991q(this.f30157q);
        iVar.mo25989f(this.f30154n);
        if (iVar instanceof C6660b) {
            C6660b bVar = (C6660b) iVar;
            this.f30148h.mo25963b(bVar);
            C6640b.m38216a("SuperContainer", "on cover attach : " + bVar.mo25995y() + " ," + bVar.mo10293D());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m38505i(C6667i iVar) {
        if (iVar instanceof C6660b) {
            C6660b bVar = (C6660b) iVar;
            this.f30148h.mo25962a(bVar);
            C6640b.m38218c("SuperContainer", "on cover detach : " + bVar.mo25995y() + " ," + bVar.mo10293D());
        }
        iVar.mo25991q((C6673k) null);
        iVar.mo25989f((C6676n) null);
    }

    /* renamed from: m */
    private void m38506m(Context context) {
        m38507o(context);
        mo26195p(context);
        m38509r(context);
        m38508q(context);
    }

    /* renamed from: o */
    private void m38507o(Context context) {
        this.f30153m = new C6649g(new C6648f(this.f30155o));
    }

    /* renamed from: q */
    private void m38508q(Context context) {
        C6666h l = mo26193l(context);
        this.f30148h = l;
        addView(l.mo25965d(), new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: r */
    private void m38509r(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30147g = frameLayout;
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: t */
    private void m38510t() {
        FrameLayout frameLayout = this.f30147g;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* renamed from: f */
    public void mo26188f(C6643a aVar) {
        this.f30153m.mo25952g(aVar);
    }

    /* access modifiers changed from: protected */
    public C6693a getGestureCallBackHandler() {
        return new C6693a(this);
    }

    /* renamed from: h */
    public void mo26190h() {
        C6668j jVar = this.f30149i;
        if (jVar != null) {
            jVar.mo26006b(this.f30156p);
        }
        this.f30153m.destroy();
        m38510t();
        mo26196s();
    }

    /* renamed from: j */
    public final void mo26191j(int i, Bundle bundle) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25925d(i, bundle);
        }
        this.f30153m.mo25953h().mo25947a(i, bundle);
    }

    /* renamed from: k */
    public final void mo26192k(int i, Bundle bundle) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25928g(i, bundle);
        }
        this.f30153m.mo25953h().mo25948b(i, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6666h mo26193l(Context context) {
        return new C6664f(context);
    }

    /* renamed from: n */
    public void mo10273n() {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25927f();
        }
    }

    public void onDoubleTap(MotionEvent motionEvent) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25922a(motionEvent);
        }
    }

    public void onDown(MotionEvent motionEvent) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25924c(motionEvent);
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25926e(motionEvent);
        }
    }

    public void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25929h(motionEvent, motionEvent2, f, f2);
        }
    }

    public void onSingleTapConfirmed(MotionEvent motionEvent) {
        C6636c cVar = this.f30150j;
        if (cVar != null) {
            cVar.mo25930i(motionEvent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f30152l.mo26056b(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo26195p(Context context) {
        this.f30152l = new C6694b(context, getGestureCallBackHandler());
        setGestureEnable(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26196s() {
        this.f30148h.mo25964c();
        C6640b.m38216a("SuperContainer", "detach all covers");
    }

    public void setGestureEnable(boolean z) {
        this.f30152l.mo26057c(z);
    }

    public void setGestureScrollEnable(boolean z) {
        this.f30152l.mo26058d(z);
    }

    public void setOnReceiverEventListener(C6673k kVar) {
        this.f30151k = kVar;
    }

    public final void setReceiverGroup(C6668j jVar) {
        if (jVar != null && !jVar.equals(this.f30149i)) {
            mo26196s();
            C6668j jVar2 = this.f30149i;
            if (jVar2 != null) {
                jVar2.mo26006b(this.f30156p);
            }
            this.f30149i = jVar;
            this.f30150j = new C6622b(jVar);
            jVar.sort(new C6663e());
            this.f30149i.mo26010f(new C6736b());
            this.f30149i.mo26008d(this.f30156p);
        }
    }

    public final void setRenderView(View view) {
        m38510t();
        this.f30147g.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void setStateGetter(C6676n nVar) {
        this.f30154n = nVar;
        this.f30153m.mo25951f(nVar);
    }
}
