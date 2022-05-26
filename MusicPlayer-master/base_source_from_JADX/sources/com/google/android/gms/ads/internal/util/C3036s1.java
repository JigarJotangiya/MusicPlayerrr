package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.w03;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.s1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C3036s1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Uri f10102a;

    public /* synthetic */ C3036s1(Uri uri) {
        this.f10102a = uri;
    }

    public final Object call() {
        Uri uri = this.f10102a;
        w03 w03 = C2979b2.f9980i;
        C2971s.m13214q();
        return C2979b2.m13271s(uri);
    }
}
