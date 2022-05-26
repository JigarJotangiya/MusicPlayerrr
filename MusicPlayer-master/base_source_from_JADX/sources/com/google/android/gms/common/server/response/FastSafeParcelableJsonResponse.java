package com.google.android.gms.common.server.response;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @RecentlyNullable
    /* renamed from: d */
    public Object mo11939d(@RecentlyNonNull String str) {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo11937a().values()) {
            if (mo11940e(next)) {
                if (!fastJsonResponse.mo11940e(next) || !C3289k.m14227a(mo11938b(next), fastJsonResponse.mo11938b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo11940e(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo11941f(@RecentlyNonNull String str) {
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo11937a().values()) {
            if (mo11940e(next)) {
                Object b = mo11938b(next);
                C3292l.m14240h(b);
                i = (i * 31) + b.hashCode();
            }
        }
        return i;
    }
}
