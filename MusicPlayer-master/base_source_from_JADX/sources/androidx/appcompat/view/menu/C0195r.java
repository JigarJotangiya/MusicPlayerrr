package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0171g;

/* renamed from: androidx.appcompat.view.menu.r */
/* compiled from: SubMenuBuilder */
public class C0195r extends C0171g implements SubMenu {

    /* renamed from: B */
    private C0171g f787B;

    /* renamed from: C */
    private C0175i f788C;

    public C0195r(Context context, C0171g gVar, C0175i iVar) {
        super(context);
        this.f787B = gVar;
        this.f788C = iVar;
    }

    /* renamed from: F */
    public C0171g mo886F() {
        return this.f787B.mo886F();
    }

    /* renamed from: H */
    public boolean mo888H() {
        return this.f787B.mo888H();
    }

    /* renamed from: I */
    public boolean mo889I() {
        return this.f787B.mo889I();
    }

    /* renamed from: J */
    public boolean mo890J() {
        return this.f787B.mo890J();
    }

    /* renamed from: V */
    public void mo901V(C0171g.C0172a aVar) {
        this.f787B.mo901V(aVar);
    }

    /* renamed from: f */
    public boolean mo927f(C0175i iVar) {
        return this.f787B.mo927f(iVar);
    }

    public MenuItem getItem() {
        return this.f788C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo931h(C0171g gVar, MenuItem menuItem) {
        return super.mo931h(gVar, menuItem) || this.f787B.mo931h(gVar, menuItem);
    }

    /* renamed from: i0 */
    public Menu mo1138i0() {
        return this.f787B;
    }

    /* renamed from: m */
    public boolean mo935m(C0175i iVar) {
        return this.f787B.mo935m(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f787B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo905Z(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo919c0(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo924d0(view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f788C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f787B.setQwertyMode(z);
    }

    /* renamed from: v */
    public String mo953v() {
        C0175i iVar = this.f788C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo953v() + ":" + itemId;
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo904Y(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo917b0(i);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f788C.setIcon(i);
        return this;
    }
}
