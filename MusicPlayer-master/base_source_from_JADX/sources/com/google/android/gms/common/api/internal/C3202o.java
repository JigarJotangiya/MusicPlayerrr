package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C3158b;
import com.google.android.gms.common.api.Status;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.o */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3202o {
    /* renamed from: a */
    public static <TResult> void m13925a(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull C7471i<TResult> iVar) {
        if (status.mo11496z0()) {
            iVar.mo28354c(tresult);
        } else {
            iVar.mo28353b(new C3158b(status));
        }
    }
}
