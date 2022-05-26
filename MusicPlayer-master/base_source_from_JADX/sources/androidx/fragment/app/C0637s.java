package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p082e.p109h.p115l.C3644b;
import p082e.p109h.p119p.C3770r;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3788x;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.s */
/* compiled from: FragmentTransitionImpl */
public abstract class C0637s {

    /* renamed from: androidx.fragment.app.s$a */
    /* compiled from: FragmentTransitionImpl */
    class C0638a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f3215g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f3216h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f3217i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3218j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3219k;

        C0638a(C0637s sVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3215g = i;
            this.f3216h = arrayList;
            this.f3217i = arrayList2;
            this.f3218j = arrayList3;
            this.f3219k = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f3215g; i++) {
                C3774v.m16162G0((View) this.f3216h.get(i), (String) this.f3217i.get(i));
                C3774v.m16162G0((View) this.f3218j.get(i), (String) this.f3219k.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.s$b */
    /* compiled from: FragmentTransitionImpl */
    class C0639b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ArrayList f3220g;

        /* renamed from: h */
        final /* synthetic */ Map f3221h;

        C0639b(C0637s sVar, ArrayList arrayList, Map map) {
            this.f3220g = arrayList;
            this.f3221h = map;
        }

        public void run() {
            int size = this.f3220g.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3220g.get(i);
                String K = C3774v.m16169K(view);
                if (K != null) {
                    C3774v.m16162G0(view, C0637s.m4096i(this.f3221h, K));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.s$c */
    /* compiled from: FragmentTransitionImpl */
    class C0640c implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ArrayList f3222g;

        /* renamed from: h */
        final /* synthetic */ Map f3223h;

        C0640c(C0637s sVar, ArrayList arrayList, Map map) {
            this.f3222g = arrayList;
            this.f3223h = map;
        }

        public void run() {
            int size = this.f3222g.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3222g.get(i);
                C3774v.m16162G0(view, (String) this.f3223h.get(C3774v.m16169K(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m4094d(List<View> list, View view) {
        int size = list.size();
        if (!m4095h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m4095h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m4095h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m4096i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m4097l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo4084A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo4085B(Object obj);

    /* renamed from: a */
    public abstract void mo4086a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo4087b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo4088c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo4089e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4118f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C3788x.m16293a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo4118f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: g */
    public abstract Object mo4090g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4119j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String K = C3774v.m16169K(view);
            if (K != null) {
                map.put(K, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo4119j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4120k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: m */
    public abstract Object mo4091m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo4092n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> mo4121o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C3774v.m16169K(view));
            C3774v.m16162G0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo4093p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo4094q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo4095r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4122s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C3770r.m16143a(viewGroup, new C0640c(this, arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo4096t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo4097u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo4098v(Object obj, View view);

    /* renamed from: w */
    public void mo4099w(Fragment fragment, Object obj, C3644b bVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4123x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C3770r.m16143a(view, new C0639b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4124y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String K = C3774v.m16169K(view2);
            arrayList4.add(K);
            if (K != null) {
                C3774v.m16162G0(view2, (String) null);
                String str = map.get(K);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C3774v.m16162G0(arrayList2.get(i2), K);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C3770r.m16143a(view, new C0638a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo4100z(Object obj, View view, ArrayList<View> arrayList);
}
