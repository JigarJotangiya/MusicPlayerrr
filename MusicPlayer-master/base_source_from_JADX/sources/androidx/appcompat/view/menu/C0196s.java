package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p082e.p109h.p111i.p112a.C3640c;

/* renamed from: androidx.appcompat.view.menu.s */
/* compiled from: SubMenuWrapperICS */
class C0196s extends C0190o implements SubMenu {

    /* renamed from: e */
    private final C3640c f789e;

    C0196s(Context context, C3640c cVar) {
        super(context, cVar);
        this.f789e = cVar;
    }

    public void clearHeader() {
        this.f789e.clearHeader();
    }

    public MenuItem getItem() {
        return mo831c(this.f789e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f789e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f789e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f789e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f789e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f789e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f789e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f789e.setIcon(drawable);
        return this;
    }
}
