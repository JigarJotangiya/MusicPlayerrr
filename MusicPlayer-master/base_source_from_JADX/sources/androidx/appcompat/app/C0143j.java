package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.widget.C0281h0;
import androidx.appcompat.widget.C0302o;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p082e.p083a.p090o.C3444i;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.app.j */
/* compiled from: ToolbarActionBar */
class C0143j extends ActionBar {

    /* renamed from: a */
    C0302o f493a;

    /* renamed from: b */
    boolean f494b;

    /* renamed from: c */
    Window.Callback f495c;

    /* renamed from: d */
    private boolean f496d;

    /* renamed from: e */
    private boolean f497e;

    /* renamed from: f */
    private ArrayList<ActionBar.C0086a> f498f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f499g = new C0144a();

    /* renamed from: h */
    private final Toolbar.C0261e f500h;

    /* renamed from: androidx.appcompat.app.j$a */
    /* compiled from: ToolbarActionBar */
    class C0144a implements Runnable {
        C0144a() {
        }

        public void run() {
            C0143j.this.mo681E();
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    /* compiled from: ToolbarActionBar */
    class C0145b implements Toolbar.C0261e {
        C0145b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0143j.this.f495c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.j$c */
    /* compiled from: ToolbarActionBar */
    private final class C0146c implements C0186m.C0187a {

        /* renamed from: g */
        private boolean f503g;

        C0146c() {
        }

        /* renamed from: c */
        public void mo590c(C0171g gVar, boolean z) {
            if (!this.f503g) {
                this.f503g = true;
                C0143j.this.f493a.mo2018h();
                Window.Callback callback = C0143j.this.f495c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f503g = false;
            }
        }

        /* renamed from: d */
        public boolean mo591d(C0171g gVar) {
            Window.Callback callback = C0143j.this.f495c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.j$d */
    /* compiled from: ToolbarActionBar */
    private final class C0147d implements C0171g.C0172a {
        C0147d() {
        }

        /* renamed from: a */
        public boolean mo532a(C0171g gVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo534b(C0171g gVar) {
            C0143j jVar = C0143j.this;
            if (jVar.f495c == null) {
                return;
            }
            if (jVar.f493a.mo2009b()) {
                C0143j.this.f495c.onPanelClosed(108, gVar);
            } else if (C0143j.this.f495c.onPreparePanel(0, (View) null, gVar)) {
                C0143j.this.f495c.onMenuOpened(108, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.j$e */
    /* compiled from: ToolbarActionBar */
    private class C0148e extends C3444i {
        public C0148e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0143j.this.f493a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0143j jVar = C0143j.this;
                if (!jVar.f494b) {
                    jVar.f493a.mo2010c();
                    C0143j.this.f494b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0143j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0145b bVar = new C0145b();
        this.f500h = bVar;
        this.f493a = new C0281h0(toolbar, false);
        C0148e eVar = new C0148e(callback);
        this.f495c = eVar;
        this.f493a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f493a.setWindowTitle(charSequence);
    }

    /* renamed from: C */
    private Menu m795C() {
        if (!this.f496d) {
            this.f493a.mo2026p(new C0146c(), new C0147d());
            this.f496d = true;
        }
        return this.f493a.mo2022l();
    }

    /* renamed from: A */
    public void mo405A() {
        this.f493a.setVisibility(0);
    }

    /* renamed from: D */
    public Window.Callback mo680D() {
        return this.f495c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo681E() {
        Menu C = m795C();
        C0171g gVar = C instanceof C0171g ? (C0171g) C : null;
        if (gVar != null) {
            gVar.mo932h0();
        }
        try {
            C.clear();
            if (!this.f495c.onCreatePanelMenu(0, C) || !this.f495c.onPreparePanel(0, (View) null, C)) {
                C.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo929g0();
            }
        }
    }

    /* renamed from: F */
    public void mo682F(int i, int i2) {
        this.f493a.mo2021k((i & i2) | ((~i2) & this.f493a.mo2029s()));
    }

    /* renamed from: f */
    public boolean mo407f() {
        return this.f493a.mo2014f();
    }

    /* renamed from: g */
    public boolean mo408g() {
        if (!this.f493a.mo2020j()) {
            return false;
        }
        this.f493a.collapseActionView();
        return true;
    }

    /* renamed from: h */
    public void mo409h(boolean z) {
        if (z != this.f497e) {
            this.f497e = z;
            int size = this.f498f.size();
            for (int i = 0; i < size; i++) {
                this.f498f.get(i).mo428a(z);
            }
        }
    }

    /* renamed from: i */
    public int mo410i() {
        return this.f493a.mo2029s();
    }

    /* renamed from: j */
    public Context mo411j() {
        return this.f493a.getContext();
    }

    /* renamed from: k */
    public void mo412k() {
        this.f493a.setVisibility(8);
    }

    /* renamed from: l */
    public boolean mo413l() {
        this.f493a.mo2027q().removeCallbacks(this.f499g);
        C3774v.m16201g0(this.f493a.mo2027q(), this.f499g);
        return true;
    }

    /* renamed from: m */
    public void mo414m(Configuration configuration) {
        super.mo414m(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo415n() {
        this.f493a.mo2027q().removeCallbacks(this.f499g);
    }

    /* renamed from: o */
    public boolean mo416o(int i, KeyEvent keyEvent) {
        Menu C = m795C();
        if (C == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        C.setQwertyMode(z);
        return C.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: p */
    public boolean mo417p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo418q();
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo418q() {
        return this.f493a.mo2015g();
    }

    /* renamed from: r */
    public void mo419r(boolean z) {
    }

    /* renamed from: s */
    public void mo420s(boolean z) {
        mo682F(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo421t(boolean z) {
        mo682F(z ? 2 : 0, 2);
    }

    /* renamed from: u */
    public void mo422u(int i) {
        this.f493a.mo2036t(i);
    }

    /* renamed from: v */
    public void mo423v(boolean z) {
    }

    /* renamed from: w */
    public void mo424w(boolean z) {
    }

    /* renamed from: x */
    public void mo425x(int i) {
        C0302o oVar = this.f493a;
        oVar.setTitle(i != 0 ? oVar.getContext().getText(i) : null);
    }

    /* renamed from: y */
    public void mo426y(CharSequence charSequence) {
        this.f493a.setTitle(charSequence);
    }

    /* renamed from: z */
    public void mo427z(CharSequence charSequence) {
        this.f493a.setWindowTitle(charSequence);
    }
}
