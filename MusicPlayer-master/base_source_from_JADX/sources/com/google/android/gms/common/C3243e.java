package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.e */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3243e extends C3331k {
    private final int zza;

    public C3243e(int i, @RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
