package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.widget.g */
/* compiled from: SharedValues */
public class C0440g {

    /* renamed from: a */
    private HashMap<Integer, HashSet<WeakReference<C0441a>>> f2452a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.g$a */
    /* compiled from: SharedValues */
    public interface C0441a {
    }

    public C0440g() {
        new SparseIntArray();
    }

    /* renamed from: a */
    public void mo2988a(int i, C0441a aVar) {
        HashSet hashSet = this.f2452a.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f2452a.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }

    /* renamed from: b */
    public void mo2989b(int i, C0441a aVar) {
        HashSet hashSet = this.f2452a.get(Integer.valueOf(i));
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0441a aVar2 = (C0441a) weakReference.get();
                if (aVar2 == null || aVar2 == aVar) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }
}
