package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import p082e.p109h.p111i.p112a.C3639b;
import p082e.p109h.p119p.C3707b;

/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: ActionMenuItem */
public class C0159a implements C3639b {

    /* renamed from: a */
    private final int f590a;

    /* renamed from: b */
    private final int f591b;

    /* renamed from: c */
    private final int f592c;

    /* renamed from: d */
    private CharSequence f593d;

    /* renamed from: e */
    private CharSequence f594e;

    /* renamed from: f */
    private Intent f595f;

    /* renamed from: g */
    private char f596g;

    /* renamed from: h */
    private int f597h = 4096;

    /* renamed from: i */
    private char f598i;

    /* renamed from: j */
    private int f599j = 4096;

    /* renamed from: k */
    private Drawable f600k;

    /* renamed from: l */
    private Context f601l;

    /* renamed from: m */
    private CharSequence f602m;

    /* renamed from: n */
    private CharSequence f603n;

    /* renamed from: o */
    private ColorStateList f604o = null;

    /* renamed from: p */
    private PorterDuff.Mode f605p = null;

    /* renamed from: q */
    private boolean f606q = false;

    /* renamed from: r */
    private boolean f607r = false;

    /* renamed from: s */
    private int f608s = 16;

    public C0159a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f601l = context;
        this.f590a = i2;
        this.f591b = i;
        this.f592c = i4;
        this.f593d = charSequence;
    }

    /* renamed from: c */
    private void m912c() {
        Drawable drawable = this.f600k;
        if (drawable == null) {
            return;
        }
        if (this.f606q || this.f607r) {
            Drawable r = C0534a.m3292r(drawable);
            this.f600k = r;
            Drawable mutate = r.mutate();
            this.f600k = mutate;
            if (this.f606q) {
                C0534a.m3289o(mutate, this.f604o);
            }
            if (this.f607r) {
                C0534a.m3290p(this.f600k, this.f605p);
            }
        }
    }

    /* renamed from: a */
    public C3639b mo755a(C3707b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C3707b mo756b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C3639b mo758d(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C3639b mo759e(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C3639b mo761f(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f599j;
    }

    public char getAlphabeticShortcut() {
        return this.f598i;
    }

    public CharSequence getContentDescription() {
        return this.f602m;
    }

    public int getGroupId() {
        return this.f591b;
    }

    public Drawable getIcon() {
        return this.f600k;
    }

    public ColorStateList getIconTintList() {
        return this.f604o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f605p;
    }

    public Intent getIntent() {
        return this.f595f;
    }

    public int getItemId() {
        return this.f590a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f597h;
    }

    public char getNumericShortcut() {
        return this.f596g;
    }

    public int getOrder() {
        return this.f592c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f593d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f594e;
        return charSequence != null ? charSequence : this.f593d;
    }

    public CharSequence getTooltipText() {
        return this.f603n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f608s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f608s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f608s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f608s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        mo758d(i);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f598i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f608s = z | (this.f608s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f608s = (z ? 2 : 0) | (this.f608s & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f608s = (z ? 16 : 0) | (this.f608s & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f600k = drawable;
        m912c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f604o = colorStateList;
        this.f606q = true;
        m912c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f605p = mode;
        this.f607r = true;
        m912c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f595f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f596g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f596g = c;
        this.f598i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        mo761f(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f593d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f594e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f608s & 8;
        if (z) {
            i = 0;
        }
        this.f608s = i2 | i;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo759e(view);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f598i = Character.toLowerCase(c);
        this.f599j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C3639b setContentDescription(CharSequence charSequence) {
        this.f602m = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f596g = c;
        this.f597h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f593d = this.f601l.getResources().getString(i);
        return this;
    }

    public C3639b setTooltipText(CharSequence charSequence) {
        this.f603n = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f600k = C0506a.m3152d(this.f601l, i);
        m912c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f596g = c;
        this.f597h = KeyEvent.normalizeMetaState(i);
        this.f598i = Character.toLowerCase(c2);
        this.f599j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
