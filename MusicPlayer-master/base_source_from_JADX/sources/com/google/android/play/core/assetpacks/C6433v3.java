package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.v3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6433v3 {

    /* renamed from: a */
    private final Context f29686a;

    public C6433v3(Context context) {
        this.f29686a = context;
    }

    /* renamed from: b */
    static String m37814b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo25371a() {
        return this.f29686a;
    }
}
