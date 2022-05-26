package androidx.work;

import android.content.Context;
import androidx.startup.C1038b;
import androidx.work.C1228b;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements C1038b<C1422v> {

    /* renamed from: a */
    private static final String f4983a = C1405l.m7462f("WrkMgrInitializer");

    /* renamed from: a */
    public List<Class<? extends C1038b<?>>> mo5766a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C1422v mo5767b(Context context) {
        C1405l.m7460c().mo6816a(f4983a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C1422v.m7483e(context, new C1228b.C1230b().mo6471a());
        return C1422v.m7482d(context);
    }
}
