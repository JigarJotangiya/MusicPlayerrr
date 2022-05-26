package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.ads.internal.util.a0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2973a0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ Context f9968g;

    /* renamed from: h */
    final /* synthetic */ String f9969h;

    /* renamed from: i */
    final /* synthetic */ boolean f9970i;

    /* renamed from: j */
    final /* synthetic */ boolean f9971j;

    C2973a0(C2981c0 c0Var, Context context, String str, boolean z, boolean z2) {
        this.f9968g = context;
        this.f9969h = str;
        this.f9970i = z;
        this.f9971j = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f9968g);
        builder.setMessage(this.f9969h);
        if (this.f9970i) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f9971j) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new C3055z(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
