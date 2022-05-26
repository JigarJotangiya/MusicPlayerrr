package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nt0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzcjf f20715a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f20716b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WeakReference<Context> f20717c;

    /* renamed from: c */
    public final nt0 mo19820c(Context context) {
        this.f20717c = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f20716b = context;
        return this;
    }

    /* renamed from: d */
    public final nt0 mo19821d(zzcjf zzcjf) {
        this.f20715a = zzcjf;
        return this;
    }
}
