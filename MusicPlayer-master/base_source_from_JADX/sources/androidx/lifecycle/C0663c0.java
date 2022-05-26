package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p082e.p091b.p092a.p094b.C3451b;

/* renamed from: androidx.lifecycle.c0 */
/* compiled from: MediatorLiveData */
public class C0663c0<T> extends C0670e0<T> {

    /* renamed from: l */
    private C3451b<LiveData<?>, C0664a<?>> f3282l = new C3451b<>();

    /* renamed from: androidx.lifecycle.c0$a */
    /* compiled from: MediatorLiveData */
    private static class C0664a<V> implements C0672f0<V> {

        /* renamed from: a */
        final LiveData<V> f3283a;

        /* renamed from: b */
        final C0672f0<? super V> f3284b;

        /* renamed from: c */
        int f3285c = -1;

        C0664a(LiveData<V> liveData, C0672f0<? super V> f0Var) {
            this.f3283a = liveData;
            this.f3284b = f0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4207a() {
            this.f3283a.mo4150i(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4208b() {
            this.f3283a.mo4154m(this);
        }

        public void onChanged(V v) {
            if (this.f3285c != this.f3283a.mo4147f()) {
                this.f3285c = this.f3283a.mo4147f();
                this.f3284b.onChanged(v);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4151j() {
        Iterator<Map.Entry<LiveData<?>, C0664a<?>>> it = this.f3282l.iterator();
        while (it.hasNext()) {
            ((C0664a) it.next().getValue()).mo4207a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4152k() {
        Iterator<Map.Entry<LiveData<?>, C0664a<?>>> it = this.f3282l.iterator();
        while (it.hasNext()) {
            ((C0664a) it.next().getValue()).mo4208b();
        }
    }

    /* renamed from: p */
    public <S> void mo4205p(LiveData<S> liveData, C0672f0<? super S> f0Var) {
        C0664a aVar = new C0664a(liveData, f0Var);
        C0664a v = this.f3282l.mo12236v(liveData, aVar);
        if (v != null && v.f3284b != f0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (v == null && mo4148g()) {
            aVar.mo4207a();
        }
    }

    /* renamed from: q */
    public <S> void mo4206q(LiveData<S> liveData) {
        C0664a x = this.f3282l.mo12237x(liveData);
        if (x != null) {
            x.mo4208b();
        }
    }
}
