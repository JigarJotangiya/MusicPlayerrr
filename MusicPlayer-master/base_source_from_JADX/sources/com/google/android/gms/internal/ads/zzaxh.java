package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaxh extends Surface {

    /* renamed from: i */
    private static boolean f27165i;

    /* renamed from: j */
    private static boolean f27166j;

    /* renamed from: g */
    private final C5045em f27167g;

    /* renamed from: h */
    private boolean f27168h;

    /* synthetic */ zzaxh(C5045em emVar, SurfaceTexture surfaceTexture, boolean z, C5083fm fmVar) {
        super(surfaceTexture);
        this.f27167g = emVar;
    }

    /* renamed from: a */
    public static zzaxh m34936a(Context context, boolean z) {
        if (C4934bm.f14552a >= 17) {
            boolean z2 = true;
            if (z && !m34937b(context)) {
                z2 = false;
            }
            C5304ll.m26776e(z2);
            return new C5045em().mo17213a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* renamed from: b */
    public static synchronized boolean m34937b(Context context) {
        boolean z;
        synchronized (zzaxh.class) {
            if (!f27166j) {
                int i = C4934bm.f14552a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = C4934bm.f14555d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    f27165i = z2;
                }
                f27166j = true;
            }
            z = f27165i;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f27167g) {
            if (!this.f27168h) {
                this.f27167g.mo17214b();
                this.f27168h = true;
            }
        }
    }
}
