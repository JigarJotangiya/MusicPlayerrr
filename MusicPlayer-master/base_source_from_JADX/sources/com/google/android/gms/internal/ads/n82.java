package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n82 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, bd0> f20547a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final br1 f20548b;

    public n82(br1 br1) {
        this.f20548b = br1;
    }

    /* renamed from: a */
    public final bd0 mo19653a(String str) {
        if (this.f20547a.containsKey(str)) {
            return this.f20547a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo19654b(String str) {
        try {
            this.f20547a.put(str, this.f20548b.mo16360a(str));
        } catch (RemoteException e) {
            ul0.m31860e("Couldn't create RTB adapter : ", e);
        }
    }
}
