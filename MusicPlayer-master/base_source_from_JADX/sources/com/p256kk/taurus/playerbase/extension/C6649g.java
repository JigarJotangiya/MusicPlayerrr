package com.p256kk.taurus.playerbase.extension;

import android.os.Bundle;
import com.p256kk.taurus.playerbase.p263g.C6676n;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.kk.taurus.playerbase.extension.g */
/* compiled from: ProducerGroup */
public final class C6649g implements C6647e {

    /* renamed from: a */
    private C6656h f30043a;

    /* renamed from: b */
    private C6676n f30044b;

    /* renamed from: c */
    private List<C6643a> f30045c;

    /* renamed from: d */
    private C6645c f30046d = new C6650a();

    /* renamed from: com.kk.taurus.playerbase.extension.g$a */
    /* compiled from: ProducerGroup */
    class C6650a implements C6645c {

        /* renamed from: com.kk.taurus.playerbase.extension.g$a$a */
        /* compiled from: ProducerGroup */
        class C6651a implements C6655c {

            /* renamed from: a */
            final /* synthetic */ int f30048a;

            /* renamed from: b */
            final /* synthetic */ Bundle f30049b;

            C6651a(C6650a aVar, int i, Bundle bundle) {
                this.f30048a = i;
                this.f30049b = bundle;
            }

            /* renamed from: a */
            public void mo25957a(C6643a aVar) {
                if (aVar.mo25944e() != null) {
                    aVar.mo25944e().mo25948b(this.f30048a, this.f30049b);
                }
            }
        }

        /* renamed from: com.kk.taurus.playerbase.extension.g$a$b */
        /* compiled from: ProducerGroup */
        class C6652b implements C6655c {

            /* renamed from: a */
            final /* synthetic */ int f30050a;

            /* renamed from: b */
            final /* synthetic */ Bundle f30051b;

            C6652b(C6650a aVar, int i, Bundle bundle) {
                this.f30050a = i;
                this.f30051b = bundle;
            }

            /* renamed from: a */
            public void mo25957a(C6643a aVar) {
                if (aVar.mo25944e() != null) {
                    aVar.mo25944e().mo25947a(this.f30050a, this.f30051b);
                }
            }
        }

        /* renamed from: com.kk.taurus.playerbase.extension.g$a$c */
        /* compiled from: ProducerGroup */
        class C6653c implements C6655c {

            /* renamed from: a */
            final /* synthetic */ int f30052a;

            /* renamed from: b */
            final /* synthetic */ Bundle f30053b;

            C6653c(C6650a aVar, int i, Bundle bundle) {
                this.f30052a = i;
                this.f30053b = bundle;
            }

            /* renamed from: a */
            public void mo25957a(C6643a aVar) {
                if (aVar.mo25944e() != null) {
                    aVar.mo25944e().mo25949d(this.f30052a, this.f30053b);
                }
            }
        }

        C6650a() {
        }

        /* renamed from: a */
        public void mo25947a(int i, Bundle bundle) {
            C6649g.this.m38245b(new C6652b(this, i, bundle));
        }

        /* renamed from: b */
        public void mo25948b(int i, Bundle bundle) {
            C6649g.this.m38245b(new C6651a(this, i, bundle));
        }

        /* renamed from: d */
        public void mo25949d(int i, Bundle bundle) {
            C6649g.this.m38245b(new C6653c(this, i, bundle));
        }
    }

    /* renamed from: com.kk.taurus.playerbase.extension.g$b */
    /* compiled from: ProducerGroup */
    class C6654b implements C6655c {

        /* renamed from: a */
        final /* synthetic */ C6676n f30054a;

        C6654b(C6649g gVar, C6676n nVar) {
            this.f30054a = nVar;
        }

        /* renamed from: a */
        public void mo25957a(C6643a aVar) {
            aVar.mo25943d(this.f30054a);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.extension.g$c */
    /* compiled from: ProducerGroup */
    interface C6655c {
        /* renamed from: a */
        void mo25957a(C6643a aVar);
    }

    public C6649g(C6656h hVar) {
        this.f30043a = hVar;
        this.f30045c = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m38245b(C6655c cVar) {
        for (C6643a a : this.f30045c) {
            cVar.mo25957a(a);
        }
    }

    public void destroy() {
        for (C6643a next : this.f30045c) {
            next.mo25936b();
            next.destroy();
            next.mo25942c((C6656h) null);
            next.mo25943d((C6676n) null);
        }
        this.f30045c.clear();
    }

    /* renamed from: f */
    public void mo25951f(C6676n nVar) {
        this.f30044b = nVar;
        m38245b(new C6654b(this, nVar));
    }

    /* renamed from: g */
    public void mo25952g(C6643a aVar) {
        if (!this.f30045c.contains(aVar)) {
            aVar.mo25942c(this.f30043a);
            aVar.mo25943d(this.f30044b);
            this.f30045c.add(aVar);
            aVar.mo25935a();
        }
    }

    /* renamed from: h */
    public C6645c mo25953h() {
        return this.f30046d;
    }
}
