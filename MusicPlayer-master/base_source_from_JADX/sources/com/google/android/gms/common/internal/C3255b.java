package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C3158b;
import com.google.android.gms.common.api.C3227k;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3255b {
    /* renamed from: a */
    public static C3158b m14102a(@RecentlyNonNull Status status) {
        if (status.mo11494v0()) {
            return new C3227k(status);
        }
        return new C3158b(status);
    }
}
