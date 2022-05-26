package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0842c;
import androidx.recyclerview.widget.C0844d;
import androidx.recyclerview.widget.C0865h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0792c0;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.r */
/* compiled from: ListAdapter */
public abstract class C0903r<T, VH extends RecyclerView.C0792c0> extends RecyclerView.C0797h<VH> {

    /* renamed from: a */
    final C0844d<T> f4048a;

    /* renamed from: b */
    private final C0844d.C0848b<T> f4049b;

    /* renamed from: androidx.recyclerview.widget.r$a */
    /* compiled from: ListAdapter */
    class C0904a implements C0844d.C0848b<T> {
        C0904a() {
        }

        /* renamed from: a */
        public void mo5209a(List<T> list, List<T> list2) {
            C0903r.this.mo5381d(list, list2);
        }
    }

    protected C0903r(C0865h.C0871f<T> fVar) {
        C0904a aVar = new C0904a();
        this.f4049b = aVar;
        C0844d<T> dVar = new C0844d<>(new C0838b(this), new C0842c.C0843a(fVar).mo5196a());
        this.f4048a = dVar;
        dVar.mo5197a(aVar);
    }

    /* renamed from: c */
    public List<T> mo5380c() {
        return this.f4048a.mo5198b();
    }

    /* renamed from: d */
    public void mo5381d(List<T> list, List<T> list2) {
    }

    /* renamed from: e */
    public void mo5382e(List<T> list) {
        this.f4048a.mo5200e(list);
    }

    /* access modifiers changed from: protected */
    public T getItem(int i) {
        return this.f4048a.mo5198b().get(i);
    }

    public int getItemCount() {
        return this.f4048a.mo5198b().size();
    }
}
