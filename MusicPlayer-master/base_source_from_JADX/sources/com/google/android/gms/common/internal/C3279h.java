package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import p159f.p243f.p245b.p246a.p293c.p297d.C7446b;

/* renamed from: com.google.android.gms.common.internal.h */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public interface C3279h extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.h$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class C3280a extends C7446b implements C3279h {
        @RecentlyNonNull
        /* renamed from: C0 */
        public static C3279h m14212C0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C3279h) {
                return (C3279h) queryLocalInterface;
            }
            return new C3278g1(iBinder);
        }
    }

    @RecentlyNonNull
    /* renamed from: a */
    Account mo11843a() throws RemoteException;
}
