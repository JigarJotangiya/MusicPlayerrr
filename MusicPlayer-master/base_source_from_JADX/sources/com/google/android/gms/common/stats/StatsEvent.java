package com.google.android.gms.common.stats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: Y */
    public abstract long mo11974Y();

    /* renamed from: b */
    public abstract long mo11975b();

    /* renamed from: m0 */
    public abstract int mo11976m0();

    @RecentlyNonNull
    /* renamed from: n0 */
    public abstract String mo11977n0();

    @RecentlyNonNull
    public final String toString() {
        long Y = mo11974Y();
        int m0 = mo11976m0();
        long b = mo11975b();
        String n0 = mo11977n0();
        StringBuilder sb = new StringBuilder(String.valueOf(n0).length() + 53);
        sb.append(Y);
        sb.append("\t");
        sb.append(m0);
        sb.append("\t");
        sb.append(b);
        sb.append(n0);
        return sb.toString();
    }
}
