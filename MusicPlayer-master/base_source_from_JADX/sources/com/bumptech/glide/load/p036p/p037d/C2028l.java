package com.bumptech.glide.load.p036p.p037d;

import android.os.Build;
import com.bumptech.glide.load.C1787h;

/* renamed from: com.bumptech.glide.load.p.d.l */
/* compiled from: DownsampleStrategy */
public abstract class C2028l {

    /* renamed from: a */
    public static final C2028l f7037a = new C2031c();

    /* renamed from: b */
    public static final C2028l f7038b = new C2029a();

    /* renamed from: c */
    public static final C2028l f7039c;

    /* renamed from: d */
    public static final C2028l f7040d = new C2032d();

    /* renamed from: e */
    public static final C2028l f7041e;

    /* renamed from: f */
    public static final C1787h<C2028l> f7042f;

    /* renamed from: g */
    static final boolean f7043g = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: com.bumptech.glide.load.p.d.l$a */
    /* compiled from: DownsampleStrategy */
    private static class C2029a extends C2028l {
        C2029a() {
        }

        /* renamed from: a */
        public C2033e mo8122a(int i, int i2, int i3, int i4) {
            if (mo8123b(i, i2, i3, i4) == 1.0f) {
                return C2033e.QUALITY;
            }
            return C2028l.f7037a.mo8122a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo8123b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C2028l.f7037a.mo8123b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$b */
    /* compiled from: DownsampleStrategy */
    private static class C2030b extends C2028l {
        C2030b() {
        }

        /* renamed from: a */
        public C2033e mo8122a(int i, int i2, int i3, int i4) {
            return C2033e.QUALITY;
        }

        /* renamed from: b */
        public float mo8123b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$c */
    /* compiled from: DownsampleStrategy */
    private static class C2031c extends C2028l {
        C2031c() {
        }

        /* renamed from: a */
        public C2033e mo8122a(int i, int i2, int i3, int i4) {
            if (C2028l.f7043g) {
                return C2033e.QUALITY;
            }
            return C2033e.MEMORY;
        }

        /* renamed from: b */
        public float mo8123b(int i, int i2, int i3, int i4) {
            if (C2028l.f7043g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$d */
    /* compiled from: DownsampleStrategy */
    private static class C2032d extends C2028l {
        C2032d() {
        }

        /* renamed from: a */
        public C2033e mo8122a(int i, int i2, int i3, int i4) {
            return C2033e.QUALITY;
        }

        /* renamed from: b */
        public float mo8123b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.l$e */
    /* compiled from: DownsampleStrategy */
    public enum C2033e {
        MEMORY,
        QUALITY
    }

    static {
        C2030b bVar = new C2030b();
        f7039c = bVar;
        f7041e = bVar;
        f7042f = C1787h.m8822f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    /* renamed from: a */
    public abstract C2033e mo8122a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo8123b(int i, int i2, int i3, int i4);
}
