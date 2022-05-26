package com.p256kk.taurus.playerbase.p264h;

import androidx.recyclerview.widget.C0885l;
import com.p256kk.taurus.playerbase.p259c.C6618a;

/* renamed from: com.kk.taurus.playerbase.h.d */
/* compiled from: PlayRecordManager */
public class C6680d {

    /* renamed from: a */
    private static C6687h f30075a;

    /* renamed from: b */
    private static C6681a f30076b;

    /* renamed from: com.kk.taurus.playerbase.h.d$a */
    /* compiled from: PlayRecordManager */
    public static class C6681a {

        /* renamed from: a */
        private int f30077a;

        /* renamed from: b */
        private C6678b f30078b;

        /* renamed from: com.kk.taurus.playerbase.h.d$a$a */
        /* compiled from: PlayRecordManager */
        public static class C6682a {

            /* renamed from: a */
            private int f30079a;

            /* renamed from: b */
            private C6687h f30080b;

            /* renamed from: c */
            private C6678b f30081c;

            /* renamed from: a */
            public C6681a mo26027a() {
                return new C6681a(this.f30079a, this.f30080b, this.f30081c);
            }

            /* renamed from: b */
            public C6682a mo26028b(int i) {
                this.f30079a = i;
                return this;
            }

            /* renamed from: c */
            public C6682a mo26029c(C6687h hVar) {
                this.f30080b = hVar;
                return this;
            }
        }

        C6681a(int i, C6687h hVar, C6678b bVar) {
            this.f30077a = i;
            this.f30078b = bVar;
        }

        /* renamed from: a */
        public int mo26025a() {
            return this.f30077a;
        }

        /* renamed from: b */
        public C6678b mo26026b() {
            return this.f30078b;
        }
    }

    /* renamed from: a */
    private static void m38375a() {
        if (f30076b == null) {
            C6681a.C6682a aVar = new C6681a.C6682a();
            aVar.mo26028b(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION);
            aVar.mo26029c(new C6677a());
            f30076b = aVar.mo26027a();
        }
    }

    /* renamed from: b */
    static C6681a m38376b() {
        m38375a();
        return f30076b;
    }

    /* renamed from: c */
    public static String m38377c(C6618a aVar) {
        return m38378d().mo26018a(aVar);
    }

    /* renamed from: d */
    static C6687h m38378d() {
        C6687h hVar = f30075a;
        return hVar == null ? new C6677a() : hVar;
    }
}
