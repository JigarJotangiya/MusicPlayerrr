package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.C0279g0;
import androidx.core.graphics.drawable.C0534a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C6093m;
import com.google.android.material.internal.C6100s;
import com.google.android.material.theme.p249a.C6260a;
import p082e.p083a.p090o.C3439g;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7545i;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: g */
    private final C6118b f28561g;

    /* renamed from: h */
    private final C6119c f28562h;

    /* renamed from: i */
    private final NavigationBarPresenter f28563i;

    /* renamed from: j */
    private ColorStateList f28564j;

    /* renamed from: k */
    private MenuInflater f28565k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C6111d f28566l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6110c f28567m;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6107a();

        /* renamed from: i */
        Bundle f28568i;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        static class C6107a implements Parcelable.ClassLoaderCreator<SavedState> {
            C6107a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m36615b(Parcel parcel, ClassLoader classLoader) {
            this.f28568i = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f28568i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m36615b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    class C6108a implements C0171g.C0172a {
        C6108a() {
        }

        /* renamed from: a */
        public boolean mo532a(C0171g gVar, MenuItem menuItem) {
            if (NavigationBarView.this.f28567m != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                NavigationBarView.this.f28567m.mo24286a(menuItem);
                return true;
            } else if (NavigationBarView.this.f28566l == null || NavigationBarView.this.f28566l.mo24287a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public void mo534b(C0171g gVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    class C6109b implements C6100s.C6104d {
        C6109b(NavigationBarView navigationBarView) {
        }

        /* renamed from: a */
        public C3718d0 mo23008a(View view, C3718d0 d0Var, C6100s.C6105e eVar) {
            eVar.f28554d += d0Var.mo13035i();
            boolean z = true;
            if (C3774v.m16151B(view) != 1) {
                z = false;
            }
            int j = d0Var.mo13036j();
            int k = d0Var.mo13037k();
            eVar.f28551a += z ? k : j;
            int i = eVar.f28553c;
            if (!z) {
                j = k;
            }
            eVar.f28553c = i + j;
            eVar.mo24239a(view);
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C6110c {
        /* renamed from: a */
        void mo24286a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$d */
    public interface C6111d {
        /* renamed from: a */
        boolean mo24287a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C6260a.m37386c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f28563i = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C7500l.NavigationBarView;
        int i3 = C7500l.NavigationBarView_itemTextAppearanceInactive;
        int i4 = C7500l.NavigationBarView_itemTextAppearanceActive;
        C0279g0 i5 = C6093m.m36564i(context2, attributeSet, iArr, i, i2, i3, i4);
        C6118b bVar = new C6118b(context2, getClass(), getMaxItemCount());
        this.f28561g = bVar;
        C6119c e = mo23034e(context2);
        this.f28562h = e;
        navigationBarPresenter.mo24241b(e);
        navigationBarPresenter.mo24240a(1);
        e.setPresenter(navigationBarPresenter);
        bVar.mo916b(navigationBarPresenter);
        navigationBarPresenter.mo819J(getContext(), bVar);
        int i6 = C7500l.NavigationBarView_itemIconTint;
        if (i5.mo1994s(i6)) {
            e.setIconTintList(i5.mo1978c(i6));
        } else {
            e.setIconTintList(e.mo24353e(16842808));
        }
        setItemIconSize(i5.mo1981f(C7500l.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C7492d.mtrl_navigation_bar_item_default_icon_size)));
        if (i5.mo1994s(i3)) {
            setItemTextAppearanceInactive(i5.mo1989n(i3, 0));
        }
        if (i5.mo1994s(i4)) {
            setItemTextAppearanceActive(i5.mo1989n(i4, 0));
        }
        int i7 = C7500l.NavigationBarView_itemTextColor;
        if (i5.mo1994s(i7)) {
            setItemTextColor(i5.mo1978c(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C3774v.m16223r0(this, m36612d(context2));
        }
        int i8 = C7500l.NavigationBarView_elevation;
        if (i5.mo1994s(i8)) {
            setElevation((float) i5.mo1981f(i8, 0));
        }
        C0534a.m3289o(getBackground().mutate(), C7522c.m42015b(context2, i5, C7500l.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(i5.mo1987l(C7500l.NavigationBarView_labelVisibilityMode, -1));
        int n = i5.mo1989n(C7500l.NavigationBarView_itemBackground, 0);
        if (n != 0) {
            e.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(C7522c.m42015b(context2, i5, C7500l.NavigationBarView_itemRippleColor));
        }
        int i9 = C7500l.NavigationBarView_menu;
        if (i5.mo1994s(i9)) {
            mo24249f(i5.mo1989n(i9, 0));
        }
        i5.mo1995w();
        addView(e);
        bVar.mo901V(new C6108a());
        m36611c();
    }

    /* renamed from: c */
    private void m36611c() {
        C6100s.m36581b(this, new C6109b(this));
    }

    /* renamed from: d */
    private C7541h m36612d(Context context) {
        C7541h hVar = new C7541h();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            hVar.mo28463a0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        hVar.mo28456P(context);
        return hVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f28565k == null) {
            this.f28565k = new C3439g(getContext());
        }
        return this.f28565k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C6119c mo23034e(Context context);

    /* renamed from: f */
    public void mo24249f(int i) {
        this.f28563i.mo24242d(true);
        getMenuInflater().inflate(i, this.f28561g);
        this.f28563i.mo24242d(false);
        this.f28563i.mo815E(true);
    }

    public Drawable getItemBackground() {
        return this.f28562h.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f28562h.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f28562h.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f28562h.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f28564j;
    }

    public int getItemTextAppearanceActive() {
        return this.f28562h.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f28562h.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f28562h.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f28562h.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f28561g;
    }

    public C0188n getMenuView() {
        return this.f28562h;
    }

    /* access modifiers changed from: protected */
    public NavigationBarPresenter getPresenter() {
        return this.f28563i;
    }

    public int getSelectedItemId() {
        return this.f28562h.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42139e(this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        this.f28561g.mo898S(savedState.f28568i);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f28568i = bundle;
        this.f28561g.mo900U(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C7545i.m42138d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f28562h.setItemBackground(drawable);
        this.f28564j = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f28562h.setItemBackgroundRes(i);
        this.f28564j = null;
    }

    public void setItemIconSize(int i) {
        this.f28562h.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f28562h.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f28564j != colorStateList) {
            this.f28564j = colorStateList;
            if (colorStateList == null) {
                this.f28562h.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList a = C7531b.m42043a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f28562h.setItemBackground(new RippleDrawable(a, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable r = C0534a.m3292r(gradientDrawable);
            C0534a.m3289o(r, a);
            this.f28562h.setItemBackground(r);
        } else if (colorStateList == null && this.f28562h.getItemBackground() != null) {
            this.f28562h.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f28562h.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f28562h.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f28562h.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f28562h.getLabelVisibilityMode() != i) {
            this.f28562h.setLabelVisibilityMode(i);
            this.f28563i.mo815E(false);
        }
    }

    public void setOnItemReselectedListener(C6110c cVar) {
        this.f28567m = cVar;
    }

    public void setOnItemSelectedListener(C6111d dVar) {
        this.f28566l = dVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f28561g.findItem(i);
        if (findItem != null && !this.f28561g.mo895O(findItem, this.f28563i, 0)) {
            findItem.setChecked(true);
        }
    }
}
