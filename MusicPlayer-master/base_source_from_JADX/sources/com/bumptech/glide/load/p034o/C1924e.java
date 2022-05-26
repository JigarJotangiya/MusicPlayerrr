package com.bumptech.glide.load.p034o;

import android.util.Base64;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.e */
/* compiled from: DataUrlLoader */
public final class C1924e<Model, Data> implements C1950n<Model, Data> {

    /* renamed from: a */
    private final C1925a<Data> f6896a;

    /* renamed from: com.bumptech.glide.load.o.e$a */
    /* compiled from: DataUrlLoader */
    public interface C1925a<Data> {
        /* renamed from: a */
        Class<Data> mo8018a();

        /* renamed from: b */
        void mo8019b(Data data) throws IOException;

        /* renamed from: c */
        Data mo8020c(String str) throws IllegalArgumentException;
    }

    /* renamed from: com.bumptech.glide.load.o.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C1926b<Data> implements C1752d<Data> {

        /* renamed from: g */
        private final String f6897g;

        /* renamed from: h */
        private final C1925a<Data> f6898h;

        /* renamed from: i */
        private Data f6899i;

        C1926b(String str, C1925a<Data> aVar) {
            this.f6897g = str;
            this.f6898h = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo7688a() {
            return this.f6898h.mo8018a();
        }

        /* renamed from: b */
        public void mo7693b() {
            try {
                this.f6898h.mo8019b(this.f6899i);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C1744a mo7696d() {
            return C1744a.LOCAL;
        }

        /* renamed from: e */
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super Data> aVar) {
            try {
                Data c = this.f6898h.mo8020c(this.f6897g);
                this.f6899i = c;
                aVar.mo7705f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo7704c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C1927c<Model> implements C1952o<Model, InputStream> {

        /* renamed from: a */
        private final C1925a<InputStream> f6900a = new C1928a(this);

        /* renamed from: com.bumptech.glide.load.o.e$c$a */
        /* compiled from: DataUrlLoader */
        class C1928a implements C1925a<InputStream> {
            C1928a(C1927c cVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo8018a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo8019b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo8020c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: b */
        public C1950n<Model, InputStream> mo8008b(C1958r rVar) {
            return new C1924e(this.f6900a);
        }
    }

    public C1924e(C1925a<Data> aVar) {
        this.f6896a = aVar;
    }

    /* renamed from: a */
    public boolean mo8003a(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: b */
    public C1950n.C1951a<Data> mo8004b(Model model, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(model), new C1926b(model.toString(), this.f6896a));
    }
}
