package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0697n;
import java.io.PrintWriter;
import java.util.ArrayList;
import p082e.p109h.p118o.C3697c;

/* renamed from: androidx.fragment.app.a */
/* compiled from: BackStackRecord */
final class C0583a extends C0620p implements C0602j.C0610h {

    /* renamed from: r */
    final C0602j f3022r;

    /* renamed from: s */
    boolean f3023s;

    /* renamed from: t */
    int f3024t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C0583a(androidx.fragment.app.C0602j r3) {
        /*
            r2 = this;
            androidx.fragment.app.f r0 = r3.mo3953g0()
            androidx.fragment.app.g<?> r1 = r3.f3090o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.mo3883e()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f3024t = r0
            r2.f3022r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0583a.<init>(androidx.fragment.app.j):void");
    }

    /* renamed from: G */
    private static boolean m3713G(C0620p.C0621a aVar) {
        Fragment fragment = aVar.f3153b;
        return fragment != null && fragment.f2946q && fragment.f2920M != null && !fragment.f2913F && !fragment.f2912E && fragment.mo3639V0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo3804A() {
        int size = this.f3135a.size();
        for (int i = 0; i < size; i++) {
            C0620p.C0621a aVar = this.f3135a.get(i);
            Fragment fragment = aVar.f3153b;
            if (fragment != null) {
                fragment.mo3605K2(this.f3140f);
            }
            switch (aVar.f3152a) {
                case 1:
                    fragment.mo3602J2(aVar.f3154c);
                    this.f3022r.mo3941Z0(fragment, false);
                    this.f3022r.mo3947d(fragment);
                    break;
                case 3:
                    fragment.mo3602J2(aVar.f3155d);
                    this.f3022r.mo3929Q0(fragment);
                    break;
                case 4:
                    fragment.mo3602J2(aVar.f3155d);
                    this.f3022r.mo3966p0(fragment);
                    break;
                case 5:
                    fragment.mo3602J2(aVar.f3154c);
                    this.f3022r.mo3941Z0(fragment, false);
                    this.f3022r.mo3948d1(fragment);
                    break;
                case 6:
                    fragment.mo3602J2(aVar.f3155d);
                    this.f3022r.mo3967q(fragment);
                    break;
                case 7:
                    fragment.mo3602J2(aVar.f3154c);
                    this.f3022r.mo3941Z0(fragment, false);
                    this.f3022r.mo3955h(fragment);
                    break;
                case 8:
                    this.f3022r.mo3944b1(fragment);
                    break;
                case 9:
                    this.f3022r.mo3944b1((Fragment) null);
                    break;
                case 10:
                    this.f3022r.mo3942a1(fragment, aVar.f3159h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3152a);
            }
            if (!(this.f3150p || aVar.f3152a == 1 || fragment == null)) {
                this.f3022r.mo3983z0(fragment);
            }
        }
        if (!this.f3150p) {
            C0602j jVar = this.f3022r;
            jVar.mo3904A0(jVar.f3089n, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo3805B(boolean z) {
        for (int size = this.f3135a.size() - 1; size >= 0; size--) {
            C0620p.C0621a aVar = this.f3135a.get(size);
            Fragment fragment = aVar.f3153b;
            if (fragment != null) {
                fragment.mo3605K2(C0602j.m3837V0(this.f3140f));
            }
            switch (aVar.f3152a) {
                case 1:
                    fragment.mo3602J2(aVar.f3157f);
                    this.f3022r.mo3941Z0(fragment, true);
                    this.f3022r.mo3929Q0(fragment);
                    break;
                case 3:
                    fragment.mo3602J2(aVar.f3156e);
                    this.f3022r.mo3947d(fragment);
                    break;
                case 4:
                    fragment.mo3602J2(aVar.f3156e);
                    this.f3022r.mo3948d1(fragment);
                    break;
                case 5:
                    fragment.mo3602J2(aVar.f3157f);
                    this.f3022r.mo3941Z0(fragment, true);
                    this.f3022r.mo3966p0(fragment);
                    break;
                case 6:
                    fragment.mo3602J2(aVar.f3156e);
                    this.f3022r.mo3955h(fragment);
                    break;
                case 7:
                    fragment.mo3602J2(aVar.f3157f);
                    this.f3022r.mo3941Z0(fragment, true);
                    this.f3022r.mo3967q(fragment);
                    break;
                case 8:
                    this.f3022r.mo3944b1((Fragment) null);
                    break;
                case 9:
                    this.f3022r.mo3944b1(fragment);
                    break;
                case 10:
                    this.f3022r.mo3942a1(fragment, aVar.f3158g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3152a);
            }
            if (!(this.f3150p || aVar.f3152a == 3 || fragment == null)) {
                this.f3022r.mo3983z0(fragment);
            }
        }
        if (!this.f3150p && z) {
            C0602j jVar = this.f3022r;
            jVar.mo3904A0(jVar.f3089n, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public Fragment mo3806C(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f3135a.size()) {
            C0620p.C0621a aVar = this.f3135a.get(i);
            int i2 = aVar.f3152a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f3153b;
                    int i3 = fragment3.f2910C;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.f2910C == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3135a.add(i, new C0620p.C0621a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0620p.C0621a aVar2 = new C0620p.C0621a(3, fragment4);
                                aVar2.f3154c = aVar.f3154c;
                                aVar2.f3156e = aVar.f3156e;
                                aVar2.f3155d = aVar.f3155d;
                                aVar2.f3157f = aVar.f3157f;
                                this.f3135a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f3135a.remove(i);
                        i--;
                    } else {
                        aVar.f3152a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f3153b);
                    Fragment fragment5 = aVar.f3153b;
                    if (fragment5 == fragment2) {
                        this.f3135a.add(i, new C0620p.C0621a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f3135a.add(i, new C0620p.C0621a(9, fragment2));
                        i++;
                        fragment2 = aVar.f3153b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f3153b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: D */
    public String mo3807D() {
        return this.f3143i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3808E(int i) {
        int size = this.f3135a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f3135a.get(i2).f3153b;
            int i3 = fragment != null ? fragment.f2910C : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo3809F(ArrayList<C0583a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f3135a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f3135a.get(i4).f3153b;
            int i5 = fragment != null ? fragment.f2910C : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0583a aVar = arrayList.get(i6);
                    int size2 = aVar.f3135a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f3135a.get(i7).f3153b;
                        if ((fragment2 != null ? fragment2.f2910C : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo3810H() {
        for (int i = 0; i < this.f3135a.size(); i++) {
            if (m3713G(this.f3135a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public void mo3811I() {
        if (this.f3151q != null) {
            for (int i = 0; i < this.f3151q.size(); i++) {
                this.f3151q.get(i).run();
            }
            this.f3151q = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo3812J(Fragment.C0577e eVar) {
        for (int i = 0; i < this.f3135a.size(); i++) {
            C0620p.C0621a aVar = this.f3135a.get(i);
            if (m3713G(aVar)) {
                aVar.f3153b.mo3609L2(eVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public Fragment mo3813K(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3135a.size() - 1; size >= 0; size--) {
            C0620p.C0621a aVar = this.f3135a.get(size);
            int i = aVar.f3152a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3153b;
                            break;
                        case 10:
                            aVar.f3159h = aVar.f3158g;
                            break;
                    }
                }
                arrayList.add(aVar.f3153b);
            }
            arrayList.remove(aVar.f3153b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo3814a(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0602j.m3853r0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3141g) {
            return true;
        }
        this.f3022r.mo3943b(this);
        return true;
    }

    /* renamed from: i */
    public int mo3815i() {
        return mo3828x(false);
    }

    /* renamed from: j */
    public int mo3816j() {
        return mo3828x(true);
    }

    /* renamed from: k */
    public void mo3817k() {
        mo4075n();
        this.f3022r.mo3930R(this, false);
    }

    /* renamed from: l */
    public void mo3818l() {
        mo4075n();
        this.f3022r.mo3930R(this, true);
    }

    /* renamed from: m */
    public C0620p mo3819m(Fragment fragment) {
        C0602j jVar = fragment.f2953x;
        if (jVar == null || jVar == this.f3022r) {
            super.mo3819m(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3820o(int i, Fragment fragment, String str, int i2) {
        super.mo3820o(i, fragment, str, i2);
        fragment.f2953x = this.f3022r;
    }

    /* renamed from: p */
    public C0620p mo3821p(Fragment fragment) {
        C0602j jVar = fragment.f2953x;
        if (jVar == null || jVar == this.f3022r) {
            super.mo3821p(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: q */
    public boolean mo3822q() {
        return this.f3135a.isEmpty();
    }

    /* renamed from: r */
    public C0620p mo3823r(Fragment fragment) {
        C0602j jVar = fragment.f2953x;
        if (jVar == null || jVar == this.f3022r) {
            super.mo3823r(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: t */
    public C0620p mo3824t(Fragment fragment, C0697n.C0700c cVar) {
        if (fragment.f2953x == this.f3022r) {
            C0697n.C0700c cVar2 = C0697n.C0700c.CREATED;
            if (cVar.isAtLeast(cVar2)) {
                super.mo3824t(fragment, cVar);
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + cVar2);
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3022r);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3024t >= 0) {
            sb.append(" #");
            sb.append(this.f3024t);
        }
        if (this.f3143i != null) {
            sb.append(" ");
            sb.append(this.f3143i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    public C0620p mo3826v(Fragment fragment) {
        C0602j jVar = fragment.f2953x;
        if (jVar == null || jVar == this.f3022r) {
            super.mo3826v(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3827w(int i) {
        if (this.f3141g) {
            if (C0602j.m3853r0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f3135a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0620p.C0621a aVar = this.f3135a.get(i2);
                Fragment fragment = aVar.f3153b;
                if (fragment != null) {
                    fragment.f2952w += i;
                    if (C0602j.m3853r0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3153b + " to " + aVar.f3153b.f2952w);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo3828x(boolean z) {
        if (!this.f3023s) {
            if (C0602j.m3853r0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C3697c("FragmentManager"));
                mo3829y("  ", printWriter);
                printWriter.close();
            }
            this.f3023s = true;
            if (this.f3141g) {
                this.f3024t = this.f3022r.mo3951f();
            } else {
                this.f3024t = -1;
            }
            this.f3022r.mo3925O(this, z);
            return this.f3024t;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: y */
    public void mo3829y(String str, PrintWriter printWriter) {
        mo3830z(str, printWriter, true);
    }

    /* renamed from: z */
    public void mo3830z(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3143i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3024t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3023s);
            if (this.f3140f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3140f));
            }
            if (!(this.f3136b == 0 && this.f3137c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3136b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3137c));
            }
            if (!(this.f3138d == 0 && this.f3139e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3138d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3139e));
            }
            if (!(this.f3144j == 0 && this.f3145k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3144j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3145k);
            }
            if (!(this.f3146l == 0 && this.f3147m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3146l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3147m);
            }
        }
        if (!this.f3135a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3135a.size();
            for (int i = 0; i < size; i++) {
                C0620p.C0621a aVar = this.f3135a.get(i);
                switch (aVar.f3152a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3152a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3153b);
                if (z) {
                    if (!(aVar.f3154c == 0 && aVar.f3155d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3154c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3155d));
                    }
                    if (aVar.f3156e != 0 || aVar.f3157f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3156e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3157f));
                    }
                }
            }
        }
    }
}
