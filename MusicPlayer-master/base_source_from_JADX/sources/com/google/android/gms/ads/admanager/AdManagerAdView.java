package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.C3058j;
import com.google.android.gms.ads.C3114t;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.common.internal.C3292l;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdManagerAdView extends C3058j {
    public AdManagerAdView(@RecentlyNonNull Context context) {
        super(context, 0);
        C3292l.m14241i(context, "Context cannot be null");
    }

    @RecentlyNullable
    public C2921g[] getAdSizes() {
        return this.f10146g.mo22091a();
    }

    @RecentlyNullable
    public C2889b getAppEventListener() {
        return this.f10146g.mo22098k();
    }

    @RecentlyNonNull
    public C3114t getVideoController() {
        return this.f10146g.mo22096i();
    }

    @RecentlyNullable
    public C3116u getVideoOptions() {
        return this.f10146g.mo22097j();
    }

    public void setAdSizes(@RecentlyNonNull C2921g... gVarArr) {
        if (gVarArr == null || gVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f10146g.mo22108u(gVarArr);
    }

    public void setAppEventListener(C2889b bVar) {
        this.f10146g.mo22110w(bVar);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f10146g.mo22111x(z);
    }

    public void setVideoOptions(@RecentlyNonNull C3116u uVar) {
        this.f10146g.mo22113z(uVar);
    }

    public AdManagerAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        C3292l.m14241i(context, "Context cannot be null");
    }

    public AdManagerAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        C3292l.m14241i(context, "Context cannot be null");
    }
}
