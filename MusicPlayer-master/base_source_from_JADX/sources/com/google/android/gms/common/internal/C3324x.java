package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.x */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C3324x implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C3324x m14343b(Activity activity, Intent intent, int i) {
        return new C3322w(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11885a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo11885a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
