package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0715s;
import androidx.lifecycle.C0718v;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C0715s {

    /* renamed from: g */
    private final C1031b f4337g;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C1026a implements SavedStateRegistry.C1029b {

        /* renamed from: a */
        final Set<String> f4338a = new HashSet();

        C1026a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo5698d("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo4236a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4338a));
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5694b(String str) {
            this.f4338a.add(str);
        }
    }

    Recreator(C1031b bVar) {
        this.f4337g = bVar;
    }

    /* renamed from: h */
    private void m5970h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.C1028a.class);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.C1028a) declaredConstructor.newInstance(new Object[0])).mo4194a(this.f4337g);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: c */
    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        if (bVar == C0697n.C0699b.ON_CREATE) {
            vVar.mo390v().mo4258c(this);
            Bundle a = this.f4337g.mo384K0().mo5695a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m5970h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
