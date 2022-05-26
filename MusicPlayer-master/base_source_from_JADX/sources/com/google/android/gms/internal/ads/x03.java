package com.google.android.gms.internal.ads;

import p159f.p243f.p245b.p246a.p303f.C7466d;
import p159f.p243f.p245b.p246a.p303f.C7470h;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class x03 implements C7466d {

    /* renamed from: a */
    public final /* synthetic */ l93 f25614a;

    public /* synthetic */ x03(l93 l93) {
        this.f25614a = l93;
    }

    /* renamed from: a */
    public final void mo11556a(C7470h hVar) {
        l93 l93 = this.f25614a;
        if (hVar.mo28341k()) {
            l93.cancel(false);
        } else if (hVar.mo28343m()) {
            l93.mo18105w(hVar.mo28340j());
        } else {
            Exception i = hVar.mo28339i();
            if (i != null) {
                l93.mo18106x(i);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
