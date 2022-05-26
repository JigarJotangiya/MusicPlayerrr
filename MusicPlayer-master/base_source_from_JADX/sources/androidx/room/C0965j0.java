package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: androidx.room.j0 */
/* compiled from: InvalidationLiveDataContainer */
class C0965j0 {

    /* renamed from: a */
    final Set<LiveData> f4147a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final C0994s0 f4148b;

    C0965j0(C0994s0 s0Var) {
        this.f4148b = s0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> LiveData<T> mo5490a(String[] strArr, boolean z, Callable<T> callable) {
        return new C1010w0(this.f4148b, this, z, callable, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5491b(LiveData liveData) {
        this.f4147a.add(liveData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5492c(LiveData liveData) {
        this.f4147a.remove(liveData);
    }
}
