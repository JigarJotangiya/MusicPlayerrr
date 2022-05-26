package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.C3049x;

/* renamed from: com.google.android.gms.ads.internal.overlay.i */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2950i extends RelativeLayout {

    /* renamed from: g */
    final C3049x f9872g;

    /* renamed from: h */
    boolean f9873h;

    public C2950i(Context context, String str, String str2, String str3) {
        super(context);
        C3049x xVar = new C3049x(context, str);
        this.f9872g = xVar;
        xVar.mo11140o(str2);
        xVar.mo11139n(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9873h) {
            return false;
        }
        this.f9872g.mo11138m(motionEvent);
        return false;
    }
}
