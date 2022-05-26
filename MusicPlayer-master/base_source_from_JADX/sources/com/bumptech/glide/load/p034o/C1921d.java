package com.bumptech.glide.load.p034o;

import android.util.Log;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import com.bumptech.glide.p051s.C2179a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.o.d */
/* compiled from: ByteBufferFileLoader */
public class C1921d implements C1950n<File, ByteBuffer> {

    /* renamed from: com.bumptech.glide.load.o.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C1922a implements C1752d<ByteBuffer> {

        /* renamed from: g */
        private final File f6895g;

        C1922a(File file) {
            this.f6895g = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo7688a() {
            return ByteBuffer.class;
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
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super ByteBuffer> aVar) {
            try {
                aVar.mo7705f(C2179a.m10235a(this.f6895g));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo7704c(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.o.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C1923b implements C1952o<File, ByteBuffer> {
        /* renamed from: b */
        public C1950n<File, ByteBuffer> mo8008b(C1958r rVar) {
            return new C1921d();
        }
    }

    /* renamed from: c */
    public C1950n.C1951a<ByteBuffer> mo8004b(File file, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(file), new C1922a(file));
    }

    /* renamed from: d */
    public boolean mo8003a(File file) {
        return true;
    }
}
