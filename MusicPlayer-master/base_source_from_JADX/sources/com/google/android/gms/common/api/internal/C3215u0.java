package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.Status;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3215u0<ResultT> extends C3188h0 {

    /* renamed from: b */
    private final C3199n<C3147a.C3149b, ResultT> f10451b;

    /* renamed from: c */
    private final C7471i<ResultT> f10452c;

    /* renamed from: d */
    private final C3197m f10453d;

    public C3215u0(int i, C3199n<C3147a.C3149b, ResultT> nVar, C7471i<ResultT> iVar, C3197m mVar) {
        super(i);
        this.f10452c = iVar;
        this.f10451b = nVar;
        this.f10453d = mVar;
        if (i == 2 && nVar.mo11607c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo11626a(Status status) {
        this.f10452c.mo28355d(this.f10453d.mo11547a(status));
    }

    /* renamed from: b */
    public final void mo11627b(Exception exc) {
        this.f10452c.mo28355d(exc);
    }

    /* renamed from: c */
    public final void mo11630c(C3206q qVar, boolean z) {
        qVar.mo11619a(this.f10452c, z);
    }

    /* renamed from: d */
    public final void mo11628d(C3224z<?> zVar) throws DeadObjectException {
        try {
            this.f10451b.mo11606b(zVar.mo11649s(), this.f10452c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo11626a(C3219w0.m13960e(e2));
        } catch (RuntimeException e3) {
            this.f10452c.mo28355d(e3);
        }
    }

    /* renamed from: f */
    public final Feature[] mo11590f(C3224z<?> zVar) {
        return this.f10451b.mo11608d();
    }

    /* renamed from: g */
    public final boolean mo11591g(C3224z<?> zVar) {
        return this.f10451b.mo11607c();
    }
}
