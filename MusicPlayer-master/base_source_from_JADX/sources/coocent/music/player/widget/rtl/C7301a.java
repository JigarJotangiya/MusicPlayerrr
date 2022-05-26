package coocent.music.player.widget.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C1184a;

/* renamed from: coocent.music.player.widget.rtl.a */
/* compiled from: DelegatingPagerAdapter */
public class C7301a extends C1184a {

    /* renamed from: c */
    private final C1184a f32236c;

    /* renamed from: coocent.music.player.widget.rtl.a$b */
    /* compiled from: DelegatingPagerAdapter */
    private static class C7303b extends DataSetObserver {

        /* renamed from: a */
        final C7301a f32237a;

        public void onChanged() {
            C7301a aVar = this.f32237a;
            if (aVar != null) {
                aVar.mo28007w();
            }
        }

        public void onInvalidated() {
            onChanged();
        }

        private C7303b(C7301a aVar) {
            this.f32237a = aVar;
        }
    }

    public C7301a(C1184a aVar) {
        this.f32236c = aVar;
        aVar.mo6301m(new C7303b());
    }

    @Deprecated
    /* renamed from: a */
    public void mo6293a(View view, int i, Object obj) {
        this.f32236c.mo6293a(view, i, obj);
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        this.f32236c.mo4039b(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: c */
    public void mo6294c(View view) {
        this.f32236c.mo6294c(view);
    }

    /* renamed from: d */
    public void mo4040d(ViewGroup viewGroup) {
        this.f32236c.mo4040d(viewGroup);
    }

    /* renamed from: e */
    public int mo6295e() {
        return this.f32236c.mo6295e();
    }

    /* renamed from: f */
    public int mo6296f(Object obj) {
        return this.f32236c.mo6296f(obj);
    }

    /* renamed from: g */
    public CharSequence mo6297g(int i) {
        return this.f32236c.mo6297g(i);
    }

    /* renamed from: h */
    public float mo6298h(int i) {
        return this.f32236c.mo6298h(i);
    }

    @Deprecated
    /* renamed from: i */
    public Object mo6299i(View view, int i) {
        return this.f32236c.mo6299i(view, i);
    }

    /* renamed from: j */
    public Object mo4041j(ViewGroup viewGroup, int i) {
        return this.f32236c.mo4041j(viewGroup, i);
    }

    /* renamed from: k */
    public boolean mo4042k(View view, Object obj) {
        return this.f32236c.mo4042k(view, obj);
    }

    /* renamed from: l */
    public void mo6300l() {
        this.f32236c.mo6300l();
    }

    /* renamed from: m */
    public void mo6301m(DataSetObserver dataSetObserver) {
        this.f32236c.mo6301m(dataSetObserver);
    }

    /* renamed from: n */
    public void mo4043n(Parcelable parcelable, ClassLoader classLoader) {
        this.f32236c.mo4043n(parcelable, classLoader);
    }

    /* renamed from: o */
    public Parcelable mo4044o() {
        return this.f32236c.mo4044o();
    }

    @Deprecated
    /* renamed from: p */
    public void mo6302p(View view, int i, Object obj) {
        this.f32236c.mo6302p(view, i, obj);
    }

    /* renamed from: q */
    public void mo4045q(ViewGroup viewGroup, int i, Object obj) {
        this.f32236c.mo4045q(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: s */
    public void mo6304s(View view) {
        this.f32236c.mo6304s(view);
    }

    /* renamed from: t */
    public void mo4046t(ViewGroup viewGroup) {
        this.f32236c.mo4046t(viewGroup);
    }

    /* renamed from: u */
    public void mo6305u(DataSetObserver dataSetObserver) {
        this.f32236c.mo6305u(dataSetObserver);
    }

    /* renamed from: v */
    public C1184a mo28006v() {
        return this.f32236c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo28007w() {
        super.mo6300l();
    }
}
