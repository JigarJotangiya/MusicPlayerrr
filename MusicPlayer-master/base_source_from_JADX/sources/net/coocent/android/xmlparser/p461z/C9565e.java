package net.coocent.android.xmlparser.p461z;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: net.coocent.android.xmlparser.z.e */
/* compiled from: NetworkUtils */
public class C9565e {
    /* renamed from: a */
    public static boolean m50189a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
            return true;
        }
        return false;
    }
}
