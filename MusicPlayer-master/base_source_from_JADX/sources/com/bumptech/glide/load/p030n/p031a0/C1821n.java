package com.bumptech.glide.load.p030n.p031a0;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p051s.C2194k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.bumptech.glide.load.n.a0.n */
/* compiled from: SizeConfigStrategy */
public class C1821n implements C1819l {

    /* renamed from: d */
    private static final Bitmap.Config[] f6622d;

    /* renamed from: e */
    private static final Bitmap.Config[] f6623e;

    /* renamed from: f */
    private static final Bitmap.Config[] f6624f = {Bitmap.Config.RGB_565};

    /* renamed from: g */
    private static final Bitmap.Config[] f6625g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h */
    private static final Bitmap.Config[] f6626h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a */
    private final C1824c f6627a = new C1824c();

    /* renamed from: b */
    private final C1810h<C1823b, Bitmap> f6628b = new C1810h<>();

    /* renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f6629c = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.a0.n$a */
    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class C1822a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6630a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6630a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6630a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6630a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6630a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p030n.p031a0.C1821n.C1822a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.n$b */
    /* compiled from: SizeConfigStrategy */
    static final class C1823b implements C1820m {

        /* renamed from: a */
        private final C1824c f6631a;

        /* renamed from: b */
        int f6632b;

        /* renamed from: c */
        private Bitmap.Config f6633c;

        public C1823b(C1824c cVar) {
            this.f6631a = cVar;
        }

        /* renamed from: a */
        public void mo7779a() {
            this.f6631a.mo7788c(this);
        }

        /* renamed from: b */
        public void mo7815b(int i, Bitmap.Config config) {
            this.f6632b = i;
            this.f6633c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1823b)) {
                return false;
            }
            C1823b bVar = (C1823b) obj;
            if (this.f6632b != bVar.f6632b || !C2194k.m10274d(this.f6633c, bVar.f6633c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f6632b * 31;
            Bitmap.Config config = this.f6633c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1821n.m8947h(this.f6632b, this.f6633c);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.n$c */
    /* compiled from: SizeConfigStrategy */
    static class C1824c extends C1806d<C1823b> {
        C1824c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1823b mo7784a() {
            return new C1823b(this);
        }

        /* renamed from: e */
        public C1823b mo7820e(int i, Bitmap.Config config) {
            C1823b bVar = (C1823b) mo7787b();
            bVar.mo7815b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f6622d = configArr;
        f6623e = configArr;
    }

    /* renamed from: f */
    private void m8945f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = m8949j(bitmap.getConfig());
        Integer num2 = (Integer) j.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo7776e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j.remove(num);
        } else {
            j.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: g */
    private C1823b m8946g(int i, Bitmap.Config config) {
        C1823b e = this.f6627a.mo7820e(i, config);
        Bitmap.Config[] i2 = m8948i(config);
        int length = i2.length;
        int i3 = 0;
        while (i3 < length) {
            Bitmap.Config config2 = i2[i3];
            Integer ceilingKey = m8949j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i3++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f6627a.mo7788c(e);
                return this.f6627a.mo7820e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: h */
    static String m8947h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: i */
    private static Bitmap.Config[] m8948i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f6623e;
        }
        int i = C1822a.f6630a[config.ordinal()];
        if (i == 1) {
            return f6622d;
        }
        if (i == 2) {
            return f6624f;
        }
        if (i == 3) {
            return f6625g;
        }
        if (i == 4) {
            return f6626h;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: j */
    private NavigableMap<Integer, Integer> m8949j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f6629c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6629c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public String mo7772a(int i, int i2, Bitmap.Config config) {
        return m8947h(C2194k.m10277g(i, i2, config), config);
    }

    /* renamed from: b */
    public int mo7773b(Bitmap bitmap) {
        return C2194k.m10278h(bitmap);
    }

    /* renamed from: c */
    public void mo7774c(Bitmap bitmap) {
        C1823b e = this.f6627a.mo7820e(C2194k.m10278h(bitmap), bitmap.getConfig());
        this.f6628b.mo7797d(e, bitmap);
        NavigableMap<Integer, Integer> j = m8949j(bitmap.getConfig());
        Integer num = (Integer) j.get(Integer.valueOf(e.f6632b));
        Integer valueOf = Integer.valueOf(e.f6632b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: d */
    public Bitmap mo7775d(int i, int i2, Bitmap.Config config) {
        C1823b g = m8946g(C2194k.m10277g(i, i2, config), config);
        Bitmap a = this.f6628b.mo7796a(g);
        if (a != null) {
            m8945f(Integer.valueOf(g.f6632b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    /* renamed from: e */
    public String mo7776e(Bitmap bitmap) {
        return m8947h(C2194k.m10278h(bitmap), bitmap.getConfig());
    }

    public Bitmap removeLast() {
        Bitmap f = this.f6628b.mo7798f();
        if (f != null) {
            m8945f(Integer.valueOf(C2194k.m10278h(f)), f);
        }
        return f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f6628b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f6629c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f6629c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), BuildConfig.FLAVOR);
        }
        sb.append(")}");
        return sb.toString();
    }
}
