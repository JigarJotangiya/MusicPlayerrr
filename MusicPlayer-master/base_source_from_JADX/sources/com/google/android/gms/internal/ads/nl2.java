package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class nl2 implements y73 {

    /* renamed from: a */
    public final /* synthetic */ lr2 f20658a;

    /* renamed from: b */
    public final /* synthetic */ k51 f20659b;

    public /* synthetic */ nl2(ol2 ol2, lr2 lr2, k51 k51) {
        this.f20658a = lr2;
        this.f20659b = k51;
    }

    /* renamed from: b */
    public final d93 mo10692b(Object obj) {
        lr2 lr2 = this.f20658a;
        k51 k51 = this.f20659b;
        np2 np2 = (np2) obj;
        lr2.f19513b = np2;
        Iterator<bp2> it = np2.f20683b.f20120a.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator<String> it2 = it.next().f14635a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return k51.mo18847h(s83.m30607i(np2));
            }
        }
        return s83.m30607i(null);
    }
}
