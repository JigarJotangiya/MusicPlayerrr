package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gn3 extends wk3<String> implements RandomAccess, hn3 {

    /* renamed from: i */
    private static final gn3 f17207i;

    /* renamed from: h */
    private final List<Object> f17208h;

    static {
        gn3 gn3 = new gn3(10);
        f17207i = gn3;
        gn3.mo21838a();
    }

    public gn3() {
        this(10);
    }

    /* renamed from: s */
    private static String m24452s(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof kl3) {
            return ((kl3) obj).zzA(zm3.f26835a);
        }
        return zm3.m34703h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo21840d();
        this.f17208h.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo21840d();
        if (collection instanceof hn3) {
            collection = ((hn3) collection).mo17990e();
        }
        boolean addAll = this.f17208h.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo21840d();
        this.f17208h.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final List<?> mo17990e() {
        return Collections.unmodifiableList(this.f17208h);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ ym3 mo15868f(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f17208h);
            return new gn3((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public final void mo17992n(kl3 kl3) {
        mo21840d();
        this.f17208h.add(kl3);
        this.modCount++;
    }

    /* renamed from: p */
    public final String get(int i) {
        Object obj = this.f17208h.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof kl3) {
            kl3 kl3 = (kl3) obj;
            String zzA = kl3.zzA(zm3.f26835a);
            if (kl3.zzp()) {
                this.f17208h.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String h = zm3.m34703h(bArr);
        if (zm3.m34704i(bArr)) {
            this.f17208h.set(i, h);
        }
        return h;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo21840d();
        Object remove = this.f17208h.remove(i);
        this.modCount++;
        return m24452s(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo21840d();
        return m24452s(this.f17208h.set(i, (String) obj));
    }

    public final int size() {
        return this.f17208h.size();
    }

    /* renamed from: z */
    public final Object mo17996z(int i) {
        return this.f17208h.get(i);
    }

    public final hn3 zze() {
        return mo21839b() ? new qp3(this) : this;
    }

    public gn3(int i) {
        this.f17208h = new ArrayList(i);
    }

    private gn3(ArrayList<Object> arrayList) {
        this.f17208h = arrayList;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
