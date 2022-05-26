package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.x */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final /* synthetic */ class C6439x implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C6318a0 f29703g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f29704h;

    /* renamed from: i */
    public final /* synthetic */ AssetPackState f29705i;

    public /* synthetic */ C6439x(C6318a0 a0Var, Bundle bundle, AssetPackState assetPackState) {
        this.f29703g = a0Var;
        this.f29704h = bundle;
        this.f29705i = assetPackState;
    }

    public final void run() {
        this.f29703g.mo25196i(this.f29704h, this.f29705i);
    }
}
