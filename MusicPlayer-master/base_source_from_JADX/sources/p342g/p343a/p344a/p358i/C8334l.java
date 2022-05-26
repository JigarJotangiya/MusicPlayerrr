package p342g.p343a.p344a.p358i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: g.a.a.i.l */
/* compiled from: IsInternetUtils */
public class C8334l {
    /* renamed from: a */
    public static boolean m46054a(Context context) {
        NetworkInfo[] allNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
            for (NetworkInfo state : allNetworkInfo) {
                if (state.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }
}
