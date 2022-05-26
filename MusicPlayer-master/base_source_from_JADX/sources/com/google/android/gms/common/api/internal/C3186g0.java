package com.google.android.gms.common.api.internal;

import android.os.IBinder;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final /* synthetic */ class C3186g0 implements Runnable {

    /* renamed from: g */
    private final C3189i f10402g;

    /* renamed from: h */
    private final IBinder f10403h;

    C3186g0(C3189i iVar, IBinder iBinder) {
        this.f10402g = iVar;
        this.f10403h = iBinder;
    }

    public final void run() {
        this.f10402g.mo11596s(this.f10403h);
    }
}
