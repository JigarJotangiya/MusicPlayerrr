package p369i.p379w;

import java.io.Serializable;
import java.util.Objects;
import p369i.C8457t;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p369i.p387z.p389d.C8601s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: i.w.c */
/* compiled from: CoroutineContextImpl.kt */
public final class C8503c implements C8513g, Serializable {
    private final C8513g.C8516b element;
    private final C8513g left;

    /* renamed from: i.w.c$a */
    /* compiled from: CoroutineContextImpl.kt */
    private static final class C8504a implements Serializable {
        public static final C8505a Companion = new C8505a((C8589g) null);
        private static final long serialVersionUID = 0;
        private final C8513g[] elements;

        /* renamed from: i.w.c$a$a */
        /* compiled from: CoroutineContextImpl.kt */
        public static final class C8505a {
            private C8505a() {
            }

            public /* synthetic */ C8505a(C8589g gVar) {
                this();
            }
        }

        public C8504a(C8513g[] gVarArr) {
            C8594l.m46771e(gVarArr, "elements");
            this.elements = gVarArr;
        }

        private final Object readResolve() {
            C8513g[] gVarArr = this.elements;
            C8513g gVar = C8519h.INSTANCE;
            for (C8513g plus : gVarArr) {
                gVar = gVar.plus(plus);
            }
            return gVar;
        }

        public final C8513g[] getElements() {
            return this.elements;
        }
    }

    /* renamed from: i.w.c$b */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C8506b extends C8595m implements C8574p<String, C8513g.C8516b, String> {
        public static final C8506b INSTANCE = new C8506b();

        C8506b() {
            super(2);
        }

        public final String invoke(String str, C8513g.C8516b bVar) {
            C8594l.m46771e(str, "acc");
            C8594l.m46771e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: i.w.c$c */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C8507c extends C8595m implements C8574p<C8457t, C8513g.C8516b, C8457t> {
        final /* synthetic */ C8513g[] $elements;
        final /* synthetic */ C8601s $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8507c(C8513g[] gVarArr, C8601s sVar) {
            super(2);
            this.$elements = gVarArr;
            this.$index = sVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C8457t) obj, (C8513g.C8516b) obj2);
            return C8457t.f34900a;
        }

        public final void invoke(C8457t tVar, C8513g.C8516b bVar) {
            C8594l.m46771e(tVar, "<anonymous parameter 0>");
            C8594l.m46771e(bVar, "element");
            C8513g[] gVarArr = this.$elements;
            C8601s sVar = this.$index;
            int i = sVar.element;
            sVar.element = i + 1;
            gVarArr[i] = bVar;
        }
    }

    public C8503c(C8513g gVar, C8513g.C8516b bVar) {
        C8594l.m46771e(gVar, "left");
        C8594l.m46771e(bVar, "element");
        this.left = gVar;
        this.element = bVar;
    }

    /* renamed from: a */
    private final boolean m46701a(C8513g.C8516b bVar) {
        return C8594l.m46767a(get(bVar.getKey()), bVar);
    }

    /* renamed from: b */
    private final boolean m46702b(C8503c cVar) {
        while (m46701a(cVar.element)) {
            C8513g gVar = cVar.left;
            if (gVar instanceof C8503c) {
                cVar = (C8503c) gVar;
            } else {
                Objects.requireNonNull(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m46701a((C8513g.C8516b) gVar);
            }
        }
        return false;
    }

    /* renamed from: e */
    private final int m46703e() {
        int i = 2;
        C8503c cVar = this;
        while (true) {
            C8513g gVar = cVar.left;
            if (!(gVar instanceof C8503c)) {
                gVar = null;
            }
            cVar = (C8503c) gVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int e = m46703e();
        C8513g[] gVarArr = new C8513g[e];
        C8601s sVar = new C8601s();
        boolean z = false;
        sVar.element = 0;
        fold(C8457t.f34900a, new C8507c(gVarArr, sVar));
        if (sVar.element == e) {
            z = true;
        }
        if (z) {
            return new C8504a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8503c) {
                C8503c cVar = (C8503c) obj;
                if (cVar.m46703e() != m46703e() || !cVar.m46702b(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
        C8594l.m46771e(pVar, "operation");
        return pVar.invoke(this.left.fold(r, pVar), this.element);
    }

    public <E extends C8513g.C8516b> E get(C8513g.C8518c<E> cVar) {
        C8594l.m46771e(cVar, "key");
        C8503c cVar2 = this;
        while (true) {
            E e = cVar2.element.get(cVar);
            if (e != null) {
                return e;
            }
            C8513g gVar = cVar2.left;
            if (!(gVar instanceof C8503c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C8503c) gVar;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public C8513g minusKey(C8513g.C8518c<?> cVar) {
        C8594l.m46771e(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        C8513g minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == C8519h.INSTANCE) {
            return this.element;
        }
        return new C8503c(minusKey, this.element);
    }

    public C8513g plus(C8513g gVar) {
        C8594l.m46771e(gVar, "context");
        return C8513g.C8514a.m46710a(this, gVar);
    }

    public String toString() {
        return "[" + ((String) fold(BuildConfig.FLAVOR, C8506b.INSTANCE)) + "]";
    }
}
