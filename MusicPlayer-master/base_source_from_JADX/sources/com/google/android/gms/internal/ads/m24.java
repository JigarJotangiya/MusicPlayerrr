package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class m24 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ p24 f19732g;

    /* renamed from: h */
    public final /* synthetic */ q24 f19733h;

    /* renamed from: i */
    public final /* synthetic */ x14 f19734i;

    /* renamed from: j */
    public final /* synthetic */ c24 f19735j;

    /* renamed from: k */
    public final /* synthetic */ IOException f19736k;

    /* renamed from: l */
    public final /* synthetic */ boolean f19737l;

    public /* synthetic */ m24(p24 p24, q24 q24, x14 x14, c24 c24, IOException iOException, boolean z) {
        this.f19732g = p24;
        this.f19733h = q24;
        this.f19734i = x14;
        this.f19735j = c24;
        this.f19736k = iOException;
        this.f19737l = z;
    }

    public final void run() {
        p24 p24 = this.f19732g;
        this.f19733h.mo15960A(p24.f21303a, p24.f21304b, this.f19734i, this.f19735j, this.f19736k, this.f19737l);
    }
}
