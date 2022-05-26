package com.p256kk.taurus.playerbase.p257a;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p256kk.taurus.playerbase.AVPlayer;
import com.p256kk.taurus.playerbase.extension.NetworkEventProducer;
import com.p256kk.taurus.playerbase.p258b.C6615b;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6637d;
import com.p256kk.taurus.playerbase.p260d.C6638e;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p263g.C6673k;
import com.p256kk.taurus.playerbase.p263g.C6674l;
import com.p256kk.taurus.playerbase.p263g.C6676n;
import com.p256kk.taurus.playerbase.render.C6722a;
import com.p256kk.taurus.playerbase.render.C6723b;
import com.p256kk.taurus.playerbase.render.RenderSurfaceView;
import com.p256kk.taurus.playerbase.render.RenderTextureView;
import com.p256kk.taurus.playerbase.widget.C6734a;

/* renamed from: com.kk.taurus.playerbase.a.f */
/* compiled from: RelationAssist */
public final class C6607f implements C6602a {

    /* renamed from: a */
    private Context f29968a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AVPlayer f29969b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6734a f29970c;

    /* renamed from: d */
    private C6668j f29971d;

    /* renamed from: e */
    private int f29972e;

    /* renamed from: f */
    private boolean f29973f;

    /* renamed from: g */
    private C6723b f29974g;

    /* renamed from: h */
    private C6722a f29975h;

    /* renamed from: i */
    private int f29976i;

    /* renamed from: j */
    private int f29977j;

    /* renamed from: k */
    private int f29978k;

    /* renamed from: l */
    private int f29979l;

    /* renamed from: m */
    private int f29980m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C6723b.C6725b f29981n;

    /* renamed from: o */
    private C6618a f29982o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f29983p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C6638e f29984q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C6637d f29985r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6673k f29986s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C6604c f29987t;

    /* renamed from: u */
    private C6676n f29988u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C6674l f29989v;

    /* renamed from: w */
    private C6638e f29990w;

    /* renamed from: x */
    private C6637d f29991x;

    /* renamed from: y */
    private C6673k f29992y;

    /* renamed from: z */
    private C6723b.C6724a f29993z;

    /* renamed from: com.kk.taurus.playerbase.a.f$a */
    /* compiled from: RelationAssist */
    class C6608a implements C6676n {
        C6608a() {
        }

        /* renamed from: r */
        public C6674l mo25879r() {
            return C6607f.this.f29989v;
        }
    }

    /* renamed from: com.kk.taurus.playerbase.a.f$b */
    /* compiled from: RelationAssist */
    class C6609b implements C6674l {
        C6609b() {
        }

        /* renamed from: a */
        public int mo25880a() {
            return C6607f.this.f29969b.getCurrentPosition();
        }

        /* renamed from: b */
        public int mo25881b() {
            return C6607f.this.f29969b.getDuration();
        }

        /* renamed from: c */
        public boolean mo25882c() {
            return C6607f.this.f29983p;
        }

        public int getState() {
            return C6607f.this.f29969b.getState();
        }
    }

    /* renamed from: com.kk.taurus.playerbase.a.f$c */
    /* compiled from: RelationAssist */
    class C6610c implements C6638e {
        C6610c() {
        }

        /* renamed from: b */
        public void mo10238b(int i, Bundle bundle) {
            C6607f.this.m38096J(i, bundle);
            if (C6607f.this.f29984q != null) {
                C6607f.this.f29984q.mo10238b(i, bundle);
            }
            C6607f.this.f29970c.mo26192k(i, bundle);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.a.f$d */
    /* compiled from: RelationAssist */
    class C6611d implements C6637d {
        C6611d() {
        }

        /* renamed from: a */
        public void mo25832a(int i, Bundle bundle) {
            C6607f.this.m38095I(i, bundle);
            if (C6607f.this.f29985r != null) {
                C6607f.this.f29985r.mo25832a(i, bundle);
            }
            C6607f.this.f29970c.mo26191j(i, bundle);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.a.f$e */
    /* compiled from: RelationAssist */
    class C6612e implements C6673k {
        C6612e() {
        }

        /* renamed from: d */
        public void mo10237d(int i, Bundle bundle) {
            if (i == -66015) {
                C6607f.this.f29969b.setUseTimerProxy(true);
            } else if (i == -66016) {
                C6607f.this.f29969b.setUseTimerProxy(false);
            }
            if (C6607f.this.f29987t != null) {
                C6607f.this.f29987t.mo25843i(C6607f.this, i, bundle);
            }
            if (C6607f.this.f29986s != null) {
                C6607f.this.f29986s.mo10237d(i, bundle);
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.a.f$f */
    /* compiled from: RelationAssist */
    class C6613f implements C6723b.C6724a {
        C6613f() {
        }

        /* renamed from: a */
        public void mo25884a(C6723b.C6725b bVar) {
            C6640b.m38216a("RelationAssist", "onSurfaceDestroy...");
            C6723b.C6725b unused = C6607f.this.f29981n = null;
        }

        /* renamed from: b */
        public void mo25885b(C6723b.C6725b bVar, int i, int i2, int i3) {
        }

        /* renamed from: c */
        public void mo25886c(C6723b.C6725b bVar, int i, int i2) {
            C6640b.m38216a("RelationAssist", "onSurfaceCreated : width = " + i + ", height = " + i2);
            C6723b.C6725b unused = C6607f.this.f29981n = bVar;
            C6607f fVar = C6607f.this;
            fVar.m38116v(fVar.f29981n);
        }
    }

    public C6607f(Context context) {
        this(context, (C6734a) null);
    }

    /* renamed from: G */
    private boolean m38094G() {
        C6723b bVar = this.f29974g;
        return bVar == null || bVar.mo26122e() || this.f29973f;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m38095I(int i, Bundle bundle) {
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m38096J(int i, Bundle bundle) {
        switch (i) {
            case -99018:
                if (!(bundle == null || this.f29974g == null)) {
                    this.f29976i = bundle.getInt("int_arg1");
                    int i2 = bundle.getInt("int_arg2");
                    this.f29977j = i2;
                    this.f29974g.mo26121d(this.f29976i, i2);
                }
                m38116v(this.f29981n);
                return;
            case -99017:
                if (bundle != null) {
                    this.f29976i = bundle.getInt("int_arg1");
                    this.f29977j = bundle.getInt("int_arg2");
                    this.f29978k = bundle.getInt("int_arg3");
                    this.f29979l = bundle.getInt("int_arg4");
                    C6723b bVar = this.f29974g;
                    if (bVar != null) {
                        bVar.mo26121d(this.f29976i, this.f29977j);
                        this.f29974g.mo26119b(this.f29978k, this.f29979l);
                        return;
                    }
                    return;
                }
                return;
            case -99011:
                this.f29983p = false;
                return;
            case -99010:
                this.f29983p = true;
                return;
            case 99020:
                if (bundle != null) {
                    int i3 = bundle.getInt("int_data");
                    this.f29980m = i3;
                    C6723b bVar2 = this.f29974g;
                    if (bVar2 != null) {
                        bVar2.setVideoRotation(i3);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: K */
    private void m38097K(C6618a aVar) {
        this.f29969b.setDataSource(aVar);
    }

    /* renamed from: L */
    private void m38098L() {
        this.f29969b.start();
    }

    /* renamed from: M */
    private void m38099M(int i) {
        this.f29969b.start(i);
    }

    /* renamed from: O */
    private void m38100O() {
        C6723b bVar = this.f29974g;
        if (bVar != null) {
            bVar.setRenderCallback((C6723b.C6724a) null);
            this.f29974g.mo26118a();
        }
        this.f29974g = null;
    }

    /* renamed from: Y */
    private void m38101Y() {
        if (m38094G()) {
            this.f29973f = false;
            m38100O();
            if (this.f29972e != 1) {
                RenderTextureView renderTextureView = new RenderTextureView(this.f29968a);
                this.f29974g = renderTextureView;
                renderTextureView.setTakeOverSurfaceTexture(true);
            } else {
                this.f29974g = new RenderSurfaceView(this.f29968a);
            }
            this.f29981n = null;
            this.f29969b.setSurface((Surface) null);
            this.f29974g.mo26120c(this.f29975h);
            this.f29974g.setRenderCallback(this.f29993z);
            this.f29974g.mo26121d(this.f29976i, this.f29977j);
            this.f29974g.mo26119b(this.f29978k, this.f29979l);
            this.f29974g.setVideoRotation(this.f29980m);
            this.f29970c.setRenderView(this.f29974g.getRenderView());
        }
    }

    /* renamed from: u */
    private void m38115u() {
        this.f29969b.setOnPlayerEventListener(this.f29990w);
        this.f29969b.setOnErrorEventListener(this.f29991x);
        this.f29970c.setOnReceiverEventListener(this.f29992y);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m38116v(C6723b.C6725b bVar) {
        if (bVar != null) {
            bVar.mo26130a(this.f29969b);
        }
    }

    /* renamed from: x */
    private void m38117x() {
        this.f29969b.setOnPlayerEventListener((C6638e) null);
        this.f29969b.setOnErrorEventListener((C6637d) null);
        this.f29970c.setOnReceiverEventListener((C6673k) null);
    }

    /* renamed from: y */
    private void m38118y() {
        ViewParent parent = this.f29970c.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f29970c);
        }
    }

    /* renamed from: A */
    public int mo25860A() {
        return this.f29969b.getCurrentPosition();
    }

    /* renamed from: B */
    public int mo25861B() {
        return this.f29969b.getDuration();
    }

    /* renamed from: C */
    public C6668j mo25862C() {
        return this.f29971d;
    }

    /* renamed from: D */
    public C6723b mo25863D() {
        return this.f29974g;
    }

    /* renamed from: D0 */
    public void mo25834D0() {
        mo25867N(false);
    }

    /* renamed from: E */
    public int mo25864E() {
        return this.f29969b.getState();
    }

    /* renamed from: F */
    public C6734a mo25865F() {
        return this.f29970c;
    }

    /* renamed from: H */
    public boolean mo25866H() {
        return this.f29969b.isPlaying();
    }

    /* renamed from: N */
    public void mo25867N(boolean z) {
        if (z) {
            m38100O();
            m38101Y();
        }
        C6618a aVar = this.f29982o;
        if (aVar != null) {
            m38097K(aVar);
            m38098L();
        }
    }

    /* renamed from: P */
    public void mo25868P(C6722a aVar) {
        this.f29975h = aVar;
        C6723b bVar = this.f29974g;
        if (bVar != null) {
            bVar.mo26120c(aVar);
        }
    }

    /* renamed from: Q */
    public void mo25835Q() {
        this.f29969b.pause();
    }

    /* renamed from: R */
    public void mo25869R(C6604c cVar) {
        this.f29987t = cVar;
    }

    /* renamed from: S */
    public void mo25870S(boolean z) {
        this.f29969b.setLooping(z);
    }

    /* renamed from: T */
    public void mo25871T(C6637d dVar) {
        this.f29985r = dVar;
    }

    /* renamed from: U */
    public void mo25872U(C6638e eVar) {
        this.f29984q = eVar;
    }

    /* renamed from: V */
    public void mo25873V(C6673k kVar) {
        this.f29986s = kVar;
    }

    /* renamed from: W */
    public void mo25874W(C6668j jVar) {
        this.f29971d = jVar;
    }

    /* renamed from: X */
    public void mo25875X(float f) {
        this.f29969b.setSpeed(f);
    }

    /* renamed from: a */
    public void mo25836a() {
        this.f29969b.reset();
    }

    /* renamed from: b */
    public void mo25837b() {
        this.f29969b.resume();
    }

    /* renamed from: c */
    public void mo25838c(int i) {
        this.f29969b.seekTo(i);
    }

    /* renamed from: d */
    public boolean mo25839d() {
        int E = mo25864E();
        return (E == -2 || E == -1 || E == 0 || E == 1 || E == 5) ? false : true;
    }

    /* renamed from: e */
    public void mo25840e(int i) {
        C6618a aVar = this.f29982o;
        if (aVar != null) {
            m38097K(aVar);
            m38099M(i);
        }
    }

    /* renamed from: f */
    public void mo25841f(C6618a aVar) {
        this.f29982o = aVar;
    }

    public void stop() {
        this.f29969b.stop();
    }

    /* renamed from: t */
    public void mo25876t(ViewGroup viewGroup, boolean z) {
        m38115u();
        m38118y();
        C6668j jVar = this.f29971d;
        if (jVar != null) {
            this.f29970c.setReceiverGroup(jVar);
        }
        if (z || m38094G()) {
            m38100O();
            m38101Y();
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f29970c, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* renamed from: w */
    public void mo25877w() {
        this.f29969b.destroy();
        m38117x();
        this.f29981n = null;
        m38100O();
        this.f29970c.mo26190h();
        m38118y();
        mo25874W((C6668j) null);
    }

    /* renamed from: z */
    public int mo25878z() {
        return this.f29969b.getAudioSessionId();
    }

    public C6607f(Context context, C6734a aVar) {
        this.f29972e = 0;
        this.f29975h = C6722a.AspectRatio_FIT_PARENT;
        this.f29988u = new C6608a();
        this.f29989v = new C6609b();
        this.f29990w = new C6610c();
        this.f29991x = new C6611d();
        this.f29992y = new C6612e();
        this.f29993z = new C6613f();
        this.f29968a = context;
        this.f29969b = new AVPlayer();
        aVar = aVar == null ? new C6734a(context) : aVar;
        if (C6615b.m38164g()) {
            aVar.mo26188f(new NetworkEventProducer(context));
        }
        this.f29970c = aVar;
        aVar.setStateGetter(this.f29988u);
    }
}
