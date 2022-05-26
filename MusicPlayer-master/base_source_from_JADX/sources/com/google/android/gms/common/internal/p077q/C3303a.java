package com.google.android.gms.common.internal.p077q;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;
import p159f.p243f.p245b.p246a.p293c.p296c.C7439a;
import p159f.p243f.p245b.p246a.p293c.p296c.C7441c;

/* renamed from: com.google.android.gms.common.internal.q.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3303a extends C7439a implements IInterface {
    C3303a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: l3 */
    public final void mo11873l3(TelemetryData telemetryData) throws RemoteException {
        Parcel z = mo28299z();
        C7441c.m41832b(z, telemetryData);
        mo28298f2(1, z);
    }
}
