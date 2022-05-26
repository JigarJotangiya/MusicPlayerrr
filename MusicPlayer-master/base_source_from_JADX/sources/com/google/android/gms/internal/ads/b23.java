package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class b23 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final f13 f14278a;

    /* renamed from: b */
    private final a23 f14279b;

    private b23(a23 a23) {
        e13 e13 = e13.f15832b;
        this.f14279b = a23;
        this.f14278a = e13;
    }

    /* renamed from: b */
    public static b23 m21041b(int i) {
        return new b23(new x13(4000));
    }

    /* renamed from: c */
    public static b23 m21042c(f13 f13) {
        return new b23(new v13(f13));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Iterator<String> m21044g(CharSequence charSequence) {
        return this.f14279b.mo15661a(this, charSequence);
    }

    /* renamed from: d */
    public final Iterable<String> mo16017d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new y13(this, charSequence);
    }

    /* renamed from: f */
    public final List<String> mo16018f(CharSequence charSequence) {
        Iterator<String> g = m21044g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
