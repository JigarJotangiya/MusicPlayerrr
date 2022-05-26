package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.viewpager.widget.a */
/* compiled from: PagerAdapter */
public abstract class C1184a {

    /* renamed from: a */
    private final DataSetObservable f4884a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f4885b;

    @Deprecated
    /* renamed from: a */
    public void mo6293a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        mo6293a(viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: c */
    public void mo6294c(View view) {
    }

    /* renamed from: d */
    public void mo4040d(ViewGroup viewGroup) {
        mo6294c(viewGroup);
    }

    /* renamed from: e */
    public abstract int mo6295e();

    /* renamed from: f */
    public int mo6296f(Object obj) {
        return -1;
    }

    /* renamed from: g */
    public CharSequence mo6297g(int i) {
        return null;
    }

    /* renamed from: h */
    public float mo6298h(int i) {
        return 1.0f;
    }

    @Deprecated
    /* renamed from: i */
    public Object mo6299i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: j */
    public Object mo4041j(ViewGroup viewGroup, int i) {
        return mo6299i(viewGroup, i);
    }

    /* renamed from: k */
    public abstract boolean mo4042k(View view, Object obj);

    /* renamed from: l */
    public void mo6300l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f4885b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f4884a.notifyChanged();
    }

    /* renamed from: m */
    public void mo6301m(DataSetObserver dataSetObserver) {
        this.f4884a.registerObserver(dataSetObserver);
    }

    /* renamed from: n */
    public void mo4043n(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: o */
    public Parcelable mo4044o() {
        return null;
    }

    @Deprecated
    /* renamed from: p */
    public void mo6302p(View view, int i, Object obj) {
    }

    /* renamed from: q */
    public void mo4045q(ViewGroup viewGroup, int i, Object obj) {
        mo6302p(viewGroup, i, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6303r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f4885b = dataSetObserver;
        }
    }

    @Deprecated
    /* renamed from: s */
    public void mo6304s(View view) {
    }

    /* renamed from: t */
    public void mo4046t(ViewGroup viewGroup) {
        mo6304s(viewGroup);
    }

    /* renamed from: u */
    public void mo6305u(DataSetObserver dataSetObserver) {
        this.f4884a.unregisterObserver(dataSetObserver);
    }
}
