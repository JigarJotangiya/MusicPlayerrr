package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2925a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yo1 implements Callable<bp1> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2925a f26447a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final cs0 f26448b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f26449c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final gt1 f26450d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final gu2 f26451e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final y12 f26452f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Executor f26453g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5737xa f26454h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzcjf f26455i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final lv2 f26456j;

    public yo1(Context context, Executor executor, C5737xa xaVar, zzcjf zzcjf, C2925a aVar, cs0 cs0, y12 y12, lv2 lv2, gt1 gt1, gu2 gu2) {
        this.f26449c = context;
        this.f26453g = executor;
        this.f26454h = xaVar;
        this.f26455i = zzcjf;
        this.f26447a = aVar;
        this.f26448b = cs0;
        this.f26452f = y12;
        this.f26456j = lv2;
        this.f26450d = gt1;
        this.f26451e = gu2;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        bp1 bp1 = new bp1(this);
        bp1.mo16354h();
        return bp1;
    }
}
