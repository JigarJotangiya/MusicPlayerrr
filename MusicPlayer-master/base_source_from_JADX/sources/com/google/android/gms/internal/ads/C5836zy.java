package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.C2986d1;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.p078l.C3334c;

/* renamed from: com.google.android.gms.internal.ads.zy */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5836zy {

    /* renamed from: a */
    private final Context f27069a;

    public C5836zy(Context context) {
        C3292l.m14241i(context, "Context can not be null");
        this.f27069a = context;
    }

    /* renamed from: a */
    public final boolean mo22447a(Intent intent) {
        C3292l.m14241i(intent, "Intent can not be null");
        if (!this.f27069a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    @TargetApi(14)
    /* renamed from: b */
    public final boolean mo22448b() {
        return mo22447a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean mo22449c() {
        return ((Boolean) C2986d1.m13315a(this.f27069a, new C5799yy())).booleanValue() && C3334c.m14368a(this.f27069a).mo11908a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
