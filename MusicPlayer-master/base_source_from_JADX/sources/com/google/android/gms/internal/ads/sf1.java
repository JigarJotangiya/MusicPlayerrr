package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sf1 extends ud1<C5824zm> implements C5824zm {

    /* renamed from: h */
    private final Map<View, C4898an> f23434h = new WeakHashMap(1);

    /* renamed from: i */
    private final Context f23435i;

    /* renamed from: j */
    private final bp2 f23436j;

    public sf1(Context context, Set<qf1<C5824zm>> set, bp2 bp2) {
        super(set);
        this.f23435i = context;
        this.f23436j = bp2;
    }

    /* renamed from: H0 */
    public final synchronized void mo16484H0(C5749xm xmVar) {
        mo21253K0(new rf1(xmVar));
    }

    /* renamed from: N0 */
    public final synchronized void mo20839N0(View view) {
        C4898an anVar = this.f23434h.get(view);
        if (anVar == null) {
            anVar = new C4898an(this.f23435i, view);
            anVar.mo15880c(this);
            this.f23434h.put(view, anVar);
        }
        if (this.f23436j.f14629U) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22417S0)).booleanValue()) {
                anVar.mo15884g(((Long) C5054ev.m23225c().mo20153b(C5503qz.f22410R0)).longValue());
                return;
            }
        }
        anVar.mo15883f();
    }

    /* renamed from: P0 */
    public final synchronized void mo20840P0(View view) {
        if (this.f23434h.containsKey(view)) {
            this.f23434h.get(view).mo15882e(this);
            this.f23434h.remove(view);
        }
    }
}
