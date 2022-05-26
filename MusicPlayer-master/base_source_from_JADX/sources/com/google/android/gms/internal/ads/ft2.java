package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ft2 {
    /* renamed from: a */
    public static final <O> mt2<O> m23960a(Callable<O> callable, Object obj, nt2 nt2) {
        return m23961b(callable, nt2.f20721a, obj, nt2);
    }

    /* renamed from: b */
    public static final <O> mt2<O> m23961b(Callable<O> callable, e93 e93, Object obj, nt2 nt2) {
        return new mt2(nt2, obj, (String) null, nt2.f20720d, Collections.emptyList(), e93.mo17138A0(callable), (lt2) null);
    }

    /* renamed from: c */
    public static final <O> mt2<O> m23962c(d93<O> d93, Object obj, nt2 nt2) {
        return new mt2(nt2, obj, (String) null, nt2.f20720d, Collections.emptyList(), d93, (lt2) null);
    }

    /* renamed from: d */
    public static final mt2 m23963d(zs2 zs2, e93 e93, Object obj, nt2 nt2) {
        return m23961b(new et2(zs2), e93, obj, nt2);
    }
}
