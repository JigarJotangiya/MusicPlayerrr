package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.k */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3331k extends Exception {
    private final Intent zza;

    public C3331k(@RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
        super(str);
        this.zza = intent;
    }

    @RecentlyNonNull
    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
