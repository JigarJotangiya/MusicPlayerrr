package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.p0 */
/* compiled from: ViewModelStore */
public class C0710p0 {

    /* renamed from: a */
    private final HashMap<String, C0696m0> f3334a = new HashMap<>();

    /* renamed from: a */
    public final void mo4264a() {
        for (C0696m0 a : this.f3334a.values()) {
            a.mo4253a();
        }
        this.f3334a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0696m0 mo4265b(String str) {
        return this.f3334a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo4266c() {
        return new HashSet(this.f3334a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4267d(String str, C0696m0 m0Var) {
        C0696m0 put = this.f3334a.put(str, m0Var);
        if (put != null) {
            put.mo4006d();
        }
    }
}
