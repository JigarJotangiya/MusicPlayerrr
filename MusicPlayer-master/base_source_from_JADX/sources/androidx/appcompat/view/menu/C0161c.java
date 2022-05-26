package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p082e.p098e.C3478g;
import p082e.p109h.p111i.p112a.C3639b;
import p082e.p109h.p111i.p112a.C3640c;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: BaseMenuWrapper */
abstract class C0161c {

    /* renamed from: a */
    final Context f618a;

    /* renamed from: b */
    private C3478g<C3639b, MenuItem> f619b;

    /* renamed from: c */
    private C3478g<C3640c, SubMenu> f620c;

    C0161c(Context context) {
        this.f618a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo831c(MenuItem menuItem) {
        if (!(menuItem instanceof C3639b)) {
            return menuItem;
        }
        C3639b bVar = (C3639b) menuItem;
        if (this.f619b == null) {
            this.f619b = new C3478g<>();
        }
        MenuItem menuItem2 = this.f619b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0177j jVar = new C0177j(this.f618a, bVar);
        this.f619b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo832d(SubMenu subMenu) {
        if (!(subMenu instanceof C3640c)) {
            return subMenu;
        }
        C3640c cVar = (C3640c) subMenu;
        if (this.f620c == null) {
            this.f620c = new C3478g<>();
        }
        SubMenu subMenu2 = this.f620c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0196s sVar = new C0196s(this.f618a, cVar);
        this.f620c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo833e() {
        C3478g<C3639b, MenuItem> gVar = this.f619b;
        if (gVar != null) {
            gVar.clear();
        }
        C3478g<C3640c, SubMenu> gVar2 = this.f620c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo834f(int i) {
        if (this.f619b != null) {
            int i2 = 0;
            while (i2 < this.f619b.size()) {
                if (this.f619b.mo12395i(i2).getGroupId() == i) {
                    this.f619b.mo8472k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo835g(int i) {
        if (this.f619b != null) {
            for (int i2 = 0; i2 < this.f619b.size(); i2++) {
                if (this.f619b.mo12395i(i2).getItemId() == i) {
                    this.f619b.mo8472k(i2);
                    return;
                }
            }
        }
    }
}
