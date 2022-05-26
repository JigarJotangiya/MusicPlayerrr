package com.p256kk.taurus.playerbase.p260d;

import android.os.Bundle;
import android.view.MotionEvent;
import com.p256kk.taurus.playerbase.p263g.C6667i;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p266j.C6695c;
import com.p256kk.taurus.playerbase.p266j.C6696d;
import com.p256kk.taurus.playerbase.player.C6712d;

/* renamed from: com.kk.taurus.playerbase.d.b */
/* compiled from: EventDispatcher */
public final class C6622b implements C6636c {

    /* renamed from: a */
    private C6668j f30011a;

    /* renamed from: com.kk.taurus.playerbase.d.b$a */
    /* compiled from: EventDispatcher */
    class C6623a implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ MotionEvent f30012a;

        C6623a(C6622b bVar, MotionEvent motionEvent) {
            this.f30012a = motionEvent;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            ((C6695c) iVar).onDown(this.f30012a);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$b */
    /* compiled from: EventDispatcher */
    class C6624b implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ MotionEvent f30013a;

        /* renamed from: b */
        final /* synthetic */ MotionEvent f30014b;

        /* renamed from: c */
        final /* synthetic */ float f30015c;

        /* renamed from: d */
        final /* synthetic */ float f30016d;

        C6624b(C6622b bVar, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.f30013a = motionEvent;
            this.f30014b = motionEvent2;
            this.f30015c = f;
            this.f30016d = f2;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            ((C6695c) iVar).onScroll(this.f30013a, this.f30014b, this.f30015c, this.f30016d);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$c */
    /* compiled from: EventDispatcher */
    class C6625c implements C6668j.C6670b {
        C6625c(C6622b bVar) {
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            ((C6695c) iVar).mo10273n();
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$d */
    /* compiled from: EventDispatcher */
    class C6626d implements C6668j.C6671c {
        C6626d(C6622b bVar) {
        }

        /* renamed from: a */
        public boolean mo25934a(C6667i iVar) {
            boolean z = iVar instanceof C6695c;
            boolean z2 = (iVar instanceof C6696d) && ((C6696d) iVar).mo26059a();
            if (!z || z2) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$e */
    /* compiled from: EventDispatcher */
    class C6627e implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ C6668j.C6670b f30017a;

        C6627e(C6622b bVar, C6668j.C6670b bVar2) {
            this.f30017a = bVar2;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            this.f30017a.mo25933a(iVar);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$f */
    /* compiled from: EventDispatcher */
    class C6628f implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ Bundle f30018a;

        /* renamed from: b */
        final /* synthetic */ int f30019b;

        C6628f(C6622b bVar, Bundle bundle, int i) {
            this.f30018a = bundle;
            this.f30019b = i;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            Bundle bundle;
            if ((iVar instanceof C6712d) && (bundle = this.f30018a) != null) {
                ((C6712d) iVar).mo10285u(bundle.getInt("int_arg1"), this.f30018a.getInt("int_arg2"), this.f30018a.getInt("int_arg3"));
            }
            iVar.mo10271b(this.f30019b, this.f30018a);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$g */
    /* compiled from: EventDispatcher */
    class C6629g implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ int f30020a;

        /* renamed from: b */
        final /* synthetic */ Bundle f30021b;

        C6629g(C6622b bVar, int i, Bundle bundle) {
            this.f30020a = i;
            this.f30021b = bundle;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            iVar.mo10271b(this.f30020a, this.f30021b);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$h */
    /* compiled from: EventDispatcher */
    class C6630h implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ int f30022a;

        /* renamed from: b */
        final /* synthetic */ Bundle f30023b;

        C6630h(C6622b bVar, int i, Bundle bundle) {
            this.f30022a = i;
            this.f30023b = bundle;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            iVar.mo10270a(this.f30022a, this.f30023b);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$i */
    /* compiled from: EventDispatcher */
    class C6631i implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ int f30024a;

        /* renamed from: b */
        final /* synthetic */ Bundle f30025b;

        C6631i(C6622b bVar, int i, Bundle bundle) {
            this.f30024a = i;
            this.f30025b = bundle;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            iVar.mo10272d(this.f30024a, this.f30025b);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$j */
    /* compiled from: EventDispatcher */
    class C6632j implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ String f30026a;

        /* renamed from: b */
        final /* synthetic */ Object f30027b;

        C6632j(C6622b bVar, String str, Object obj) {
            this.f30026a = str;
            this.f30027b = obj;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            iVar.mo25990o(this.f30026a, this.f30027b);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$k */
    /* compiled from: EventDispatcher */
    class C6633k implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ MotionEvent f30028a;

        C6633k(C6622b bVar, MotionEvent motionEvent) {
            this.f30028a = motionEvent;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            ((C6695c) iVar).onSingleTapConfirmed(this.f30028a);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$l */
    /* compiled from: EventDispatcher */
    class C6634l implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ MotionEvent f30029a;

        C6634l(C6622b bVar, MotionEvent motionEvent) {
            this.f30029a = motionEvent;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            ((C6695c) iVar).onLongPress(this.f30029a);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.d.b$m */
    /* compiled from: EventDispatcher */
    class C6635m implements C6668j.C6670b {

        /* renamed from: a */
        final /* synthetic */ MotionEvent f30030a;

        C6635m(C6622b bVar, MotionEvent motionEvent) {
            this.f30030a = motionEvent;
        }

        /* renamed from: a */
        public void mo25933a(C6667i iVar) {
            ((C6695c) iVar).onDoubleTap(this.f30030a);
        }
    }

    public C6622b(C6668j jVar) {
        this.f30011a = jVar;
    }

    /* renamed from: l */
    private void m38176l(C6668j.C6670b bVar) {
        this.f30011a.mo26007c(new C6626d(this), new C6627e(this, bVar));
    }

    /* renamed from: m */
    private void m38177m(Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
    }

    /* renamed from: a */
    public void mo25922a(MotionEvent motionEvent) {
        m38176l(new C6635m(this, motionEvent));
    }

    /* renamed from: b */
    public void mo25923b(int i, Bundle bundle) {
        mo25932k(i, bundle, (C6668j.C6671c) null);
    }

    /* renamed from: c */
    public void mo25924c(MotionEvent motionEvent) {
        m38176l(new C6623a(this, motionEvent));
    }

    /* renamed from: d */
    public void mo25925d(int i, Bundle bundle) {
        this.f30011a.mo26010f(new C6630h(this, i, bundle));
        m38177m(bundle);
    }

    /* renamed from: e */
    public void mo25926e(MotionEvent motionEvent) {
        m38176l(new C6634l(this, motionEvent));
    }

    /* renamed from: f */
    public void mo25927f() {
        m38176l(new C6625c(this));
    }

    /* renamed from: g */
    public void mo25928g(int i, Bundle bundle) {
        if (i != -99019) {
            this.f30011a.mo26010f(new C6629g(this, i, bundle));
        } else {
            this.f30011a.mo26010f(new C6628f(this, bundle, i));
        }
        m38177m(bundle);
    }

    /* renamed from: h */
    public void mo25929h(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m38176l(new C6624b(this, motionEvent, motionEvent2, f, f2));
    }

    /* renamed from: i */
    public void mo25930i(MotionEvent motionEvent) {
        m38176l(new C6633k(this, motionEvent));
    }

    /* renamed from: j */
    public void mo25931j(String str, Object obj, C6668j.C6671c cVar) {
        this.f30011a.mo26007c(cVar, new C6632j(this, str, obj));
    }

    /* renamed from: k */
    public void mo25932k(int i, Bundle bundle, C6668j.C6671c cVar) {
        this.f30011a.mo26007c(cVar, new C6631i(this, i, bundle));
        m38177m(bundle);
    }
}
