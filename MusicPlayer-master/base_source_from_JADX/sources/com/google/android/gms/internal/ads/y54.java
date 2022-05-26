package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y54 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m34040b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
