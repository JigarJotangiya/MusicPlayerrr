package androidx.room;

import p369i.p379w.C8509e;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.room.a1 */
/* compiled from: RoomDatabase.kt */
public final class C0924a1 implements C8513g.C8516b {

    /* renamed from: h */
    public static final C0925a f4078h = new C0925a((C8589g) null);

    /* renamed from: g */
    private final C8509e f4079g;

    /* renamed from: androidx.room.a1$a */
    /* compiled from: RoomDatabase.kt */
    public static final class C0925a implements C8513g.C8518c<C0924a1> {
        private C0925a() {
        }

        public /* synthetic */ C0925a(C8589g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C8509e mo5442a() {
        return this.f4079g;
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        C8594l.m46771e(pVar, "operation");
        return C8513g.C8516b.C8517a.m46711a(this, r, pVar);
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        C8594l.m46771e(cVar, "key");
        return C8513g.C8516b.C8517a.m46712b(this, cVar);
    }

    public C8513g.C8518c<C0924a1> getKey() {
        return f4078h;
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        C8594l.m46771e(cVar, "key");
        return C8513g.C8516b.C8517a.m46713c(this, cVar);
    }

    public C8513g plus(C8513g gVar) {
        C8594l.m46771e(gVar, "context");
        return C8513g.C8516b.C8517a.m46714d(this, gVar);
    }
}
