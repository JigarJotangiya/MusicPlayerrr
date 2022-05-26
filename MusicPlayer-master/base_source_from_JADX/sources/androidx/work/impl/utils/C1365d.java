package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C1405l;

/* renamed from: androidx.work.impl.utils.d */
/* compiled from: PackageManagerHelper */
public class C1365d {

    /* renamed from: a */
    private static final String f5368a = C1405l.m7462f("PackageManagerHelper");

    /* renamed from: a */
    public static void m7382a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C1405l c = C1405l.m7460c();
            String str3 = f5368a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c.mo6816a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C1405l c2 = C1405l.m7460c();
            String str4 = f5368a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c2.mo6816a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
