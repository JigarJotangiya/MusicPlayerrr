package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class cv1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ mv1 f15352g;

    /* renamed from: h */
    public final /* synthetic */ o70 f15353h;

    public /* synthetic */ cv1(mv1 mv1, o70 o70) {
        this.f15352g = mv1;
        this.f15353h = o70;
    }

    public final void run() {
        mv1 mv1 = this.f15352g;
        try {
            this.f15353h.mo16424d5(mv1.mo19553f());
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
