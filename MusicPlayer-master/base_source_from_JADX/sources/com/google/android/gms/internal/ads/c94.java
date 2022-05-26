package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c94 {
    /* renamed from: a */
    public static int m21829a(z84 z84, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int a = z84.mo19925a(bArr, i + i3, i2 - i3);
            if (a == -1) {
                break;
            }
            i3 += a;
        }
        return i3;
    }

    /* renamed from: b */
    public static void m21830b(boolean z, String str) throws C5464px {
        if (!z) {
            throw C5464px.zza(str, (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m21831c(z84 z84, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return z84.mo19929i(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: d */
    public static boolean m21832d(z84 z84, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((t84) z84).mo19927e(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m21833e(z84 z84, int i) throws IOException {
        try {
            ((t84) z84).mo21042o(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
