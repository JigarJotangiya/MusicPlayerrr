package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3158b;
import com.google.android.gms.common.api.Status;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
abstract class C3213t0<T> extends C3188h0 {

    /* renamed from: b */
    protected final C7471i<T> f10449b;

    public C3213t0(int i, C7471i<T> iVar) {
        super(i);
        this.f10449b = iVar;
    }

    /* renamed from: a */
    public final void mo11626a(Status status) {
        this.f10449b.mo28355d(new C3158b(status));
    }

    /* renamed from: b */
    public final void mo11627b(Exception exc) {
        this.f10449b.mo28355d(exc);
    }

    /* renamed from: d */
    public final void mo11628d(C3224z<?> zVar) throws DeadObjectException {
        try {
            mo11629h(zVar);
        } catch (DeadObjectException e) {
            mo11626a(C3219w0.m13960e(e));
            throw e;
        } catch (RemoteException e2) {
            mo11626a(C3219w0.m13960e(e2));
        } catch (RuntimeException e3) {
            this.f10449b.mo28355d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo11629h(C3224z<?> zVar) throws RemoteException;
}
