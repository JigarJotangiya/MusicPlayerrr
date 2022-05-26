package p159f.p334h.p337b;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: f.h.b.m */
/* compiled from: Dispatcher */
public final class C7825m {

    /* renamed from: a */
    private final Deque<C7811e> f33282a = new ArrayDeque();

    public C7825m() {
        new ArrayDeque();
        new ArrayDeque();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo29150a(C7811e eVar) {
        this.f33282a.add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo29151b(C7811e eVar) {
        if (!this.f33282a.remove(eVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
