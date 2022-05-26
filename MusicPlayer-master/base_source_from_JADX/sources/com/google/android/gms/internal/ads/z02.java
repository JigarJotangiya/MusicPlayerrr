package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3024o1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z02 implements u91, h81 {

    /* renamed from: i */
    private static final Object f26612i = new Object();

    /* renamed from: j */
    private static int f26613j;

    /* renamed from: g */
    private final C3024o1 f26614g;

    /* renamed from: h */
    private final i12 f26615h;

    public z02(i12 i12, C3024o1 o1Var) {
        this.f26615h = i12;
        this.f26614g = o1Var;
    }

    /* renamed from: a */
    private final void m34378a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22469Z3)).booleanValue() && !this.f26614g.mo11065E()) {
            Object obj = f26612i;
            synchronized (obj) {
                i = f26613j;
                intValue = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22477a4)).intValue();
            }
            if (i < intValue) {
                this.f26615h.mo18256e(z);
                synchronized (obj) {
                    f26613j++;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo16370c(zzbew zzbew) {
        m34378a(false);
    }

    /* renamed from: k */
    public final void mo15615k() {
        m34378a(true);
    }
}
