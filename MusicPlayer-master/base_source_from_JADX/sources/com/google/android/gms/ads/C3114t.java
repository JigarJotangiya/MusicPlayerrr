package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C5427ox;
import com.google.android.gms.internal.ads.C5724wy;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.t */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C3114t {

    /* renamed from: a */
    private final Object f10208a = new Object();

    /* renamed from: b */
    private C5427ox f10209b;

    /* renamed from: c */
    private C3115a f10210c;

    /* renamed from: com.google.android.gms.ads.t$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static abstract class C3115a {
        /* renamed from: a */
        public void mo11363a() {
        }

        /* renamed from: b */
        public void mo11364b(boolean z) {
        }

        /* renamed from: c */
        public void mo11365c() {
        }

        /* renamed from: d */
        public void mo11366d() {
        }

        /* renamed from: e */
        public void mo11367e() {
        }
    }

    /* renamed from: a */
    public void mo11359a(boolean z) {
        synchronized (this.f10208a) {
            C5427ox oxVar = this.f10209b;
            if (oxVar != null) {
                try {
                    oxVar.mo15828b2(z);
                } catch (RemoteException e) {
                    ul0.m31860e("Unable to call mute on video controller.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo11360b(C3115a aVar) {
        C5724wy wyVar;
        synchronized (this.f10208a) {
            this.f10210c = aVar;
            C5427ox oxVar = this.f10209b;
            if (oxVar != null) {
                if (aVar == null) {
                    wyVar = null;
                } else {
                    try {
                        wyVar = new C5724wy(aVar);
                    } catch (RemoteException e) {
                        ul0.m31860e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        return;
                    }
                }
                oxVar.mo15838o3(wyVar);
            }
        }
    }

    /* renamed from: c */
    public final C5427ox mo11361c() {
        C5427ox oxVar;
        synchronized (this.f10208a) {
            oxVar = this.f10209b;
        }
        return oxVar;
    }

    /* renamed from: d */
    public final void mo11362d(C5427ox oxVar) {
        synchronized (this.f10208a) {
            this.f10209b = oxVar;
            C3115a aVar = this.f10210c;
            if (aVar != null) {
                mo11360b(aVar);
            }
        }
    }
}
