package p394k;

import java.util.concurrent.atomic.AtomicReference;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.w */
/* compiled from: SegmentPool.kt */
public final class C8657w {

    /* renamed from: a */
    private static final int f35019a = 65536;

    /* renamed from: b */
    private static final C8656v f35020b = new C8656v(new byte[0], 0, 0, false, false);

    /* renamed from: c */
    private static final int f35021c;

    /* renamed from: d */
    private static final AtomicReference<C8656v>[] f35022d;

    /* renamed from: e */
    public static final C8657w f35023e = new C8657w();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f35021c = highestOneBit;
        AtomicReference<C8656v>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f35022d = atomicReferenceArr;
    }

    private C8657w() {
    }

    /* renamed from: a */
    private final AtomicReference<C8656v> m47056a() {
        Thread currentThread = Thread.currentThread();
        C8594l.m46770d(currentThread, "Thread.currentThread()");
        return f35022d[(int) (currentThread.getId() & (((long) f35021c) - 1))];
    }

    /* renamed from: b */
    public static final void m47057b(C8656v vVar) {
        AtomicReference<C8656v> a;
        C8656v vVar2;
        C8594l.m46771e(vVar, "segment");
        if (!(vVar.f35017f == null && vVar.f35018g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!vVar.f35015d && (vVar2 = a.get()) != f35020b) {
            int i = vVar2 != null ? vVar2.f35014c : 0;
            if (i < f35019a) {
                vVar.f35017f = vVar2;
                vVar.f35013b = 0;
                vVar.f35014c = i + 8192;
                if (!(a = f35023e.m47056a()).compareAndSet(vVar2, vVar)) {
                    vVar.f35017f = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static final C8656v m47058c() {
        AtomicReference<C8656v> a = f35023e.m47056a();
        C8656v vVar = f35020b;
        C8656v andSet = a.getAndSet(vVar);
        if (andSet == vVar) {
            return new C8656v();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new C8656v();
        }
        a.set(andSet.f35017f);
        andSet.f35017f = null;
        andSet.f35014c = 0;
        return andSet;
    }
}
