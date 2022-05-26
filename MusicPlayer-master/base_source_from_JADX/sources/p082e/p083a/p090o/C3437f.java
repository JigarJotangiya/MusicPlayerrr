package p082e.p083a.p090o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0177j;
import androidx.appcompat.view.menu.C0190o;
import java.util.ArrayList;
import p082e.p083a.p090o.C3432b;
import p082e.p098e.C3478g;
import p082e.p109h.p111i.p112a.C3638a;
import p082e.p109h.p111i.p112a.C3639b;

/* renamed from: e.a.o.f */
/* compiled from: SupportActionModeWrapper */
public class C3437f extends ActionMode {

    /* renamed from: a */
    final Context f10912a;

    /* renamed from: b */
    final C3432b f10913b;

    /* renamed from: e.a.o.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C3438a implements C3432b.C3433a {

        /* renamed from: a */
        final ActionMode.Callback f10914a;

        /* renamed from: b */
        final Context f10915b;

        /* renamed from: c */
        final ArrayList<C3437f> f10916c = new ArrayList<>();

        /* renamed from: d */
        final C3478g<Menu, Menu> f10917d = new C3478g<>();

        public C3438a(Context context, ActionMode.Callback callback) {
            this.f10915b = context;
            this.f10914a = callback;
        }

        /* renamed from: f */
        private Menu m14687f(Menu menu) {
            Menu menu2 = this.f10917d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0190o oVar = new C0190o(this.f10915b, (C3638a) menu);
            this.f10917d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public void mo592a(C3432b bVar) {
            this.f10914a.onDestroyActionMode(mo12194e(bVar));
        }

        /* renamed from: b */
        public boolean mo593b(C3432b bVar, Menu menu) {
            return this.f10914a.onCreateActionMode(mo12194e(bVar), m14687f(menu));
        }

        /* renamed from: c */
        public boolean mo594c(C3432b bVar, Menu menu) {
            return this.f10914a.onPrepareActionMode(mo12194e(bVar), m14687f(menu));
        }

        /* renamed from: d */
        public boolean mo595d(C3432b bVar, MenuItem menuItem) {
            return this.f10914a.onActionItemClicked(mo12194e(bVar), new C0177j(this.f10915b, (C3639b) menuItem));
        }

        /* renamed from: e */
        public ActionMode mo12194e(C3432b bVar) {
            int size = this.f10916c.size();
            for (int i = 0; i < size; i++) {
                C3437f fVar = this.f10916c.get(i);
                if (fVar != null && fVar.f10913b == bVar) {
                    return fVar;
                }
            }
            C3437f fVar2 = new C3437f(this.f10915b, bVar);
            this.f10916c.add(fVar2);
            return fVar2;
        }
    }

    public C3437f(Context context, C3432b bVar) {
        this.f10912a = context;
        this.f10913b = bVar;
    }

    public void finish() {
        this.f10913b.mo703c();
    }

    public View getCustomView() {
        return this.f10913b.mo704d();
    }

    public Menu getMenu() {
        return new C0190o(this.f10912a, (C3638a) this.f10913b.mo705e());
    }

    public MenuInflater getMenuInflater() {
        return this.f10913b.mo706f();
    }

    public CharSequence getSubtitle() {
        return this.f10913b.mo707g();
    }

    public Object getTag() {
        return this.f10913b.mo12165h();
    }

    public CharSequence getTitle() {
        return this.f10913b.mo708i();
    }

    public boolean getTitleOptionalHint() {
        return this.f10913b.mo12166j();
    }

    public void invalidate() {
        this.f10913b.mo709k();
    }

    public boolean isTitleOptional() {
        return this.f10913b.mo710l();
    }

    public void setCustomView(View view) {
        this.f10913b.mo711m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f10913b.mo713o(charSequence);
    }

    public void setTag(Object obj) {
        this.f10913b.mo12167p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10913b.mo715r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f10913b.mo716s(z);
    }

    public void setSubtitle(int i) {
        this.f10913b.mo712n(i);
    }

    public void setTitle(int i) {
        this.f10913b.mo714q(i);
    }
}
