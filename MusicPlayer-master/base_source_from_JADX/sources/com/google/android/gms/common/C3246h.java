package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.common.h */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3246h {

    /* renamed from: a */
    private static C3246h f10504a;

    public C3246h(@RecentlyNonNull Context context) {
        context.getApplicationContext();
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C3246h m14054a(@RecentlyNonNull Context context) {
        C3292l.m14240h(context);
        synchronized (C3246h.class) {
            if (f10504a == null) {
                C3376x.m14485a(context);
                f10504a = new C3246h(context);
            }
        }
        return f10504a;
    }

    /* renamed from: b */
    static final C3354t m14055b(PackageInfo packageInfo, C3354t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C3355u uVar = new C3355u(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < tVarArr.length; i++) {
            if (tVarArr[i].equals(uVar)) {
                return tVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m14056c(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        C3354t tVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                tVar = m14055b(packageInfo, C3375w.f10776a);
            } else {
                tVar = m14055b(packageInfo, C3375w.f10776a[0]);
            }
            if (tVar != null) {
                return true;
            }
        }
        return false;
    }
}
