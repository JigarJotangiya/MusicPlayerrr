package p443m.p444a.p451h;

import java.util.ArrayList;

/* renamed from: m.a.h.a */
/* compiled from: SkinObservable */
public class C9343a {

    /* renamed from: a */
    private final ArrayList<C9344b> f36115a = new ArrayList<>();

    /* renamed from: a */
    public synchronized void mo32338a(C9344b bVar) {
        if (bVar == null) {
            throw new NullPointerException();
        } else if (!this.f36115a.contains(bVar)) {
            this.f36115a.add(bVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo32339b(C9344b bVar) {
        this.f36115a.remove(bVar);
    }

    /* renamed from: c */
    public void mo32340c() {
        mo32341d((Object) null);
    }

    /* renamed from: d */
    public void mo32341d(Object obj) {
        C9344b[] bVarArr;
        synchronized (this) {
            ArrayList<C9344b> arrayList = this.f36115a;
            bVarArr = (C9344b[]) arrayList.toArray(new C9344b[arrayList.size()]);
        }
        for (int length = bVarArr.length - 1; length >= 0; length--) {
            bVarArr[length].mo32342t1(this, obj);
        }
    }
}
