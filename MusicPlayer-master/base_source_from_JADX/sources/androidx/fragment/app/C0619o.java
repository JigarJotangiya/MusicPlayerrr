package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.o */
/* compiled from: FragmentStore */
class C0619o {

    /* renamed from: a */
    private final ArrayList<Fragment> f3133a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0616m> f3134b = new HashMap<>();

    C0619o() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4048a(Fragment fragment) {
        if (!this.f3133a.contains(fragment)) {
            synchronized (this.f3133a) {
                this.f3133a.add(fragment);
            }
            fragment.f2946q = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4049b() {
        this.f3134b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4050c(String str) {
        return this.f3134b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4051d(int i) {
        Iterator<Fragment> it = this.f3133a.iterator();
        while (it.hasNext()) {
            C0616m mVar = this.f3134b.get(it.next().f2940k);
            if (mVar != null) {
                mVar.mo4036r(i);
            }
        }
        for (C0616m next : this.f3134b.values()) {
            if (next != null) {
                next.mo4036r(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4052e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3134b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0616m next : this.f3134b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment i = next.mo4028i();
                    printWriter.println(i);
                    i.mo3597I(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3133a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f3133a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment mo4053f(String str) {
        C0616m mVar = this.f3134b.get(str);
        if (mVar != null) {
            return mVar.mo4028i();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo4054g(int i) {
        for (int size = this.f3133a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3133a.get(size);
            if (fragment != null && fragment.f2909B == i) {
                return fragment;
            }
        }
        for (C0616m next : this.f3134b.values()) {
            if (next != null) {
                Fragment i2 = next.mo4028i();
                if (i2.f2909B == i) {
                    return i2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment mo4055h(String str) {
        if (str != null) {
            for (int size = this.f3133a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3133a.get(size);
                if (fragment != null && str.equals(fragment.f2911D)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0616m next : this.f3134b.values()) {
            if (next != null) {
                Fragment i = next.mo4028i();
                if (str.equals(i.f2911D)) {
                    return i;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo4056i(String str) {
        Fragment K;
        for (C0616m next : this.f3134b.values()) {
            if (next != null && (K = next.mo4028i().mo3603K(str)) != null) {
                return K;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Fragment mo4057j(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2919L;
        View view = fragment.f2920M;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f3133a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f3133a.get(indexOf);
                if (fragment2.f2919L == viewGroup && fragment2.f2920M != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<Fragment> mo4058k() {
        ArrayList arrayList = new ArrayList();
        for (C0616m next : this.f3134b.values()) {
            if (next != null) {
                arrayList.add(next.mo4028i());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0616m mo4059l(String str) {
        return this.f3134b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Fragment> mo4060m() {
        ArrayList arrayList;
        if (this.f3133a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3133a) {
            arrayList = new ArrayList(this.f3133a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo4061n(C0616m mVar) {
        this.f3134b.put(mVar.mo4028i().f2940k, mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4062o(C0616m mVar) {
        Fragment i = mVar.mo4028i();
        for (C0616m next : this.f3134b.values()) {
            if (next != null) {
                Fragment i2 = next.mo4028i();
                if (i.f2940k.equals(i2.f2943n)) {
                    i2.f2942m = i;
                    i2.f2943n = null;
                }
            }
        }
        this.f3134b.put(i.f2940k, (Object) null);
        String str = i.f2943n;
        if (str != null) {
            i.f2942m = mo4053f(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4063p(Fragment fragment) {
        synchronized (this.f3133a) {
            this.f3133a.remove(fragment);
        }
        fragment.f2946q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4064q() {
        this.f3134b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4065r(List<String> list) {
        this.f3133a.clear();
        if (list != null) {
            for (String next : list) {
                Fragment f = mo4053f(next);
                if (f != null) {
                    if (C0602j.m3853r0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f);
                    }
                    mo4048a(f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public ArrayList<FragmentState> mo4066s() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3134b.size());
        for (C0616m next : this.f3134b.values()) {
            if (next != null) {
                Fragment i = next.mo4028i();
                FragmentState p = next.mo4034p();
                arrayList.add(p);
                if (C0602j.m3853r0(2)) {
                    Log.v("FragmentManager", "Saved state of " + i + ": " + p.f3009s);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public ArrayList<String> mo4067t() {
        synchronized (this.f3133a) {
            if (this.f3133a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3133a.size());
            Iterator<Fragment> it = this.f3133a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2940k);
                if (C0602j.m3853r0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2940k + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
