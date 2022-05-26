package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* renamed from: com.google.android.gms.common.internal.m */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3294m {

    /* renamed from: b */
    private static C3294m f10642b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f10643c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    private RootTelemetryConfiguration f10644a;

    private C3294m() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static synchronized C3294m m14245b() {
        C3294m mVar;
        synchronized (C3294m.class) {
            if (f10642b == null) {
                f10642b = new C3294m();
            }
            mVar = f10642b;
        }
        return mVar;
    }

    @RecentlyNullable
    /* renamed from: a */
    public RootTelemetryConfiguration mo11858a() {
        return this.f10644a;
    }

    /* renamed from: c */
    public final synchronized void mo11859c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f10644a = f10643c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f10644a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.mo11743v0() < rootTelemetryConfiguration.mo11743v0()) {
            this.f10644a = rootTelemetryConfiguration;
        }
    }
}
