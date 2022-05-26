package p082e.p109h.p115l;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: e.h.l.c */
/* compiled from: ConfigurationCompat */
public final class C3646c {
    /* renamed from: a */
    public static C3649e m15705a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C3649e.m15710d(configuration.getLocales());
        }
        return C3649e.m15708a(configuration.locale);
    }
}
