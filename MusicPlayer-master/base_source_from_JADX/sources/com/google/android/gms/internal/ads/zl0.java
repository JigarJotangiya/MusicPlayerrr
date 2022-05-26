package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zl0 {
    /* renamed from: a */
    public static Context m34658a(Context context) throws yl0 {
        return m34660c(context).mo11997b();
    }

    /* renamed from: b */
    public static <T> T m34659b(Context context, String str, xl0<IBinder, T> xl0) throws yl0 {
        try {
            return xl0.mo18378b(m34660c(context).mo11998d(str));
        } catch (Exception e) {
            throw new yl0(e);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m34660c(Context context) throws yl0 {
        try {
            return DynamiteModule.m14489e(context, DynamiteModule.f10792b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new yl0(e);
        }
    }
}
