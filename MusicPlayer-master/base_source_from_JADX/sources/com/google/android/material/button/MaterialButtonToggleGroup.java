package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C6100s;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p315w.C7534a;
import p159f.p243f.p245b.p304b.p315w.C7536c;
import p159f.p243f.p245b.p304b.p315w.C7549m;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: q */
    private static final String f27912q = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: r */
    private static final int f27913r = C7499k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: g */
    private final List<C5947d> f27914g;

    /* renamed from: h */
    private final C5946c f27915h;

    /* renamed from: i */
    private final C5949f f27916i;

    /* renamed from: j */
    private final LinkedHashSet<C5948e> f27917j;

    /* renamed from: k */
    private final Comparator<MaterialButton> f27918k;

    /* renamed from: l */
    private Integer[] f27919l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f27920m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f27921n;

    /* renamed from: o */
    private boolean f27922o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f27923p;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    class C5944a implements Comparator<MaterialButton> {
        C5944a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    class C5945b extends C3704a {
        C5945b() {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13120f0(C3736c.C3739c.m16068a(0, 1, MaterialButtonToggleGroup.this.m35596n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    private class C5946c implements MaterialButton.C5942a {
        private C5946c() {
        }

        /* renamed from: a */
        public void mo23140a(MaterialButton materialButton, boolean z) {
            if (!MaterialButtonToggleGroup.this.f27920m) {
                if (MaterialButtonToggleGroup.this.f27921n) {
                    int unused = MaterialButtonToggleGroup.this.f27923p = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.m35602u(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.m35594l(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }

        /* synthetic */ C5946c(MaterialButtonToggleGroup materialButtonToggleGroup, C5944a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    private static class C5947d {

        /* renamed from: e */
        private static final C7536c f27927e = new C7534a(0.0f);

        /* renamed from: a */
        C7536c f27928a;

        /* renamed from: b */
        C7536c f27929b;

        /* renamed from: c */
        C7536c f27930c;

        /* renamed from: d */
        C7536c f27931d;

        C5947d(C7536c cVar, C7536c cVar2, C7536c cVar3, C7536c cVar4) {
            this.f27928a = cVar;
            this.f27929b = cVar3;
            this.f27930c = cVar4;
            this.f27931d = cVar2;
        }

        /* renamed from: a */
        public static C5947d m35611a(C5947d dVar) {
            C7536c cVar = f27927e;
            return new C5947d(cVar, dVar.f27931d, cVar, dVar.f27930c);
        }

        /* renamed from: b */
        public static C5947d m35612b(C5947d dVar, View view) {
            return C6100s.m36587h(view) ? m35613c(dVar) : m35614d(dVar);
        }

        /* renamed from: c */
        public static C5947d m35613c(C5947d dVar) {
            C7536c cVar = dVar.f27928a;
            C7536c cVar2 = dVar.f27931d;
            C7536c cVar3 = f27927e;
            return new C5947d(cVar, cVar2, cVar3, cVar3);
        }

        /* renamed from: d */
        public static C5947d m35614d(C5947d dVar) {
            C7536c cVar = f27927e;
            return new C5947d(cVar, cVar, dVar.f27929b, dVar.f27930c);
        }

        /* renamed from: e */
        public static C5947d m35615e(C5947d dVar, View view) {
            return C6100s.m36587h(view) ? m35614d(dVar) : m35613c(dVar);
        }

        /* renamed from: f */
        public static C5947d m35616f(C5947d dVar) {
            C7536c cVar = dVar.f27928a;
            C7536c cVar2 = f27927e;
            return new C5947d(cVar, cVar2, dVar.f27929b, cVar2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public interface C5948e {
        /* renamed from: a */
        void mo23161a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    private class C5949f implements MaterialButton.C5943b {
        private C5949f() {
        }

        /* renamed from: a */
        public void mo23141a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C5949f(MaterialButtonToggleGroup materialButtonToggleGroup, C5944a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m35598p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m35598p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m35598p(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m35591h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton m = m35595m(i);
                int min = Math.min(m.getStrokeWidth(), m35595m(i - 1).getStrokeWidth());
                LinearLayout.LayoutParams i2 = m35592i(m);
                if (getOrientation() == 0) {
                    C3760h.m16096d(i2, 0);
                    C3760h.m16097e(i2, -min);
                    i2.topMargin = 0;
                } else {
                    i2.bottomMargin = 0;
                    i2.topMargin = -min;
                    C3760h.m16097e(i2, 0);
                }
                m.setLayoutParams(i2);
            }
            m35599r(firstVisibleChildIndex);
        }
    }

    /* renamed from: i */
    private LinearLayout.LayoutParams m35592i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    private void m35593j(int i, boolean z) {
        MaterialButton materialButton = (MaterialButton) findViewById(i);
        if (materialButton != null) {
            materialButton.setChecked(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m35594l(int i, boolean z) {
        Iterator it = this.f27917j.iterator();
        while (it.hasNext()) {
            ((C5948e) it.next()).mo23161a(this, i, z);
        }
    }

    /* renamed from: m */
    private MaterialButton m35595m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public int m35596n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m35598p(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private C5947d m35597o(int i, int i2, int i3) {
        C5947d dVar = this.f27914g.get(i);
        if (i2 == i3) {
            return dVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C5947d.m35615e(dVar, this) : C5947d.m35616f(dVar);
        }
        if (i == i3) {
            return z ? C5947d.m35612b(dVar, this) : C5947d.m35611a(dVar);
        }
        return null;
    }

    /* renamed from: p */
    private boolean m35598p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: r */
    private void m35599r(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m35595m(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C3760h.m16096d(layoutParams, 0);
            C3760h.m16097e(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: s */
    private void m35600s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f27920m = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f27920m = false;
        }
    }

    private void setCheckedId(int i) {
        this.f27923p = i;
        m35594l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C3774v.m16208k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.mo23078a(this.f27915h);
        materialButton.setOnPressedChangeListenerInternal(this.f27916i);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    private static void m35601t(C7549m.C7551b bVar, C5947d dVar) {
        if (dVar == null) {
            bVar.mo28527o(0.0f);
            return;
        }
        bVar.mo28521F(dVar.f27928a);
        bVar.mo28535w(dVar.f27931d);
        bVar.mo28525J(dVar.f27929b);
        bVar.mo28516A(dVar.f27930c);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public boolean m35602u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f27922o || !checkedButtonIds.isEmpty()) {
            if (z && this.f27921n) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    m35600s(intValue2, false);
                    m35594l(intValue2, false);
                }
            }
            return true;
        }
        m35600s(i, true);
        this.f27923p = i;
        return false;
    }

    /* renamed from: v */
    private void m35603v() {
        TreeMap treeMap = new TreeMap(this.f27918k);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m35595m(i), Integer.valueOf(i));
        }
        this.f27919l = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f27912q, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            m35602u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C7549m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f27914g.add(new C5947d(shapeAppearanceModel.mo28508r(), shapeAppearanceModel.mo28501j(), shapeAppearanceModel.mo28510t(), shapeAppearanceModel.mo28503l()));
        C3774v.m16217o0(materialButton, new C5945b());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m35603v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void mo23144g(C5948e eVar) {
        this.f27917j.add(eVar);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f27921n) {
            return this.f27923p;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m35595m(i);
            if (m.isChecked()) {
                arrayList.add(Integer.valueOf(m.getId()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f27919l;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f27912q, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: k */
    public void mo23149k() {
        this.f27920m = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m35595m(i);
            m.setChecked(false);
            m35594l(m.getId(), false);
        }
        this.f27920m = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f27923p;
        if (i != -1) {
            m35593j(i, true);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(1, getVisibleButtonCount(), false, mo23154q() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo23158w();
        m35591h();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.mo23095i(this.f27915h);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.C5943b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f27914g.remove(indexOfChild);
        }
        mo23158w();
        m35591h();
    }

    /* renamed from: q */
    public boolean mo23154q() {
        return this.f27921n;
    }

    public void setSelectionRequired(boolean z) {
        this.f27922o = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f27921n != z) {
            this.f27921n = z;
            mo23149k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo23158w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m = m35595m(i);
            if (m.getVisibility() != 8) {
                C7549m.C7551b v = m.getShapeAppearanceModel().mo28512v();
                m35601t(v, m35597o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m.setShapeAppearanceModel(v.mo28526m());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f27913r
            android.content.Context r7 = com.google.android.material.theme.p249a.C6260a.m37386c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f27914g = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f27915h = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f27916i = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f27917j = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f27918k = r7
            r7 = 0
            r6.f27920m = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r9 = p159f.p243f.p245b.p304b.C7500l.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = p159f.p243f.p245b.p304b.C7500l.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f27923p = r9
            int r9 = p159f.p243f.p245b.p304b.C7500l.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f27922o = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            p082e.p109h.p119p.C3774v.m16237y0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
