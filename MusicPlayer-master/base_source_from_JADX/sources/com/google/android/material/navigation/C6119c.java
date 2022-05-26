package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0188n;
import androidx.transition.AutoTransition;
import androidx.transition.C1154v;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C6090k;
import java.util.HashSet;
import p082e.p083a.C3400a;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3702h;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p137o.p138a.p139a.C4097b;

/* renamed from: com.google.android.material.navigation.c */
/* compiled from: NavigationBarMenuView */
public abstract class C6119c extends ViewGroup implements C0188n {

    /* renamed from: A */
    private static final int[] f28603A = {-16842910};

    /* renamed from: z */
    private static final int[] f28604z = {16842912};

    /* renamed from: g */
    private final TransitionSet f28605g;

    /* renamed from: h */
    private final View.OnClickListener f28606h;

    /* renamed from: i */
    private final C3700f<C6116a> f28607i = new C3702h(5);

    /* renamed from: j */
    private final SparseArray<View.OnTouchListener> f28608j = new SparseArray<>(5);

    /* renamed from: k */
    private int f28609k;

    /* renamed from: l */
    private C6116a[] f28610l;

    /* renamed from: m */
    private int f28611m = 0;

    /* renamed from: n */
    private int f28612n = 0;

    /* renamed from: o */
    private ColorStateList f28613o;

    /* renamed from: p */
    private int f28614p;

    /* renamed from: q */
    private ColorStateList f28615q;

    /* renamed from: r */
    private final ColorStateList f28616r = mo24353e(16842808);

    /* renamed from: s */
    private int f28617s;

    /* renamed from: t */
    private int f28618t;

    /* renamed from: u */
    private Drawable f28619u;

    /* renamed from: v */
    private int f28620v;

    /* renamed from: w */
    private SparseArray<BadgeDrawable> f28621w = new SparseArray<>(5);
    /* access modifiers changed from: private */

    /* renamed from: x */
    public NavigationBarPresenter f28622x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C0171g f28623y;

    /* renamed from: com.google.android.material.navigation.c$a */
    /* compiled from: NavigationBarMenuView */
    class C6120a implements View.OnClickListener {
        C6120a() {
        }

        public void onClick(View view) {
            C0175i itemData = ((C6116a) view).getItemData();
            if (!C6119c.this.f28623y.mo895O(itemData, C6119c.this.f28622x, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public C6119c(Context context) {
        super(context);
        AutoTransition autoTransition = new AutoTransition();
        this.f28605g = autoTransition;
        autoTransition.mo6016w0(0);
        autoTransition.mo6014u0(115);
        autoTransition.mo5980f0(new C4097b());
        autoTransition.mo6009o0(new C6090k());
        this.f28606h = new C6120a();
        C3774v.m16237y0(this, 1);
    }

    private C6116a getNewItem() {
        C6116a b = this.f28607i.mo8513b();
        return b == null ? mo23041f(getContext()) : b;
    }

    /* renamed from: h */
    private boolean m36657h(int i) {
        return i != -1;
    }

    /* renamed from: i */
    private void m36658i() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f28623y.size(); i++) {
            hashSet.add(Integer.valueOf(this.f28623y.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f28621w.size(); i2++) {
            int keyAt = this.f28621w.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f28621w.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(C6116a aVar) {
        BadgeDrawable badgeDrawable;
        int id = aVar.getId();
        if (m36657h(id) && (badgeDrawable = this.f28621w.get(id)) != null) {
            aVar.setBadge(badgeDrawable);
        }
    }

    /* renamed from: b */
    public void mo741b(C0171g gVar) {
        this.f28623y = gVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d */
    public void mo24352d() {
        removeAllViews();
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a aVar : aVarArr) {
                if (aVar != null) {
                    this.f28607i.mo8512a(aVar);
                    aVar.mo24327g();
                }
            }
        }
        if (this.f28623y.size() == 0) {
            this.f28611m = 0;
            this.f28612n = 0;
            this.f28610l = null;
            return;
        }
        m36658i();
        this.f28610l = new C6116a[this.f28623y.size()];
        boolean g = mo24354g(this.f28609k, this.f28623y.mo887G().size());
        for (int i = 0; i < this.f28623y.size(); i++) {
            this.f28622x.mo24242d(true);
            this.f28623y.getItem(i).setCheckable(true);
            this.f28622x.mo24242d(false);
            C6116a newItem = getNewItem();
            this.f28610l[i] = newItem;
            newItem.setIconTintList(this.f28613o);
            newItem.setIconSize(this.f28614p);
            newItem.setTextColor(this.f28616r);
            newItem.setTextAppearanceInactive(this.f28617s);
            newItem.setTextAppearanceActive(this.f28618t);
            newItem.setTextColor(this.f28615q);
            Drawable drawable = this.f28619u;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f28620v);
            }
            newItem.setShifting(g);
            newItem.setLabelVisibilityMode(this.f28609k);
            C0175i iVar = (C0175i) this.f28623y.getItem(i);
            newItem.mo722n(iVar, 0);
            newItem.setItemPosition(i);
            int itemId = iVar.getItemId();
            newItem.setOnTouchListener(this.f28608j.get(itemId));
            newItem.setOnClickListener(this.f28606h);
            int i2 = this.f28611m;
            if (i2 != 0 && itemId == i2) {
                this.f28612n = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f28623y.size() - 1, this.f28612n);
        this.f28612n = min;
        this.f28623y.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList mo24353e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c = C3410a.m14542c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C3400a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        int[] iArr = f28603A;
        return new ColorStateList(new int[][]{iArr, f28604z, ViewGroup.EMPTY_STATE_SET}, new int[]{c.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C6116a mo23041f(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo24354g(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f28621w;
    }

    public ColorStateList getIconTintList() {
        return this.f28613o;
    }

    public Drawable getItemBackground() {
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f28619u;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f28620v;
    }

    public int getItemIconSize() {
        return this.f28614p;
    }

    public int getItemTextAppearanceActive() {
        return this.f28618t;
    }

    public int getItemTextAppearanceInactive() {
        return this.f28617s;
    }

    public ColorStateList getItemTextColor() {
        return this.f28615q;
    }

    public int getLabelVisibilityMode() {
        return this.f28609k;
    }

    /* access modifiers changed from: protected */
    public C0171g getMenu() {
        return this.f28623y;
    }

    public int getSelectedItemId() {
        return this.f28611m;
    }

    /* access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f28612n;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo24368j(int i) {
        int size = this.f28623y.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f28623y.getItem(i2);
            if (i == item.getItemId()) {
                this.f28611m = i;
                this.f28612n = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo24369k() {
        C0171g gVar = this.f28623y;
        if (gVar != null && this.f28610l != null) {
            int size = gVar.size();
            if (size != this.f28610l.length) {
                mo24352d();
                return;
            }
            int i = this.f28611m;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f28623y.getItem(i2);
                if (item.isChecked()) {
                    this.f28611m = item.getItemId();
                    this.f28612n = i2;
                }
            }
            if (i != this.f28611m) {
                C1154v.m6502a(this, this.f28605g);
            }
            boolean g = mo24354g(this.f28609k, this.f28623y.mo887G().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f28622x.mo24242d(true);
                this.f28610l[i3].setLabelVisibilityMode(this.f28609k);
                this.f28610l[i3].setShifting(g);
                this.f28610l[i3].mo722n((C0175i) this.f28623y.getItem(i3), 0);
                this.f28622x.mo24242d(false);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(1, this.f28623y.mo887G().size(), false, 1));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f28621w = sparseArray;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f28613o = colorStateList;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f28619u = drawable;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f28620v = i;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f28614p = i;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f28618t = i;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f28615q;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f28617s = i;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f28615q;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f28615q = colorStateList;
        C6116a[] aVarArr = this.f28610l;
        if (aVarArr != null) {
            for (C6116a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f28609k = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f28622x = navigationBarPresenter;
    }
}
