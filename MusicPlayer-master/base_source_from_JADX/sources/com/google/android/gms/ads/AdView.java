package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdView extends C3058j {
    public AdView(@RecentlyNonNull Context context) {
        super(context, 0);
        C3292l.m14241i(context, "Context cannot be null");
    }

    @RecentlyNonNull
    /* renamed from: e */
    public final C3114t mo10657e() {
        return this.f10146g.mo22096i();
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
