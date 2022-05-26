package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.g */
/* compiled from: GhostViewHolder */
class C1120g extends FrameLayout {

    /* renamed from: g */
    private ViewGroup f4674g;

    /* renamed from: h */
    private boolean f4675h = true;

    C1120g(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f4674g = viewGroup;
        viewGroup.setTag(C1143p.ghost_view_holder, this);
        C1116e0.m6391b(this.f4674g).mo6031c(this);
    }

    /* renamed from: b */
    static C1120g m6397b(ViewGroup viewGroup) {
        return (C1120g) viewGroup.getTag(C1143p.ghost_view_holder);
    }

    /* renamed from: c */
    private int m6398c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m6399d(((C1125i) getChildAt(i2)).f4692i, arrayList2);
            if (m6401f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: d */
    private static void m6399d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m6399d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m6400e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT < 21 || view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(C1116e0.m6390a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m6401f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m6400e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6041a(C1125i iVar) {
        ArrayList arrayList = new ArrayList();
        m6399d(iVar.f4692i, arrayList);
        int c = m6398c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(iVar);
        } else {
            addView(iVar, c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6042g() {
        if (this.f4675h) {
            C1116e0.m6391b(this.f4674g).mo6032d(this);
            C1116e0.m6391b(this.f4674g).mo6031c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f4675h) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f4674g.setTag(C1143p.ghost_view_holder, (Object) null);
            C1116e0.m6391b(this.f4674g).mo6032d(this);
            this.f4675h = false;
        }
    }
}
