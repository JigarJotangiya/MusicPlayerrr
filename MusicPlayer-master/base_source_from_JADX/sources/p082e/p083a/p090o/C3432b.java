package p082e.p083a.p090o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: e.a.o.b */
/* compiled from: ActionMode */
public abstract class C3432b {

    /* renamed from: g */
    private Object f10899g;

    /* renamed from: h */
    private boolean f10900h;

    /* renamed from: e.a.o.b$a */
    /* compiled from: ActionMode */
    public interface C3433a {
        /* renamed from: a */
        void mo592a(C3432b bVar);

        /* renamed from: b */
        boolean mo593b(C3432b bVar, Menu menu);

        /* renamed from: c */
        boolean mo594c(C3432b bVar, Menu menu);

        /* renamed from: d */
        boolean mo595d(C3432b bVar, MenuItem menuItem);
    }

    /* renamed from: c */
    public abstract void mo703c();

    /* renamed from: d */
    public abstract View mo704d();

    /* renamed from: e */
    public abstract Menu mo705e();

    /* renamed from: f */
    public abstract MenuInflater mo706f();

    /* renamed from: g */
    public abstract CharSequence mo707g();

    /* renamed from: h */
    public Object mo12165h() {
        return this.f10899g;
    }

    /* renamed from: i */
    public abstract CharSequence mo708i();

    /* renamed from: j */
    public boolean mo12166j() {
        return this.f10900h;
    }

    /* renamed from: k */
    public abstract void mo709k();

    /* renamed from: l */
    public abstract boolean mo710l();

    /* renamed from: m */
    public abstract void mo711m(View view);

    /* renamed from: n */
    public abstract void mo712n(int i);

    /* renamed from: o */
    public abstract void mo713o(CharSequence charSequence);

    /* renamed from: p */
    public void mo12167p(Object obj) {
        this.f10899g = obj;
    }

    /* renamed from: q */
    public abstract void mo714q(int i);

    /* renamed from: r */
    public abstract void mo715r(CharSequence charSequence);

    /* renamed from: s */
    public void mo716s(boolean z) {
        this.f10900h = z;
    }
}
