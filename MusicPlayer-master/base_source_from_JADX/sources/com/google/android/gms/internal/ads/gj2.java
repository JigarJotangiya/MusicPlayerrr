package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.util.C3009j1;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class gj2 implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ gj2 f17150a = new gj2();

    private /* synthetic */ gj2() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22298C);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22306D)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, C3009j1.m13369a(str2));
                }
            }
        }
        return new jj2(hashMap);
    }
}
