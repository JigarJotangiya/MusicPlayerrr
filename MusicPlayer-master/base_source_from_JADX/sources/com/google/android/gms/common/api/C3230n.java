package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.n */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3230n extends UnsupportedOperationException {
    private final Feature zza;

    public C3230n(@RecentlyNonNull Feature feature) {
        this.zza = feature;
    }

    @RecentlyNonNull
    public String getMessage() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
