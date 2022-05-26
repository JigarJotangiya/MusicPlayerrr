package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0715s;
import androidx.lifecycle.C0718v;
import androidx.savedstate.Recreator;
import java.util.Map;
import p082e.p091b.p092a.p094b.C3451b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C3451b<String, C1029b> f4339a = new C3451b<>();

    /* renamed from: b */
    private Bundle f4340b;

    /* renamed from: c */
    private boolean f4341c;

    /* renamed from: d */
    private Recreator.C1026a f4342d;

    /* renamed from: e */
    boolean f4343e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C1028a {
        /* renamed from: a */
        void mo4194a(C1031b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C1029b {
        /* renamed from: a */
        Bundle mo4236a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo5695a(String str) {
        if (this.f4341c) {
            Bundle bundle = this.f4340b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f4340b.remove(str);
            if (this.f4340b.isEmpty()) {
                this.f4340b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5696b(C0697n nVar, Bundle bundle) {
        if (!this.f4341c) {
            if (bundle != null) {
                this.f4340b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            nVar.mo4256a(new C0715s() {
                /* renamed from: c */
                public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                    if (bVar == C0697n.C0699b.ON_START) {
                        SavedStateRegistry.this.f4343e = true;
                    } else if (bVar == C0697n.C0699b.ON_STOP) {
                        SavedStateRegistry.this.f4343e = false;
                    }
                }
            });
            this.f4341c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5697c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4340b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3451b<K, V>.d s = this.f4339a.mo12244s();
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            bundle2.putBundle((String) entry.getKey(), ((C1029b) entry.getValue()).mo4236a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void mo5698d(String str, C1029b bVar) {
        if (this.f4339a.mo12236v(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void mo5699e(Class<? extends C1028a> cls) {
        if (this.f4343e) {
            if (this.f4342d == null) {
                this.f4342d = new Recreator.C1026a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f4342d.mo5694b(cls.getName());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
