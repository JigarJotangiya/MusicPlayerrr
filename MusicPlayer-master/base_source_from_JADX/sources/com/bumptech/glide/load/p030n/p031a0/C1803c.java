package com.bumptech.glide.load.p030n.p031a0;

import android.graphics.Bitmap;
import com.bumptech.glide.p051s.C2194k;

/* renamed from: com.bumptech.glide.load.n.a0.c */
/* compiled from: AttributeStrategy */
class C1803c implements C1819l {

    /* renamed from: a */
    private final C1805b f6590a = new C1805b();

    /* renamed from: b */
    private final C1810h<C1804a, Bitmap> f6591b = new C1810h<>();

    /* renamed from: com.bumptech.glide.load.n.a0.c$a */
    /* compiled from: AttributeStrategy */
    static class C1804a implements C1820m {

        /* renamed from: a */
        private final C1805b f6592a;

        /* renamed from: b */
        private int f6593b;

        /* renamed from: c */
        private int f6594c;

        /* renamed from: d */
        private Bitmap.Config f6595d;

        public C1804a(C1805b bVar) {
            this.f6592a = bVar;
        }

        /* renamed from: a */
        public void mo7779a() {
            this.f6592a.mo7788c(this);
        }

        /* renamed from: b */
        public void mo7780b(int i, int i2, Bitmap.Config config) {
            this.f6593b = i;
            this.f6594c = i2;
            this.f6595d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1804a)) {
                return false;
            }
            C1804a aVar = (C1804a) obj;
            if (this.f6593b == aVar.f6593b && this.f6594c == aVar.f6594c && this.f6595d == aVar.f6595d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f6593b * 31) + this.f6594c) * 31;
            Bitmap.Config config = this.f6595d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1803c.m8852f(this.f6593b, this.f6594c, this.f6595d);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.c$b */
    /* compiled from: AttributeStrategy */
    static class C1805b extends C1806d<C1804a> {
        C1805b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1804a mo7784a() {
            return new C1804a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1804a mo7786e(int i, int i2, Bitmap.Config config) {
            C1804a aVar = (C1804a) mo7787b();
            aVar.mo7780b(i, i2, config);
            return aVar;
        }
    }

    C1803c() {
    }

    /* renamed from: f */
    static String m8852f(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: g */
    private static String m8853g(Bitmap bitmap) {
        return m8852f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo7772a(int i, int i2, Bitmap.Config config) {
        return m8852f(i, i2, config);
    }

    /* renamed from: b */
    public int mo7773b(Bitmap bitmap) {
        return C2194k.m10278h(bitmap);
    }

    /* renamed from: c */
    public void mo7774c(Bitmap bitmap) {
        this.f6591b.mo7797d(this.f6590a.mo7786e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: d */
    public Bitmap mo7775d(int i, int i2, Bitmap.Config config) {
        return this.f6591b.mo7796a(this.f6590a.mo7786e(i, i2, config));
    }

    /* renamed from: e */
    public String mo7776e(Bitmap bitmap) {
        return m8853g(bitmap);
    }

    public Bitmap removeLast() {
        return this.f6591b.mo7798f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f6591b;
    }
}
