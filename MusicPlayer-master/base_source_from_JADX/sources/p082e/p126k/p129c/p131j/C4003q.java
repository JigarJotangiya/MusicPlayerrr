package p082e.p126k.p129c.p131j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p082e.p126k.p129c.p131j.C4056z;

/* renamed from: e.k.c.j.q */
/* compiled from: ExtensionRegistryLite */
public class C4003q {

    /* renamed from: b */
    private static boolean f12151b = true;

    /* renamed from: c */
    private static volatile C4003q f12152c;

    /* renamed from: d */
    static final C4003q f12153d = new C4003q(true);

    /* renamed from: a */
    private final Map<C4004a, C4056z.C4061e<?, ?>> f12154a;

    /* renamed from: e.k.c.j.q$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class C4004a {

        /* renamed from: a */
        private final Object f12155a;

        /* renamed from: b */
        private final int f12156b;

        C4004a(Object obj, int i) {
            this.f12155a = obj;
            this.f12156b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4004a)) {
                return false;
            }
            C4004a aVar = (C4004a) obj;
            if (this.f12155a == aVar.f12155a && this.f12156b == aVar.f12156b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12155a) * 65535) + this.f12156b;
        }
    }

    static {
        m17483c();
    }

    C4003q() {
        this.f12154a = new HashMap();
    }

    /* renamed from: b */
    public static C4003q m17482b() {
        C4003q qVar = f12152c;
        if (qVar == null) {
            synchronized (C4003q.class) {
                qVar = f12152c;
                if (qVar == null) {
                    qVar = f12151b ? C4000p.m17475a() : f12153d;
                    f12152c = qVar;
                }
            }
        }
        return qVar;
    }

    /* renamed from: c */
    static Class<?> m17483c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public <ContainingType extends C4012s0> C4056z.C4061e<ContainingType, ?> mo13909a(ContainingType containingtype, int i) {
        return this.f12154a.get(new C4004a(containingtype, i));
    }

    C4003q(boolean z) {
        this.f12154a = Collections.emptyMap();
    }
}
