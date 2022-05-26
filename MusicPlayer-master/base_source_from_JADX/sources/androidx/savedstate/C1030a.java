package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0697n;

/* renamed from: androidx.savedstate.a */
/* compiled from: SavedStateRegistryController */
public final class C1030a {

    /* renamed from: a */
    private final C1031b f4345a;

    /* renamed from: b */
    private final SavedStateRegistry f4346b = new SavedStateRegistry();

    private C1030a(C1031b bVar) {
        this.f4345a = bVar;
    }

    /* renamed from: a */
    public static C1030a m5982a(C1031b bVar) {
        return new C1030a(bVar);
    }

    /* renamed from: b */
    public SavedStateRegistry mo5700b() {
        return this.f4346b;
    }

    /* renamed from: c */
    public void mo5701c(Bundle bundle) {
        C0697n v = this.f4345a.mo390v();
        if (v.mo4257b() == C0697n.C0700c.INITIALIZED) {
            v.mo4256a(new Recreator(this.f4345a));
            this.f4346b.mo5696b(v, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo5702d(Bundle bundle) {
        this.f4346b.mo5697c(bundle);
    }
}
