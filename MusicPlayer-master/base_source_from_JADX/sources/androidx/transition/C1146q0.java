package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.q0 */
/* compiled from: VisibilityPropagation */
public abstract class C1146q0 extends C1157w {

    /* renamed from: a */
    private static final String[] f4722a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m6485d(C1160y yVar, int i) {
        int[] iArr;
        if (yVar == null || (iArr = (int[]) yVar.f4751a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo6116a(C1160y yVar) {
        View view = yVar.f4752b;
        Integer num = (Integer) yVar.f4751a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        yVar.f4751a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        yVar.f4751a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: b */
    public String[] mo6117b() {
        return f4722a;
    }

    /* renamed from: e */
    public int mo6118e(C1160y yVar) {
        Integer num;
        if (yVar == null || (num = (Integer) yVar.f4751a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo6119f(C1160y yVar) {
        return m6485d(yVar, 0);
    }

    /* renamed from: g */
    public int mo6120g(C1160y yVar) {
        return m6485d(yVar, 1);
    }
}
