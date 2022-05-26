package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0184l;
import p082e.p083a.C3400a;
import p082e.p083a.p090o.C3439g;

/* renamed from: androidx.appcompat.widget.v */
/* compiled from: PopupMenu */
public class C0315v {

    /* renamed from: a */
    private final Context f1424a;

    /* renamed from: b */
    private final C0171g f1425b;

    /* renamed from: c */
    private final View f1426c;

    /* renamed from: d */
    final C0184l f1427d;

    /* renamed from: e */
    C0319d f1428e;

    /* renamed from: f */
    C0318c f1429f;

    /* renamed from: androidx.appcompat.widget.v$a */
    /* compiled from: PopupMenu */
    class C0316a implements C0171g.C0172a {
        C0316a() {
        }

        /* renamed from: a */
        public boolean mo532a(C0171g gVar, MenuItem menuItem) {
            C0319d dVar = C0315v.this.f1428e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo534b(C0171g gVar) {
        }
    }

    /* renamed from: androidx.appcompat.widget.v$b */
    /* compiled from: PopupMenu */
    class C0317b implements PopupWindow.OnDismissListener {
        C0317b() {
        }

        public void onDismiss() {
            C0315v vVar = C0315v.this;
            C0318c cVar = vVar.f1429f;
            if (cVar != null) {
                cVar.mo2145a(vVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$c */
    /* compiled from: PopupMenu */
    public interface C0318c {
        /* renamed from: a */
        void mo2145a(C0315v vVar);
    }

    /* renamed from: androidx.appcompat.widget.v$d */
    /* compiled from: PopupMenu */
    public interface C0319d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0315v(Context context, View view, int i) {
        this(context, view, i, C3400a.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public Menu mo2139a() {
        return this.f1425b;
    }

    /* renamed from: b */
    public MenuInflater mo2140b() {
        return new C3439g(this.f1424a);
    }

    /* renamed from: c */
    public void mo2141c(int i) {
        mo2140b().inflate(i, this.f1425b);
    }

    /* renamed from: d */
    public void mo2142d(C0319d dVar) {
        this.f1428e = dVar;
    }

    /* renamed from: e */
    public void mo2143e() {
        this.f1427d.mo1104k();
    }

    public C0315v(Context context, View view, int i, int i2, int i3) {
        this.f1424a = context;
        this.f1426c = view;
        C0171g gVar = new C0171g(context);
        this.f1425b = gVar;
        gVar.mo901V(new C0316a());
        C0184l lVar = new C0184l(context, gVar, view, false, i2, i3);
        this.f1427d = lVar;
        lVar.mo1101h(i);
        lVar.mo1102i(new C0317b());
    }
}
