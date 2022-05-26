package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0712q0;

/* renamed from: androidx.fragment.app.m */
/* compiled from: FragmentStateManager */
class C0616m {

    /* renamed from: a */
    private final C0600i f3123a;

    /* renamed from: b */
    private final Fragment f3124b;

    /* renamed from: c */
    private int f3125c = -1;

    /* renamed from: androidx.fragment.app.m$a */
    /* compiled from: FragmentStateManager */
    static /* synthetic */ class C0617a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3126a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.n$c[] r0 = androidx.lifecycle.C0697n.C0700c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3126a = r0
                androidx.lifecycle.n$c r1 = androidx.lifecycle.C0697n.C0700c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3126a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.n$c r1 = androidx.lifecycle.C0697n.C0700c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3126a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.n$c r1 = androidx.lifecycle.C0697n.C0700c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0616m.C0617a.<clinit>():void");
        }
    }

    C0616m(C0600i iVar, Fragment fragment) {
        this.f3123a = iVar;
        this.f3124b = fragment;
    }

    /* renamed from: n */
    private Bundle m3975n() {
        Bundle bundle = new Bundle();
        this.f3124b.mo3697r2(bundle);
        this.f3123a.mo3896j(this.f3124b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3124b.f2920M != null) {
            mo4035q();
        }
        if (this.f3124b.f2938i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3124b.f2938i);
        }
        if (!this.f3124b.f2922O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3124b.f2922O);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4020a() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3124b);
        }
        Fragment fragment = this.f3124b;
        fragment.mo3643W1(fragment.f2937h);
        C0600i iVar = this.f3123a;
        Fragment fragment2 = this.f3124b;
        iVar.mo3887a(fragment2, fragment2.f2937h, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4021b(C0598g<?> gVar, C0602j jVar, Fragment fragment) {
        Fragment fragment2 = this.f3124b;
        fragment2.f2954y = gVar;
        fragment2.f2908A = fragment;
        fragment2.f2953x = jVar;
        this.f3123a.mo3893g(fragment2, gVar.mo3883e(), false);
        this.f3124b.mo3646X1();
        Fragment fragment3 = this.f3124b;
        Fragment fragment4 = fragment3.f2908A;
        if (fragment4 == null) {
            gVar.mo3753g(fragment3);
        } else {
            fragment4.mo3674j1(fragment3);
        }
        this.f3123a.mo3888b(this.f3124b, gVar.mo3883e(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo4022c() {
        int i = this.f3125c;
        Fragment fragment = this.f3124b;
        if (fragment.f2948s) {
            if (fragment.f2949t) {
                i = Math.max(i, 1);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.f3124b.f2946q) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f3124b;
        if (fragment2.f2947r) {
            if (fragment2.mo3635U0()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        Fragment fragment3 = this.f3124b;
        if (fragment3.f2921N && fragment3.f2936g < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C0617a.f3126a[this.f3124b.f2929V.ordinal()];
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return Math.min(i, 3);
        }
        if (i2 != 3) {
            return Math.min(i, -1);
        }
        return Math.min(i, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4023d() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3124b);
        }
        Fragment fragment = this.f3124b;
        if (!fragment.f2928U) {
            this.f3123a.mo3894h(fragment, fragment.f2937h, false);
            Fragment fragment2 = this.f3124b;
            fragment2.mo3653a2(fragment2.f2937h);
            C0600i iVar = this.f3123a;
            Fragment fragment3 = this.f3124b;
            iVar.mo3889c(fragment3, fragment3.f2937h, false);
            return;
        }
        fragment.mo3713y2(fragment.f2937h);
        this.f3124b.f2936g = 1;
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4024e(androidx.fragment.app.C0595d r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.f3124b
            boolean r0 = r0.f2948s
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.C0602j.m3853r0(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f3124b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x0026:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.f3124b
            android.view.ViewGroup r2 = r1.f2919L
            if (r2 == 0) goto L_0x0030
            r0 = r2
            goto L_0x00a5
        L_0x0030:
            int r1 = r1.f2910C
            if (r1 == 0) goto L_0x00a5
            r0 = -1
            if (r1 == r0) goto L_0x0087
            android.view.View r5 = r5.mo3725b(r1)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00a5
            androidx.fragment.app.Fragment r5 = r4.f3124b
            boolean r1 = r5.f2950u
            if (r1 == 0) goto L_0x0047
            goto L_0x00a5
        L_0x0047:
            android.content.res.Resources r5 = r5.mo3698s0()     // Catch:{ NotFoundException -> 0x0054 }
            androidx.fragment.app.Fragment r0 = r4.f3124b     // Catch:{ NotFoundException -> 0x0054 }
            int r0 = r0.f2910C     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            java.lang.String r5 = "unknown"
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r4.f3124b
            int r2 = r2.f2910C
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            androidx.fragment.app.Fragment r5 = r4.f3124b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0087:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f3124b
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00a5:
            androidx.fragment.app.Fragment r5 = r4.f3124b
            r5.f2919L = r0
            android.os.Bundle r1 = r5.f2937h
            android.view.LayoutInflater r1 = r5.mo3670h2(r1)
            androidx.fragment.app.Fragment r2 = r4.f3124b
            android.os.Bundle r2 = r2.f2937h
            r5.mo3658c2(r1, r0, r2)
            androidx.fragment.app.Fragment r5 = r4.f3124b
            android.view.View r5 = r5.f2920M
            if (r5 == 0) goto L_0x010d
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r5 = r4.f3124b
            android.view.View r2 = r5.f2920M
            int r3 = p082e.p136n.C4094b.fragment_container_view_tag
            r2.setTag(r3, r5)
            if (r0 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r5 = r4.f3124b
            android.view.View r5 = r5.f2920M
            r0.addView(r5)
        L_0x00d2:
            androidx.fragment.app.Fragment r5 = r4.f3124b
            boolean r0 = r5.f2912E
            if (r0 == 0) goto L_0x00df
            android.view.View r5 = r5.f2920M
            r0 = 8
            r5.setVisibility(r0)
        L_0x00df:
            androidx.fragment.app.Fragment r5 = r4.f3124b
            android.view.View r5 = r5.f2920M
            p082e.p109h.p119p.C3774v.m16211l0(r5)
            androidx.fragment.app.Fragment r5 = r4.f3124b
            android.view.View r0 = r5.f2920M
            android.os.Bundle r2 = r5.f2937h
            r5.mo3636U1(r0, r2)
            androidx.fragment.app.i r5 = r4.f3123a
            androidx.fragment.app.Fragment r0 = r4.f3124b
            android.view.View r2 = r0.f2920M
            android.os.Bundle r3 = r0.f2937h
            r5.mo3899m(r0, r2, r3, r1)
            androidx.fragment.app.Fragment r5 = r4.f3124b
            android.view.View r0 = r5.f2920M
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x010b
            androidx.fragment.app.Fragment r0 = r4.f3124b
            android.view.ViewGroup r0 = r0.f2919L
            if (r0 == 0) goto L_0x010b
            r1 = 1
        L_0x010b:
            r5.f2924Q = r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0616m.mo4024e(androidx.fragment.app.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4025f(C0598g<?> gVar, C0614l lVar) {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3124b);
        }
        Fragment fragment = this.f3124b;
        boolean z = true;
        boolean z2 = fragment.f2947r && !fragment.mo3635U0();
        if (z2 || lVar.mo4017o(this.f3124b)) {
            if (gVar instanceof C0712q0) {
                z = lVar.mo4015m();
            } else if (gVar.mo3883e() instanceof Activity) {
                z = true ^ ((Activity) gVar.mo3883e()).isChangingConfigurations();
            }
            if (z2 || z) {
                lVar.mo4009g(this.f3124b);
            }
            this.f3124b.mo3661d2();
            this.f3123a.mo3890d(this.f3124b, false);
            return;
        }
        this.f3124b.f2936g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4026g(C0614l lVar) {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3124b);
        }
        this.f3124b.mo3667g2();
        boolean z = false;
        this.f3123a.mo3891e(this.f3124b, false);
        Fragment fragment = this.f3124b;
        fragment.f2936g = -1;
        fragment.f2954y = null;
        fragment.f2908A = null;
        fragment.f2953x = null;
        if (fragment.f2947r && !fragment.mo3635U0()) {
            z = true;
        }
        if (z || lVar.mo4017o(this.f3124b)) {
            if (C0602j.m3853r0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3124b);
            }
            this.f3124b.mo3616O0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4027h() {
        Fragment fragment = this.f3124b;
        if (fragment.f2948s && fragment.f2949t && !fragment.f2951v) {
            if (C0602j.m3853r0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3124b);
            }
            Fragment fragment2 = this.f3124b;
            fragment2.mo3658c2(fragment2.mo3670h2(fragment2.f2937h), (ViewGroup) null, this.f3124b.f2937h);
            View view = this.f3124b.f2920M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3124b;
                if (fragment3.f2912E) {
                    fragment3.f2920M.setVisibility(8);
                }
                Fragment fragment4 = this.f3124b;
                fragment4.mo3636U1(fragment4.f2920M, fragment4.f2937h);
                C0600i iVar = this.f3123a;
                Fragment fragment5 = this.f3124b;
                iVar.mo3899m(fragment5, fragment5.f2920M, fragment5.f2937h, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo4028i() {
        return this.f3124b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4029j() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3124b);
        }
        this.f3124b.mo3682m2();
        this.f3123a.mo3892f(this.f3124b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4030k(ClassLoader classLoader) {
        Bundle bundle = this.f3124b.f2937h;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3124b;
            fragment.f2938i = fragment.f2937h.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3124b;
            fragment2.f2943n = fragment2.f2937h.getString("android:target_state");
            Fragment fragment3 = this.f3124b;
            if (fragment3.f2943n != null) {
                fragment3.f2944o = fragment3.f2937h.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f3124b;
            Boolean bool = fragment4.f2939j;
            if (bool != null) {
                fragment4.f2922O = bool.booleanValue();
                this.f3124b.f2939j = null;
            } else {
                fragment4.f2922O = fragment4.f2937h.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f3124b;
            if (!fragment5.f2922O) {
                fragment5.f2921N = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4031l() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f3124b);
        }
        Fragment fragment = this.f3124b;
        if (fragment.f2920M != null) {
            fragment.mo3715z2(fragment.f2937h);
        }
        this.f3124b.f2937h = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4032m() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3124b);
        }
        this.f3124b.mo3695q2();
        this.f3123a.mo3895i(this.f3124b, false);
        Fragment fragment = this.f3124b;
        fragment.f2937h = null;
        fragment.f2938i = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Fragment.SavedState mo4033o() {
        Bundle n;
        if (this.f3124b.f2936g <= -1 || (n = m3975n()) == null) {
            return null;
        }
        return new Fragment.SavedState(n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public FragmentState mo4034p() {
        FragmentState fragmentState = new FragmentState(this.f3124b);
        Fragment fragment = this.f3124b;
        if (fragment.f2936g <= -1 || fragmentState.f3009s != null) {
            fragmentState.f3009s = fragment.f2937h;
        } else {
            Bundle n = m3975n();
            fragmentState.f3009s = n;
            if (this.f3124b.f2943n != null) {
                if (n == null) {
                    fragmentState.f3009s = new Bundle();
                }
                fragmentState.f3009s.putString("android:target_state", this.f3124b.f2943n);
                int i = this.f3124b.f2944o;
                if (i != 0) {
                    fragmentState.f3009s.putInt("android:target_req_state", i);
                }
            }
        }
        return fragmentState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4035q() {
        if (this.f3124b.f2920M != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3124b.f2920M.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3124b.f2938i = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4036r(int i) {
        this.f3125c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4037s() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3124b);
        }
        this.f3124b.mo3700s2();
        this.f3123a.mo3897k(this.f3124b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4038t() {
        if (C0602j.m3853r0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3124b);
        }
        this.f3124b.mo3702t2();
        this.f3123a.mo3898l(this.f3124b, false);
    }

    C0616m(C0600i iVar, ClassLoader classLoader, C0597f fVar, FragmentState fragmentState) {
        this.f3123a = iVar;
        Fragment a = fVar.mo3881a(classLoader, fragmentState.f2997g);
        this.f3124b = a;
        Bundle bundle = fragmentState.f3006p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3581C2(fragmentState.f3006p);
        a.f2940k = fragmentState.f2998h;
        a.f2948s = fragmentState.f2999i;
        a.f2950u = true;
        a.f2909B = fragmentState.f3000j;
        a.f2910C = fragmentState.f3001k;
        a.f2911D = fragmentState.f3002l;
        a.f2914G = fragmentState.f3003m;
        a.f2947r = fragmentState.f3004n;
        a.f2913F = fragmentState.f3005o;
        a.f2912E = fragmentState.f3007q;
        a.f2929V = C0697n.C0700c.values()[fragmentState.f3008r];
        Bundle bundle2 = fragmentState.f3009s;
        if (bundle2 != null) {
            a.f2937h = bundle2;
        } else {
            a.f2937h = new Bundle();
        }
        if (C0602j.m3853r0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    C0616m(C0600i iVar, Fragment fragment, FragmentState fragmentState) {
        this.f3123a = iVar;
        this.f3124b = fragment;
        fragment.f2938i = null;
        fragment.f2952w = 0;
        fragment.f2949t = false;
        fragment.f2946q = false;
        Fragment fragment2 = fragment.f2942m;
        fragment.f2943n = fragment2 != null ? fragment2.f2940k : null;
        fragment.f2942m = null;
        Bundle bundle = fragmentState.f3009s;
        if (bundle != null) {
            fragment.f2937h = bundle;
        } else {
            fragment.f2937h = new Bundle();
        }
    }
}
