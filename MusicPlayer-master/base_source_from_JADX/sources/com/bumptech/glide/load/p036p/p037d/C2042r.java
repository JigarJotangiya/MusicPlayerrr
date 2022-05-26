package com.bumptech.glide.load.p036p.p037d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.p.d.r */
/* compiled from: HardwareConfigState */
public final class C2042r {

    /* renamed from: g */
    public static final boolean f7062g;

    /* renamed from: h */
    public static final boolean f7063h;

    /* renamed from: i */
    private static final File f7064i = new File("/proc/self/fd");

    /* renamed from: j */
    private static volatile C2042r f7065j;

    /* renamed from: k */
    private static volatile int f7066k = -1;

    /* renamed from: a */
    private final boolean f7067a = m9592f();

    /* renamed from: b */
    private final int f7068b;

    /* renamed from: c */
    private final int f7069c;

    /* renamed from: d */
    private int f7070d;

    /* renamed from: e */
    private boolean f7071e = true;

    /* renamed from: f */
    private final AtomicBoolean f7072f = new AtomicBoolean(false);

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f7062g = i < 29;
        if (i < 26) {
            z = false;
        }
        f7063h = z;
    }

    C2042r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7068b = 20000;
            this.f7069c = 0;
            return;
        }
        this.f7068b = 700;
        this.f7069c = 128;
    }

    /* renamed from: a */
    private boolean m9588a() {
        return f7062g && !this.f7072f.get();
    }

    /* renamed from: b */
    public static C2042r m9589b() {
        if (f7065j == null) {
            synchronized (C2042r.class) {
                if (f7065j == null) {
                    f7065j = new C2042r();
                }
            }
        }
        return f7065j;
    }

    /* renamed from: c */
    private int m9590c() {
        if (f7066k != -1) {
            return f7066k;
        }
        return this.f7068b;
    }

    /* renamed from: d */
    private synchronized boolean m9591d() {
        boolean z = true;
        int i = this.f7070d + 1;
        this.f7070d = i;
        if (i >= 50) {
            this.f7070d = 0;
            int length = f7064i.list().length;
            long c = (long) m9590c();
            if (((long) length) >= c) {
                z = false;
            }
            this.f7071e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c);
            }
        }
        return this.f7071e;
    }

    /* renamed from: f */
    private static boolean m9592f() {
        return !m9593g() && !m9594h();
    }

    /* renamed from: g */
    private static boolean m9593g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m9594h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    /* renamed from: e */
    public boolean mo8133e(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f7067a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f7063h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (m9588a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.f7069c;
            if (i < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (m9591d()) {
                return true;
            } else {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: i */
    public boolean mo8134i(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean e = mo8133e(i, i2, z, z2);
        if (e) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e;
    }
}
