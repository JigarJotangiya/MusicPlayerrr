package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ks3<T> implements yr3<Set<T>> {

    /* renamed from: a */
    private final List<ms3<T>> f18979a;

    /* renamed from: b */
    private final List<ms3<Collection<T>>> f18980b;

    static {
        zr3.m34774b(Collections.emptySet());
    }

    /* synthetic */ ks3(List list, List list2, is3 is3) {
        this.f18979a = list;
        this.f18980b = list2;
    }

    /* renamed from: b */
    public static <T> js3<T> m26414b(int i, int i2) {
        return new js3<>(i, i2, (is3) null);
    }

    /* renamed from: c */
    public final Set<T> mo10679a() {
        int size = this.f18979a.size();
        ArrayList arrayList = new ArrayList(this.f18980b.size());
        int size2 = this.f18980b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f18980b.get(i).mo10679a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = vr3.m32677a(size);
        int size3 = this.f18979a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object a2 = this.f18979a.get(i2).mo10679a();
            Objects.requireNonNull(a2);
            a.add(a2);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(next);
                a.add(next);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
