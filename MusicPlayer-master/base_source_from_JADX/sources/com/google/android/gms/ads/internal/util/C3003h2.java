package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.nl0;

@TargetApi(24)
/* renamed from: com.google.android.gms.ads.internal.util.h2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C3003h2 extends C2999g2 {
    /* renamed from: t */
    static final boolean m13357t(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    /* renamed from: o */
    public final boolean mo11025o(Activity activity, Configuration configuration) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22447W2)).booleanValue()) {
            return false;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22461Y2)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C4980cv.m22123b();
        int s = nl0.m27927s(activity, configuration.screenHeightDp);
        int s2 = nl0.m27927s(activity, configuration.screenWidthDp);
        C2971s.m13214q();
        DisplayMetrics g0 = C2979b2.m13258g0((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = g0.heightPixels;
        int i2 = g0.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22433U2)).intValue();
        if (!m13357t(i, s + dimensionPixelSize, round) || !m13357t(i2, s2, round)) {
            return true;
        }
        return false;
    }
}
