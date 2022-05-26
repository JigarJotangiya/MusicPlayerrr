package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.content.p003d.C0533g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import p082e.p098e.C3465a;
import p082e.p098e.C3470d;
import p082e.p098e.C3478g;
import p082e.p109h.p119p.C3774v;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public abstract class Transition implements Cloneable {

    /* renamed from: M */
    private static final int[] f4572M = {2, 1, 3, 4};

    /* renamed from: N */
    private static final PathMotion f4573N = new C1090a();

    /* renamed from: O */
    private static ThreadLocal<C3465a<Animator, C1093d>> f4574O = new ThreadLocal<>();

    /* renamed from: A */
    private ArrayList<C1160y> f4575A;

    /* renamed from: B */
    boolean f4576B = false;

    /* renamed from: C */
    ArrayList<Animator> f4577C = new ArrayList<>();

    /* renamed from: D */
    private int f4578D = 0;

    /* renamed from: E */
    private boolean f4579E = false;

    /* renamed from: F */
    private boolean f4580F = false;

    /* renamed from: G */
    private ArrayList<C1095f> f4581G = null;

    /* renamed from: H */
    private ArrayList<Animator> f4582H = new ArrayList<>();

    /* renamed from: I */
    C1157w f4583I;

    /* renamed from: J */
    private C1094e f4584J;

    /* renamed from: K */
    private C3465a<String, String> f4585K;

    /* renamed from: L */
    private PathMotion f4586L = f4573N;

    /* renamed from: g */
    private String f4587g = getClass().getName();

    /* renamed from: h */
    private long f4588h = -1;

    /* renamed from: i */
    long f4589i = -1;

    /* renamed from: j */
    private TimeInterpolator f4590j = null;

    /* renamed from: k */
    ArrayList<Integer> f4591k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<View> f4592l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<String> f4593m = null;

    /* renamed from: n */
    private ArrayList<Class<?>> f4594n = null;

    /* renamed from: o */
    private ArrayList<Integer> f4595o = null;

    /* renamed from: p */
    private ArrayList<View> f4596p = null;

    /* renamed from: q */
    private ArrayList<Class<?>> f4597q = null;

    /* renamed from: r */
    private ArrayList<String> f4598r = null;

    /* renamed from: s */
    private ArrayList<Integer> f4599s = null;

    /* renamed from: t */
    private ArrayList<View> f4600t = null;

    /* renamed from: u */
    private ArrayList<Class<?>> f4601u = null;

    /* renamed from: v */
    private C1161z f4602v = new C1161z();

    /* renamed from: w */
    private C1161z f4603w = new C1161z();

    /* renamed from: x */
    TransitionSet f4604x = null;

    /* renamed from: y */
    private int[] f4605y = f4572M;

    /* renamed from: z */
    private ArrayList<C1160y> f4606z;

    /* renamed from: androidx.transition.Transition$a */
    static class C1090a extends PathMotion {
        C1090a() {
        }

        /* renamed from: a */
        public Path mo5884a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    class C1091b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3465a f4607a;

        C1091b(C3465a aVar) {
            this.f4607a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4607a.remove(animator);
            Transition.this.f4577C.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.f4577C.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    class C1092c extends AnimatorListenerAdapter {
        C1092c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.mo5994s();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    private static class C1093d {

        /* renamed from: a */
        View f4610a;

        /* renamed from: b */
        String f4611b;

        /* renamed from: c */
        C1160y f4612c;

        /* renamed from: d */
        C1152t0 f4613d;

        /* renamed from: e */
        Transition f4614e;

        C1093d(View view, String str, Transition transition, C1152t0 t0Var, C1160y yVar) {
            this.f4610a = view;
            this.f4611b = str;
            this.f4612c = yVar;
            this.f4613d = t0Var;
            this.f4614e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    public static abstract class C1094e {
        /* renamed from: a */
        public abstract Rect mo6005a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$f */
    public interface C1095f {
        /* renamed from: a */
        void mo6006a(Transition transition);

        /* renamed from: b */
        void mo5920b(Transition transition);

        /* renamed from: c */
        void mo5921c(Transition transition);

        /* renamed from: d */
        void mo5922d(Transition transition);

        /* renamed from: e */
        void mo5923e(Transition transition);
    }

    public Transition() {
    }

    /* renamed from: C */
    private static C3465a<Animator, C1093d> m6218C() {
        C3465a<Animator, C1093d> aVar = f4574O.get();
        if (aVar != null) {
            return aVar;
        }
        C3465a<Animator, C1093d> aVar2 = new C3465a<>();
        f4574O.set(aVar2);
        return aVar2;
    }

    /* renamed from: L */
    private static boolean m6219L(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: N */
    private static boolean m6220N(C1160y yVar, C1160y yVar2, String str) {
        Object obj = yVar.f4751a.get(str);
        Object obj2 = yVar2.f4751a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: O */
    private void m6221O(C3465a<View, C1160y> aVar, C3465a<View, C1160y> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo5968M(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo5968M(view)) {
                C1160y yVar = aVar.get(valueAt);
                C1160y yVar2 = aVar2.get(view);
                if (!(yVar == null || yVar2 == null)) {
                    this.f4606z.add(yVar);
                    this.f4575A.add(yVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    private void m6222P(C3465a<View, C1160y> aVar, C3465a<View, C1160y> aVar2) {
        C1160y remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.mo12395i(size);
            if (i != null && mo5968M(i) && (remove = aVar2.remove(i)) != null && mo5968M(remove.f4752b)) {
                this.f4606z.add(aVar.mo8472k(size));
                this.f4575A.add(remove);
            }
        }
    }

    /* renamed from: R */
    private void m6223R(C3465a<View, C1160y> aVar, C3465a<View, C1160y> aVar2, C3470d<View> dVar, C3470d<View> dVar2) {
        View h;
        int q = dVar.mo12312q();
        for (int i = 0; i < q; i++) {
            View r = dVar.mo12313r(i);
            if (r != null && mo5968M(r) && (h = dVar2.mo12304h(dVar.mo12308l(i))) != null && mo5968M(h)) {
                C1160y yVar = aVar.get(r);
                C1160y yVar2 = aVar2.get(h);
                if (!(yVar == null || yVar2 == null)) {
                    this.f4606z.add(yVar);
                    this.f4575A.add(yVar2);
                    aVar.remove(r);
                    aVar2.remove(h);
                }
            }
        }
    }

    /* renamed from: S */
    private void m6224S(C3465a<View, C1160y> aVar, C3465a<View, C1160y> aVar2, C3465a<String, View> aVar3, C3465a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.mo12397m(i);
            if (m != null && mo5968M(m) && (view = aVar4.get(aVar3.mo12395i(i))) != null && mo5968M(view)) {
                C1160y yVar = aVar.get(m);
                C1160y yVar2 = aVar2.get(view);
                if (!(yVar == null || yVar2 == null)) {
                    this.f4606z.add(yVar);
                    this.f4575A.add(yVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: T */
    private void m6225T(C1161z zVar, C1161z zVar2) {
        C3465a aVar = new C3465a((C3478g) zVar.f4754a);
        C3465a aVar2 = new C3465a((C3478g) zVar2.f4754a);
        int i = 0;
        while (true) {
            int[] iArr = this.f4605y;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m6222P(aVar, aVar2);
                } else if (i2 == 2) {
                    m6224S(aVar, aVar2, zVar.f4757d, zVar2.f4757d);
                } else if (i2 == 3) {
                    m6221O(aVar, aVar2, zVar.f4755b, zVar2.f4755b);
                } else if (i2 == 4) {
                    m6223R(aVar, aVar2, zVar.f4756c, zVar2.f4756c);
                }
                i++;
            } else {
                m6228c(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: U */
    private static int[] m6226U(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: b0 */
    private void m6227b0(Animator animator, C3465a<Animator, C1093d> aVar) {
        if (animator != null) {
            animator.addListener(new C1091b(aVar));
            mo5981g(animator);
        }
    }

    /* renamed from: c */
    private void m6228c(C3465a<View, C1160y> aVar, C3465a<View, C1160y> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1160y m = aVar.mo12397m(i);
            if (mo5968M(m.f4752b)) {
                this.f4606z.add(m);
                this.f4575A.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1160y m2 = aVar2.mo12397m(i2);
            if (mo5968M(m2.f4752b)) {
                this.f4575A.add(m2);
                this.f4606z.add((Object) null);
            }
        }
    }

    /* renamed from: e */
    private static void m6229e(C1161z zVar, View view, C1160y yVar) {
        zVar.f4754a.put(view, yVar);
        int id = view.getId();
        if (id >= 0) {
            if (zVar.f4755b.indexOfKey(id) >= 0) {
                zVar.f4755b.put(id, (Object) null);
            } else {
                zVar.f4755b.put(id, view);
            }
        }
        String K = C3774v.m16169K(view);
        if (K != null) {
            if (zVar.f4757d.containsKey(K)) {
                zVar.f4757d.put(K, null);
            } else {
                zVar.f4757d.put(K, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f4756c.mo12306j(itemIdAtPosition) >= 0) {
                    View h = zVar.f4756c.mo12304h(itemIdAtPosition);
                    if (h != null) {
                        C3774v.m16235x0(h, false);
                        zVar.f4756c.mo12309m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C3774v.m16235x0(view, true);
                zVar.f4756c.mo12309m(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: f */
    private static boolean m6230f(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m6231j(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f4595o;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f4596p;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f4597q;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f4597q.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1160y yVar = new C1160y(view);
                        if (z) {
                            mo5890l(yVar);
                        } else {
                            mo5889i(yVar);
                        }
                        yVar.f4753c.add(this);
                        mo5987k(yVar);
                        if (z) {
                            m6229e(this.f4602v, view, yVar);
                        } else {
                            m6229e(this.f4603w, view, yVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f4599s;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f4600t;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f4601u;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f4601u.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m6231j(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public PathMotion mo5959A() {
        return this.f4586L;
    }

    /* renamed from: B */
    public C1157w mo5960B() {
        return this.f4583I;
    }

    /* renamed from: D */
    public long mo5961D() {
        return this.f4588h;
    }

    /* renamed from: E */
    public List<Integer> mo5962E() {
        return this.f4591k;
    }

    /* renamed from: F */
    public List<String> mo5963F() {
        return this.f4593m;
    }

    /* renamed from: G */
    public List<Class<?>> mo5964G() {
        return this.f4594n;
    }

    /* renamed from: H */
    public List<View> mo5965H() {
        return this.f4592l;
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return null;
    }

    /* renamed from: J */
    public C1160y mo5966J(View view, boolean z) {
        TransitionSet transitionSet = this.f4604x;
        if (transitionSet != null) {
            return transitionSet.mo5966J(view, z);
        }
        return (z ? this.f4602v : this.f4603w).f4754a.get(view);
    }

    /* renamed from: K */
    public boolean mo5967K(C1160y yVar, C1160y yVar2) {
        if (yVar == null || yVar2 == null) {
            return false;
        }
        String[] I = mo5888I();
        if (I != null) {
            int length = I.length;
            int i = 0;
            while (i < length) {
                if (!m6220N(yVar, yVar2, I[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String N : yVar.f4751a.keySet()) {
            if (m6220N(yVar, yVar2, N)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo5968M(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f4595o;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f4596p;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f4597q;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f4597q.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f4598r != null && C3774v.m16169K(view) != null && this.f4598r.contains(C3774v.m16169K(view))) {
            return false;
        }
        if ((this.f4591k.size() == 0 && this.f4592l.size() == 0 && (((arrayList = this.f4594n) == null || arrayList.isEmpty()) && ((arrayList2 = this.f4593m) == null || arrayList2.isEmpty()))) || this.f4591k.contains(Integer.valueOf(id)) || this.f4592l.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f4593m;
        if (arrayList6 != null && arrayList6.contains(C3774v.m16169K(view))) {
            return true;
        }
        if (this.f4594n != null) {
            for (int i2 = 0; i2 < this.f4594n.size(); i2++) {
                if (this.f4594n.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: V */
    public void mo5969V(View view) {
        if (!this.f4580F) {
            C3465a<Animator, C1093d> C = m6218C();
            int size = C.size();
            C1152t0 d = C1129j0.m6438d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1093d m = C.mo12397m(i);
                if (m.f4610a != null && d.equals(m.f4613d)) {
                    C1101a.m6343b(C.mo12395i(i));
                }
            }
            ArrayList<C1095f> arrayList = this.f4581G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4581G.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1095f) arrayList2.get(i2)).mo5920b(this);
                }
            }
            this.f4579E = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo5970W(ViewGroup viewGroup) {
        C1093d dVar;
        this.f4606z = new ArrayList<>();
        this.f4575A = new ArrayList<>();
        m6225T(this.f4602v, this.f4603w);
        C3465a<Animator, C1093d> C = m6218C();
        int size = C.size();
        C1152t0 d = C1129j0.m6438d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = C.mo12395i(i);
            if (!(i2 == null || (dVar = C.get(i2)) == null || dVar.f4610a == null || !d.equals(dVar.f4613d))) {
                C1160y yVar = dVar.f4612c;
                View view = dVar.f4610a;
                C1160y J = mo5966J(view, true);
                C1160y y = mo6000y(view, true);
                if (J == null && y == null) {
                    y = this.f4603w.f4754a.get(view);
                }
                if (!(J == null && y == null) && dVar.f4614e.mo5967K(yVar, y)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        C.remove(i2);
                    }
                }
            }
        }
        mo5993r(viewGroup, this.f4602v, this.f4603w, this.f4606z, this.f4575A);
        mo5976c0();
    }

    /* renamed from: X */
    public Transition mo5971X(C1095f fVar) {
        ArrayList<C1095f> arrayList = this.f4581G;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f4581G.size() == 0) {
            this.f4581G = null;
        }
        return this;
    }

    /* renamed from: Z */
    public Transition mo5972Z(View view) {
        this.f4592l.remove(view);
        return this;
    }

    /* renamed from: a */
    public Transition mo5973a(C1095f fVar) {
        if (this.f4581G == null) {
            this.f4581G = new ArrayList<>();
        }
        this.f4581G.add(fVar);
        return this;
    }

    /* renamed from: a0 */
    public void mo5974a0(View view) {
        if (this.f4579E) {
            if (!this.f4580F) {
                C3465a<Animator, C1093d> C = m6218C();
                int size = C.size();
                C1152t0 d = C1129j0.m6438d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1093d m = C.mo12397m(i);
                    if (m.f4610a != null && d.equals(m.f4613d)) {
                        C1101a.m6344c(C.mo12395i(i));
                    }
                }
                ArrayList<C1095f> arrayList = this.f4581G;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4581G.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1095f) arrayList2.get(i2)).mo5923e(this);
                    }
                }
            }
            this.f4579E = false;
        }
    }

    /* renamed from: b */
    public Transition mo5975b(View view) {
        this.f4592l.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo5976c0() {
        mo5988k0();
        C3465a<Animator, C1093d> C = m6218C();
        Iterator<Animator> it = this.f4582H.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (C.containsKey(next)) {
                mo5988k0();
                m6227b0(next, C);
            }
        }
        this.f4582H.clear();
        mo5994s();
    }

    /* renamed from: d0 */
    public Transition mo5978d0(long j) {
        this.f4589i = j;
        return this;
    }

    /* renamed from: e0 */
    public void mo5979e0(C1094e eVar) {
        this.f4584J = eVar;
    }

    /* renamed from: f0 */
    public Transition mo5980f0(TimeInterpolator timeInterpolator) {
        this.f4590j = timeInterpolator;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5981g(Animator animator) {
        if (animator == null) {
            mo5994s();
            return;
        }
        if (mo5995t() >= 0) {
            animator.setDuration(mo5995t());
        }
        if (mo5961D() >= 0) {
            animator.setStartDelay(mo5961D() + animator.getStartDelay());
        }
        if (mo5999w() != null) {
            animator.setInterpolator(mo5999w());
        }
        animator.addListener(new C1092c());
        animator.start();
    }

    /* renamed from: g0 */
    public void mo5982g0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f4605y = f4572M;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!m6219L(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m6230f(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f4605y = (int[]) iArr.clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo5983h() {
        for (int size = this.f4577C.size() - 1; size >= 0; size--) {
            this.f4577C.get(size).cancel();
        }
        ArrayList<C1095f> arrayList = this.f4581G;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f4581G.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1095f) arrayList2.get(i)).mo5922d(this);
            }
        }
    }

    /* renamed from: h0 */
    public void mo5984h0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f4586L = f4573N;
        } else {
            this.f4586L = pathMotion;
        }
    }

    /* renamed from: i */
    public abstract void mo5889i(C1160y yVar);

    /* renamed from: i0 */
    public void mo5985i0(C1157w wVar) {
        this.f4583I = wVar;
    }

    /* renamed from: j0 */
    public Transition mo5986j0(long j) {
        this.f4588h = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5987k(C1160y yVar) {
        String[] b;
        if (this.f4583I != null && !yVar.f4751a.isEmpty() && (b = this.f4583I.mo6117b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!yVar.f4751a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f4583I.mo6116a(yVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo5988k0() {
        if (this.f4578D == 0) {
            ArrayList<C1095f> arrayList = this.f4581G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4581G.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1095f) arrayList2.get(i)).mo6006a(this);
                }
            }
            this.f4580F = false;
        }
        this.f4578D++;
    }

    /* renamed from: l */
    public abstract void mo5890l(C1160y yVar);

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public String mo5989l0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f4589i != -1) {
            str2 = str2 + "dur(" + this.f4589i + ") ";
        }
        if (this.f4588h != -1) {
            str2 = str2 + "dly(" + this.f4588h + ") ";
        }
        if (this.f4590j != null) {
            str2 = str2 + "interp(" + this.f4590j + ") ";
        }
        if (this.f4591k.size() <= 0 && this.f4592l.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f4591k.size() > 0) {
            for (int i = 0; i < this.f4591k.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f4591k.get(i);
            }
        }
        if (this.f4592l.size() > 0) {
            for (int i2 = 0; i2 < this.f4592l.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f4592l.get(i2);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5990m(ViewGroup viewGroup, boolean z) {
        C3465a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo5991n(z);
        if ((this.f4591k.size() > 0 || this.f4592l.size() > 0) && (((arrayList = this.f4593m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f4594n) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f4591k.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f4591k.get(i).intValue());
                if (findViewById != null) {
                    C1160y yVar = new C1160y(findViewById);
                    if (z) {
                        mo5890l(yVar);
                    } else {
                        mo5889i(yVar);
                    }
                    yVar.f4753c.add(this);
                    mo5987k(yVar);
                    if (z) {
                        m6229e(this.f4602v, findViewById, yVar);
                    } else {
                        m6229e(this.f4603w, findViewById, yVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f4592l.size(); i2++) {
                View view = this.f4592l.get(i2);
                C1160y yVar2 = new C1160y(view);
                if (z) {
                    mo5890l(yVar2);
                } else {
                    mo5889i(yVar2);
                }
                yVar2.f4753c.add(this);
                mo5987k(yVar2);
                if (z) {
                    m6229e(this.f4602v, view, yVar2);
                } else {
                    m6229e(this.f4603w, view, yVar2);
                }
            }
        } else {
            m6231j(viewGroup, z);
        }
        if (!z && (aVar = this.f4585K) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f4602v.f4757d.remove(this.f4585K.mo12395i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f4602v.f4757d.put(this.f4585K.mo12397m(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5991n(boolean z) {
        if (z) {
            this.f4602v.f4754a.clear();
            this.f4602v.f4755b.clear();
            this.f4602v.f4756c.mo12299b();
            return;
        }
        this.f4603w.f4754a.clear();
        this.f4603w.f4755b.clear();
        this.f4603w.f4756c.mo12299b();
    }

    /* renamed from: o */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f4582H = new ArrayList<>();
            transition.f4602v = new C1161z();
            transition.f4603w = new C1161z();
            transition.f4606z = null;
            transition.f4575A = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo5993r(ViewGroup viewGroup, C1161z zVar, C1161z zVar2, ArrayList<C1160y> arrayList, ArrayList<C1160y> arrayList2) {
        int i;
        int i2;
        Animator q;
        View view;
        Animator animator;
        C1160y yVar;
        C1160y yVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C3465a<Animator, C1093d> C = m6218C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1160y yVar3 = arrayList.get(i3);
            C1160y yVar4 = arrayList2.get(i3);
            if (yVar3 != null && !yVar3.f4753c.contains(this)) {
                yVar3 = null;
            }
            if (yVar4 != null && !yVar4.f4753c.contains(this)) {
                yVar4 = null;
            }
            if (!(yVar3 == null && yVar4 == null)) {
                if ((yVar3 == null || yVar4 == null || mo5967K(yVar3, yVar4)) && (q = mo5892q(viewGroup2, yVar3, yVar4)) != null) {
                    if (yVar4 != null) {
                        view = yVar4.f4752b;
                        String[] I = mo5888I();
                        if (I != null && I.length > 0) {
                            yVar2 = new C1160y(view);
                            Animator animator3 = q;
                            i2 = size;
                            C1160y yVar5 = zVar2.f4754a.get(view);
                            if (yVar5 != null) {
                                int i4 = 0;
                                while (i4 < I.length) {
                                    yVar2.f4751a.put(I[i4], yVar5.f4751a.get(I[i4]));
                                    i4++;
                                    ArrayList<C1160y> arrayList3 = arrayList2;
                                    i3 = i3;
                                    yVar5 = yVar5;
                                }
                            }
                            i = i3;
                            int size2 = C.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C1093d dVar = C.get(C.mo12395i(i5));
                                if (dVar.f4612c != null && dVar.f4610a == view && dVar.f4611b.equals(mo6001z()) && dVar.f4612c.equals(yVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = q;
                            yVar2 = null;
                        }
                        animator = animator2;
                        yVar = yVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = yVar3.f4752b;
                        animator = q;
                        yVar = null;
                    }
                    if (animator != null) {
                        C1157w wVar = this.f4583I;
                        if (wVar != null) {
                            long c = wVar.mo6033c(viewGroup2, this, yVar3, yVar4);
                            sparseIntArray.put(this.f4582H.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        C.put(animator, new C1093d(view, mo6001z(), this, C1129j0.m6438d(viewGroup), yVar));
                        this.f4582H.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f4582H.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo5994s() {
        int i = this.f4578D - 1;
        this.f4578D = i;
        if (i == 0) {
            ArrayList<C1095f> arrayList = this.f4581G;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4581G.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1095f) arrayList2.get(i2)).mo5921c(this);
                }
            }
            for (int i3 = 0; i3 < this.f4602v.f4756c.mo12312q(); i3++) {
                View r = this.f4602v.f4756c.mo12313r(i3);
                if (r != null) {
                    C3774v.m16235x0(r, false);
                }
            }
            for (int i4 = 0; i4 < this.f4603w.f4756c.mo12312q(); i4++) {
                View r2 = this.f4603w.f4756c.mo12313r(i4);
                if (r2 != null) {
                    C3774v.m16235x0(r2, false);
                }
            }
            this.f4580F = true;
        }
    }

    /* renamed from: t */
    public long mo5995t() {
        return this.f4589i;
    }

    public String toString() {
        return mo5989l0(BuildConfig.FLAVOR);
    }

    /* renamed from: u */
    public Rect mo5997u() {
        C1094e eVar = this.f4584J;
        if (eVar == null) {
            return null;
        }
        return eVar.mo6005a(this);
    }

    /* renamed from: v */
    public C1094e mo5998v() {
        return this.f4584J;
    }

    /* renamed from: w */
    public TimeInterpolator mo5999w() {
        return this.f4590j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C1160y mo6000y(View view, boolean z) {
        TransitionSet transitionSet = this.f4604x;
        if (transitionSet != null) {
            return transitionSet.mo6000y(view, z);
        }
        ArrayList<C1160y> arrayList = z ? this.f4606z : this.f4575A;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1160y yVar = arrayList.get(i2);
            if (yVar == null) {
                return null;
            }
            if (yVar.f4752b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f4575A : this.f4606z).get(i);
    }

    /* renamed from: z */
    public String mo6001z() {
        return this.f4587g;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4729a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long g = (long) C0533g.m3248g(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (g >= 0) {
            mo5978d0(g);
        }
        long g2 = (long) C0533g.m3248g(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (g2 > 0) {
            mo5986j0(g2);
        }
        int h = C0533g.m3249h(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (h > 0) {
            mo5980f0(AnimationUtils.loadInterpolator(context, h));
        }
        String i = C0533g.m3250i(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (i != null) {
            mo5982g0(m6226U(i));
        }
        obtainStyledAttributes.recycle();
    }
}
