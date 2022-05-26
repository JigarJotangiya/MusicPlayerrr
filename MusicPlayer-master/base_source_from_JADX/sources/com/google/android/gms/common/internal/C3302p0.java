package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.p0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C3302p0<TListener> {

    /* renamed from: a */
    private TListener f10649a;

    /* renamed from: b */
    private boolean f10650b = false;

    /* renamed from: c */
    final /* synthetic */ C3261d f10651c;

    public C3302p0(C3261d dVar, TListener tlistener) {
        this.f10651c = dVar;
        this.f10649a = tlistener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11844a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11845b(TListener tlistener);

    /* renamed from: c */
    public final void mo11870c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f10649a;
            if (this.f10650b) {
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Callback proxy ");
                sb.append(valueOf);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo11845b(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f10650b = true;
        }
        mo11871d();
    }

    /* renamed from: d */
    public final void mo11871d() {
        mo11872e();
        synchronized (this.f10651c.f10598r) {
            this.f10651c.f10598r.remove(this);
        }
    }

    /* renamed from: e */
    public final void mo11872e() {
        synchronized (this) {
            this.f10649a = null;
        }
    }
}
