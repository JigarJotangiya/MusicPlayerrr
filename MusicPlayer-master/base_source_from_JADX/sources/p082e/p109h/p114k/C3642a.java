package p082e.p109h.p114k;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: e.h.k.a */
/* compiled from: ConnectivityManagerCompat */
public final class C3642a {
    /* renamed from: a */
    public static boolean m15696a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 7 || type == 9) {
            return false;
        }
        return true;
    }
}
