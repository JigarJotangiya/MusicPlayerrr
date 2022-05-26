package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.view.menu.C0195r;
import androidx.recyclerview.widget.C0913w;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7496h;

/* renamed from: com.google.android.material.internal.f */
/* compiled from: NavigationMenuPresenter */
public class C6068f implements C0186m {

    /* renamed from: A */
    private int f28472A = -1;

    /* renamed from: B */
    final View.OnClickListener f28473B = new C6069a();

    /* renamed from: g */
    private NavigationMenuView f28474g;

    /* renamed from: h */
    LinearLayout f28475h;

    /* renamed from: i */
    private C0186m.C0187a f28476i;

    /* renamed from: j */
    C0171g f28477j;

    /* renamed from: k */
    private int f28478k;

    /* renamed from: l */
    C6071c f28479l;

    /* renamed from: m */
    LayoutInflater f28480m;

    /* renamed from: n */
    int f28481n;

    /* renamed from: o */
    boolean f28482o;

    /* renamed from: p */
    ColorStateList f28483p;

    /* renamed from: q */
    ColorStateList f28484q;

    /* renamed from: r */
    Drawable f28485r;

    /* renamed from: s */
    int f28486s;

    /* renamed from: t */
    int f28487t;

    /* renamed from: u */
    int f28488u;

    /* renamed from: v */
    boolean f28489v;

    /* renamed from: w */
    boolean f28490w = true;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f28491x;

    /* renamed from: y */
    private int f28492y;

    /* renamed from: z */
    int f28493z;

    /* renamed from: com.google.android.material.internal.f$a */
    /* compiled from: NavigationMenuPresenter */
    class C6069a implements View.OnClickListener {
        C6069a() {
        }

        public void onClick(View view) {
            boolean z = true;
            C6068f.this.mo24164B(true);
            C0175i itemData = ((NavigationMenuItemView) view).getItemData();
            C6068f fVar = C6068f.this;
            boolean O = fVar.f28477j.mo895O(itemData, fVar, 0);
            if (itemData == null || !itemData.isCheckable() || !O) {
                z = false;
            } else {
                C6068f.this.f28479l.mo24197l(itemData);
            }
            C6068f.this.mo24164B(false);
            if (z) {
                C6068f.this.mo815E(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    /* compiled from: NavigationMenuPresenter */
    private static class C6070b extends C6080l {
        public C6070b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.f$c */
    /* compiled from: NavigationMenuPresenter */
    private class C6071c extends RecyclerView.C0797h<C6080l> {

        /* renamed from: a */
        private final ArrayList<C6073e> f28495a = new ArrayList<>();

        /* renamed from: b */
        private C0175i f28496b;

        /* renamed from: c */
        private boolean f28497c;

        C6071c() {
            m36508j();
        }

        /* renamed from: c */
        private void m36507c(int i, int i2) {
            while (i < i2) {
                ((C6075g) this.f28495a.get(i)).f28502b = true;
                i++;
            }
        }

        /* renamed from: j */
        private void m36508j() {
            if (!this.f28497c) {
                this.f28497c = true;
                this.f28495a.clear();
                this.f28495a.add(new C6072d());
                int i = -1;
                int size = C6068f.this.f28477j.mo887G().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0175i iVar = C6068f.this.f28477j.mo887G().get(i3);
                    if (iVar.isChecked()) {
                        mo24197l(iVar);
                    }
                    if (iVar.isCheckable()) {
                        iVar.mo1013t(false);
                    }
                    if (iVar.hasSubMenu()) {
                        SubMenu subMenu = iVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f28495a.add(new C6074f(C6068f.this.f28493z, 0));
                            }
                            this.f28495a.add(new C6075g(iVar));
                            int size2 = this.f28495a.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0175i iVar2 = (C0175i) subMenu.getItem(i4);
                                if (iVar2.isVisible()) {
                                    if (!z2 && iVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (iVar2.isCheckable()) {
                                        iVar2.mo1013t(false);
                                    }
                                    if (iVar.isChecked()) {
                                        mo24197l(iVar);
                                    }
                                    this.f28495a.add(new C6075g(iVar2));
                                }
                            }
                            if (z2) {
                                m36507c(size2, this.f28495a.size());
                            }
                        }
                    } else {
                        int groupId = iVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f28495a.size();
                            z = iVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<C6073e> arrayList = this.f28495a;
                                int i5 = C6068f.this.f28493z;
                                arrayList.add(new C6074f(i5, i5));
                            }
                        } else if (!z && iVar.getIcon() != null) {
                            m36507c(i2, this.f28495a.size());
                            z = true;
                        }
                        C6075g gVar = new C6075g(iVar);
                        gVar.f28502b = z;
                        this.f28495a.add(gVar);
                        i = groupId;
                    }
                }
                this.f28497c = false;
            }
        }

        /* renamed from: d */
        public Bundle mo24190d() {
            Bundle bundle = new Bundle();
            C0175i iVar = this.f28496b;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f28495a.size();
            for (int i = 0; i < size; i++) {
                C6073e eVar = this.f28495a.get(i);
                if (eVar instanceof C6075g) {
                    C0175i a = ((C6075g) eVar).mo24202a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: e */
        public C0175i mo24191e() {
            return this.f28496b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo24192f() {
            int i = C6068f.this.f28475h.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C6068f.this.f28479l.getItemCount(); i2++) {
                if (C6068f.this.f28479l.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: g */
        public void onBindViewHolder(C6080l lVar, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                navigationMenuItemView.setIconTintList(C6068f.this.f28484q);
                C6068f fVar = C6068f.this;
                if (fVar.f28482o) {
                    navigationMenuItemView.setTextAppearance(fVar.f28481n);
                }
                ColorStateList colorStateList = C6068f.this.f28483p;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C6068f.this.f28485r;
                C3774v.m16223r0(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C6075g gVar = (C6075g) this.f28495a.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f28502b);
                navigationMenuItemView.setHorizontalPadding(C6068f.this.f28486s);
                navigationMenuItemView.setIconPadding(C6068f.this.f28487t);
                C6068f fVar2 = C6068f.this;
                if (fVar2.f28489v) {
                    navigationMenuItemView.setIconSize(fVar2.f28488u);
                }
                navigationMenuItemView.setMaxLines(C6068f.this.f28491x);
                navigationMenuItemView.mo722n(gVar.mo24202a(), 0);
            } else if (itemViewType == 1) {
                ((TextView) lVar.itemView).setText(((C6075g) this.f28495a.get(i)).mo24202a().getTitle());
            } else if (itemViewType == 2) {
                C6074f fVar3 = (C6074f) this.f28495a.get(i);
                lVar.itemView.setPadding(0, fVar3.mo24201b(), 0, fVar3.mo24200a());
            }
        }

        public int getItemCount() {
            return this.f28495a.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            C6073e eVar = this.f28495a.get(i);
            if (eVar instanceof C6074f) {
                return 2;
            }
            if (eVar instanceof C6072d) {
                return 3;
            }
            if (eVar instanceof C6075g) {
                return ((C6075g) eVar).mo24202a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: h */
        public C6080l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C6068f fVar = C6068f.this;
                return new C6077i(fVar.f28480m, viewGroup, fVar.f28473B);
            } else if (i == 1) {
                return new C6079k(C6068f.this.f28480m, viewGroup);
            } else {
                if (i == 2) {
                    return new C6078j(C6068f.this.f28480m, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C6070b(C6068f.this.f28475h);
            }
        }

        /* renamed from: i */
        public void onViewRecycled(C6080l lVar) {
            if (lVar instanceof C6077i) {
                ((NavigationMenuItemView) lVar.itemView).mo24067D();
            }
        }

        /* renamed from: k */
        public void mo24196k(Bundle bundle) {
            C0175i a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C0175i a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f28497c = true;
                int size = this.f28495a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C6073e eVar = this.f28495a.get(i2);
                    if ((eVar instanceof C6075g) && (a2 = ((C6075g) eVar).mo24202a()) != null && a2.getItemId() == i) {
                        mo24197l(a2);
                        break;
                    }
                    i2++;
                }
                this.f28497c = false;
                m36508j();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f28495a.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C6073e eVar2 = this.f28495a.get(i3);
                    if (!(!(eVar2 instanceof C6075g) || (a = ((C6075g) eVar2).mo24202a()) == null || (actionView = a.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: l */
        public void mo24197l(C0175i iVar) {
            if (this.f28496b != iVar && iVar.isCheckable()) {
                C0175i iVar2 = this.f28496b;
                if (iVar2 != null) {
                    iVar2.setChecked(false);
                }
                this.f28496b = iVar;
                iVar.setChecked(true);
            }
        }

        /* renamed from: m */
        public void mo24198m(boolean z) {
            this.f28497c = z;
        }

        /* renamed from: n */
        public void mo24199n() {
            m36508j();
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.google.android.material.internal.f$d */
    /* compiled from: NavigationMenuPresenter */
    private static class C6072d implements C6073e {
        C6072d() {
        }
    }

    /* renamed from: com.google.android.material.internal.f$e */
    /* compiled from: NavigationMenuPresenter */
    private interface C6073e {
    }

    /* renamed from: com.google.android.material.internal.f$f */
    /* compiled from: NavigationMenuPresenter */
    private static class C6074f implements C6073e {

        /* renamed from: a */
        private final int f28499a;

        /* renamed from: b */
        private final int f28500b;

        public C6074f(int i, int i2) {
            this.f28499a = i;
            this.f28500b = i2;
        }

        /* renamed from: a */
        public int mo24200a() {
            return this.f28500b;
        }

        /* renamed from: b */
        public int mo24201b() {
            return this.f28499a;
        }
    }

    /* renamed from: com.google.android.material.internal.f$g */
    /* compiled from: NavigationMenuPresenter */
    private static class C6075g implements C6073e {

        /* renamed from: a */
        private final C0175i f28501a;

        /* renamed from: b */
        boolean f28502b;

        C6075g(C0175i iVar) {
            this.f28501a = iVar;
        }

        /* renamed from: a */
        public C0175i mo24202a() {
            return this.f28501a;
        }
    }

    /* renamed from: com.google.android.material.internal.f$h */
    /* compiled from: NavigationMenuPresenter */
    private class C6076h extends C0913w {
        C6076h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13117e0(C3736c.C3738b.m16066a(C6068f.this.f28479l.mo24192f(), 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$i */
    /* compiled from: NavigationMenuPresenter */
    private static class C6077i extends C6080l {
        public C6077i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C7496h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.f$j */
    /* compiled from: NavigationMenuPresenter */
    private static class C6078j extends C6080l {
        public C6078j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C7496h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$k */
    /* compiled from: NavigationMenuPresenter */
    private static class C6079k extends C6080l {
        public C6079k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C7496h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.f$l */
    /* compiled from: NavigationMenuPresenter */
    private static abstract class C6080l extends RecyclerView.C0792c0 {
        public C6080l(View view) {
            super(view);
        }
    }

    /* renamed from: C */
    private void m36469C() {
        int i = (this.f28475h.getChildCount() != 0 || !this.f28490w) ? 0 : this.f28492y;
        NavigationMenuView navigationMenuView = this.f28474g;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: A */
    public void mo24163A(int i) {
        this.f28472A = i;
        NavigationMenuView navigationMenuView = this.f28474g;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: B */
    public void mo24164B(boolean z) {
        C6071c cVar = this.f28479l;
        if (cVar != null) {
            cVar.mo24198m(z);
        }
    }

    /* renamed from: D */
    public int mo814D() {
        return this.f28478k;
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        C6071c cVar = this.f28479l;
        if (cVar != null) {
            cVar.mo24199n();
        }
    }

    /* renamed from: F */
    public boolean mo836F() {
        return false;
    }

    /* renamed from: G */
    public boolean mo816G(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: H */
    public boolean mo817H(C0171g gVar, C0175i iVar) {
        return false;
    }

    /* renamed from: J */
    public void mo819J(Context context, C0171g gVar) {
        this.f28480m = LayoutInflater.from(context);
        this.f28477j = gVar;
        this.f28493z = context.getResources().getDimensionPixelOffset(C7492d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: K */
    public void mo837K(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f28474g.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f28479l.mo24196k(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f28475h.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: L */
    public boolean mo820L(C0195r rVar) {
        return false;
    }

    /* renamed from: M */
    public Parcelable mo838M() {
        Bundle bundle = new Bundle();
        if (this.f28474g != null) {
            SparseArray sparseArray = new SparseArray();
            this.f28474g.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C6071c cVar = this.f28479l;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.mo24190d());
        }
        if (this.f28475h != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f28475h.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: b */
    public void mo24165b(View view) {
        this.f28475h.addView(view);
        NavigationMenuView navigationMenuView = this.f28474g;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
        C0186m.C0187a aVar = this.f28476i;
        if (aVar != null) {
            aVar.mo590c(gVar, z);
        }
    }

    /* renamed from: d */
    public void mo24166d(C3718d0 d0Var) {
        int l = d0Var.mo13038l();
        if (this.f28492y != l) {
            this.f28492y = l;
            m36469C();
        }
        NavigationMenuView navigationMenuView = this.f28474g;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, d0Var.mo13035i());
        C3774v.m16202h(this.f28475h, d0Var);
    }

    /* renamed from: e */
    public C0175i mo24167e() {
        return this.f28479l.mo24191e();
    }

    /* renamed from: f */
    public int mo24168f() {
        return this.f28475h.getChildCount();
    }

    /* renamed from: g */
    public View mo24169g(int i) {
        return this.f28475h.getChildAt(i);
    }

    /* renamed from: h */
    public Drawable mo24170h() {
        return this.f28485r;
    }

    /* renamed from: i */
    public int mo24171i() {
        return this.f28486s;
    }

    /* renamed from: j */
    public int mo24172j() {
        return this.f28487t;
    }

    /* renamed from: k */
    public int mo24173k() {
        return this.f28491x;
    }

    /* renamed from: l */
    public ColorStateList mo24174l() {
        return this.f28483p;
    }

    /* renamed from: m */
    public ColorStateList mo24175m() {
        return this.f28484q;
    }

    /* renamed from: n */
    public C0188n mo24176n(ViewGroup viewGroup) {
        if (this.f28474g == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f28480m.inflate(C7496h.design_navigation_menu, viewGroup, false);
            this.f28474g = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C6076h(this.f28474g));
            if (this.f28479l == null) {
                this.f28479l = new C6071c();
            }
            int i = this.f28472A;
            if (i != -1) {
                this.f28474g.setOverScrollMode(i);
            }
            this.f28475h = (LinearLayout) this.f28480m.inflate(C7496h.design_navigation_item_header, this.f28474g, false);
            this.f28474g.setAdapter(this.f28479l);
        }
        return this.f28474g;
    }

    /* renamed from: o */
    public View mo24177o(int i) {
        View inflate = this.f28480m.inflate(i, this.f28475h, false);
        mo24165b(inflate);
        return inflate;
    }

    /* renamed from: p */
    public void mo24178p(boolean z) {
        if (this.f28490w != z) {
            this.f28490w = z;
            m36469C();
        }
    }

    /* renamed from: q */
    public void mo24179q(C0175i iVar) {
        this.f28479l.mo24197l(iVar);
    }

    /* renamed from: r */
    public void mo24180r(int i) {
        this.f28478k = i;
    }

    /* renamed from: s */
    public void mo24181s(Drawable drawable) {
        this.f28485r = drawable;
        mo815E(false);
    }

    /* renamed from: t */
    public void mo24182t(int i) {
        this.f28486s = i;
        mo815E(false);
    }

    /* renamed from: u */
    public void mo24183u(int i) {
        this.f28487t = i;
        mo815E(false);
    }

    /* renamed from: v */
    public void mo24184v(int i) {
        if (this.f28488u != i) {
            this.f28488u = i;
            this.f28489v = true;
            mo815E(false);
        }
    }

    /* renamed from: w */
    public void mo24185w(ColorStateList colorStateList) {
        this.f28484q = colorStateList;
        mo815E(false);
    }

    /* renamed from: x */
    public void mo24186x(int i) {
        this.f28491x = i;
        mo815E(false);
    }

    /* renamed from: y */
    public void mo24187y(int i) {
        this.f28481n = i;
        this.f28482o = true;
        mo815E(false);
    }

    /* renamed from: z */
    public void mo24188z(ColorStateList colorStateList) {
        this.f28483p = colorStateList;
        mo815E(false);
    }
}
