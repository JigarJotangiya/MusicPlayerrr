package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p293c.p297d.C7445a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7447c;

/* renamed from: com.google.android.gms.common.internal.g1 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3278g1 extends C7445a implements C3279h {
    C3278g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: a */
    public final Account mo11843a() throws RemoteException {
        Parcel z = mo28304z(2, mo28302C0());
        Account account = (Account) C7447c.m41838b(z, Account.CREATOR);
        z.recycle();
        return account;
    }
}
