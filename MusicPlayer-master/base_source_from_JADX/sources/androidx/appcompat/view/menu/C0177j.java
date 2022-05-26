package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p082e.p083a.p090o.C3434c;
import p082e.p109h.p111i.p112a.C3639b;
import p082e.p109h.p119p.C3707b;

/* renamed from: androidx.appcompat.view.menu.j */
/* compiled from: MenuItemWrapperICS */
public class C0177j extends C0161c implements MenuItem {

    /* renamed from: d */
    private final C3639b f739d;

    /* renamed from: e */
    private Method f740e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* compiled from: MenuItemWrapperICS */
    private class C0178a extends C3707b {

        /* renamed from: c */
        final ActionProvider f741c;

        C0178a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f741c = actionProvider;
        }

        /* renamed from: a */
        public boolean mo1077a() {
            return this.f741c.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1078c() {
            return this.f741c.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo1079e() {
            return this.f741c.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo1080f(SubMenu subMenu) {
            this.f741c.onPrepareSubMenu(C0177j.this.mo832d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* compiled from: MenuItemWrapperICS */
    private class C0179b extends C0178a implements ActionProvider.VisibilityListener {

        /* renamed from: e */
        private C3707b.C3709b f743e;

        C0179b(C0177j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo1081b() {
            return this.f741c.isVisible();
        }

        /* renamed from: d */
        public View mo1082d(MenuItem menuItem) {
            return this.f741c.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo1083g() {
            return this.f741c.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo1084j(C3707b.C3709b bVar) {
            this.f743e = bVar;
            this.f741c.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C3707b.C3709b bVar = this.f743e;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* compiled from: MenuItemWrapperICS */
    static class C0180c extends FrameLayout implements C3434c {

        /* renamed from: g */
        final CollapsibleActionView f744g;

        C0180c(View view) {
            super(view.getContext());
            this.f744g = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1086a() {
            return (View) this.f744g;
        }

        /* renamed from: c */
        public void mo1087c() {
            this.f744g.onActionViewExpanded();
        }

        /* renamed from: e */
        public void mo1088e() {
            this.f744g.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0181d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f745a;

        C0181d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f745a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f745a.onMenuItemActionCollapse(C0177j.this.mo831c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f745a.onMenuItemActionExpand(C0177j.this.mo831c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* compiled from: MenuItemWrapperICS */
    private class C0182e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f747a;

        C0182e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f747a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f747a.onMenuItemClick(C0177j.this.mo831c(menuItem));
        }
    }

    public C0177j(Context context, C3639b bVar) {
        super(context);
        if (bVar != null) {
            this.f739d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f739d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f739d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C3707b b = this.f739d.mo756b();
        if (b instanceof C0178a) {
            return ((C0178a) b).f741c;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f739d.getActionView();
        return actionView instanceof C0180c ? ((C0180c) actionView).mo1086a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f739d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f739d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f739d.getContentDescription();
    }

    public int getGroupId() {
        return this.f739d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f739d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f739d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f739d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f739d.getIntent();
    }

    public int getItemId() {
        return this.f739d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f739d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f739d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f739d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f739d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo832d(this.f739d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f739d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f739d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f739d.getTooltipText();
    }

    /* renamed from: h */
    public void mo1043h(boolean z) {
        try {
            if (this.f740e == null) {
                this.f740e = this.f739d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f740e.invoke(this.f739d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f739d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f739d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f739d.isCheckable();
    }

    public boolean isChecked() {
        return this.f739d.isChecked();
    }

    public boolean isEnabled() {
        return this.f739d.isEnabled();
    }

    public boolean isVisible() {
        return this.f739d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C3707b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new C0179b(this, this.f618a, actionProvider);
        } else {
            bVar = new C0178a(this.f618a, actionProvider);
        }
        C3639b bVar2 = this.f739d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo755a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0180c(view);
        }
        this.f739d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f739d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f739d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f739d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f739d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f739d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f739d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f739d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f739d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f739d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f739d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f739d.setOnActionExpandListener(onActionExpandListener != null ? new C0181d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f739d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0182e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f739d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f739d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f739d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f739d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f739d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f739d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f739d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f739d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f739d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f739d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f739d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f739d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f739d.setActionView(i);
        View actionView = this.f739d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f739d.setActionView((View) new C0180c(actionView));
        }
        return this;
    }
}
