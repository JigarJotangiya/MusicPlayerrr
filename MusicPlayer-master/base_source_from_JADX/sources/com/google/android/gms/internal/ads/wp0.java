package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wp0 implements Iterable<vp0> {

    /* renamed from: g */
    private final List<vp0> f25482g = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final vp0 mo21868d(eo0 eo0) {
        Iterator<vp0> it = iterator();
        while (it.hasNext()) {
            vp0 next = it.next();
            if (next.f24891c == eo0) {
                return next;
            }
        }
        return null;
    }

    public final Iterator<vp0> iterator() {
        return this.f25482g.iterator();
    }

    /* renamed from: p */
    public final void mo21870p(vp0 vp0) {
        this.f25482g.add(vp0);
    }

    /* renamed from: s */
    public final void mo21871s(vp0 vp0) {
        this.f25482g.remove(vp0);
    }

    /* renamed from: t */
    public final boolean mo21872t(eo0 eo0) {
        ArrayList<vp0> arrayList = new ArrayList<>();
        Iterator<vp0> it = iterator();
        while (it.hasNext()) {
            vp0 next = it.next();
            if (next.f24891c == eo0) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (vp0 vp0 : arrayList) {
            vp0.f24892d.mo17262i();
        }
        return true;
    }
}
