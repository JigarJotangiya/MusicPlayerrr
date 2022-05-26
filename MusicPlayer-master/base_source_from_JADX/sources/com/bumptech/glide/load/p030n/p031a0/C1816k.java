package com.bumptech.glide.load.p030n.p031a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.n.a0.k */
/* compiled from: LruBitmapPool */
public class C1816k implements C1807e {

    /* renamed from: j */
    private static final Bitmap.Config f6612j = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C1819l f6613a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f6614b;

    /* renamed from: c */
    private final C1817a f6615c;

    /* renamed from: d */
    private long f6616d;

    /* renamed from: e */
    private long f6617e;

    /* renamed from: f */
    private int f6618f;

    /* renamed from: g */
    private int f6619g;

    /* renamed from: h */
    private int f6620h;

    /* renamed from: i */
    private int f6621i;

    /* renamed from: com.bumptech.glide.load.n.a0.k$a */
    /* compiled from: LruBitmapPool */
    private interface C1817a {
        /* renamed from: a */
        void mo7812a(Bitmap bitmap);

        /* renamed from: b */
        void mo7813b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.n.a0.k$b */
    /* compiled from: LruBitmapPool */
    private static final class C1818b implements C1817a {
        C1818b() {
        }

        /* renamed from: a */
        public void mo7812a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo7813b(Bitmap bitmap) {
        }
    }

    C1816k(long j, C1819l lVar, Set<Bitmap.Config> set) {
        this.f6616d = j;
        this.f6613a = lVar;
        this.f6614b = set;
        this.f6615c = new C1818b();
    }

    @TargetApi(26)
    /* renamed from: f */
    private static void m8918f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m8919g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f6612j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m8920h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m8921i();
        }
    }

    /* renamed from: i */
    private void m8921i() {
        Log.v("LruBitmapPool", "Hits=" + this.f6618f + ", misses=" + this.f6619g + ", puts=" + this.f6620h + ", evictions=" + this.f6621i + ", currentSize=" + this.f6617e + ", maxSize=" + this.f6616d + "\nStrategy=" + this.f6613a);
    }

    /* renamed from: j */
    private void m8922j() {
        m8928q(this.f6616d);
    }

    @TargetApi(26)
    /* renamed from: k */
    private static Set<Bitmap.Config> m8923k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            hashSet.add((Object) null);
        }
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static C1819l m8924l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C1821n();
        }
        return new C1803c();
    }

    /* renamed from: m */
    private synchronized Bitmap m8925m(int i, int i2, Bitmap.Config config) {
        Bitmap d;
        m8918f(config);
        d = this.f6613a.mo7775d(i, i2, config != null ? config : f6612j);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f6613a.mo7772a(i, i2, config));
            }
            this.f6619g++;
        } else {
            this.f6618f++;
            this.f6617e -= (long) this.f6613a.mo7773b(d);
            this.f6615c.mo7812a(d);
            m8927p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f6613a.mo7772a(i, i2, config));
        }
        m8920h();
        return d;
    }

    @TargetApi(19)
    /* renamed from: o */
    private static void m8926o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    private static void m8927p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m8926o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m8928q(long j) {
        while (this.f6617e > j) {
            Bitmap removeLast = this.f6613a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m8921i();
                }
                this.f6617e = 0;
                return;
            }
            this.f6615c.mo7812a(removeLast);
            this.f6617e -= (long) this.f6613a.mo7773b(removeLast);
            this.f6621i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f6613a.mo7776e(removeLast));
            }
            m8920h();
            removeLast.recycle();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo7789a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo7790b();
        } else if (i >= 20 || i == 15) {
            m8928q(mo7811n() / 2);
        }
    }

    /* renamed from: b */
    public void mo7790b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m8928q(0);
    }

    /* renamed from: c */
    public synchronized void mo7791c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f6613a.mo7773b(bitmap)) <= this.f6616d) {
                        if (this.f6614b.contains(bitmap.getConfig())) {
                            int b = this.f6613a.mo7773b(bitmap);
                            this.f6613a.mo7774c(bitmap);
                            this.f6615c.mo7813b(bitmap);
                            this.f6620h++;
                            this.f6617e += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f6613a.mo7776e(bitmap));
                            }
                            m8920h();
                            m8922j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f6613a.mo7776e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f6614b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: d */
    public Bitmap mo7792d(int i, int i2, Bitmap.Config config) {
        Bitmap m = m8925m(i, i2, config);
        if (m == null) {
            return m8919g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    /* renamed from: e */
    public Bitmap mo7793e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m8925m(i, i2, config);
        return m == null ? m8919g(i, i2, config) : m;
    }

    /* renamed from: n */
    public long mo7811n() {
        return this.f6616d;
    }

    public C1816k(long j) {
        this(j, m8924l(), m8923k());
    }
}
