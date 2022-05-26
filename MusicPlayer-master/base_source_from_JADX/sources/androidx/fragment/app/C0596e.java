package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0712q0;
import p082e.p109h.p118o.C3703i;

/* renamed from: androidx.fragment.app.e */
/* compiled from: FragmentController */
public class C0596e {

    /* renamed from: a */
    private final C0598g<?> f3059a;

    private C0596e(C0598g<?> gVar) {
        this.f3059a = gVar;
    }

    /* renamed from: b */
    public static C0596e m3767b(C0598g<?> gVar) {
        C3703i.m15828e(gVar, "callbacks == null");
        return new C0596e(gVar);
    }

    /* renamed from: a */
    public void mo3857a(Fragment fragment) {
        C0598g<?> gVar = this.f3059a;
        gVar.f3064j.mo3952g(gVar, gVar, fragment);
    }

    /* renamed from: c */
    public void mo3858c() {
        this.f3059a.f3064j.mo3969r();
    }

    /* renamed from: d */
    public void mo3859d(Configuration configuration) {
        this.f3059a.f3064j.mo3970s(configuration);
    }

    /* renamed from: e */
    public boolean mo3860e(MenuItem menuItem) {
        return this.f3059a.f3064j.mo3971t(menuItem);
    }

    /* renamed from: f */
    public void mo3861f() {
        this.f3059a.f3064j.mo3974u();
    }

    /* renamed from: g */
    public boolean mo3862g(Menu menu, MenuInflater menuInflater) {
        return this.f3059a.f3064j.mo3976v(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo3863h() {
        this.f3059a.f3064j.mo3978w();
    }

    /* renamed from: i */
    public void mo3864i() {
        this.f3059a.f3064j.mo3981y();
    }

    /* renamed from: j */
    public void mo3865j(boolean z) {
        this.f3059a.f3064j.mo3982z(z);
    }

    /* renamed from: k */
    public boolean mo3866k(MenuItem menuItem) {
        return this.f3059a.f3064j.mo3903A(menuItem);
    }

    /* renamed from: l */
    public void mo3867l(Menu menu) {
        this.f3059a.f3064j.mo3905B(menu);
    }

    /* renamed from: m */
    public void mo3868m() {
        this.f3059a.f3064j.mo3908D();
    }

    /* renamed from: n */
    public void mo3869n(boolean z) {
        this.f3059a.f3064j.mo3910E(z);
    }

    /* renamed from: o */
    public boolean mo3870o(Menu menu) {
        return this.f3059a.f3064j.mo3912F(menu);
    }

    /* renamed from: p */
    public void mo3871p() {
        this.f3059a.f3064j.mo3916H();
    }

    /* renamed from: q */
    public void mo3872q() {
        this.f3059a.f3064j.mo3918I();
    }

    /* renamed from: r */
    public void mo3873r() {
        this.f3059a.f3064j.mo3921K();
    }

    /* renamed from: s */
    public boolean mo3874s() {
        return this.f3059a.f3064j.mo3928Q(true);
    }

    /* renamed from: t */
    public Fragment mo3875t(String str) {
        return this.f3059a.f3064j.mo3940Z(str);
    }

    /* renamed from: u */
    public C0602j mo3876u() {
        return this.f3059a.f3064j;
    }

    /* renamed from: v */
    public void mo3877v() {
        this.f3059a.f3064j.mo3909D0();
    }

    /* renamed from: w */
    public View mo3878w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3059a.f3064j.mo3958i0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: x */
    public void mo3879x(Parcelable parcelable) {
        C0598g<?> gVar = this.f3059a;
        if (gVar instanceof C0712q0) {
            gVar.f3064j.mo3933U0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: y */
    public Parcelable mo3880y() {
        return this.f3059a.f3064j.mo3935W0();
    }
}
