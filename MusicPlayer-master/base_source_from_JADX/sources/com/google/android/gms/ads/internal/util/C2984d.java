package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import java.util.Locale;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(28)
/* renamed from: com.google.android.gms.ads.internal.util.d */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2984d extends C2976b {
    /* renamed from: u */
    static final /* synthetic */ WindowInsets m13310u(Activity activity, View view, WindowInsets windowInsets) {
        if (C2971s.m13213p().mo17562h().mo11096j() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = BuildConfig.FLAVOR;
            if (displayCutout != null) {
                C3024o1 h = C2971s.m13213p().mo17562h();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                h.mo11070O(str);
            } else {
                C2971s.m13213p().mo17562h().mo11070O(str);
            }
        }
        m13311v(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: v */
    private static final void m13311v(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: q */
    public final void mo11007q(Activity activity) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22375M0)).booleanValue() && C2971s.m13213p().mo17562h().mo11096j() == null && !activity.isInMultiWindowMode()) {
            m13311v(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C2980c(this, activity));
        }
    }
}
