package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bm2 {
    /* renamed from: a */
    public static <T> void m21449a(AtomicReference<T> atomicReference, am2<T> am2) {
        T t = atomicReference.get();
        if (t != null) {
            try {
                am2.mo15878b(t);
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            } catch (NullPointerException e2) {
                ul0.m31863h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
            }
        }
    }
}
