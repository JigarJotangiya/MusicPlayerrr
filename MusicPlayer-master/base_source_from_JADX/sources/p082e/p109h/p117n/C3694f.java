package p082e.p109h.p117n;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.h.n.f */
/* compiled from: TextUtilsCompat */
public final class C3694f {

    /* renamed from: a */
    private static final Locale f11710a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* renamed from: a */
    private static int m15810a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m15811b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f11710a)) {
            return 0;
        }
        String c = C3682b.m15787c(locale);
        if (c == null) {
            return m15810a(locale);
        }
        return (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
