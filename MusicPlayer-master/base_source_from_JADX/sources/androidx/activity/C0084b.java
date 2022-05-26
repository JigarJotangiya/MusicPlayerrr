package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* compiled from: OnBackPressedCallback */
public abstract class C0084b {

    /* renamed from: a */
    private boolean f232a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0083a> f233b = new CopyOnWriteArrayList<>();

    public C0084b(boolean z) {
        this.f232a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo399a(C0083a aVar) {
        this.f233b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo400b();

    /* renamed from: c */
    public final boolean mo401c() {
        return this.f232a;
    }

    /* renamed from: d */
    public final void mo402d() {
        Iterator<C0083a> it = this.f233b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo403e(C0083a aVar) {
        this.f233b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo404f(boolean z) {
        this.f232a = z;
    }
}
