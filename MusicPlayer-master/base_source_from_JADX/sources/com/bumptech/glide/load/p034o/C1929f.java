package com.bumptech.glide.load.p034o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.f */
/* compiled from: FileLoader */
public class C1929f<Data> implements C1950n<File, Data> {

    /* renamed from: a */
    private final C1934d<Data> f6901a;

    /* renamed from: com.bumptech.glide.load.o.f$a */
    /* compiled from: FileLoader */
    public static class C1930a<Data> implements C1952o<File, Data> {

        /* renamed from: a */
        private final C1934d<Data> f6902a;

        public C1930a(C1934d<Data> dVar) {
            this.f6902a = dVar;
        }

        /* renamed from: b */
        public final C1950n<File, Data> mo8008b(C1958r rVar) {
            return new C1929f(this.f6902a);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$b */
    /* compiled from: FileLoader */
    public static class C1931b extends C1930a<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.o.f$b$a */
        /* compiled from: FileLoader */
        class C1932a implements C1934d<ParcelFileDescriptor> {
            C1932a() {
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo8025a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo8026b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo8027c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C1931b() {
            super(new C1932a());
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$c */
    /* compiled from: FileLoader */
    private static final class C1933c<Data> implements C1752d<Data> {

        /* renamed from: g */
        private final File f6903g;

        /* renamed from: h */
        private final C1934d<Data> f6904h;

        /* renamed from: i */
        private Data f6905i;

        C1933c(File file, C1934d<Data> dVar) {
            this.f6903g = file;
            this.f6904h = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo7688a() {
            return this.f6904h.mo8025a();
        }

        /* renamed from: b */
        public void mo7693b() {
            Data data = this.f6905i;
            if (data != null) {
                try {
                    this.f6904h.mo8026b(data);
                } catch (IOException unused) {
                }
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
                Data c = this.f6904h.mo8027c(this.f6903g);
                this.f6905i = c;
                aVar.mo7705f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo7704c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.f$d */
    /* compiled from: FileLoader */
    public interface C1934d<Data> {
        /* renamed from: a */
        Class<Data> mo8025a();

        /* renamed from: b */
        void mo8026b(Data data) throws IOException;

        /* renamed from: c */
        Data mo8027c(File file) throws FileNotFoundException;
    }

    /* renamed from: com.bumptech.glide.load.o.f$e */
    /* compiled from: FileLoader */
    public static class C1935e extends C1930a<InputStream> {

        /* renamed from: com.bumptech.glide.load.o.f$e$a */
        /* compiled from: FileLoader */
        class C1936a implements C1934d<InputStream> {
            C1936a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo8025a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo8026b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo8027c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C1935e() {
            super(new C1936a());
        }
    }

    public C1929f(C1934d<Data> dVar) {
        this.f6901a = dVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(File file, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(file), new C1933c(file, this.f6901a));
    }

    /* renamed from: d */
    public boolean mo8003a(File file) {
        return true;
    }
}
