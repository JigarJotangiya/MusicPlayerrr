package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0501m;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0687j0;
import androidx.lifecycle.C0695m;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0710p0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0715s;
import androidx.lifecycle.C0718v;
import androidx.lifecycle.C0720x;
import androidx.savedstate.C1030a;
import androidx.savedstate.C1031b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p082e.p109h.p119p.C3759g;
import p082e.p140p.p141a.C4100a;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0718v, C0712q0, C0695m, C1031b {

    /* renamed from: c0 */
    static final Object f2907c0 = new Object();

    /* renamed from: A */
    Fragment f2908A;

    /* renamed from: B */
    int f2909B;

    /* renamed from: C */
    int f2910C;

    /* renamed from: D */
    String f2911D;

    /* renamed from: E */
    boolean f2912E;

    /* renamed from: F */
    boolean f2913F;

    /* renamed from: G */
    boolean f2914G;

    /* renamed from: H */
    boolean f2915H;

    /* renamed from: I */
    boolean f2916I;

    /* renamed from: J */
    boolean f2917J = true;

    /* renamed from: K */
    private boolean f2918K;

    /* renamed from: L */
    ViewGroup f2919L;

    /* renamed from: M */
    View f2920M;

    /* renamed from: N */
    boolean f2921N;

    /* renamed from: O */
    boolean f2922O = true;

    /* renamed from: P */
    C0575c f2923P;

    /* renamed from: Q */
    boolean f2924Q;

    /* renamed from: R */
    boolean f2925R;

    /* renamed from: S */
    float f2926S;

    /* renamed from: T */
    LayoutInflater f2927T;

    /* renamed from: U */
    boolean f2928U;

    /* renamed from: V */
    C0697n.C0700c f2929V = C0697n.C0700c.RESUMED;

    /* renamed from: W */
    C0720x f2930W;

    /* renamed from: X */
    C0641t f2931X;

    /* renamed from: Y */
    C0670e0<C0718v> f2932Y = new C0670e0<>();

    /* renamed from: Z */
    private C0703o0.C0705b f2933Z;

    /* renamed from: a0 */
    C1030a f2934a0;

    /* renamed from: b0 */
    private int f2935b0;

    /* renamed from: g */
    int f2936g = -1;

    /* renamed from: h */
    Bundle f2937h;

    /* renamed from: i */
    SparseArray<Parcelable> f2938i;

    /* renamed from: j */
    Boolean f2939j;

    /* renamed from: k */
    String f2940k = UUID.randomUUID().toString();

    /* renamed from: l */
    Bundle f2941l;

    /* renamed from: m */
    Fragment f2942m;

    /* renamed from: n */
    String f2943n = null;

    /* renamed from: o */
    int f2944o;

    /* renamed from: p */
    private Boolean f2945p = null;

    /* renamed from: q */
    boolean f2946q;

    /* renamed from: r */
    boolean f2947r;

    /* renamed from: s */
    boolean f2948s;

    /* renamed from: t */
    boolean f2949t;

    /* renamed from: u */
    boolean f2950u;

    /* renamed from: v */
    boolean f2951v;

    /* renamed from: w */
    int f2952w;

    /* renamed from: x */
    C0602j f2953x;

    /* renamed from: y */
    C0598g<?> f2954y;

    /* renamed from: z */
    C0602j f2955z = new C0613k();

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0573a implements Runnable {
        C0573a() {
        }

        public void run() {
            Fragment.this.mo3594H();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0574b extends C0595d {
        C0574b() {
        }

        /* renamed from: b */
        public View mo3725b(int i) {
            View view = Fragment.this.f2920M;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        /* renamed from: c */
        public boolean mo3726c() {
            return Fragment.this.f2920M != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    static class C0575c {

        /* renamed from: a */
        View f2960a;

        /* renamed from: b */
        Animator f2961b;

        /* renamed from: c */
        int f2962c;

        /* renamed from: d */
        int f2963d;

        /* renamed from: e */
        int f2964e;

        /* renamed from: f */
        Object f2965f = null;

        /* renamed from: g */
        Object f2966g;

        /* renamed from: h */
        Object f2967h;

        /* renamed from: i */
        Object f2968i;

        /* renamed from: j */
        Object f2969j;

        /* renamed from: k */
        Object f2970k;

        /* renamed from: l */
        Boolean f2971l;

        /* renamed from: m */
        Boolean f2972m;

        /* renamed from: n */
        C0501m f2973n;

        /* renamed from: o */
        C0501m f2974o;

        /* renamed from: p */
        boolean f2975p;

        /* renamed from: q */
        C0577e f2976q;

        /* renamed from: r */
        boolean f2977r;

        C0575c() {
            Object obj = Fragment.f2907c0;
            this.f2966g = obj;
            this.f2967h = null;
            this.f2968i = obj;
            this.f2969j = null;
            this.f2970k = obj;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public static class C0576d extends RuntimeException {
        public C0576d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    interface C0577e {
        /* renamed from: a */
        void mo3727a();

        /* renamed from: b */
        void mo3728b();
    }

    public Fragment() {
        m3529N0();
    }

    /* renamed from: J */
    private C0575c m3528J() {
        if (this.f2923P == null) {
            this.f2923P = new C0575c();
        }
        return this.f2923P;
    }

    /* renamed from: N0 */
    private void m3529N0() {
        this.f2930W = new C0720x(this);
        this.f2934a0 = C1030a.m5982a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2930W.mo4256a(new C0715s() {
                /* renamed from: c */
                public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                    View view;
                    if (bVar == C0697n.C0699b.ON_STOP && (view = Fragment.this.f2920M) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: P0 */
    public static Fragment m3530P0(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0597f.m3794d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3581C2(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0576d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0576d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0576d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0576d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A2 */
    public void mo3577A2(View view) {
        m3528J().f2960a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public int mo3578B0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return 0;
        }
        return cVar.f2962c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public void mo3579B2(Animator animator) {
        m3528J().f2961b = animator;
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        this.f2918K = true;
    }

    /* renamed from: C2 */
    public void mo3581C2(Bundle bundle) {
        if (this.f2953x == null || !mo3649Z0()) {
            this.f2941l = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* renamed from: D0 */
    public final String mo3582D0(int i) {
        return mo3698s0().getString(i);
    }

    /* renamed from: D1 */
    public void mo3583D1() {
        this.f2918K = true;
    }

    /* renamed from: D2 */
    public void mo3584D2(Object obj) {
        m3528J().f2965f = obj;
    }

    /* renamed from: E0 */
    public final String mo3585E0(int i, Object... objArr) {
        return mo3698s0().getString(i, objArr);
    }

    /* renamed from: E1 */
    public LayoutInflater mo3586E1(Bundle bundle) {
        return mo3681m0(bundle);
    }

    /* renamed from: E2 */
    public void mo3587E2(Object obj) {
        m3528J().f2967h = obj;
    }

    /* renamed from: F0 */
    public final Fragment mo3588F0() {
        String str;
        Fragment fragment = this.f2942m;
        if (fragment != null) {
            return fragment;
        }
        C0602j jVar = this.f2953x;
        if (jVar == null || (str = this.f2943n) == null) {
            return null;
        }
        return jVar.mo3934W(str);
    }

    /* renamed from: F1 */
    public void mo3589F1(boolean z) {
    }

    /* renamed from: F2 */
    public void mo3590F2(boolean z) {
        if (this.f2916I != z) {
            this.f2916I = z;
            if (mo3622Q0() && !mo3629S0()) {
                this.f2954y.mo3760n();
            }
        }
    }

    /* renamed from: G0 */
    public final int mo3591G0() {
        return this.f2944o;
    }

    @Deprecated
    /* renamed from: G1 */
    public void mo3592G1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2918K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public void mo3593G2(boolean z) {
        m3528J().f2977r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3594H() {
        C0575c cVar = this.f2923P;
        C0577e eVar = null;
        if (cVar != null) {
            cVar.f2975p = false;
            C0577e eVar2 = cVar.f2976q;
            cVar.f2976q = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.mo3728b();
        }
    }

    /* renamed from: H1 */
    public void mo3595H1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2918K = true;
        C0598g<?> gVar = this.f2954y;
        Activity d = gVar == null ? null : gVar.mo3882d();
        if (d != null) {
            this.f2918K = false;
            mo3592G1(d, attributeSet, bundle);
        }
    }

    /* renamed from: H2 */
    public void mo3596H2(SavedState savedState) {
        Bundle bundle;
        if (this.f2953x == null) {
            if (savedState == null || (bundle = savedState.f2957g) == null) {
                bundle = null;
            }
            this.f2937h = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    /* renamed from: I */
    public void mo3597I(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2909B));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2910C));
        printWriter.print(" mTag=");
        printWriter.println(this.f2911D);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2936g);
        printWriter.print(" mWho=");
        printWriter.print(this.f2940k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2952w);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2946q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2947r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2948s);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2949t);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2912E);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2913F);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2917J);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2916I);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2914G);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2922O);
        if (this.f2953x != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2953x);
        }
        if (this.f2954y != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2954y);
        }
        if (this.f2908A != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2908A);
        }
        if (this.f2941l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2941l);
        }
        if (this.f2937h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2937h);
        }
        if (this.f2938i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2938i);
        }
        Fragment F0 = mo3588F0();
        if (F0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(F0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2944o);
        }
        if (mo3683n0() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo3683n0());
        }
        if (this.f2919L != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2919L);
        }
        if (this.f2920M != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2920M);
        }
        if (mo3619P() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3619P());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo3578B0());
        }
        if (mo3651a0() != null) {
            C4100a.m18148b(this).mo14192a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2955z + ":");
        C0602j jVar = this.f2955z;
        jVar.mo3923M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: I1 */
    public void mo3598I1(boolean z) {
    }

    /* renamed from: I2 */
    public void mo3599I2(boolean z) {
        if (this.f2917J != z) {
            this.f2917J = z;
            if (this.f2916I && mo3622Q0() && !mo3629S0()) {
                this.f2954y.mo3760n();
            }
        }
    }

    /* renamed from: J0 */
    public View mo3600J0() {
        return this.f2920M;
    }

    /* renamed from: J1 */
    public boolean mo3601J1(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J2 */
    public void mo3602J2(int i) {
        if (this.f2923P != null || i != 0) {
            m3528J().f2963d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public Fragment mo3603K(String str) {
        if (str.equals(this.f2940k)) {
            return this;
        }
        return this.f2955z.mo3940Z(str);
    }

    /* renamed from: K0 */
    public final SavedStateRegistry mo384K0() {
        return this.f2934a0.mo5700b();
    }

    /* renamed from: K1 */
    public void mo3604K1(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K2 */
    public void mo3605K2(int i) {
        if (this.f2923P != null || i != 0) {
            m3528J();
            this.f2923P.f2964e = i;
        }
    }

    /* renamed from: L */
    public final FragmentActivity mo3606L() {
        C0598g<?> gVar = this.f2954y;
        if (gVar == null) {
            return null;
        }
        return (FragmentActivity) gVar.mo3882d();
    }

    /* renamed from: L0 */
    public C0718v mo3607L0() {
        C0641t tVar = this.f2931X;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* renamed from: L1 */
    public void mo3608L1() {
        this.f2918K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L2 */
    public void mo3609L2(C0577e eVar) {
        m3528J();
        C0575c cVar = this.f2923P;
        C0577e eVar2 = cVar.f2976q;
        if (eVar != eVar2) {
            if (eVar == null || eVar2 == null) {
                if (cVar.f2975p) {
                    cVar.f2976q = eVar;
                }
                if (eVar != null) {
                    eVar.mo3727a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: M */
    public boolean mo3610M() {
        Boolean bool;
        C0575c cVar = this.f2923P;
        if (cVar == null || (bool = cVar.f2972m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: M1 */
    public void mo3611M1(boolean z) {
    }

    /* renamed from: M2 */
    public void mo3612M2(Object obj) {
        m3528J().f2968i = obj;
    }

    /* renamed from: N */
    public boolean mo3613N() {
        Boolean bool;
        C0575c cVar = this.f2923P;
        if (cVar == null || (bool = cVar.f2971l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: N1 */
    public void mo3614N1(Menu menu) {
    }

    /* renamed from: N2 */
    public void mo3615N2(boolean z) {
        this.f2914G = z;
        C0602j jVar = this.f2953x;
        if (jVar == null) {
            this.f2915H = true;
        } else if (z) {
            jVar.mo3949e(this);
        } else {
            jVar.mo3931S0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3616O0() {
        m3529N0();
        this.f2940k = UUID.randomUUID().toString();
        this.f2946q = false;
        this.f2947r = false;
        this.f2948s = false;
        this.f2949t = false;
        this.f2950u = false;
        this.f2952w = 0;
        this.f2953x = null;
        this.f2955z = new C0613k();
        this.f2954y = null;
        this.f2909B = 0;
        this.f2910C = 0;
        this.f2911D = null;
        this.f2912E = false;
        this.f2913F = false;
    }

    /* renamed from: O1 */
    public void mo3617O1(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O2 */
    public void mo3618O2(int i) {
        m3528J().f2962c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public View mo3619P() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2960a;
    }

    /* renamed from: P1 */
    public void mo3620P1(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: P2 */
    public void mo3621P2(Fragment fragment, int i) {
        C0602j jVar = this.f2953x;
        C0602j jVar2 = fragment != null ? fragment.f2953x : null;
        if (jVar == null || jVar2 == null || jVar == jVar2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.mo3588F0();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.f2943n = null;
                this.f2942m = null;
            } else if (this.f2953x == null || fragment.f2953x == null) {
                this.f2943n = null;
                this.f2942m = fragment;
            } else {
                this.f2943n = fragment.f2940k;
                this.f2942m = null;
            }
            this.f2944o = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    /* renamed from: Q0 */
    public final boolean mo3622Q0() {
        return this.f2954y != null && this.f2946q;
    }

    /* renamed from: Q1 */
    public void mo3623Q1() {
        this.f2918K = true;
    }

    @Deprecated
    /* renamed from: Q2 */
    public void mo3624Q2(boolean z) {
        if (!this.f2922O && z && this.f2936g < 3 && this.f2953x != null && mo3622Q0() && this.f2928U) {
            this.f2953x.mo3911E0(this);
        }
        this.f2922O = z;
        this.f2921N = this.f2936g < 3 && !z;
        if (this.f2937h != null) {
            this.f2939j = Boolean.valueOf(z);
        }
    }

    /* renamed from: R0 */
    public final boolean mo3625R0() {
        return this.f2913F;
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
    }

    /* renamed from: R2 */
    public void mo3627R2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo3631S2(intent, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public Animator mo3628S() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2961b;
    }

    /* renamed from: S0 */
    public final boolean mo3629S0() {
        return this.f2912E;
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        this.f2918K = true;
    }

    /* renamed from: S2 */
    public void mo3631S2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0598g<?> gVar = this.f2954y;
        if (gVar != null) {
            gVar.mo3758l(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public boolean mo3632T0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return false;
        }
        return cVar.f2977r;
    }

    /* renamed from: T1 */
    public void mo3633T1() {
        this.f2918K = true;
    }

    /* renamed from: T2 */
    public void mo3634T2(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo3637U2(intent, i, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public final boolean mo3635U0() {
        return this.f2952w > 0;
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
    }

    /* renamed from: U2 */
    public void mo3637U2(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C0598g<?> gVar = this.f2954y;
        if (gVar != null) {
            gVar.mo3758l(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: V */
    public final Bundle mo3638V() {
        return this.f2941l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public boolean mo3639V0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return false;
        }
        return cVar.f2975p;
    }

    /* renamed from: V1 */
    public void mo3640V1(Bundle bundle) {
        this.f2918K = true;
    }

    /* renamed from: V2 */
    public void mo3641V2(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        C0598g<?> gVar = this.f2954y;
        if (gVar != null) {
            gVar.mo3759m(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: W */
    public final C0602j mo3642W() {
        if (this.f2954y != null) {
            return this.f2955z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public void mo3643W1(Bundle bundle) {
        this.f2955z.mo3909D0();
        this.f2936g = 2;
        this.f2918K = false;
        mo3660d1(bundle);
        if (this.f2918K) {
            this.f2955z.mo3969r();
            return;
        }
        throw new C0642u("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: W2 */
    public void mo3644W2() {
        C0602j jVar = this.f2953x;
        if (jVar == null || jVar.f3090o == null) {
            m3528J().f2975p = false;
        } else if (Looper.myLooper() != this.f2953x.f3090o.mo3884f().getLooper()) {
            this.f2953x.f3090o.mo3884f().postAtFrontOfQueue(new C0573a());
        } else {
            mo3594H();
        }
    }

    /* renamed from: X0 */
    public final boolean mo3645X0() {
        return this.f2947r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public void mo3646X1() {
        this.f2955z.mo3952g(this.f2954y, new C0574b(), this);
        this.f2936g = 0;
        this.f2918K = false;
        mo3669h1(this.f2954y.mo3883e());
        if (!this.f2918K) {
            throw new C0642u("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: Y */
    public C0703o0.C0705b mo385Y() {
        if (this.f2953x != null) {
            if (this.f2933Z == null) {
                this.f2933Z = new C0687j0(mo3705u2().getApplication(), this, mo3638V());
            }
            return this.f2933Z;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public final boolean mo3647Y0() {
        Fragment p0 = mo3690p0();
        return p0 != null && (p0.mo3645X0() || p0.mo3647Y0());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void mo3648Y1(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2955z.mo3970s(configuration);
    }

    /* renamed from: Z0 */
    public final boolean mo3649Z0() {
        C0602j jVar = this.f2953x;
        if (jVar == null) {
            return false;
        }
        return jVar.mo3977v0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public boolean mo3650Z1(MenuItem menuItem) {
        if (this.f2912E) {
            return false;
        }
        if (!mo3677k1(menuItem) && !this.f2955z.mo3971t(menuItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public Context mo3651a0() {
        C0598g<?> gVar = this.f2954y;
        if (gVar == null) {
            return null;
        }
        return gVar.mo3883e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f2920M;
     */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3652a1() {
        /*
            r1 = this;
            boolean r0 = r1.mo3622Q0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.mo3629S0()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.f2920M
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.f2920M
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3652a1():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public void mo3653a2(Bundle bundle) {
        this.f2955z.mo3909D0();
        this.f2936g = 1;
        this.f2918K = false;
        this.f2934a0.mo5701c(bundle);
        mo3679l1(bundle);
        this.f2928U = true;
        if (this.f2918K) {
            this.f2930W.mo4268h(C0697n.C0699b.ON_CREATE);
            return;
        }
        throw new C0642u("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: b0 */
    public Object mo3654b0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2965f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public boolean mo3655b2(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2912E) {
            return false;
        }
        if (this.f2916I && this.f2917J) {
            z = true;
            mo3699s1(menu, menuInflater);
        }
        return z | this.f2955z.mo3976v(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C0501m mo3656c0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2973n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3657c1() {
        this.f2955z.mo3909D0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c2 */
    public void mo3658c2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2955z.mo3909D0();
        this.f2951v = true;
        this.f2931X = new C0641t();
        View t1 = mo3701t1(layoutInflater, viewGroup, bundle);
        this.f2920M = t1;
        if (t1 != null) {
            this.f2931X.mo4129b();
            this.f2932Y.mo4156o(this.f2931X);
        } else if (!this.f2931X.mo4130c()) {
            this.f2931X = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: d0 */
    public Object mo3659d0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2967h;
    }

    /* renamed from: d1 */
    public void mo3660d1(Bundle bundle) {
        this.f2918K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public void mo3661d2() {
        this.f2955z.mo3978w();
        this.f2930W.mo4268h(C0697n.C0699b.ON_DESTROY);
        this.f2936g = 0;
        this.f2918K = false;
        this.f2928U = false;
        mo3707v1();
        if (!this.f2918K) {
            throw new C0642u("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* renamed from: e1 */
    public void mo3662e1(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public void mo3663e2() {
        this.f2955z.mo3980x();
        if (this.f2920M != null) {
            this.f2931X.mo4128a(C0697n.C0699b.ON_DESTROY);
        }
        this.f2936g = 1;
        this.f2918K = false;
        mo3580C1();
        if (this.f2918K) {
            C4100a.m18148b(this).mo14193c();
            this.f2951v = false;
            return;
        }
        throw new C0642u("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Deprecated
    /* renamed from: f1 */
    public void mo3665f1(Activity activity) {
        this.f2918K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public C0501m mo3666g0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2974o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public void mo3667g2() {
        this.f2936g = -1;
        this.f2918K = false;
        mo3583D1();
        this.f2927T = null;
        if (!this.f2918K) {
            throw new C0642u("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2955z.mo3968q0()) {
            this.f2955z.mo3978w();
            this.f2955z = new C0613k();
        }
    }

    @Deprecated
    /* renamed from: h0 */
    public final C0602j mo3668h0() {
        return this.f2953x;
    }

    /* renamed from: h1 */
    public void mo3669h1(Context context) {
        this.f2918K = true;
        C0598g<?> gVar = this.f2954y;
        Activity d = gVar == null ? null : gVar.mo3882d();
        if (d != null) {
            this.f2918K = false;
            mo3665f1(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public LayoutInflater mo3670h2(Bundle bundle) {
        LayoutInflater E1 = mo3586E1(bundle);
        this.f2927T = E1;
        return E1;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public final Object mo3672i0() {
        C0598g<?> gVar = this.f2954y;
        if (gVar == null) {
            return null;
        }
        return gVar.mo3755i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i2 */
    public void mo3673i2() {
        onLowMemory();
        this.f2955z.mo3981y();
    }

    /* renamed from: j1 */
    public void mo3674j1(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j2 */
    public void mo3675j2(boolean z) {
        mo3598I1(z);
        this.f2955z.mo3982z(z);
    }

    /* renamed from: k0 */
    public final LayoutInflater mo3676k0() {
        LayoutInflater layoutInflater = this.f2927T;
        return layoutInflater == null ? mo3670h2((Bundle) null) : layoutInflater;
    }

    /* renamed from: k1 */
    public boolean mo3677k1(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k2 */
    public boolean mo3678k2(MenuItem menuItem) {
        if (this.f2912E) {
            return false;
        }
        if ((!this.f2916I || !this.f2917J || !mo3601J1(menuItem)) && !this.f2955z.mo3903A(menuItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        this.f2918K = true;
        mo3713y2(bundle);
        if (!this.f2955z.mo3975u0(1)) {
            this.f2955z.mo3974u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public void mo3680l2(Menu menu) {
        if (!this.f2912E) {
            if (this.f2916I && this.f2917J) {
                mo3604K1(menu);
            }
            this.f2955z.mo3905B(menu);
        }
    }

    @Deprecated
    /* renamed from: m0 */
    public LayoutInflater mo3681m0(Bundle bundle) {
        C0598g<?> gVar = this.f2954y;
        if (gVar != null) {
            LayoutInflater j = gVar.mo3756j();
            C3759g.m16092b(j, this.f2955z.mo3958i0());
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public void mo3682m2() {
        this.f2955z.mo3908D();
        if (this.f2920M != null) {
            this.f2931X.mo4128a(C0697n.C0699b.ON_PAUSE);
        }
        this.f2930W.mo4268h(C0697n.C0699b.ON_PAUSE);
        this.f2936g = 3;
        this.f2918K = false;
        mo3608L1();
        if (!this.f2918K) {
            throw new C0642u("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public int mo3683n0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return 0;
        }
        return cVar.f2963d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n2 */
    public void mo3684n2(boolean z) {
        mo3611M1(z);
        this.f2955z.mo3910E(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public int mo3685o0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return 0;
        }
        return cVar.f2964e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o2 */
    public boolean mo3686o2(Menu menu) {
        boolean z = false;
        if (this.f2912E) {
            return false;
        }
        if (this.f2916I && this.f2917J) {
            z = true;
            mo3614N1(menu);
        }
        return z | this.f2955z.mo3912F(menu);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2918K = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3705u2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2918K = true;
    }

    /* renamed from: p0 */
    public final Fragment mo3690p0() {
        return this.f2908A;
    }

    /* renamed from: p1 */
    public Animation mo3691p1(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public void mo3692p2() {
        boolean t0 = this.f2953x.mo3972t0(this);
        Boolean bool = this.f2945p;
        if (bool == null || bool.booleanValue() != t0) {
            this.f2945p = Boolean.valueOf(t0);
            mo3617O1(t0);
            this.f2955z.mo3914G();
        }
    }

    /* renamed from: q0 */
    public final C0602j mo3693q0() {
        C0602j jVar = this.f2953x;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: q1 */
    public Animator mo3694q1(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo3695q2() {
        this.f2955z.mo3909D0();
        this.f2955z.mo3928Q(true);
        this.f2936g = 4;
        this.f2918K = false;
        mo3623Q1();
        if (this.f2918K) {
            C0720x xVar = this.f2930W;
            C0697n.C0699b bVar = C0697n.C0699b.ON_RESUME;
            xVar.mo4268h(bVar);
            if (this.f2920M != null) {
                this.f2931X.mo4128a(bVar);
            }
            this.f2955z.mo3916H();
            return;
        }
        throw new C0642u("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: r0 */
    public Object mo3696r0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f2968i;
        return obj == f2907c0 ? mo3659d0() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public void mo3697r2(Bundle bundle) {
        mo3626R1(bundle);
        this.f2934a0.mo5702d(bundle);
        Parcelable W0 = this.f2955z.mo3935W0();
        if (W0 != null) {
            bundle.putParcelable("android:support:fragments", W0);
        }
    }

    /* renamed from: s0 */
    public final Resources mo3698s0() {
        return mo3708v2().getResources();
    }

    /* renamed from: s1 */
    public void mo3699s1(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo3700s2() {
        this.f2955z.mo3909D0();
        this.f2955z.mo3928Q(true);
        this.f2936g = 3;
        this.f2918K = false;
        mo3630S1();
        if (this.f2918K) {
            C0720x xVar = this.f2930W;
            C0697n.C0699b bVar = C0697n.C0699b.ON_START;
            xVar.mo4268h(bVar);
            if (this.f2920M != null) {
                this.f2931X.mo4128a(bVar);
            }
            this.f2955z.mo3918I();
            return;
        }
        throw new C0642u("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2935b0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public void mo3702t2() {
        this.f2955z.mo3921K();
        if (this.f2920M != null) {
            this.f2931X.mo4128a(C0697n.C0699b.ON_STOP);
        }
        this.f2930W.mo4268h(C0697n.C0699b.ON_STOP);
        this.f2936g = 2;
        this.f2918K = false;
        mo3633T1();
        if (!this.f2918K) {
            throw new C0642u("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2940k);
        sb.append(")");
        if (this.f2909B != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2909B));
        }
        if (this.f2911D != null) {
            sb.append(" ");
            sb.append(this.f2911D);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u0 */
    public final boolean mo3704u0() {
        return this.f2914G;
    }

    /* renamed from: u2 */
    public final FragmentActivity mo3705u2() {
        FragmentActivity L = mo3606L();
        if (L != null) {
            return L;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: v */
    public C0697n mo390v() {
        return this.f2930W;
    }

    /* renamed from: v0 */
    public Object mo3706v0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f2966g;
        return obj == f2907c0 ? mo3654b0() : obj;
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        this.f2918K = true;
    }

    /* renamed from: v2 */
    public final Context mo3708v2() {
        Context a0 = mo3651a0();
        if (a0 != null) {
            return a0;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: w0 */
    public Object mo3709w0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        return cVar.f2969j;
    }

    /* renamed from: w2 */
    public final Fragment mo3710w2() {
        Fragment p0 = mo3690p0();
        if (p0 != null) {
            return p0;
        }
        if (mo3651a0() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + mo3651a0());
    }

    /* renamed from: x2 */
    public final View mo3711x2() {
        View J0 = mo3600J0();
        if (J0 != null) {
            return J0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: y0 */
    public Object mo3712y0() {
        C0575c cVar = this.f2923P;
        if (cVar == null) {
            return null;
        }
        Object obj = cVar.f2970k;
        return obj == f2907c0 ? mo3709w0() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public void mo3713y2(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2955z.mo3933U0(parcelable);
            this.f2955z.mo3974u();
        }
    }

    /* renamed from: z0 */
    public C0710p0 mo392z0() {
        C0602j jVar = this.f2953x;
        if (jVar != null) {
            return jVar.mo3964n0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: z1 */
    public void mo3714z1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public final void mo3715z2(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2938i;
        if (sparseArray != null) {
            this.f2920M.restoreHierarchyState(sparseArray);
            this.f2938i = null;
        }
        this.f2918K = false;
        mo3640V1(bundle);
        if (!this.f2918K) {
            throw new C0642u("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2920M != null) {
            this.f2931X.mo4128a(C0697n.C0699b.ON_CREATE);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0572a();

        /* renamed from: g */
        final Bundle f2957g;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        static class C0572a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0572a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Bundle bundle) {
            this.f2957g = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2957g);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2957g = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }
}
