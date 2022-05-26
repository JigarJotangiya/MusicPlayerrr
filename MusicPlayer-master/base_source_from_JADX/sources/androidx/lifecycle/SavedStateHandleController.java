package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C0697n;
import androidx.savedstate.C1031b;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController implements C0715s {

    /* renamed from: g */
    private final String f3256g;

    /* renamed from: h */
    private boolean f3257h = false;

    /* renamed from: i */
    private final C0682i0 f3258i;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0651a implements SavedStateRegistry.C1028a {
        C0651a() {
        }

        /* renamed from: a */
        public void mo4194a(C1031b bVar) {
            if (bVar instanceof C0712q0) {
                C0710p0 z0 = ((C0712q0) bVar).mo392z0();
                SavedStateRegistry K0 = bVar.mo384K0();
                for (String b : z0.mo4266c()) {
                    SavedStateHandleController.m4170h(z0.mo4265b(b), K0, bVar.mo390v());
                }
                if (!z0.mo4266c().isEmpty()) {
                    K0.mo5699e(C0651a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, C0682i0 i0Var) {
        this.f3256g = str;
        this.f3258i = i0Var;
    }

    /* renamed from: h */
    static void m4170h(C0696m0 m0Var, SavedStateRegistry savedStateRegistry, C0697n nVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) m0Var.mo4254c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo4193l()) {
            savedStateHandleController.mo4191i(savedStateRegistry, nVar);
            m4172m(savedStateRegistry, nVar);
        }
    }

    /* renamed from: j */
    static SavedStateHandleController m4171j(SavedStateRegistry savedStateRegistry, C0697n nVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C0682i0.m4227a(savedStateRegistry.mo5695a(str), bundle));
        savedStateHandleController.mo4191i(savedStateRegistry, nVar);
        m4172m(savedStateRegistry, nVar);
        return savedStateHandleController;
    }

    /* renamed from: m */
    private static void m4172m(final SavedStateRegistry savedStateRegistry, final C0697n nVar) {
        C0697n.C0700c b = nVar.mo4257b();
        if (b == C0697n.C0700c.INITIALIZED || b.isAtLeast(C0697n.C0700c.STARTED)) {
            savedStateRegistry.mo5699e(C0651a.class);
        } else {
            nVar.mo4256a(new C0715s() {
                /* renamed from: c */
                public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                    if (bVar == C0697n.C0699b.ON_START) {
                        nVar.mo4258c(this);
                        savedStateRegistry.mo5699e(C0651a.class);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        if (bVar == C0697n.C0699b.ON_DESTROY) {
            this.f3257h = false;
            vVar.mo390v().mo4258c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4191i(SavedStateRegistry savedStateRegistry, C0697n nVar) {
        if (!this.f3257h) {
            this.f3257h = true;
            nVar.mo4256a(this);
            savedStateRegistry.mo5698d(this.f3256g, this.f3258i.mo4235b());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0682i0 mo4192k() {
        return this.f3258i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo4193l() {
        return this.f3257h;
    }
}
