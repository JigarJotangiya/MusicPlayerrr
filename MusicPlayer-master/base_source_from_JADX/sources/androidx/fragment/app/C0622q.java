package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0501m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p082e.p098e.C3465a;
import p082e.p109h.p115l.C3644b;
import p082e.p109h.p119p.C3770r;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.fragment.app.q */
/* compiled from: FragmentTransition */
class C0622q {

    /* renamed from: a */
    private static final int[] f3160a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0637s f3161b = (Build.VERSION.SDK_INT >= 21 ? new C0631r() : null);

    /* renamed from: c */
    private static final C0637s f3162c = m4071x();

    /* renamed from: androidx.fragment.app.q$a */
    /* compiled from: FragmentTransition */
    static class C0623a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C0629g f3163g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3164h;

        /* renamed from: i */
        final /* synthetic */ C3644b f3165i;

        C0623a(C0629g gVar, Fragment fragment, C3644b bVar) {
            this.f3163g = gVar;
            this.f3164h = fragment;
            this.f3165i = bVar;
        }

        public void run() {
            this.f3163g.mo3984a(this.f3164h, this.f3165i);
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    /* compiled from: FragmentTransition */
    static class C0624b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ArrayList f3166g;

        C0624b(ArrayList arrayList) {
            this.f3166g = arrayList;
        }

        public void run() {
            C0622q.m4046B(this.f3166g, 4);
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    /* compiled from: FragmentTransition */
    static class C0625c implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C0629g f3167g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3168h;

        /* renamed from: i */
        final /* synthetic */ C3644b f3169i;

        C0625c(C0629g gVar, Fragment fragment, C3644b bVar) {
            this.f3167g = gVar;
            this.f3168h = fragment;
            this.f3169i = bVar;
        }

        public void run() {
            this.f3167g.mo3984a(this.f3168h, this.f3169i);
        }
    }

    /* renamed from: androidx.fragment.app.q$d */
    /* compiled from: FragmentTransition */
    static class C0626d implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Object f3170g;

        /* renamed from: h */
        final /* synthetic */ C0637s f3171h;

        /* renamed from: i */
        final /* synthetic */ View f3172i;

        /* renamed from: j */
        final /* synthetic */ Fragment f3173j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3174k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f3175l;

        /* renamed from: m */
        final /* synthetic */ ArrayList f3176m;

        /* renamed from: n */
        final /* synthetic */ Object f3177n;

        C0626d(Object obj, C0637s sVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3170g = obj;
            this.f3171h = sVar;
            this.f3172i = view;
            this.f3173j = fragment;
            this.f3174k = arrayList;
            this.f3175l = arrayList2;
            this.f3176m = arrayList3;
            this.f3177n = obj2;
        }

        public void run() {
            Object obj = this.f3170g;
            if (obj != null) {
                this.f3171h.mo4093p(obj, this.f3172i);
                this.f3175l.addAll(C0622q.m4058k(this.f3171h, this.f3170g, this.f3173j, this.f3174k, this.f3172i));
            }
            if (this.f3176m != null) {
                if (this.f3177n != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3172i);
                    this.f3171h.mo4094q(this.f3177n, this.f3176m, arrayList);
                }
                this.f3176m.clear();
                this.f3176m.add(this.f3172i);
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$e */
    /* compiled from: FragmentTransition */
    static class C0627e implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Fragment f3178g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3179h;

        /* renamed from: i */
        final /* synthetic */ boolean f3180i;

        /* renamed from: j */
        final /* synthetic */ C3465a f3181j;

        /* renamed from: k */
        final /* synthetic */ View f3182k;

        /* renamed from: l */
        final /* synthetic */ C0637s f3183l;

        /* renamed from: m */
        final /* synthetic */ Rect f3184m;

        C0627e(Fragment fragment, Fragment fragment2, boolean z, C3465a aVar, View view, C0637s sVar, Rect rect) {
            this.f3178g = fragment;
            this.f3179h = fragment2;
            this.f3180i = z;
            this.f3181j = aVar;
            this.f3182k = view;
            this.f3183l = sVar;
            this.f3184m = rect;
        }

        public void run() {
            C0622q.m4053f(this.f3178g, this.f3179h, this.f3180i, this.f3181j, false);
            View view = this.f3182k;
            if (view != null) {
                this.f3183l.mo4120k(view, this.f3184m);
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$f */
    /* compiled from: FragmentTransition */
    static class C0628f implements Runnable {

        /* renamed from: g */
        final /* synthetic */ C0637s f3185g;

        /* renamed from: h */
        final /* synthetic */ C3465a f3186h;

        /* renamed from: i */
        final /* synthetic */ Object f3187i;

        /* renamed from: j */
        final /* synthetic */ C0630h f3188j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3189k;

        /* renamed from: l */
        final /* synthetic */ View f3190l;

        /* renamed from: m */
        final /* synthetic */ Fragment f3191m;

        /* renamed from: n */
        final /* synthetic */ Fragment f3192n;

        /* renamed from: o */
        final /* synthetic */ boolean f3193o;

        /* renamed from: p */
        final /* synthetic */ ArrayList f3194p;

        /* renamed from: q */
        final /* synthetic */ Object f3195q;

        /* renamed from: r */
        final /* synthetic */ Rect f3196r;

        C0628f(C0637s sVar, C3465a aVar, Object obj, C0630h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3185g = sVar;
            this.f3186h = aVar;
            this.f3187i = obj;
            this.f3188j = hVar;
            this.f3189k = arrayList;
            this.f3190l = view;
            this.f3191m = fragment;
            this.f3192n = fragment2;
            this.f3193o = z;
            this.f3194p = arrayList2;
            this.f3195q = obj2;
            this.f3196r = rect;
        }

        public void run() {
            C3465a<String, View> h = C0622q.m4055h(this.f3185g, this.f3186h, this.f3187i, this.f3188j);
            if (h != null) {
                this.f3189k.addAll(h.values());
                this.f3189k.add(this.f3190l);
            }
            C0622q.m4053f(this.f3191m, this.f3192n, this.f3193o, h, false);
            Object obj = this.f3187i;
            if (obj != null) {
                this.f3185g.mo4084A(obj, this.f3194p, this.f3189k);
                View t = C0622q.m4067t(h, this.f3188j, this.f3195q, this.f3193o);
                if (t != null) {
                    this.f3185g.mo4120k(t, this.f3196r);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$g */
    /* compiled from: FragmentTransition */
    interface C0629g {
        /* renamed from: a */
        void mo3984a(Fragment fragment, C3644b bVar);

        /* renamed from: b */
        void mo3985b(Fragment fragment, C3644b bVar);
    }

    /* renamed from: androidx.fragment.app.q$h */
    /* compiled from: FragmentTransition */
    static class C0630h {

        /* renamed from: a */
        public Fragment f3197a;

        /* renamed from: b */
        public boolean f3198b;

        /* renamed from: c */
        public C0583a f3199c;

        /* renamed from: d */
        public Fragment f3200d;

        /* renamed from: e */
        public boolean f3201e;

        /* renamed from: f */
        public C0583a f3202f;

        C0630h() {
        }
    }

    /* renamed from: A */
    private static void m4045A(C0637s sVar, Object obj, Object obj2, C3465a<String, View> aVar, boolean z, C0583a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3148n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.f3149o.get(0);
            } else {
                str = aVar2.f3148n.get(0);
            }
            View view = aVar.get(str);
            sVar.mo4098v(obj, view);
            if (obj2 != null) {
                sVar.mo4098v(obj2, view);
            }
        }
    }

    /* renamed from: B */
    static void m4046B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: C */
    static void m4047C(C0602j jVar, ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0629g gVar) {
        C0602j jVar2 = jVar;
        ArrayList<C0583a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (jVar2.f3089n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                C0583a aVar = arrayList3.get(i4);
                if (arrayList4.get(i4).booleanValue()) {
                    m4052e(aVar, sparseArray, z2);
                } else {
                    m4050c(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(jVar2.f3090o.mo3883e());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    C3465a<String, String> d = m4051d(keyAt, arrayList3, arrayList4, i, i3);
                    C0630h hVar = (C0630h) sparseArray.valueAt(i5);
                    if (z2) {
                        m4062o(jVar, keyAt, hVar, view, d, gVar);
                    } else {
                        m4061n(jVar, keyAt, hVar, view, d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4048a(ArrayList<View> arrayList, C3465a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.mo12397m(size);
            if (collection.contains(C3774v.m16169K(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f2946q != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.f2912E == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4049b(androidx.fragment.app.C0583a r8, androidx.fragment.app.C0620p.C0621a r9, android.util.SparseArray<androidx.fragment.app.C0622q.C0630h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3153b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f2910C
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3160a
            int r9 = r9.f3152a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3152a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f2925R
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.f2912E
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f2946q
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.f2912E
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f2925R
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2946q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2912E
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f2946q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2912E
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.f2946q
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f2920M
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f2926S
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.f2946q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2912E
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.f2924Q
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.f2946q
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.f2912E
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0092:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.q$h r6 = (androidx.fragment.app.C0622q.C0630h) r6
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.q$h r6 = m4063p(r6, r10, r1)
            r6.f3197a = r0
            r6.f3198b = r11
            r6.f3199c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r9 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r9 = r6.f3200d
            if (r9 != r0) goto L_0x00b1
            r6.f3200d = r2
        L_0x00b1:
            androidx.fragment.app.j r9 = r8.f3022r
            int r7 = r0.f2936g
            if (r7 >= r3) goto L_0x00c5
            int r7 = r9.f3089n
            if (r7 < r3) goto L_0x00c5
            boolean r7 = r8.f3150p
            if (r7 != 0) goto L_0x00c5
            r9.mo3979w0(r0)
            r9.mo3907C0(r0, r3)
        L_0x00c5:
            if (r5 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r9 = r6.f3200d
            if (r9 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.q$h r6 = m4063p(r6, r10, r1)
            r6.f3200d = r0
            r6.f3201e = r11
            r6.f3202f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r4 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r6.f3197a
            if (r8 != r0) goto L_0x00e3
            r6.f3197a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0622q.m4049b(androidx.fragment.app.a, androidx.fragment.app.p$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m4050c(C0583a aVar, SparseArray<C0630h> sparseArray, boolean z) {
        int size = aVar.f3135a.size();
        for (int i = 0; i < size; i++) {
            m4049b(aVar, aVar.f3135a.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C3465a<String, String> m4051d(int i, ArrayList<C0583a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C3465a<String, String> aVar = new C3465a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0583a aVar2 = arrayList.get(i4);
            if (aVar2.mo3808E(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3148n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3148n;
                        arrayList4 = aVar2.f3149o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3148n;
                        arrayList3 = aVar2.f3149o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m4052e(C0583a aVar, SparseArray<C0630h> sparseArray, boolean z) {
        if (aVar.f3022r.f3091p.mo3726c()) {
            for (int size = aVar.f3135a.size() - 1; size >= 0; size--) {
                m4049b(aVar, aVar.f3135a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m4053f(Fragment fragment, Fragment fragment2, boolean z, C3465a<String, View> aVar, boolean z2) {
        C0501m mVar;
        int i;
        if (z) {
            mVar = fragment2.mo3656c0();
        } else {
            mVar = fragment.mo3656c0();
        }
        if (mVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo12395i(i2));
                arrayList.add(aVar.mo12397m(i2));
            }
            if (z2) {
                mVar.mo3251c(arrayList2, arrayList, (List<View>) null);
            } else {
                mVar.mo3250b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: g */
    private static boolean m4054g(C0637s sVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!sVar.mo4089e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C3465a<String, View> m4055h(C0637s sVar, C3465a<String, String> aVar, Object obj, C0630h hVar) {
        C0501m mVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.f3197a;
        View J0 = fragment.mo3600J0();
        if (aVar.isEmpty() || obj == null || J0 == null) {
            aVar.clear();
            return null;
        }
        C3465a<String, View> aVar2 = new C3465a<>();
        sVar.mo4119j(aVar2, J0);
        C0583a aVar3 = hVar.f3199c;
        if (hVar.f3198b) {
            mVar = fragment.mo3666g0();
            arrayList = aVar3.f3148n;
        } else {
            mVar = fragment.mo3656c0();
            arrayList = aVar3.f3149o;
        }
        if (arrayList != null) {
            aVar2.mo12266o(arrayList);
            aVar2.mo12266o(aVar.values());
        }
        if (mVar != null) {
            mVar.mo3249a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = m4064q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(C3774v.m16169K(view)) && (q = m4064q(aVar, str)) != null) {
                    aVar.put(q, C3774v.m16169K(view));
                }
            }
        } else {
            m4072y(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: i */
    private static C3465a<String, View> m4056i(C0637s sVar, C3465a<String, String> aVar, Object obj, C0630h hVar) {
        C0501m mVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3200d;
        C3465a<String, View> aVar2 = new C3465a<>();
        sVar.mo4119j(aVar2, fragment.mo3711x2());
        C0583a aVar3 = hVar.f3202f;
        if (hVar.f3201e) {
            mVar = fragment.mo3656c0();
            arrayList = aVar3.f3149o;
        } else {
            mVar = fragment.mo3666g0();
            arrayList = aVar3.f3148n;
        }
        if (arrayList != null) {
            aVar2.mo12266o(arrayList);
        }
        if (mVar != null) {
            mVar.mo3249a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C3774v.m16169K(view))) {
                    aVar.put(C3774v.m16169K(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo12266o(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: j */
    private static C0637s m4057j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object d0 = fragment.mo3659d0();
            if (d0 != null) {
                arrayList.add(d0);
            }
            Object v0 = fragment.mo3706v0();
            if (v0 != null) {
                arrayList.add(v0);
            }
            Object y0 = fragment.mo3712y0();
            if (y0 != null) {
                arrayList.add(y0);
            }
        }
        if (fragment2 != null) {
            Object b0 = fragment2.mo3654b0();
            if (b0 != null) {
                arrayList.add(b0);
            }
            Object r0 = fragment2.mo3696r0();
            if (r0 != null) {
                arrayList.add(r0);
            }
            Object w0 = fragment2.mo3709w0();
            if (w0 != null) {
                arrayList.add(w0);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0637s sVar = f3161b;
        if (sVar != null && m4054g(sVar, arrayList)) {
            return sVar;
        }
        C0637s sVar2 = f3162c;
        if (sVar2 != null && m4054g(sVar2, arrayList)) {
            return sVar2;
        }
        if (sVar == null && sVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m4058k(C0637s sVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View J0 = fragment.mo3600J0();
        if (J0 != null) {
            sVar.mo4118f(arrayList2, J0);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        sVar.mo4087b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m4059l(C0637s sVar, ViewGroup viewGroup, View view, C3465a<String, String> aVar, C0630h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C3465a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0637s sVar2 = sVar;
        C0630h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3197a;
        Fragment fragment2 = hVar2.f3200d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3198b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m4068u(sVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C3465a<String, View> i = m4056i(sVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m4053f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            sVar2.mo4100z(obj4, view, arrayList3);
            m4045A(sVar, obj4, obj2, i, hVar2.f3201e, hVar2.f3202f);
            if (obj5 != null) {
                sVar2.mo4097u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0628f fVar = r0;
        C0628f fVar2 = new C0628f(sVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C3770r.m16143a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m4060m(C0637s sVar, ViewGroup viewGroup, View view, C3465a<String, String> aVar, C0630h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C0637s sVar2 = sVar;
        View view3 = view;
        C3465a<String, String> aVar2 = aVar;
        C0630h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3197a;
        Fragment fragment2 = hVar2.f3200d;
        if (fragment != null) {
            fragment.mo3711x2().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3198b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m4068u(sVar, fragment, fragment2, z);
        }
        C3465a<String, View> i = m4056i(sVar, aVar2, obj3, hVar2);
        C3465a<String, View> h = m4055h(sVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj4 = null;
        } else {
            m4048a(arrayList3, i, aVar.keySet());
            m4048a(arrayList4, h, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m4053f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            sVar.mo4100z(obj4, view3, arrayList3);
            m4045A(sVar, obj4, obj2, i, hVar2.f3201e, hVar2.f3202f);
            Rect rect2 = new Rect();
            View t = m4067t(h, hVar2, obj5, z);
            if (t != null) {
                sVar.mo4097u(obj5, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        C3770r.m16143a(viewGroup, new C0627e(fragment, fragment2, z, h, view2, sVar, rect));
        return obj4;
    }

    /* renamed from: n */
    private static void m4061n(C0602j jVar, int i, C0630h hVar, View view, C3465a<String, String> aVar, C0629g gVar) {
        Fragment fragment;
        Fragment fragment2;
        C0637s j;
        Object obj;
        C0602j jVar2 = jVar;
        C0630h hVar2 = hVar;
        View view2 = view;
        C3465a<String, String> aVar2 = aVar;
        C0629g gVar2 = gVar;
        ViewGroup viewGroup = jVar2.f3091p.mo3726c() ? (ViewGroup) jVar2.f3091p.mo3725b(i) : null;
        if (viewGroup != null && (j = m4057j(fragment2, fragment)) != null) {
            boolean z = hVar2.f3198b;
            boolean z2 = hVar2.f3201e;
            Object r = m4065r(j, (fragment = hVar2.f3197a), z);
            Object s = m4066s(j, (fragment2 = hVar2.f3200d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            Object obj3 = r;
            C0637s sVar = j;
            Fragment fragment3 = fragment2;
            Object l = m4059l(j, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m4058k(sVar, obj, fragment3, arrayList4, view2);
            Object obj5 = (k == null || k.isEmpty()) ? null : obj;
            sVar.mo4086a(obj4, view2);
            Object v = m4069v(sVar, obj4, obj5, l, fragment, hVar2.f3198b);
            if (!(fragment3 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C3644b bVar = new C3644b();
                gVar2.mo3985b(fragment3, bVar);
                sVar.mo4099w(fragment3, v, bVar, new C0625c(gVar2, fragment3, bVar));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                C0637s sVar2 = sVar;
                sVar2.mo4096t(v, obj4, arrayList5, obj5, k, l, arrayList2);
                m4073z(sVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k);
                ArrayList arrayList6 = arrayList2;
                C3465a<String, String> aVar3 = aVar;
                sVar.mo4123x(viewGroup, arrayList6, aVar3);
                sVar.mo4088c(viewGroup, v);
                sVar.mo4122s(viewGroup, arrayList6, aVar3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r4.f3197a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4062o(androidx.fragment.app.C0602j r17, int r18, androidx.fragment.app.C0622q.C0630h r19, android.view.View r20, p082e.p098e.C3465a<java.lang.String, java.lang.String> r21, androidx.fragment.app.C0622q.C0629g r22) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            r10 = r22
            androidx.fragment.app.d r1 = r0.f3091p
            boolean r1 = r1.mo3726c()
            if (r1 == 0) goto L_0x001b
            androidx.fragment.app.d r0 = r0.f3091p
            r1 = r18
            android.view.View r0 = r0.mo3725b(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r11 = r0
            if (r11 != 0) goto L_0x0020
            return
        L_0x0020:
            androidx.fragment.app.Fragment r12 = r4.f3197a
            androidx.fragment.app.Fragment r13 = r4.f3200d
            androidx.fragment.app.s r14 = m4057j(r13, r12)
            if (r14 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r15 = r4.f3198b
            boolean r0 = r4.f3201e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r6 = m4065r(r14, r12, r15)
            java.lang.Object r5 = m4066s(r14, r13, r0)
            r0 = r14
            r1 = r11
            r2 = r20
            r3 = r21
            r4 = r19
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r8
            r16 = r11
            r11 = r7
            r7 = r18
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m4060m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            r7 = r17
            if (r7 != 0) goto L_0x0068
            return
        L_0x0066:
            r7 = r17
        L_0x0068:
            java.util.ArrayList r5 = m4058k(r14, r7, r13, r11, r9)
            java.util.ArrayList r9 = m4058k(r14, r6, r12, r10, r9)
            r0 = 4
            m4046B(r9, r0)
            r0 = r14
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r12
            r12 = r5
            r5 = r15
            java.lang.Object r15 = m4069v(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.size()
            if (r0 > 0) goto L_0x008f
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
        L_0x008f:
            e.h.l.b r0 = new e.h.l.b
            r0.<init>()
            r1 = r22
            r1.mo3985b(r13, r0)
            androidx.fragment.app.q$a r2 = new androidx.fragment.app.q$a
            r2.<init>(r1, r13, r0)
            r14.mo4099w(r13, r15, r0, r2)
        L_0x00a1:
            if (r15 == 0) goto L_0x00cb
            m4070w(r14, r7, r13, r12)
            java.util.ArrayList r13 = r14.mo4121o(r10)
            r0 = r14
            r1 = r15
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r12
            r6 = r8
            r7 = r10
            r0.mo4096t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r14.mo4088c(r0, r15)
            r1 = r14
            r2 = r0
            r3 = r11
            r4 = r10
            r5 = r13
            r6 = r21
            r1.mo4124y(r2, r3, r4, r5, r6)
            r0 = 0
            m4046B(r9, r0)
            r14.mo4084A(r8, r11, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0622q.m4062o(androidx.fragment.app.j, int, androidx.fragment.app.q$h, android.view.View, e.e.a, androidx.fragment.app.q$g):void");
    }

    /* renamed from: p */
    private static C0630h m4063p(C0630h hVar, SparseArray<C0630h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0630h hVar2 = new C0630h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static String m4064q(C3465a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo12397m(i))) {
                return aVar.mo12395i(i);
            }
        }
        return null;
    }

    /* renamed from: r */
    private static Object m4065r(C0637s sVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo3696r0();
        } else {
            obj = fragment.mo3654b0();
        }
        return sVar.mo4090g(obj);
    }

    /* renamed from: s */
    private static Object m4066s(C0637s sVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo3706v0();
        } else {
            obj = fragment.mo3659d0();
        }
        return sVar.mo4090g(obj);
    }

    /* renamed from: t */
    static View m4067t(C3465a<String, View> aVar, C0630h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C0583a aVar2 = hVar.f3199c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3148n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f3148n.get(0);
        } else {
            str = aVar2.f3149o.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: u */
    private static Object m4068u(C0637s sVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.mo3712y0();
        } else {
            obj = fragment.mo3709w0();
        }
        return sVar.mo4085B(sVar.mo4090g(obj));
    }

    /* renamed from: v */
    private static Object m4069v(C0637s sVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.mo3613N() : fragment.mo3610M();
        }
        if (z2) {
            return sVar.mo4092n(obj2, obj, obj3);
        }
        return sVar.mo4091m(obj2, obj, obj3);
    }

    /* renamed from: w */
    private static void m4070w(C0637s sVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2946q && fragment.f2912E && fragment.f2925R) {
            fragment.mo3593G2(true);
            sVar.mo4095r(obj, fragment.mo3600J0(), arrayList);
            C3770r.m16143a(fragment.f2919L, new C0624b(arrayList));
        }
    }

    /* renamed from: x */
    private static C0637s m4071x() {
        try {
            return (C0637s) Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    private static void m4072y(C3465a<String, String> aVar, C3465a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo12397m(size))) {
                aVar.mo8472k(size);
            }
        }
    }

    /* renamed from: z */
    private static void m4073z(C0637s sVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C3770r.m16143a(viewGroup, new C0626d(obj, sVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
