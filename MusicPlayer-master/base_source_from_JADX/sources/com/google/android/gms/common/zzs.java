package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3285i1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C3236b0();

    /* renamed from: g */
    private final String f10788g;

    /* renamed from: h */
    private final C3354t f10789h;

    /* renamed from: i */
    private final boolean f10790i;

    /* renamed from: j */
    private final boolean f10791j;

    zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f10788g = str;
        C3355u uVar = null;
        if (iBinder != null) {
            try {
                C4863a f = C3285i1.m14222C0(iBinder).mo11848f();
                if (f == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C4865b.m20502K0(f);
                }
                if (bArr != null) {
                    uVar = new C3355u(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f10789h = uVar;
        this.f10790i = z;
        this.f10791j = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f10788g, false);
        C3354t tVar = this.f10789h;
        if (tVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            tVar = null;
        }
        C3315b.m14315g(parcel, 2, tVar, false);
        C3315b.m14311c(parcel, 3, this.f10790i);
        C3315b.m14311c(parcel, 4, this.f10791j);
        C3315b.m14310b(parcel, a);
    }
}
