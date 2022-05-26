package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public abstract class C5867o0 extends C5876u implements C5869p0 {
    /* renamed from: C0 */
    public static C5869p0 m35081C0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof C5869p0) {
            return (C5869p0) queryLocalInterface;
        }
        return new C5865n0(iBinder);
    }
}
