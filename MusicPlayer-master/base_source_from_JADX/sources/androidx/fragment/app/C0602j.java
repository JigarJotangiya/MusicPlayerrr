package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0084b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0588c;
import androidx.fragment.app.C0622q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0710p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p082e.p098e.C3467b;
import p082e.p109h.p115l.C3644b;
import p082e.p109h.p118o.C3697c;
import p082e.p136n.C4094b;

/* renamed from: androidx.fragment.app.j */
/* compiled from: FragmentManager */
public abstract class C0602j {

    /* renamed from: F */
    private static boolean f3070F = false;

    /* renamed from: A */
    private ArrayList<Boolean> f3071A;

    /* renamed from: B */
    private ArrayList<Fragment> f3072B;

    /* renamed from: C */
    private ArrayList<C0612j> f3073C;

    /* renamed from: D */
    private C0614l f3074D;

    /* renamed from: E */
    private Runnable f3075E = new C0606d();

    /* renamed from: a */
    private final ArrayList<C0610h> f3076a = new ArrayList<>();

    /* renamed from: b */
    private boolean f3077b;

    /* renamed from: c */
    private final C0619o f3078c = new C0619o();

    /* renamed from: d */
    ArrayList<C0583a> f3079d;

    /* renamed from: e */
    private ArrayList<Fragment> f3080e;

    /* renamed from: f */
    private final C0599h f3081f = new C0599h(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f3082g;

    /* renamed from: h */
    private final C0084b f3083h = new C0603a(false);

    /* renamed from: i */
    private final AtomicInteger f3084i = new AtomicInteger();

    /* renamed from: j */
    private ArrayList<C0609g> f3085j;

    /* renamed from: k */
    private ConcurrentHashMap<Fragment, HashSet<C3644b>> f3086k = new ConcurrentHashMap<>();

    /* renamed from: l */
    private final C0622q.C0629g f3087l = new C0604b();

    /* renamed from: m */
    private final C0600i f3088m = new C0600i(this);

    /* renamed from: n */
    int f3089n = -1;

    /* renamed from: o */
    C0598g<?> f3090o;

    /* renamed from: p */
    C0595d f3091p;

    /* renamed from: q */
    private Fragment f3092q;

    /* renamed from: r */
    Fragment f3093r;

    /* renamed from: s */
    private C0597f f3094s = null;

    /* renamed from: t */
    private C0597f f3095t = new C0605c();

    /* renamed from: u */
    private boolean f3096u;

    /* renamed from: v */
    private boolean f3097v;

    /* renamed from: w */
    private boolean f3098w;

    /* renamed from: x */
    private boolean f3099x;

    /* renamed from: y */
    private boolean f3100y;

    /* renamed from: z */
    private ArrayList<C0583a> f3101z;

    /* renamed from: androidx.fragment.app.j$a */
    /* compiled from: FragmentManager */
    class C0603a extends C0084b {
        C0603a(boolean z) {
            super(z);
        }

        /* renamed from: b */
        public void mo400b() {
            C0602j.this.mo3965o0();
        }
    }

    /* renamed from: androidx.fragment.app.j$b */
    /* compiled from: FragmentManager */
    class C0604b implements C0622q.C0629g {
        C0604b() {
        }

        /* renamed from: a */
        public void mo3984a(Fragment fragment, C3644b bVar) {
            if (!bVar.mo12906b()) {
                C0602j.this.mo3927P0(fragment, bVar);
            }
        }

        /* renamed from: b */
        public void mo3985b(Fragment fragment, C3644b bVar) {
            C0602j.this.mo3945c(fragment, bVar);
        }
    }

    /* renamed from: androidx.fragment.app.j$c */
    /* compiled from: FragmentManager */
    class C0605c extends C0597f {
        C0605c() {
        }

        /* renamed from: a */
        public Fragment mo3881a(ClassLoader classLoader, String str) {
            C0598g<?> gVar = C0602j.this.f3090o;
            return gVar.mo3856a(gVar.mo3883e(), str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.j$d */
    /* compiled from: FragmentManager */
    class C0606d implements Runnable {
        C0606d() {
        }

        public void run() {
            C0602j.this.mo3928Q(true);
        }
    }

    /* renamed from: androidx.fragment.app.j$e */
    /* compiled from: FragmentManager */
    class C0607e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3106a;

        /* renamed from: b */
        final /* synthetic */ View f3107b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3108c;

        C0607e(C0602j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3106a = viewGroup;
            this.f3107b = view;
            this.f3108c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3106a.endViewTransition(this.f3107b);
            animator.removeListener(this);
            Fragment fragment = this.f3108c;
            View view = fragment.f2920M;
            if (view != null && fragment.f2912E) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.j$f */
    /* compiled from: FragmentManager */
    public static abstract class C0608f {
        /* renamed from: a */
        public void mo3988a(C0602j jVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo3989b(C0602j jVar, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void mo3990c(C0602j jVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo3991d(C0602j jVar, Fragment fragment) {
        }

        /* renamed from: e */
        public void mo3992e(C0602j jVar, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo3993f(C0602j jVar, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo3994g(C0602j jVar, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void mo3995h(C0602j jVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo3996i(C0602j jVar, Fragment fragment) {
        }

        /* renamed from: j */
        public void mo3997j(C0602j jVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo3998k(C0602j jVar, Fragment fragment) {
        }

        /* renamed from: l */
        public void mo3999l(C0602j jVar, Fragment fragment) {
        }

        /* renamed from: m */
        public void mo4000m(C0602j jVar, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void mo4001n(C0602j jVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.j$g */
    /* compiled from: FragmentManager */
    public interface C0609g {
        /* renamed from: a */
        void mo4002a();
    }

    /* renamed from: androidx.fragment.app.j$h */
    /* compiled from: FragmentManager */
    interface C0610h {
        /* renamed from: a */
        boolean mo3814a(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.j$i */
    /* compiled from: FragmentManager */
    private class C0611i implements C0610h {

        /* renamed from: a */
        final String f3109a;

        /* renamed from: b */
        final int f3110b;

        /* renamed from: c */
        final int f3111c;

        C0611i(String str, int i, int i2) {
            this.f3109a = str;
            this.f3110b = i;
            this.f3111c = i2;
        }

        /* renamed from: a */
        public boolean mo3814a(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0602j.this.f3093r;
            if (fragment != null && this.f3110b < 0 && this.f3109a == null && fragment.mo3642W().mo3919I0()) {
                return false;
            }
            return C0602j.this.mo3922L0(arrayList, arrayList2, this.f3109a, this.f3110b, this.f3111c);
        }
    }

    /* renamed from: androidx.fragment.app.j$j */
    /* compiled from: FragmentManager */
    static class C0612j implements Fragment.C0577e {

        /* renamed from: a */
        final boolean f3113a;

        /* renamed from: b */
        final C0583a f3114b;

        /* renamed from: c */
        private int f3115c;

        C0612j(C0583a aVar, boolean z) {
            this.f3113a = z;
            this.f3114b = aVar;
        }

        /* renamed from: a */
        public void mo3727a() {
            this.f3115c++;
        }

        /* renamed from: b */
        public void mo3728b() {
            int i = this.f3115c - 1;
            this.f3115c = i;
            if (i == 0) {
                this.f3114b.f3022r.mo3939Y0();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4003c() {
            C0583a aVar = this.f3114b;
            aVar.f3022r.mo3963n(aVar, this.f3113a, false, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4004d() {
            boolean z = this.f3115c > 0;
            for (Fragment next : this.f3114b.f3022r.mo3956h0()) {
                next.mo3609L2((Fragment.C0577e) null);
                if (z && next.mo3639V0()) {
                    next.mo3644W2();
                }
            }
            C0583a aVar = this.f3114b;
            aVar.f3022r.mo3963n(aVar, this.f3113a, !z, true);
        }

        /* renamed from: e */
        public boolean mo4005e() {
            return this.f3115c == 0;
        }
    }

    /* renamed from: C */
    private void m3825C(Fragment fragment) {
        if (fragment != null && fragment.equals(mo3934W(fragment.f2940k))) {
            fragment.mo3692p2();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: J */
    private void m3826J(int i) {
        try {
            this.f3077b = true;
            this.f3078c.mo4051d(i);
            mo3904A0(i, false);
            this.f3077b = false;
            mo3928Q(true);
        } catch (Throwable th) {
            this.f3077b = false;
            throw th;
        }
    }

    /* renamed from: K0 */
    private boolean m3827K0(String str, int i, int i2) {
        mo3928Q(false);
        m3831P(true);
        Fragment fragment = this.f3093r;
        if (fragment != null && i < 0 && str == null && fragment.mo3642W().mo3919I0()) {
            return true;
        }
        boolean L0 = mo3922L0(this.f3101z, this.f3071A, str, i, i2);
        if (L0) {
            this.f3077b = true;
            try {
                m3832R0(this.f3101z, this.f3071A);
            } finally {
                m3849m();
            }
        }
        m3846h1();
        m3828L();
        this.f3078c.mo4049b();
        return L0;
    }

    /* renamed from: L */
    private void m3828L() {
        if (this.f3100y) {
            this.f3100y = false;
            m3843e1();
        }
    }

    /* renamed from: M0 */
    private int m3829M0(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C3467b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0583a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (aVar.mo3810H() && !aVar.mo3809F(arrayList, i4 + 1, i2)) {
                if (this.f3073C == null) {
                    this.f3073C = new ArrayList<>();
                }
                C0612j jVar = new C0612j(aVar, booleanValue);
                this.f3073C.add(jVar);
                aVar.mo3812J(jVar);
                if (booleanValue) {
                    aVar.mo3804A();
                } else {
                    aVar.mo3805B(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m3838a(bVar);
            }
        }
        return i3;
    }

    /* renamed from: N */
    private void m3830N() {
        if (!this.f3086k.isEmpty()) {
            for (Fragment next : this.f3086k.keySet()) {
                m3847j(next);
                mo3907C0(next, next.mo3578B0());
            }
        }
    }

    /* renamed from: P */
    private void m3831P(boolean z) {
        if (this.f3077b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3090o == null) {
            if (this.f3099x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3090o.mo3884f().getLooper()) {
            if (!z) {
                m3848l();
            }
            if (this.f3101z == null) {
                this.f3101z = new ArrayList<>();
                this.f3071A = new ArrayList<>();
            }
            this.f3077b = true;
            try {
                m3836V((ArrayList<C0583a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f3077b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: R0 */
    private void m3832R0(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m3836V(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f3150p) {
                        if (i2 != i) {
                            m3834T(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3150p) {
                                i2++;
                            }
                        }
                        m3834T(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m3834T(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: S */
    private static void m3833S(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0583a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo3827w(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo3805B(z);
            } else {
                aVar.mo3827w(1);
                aVar.mo3804A();
            }
            i++;
        }
    }

    /* renamed from: T */
    private void m3834T(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0583a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList3.get(i4).f3150p;
        ArrayList<Fragment> arrayList5 = this.f3072B;
        if (arrayList5 == null) {
            this.f3072B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f3072B.addAll(this.f3078c.mo4060m());
        Fragment l0 = mo3962l0();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0583a aVar = arrayList3.get(i6);
            if (!arrayList4.get(i6).booleanValue()) {
                l0 = aVar.mo3806C(this.f3072B, l0);
            } else {
                l0 = aVar.mo3813K(this.f3072B, l0);
            }
            z2 = z2 || aVar.f3141g;
        }
        this.f3072B.clear();
        if (!z) {
            C0622q.m4047C(this, arrayList, arrayList2, i, i2, false, this.f3087l);
        }
        m3833S(arrayList, arrayList2, i, i2);
        if (z) {
            C3467b bVar = new C3467b();
            m3838a(bVar);
            int M0 = m3829M0(arrayList, arrayList2, i, i2, bVar);
            m3856y0(bVar);
            i3 = M0;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0622q.m4047C(this, arrayList, arrayList2, i, i3, true, this.f3087l);
            mo3904A0(this.f3089n, true);
        }
        while (i4 < i5) {
            C0583a aVar2 = arrayList3.get(i4);
            if (arrayList4.get(i4).booleanValue() && aVar2.f3024t >= 0) {
                aVar2.f3024t = -1;
            }
            aVar2.mo3811I();
            i4++;
        }
        if (z2) {
            m3835T0();
        }
    }

    /* renamed from: T0 */
    private void m3835T0() {
        if (this.f3085j != null) {
            for (int i = 0; i < this.f3085j.size(); i++) {
                this.f3085j.get(i).mo4002a();
            }
        }
    }

    /* renamed from: V */
    private void m3836V(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0612j> arrayList3 = this.f3073C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0612j jVar = this.f3073C.get(i);
            if (arrayList != null && !jVar.f3113a && (indexOf2 = arrayList.indexOf(jVar.f3114b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f3073C.remove(i);
                i--;
                size--;
                jVar.mo4003c();
            } else if (jVar.mo4005e() || (arrayList != null && jVar.f3114b.mo3809F(arrayList, 0, arrayList.size()))) {
                this.f3073C.remove(i);
                i--;
                size--;
                if (arrayList == null || jVar.f3113a || (indexOf = arrayList.indexOf(jVar.f3114b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    jVar.mo4004d();
                } else {
                    jVar.mo4003c();
                }
            }
            i++;
        }
    }

    /* renamed from: V0 */
    static int m3837V0(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: a */
    private void m3838a(C3467b<Fragment> bVar) {
        int i = this.f3089n;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (Fragment next : this.f3078c.mo4060m()) {
                if (next.f2936g < min) {
                    mo3907C0(next, min);
                    if (next.f2920M != null && !next.f2912E && next.f2924Q) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: a0 */
    private void m3839a0() {
        if (this.f3073C != null) {
            while (!this.f3073C.isEmpty()) {
                this.f3073C.remove(0).mo4004d();
            }
        }
    }

    /* renamed from: b0 */
    private boolean m3840b0(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3076a) {
            if (this.f3076a.isEmpty()) {
                return false;
            }
            int size = this.f3076a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f3076a.get(i).mo3814a(arrayList, arrayList2);
            }
            this.f3076a.clear();
            this.f3090o.mo3884f().removeCallbacks(this.f3075E);
            return z;
        }
    }

    /* renamed from: c1 */
    private void m3841c1(Fragment fragment) {
        ViewGroup f0 = m3844f0(fragment);
        if (f0 != null) {
            int i = C4094b.visible_removing_fragment_view_tag;
            if (f0.getTag(i) == null) {
                f0.setTag(i, fragment);
            }
            ((Fragment) f0.getTag(i)).mo3602J2(fragment.mo3683n0());
        }
    }

    /* renamed from: d0 */
    private C0614l m3842d0(Fragment fragment) {
        return this.f3074D.mo4012i(fragment);
    }

    /* renamed from: e1 */
    private void m3843e1() {
        for (Fragment next : this.f3078c.mo4058k()) {
            if (next != null) {
                mo3911E0(next);
            }
        }
    }

    /* renamed from: f0 */
    private ViewGroup m3844f0(Fragment fragment) {
        if (fragment.f2910C > 0 && this.f3091p.mo3726c()) {
            View b = this.f3091p.mo3725b(fragment.f2910C);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    /* renamed from: f1 */
    private void m3845f1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C3697c("FragmentManager"));
        C0598g<?> gVar = this.f3090o;
        if (gVar != null) {
            try {
                gVar.mo3754h("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo3923M("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo3946c0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo3972t0(r3.f3092q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo404f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3083h;
     */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3846h1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.j$h> r0 = r3.f3076a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.j$h> r1 = r3.f3076a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f3083h     // Catch:{ all -> 0x002a }
            r1.mo404f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f3083h
            int r1 = r3.mo3946c0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3092q
            boolean r1 = r3.mo3972t0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo404f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0602j.m3846h1():void");
    }

    /* renamed from: j */
    private void m3847j(Fragment fragment) {
        HashSet hashSet = this.f3086k.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C3644b) it.next()).mo12905a();
            }
            hashSet.clear();
            m3852p(fragment);
            this.f3086k.remove(fragment);
        }
    }

    /* renamed from: l */
    private void m3848l() {
        if (mo3977v0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: m */
    private void m3849m() {
        this.f3077b = false;
        this.f3071A.clear();
        this.f3101z.clear();
    }

    /* renamed from: m0 */
    static Fragment m3850m0(View view) {
        Object tag = view.getTag(C4094b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: o */
    private void m3851o(Fragment fragment) {
        Animator animator;
        if (fragment.f2920M != null) {
            C0588c.C0593d b = C0588c.m3761b(this.f3090o.mo3883e(), this.f3091p, fragment, !fragment.f2912E);
            if (b == null || (animator = b.f3053b) == null) {
                if (b != null) {
                    fragment.f2920M.startAnimation(b.f3052a);
                    b.f3052a.start();
                }
                fragment.f2920M.setVisibility((!fragment.f2912E || fragment.mo3632T0()) ? 0 : 8);
                if (fragment.mo3632T0()) {
                    fragment.mo3593G2(false);
                }
            } else {
                animator.setTarget(fragment.f2920M);
                if (!fragment.f2912E) {
                    fragment.f2920M.setVisibility(0);
                } else if (fragment.mo3632T0()) {
                    fragment.mo3593G2(false);
                } else {
                    ViewGroup viewGroup = fragment.f2919L;
                    View view = fragment.f2920M;
                    viewGroup.startViewTransition(view);
                    b.f3053b.addListener(new C0607e(this, viewGroup, view, fragment));
                }
                b.f3053b.start();
            }
        }
        if (fragment.f2946q && m3854s0(fragment)) {
            this.f3096u = true;
        }
        fragment.f2925R = false;
        fragment.mo3589F1(fragment.f2912E);
    }

    /* renamed from: p */
    private void m3852p(Fragment fragment) {
        fragment.mo3663e2();
        this.f3088m.mo3900n(fragment, false);
        fragment.f2919L = null;
        fragment.f2920M = null;
        fragment.f2931X = null;
        fragment.f2932Y.mo4156o(null);
        fragment.f2949t = false;
    }

    /* renamed from: r0 */
    static boolean m3853r0(int i) {
        return f3070F || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: s0 */
    private boolean m3854s0(Fragment fragment) {
        return (fragment.f2916I && fragment.f2917J) || fragment.f2955z.mo3960k();
    }

    /* renamed from: x0 */
    private void m3855x0(C0616m mVar) {
        Fragment i = mVar.mo4028i();
        if (this.f3078c.mo4050c(i.f2940k)) {
            if (m3853r0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + i);
            }
            this.f3078c.mo4062o(mVar);
            mo3931S0(i);
        }
    }

    /* renamed from: y0 */
    private void m3856y0(C3467b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment y = bVar.mo12297y(i);
            if (!y.f2946q) {
                View x2 = y.mo3711x2();
                y.f2926S = x2.getAlpha();
                x2.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo3903A(MenuItem menuItem) {
        if (this.f3089n < 1) {
            return false;
        }
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null && next.mo3678k2(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo3904A0(int i, boolean z) {
        C0598g<?> gVar;
        if (this.f3090o == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3089n) {
            this.f3089n = i;
            for (Fragment z0 : this.f3078c.mo4060m()) {
                mo3983z0(z0);
            }
            for (Fragment next : this.f3078c.mo4058k()) {
                if (next != null && !next.f2924Q) {
                    mo3983z0(next);
                }
            }
            m3843e1();
            if (this.f3096u && (gVar = this.f3090o) != null && this.f3089n == 4) {
                gVar.mo3760n();
                this.f3096u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo3905B(Menu menu) {
        if (this.f3089n >= 1) {
            for (Fragment next : this.f3078c.mo4060m()) {
                if (next != null) {
                    next.mo3680l2(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo3906B0(Fragment fragment) {
        mo3907C0(fragment, this.f3089n);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r2 != 3) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3907C0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            androidx.fragment.app.o r0 = r12.f3078c
            java.lang.String r1 = r13.f2940k
            androidx.fragment.app.m r0 = r0.mo4059l(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.m r0 = new androidx.fragment.app.m
            androidx.fragment.app.i r2 = r12.f3088m
            r0.<init>(r2, r13)
            r0.mo4036r(r1)
        L_0x0015:
            int r2 = r0.mo4022c()
            int r14 = java.lang.Math.min(r14, r2)
            int r2 = r13.f2936g
            r3 = 0
            java.lang.String r4 = "FragmentManager"
            r5 = -1
            r6 = 2
            r7 = 3
            if (r2 > r14) goto L_0x0102
            if (r2 >= r14) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<e.h.l.b>> r2 = r12.f3086k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            r12.m3847j(r13)
        L_0x0034:
            int r2 = r13.f2936g
            if (r2 == r5) goto L_0x0042
            if (r2 == 0) goto L_0x00df
            if (r2 == r1) goto L_0x00e4
            if (r2 == r6) goto L_0x00f6
            if (r2 == r7) goto L_0x00fb
            goto L_0x01f5
        L_0x0042:
            if (r14 <= r5) goto L_0x00df
            boolean r2 = m3853r0(r7)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x005e:
            androidx.fragment.app.Fragment r2 = r13.f2942m
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r2 == 0) goto L_0x00a6
            java.lang.String r11 = r2.f2940k
            androidx.fragment.app.Fragment r11 = r12.mo3934W(r11)
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0086
            androidx.fragment.app.Fragment r2 = r13.f2942m
            int r11 = r2.f2936g
            if (r11 >= r1) goto L_0x007d
            r12.mo3907C0(r2, r1)
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r13.f2942m
            java.lang.String r2 = r2.f2940k
            r13.f2943n = r2
            r13.f2942m = r3
            goto L_0x00a6
        L_0x0086:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.f2942m
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00a6:
            java.lang.String r2 = r13.f2943n
            if (r2 == 0) goto L_0x00d8
            androidx.fragment.app.Fragment r2 = r12.mo3934W(r2)
            if (r2 == 0) goto L_0x00b8
            int r3 = r2.f2936g
            if (r3 >= r1) goto L_0x00d8
            r12.mo3907C0(r2, r1)
            goto L_0x00d8
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.f2943n
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d8:
            androidx.fragment.app.g<?> r2 = r12.f3090o
            androidx.fragment.app.Fragment r3 = r12.f3092q
            r0.mo4021b(r2, r12, r3)
        L_0x00df:
            if (r14 <= 0) goto L_0x00e4
            r0.mo4023d()
        L_0x00e4:
            if (r14 <= r5) goto L_0x00e9
            r0.mo4027h()
        L_0x00e9:
            if (r14 <= r1) goto L_0x00f6
            androidx.fragment.app.d r1 = r12.f3091p
            r0.mo4024e(r1)
            r0.mo4020a()
            r0.mo4031l()
        L_0x00f6:
            if (r14 <= r6) goto L_0x00fb
            r0.mo4037s()
        L_0x00fb:
            if (r14 <= r7) goto L_0x01f5
            r0.mo4032m()
            goto L_0x01f5
        L_0x0102:
            if (r2 <= r14) goto L_0x01f5
            if (r2 == 0) goto L_0x01ec
            r8 = 0
            if (r2 == r1) goto L_0x01ab
            if (r2 == r6) goto L_0x011c
            if (r2 == r7) goto L_0x0117
            r9 = 4
            if (r2 == r9) goto L_0x0112
            goto L_0x01f5
        L_0x0112:
            if (r14 >= r9) goto L_0x0117
            r0.mo4029j()
        L_0x0117:
            if (r14 >= r7) goto L_0x011c
            r0.mo4038t()
        L_0x011c:
            if (r14 >= r6) goto L_0x01ab
            boolean r2 = m3853r0(r7)
            if (r2 == 0) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x0138:
            android.view.View r2 = r13.f2920M
            if (r2 == 0) goto L_0x014b
            androidx.fragment.app.g<?> r2 = r12.f3090o
            boolean r2 = r2.mo3757k(r13)
            if (r2 == 0) goto L_0x014b
            android.util.SparseArray<android.os.Parcelable> r2 = r13.f2938i
            if (r2 != 0) goto L_0x014b
            r0.mo4035q()
        L_0x014b:
            android.view.View r2 = r13.f2920M
            if (r2 == 0) goto L_0x019c
            android.view.ViewGroup r6 = r13.f2919L
            if (r6 == 0) goto L_0x019c
            r6.endViewTransition(r2)
            android.view.View r2 = r13.f2920M
            r2.clearAnimation()
            boolean r2 = r13.mo3647Y0()
            if (r2 != 0) goto L_0x019c
            int r2 = r12.f3089n
            r6 = 0
            if (r2 <= r5) goto L_0x0184
            boolean r2 = r12.f3099x
            if (r2 != 0) goto L_0x0184
            android.view.View r2 = r13.f2920M
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0184
            float r2 = r13.f2926S
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
            androidx.fragment.app.g<?> r2 = r12.f3090o
            android.content.Context r2 = r2.mo3883e()
            androidx.fragment.app.d r3 = r12.f3091p
            androidx.fragment.app.c$d r3 = androidx.fragment.app.C0588c.m3761b(r2, r3, r13, r8)
        L_0x0184:
            r13.f2926S = r6
            android.view.ViewGroup r2 = r13.f2919L
            android.view.View r5 = r13.f2920M
            if (r3 == 0) goto L_0x0194
            r13.mo3618O2(r14)
            androidx.fragment.app.q$g r6 = r12.f3087l
            androidx.fragment.app.C0588c.m3760a(r13, r3, r6)
        L_0x0194:
            r2.removeView(r5)
            android.view.ViewGroup r3 = r13.f2919L
            if (r2 == r3) goto L_0x019c
            return
        L_0x019c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<e.h.l.b>> r2 = r12.f3086k
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L_0x01a8
            r12.m3852p(r13)
            goto L_0x01ab
        L_0x01a8:
            r13.mo3618O2(r14)
        L_0x01ab:
            if (r14 >= r1) goto L_0x01ec
            boolean r2 = r13.f2947r
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r13.mo3635U0()
            if (r2 != 0) goto L_0x01b8
            r8 = 1
        L_0x01b8:
            if (r8 != 0) goto L_0x01d6
            androidx.fragment.app.l r2 = r12.f3074D
            boolean r2 = r2.mo4017o(r13)
            if (r2 == 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.String r2 = r13.f2943n
            if (r2 == 0) goto L_0x01d9
            androidx.fragment.app.Fragment r2 = r12.mo3934W(r2)
            if (r2 == 0) goto L_0x01d9
            boolean r3 = r2.mo3704u0()
            if (r3 == 0) goto L_0x01d9
            r13.f2942m = r2
            goto L_0x01d9
        L_0x01d6:
            r12.m3855x0(r0)
        L_0x01d9:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<e.h.l.b>> r2 = r12.f3086k
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x01e5
            r13.mo3618O2(r14)
            goto L_0x01ed
        L_0x01e5:
            androidx.fragment.app.g<?> r1 = r12.f3090o
            androidx.fragment.app.l r2 = r12.f3074D
            r0.mo4025f(r1, r2)
        L_0x01ec:
            r1 = r14
        L_0x01ed:
            if (r1 >= 0) goto L_0x01f4
            androidx.fragment.app.l r14 = r12.f3074D
            r0.mo4026g(r14)
        L_0x01f4:
            r14 = r1
        L_0x01f5:
            int r0 = r13.f2936g
            if (r0 == r14) goto L_0x0227
            boolean r0 = m3853r0(r7)
            if (r0 == 0) goto L_0x0225
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.f2936g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0225:
            r13.f2936g = r14
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0602j.mo3907C0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo3908D() {
        m3826J(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo3909D0() {
        this.f3097v = false;
        this.f3098w = false;
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null) {
                next.mo3657c1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo3910E(boolean z) {
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null) {
                next.mo3684n2(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo3911E0(Fragment fragment) {
        if (!fragment.f2921N) {
            return;
        }
        if (this.f3077b) {
            this.f3100y = true;
            return;
        }
        fragment.f2921N = false;
        mo3907C0(fragment, this.f3089n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo3912F(Menu menu) {
        boolean z = false;
        if (this.f3089n < 1) {
            return false;
        }
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null && next.mo3686o2(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F0 */
    public void mo3913F0() {
        mo3925O(new C0611i((String) null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo3914G() {
        m3846h1();
        m3825C(this.f3093r);
    }

    /* renamed from: G0 */
    public void mo3915G0(int i, int i2) {
        if (i >= 0) {
            mo3925O(new C0611i((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo3916H() {
        this.f3097v = false;
        this.f3098w = false;
        m3826J(4);
    }

    /* renamed from: H0 */
    public void mo3917H0(String str, int i) {
        mo3925O(new C0611i(str, -1, i), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3918I() {
        this.f3097v = false;
        this.f3098w = false;
        m3826J(3);
    }

    /* renamed from: I0 */
    public boolean mo3919I0() {
        return m3827K0((String) null, -1, 0);
    }

    /* renamed from: J0 */
    public boolean mo3920J0(String str, int i) {
        return m3827K0(str, -1, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo3921K() {
        this.f3098w = true;
        m3826J(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean mo3922L0(ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0583a> arrayList3 = this.f3079d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3079d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0583a aVar = this.f3079d.get(size2);
                    if ((str != null && str.equals(aVar.mo3807D())) || (i >= 0 && i == aVar.f3024t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0583a aVar2 = this.f3079d.get(size2);
                        if ((str == null || !str.equals(aVar2.mo3807D())) && (i < 0 || i != aVar2.f3024t)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f3079d.size() - 1) {
                return false;
            }
            for (int size3 = this.f3079d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f3079d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: M */
    public void mo3923M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3078c.mo4052e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f3080e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f3080e.get(i).toString());
            }
        }
        ArrayList<C0583a> arrayList2 = this.f3079d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0583a aVar = this.f3079d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo3829y(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3084i.get());
        synchronized (this.f3076a) {
            int size3 = this.f3076a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f3076a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3090o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3091p);
        if (this.f3092q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3092q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3089n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3097v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3098w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3099x);
        if (this.f3096u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3096u);
        }
    }

    /* renamed from: N0 */
    public void mo3924N0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f2953x == this) {
            bundle.putString(str, fragment.f2940k);
            return;
        }
        m3845f1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3925O(C0610h hVar, boolean z) {
        if (!z) {
            if (this.f3090o != null) {
                m3848l();
            } else if (this.f3099x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3076a) {
            if (this.f3090o != null) {
                this.f3076a.add(hVar);
                mo3939Y0();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: O0 */
    public void mo3926O0(C0608f fVar, boolean z) {
        this.f3088m.mo3901o(fVar, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo3927P0(Fragment fragment, C3644b bVar) {
        HashSet hashSet = this.f3086k.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.f3086k.remove(fragment);
            if (fragment.f2936g < 3) {
                m3852p(fragment);
                mo3907C0(fragment, fragment.mo3578B0());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean mo3928Q(boolean z) {
        m3831P(z);
        boolean z2 = false;
        while (m3840b0(this.f3101z, this.f3071A)) {
            this.f3077b = true;
            try {
                m3832R0(this.f3101z, this.f3071A);
                m3849m();
                z2 = true;
            } catch (Throwable th) {
                m3849m();
                throw th;
            }
        }
        m3846h1();
        m3828L();
        this.f3078c.mo4049b();
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3929Q0(Fragment fragment) {
        if (m3853r0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2952w);
        }
        boolean z = !fragment.mo3635U0();
        if (!fragment.f2913F || z) {
            this.f3078c.mo4063p(fragment);
            if (m3854s0(fragment)) {
                this.f3096u = true;
            }
            fragment.f2947r = true;
            m3841c1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3930R(C0610h hVar, boolean z) {
        if (!z || (this.f3090o != null && !this.f3099x)) {
            m3831P(z);
            if (hVar.mo3814a(this.f3101z, this.f3071A)) {
                this.f3077b = true;
                try {
                    m3832R0(this.f3101z, this.f3071A);
                } finally {
                    m3849m();
                }
            }
            m3846h1();
            m3828L();
            this.f3078c.mo4049b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo3931S0(Fragment fragment) {
        if (mo3977v0()) {
            if (m3853r0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f3074D.mo4016n(fragment) && m3853r0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: U */
    public boolean mo3932U() {
        boolean Q = mo3928Q(true);
        m3839a0();
        return Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3933U0(Parcelable parcelable) {
        C0616m mVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f2992g != null) {
                this.f3078c.mo4064q();
                Iterator<FragmentState> it = fragmentManagerState.f2992g.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment h = this.f3074D.mo4010h(next.f2998h);
                        if (h != null) {
                            if (m3853r0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h);
                            }
                            mVar = new C0616m(this.f3088m, h, next);
                        } else {
                            mVar = new C0616m(this.f3088m, this.f3090o.mo3883e().getClassLoader(), mo3953g0(), next);
                        }
                        Fragment i = mVar.mo4028i();
                        i.f2953x = this;
                        if (m3853r0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + i.f2940k + "): " + i);
                        }
                        mVar.mo4030k(this.f3090o.mo3883e().getClassLoader());
                        this.f3078c.mo4061n(mVar);
                        mVar.mo4036r(this.f3089n);
                    }
                }
                for (Fragment next2 : this.f3074D.mo4013k()) {
                    if (!this.f3078c.mo4050c(next2.f2940k)) {
                        if (m3853r0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + fragmentManagerState.f2992g);
                        }
                        mo3907C0(next2, 1);
                        next2.f2947r = true;
                        mo3907C0(next2, -1);
                    }
                }
                this.f3078c.mo4065r(fragmentManagerState.f2993h);
                if (fragmentManagerState.f2994i != null) {
                    this.f3079d = new ArrayList<>(fragmentManagerState.f2994i.length);
                    int i2 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f2994i;
                        if (i2 >= backStackStateArr.length) {
                            break;
                        }
                        C0583a a = backStackStateArr[i2].mo3570a(this);
                        if (m3853r0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a.f3024t + "): " + a);
                            PrintWriter printWriter = new PrintWriter(new C3697c("FragmentManager"));
                            a.mo3830z("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3079d.add(a);
                        i2++;
                    }
                } else {
                    this.f3079d = null;
                }
                this.f3084i.set(fragmentManagerState.f2995j);
                String str = fragmentManagerState.f2996k;
                if (str != null) {
                    Fragment W = mo3934W(str);
                    this.f3093r = W;
                    m3825C(W);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public Fragment mo3934W(String str) {
        return this.f3078c.mo4053f(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public Parcelable mo3935W0() {
        int size;
        m3839a0();
        m3830N();
        mo3928Q(true);
        this.f3097v = true;
        ArrayList<FragmentState> s = this.f3078c.mo4066s();
        BackStackState[] backStackStateArr = null;
        if (s.isEmpty()) {
            if (m3853r0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> t = this.f3078c.mo4067t();
        ArrayList<C0583a> arrayList = this.f3079d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f3079d.get(i));
                if (m3853r0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f3079d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f2992g = s;
        fragmentManagerState.f2993h = t;
        fragmentManagerState.f2994i = backStackStateArr;
        fragmentManagerState.f2995j = this.f3084i.get();
        Fragment fragment = this.f3093r;
        if (fragment != null) {
            fragmentManagerState.f2996k = fragment.f2940k;
        }
        return fragmentManagerState;
    }

    /* renamed from: X */
    public Fragment mo3936X(int i) {
        return this.f3078c.mo4054g(i);
    }

    /* renamed from: X0 */
    public Fragment.SavedState mo3937X0(Fragment fragment) {
        C0616m l = this.f3078c.mo4059l(fragment.f2940k);
        if (l != null && l.mo4028i().equals(fragment)) {
            return l.mo4033o();
        }
        m3845f1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: Y */
    public Fragment mo3938Y(String str) {
        return this.f3078c.mo4055h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3939Y0() {
        synchronized (this.f3076a) {
            ArrayList<C0612j> arrayList = this.f3073C;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f3076a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3090o.mo3884f().removeCallbacks(this.f3075E);
                this.f3090o.mo3884f().post(this.f3075E);
                m3846h1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public Fragment mo3940Z(String str) {
        return this.f3078c.mo4056i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo3941Z0(Fragment fragment, boolean z) {
        ViewGroup f0 = m3844f0(fragment);
        if (f0 != null && (f0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) f0).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo3942a1(Fragment fragment, C0697n.C0700c cVar) {
        if (!fragment.equals(mo3934W(fragment.f2940k)) || !(fragment.f2954y == null || fragment.f2953x == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2929V = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3943b(C0583a aVar) {
        if (this.f3079d == null) {
            this.f3079d = new ArrayList<>();
        }
        this.f3079d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3944b1(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo3934W(fragment.f2940k)) && (fragment.f2954y == null || fragment.f2953x == this))) {
            Fragment fragment2 = this.f3093r;
            this.f3093r = fragment;
            m3825C(fragment2);
            m3825C(this.f3093r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3945c(Fragment fragment, C3644b bVar) {
        if (this.f3086k.get(fragment) == null) {
            this.f3086k.put(fragment, new HashSet());
        }
        this.f3086k.get(fragment).add(bVar);
    }

    /* renamed from: c0 */
    public int mo3946c0() {
        ArrayList<C0583a> arrayList = this.f3079d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3947d(Fragment fragment) {
        if (m3853r0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo3979w0(fragment);
        if (!fragment.f2913F) {
            this.f3078c.mo4048a(fragment);
            fragment.f2947r = false;
            if (fragment.f2920M == null) {
                fragment.f2925R = false;
            }
            if (m3854s0(fragment)) {
                this.f3096u = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3948d1(Fragment fragment) {
        if (m3853r0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2912E) {
            fragment.f2912E = false;
            fragment.f2925R = !fragment.f2925R;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3949e(Fragment fragment) {
        if (mo3977v0()) {
            if (m3853r0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f3074D.mo4008f(fragment) && m3853r0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* renamed from: e0 */
    public Fragment mo3950e0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment W = mo3934W(string);
        if (W != null) {
            return W;
        }
        m3845f1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo3951f() {
        return this.f3084i.getAndIncrement();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3952g(androidx.fragment.app.C0598g<?> r3, androidx.fragment.app.C0595d r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.g<?> r0 = r2.f3090o
            if (r0 != 0) goto L_0x0049
            r2.f3090o = r3
            r2.f3091p = r4
            r2.f3092q = r5
            if (r5 == 0) goto L_0x000f
            r2.m3846h1()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.C0085c
            if (r4 == 0) goto L_0x0024
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0085c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo391z()
            r2.f3082g = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.b r1 = r2.f3083h
            r0.mo395a(r4, r1)
        L_0x0024:
            if (r5 == 0) goto L_0x002f
            androidx.fragment.app.j r3 = r5.f2953x
            androidx.fragment.app.l r3 = r3.m3842d0(r5)
            r2.f3074D = r3
            goto L_0x0048
        L_0x002f:
            boolean r4 = r3 instanceof androidx.lifecycle.C0712q0
            if (r4 == 0) goto L_0x0040
            androidx.lifecycle.q0 r3 = (androidx.lifecycle.C0712q0) r3
            androidx.lifecycle.p0 r3 = r3.mo392z0()
            androidx.fragment.app.l r3 = androidx.fragment.app.C0614l.m3963j(r3)
            r2.f3074D = r3
            goto L_0x0048
        L_0x0040:
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r4 = 0
            r3.<init>(r4)
            r2.f3074D = r3
        L_0x0048:
            return
        L_0x0049:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0602j.mo3952g(androidx.fragment.app.g, androidx.fragment.app.d, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: g0 */
    public C0597f mo3953g0() {
        C0597f fVar = this.f3094s;
        if (fVar != null) {
            return fVar;
        }
        Fragment fragment = this.f3092q;
        if (fragment != null) {
            return fragment.f2953x.mo3953g0();
        }
        return this.f3095t;
    }

    /* renamed from: g1 */
    public void mo3954g1(C0608f fVar) {
        this.f3088m.mo3902p(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3955h(Fragment fragment) {
        if (m3853r0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2913F) {
            fragment.f2913F = false;
            if (!fragment.f2946q) {
                this.f3078c.mo4048a(fragment);
                if (m3853r0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (m3854s0(fragment)) {
                    this.f3096u = true;
                }
            }
        }
    }

    /* renamed from: h0 */
    public List<Fragment> mo3956h0() {
        return this.f3078c.mo4060m();
    }

    /* renamed from: i */
    public C0620p mo3957i() {
        return new C0583a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public LayoutInflater.Factory2 mo3958i0() {
        return this.f3081f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public C0600i mo3959j0() {
        return this.f3088m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo3960k() {
        boolean z = false;
        for (Fragment next : this.f3078c.mo4058k()) {
            if (next != null) {
                z = m3854s0(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public Fragment mo3961k0() {
        return this.f3092q;
    }

    /* renamed from: l0 */
    public Fragment mo3962l0() {
        return this.f3093r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3963n(C0583a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo3805B(z3);
        } else {
            aVar.mo3804A();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0622q.m4047C(this, arrayList, arrayList2, 0, 1, true, this.f3087l);
        }
        if (z3) {
            mo3904A0(this.f3089n, true);
        }
        for (Fragment next : this.f3078c.mo4058k()) {
            if (next != null && next.f2920M != null && next.f2924Q && aVar.mo3808E(next.f2910C)) {
                float f = next.f2926S;
                if (f > 0.0f) {
                    next.f2920M.setAlpha(f);
                }
                if (z3) {
                    next.f2926S = 0.0f;
                } else {
                    next.f2926S = -1.0f;
                    next.f2924Q = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public C0710p0 mo3964n0(Fragment fragment) {
        return this.f3074D.mo4014l(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo3965o0() {
        mo3928Q(true);
        if (this.f3083h.mo401c()) {
            mo3919I0();
        } else {
            this.f3082g.mo397c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo3966p0(Fragment fragment) {
        if (m3853r0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f2912E) {
            fragment.f2912E = true;
            fragment.f2925R = true ^ fragment.f2925R;
            m3841c1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3967q(Fragment fragment) {
        if (m3853r0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f2913F) {
            fragment.f2913F = true;
            if (fragment.f2946q) {
                if (m3853r0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f3078c.mo4063p(fragment);
                if (m3854s0(fragment)) {
                    this.f3096u = true;
                }
                m3841c1(fragment);
            }
        }
    }

    /* renamed from: q0 */
    public boolean mo3968q0() {
        return this.f3099x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3969r() {
        this.f3097v = false;
        this.f3098w = false;
        m3826J(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3970s(Configuration configuration) {
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null) {
                next.mo3648Y1(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo3971t(MenuItem menuItem) {
        if (this.f3089n < 1) {
            return false;
        }
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null && next.mo3650Z1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo3972t0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        C0602j jVar = fragment.f2953x;
        if (!fragment.equals(jVar.mo3962l0()) || !mo3972t0(jVar.f3092q)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3092q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3092q)));
            sb.append("}");
        } else {
            sb.append(this.f3090o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3090o)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3974u() {
        this.f3097v = false;
        this.f3098w = false;
        m3826J(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo3975u0(int i) {
        return this.f3089n >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo3976v(Menu menu, MenuInflater menuInflater) {
        if (this.f3089n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null && next.mo3655b2(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.f3080e != null) {
            for (int i = 0; i < this.f3080e.size(); i++) {
                Fragment fragment = this.f3080e.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.mo3714z1();
                }
            }
        }
        this.f3080e = arrayList;
        return z;
    }

    /* renamed from: v0 */
    public boolean mo3977v0() {
        return this.f3097v || this.f3098w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo3978w() {
        this.f3099x = true;
        mo3928Q(true);
        m3830N();
        m3826J(-1);
        this.f3090o = null;
        this.f3091p = null;
        this.f3092q = null;
        if (this.f3082g != null) {
            this.f3083h.mo402d();
            this.f3082g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo3979w0(Fragment fragment) {
        if (!this.f3078c.mo4050c(fragment.f2940k)) {
            C0616m mVar = new C0616m(this.f3088m, fragment);
            mVar.mo4030k(this.f3090o.mo3883e().getClassLoader());
            this.f3078c.mo4061n(mVar);
            if (fragment.f2915H) {
                if (fragment.f2914G) {
                    mo3949e(fragment);
                } else {
                    mo3931S0(fragment);
                }
                fragment.f2915H = false;
            }
            mVar.mo4036r(this.f3089n);
            if (m3853r0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3980x() {
        m3826J(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3981y() {
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null) {
                next.mo3673i2();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo3982z(boolean z) {
        for (Fragment next : this.f3078c.mo4060m()) {
            if (next != null) {
                next.mo3675j2(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
        r0 = r0.f2920M;
        r1 = r4.f2919L;
        r0 = r1.indexOfChild(r0);
     */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3983z0(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            androidx.fragment.app.o r0 = r3.f3078c
            java.lang.String r1 = r4.f2940k
            boolean r0 = r0.mo4050c(r1)
            if (r0 != 0) goto L_0x003a
            r0 = 3
            boolean r0 = m3853r0(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to state "
            r0.append(r4)
            int r4 = r3.f3089n
            r0.append(r4)
            java.lang.String r4 = "since it is not added to "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r4)
        L_0x0039:
            return
        L_0x003a:
            r3.mo3906B0(r4)
            android.view.View r0 = r4.f2920M
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.o r0 = r3.f3078c
            androidx.fragment.app.Fragment r0 = r0.mo4057j(r4)
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r0.f2920M
            android.view.ViewGroup r1 = r4.f2919L
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r4.f2920M
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0061
            r1.removeViewAt(r2)
            android.view.View r2 = r4.f2920M
            r1.addView(r2, r0)
        L_0x0061:
            boolean r0 = r4.f2924Q
            if (r0 == 0) goto L_0x009f
            android.view.ViewGroup r0 = r4.f2919L
            if (r0 == 0) goto L_0x009f
            float r0 = r4.f2926S
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0075
            android.view.View r2 = r4.f2920M
            r2.setAlpha(r0)
        L_0x0075:
            r4.f2926S = r1
            r0 = 0
            r4.f2924Q = r0
            androidx.fragment.app.g<?> r0 = r3.f3090o
            android.content.Context r0 = r0.mo3883e()
            androidx.fragment.app.d r1 = r3.f3091p
            r2 = 1
            androidx.fragment.app.c$d r0 = androidx.fragment.app.C0588c.m3761b(r0, r1, r4, r2)
            if (r0 == 0) goto L_0x009f
            android.view.animation.Animation r1 = r0.f3052a
            if (r1 == 0) goto L_0x0093
            android.view.View r0 = r4.f2920M
            r0.startAnimation(r1)
            goto L_0x009f
        L_0x0093:
            android.animation.Animator r1 = r0.f3053b
            android.view.View r2 = r4.f2920M
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.f3053b
            r0.start()
        L_0x009f:
            boolean r0 = r4.f2925R
            if (r0 == 0) goto L_0x00a6
            r3.m3851o(r4)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0602j.mo3983z0(androidx.fragment.app.Fragment):void");
    }
}
