package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qp3 extends AbstractList<String> implements RandomAccess, hn3 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final hn3 f21992g;

    public qp3(hn3 hn3) {
        this.f21992g = hn3;
    }

    /* renamed from: e */
    public final List<?> mo17990e() {
        return this.f21992g.mo17990e();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((gn3) this.f21992g).get(i);
    }

    public final Iterator<String> iterator() {
        return new pp3(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new op3(this, i);
    }

    /* renamed from: n */
    public final void mo17992n(kl3 kl3) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f21992g.size();
    }

    /* renamed from: z */
    public final Object mo17996z(int i) {
        return this.f21992g.mo17996z(i);
    }

    public final hn3 zze() {
        return this;
    }
}
