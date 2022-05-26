package com.airbnb.lottie.p026y;

import android.util.Log;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1491i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.y.c */
/* compiled from: LogcatLogger */
public class C1678c implements C1491i {

    /* renamed from: a */
    private static final Set<String> f6313a = new HashSet();

    /* renamed from: a */
    public void mo7112a(String str, Throwable th) {
        if (C1462c.f5612a) {
            Log.d("LOTTIE", str, th);
        }
    }

    /* renamed from: b */
    public void mo7113b(String str) {
        mo7461e(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo7114c(String str, Throwable th) {
        Set<String> set = f6313a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }

    /* renamed from: d */
    public void mo7115d(String str) {
        mo7114c(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo7461e(String str, Throwable th) {
        if (C1462c.f5612a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
