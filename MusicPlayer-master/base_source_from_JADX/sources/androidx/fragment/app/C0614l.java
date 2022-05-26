package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0710p0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.l */
/* compiled from: FragmentManagerViewModel */
final class C0614l extends C0696m0 {

    /* renamed from: i */
    private static final C0703o0.C0705b f3116i = new C0615a();

    /* renamed from: c */
    private final HashMap<String, Fragment> f3117c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0614l> f3118d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0710p0> f3119e = new HashMap<>();

    /* renamed from: f */
    private final boolean f3120f;

    /* renamed from: g */
    private boolean f3121g = false;

    /* renamed from: h */
    private boolean f3122h = false;

    /* renamed from: androidx.fragment.app.l$a */
    /* compiled from: FragmentManagerViewModel */
    static class C0615a implements C0703o0.C0705b {
        C0615a() {
        }

        /* renamed from: a */
        public <T extends C0696m0> T mo4019a(Class<T> cls) {
            return new C0614l(true);
        }
    }

    C0614l(boolean z) {
        this.f3120f = z;
    }

    /* renamed from: j */
    static C0614l m3963j(C0710p0 p0Var) {
        return (C0614l) new C0703o0(p0Var, f3116i).mo4262a(C0614l.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4006d() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3121g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0614l.class != obj.getClass()) {
            return false;
        }
        C0614l lVar = (C0614l) obj;
        if (!this.f3117c.equals(lVar.f3117c) || !this.f3118d.equals(lVar.f3118d) || !this.f3119e.equals(lVar.f3119e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo4008f(Fragment fragment) {
        if (this.f3117c.containsKey(fragment.f2940k)) {
            return false;
        }
        this.f3117c.put(fragment.f2940k, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4009g(Fragment fragment) {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0614l lVar = this.f3118d.get(fragment.f2940k);
        if (lVar != null) {
            lVar.mo4006d();
            this.f3118d.remove(fragment.f2940k);
        }
        C0710p0 p0Var = this.f3119e.get(fragment.f2940k);
        if (p0Var != null) {
            p0Var.mo4264a();
            this.f3119e.remove(fragment.f2940k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo4010h(String str) {
        return this.f3117c.get(str);
    }

    public int hashCode() {
        return (((this.f3117c.hashCode() * 31) + this.f3118d.hashCode()) * 31) + this.f3119e.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0614l mo4012i(Fragment fragment) {
        C0614l lVar = this.f3118d.get(fragment.f2940k);
        if (lVar != null) {
            return lVar;
        }
        C0614l lVar2 = new C0614l(this.f3120f);
        this.f3118d.put(fragment.f2940k, lVar2);
        return lVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Collection<Fragment> mo4013k() {
        return this.f3117c.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0710p0 mo4014l(Fragment fragment) {
        C0710p0 p0Var = this.f3119e.get(fragment.f2940k);
        if (p0Var != null) {
            return p0Var;
        }
        C0710p0 p0Var2 = new C0710p0();
        this.f3119e.put(fragment.f2940k, p0Var2);
        return p0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo4015m() {
        return this.f3121g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4016n(Fragment fragment) {
        return this.f3117c.remove(fragment.f2940k) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4017o(Fragment fragment) {
        if (!this.f3117c.containsKey(fragment.f2940k)) {
            return true;
        }
        if (this.f3120f) {
            return this.f3121g;
        }
        return !this.f3122h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3117c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3118d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3119e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
