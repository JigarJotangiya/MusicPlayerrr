package p159f.p166c.p181e.p182a.p183a.p189f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.f.d */
/* compiled from: IsInternetUtils.kt */
public final class C4439d {

    /* renamed from: a */
    public static final C4440a f13014a = new C4440a((C8589g) null);

    /* renamed from: f.c.e.a.a.f.d$a */
    /* compiled from: IsInternetUtils.kt */
    public static final class C4440a {
        private C4440a() {
        }

        /* renamed from: a */
        public final boolean mo15096a(Context context) {
            C8594l.m46771e(context, "context");
            Object systemService = context.getSystemService("connectivity");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo[] allNetworkInfo = ((ConnectivityManager) systemService).getAllNetworkInfo();
            C8594l.m46770d(allNetworkInfo, "connectivityManager.allNetworkInfo");
            for (NetworkInfo networkInfo : allNetworkInfo) {
                C8594l.m46770d(networkInfo, "netInfo[i]");
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ C4440a(C8589g gVar) {
            this();
        }
    }
}
