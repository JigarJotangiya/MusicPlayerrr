package com.coocent.videoplayer.p061s;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import p082e.p109h.p117n.C3694f;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.s.b */
/* compiled from: ContextExtensions.kt */
public final class C2722b {
    /* renamed from: a */
    public static final boolean m12313a(Context context) {
        Locale locale;
        C8594l.m46771e(context, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            C8594l.m46770d(locales, "resources.configuration.locales");
            locale = locales.get(0);
            C8594l.m46770d(locale, "{\n        val localeList…      localeList[0]\n    }");
        } else {
            locale = context.getResources().getConfiguration().locale;
            C8594l.m46770d(locale, "{\n        resources.configuration.locale\n    }");
        }
        if (C3694f.m15811b(locale) == 1) {
            return true;
        }
        return false;
    }
}
