package kotlinx.coroutines;

import java.io.Closeable;
import p369i.p379w.C8502b;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.q1 */
/* compiled from: Executors.kt */
public abstract class C8897q1 extends C8876m0 implements Closeable {

    /* renamed from: kotlinx.coroutines.q1$a */
    /* compiled from: Executors.kt */
    public static final class C8898a extends C8502b<C8876m0, C8897q1> {

        /* renamed from: kotlinx.coroutines.q1$a$a */
        /* compiled from: Executors.kt */
        static final class C8899a extends C8595m implements C8570l<C8513g.C8516b, C8897q1> {
            public static final C8899a INSTANCE = new C8899a();

            C8899a() {
                super(1);
            }

            public final C8897q1 invoke(C8513g.C8516b bVar) {
                if (bVar instanceof C8897q1) {
                    return (C8897q1) bVar;
                }
                return null;
            }
        }

        private C8898a() {
            super(C8876m0.f35279g, C8899a.INSTANCE);
        }

        public /* synthetic */ C8898a(C8589g gVar) {
            this();
        }
    }

    static {
        new C8898a((C8589g) null);
    }
}
