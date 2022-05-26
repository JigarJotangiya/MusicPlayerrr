package com.bumptech.glide.load.p036p.p037d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C1745b;
import com.bumptech.glide.load.C1787h;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1791j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.p037d.C2028l;
import com.bumptech.glide.load.p036p.p037d.C2043s;
import com.bumptech.glide.p051s.C2188f;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.bumptech.glide.load.p.d.m */
/* compiled from: Downsampler */
public final class C2034m {

    /* renamed from: f */
    public static final C1787h<C1745b> f7045f = C1787h.m8822f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C1745b.DEFAULT);

    /* renamed from: g */
    public static final C1787h<C1791j> f7046g = C1787h.m8822f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C1791j.SRGB);

    /* renamed from: h */
    public static final C1787h<Boolean> f7047h;

    /* renamed from: i */
    public static final C1787h<Boolean> f7048i;

    /* renamed from: j */
    private static final Set<String> f7049j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    private static final C2036b f7050k = new C2035a();

    /* renamed from: l */
    private static final Set<ImageHeaderParser.ImageType> f7051l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m */
    private static final Queue<BitmapFactory.Options> f7052m = C2194k.m10276f(0);

    /* renamed from: a */
    private final C1807e f7053a;

    /* renamed from: b */
    private final DisplayMetrics f7054b;

    /* renamed from: c */
    private final C1802b f7055c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f7056d;

    /* renamed from: e */
    private final C2042r f7057e = C2042r.m9589b();

    /* renamed from: com.bumptech.glide.load.p.d.m$a */
    /* compiled from: Downsampler */
    class C2035a implements C2036b {
        C2035a() {
        }

        /* renamed from: a */
        public void mo8130a(C1807e eVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo8131b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.m$b */
    /* compiled from: Downsampler */
    public interface C2036b {
        /* renamed from: a */
        void mo8130a(C1807e eVar, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo8131b();
    }

    static {
        C1787h<C2028l> hVar = C2028l.f7042f;
        Boolean bool = Boolean.FALSE;
        f7047h = C1787h.m8822f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f7048i = C1787h.m8822f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C2034m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C1807e eVar, C1802b bVar) {
        this.f7056d = list;
        C2193j.m10269d(displayMetrics);
        this.f7054b = displayMetrics;
        C2193j.m10269d(eVar);
        this.f7053a = eVar;
        C2193j.m10269d(bVar);
        this.f7055c = bVar;
    }

    /* renamed from: a */
    private static int m9546a(double d) {
        int l = m9554l(d);
        int x = m9563x(((double) l) * d);
        return m9563x((d / ((double) (((float) x) / ((float) l)))) * ((double) x));
    }

    /* renamed from: b */
    private void m9547b(C2043s sVar, C1745b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f7057e.mo8134i(i, i2, options, z, z2)) {
            if (bVar == C1745b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = sVar.mo8138d().hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: c */
    private static void m9548c(ImageHeaderParser.ImageType imageType, C2043s sVar, C2036b bVar, C1807e eVar, C2028l lVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C2028l lVar2 = lVar;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        BitmapFactory.Options options2 = options;
        if (i12 <= 0 || i13 <= 0) {
            String str = "Downsampler";
            String str2 = "x";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to determine dimensions for: " + imageType2 + " with target [" + i14 + str2 + i15 + "]");
                return;
            }
            return;
        }
        if (m9557r(i)) {
            i6 = i12;
            i7 = i13;
        } else {
            i7 = i12;
            i6 = i13;
        }
        float b = lVar2.mo8123b(i7, i6, i14, i15);
        if (b > 0.0f) {
            C2028l.C2033e a = lVar2.mo8122a(i7, i6, i14, i15);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int x = i7 / m9563x((double) (b * f));
                int x2 = i6 / m9563x((double) (b * f2));
                C2028l.C2033e eVar2 = C2028l.C2033e.MEMORY;
                if (a == eVar2) {
                    i8 = Math.max(x, x2);
                } else {
                    i8 = Math.min(x, x2);
                }
                int i16 = Build.VERSION.SDK_INT;
                String str3 = "x";
                String str4 = "Downsampler";
                if (i16 > 23 || !f7049j.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == eVar2 && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    i9 = max;
                } else {
                    i9 = 1;
                }
                options2.inSampleSize = i9;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i9, 8);
                    i10 = (int) Math.ceil((double) (f / min));
                    i11 = (int) Math.ceil((double) (f2 / min));
                    int i17 = i9 / 8;
                    if (i17 > 0) {
                        i10 /= i17;
                        i11 /= i17;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = (float) i9;
                        i10 = (int) Math.floor((double) (f / f3));
                        d = Math.floor((double) (f2 / f3));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        if (i16 >= 24) {
                            float f4 = (float) i9;
                            i10 = Math.round(f / f4);
                            i11 = Math.round(f2 / f4);
                        } else {
                            float f5 = (float) i9;
                            i10 = (int) Math.floor((double) (f / f5));
                            d = Math.floor((double) (f2 / f5));
                        }
                    } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                        i10 = i7 / i9;
                        i11 = i6 / i9;
                    } else {
                        int[] m = m9555m(sVar, options2, bVar, eVar);
                        i10 = m[0];
                        i11 = m[1];
                    }
                    i11 = (int) d;
                }
                double b2 = (double) lVar2.mo8123b(i10, i11, i14, i15);
                if (i16 >= 19) {
                    options2.inTargetDensity = m9546a(b2);
                    options2.inDensity = m9554l(b2);
                }
                if (m9558s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                String str5 = str4;
                if (Log.isLoggable(str5, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculate scaling, source: [");
                    sb.append(i2);
                    String str6 = str3;
                    sb.append(str6);
                    sb.append(i3);
                    sb.append("], degreesToRotate: ");
                    sb.append(i);
                    sb.append(", target: [");
                    sb.append(i14);
                    sb.append(str6);
                    sb.append(i15);
                    sb.append("], power of two scaled: [");
                    sb.append(i10);
                    sb.append(str6);
                    sb.append(i11);
                    sb.append("], exact scale factor: ");
                    sb.append(b);
                    sb.append(", power of 2 sample size: ");
                    sb.append(i9);
                    sb.append(", adjusted scale factor: ");
                    sb.append(b2);
                    sb.append(", target density: ");
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    Log.v(str5, sb.toString());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i18 = i12;
        String str7 = "x";
        throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + lVar2 + ", source: [" + i18 + str7 + i13 + "], target: [" + i14 + str7 + i15 + "]");
    }

    /* renamed from: e */
    private C1902v<Bitmap> m9549e(C2043s sVar, int i, int i2, C1790i iVar, C2036b bVar) throws IOException {
        C1790i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f7055c.mo7771e(65536, byte[].class);
        BitmapFactory.Options k = m9553k();
        k.inTempStorage = bArr;
        C1745b bVar2 = (C1745b) iVar2.mo7744c(f7045f);
        C1791j jVar = (C1791j) iVar2.mo7744c(f7046g);
        C2028l lVar = (C2028l) iVar2.mo7744c(C2028l.f7042f);
        boolean booleanValue = ((Boolean) iVar2.mo7744c(f7047h)).booleanValue();
        C1787h hVar = f7048i;
        try {
            return C2016e.m9488f(m9550h(sVar, k, lVar, bVar2, jVar, iVar2.mo7744c(hVar) != null && ((Boolean) iVar2.mo7744c(hVar)).booleanValue(), i, i2, booleanValue, bVar), this.f7053a);
        } finally {
            m9561v(k);
            this.f7055c.mo7770d(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m9550h(C2043s sVar, BitmapFactory.Options options, C2028l lVar, C1745b bVar, C1791j jVar, boolean z, int i, int i2, boolean z2, C2036b bVar2) throws IOException {
        int i3;
        int i4;
        C2034m mVar;
        int i5;
        ColorSpace colorSpace;
        int i6;
        int i7;
        BitmapFactory.Options options2 = options;
        C2036b bVar3 = bVar2;
        long b = C2188f.m10253b();
        int[] m = m9555m(sVar, options2, bVar3, this.f7053a);
        boolean z3 = false;
        int i8 = m[0];
        int i9 = m[1];
        String str = options2.outMimeType;
        boolean z4 = (i8 == -1 || i9 == -1) ? false : z;
        int a = sVar.mo8135a();
        int g = C2054z.m9643g(a);
        boolean j = C2054z.m9646j(a);
        int i10 = i;
        if (i10 == Integer.MIN_VALUE) {
            i4 = i2;
            i3 = m9557r(g) ? i9 : i8;
        } else {
            i4 = i2;
            i3 = i10;
        }
        int i11 = i4 == Integer.MIN_VALUE ? m9557r(g) ? i8 : i9 : i4;
        ImageHeaderParser.ImageType d = sVar.mo8138d();
        C1807e eVar = this.f7053a;
        ImageHeaderParser.ImageType imageType = d;
        m9548c(d, sVar, bVar2, eVar, lVar, g, i8, i9, i3, i11, options);
        int i12 = a;
        String str2 = str;
        int i13 = i9;
        int i14 = i8;
        C2036b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        m9547b(sVar, bVar, z4, j, options, i3, i11);
        int i15 = Build.VERSION.SDK_INT;
        boolean z5 = i15 >= 19;
        if (options3.inSampleSize == 1 || z5) {
            mVar = this;
            if (mVar.m9565z(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z5) {
                    float f = m9558s(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i16 = options3.inSampleSize;
                    float f2 = (float) i16;
                    float f3 = f;
                    i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f3);
                    i6 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f3);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + i7 + "x" + i6 + "] for source [" + i14 + "x" + i13 + "], sampleSize: " + i16 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f3);
                    }
                } else {
                    i7 = i3;
                    i6 = i11;
                }
                if (i7 > 0 && i6 > 0) {
                    m9564y(options3, mVar.f7053a, i7, i6);
                }
            }
        } else {
            mVar = this;
        }
        if (i15 >= 28) {
            if (jVar == C1791j.DISPLAY_P3 && (colorSpace = options3.outColorSpace) != null && colorSpace.isWideGamut()) {
                z3 = true;
            }
            options3.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i15 >= 26) {
            options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i17 = m9551i(sVar, options3, bVar4, mVar.f7053a);
        bVar4.mo8130a(mVar.f7053a, i17);
        if (Log.isLoggable("Downsampler", 2)) {
            i5 = i12;
            m9559t(i14, i13, str2, options, i17, i, i2, b);
        } else {
            i5 = i12;
        }
        Bitmap bitmap = null;
        if (i17 != null) {
            i17.setDensity(mVar.f7054b.densityDpi);
            bitmap = C2054z.m9647k(mVar.f7053a, i17, i5);
            if (!i17.equals(bitmap)) {
                mVar.f7053a.mo7791c(i17);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m9551i(com.bumptech.glide.load.p036p.p037d.C2043s r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.p036p.p037d.C2034m.C2036b r7, com.bumptech.glide.load.p030n.p031a0.C1807e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo8131b()
            r5.mo8137c()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p036p.p037d.C2054z.m9642f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo8136b(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p036p.p037d.C2054z.m9642f()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m9560u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.mo7791c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = m9551i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p036p.p037d.C2054z.m9642f()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p036p.p037d.C2054z.m9642f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p036p.p037d.C2034m.m9551i(com.bumptech.glide.load.p.d.s, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.p.d.m$b, com.bumptech.glide.load.n.a0.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: j */
    private static String m9552j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = BuildConfig.FLAVOR;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m9553k() {
        BitmapFactory.Options poll;
        synchronized (C2034m.class) {
            Queue<BitmapFactory.Options> queue = f7052m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m9562w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    private static int m9554l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m9555m(C2043s sVar, BitmapFactory.Options options, C2036b bVar, C1807e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m9551i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m9556n(BitmapFactory.Options options) {
        return m9552j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m9557r(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m9558s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p036p.p037d.C2034m.m9558s(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: t */
    private static void m9559t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m9552j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m9556n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C2188f.m10252a(j));
    }

    /* renamed from: u */
    private static IOException m9560u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m9556n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m9561v(BitmapFactory.Options options) {
        m9562w(options);
        Queue<BitmapFactory.Options> queue = f7052m;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m9562w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m9563x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    private static void m9564y(BitmapFactory.Options options, C1807e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo7793e(i, i2, config);
    }

    /* renamed from: z */
    private boolean m9565z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f7051l.contains(imageType);
    }

    /* renamed from: d */
    public C1902v<Bitmap> mo8124d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C1790i iVar) throws IOException {
        return m9549e(new C2043s.C2045b(parcelFileDescriptor, this.f7056d, this.f7055c), i, i2, iVar, f7050k);
    }

    /* renamed from: f */
    public C1902v<Bitmap> mo8125f(InputStream inputStream, int i, int i2, C1790i iVar) throws IOException {
        return mo8126g(inputStream, i, i2, iVar, f7050k);
    }

    /* renamed from: g */
    public C1902v<Bitmap> mo8126g(InputStream inputStream, int i, int i2, C1790i iVar, C2036b bVar) throws IOException {
        return m9549e(new C2043s.C2044a(inputStream, this.f7056d, this.f7055c), i, i2, iVar, bVar);
    }

    /* renamed from: o */
    public boolean mo8127o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m8698c();
    }

    /* renamed from: p */
    public boolean mo8128p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo8129q(ByteBuffer byteBuffer) {
        return true;
    }
}
