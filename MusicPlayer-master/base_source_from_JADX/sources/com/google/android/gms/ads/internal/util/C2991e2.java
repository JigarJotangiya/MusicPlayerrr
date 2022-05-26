package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
/* renamed from: com.google.android.gms.ads.internal.util.e2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2991e2 extends C2987d2 {
    /* renamed from: g */
    public final int mo11017g() {
        return 14;
    }

    /* renamed from: h */
    public final long mo11018h() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }

    /* renamed from: i */
    public boolean mo11019i(View view) {
        return super.mo11019i(view) || view.getWindowId() != null;
    }
}
