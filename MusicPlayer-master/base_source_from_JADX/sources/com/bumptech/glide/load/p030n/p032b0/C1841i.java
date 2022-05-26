package com.bumptech.glide.load.p030n.p032b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.n.b0.i */
/* compiled from: MemorySizeCalculator */
public final class C1841i {

    /* renamed from: a */
    private final int f6649a;

    /* renamed from: b */
    private final int f6650b;

    /* renamed from: c */
    private final Context f6651c;

    /* renamed from: d */
    private final int f6652d;

    /* renamed from: com.bumptech.glide.load.n.b0.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C1842a {

        /* renamed from: i */
        static final int f6653i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f6654a;

        /* renamed from: b */
        ActivityManager f6655b;

        /* renamed from: c */
        C1844c f6656c;

        /* renamed from: d */
        float f6657d = 2.0f;

        /* renamed from: e */
        float f6658e = ((float) f6653i);

        /* renamed from: f */
        float f6659f = 0.4f;

        /* renamed from: g */
        float f6660g = 0.33f;

        /* renamed from: h */
        int f6661h = 4194304;

        public C1842a(Context context) {
            this.f6654a = context;
            this.f6655b = (ActivityManager) context.getSystemService("activity");
            this.f6656c = new C1843b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C1841i.m8992e(this.f6655b)) {
                this.f6658e = 0.0f;
            }
        }

        /* renamed from: a */
        public C1841i mo7843a() {
            return new C1841i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C1843b implements C1844c {

        /* renamed from: a */
        private final DisplayMetrics f6662a;

        C1843b(DisplayMetrics displayMetrics) {
            this.f6662a = displayMetrics;
        }

        /* renamed from: a */
        public int mo7844a() {
            return this.f6662a.heightPixels;
        }

        /* renamed from: b */
        public int mo7845b() {
            return this.f6662a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C1844c {
        /* renamed from: a */
        int mo7844a();

        /* renamed from: b */
        int mo7845b();
    }

    C1841i(C1842a aVar) {
        int i;
        this.f6651c = aVar.f6654a;
        if (m8992e(aVar.f6655b)) {
            i = aVar.f6661h / 2;
        } else {
            i = aVar.f6661h;
        }
        this.f6652d = i;
        int c = m8991c(aVar.f6655b, aVar.f6659f, aVar.f6660g);
        float b = (float) (aVar.f6656c.mo7845b() * aVar.f6656c.mo7844a() * 4);
        int round = Math.round(aVar.f6658e * b);
        int round2 = Math.round(b * aVar.f6657d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f6650b = round2;
            this.f6649a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f6658e;
            float f3 = aVar.f6657d;
            float f4 = f / (f2 + f3);
            this.f6650b = Math.round(f3 * f4);
            this.f6649a = Math.round(f4 * aVar.f6658e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m8993f(this.f6650b));
            sb.append(", pool size: ");
            sb.append(m8993f(this.f6649a));
            sb.append(", byte array size: ");
            sb.append(m8993f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(m8993f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f6655b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m8992e(aVar.f6655b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m8991c(ActivityManager activityManager, float f, float f2) {
        boolean e = m8992e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    static boolean m8992e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m8993f(int i) {
        return Formatter.formatFileSize(this.f6651c, (long) i);
    }

    /* renamed from: a */
    public int mo7840a() {
        return this.f6652d;
    }

    /* renamed from: b */
    public int mo7841b() {
        return this.f6649a;
    }

    /* renamed from: d */
    public int mo7842d() {
        return this.f6650b;
    }
}
