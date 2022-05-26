package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;

public class ChipGroup extends FlowLayout {

    /* renamed from: t */
    private static final int f28010t = C7499k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: k */
    private int f28011k;

    /* renamed from: l */
    private int f28012l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f28013m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f28014n;

    /* renamed from: o */
    private C5959c f28015o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C5958b f28016p;

    /* renamed from: q */
    private C5960d f28017q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f28018r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f28019s;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C5958b implements CompoundButton.OnCheckedChangeListener {
        private C5958b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f28019s) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f28014n) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f28018r == -1 || ChipGroup.this.f28018r == id || !ChipGroup.this.f28013m)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m35763r(chipGroup.f28018r, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f28018r == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.m35763r(compoundButton.getId(), true);
                    ChipGroup.this.m35762q(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public interface C5959c {
        /* renamed from: a */
        void mo23458a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    private class C5960d implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public ViewGroup.OnHierarchyChangeListener f28021g;

        private C5960d() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C3774v.m16208k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).mo23433m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f28016p);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f28021g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f28021g;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m35762q(int i, boolean z) {
        this.f28018r = i;
        C5959c cVar = this.f28015o;
        if (cVar != null && this.f28013m && z) {
            cVar.mo23458a(this, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m35763r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f28019s = true;
            ((Chip) findViewById).setChecked(z);
            this.f28019s = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        m35762q(i, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f28018r;
                if (i2 != -1 && this.f28013m) {
                    m35763r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: c */
    public boolean mo23424c() {
        return super.mo23424c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f28013m) {
            return this.f28018r;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f28013m) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f28011k;
    }

    public int getChipSpacingVertical() {
        return this.f28012l;
    }

    /* renamed from: m */
    public void mo23433m(int i) {
        int i2 = this.f28018r;
        if (i != i2) {
            if (i2 != -1 && this.f28013m) {
                m35763r(i2, false);
            }
            if (i != -1) {
                m35763r(i, true);
            }
            setCheckedId(i);
        }
    }

    /* renamed from: n */
    public void mo23434n() {
        this.f28019s = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f28019s = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo23435o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f28018r;
        if (i != -1) {
            m35763r(i, true);
            setCheckedId(this.f28018r);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(getRowCount(), mo23424c() ? getChipCount() : -1, false, mo23438p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean mo23438p() {
        return this.f28013m;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f28011k != i) {
            this.f28011k = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f28012l != i) {
            this.f28012l = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C5959c cVar) {
        this.f28015o = cVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f28017q.f28021g = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f28014n = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f28013m != z) {
            this.f28013m = z;
            mo23434n();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.chipGroupStyle);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f28010t
            android.content.Context r8 = com.google.android.material.theme.p249a.C6260a.m37386c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f28016p = r8
            com.google.android.material.chip.ChipGroup$d r8 = new com.google.android.material.chip.ChipGroup$d
            r8.<init>()
            r7.f28017q = r8
            r8 = -1
            r7.f28018r = r8
            r6 = 0
            r7.f28019s = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r10 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine((boolean) r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection((boolean) r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = p159f.p243f.p245b.p304b.C7500l.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L_0x0069
            r7.f28018r = r10
        L_0x0069:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$d r8 = r7.f28017q
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            p082e.p109h.p119p.C3774v.m16237y0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
