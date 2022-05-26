package com.google.android.gms.ads.p068a0.p069a;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.o83;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.a0.a.e0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2861e0 implements o83<C2870j> {

    /* renamed from: a */
    final /* synthetic */ C2863f0 f9689a;

    C2861e0(C2863f0 f0Var) {
        this.f9689a = f0Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10677a(Object obj) {
        C2870j jVar = (C2870j) obj;
        ul0.m31857b("Initialized webview successfully for SDKCore.");
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        C2971s.m13213p().mo17571s(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        C2863f0.m12859G7(this.f9689a, "sgf", "sgf_reason", th.getMessage());
        ul0.m31860e("Failed to initialize webview for loading SDKCore. ", th);
    }
}
