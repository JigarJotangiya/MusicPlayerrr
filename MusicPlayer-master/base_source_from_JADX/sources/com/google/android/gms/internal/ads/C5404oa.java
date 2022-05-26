package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.oa */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5404oa implements vz2 {

    /* renamed from: a */
    final /* synthetic */ yx2 f20958a;

    C5404oa(C5478qa qaVar, yx2 yx2) {
        this.f20958a = yx2;
    }

    /* renamed from: a */
    public final boolean mo19933a(File file) {
        try {
            return this.f20958a.mo22306a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
