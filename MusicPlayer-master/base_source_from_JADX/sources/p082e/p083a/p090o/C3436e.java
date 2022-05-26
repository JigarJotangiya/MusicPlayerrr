package p082e.p083a.p090o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p082e.p083a.p090o.C3432b;

/* renamed from: e.a.o.e */
/* compiled from: StandaloneActionMode */
public class C3436e extends C3432b implements C0171g.C0172a {

    /* renamed from: i */
    private Context f10906i;

    /* renamed from: j */
    private ActionBarContextView f10907j;

    /* renamed from: k */
    private C3432b.C3433a f10908k;

    /* renamed from: l */
    private WeakReference<View> f10909l;

    /* renamed from: m */
    private boolean f10910m;

    /* renamed from: n */
    private C0171g f10911n;

    public C3436e(Context context, ActionBarContextView actionBarContextView, C3432b.C3433a aVar, boolean z) {
        this.f10906i = context;
        this.f10907j = actionBarContextView;
        this.f10908k = aVar;
        C0171g gVar = new C0171g(actionBarContextView.getContext());
        gVar.mo902W(1);
        this.f10911n = gVar;
        gVar.mo901V(this);
    }

    /* renamed from: a */
    public boolean mo532a(C0171g gVar, MenuItem menuItem) {
        return this.f10908k.mo595d(this, menuItem);
    }

    /* renamed from: b */
    public void mo534b(C0171g gVar) {
        mo709k();
        this.f10907j.mo1183l();
    }

    /* renamed from: c */
    public void mo703c() {
        if (!this.f10910m) {
            this.f10910m = true;
            this.f10907j.sendAccessibilityEvent(32);
            this.f10908k.mo592a(this);
        }
    }

    /* renamed from: d */
    public View mo704d() {
        WeakReference<View> weakReference = this.f10909l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public Menu mo705e() {
        return this.f10911n;
    }

    /* renamed from: f */
    public MenuInflater mo706f() {
        return new C3439g(this.f10907j.getContext());
    }

    /* renamed from: g */
    public CharSequence mo707g() {
        return this.f10907j.getSubtitle();
    }

    /* renamed from: i */
    public CharSequence mo708i() {
        return this.f10907j.getTitle();
    }

    /* renamed from: k */
    public void mo709k() {
        this.f10908k.mo594c(this, this.f10911n);
    }

    /* renamed from: l */
    public boolean mo710l() {
        return this.f10907j.mo1181j();
    }

    /* renamed from: m */
    public void mo711m(View view) {
        this.f10907j.setCustomView(view);
        this.f10909l = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: n */
    public void mo712n(int i) {
        mo713o(this.f10906i.getString(i));
    }

    /* renamed from: o */
    public void mo713o(CharSequence charSequence) {
        this.f10907j.setSubtitle(charSequence);
    }

    /* renamed from: q */
    public void mo714q(int i) {
        mo715r(this.f10906i.getString(i));
    }

    /* renamed from: r */
    public void mo715r(CharSequence charSequence) {
        this.f10907j.setTitle(charSequence);
    }

    /* renamed from: s */
    public void mo716s(boolean z) {
        super.mo716s(z);
        this.f10907j.setTitleOptional(z);
    }
}
