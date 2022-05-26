package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ud1<ListenerT> {

    /* renamed from: g */
    protected final Map<ListenerT, Executor> f24303g = new HashMap();

    protected ud1(Set<qf1<ListenerT>> set) {
        mo21252I0(set);
    }

    /* renamed from: C0 */
    public final synchronized void mo21250C0(qf1<ListenerT> qf1) {
        mo21251D0(qf1.f21915a, qf1.f21916b);
    }

    /* renamed from: D0 */
    public final synchronized void mo21251D0(ListenerT listenert, Executor executor) {
        this.f24303g.put(listenert, executor);
    }

    /* renamed from: I0 */
    public final synchronized void mo21252I0(Set<qf1<ListenerT>> set) {
        for (qf1<ListenerT> C0 : set) {
            mo21250C0(C0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public final synchronized void mo21253K0(td1<ListenerT> td1) {
        for (Map.Entry next : this.f24303g.entrySet()) {
            ((Executor) next.getValue()).execute(new rd1(td1, next.getKey()));
        }
    }
}
