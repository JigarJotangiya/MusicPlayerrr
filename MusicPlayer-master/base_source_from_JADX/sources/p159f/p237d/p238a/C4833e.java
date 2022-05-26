package p159f.p237d.p238a;

import android.os.Build;
import p159f.p237d.p238a.C4825c;

/* renamed from: f.d.a.e */
/* compiled from: SystemLibraryLoader */
final class C4833e implements C4825c.C4827b {
    C4833e() {
    }

    /* renamed from: a */
    public String mo15568a(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }

    /* renamed from: b */
    public void mo15569b(String str) {
        System.loadLibrary(str);
    }

    /* renamed from: c */
    public String mo15570c(String str) {
        return str.substring(3, str.length() - 3);
    }

    /* renamed from: d */
    public String[] mo15571d() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        String str = Build.CPU_ABI2;
        if (!C4834f.m20473a(str)) {
            return new String[]{Build.CPU_ABI, str};
        }
        return new String[]{Build.CPU_ABI};
    }

    /* renamed from: e */
    public void mo15572e(String str) {
        System.load(str);
    }
}
