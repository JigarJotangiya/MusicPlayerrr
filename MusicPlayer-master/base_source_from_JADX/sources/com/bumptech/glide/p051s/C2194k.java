package com.bumptech.glide.p051s;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.p034o.C1946l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.s.k */
/* compiled from: Util */
public final class C2194k {

    /* renamed from: a */
    private static final char[] f7439a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f7440b = new char[64];

    /* renamed from: c */
    private static volatile Handler f7441c;

    /* renamed from: com.bumptech.glide.s.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C2195a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7442a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7442a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7442a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7442a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7442a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7442a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p051s.C2194k.C2195a.<clinit>():void");
        }
    }

    private C2194k() {
    }

    /* renamed from: a */
    public static void m10271a() {
        if (!m10287q()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m10272b() {
        if (!m10288r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m10273c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof C1946l) {
            return ((C1946l) obj).mo8047a(obj2);
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m10274d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    private static String m10275e(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f7439a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static <T> Queue<T> m10276f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m10277g(int i, int i2, Bitmap.Config config) {
        return i * i2 * m10279i(config);
    }

    @TargetApi(19)
    /* renamed from: h */
    public static int m10278h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: i */
    private static int m10279i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C2195a.f7442a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: j */
    public static <T> List<T> m10280j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static Handler m10281k() {
        if (f7441c == null) {
            synchronized (C2194k.class) {
                if (f7441c == null) {
                    f7441c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f7441c;
    }

    /* renamed from: l */
    public static int m10282l(float f) {
        return m10283m(f, 17);
    }

    /* renamed from: m */
    public static int m10283m(float f, int i) {
        return m10284n(Float.floatToIntBits(f), i);
    }

    /* renamed from: n */
    public static int m10284n(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: o */
    public static int m10285o(Object obj, int i) {
        return m10284n(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: p */
    public static int m10286p(boolean z, int i) {
        return m10284n(z ? 1 : 0, i);
    }

    /* renamed from: q */
    public static boolean m10287q() {
        return !m10288r();
    }

    /* renamed from: r */
    public static boolean m10288r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    private static boolean m10289s(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m10290t(int i, int i2) {
        return m10289s(i) && m10289s(i2);
    }

    /* renamed from: u */
    public static void m10291u(Runnable runnable) {
        m10281k().post(runnable);
    }

    /* renamed from: v */
    public static void m10292v(Runnable runnable) {
        m10281k().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m10293w(byte[] bArr) {
        String e;
        char[] cArr = f7440b;
        synchronized (cArr) {
            e = m10275e(bArr, cArr);
        }
        return e;
    }
}
