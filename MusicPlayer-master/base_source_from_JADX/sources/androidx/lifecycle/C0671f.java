package androidx.lifecycle;

import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.C8519h;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: androidx.lifecycle.f */
/* compiled from: CoroutineLiveData.kt */
public final class C0671f {
    /* renamed from: a */
    public static final <T> LiveData<T> m4211a(C8513g gVar, long j, C8574p<? super C0654a0<T>, ? super C8508d<? super C8457t>, ? extends Object> pVar) {
        C8594l.m46771e(gVar, "context");
        C8594l.m46771e(pVar, "block");
        return new C0667e(gVar, j, pVar);
    }

    /* renamed from: b */
    public static /* synthetic */ LiveData m4212b(C8513g gVar, long j, C8574p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C8519h.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return m4211a(gVar, j, pVar);
    }
}
