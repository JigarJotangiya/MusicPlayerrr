package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0188n;
import androidx.core.graphics.drawable.C0534a;
import p082e.p083a.C3407h;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p111i.p112a.C3639b;
import p082e.p109h.p119p.C3707b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.appcompat.view.menu.i */
/* compiled from: MenuItemImpl */
public final class C0175i implements C3639b {

    /* renamed from: A */
    private View f707A;

    /* renamed from: B */
    private C3707b f708B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f709C;

    /* renamed from: D */
    private boolean f710D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f711E;

    /* renamed from: a */
    private final int f712a;

    /* renamed from: b */
    private final int f713b;

    /* renamed from: c */
    private final int f714c;

    /* renamed from: d */
    private final int f715d;

    /* renamed from: e */
    private CharSequence f716e;

    /* renamed from: f */
    private CharSequence f717f;

    /* renamed from: g */
    private Intent f718g;

    /* renamed from: h */
    private char f719h;

    /* renamed from: i */
    private int f720i = 4096;

    /* renamed from: j */
    private char f721j;

    /* renamed from: k */
    private int f722k = 4096;

    /* renamed from: l */
    private Drawable f723l;

    /* renamed from: m */
    private int f724m = 0;

    /* renamed from: n */
    C0171g f725n;

    /* renamed from: o */
    private C0195r f726o;

    /* renamed from: p */
    private Runnable f727p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f728q;

    /* renamed from: r */
    private CharSequence f729r;

    /* renamed from: s */
    private CharSequence f730s;

    /* renamed from: t */
    private ColorStateList f731t = null;

    /* renamed from: u */
    private PorterDuff.Mode f732u = null;

    /* renamed from: v */
    private boolean f733v = false;

    /* renamed from: w */
    private boolean f734w = false;

    /* renamed from: x */
    private boolean f735x = false;

    /* renamed from: y */
    private int f736y = 16;

    /* renamed from: z */
    private int f737z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* compiled from: MenuItemImpl */
    class C0176a implements C3707b.C3709b {
        C0176a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0175i iVar = C0175i.this;
            iVar.f725n.mo892L(iVar);
        }
    }

    C0175i(C0171g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f725n = gVar;
        this.f712a = i2;
        this.f713b = i;
        this.f714c = i3;
        this.f715d = i4;
        this.f716e = charSequence;
        this.f737z = i5;
    }

    /* renamed from: d */
    private static void m1057d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1058e(Drawable drawable) {
        if (drawable != null && this.f735x && (this.f733v || this.f734w)) {
            drawable = C0534a.m3292r(drawable).mutate();
            if (this.f733v) {
                C0534a.m3289o(drawable, this.f731t);
            }
            if (this.f734w) {
                C0534a.m3290p(drawable, this.f732u);
            }
            this.f735x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo963A() {
        return this.f725n.mo890J() && mo967g() != 0;
    }

    /* renamed from: B */
    public boolean mo964B() {
        return (this.f737z & 4) == 4;
    }

    /* renamed from: a */
    public C3639b mo755a(C3707b bVar) {
        C3707b bVar2 = this.f708B;
        if (bVar2 != null) {
            bVar2.mo13010h();
        }
        this.f707A = null;
        this.f708B = bVar;
        this.f725n.mo893M(true);
        C3707b bVar3 = this.f708B;
        if (bVar3 != null) {
            bVar3.mo1084j(new C0176a());
        }
        return this;
    }

    /* renamed from: b */
    public C3707b mo756b() {
        return this.f708B;
    }

    /* renamed from: c */
    public void mo965c() {
        this.f725n.mo891K(this);
    }

    public boolean collapseActionView() {
        if ((this.f737z & 8) == 0) {
            return false;
        }
        if (this.f707A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f709C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f725n.mo927f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo987j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f709C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f725n.mo935m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo966f() {
        return this.f715d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo967g() {
        return this.f725n.mo889I() ? this.f721j : this.f719h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f707A;
        if (view != null) {
            return view;
        }
        C3707b bVar = this.f708B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo1082d(this);
        this.f707A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f722k;
    }

    public char getAlphabeticShortcut() {
        return this.f721j;
    }

    public CharSequence getContentDescription() {
        return this.f729r;
    }

    public int getGroupId() {
        return this.f713b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f723l;
        if (drawable != null) {
            return m1058e(drawable);
        }
        if (this.f724m == 0) {
            return null;
        }
        Drawable d = C3410a.m14543d(this.f725n.mo954w(), this.f724m);
        this.f724m = 0;
        this.f723l = d;
        return m1058e(d);
    }

    public ColorStateList getIconTintList() {
        return this.f731t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f732u;
    }

    public Intent getIntent() {
        return this.f718g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f712a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f711E;
    }

    public int getNumericModifiers() {
        return this.f720i;
    }

    public char getNumericShortcut() {
        return this.f719h;
    }

    public int getOrder() {
        return this.f714c;
    }

    public SubMenu getSubMenu() {
        return this.f726o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f716e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f717f;
        if (charSequence == null) {
            charSequence = this.f716e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f730s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo980h() {
        char g = mo967g();
        if (g == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f725n.mo954w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f725n.mo954w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C3407h.abc_prepend_shortcut_label));
        }
        int i = this.f725n.mo889I() ? this.f722k : this.f720i;
        m1057d(sb, i, 65536, resources.getString(C3407h.abc_menu_meta_shortcut_label));
        m1057d(sb, i, 4096, resources.getString(C3407h.abc_menu_ctrl_shortcut_label));
        m1057d(sb, i, 2, resources.getString(C3407h.abc_menu_alt_shortcut_label));
        m1057d(sb, i, 1, resources.getString(C3407h.abc_menu_shift_shortcut_label));
        m1057d(sb, i, 4, resources.getString(C3407h.abc_menu_sym_shortcut_label));
        m1057d(sb, i, 8, resources.getString(C3407h.abc_menu_function_shortcut_label));
        if (g == 8) {
            sb.append(resources.getString(C3407h.abc_menu_delete_shortcut_label));
        } else if (g == 10) {
            sb.append(resources.getString(C3407h.abc_menu_enter_shortcut_label));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(C3407h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f726o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo982i(C0188n.C0189a aVar) {
        if (aVar == null || !aVar.mo720d()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f710D;
    }

    public boolean isCheckable() {
        return (this.f736y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f736y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f736y & 16) != 0;
    }

    public boolean isVisible() {
        C3707b bVar = this.f708B;
        if (bVar == null || !bVar.mo1083g()) {
            if ((this.f736y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f736y & 8) != 0 || !this.f708B.mo1081b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean mo987j() {
        C3707b bVar;
        if ((this.f737z & 8) == 0) {
            return false;
        }
        if (this.f707A == null && (bVar = this.f708B) != null) {
            this.f707A = bVar.mo1082d(this);
        }
        if (this.f707A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo988k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f728q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0171g gVar = this.f725n;
        if (gVar.mo931h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f727p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f718g != null) {
            try {
                this.f725n.mo954w().startActivity(this.f718g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C3707b bVar = this.f708B;
        if (bVar == null || !bVar.mo1079e()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo989l() {
        return (this.f736y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo990m() {
        return (this.f736y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo991n() {
        return (this.f737z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo992o() {
        return (this.f737z & 2) == 2;
    }

    /* renamed from: p */
    public C3639b mo993p(int i) {
        Context w = this.f725n.mo954w();
        mo994q(LayoutInflater.from(w).inflate(i, new LinearLayout(w), false));
        return this;
    }

    /* renamed from: q */
    public C3639b mo994q(View view) {
        int i;
        this.f707A = view;
        this.f708B = null;
        if (view != null && view.getId() == -1 && (i = this.f712a) > 0) {
            view.setId(i);
        }
        this.f725n.mo891K(this);
        return this;
    }

    /* renamed from: r */
    public void mo995r(boolean z) {
        this.f710D = z;
        this.f725n.mo893M(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo996s(boolean z) {
        int i = this.f736y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f736y = i2;
        if (i != i2) {
            this.f725n.mo893M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        mo993p(i);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f721j == c) {
            return this;
        }
        this.f721j = Character.toLowerCase(c);
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f736y;
        boolean z2 = z | (i & true);
        this.f736y = z2 ? 1 : 0;
        if (i != z2) {
            this.f725n.mo893M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f736y & 4) != 0) {
            this.f725n.mo903X(this);
        } else {
            mo996s(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f736y |= 16;
        } else {
            this.f736y &= -17;
        }
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f724m = 0;
        this.f723l = drawable;
        this.f735x = true;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f731t = colorStateList;
        this.f733v = true;
        this.f735x = true;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f732u = mode;
        this.f734w = true;
        this.f735x = true;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f718g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f719h == c) {
            return this;
        }
        this.f719h = c;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f709C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f728q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f719h = c;
        this.f721j = Character.toLowerCase(c2);
        this.f725n.mo893M(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f737z = i;
            this.f725n.mo891K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        mo1017w(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f716e = charSequence;
        this.f725n.mo893M(false);
        C0195r rVar = this.f726o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f717f = charSequence;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1019y(z)) {
            this.f725n.mo892L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1013t(boolean z) {
        this.f736y = (z ? 4 : 0) | (this.f736y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f716e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1015u(boolean z) {
        if (z) {
            this.f736y |= 32;
        } else {
            this.f736y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1016v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f711E = contextMenuInfo;
    }

    /* renamed from: w */
    public C3639b mo1017w(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1018x(C0195r rVar) {
        this.f726o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo1019y(boolean z) {
        int i = this.f736y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f736y = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo1020z() {
        return this.f725n.mo884C();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo994q(view);
        return this;
    }

    public C3639b setContentDescription(CharSequence charSequence) {
        this.f729r = charSequence;
        this.f725n.mo893M(false);
        return this;
    }

    public C3639b setTooltipText(CharSequence charSequence) {
        this.f730s = charSequence;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f721j == c && this.f722k == i) {
            return this;
        }
        this.f721j = Character.toLowerCase(c);
        this.f722k = KeyEvent.normalizeMetaState(i);
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f719h == c && this.f720i == i) {
            return this;
        }
        this.f719h = c;
        this.f720i = KeyEvent.normalizeMetaState(i);
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f719h = c;
        this.f720i = KeyEvent.normalizeMetaState(i);
        this.f721j = Character.toLowerCase(c2);
        this.f722k = KeyEvent.normalizeMetaState(i2);
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f723l = null;
        this.f724m = i;
        this.f735x = true;
        this.f725n.mo893M(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f725n.mo954w().getString(i));
        return this;
    }
}
