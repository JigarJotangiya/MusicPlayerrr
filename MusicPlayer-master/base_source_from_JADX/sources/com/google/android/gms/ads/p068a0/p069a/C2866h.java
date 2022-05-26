package com.google.android.gms.ads.p068a0.p069a;

import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.ox1;
import com.google.android.gms.internal.ads.s83;
import com.google.android.gms.internal.ads.y73;
import com.google.android.gms.internal.ads.zzcdq;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.ads.a0.a.h */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2866h implements y73<zzcdq, C2870j> {

    /* renamed from: a */
    private final Executor f9733a;

    /* renamed from: b */
    private final ox1 f9734b;

    public C2866h(Executor executor, ox1 ox1) {
        this.f9733a = executor;
        this.f9734b = ox1;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ d93 mo10692b(Object obj) throws Exception {
        zzcdq zzcdq = (zzcdq) obj;
        return s83.m30612n(this.f9734b.mo20147b(zzcdq), new C2864g(zzcdq), this.f9733a);
    }
}
