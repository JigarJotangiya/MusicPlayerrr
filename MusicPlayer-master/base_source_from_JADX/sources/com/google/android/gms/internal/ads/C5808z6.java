package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.z6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5808z6 implements C5400o6 {

    /* renamed from: a */
    private File f26674a = null;

    /* renamed from: b */
    final /* synthetic */ Context f26675b;

    C5808z6(Context context) {
        this.f26675b = context;
    }

    public final File zza() {
        if (this.f26674a == null) {
            this.f26674a = new File(this.f26675b.getCacheDir(), "volley");
        }
        return this.f26674a;
    }
}
