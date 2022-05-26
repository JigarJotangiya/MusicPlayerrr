package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3289k;

/* renamed from: com.google.android.gms.common.util.a */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3356a {
    /* renamed from: a */
    public static boolean m14425a(@RecentlyNonNull int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m14426b(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!C3289k.m14227a(tArr[i], t)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m14427c(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    /* renamed from: d */
    public static void m14428d(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    /* renamed from: e */
    public static void m14429e(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    /* renamed from: f */
    public static void m14430f(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    /* renamed from: g */
    public static <T> void m14431g(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i]);
        }
    }

    /* renamed from: h */
    public static void m14432h(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    /* renamed from: i */
    public static void m14433i(@RecentlyNonNull StringBuilder sb, @RecentlyNonNull String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }
}
