package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ft0 extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f16753a;

    /* renamed from: b */
    private Context f16754b;

    /* renamed from: c */
    private Context f16755c;

    public ft0(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo17725a() {
        return this.f16753a;
    }

    /* renamed from: b */
    public final Context mo17726b() {
        return this.f16755c;
    }

    public final Object getSystemService(String str) {
        return this.f16755c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f16754b = applicationContext;
        this.f16753a = context instanceof Activity ? (Activity) context : null;
        this.f16755c = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f16753a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f16754b.startActivity(intent);
    }
}
