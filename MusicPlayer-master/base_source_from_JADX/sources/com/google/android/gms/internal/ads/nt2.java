package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class nt2<E> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final d93<?> f20720d = s83.m30607i(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final e93 f20721a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f20722b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ot2<E> f20723c;

    public nt2(e93 e93, ScheduledExecutorService scheduledExecutorService, ot2<E> ot2) {
        this.f20721a = e93;
        this.f20722b = scheduledExecutorService;
        this.f20723c = ot2;
    }

    /* renamed from: a */
    public final dt2 mo19823a(E e, d93<?>... d93Arr) {
        return new dt2(this, e, Arrays.asList(d93Arr), (ct2) null);
    }

    /* renamed from: b */
    public final <I> mt2<I> mo19824b(E e, d93<I> d93) {
        return new mt2(this, e, (String) null, d93, Collections.singletonList(d93), d93, (lt2) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo19825f(E e);
}
