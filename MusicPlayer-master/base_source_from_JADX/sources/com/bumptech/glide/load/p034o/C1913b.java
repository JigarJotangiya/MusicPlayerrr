package com.bumptech.glide.load.p034o;

import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.b */
/* compiled from: ByteArrayLoader */
public class C1913b<Data> implements C1950n<byte[], Data> {

    /* renamed from: a */
    private final C1916b<Data> f6892a;

    /* renamed from: com.bumptech.glide.load.o.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C1914a implements C1952o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.o.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C1915a implements C1916b<ByteBuffer> {
            C1915a(C1914a aVar) {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo8011a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo8012b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        /* renamed from: b */
        public C1950n<byte[], ByteBuffer> mo8008b(C1958r rVar) {
            return new C1913b(new C1915a(this));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C1916b<Data> {
        /* renamed from: a */
        Class<Data> mo8011a();

        /* renamed from: b */
        Data mo8012b(byte[] bArr);
    }

    /* renamed from: com.bumptech.glide.load.o.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C1917c<Data> implements C1752d<Data> {

        /* renamed from: g */
        private final byte[] f6893g;

        /* renamed from: h */
        private final C1916b<Data> f6894h;

        C1917c(byte[] bArr, C1916b<Data> bVar) {
            this.f6893g = bArr;
            this.f6894h = bVar;
        }

        /* renamed from: a */
        public Class<Data> mo7688a() {
            return this.f6894h.mo8011a();
        }

        /* renamed from: b */
        public void mo7693b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C1744a mo7696d() {
            return C1744a.LOCAL;
        }

        /* renamed from: e */
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super Data> aVar) {
            aVar.mo7705f(this.f6894h.mo8012b(this.f6893g));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C1918d implements C1952o<byte[], InputStream> {

        /* renamed from: com.bumptech.glide.load.o.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C1919a implements C1916b<InputStream> {
            C1919a(C1918d dVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo8011a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo8012b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        /* renamed from: b */
        public C1950n<byte[], InputStream> mo8008b(C1958r rVar) {
            return new C1913b(new C1919a(this));
        }
    }

    public C1913b(C1916b<Data> bVar) {
        this.f6892a = bVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(byte[] bArr, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(bArr), new C1917c(bArr, this.f6892a));
    }

    /* renamed from: d */
    public boolean mo8003a(byte[] bArr) {
        return true;
    }
}
