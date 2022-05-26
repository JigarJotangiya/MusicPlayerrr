package p082e.p109h.p119p;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: e.h.p.b */
/* compiled from: ActionProvider */
public abstract class C3707b {

    /* renamed from: a */
    private C3708a f11722a;

    /* renamed from: b */
    private C3709b f11723b;

    /* renamed from: e.h.p.b$a */
    /* compiled from: ActionProvider */
    public interface C3708a {
        /* renamed from: a */
        void mo1261a(boolean z);
    }

    /* renamed from: e.h.p.b$b */
    /* compiled from: ActionProvider */
    public interface C3709b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C3707b(Context context) {
    }

    /* renamed from: a */
    public boolean mo1077a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1081b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo1078c();

    /* renamed from: d */
    public View mo1082d(MenuItem menuItem) {
        return mo1078c();
    }

    /* renamed from: e */
    public boolean mo1079e() {
        return false;
    }

    /* renamed from: f */
    public void mo1080f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo1083g() {
        return false;
    }

    /* renamed from: h */
    public void mo13010h() {
        this.f11723b = null;
        this.f11722a = null;
    }

    /* renamed from: i */
    public void mo13011i(C3708a aVar) {
        this.f11722a = aVar;
    }

    /* renamed from: j */
    public void mo1084j(C3709b bVar) {
        if (!(this.f11723b == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f11723b = bVar;
    }

    /* renamed from: k */
    public void mo13012k(boolean z) {
        C3708a aVar = this.f11722a;
        if (aVar != null) {
            aVar.mo1261a(z);
        }
    }
}
