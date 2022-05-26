package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class am1 extends rc1 {
    public final uf1 zzb;

    public am1(uf1 uf1, int i, int i2) {
        super(m20859a(2008, 1));
        this.zzb = uf1;
    }

    /* renamed from: a */
    private static int m20859a(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public static am1 zza(IOException iOException, uf1 uf1, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && a13.m20554a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new zk1(iOException, uf1);
        }
        return new am1(iOException, uf1, i2, i);
    }

    public am1(IOException iOException, uf1 uf1, int i, int i2) {
        super((Throwable) iOException, m20859a(i, i2));
        this.zzb = uf1;
    }

    public am1(String str, uf1 uf1, int i, int i2) {
        super(str, m20859a(2001, 1));
        this.zzb = uf1;
    }

    @Deprecated
    public am1(String str, IOException iOException, uf1 uf1, int i) {
        this(str, iOException, uf1, 2000, 1);
    }

    public am1(String str, IOException iOException, uf1 uf1, int i, int i2) {
        super(str, iOException, m20859a(i, 1));
        this.zzb = uf1;
    }
}
