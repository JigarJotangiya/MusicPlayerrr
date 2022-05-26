package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3285i1;
import com.google.android.gms.common.internal.C3288j1;
import com.google.android.gms.common.internal.C3292l;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.common.t */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class C3354t extends C3285i1 {

    /* renamed from: g */
    private final int f10764g;

    protected C3354t(byte[] bArr) {
        C3292l.m14233a(bArr.length == 25);
        this.f10764g = Arrays.hashCode(bArr);
    }

    /* renamed from: f2 */
    protected static byte[] m14421f2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public abstract byte[] mo11985K0();

    public final boolean equals(Object obj) {
        C4863a f;
        if (obj != null && (obj instanceof C3288j1)) {
            try {
                C3288j1 j1Var = (C3288j1) obj;
                if (j1Var.zze() != this.f10764g || (f = j1Var.mo11848f()) == null) {
                    return false;
                }
                return Arrays.equals(mo11985K0(), (byte[]) C4865b.m20502K0(f));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: f */
    public final C4863a mo11848f() {
        return C4865b.m20503f2(mo11985K0());
    }

    public final int hashCode() {
        return this.f10764g;
    }

    public final int zze() {
        return this.f10764g;
    }
}
