package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.p073w.C3120a;
import com.google.android.gms.common.C3238d;
import com.google.android.gms.common.C3243e;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.ul0;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.internal.util.x0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3050x0 extends C2977b0 {

    /* renamed from: c */
    private final Context f10130c;

    C3050x0(Context context) {
        this.f10130c = context;
    }

    /* renamed from: a */
    public final void mo10867a() {
        boolean z;
        try {
            z = C3120a.m13693d(this.f10130c);
        } catch (C3238d | C3243e | IOException | IllegalStateException e) {
            ul0.m31860e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        tl0.m31312j(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        ul0.m31862g(sb.toString());
    }
}
