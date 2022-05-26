package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.p037d.C2034m;
import com.bumptech.glide.p051s.C2184d;
import com.bumptech.glide.p051s.C2191h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.d.y */
/* compiled from: StreamBitmapDecoder */
public class C2052y implements C1792k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2034m f7091a;

    /* renamed from: b */
    private final C1802b f7092b;

    /* renamed from: com.bumptech.glide.load.p.d.y$a */
    /* compiled from: StreamBitmapDecoder */
    static class C2053a implements C2034m.C2036b {

        /* renamed from: a */
        private final C2049w f7093a;

        /* renamed from: b */
        private final C2184d f7094b;

        C2053a(C2049w wVar, C2184d dVar) {
            this.f7093a = wVar;
            this.f7094b = dVar;
        }

        /* renamed from: a */
        public void mo8130a(C1807e eVar, Bitmap bitmap) throws IOException {
            IOException c = this.f7094b.mo8480c();
            if (c != null) {
                if (bitmap != null) {
                    eVar.mo7791c(bitmap);
                }
                throw c;
            }
        }

        /* renamed from: b */
        public void mo8131b() {
            this.f7093a.mo8146d();
        }
    }

    public C2052y(C2034m mVar, C1802b bVar) {
        this.f7091a = mVar;
        this.f7092b = bVar;
    }

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(InputStream inputStream, int i, int i2, C1790i iVar) throws IOException {
        C2049w wVar;
        boolean z;
        if (inputStream instanceof C2049w) {
            wVar = (C2049w) inputStream;
            z = false;
        } else {
            wVar = new C2049w(inputStream, this.f7092b);
            z = true;
        }
        C2184d d = C2184d.m10246d(wVar);
        try {
            return this.f7091a.mo8126g(new C2191h(d), i, i2, iVar, new C2053a(wVar, d));
        } finally {
            d.mo8484p();
            if (z) {
                wVar.mo8149p();
            }
        }
    }

    /* renamed from: d */
    public boolean mo7748a(InputStream inputStream, C1790i iVar) {
        return this.f7091a.mo8128p(inputStream);
    }
}
