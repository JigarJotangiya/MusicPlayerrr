package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public abstract class C3219w0 {

    /* renamed from: a */
    public final int f10458a;

    public C3219w0(int i) {
        this.f10458a = i;
    }

    /* renamed from: e */
    static /* synthetic */ Status m13960e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo11626a(Status status);

    /* renamed from: b */
    public abstract void mo11627b(Exception exc);

    /* renamed from: c */
    public abstract void mo11630c(C3206q qVar, boolean z);

    /* renamed from: d */
    public abstract void mo11628d(C3224z<?> zVar) throws DeadObjectException;
}
