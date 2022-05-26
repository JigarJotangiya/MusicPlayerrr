package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C1754e;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p036p.p037d.C2049w;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.k */
/* compiled from: InputStreamRewinder */
public final class C1765k implements C1754e<InputStream> {

    /* renamed from: a */
    private final C2049w f6543a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C1766a implements C1754e.C1755a<InputStream> {

        /* renamed from: a */
        private final C1802b f6544a;

        public C1766a(C1802b bVar) {
            this.f6544a = bVar;
        }

        /* renamed from: a */
        public Class<InputStream> mo7685a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public C1754e<InputStream> mo7686b(InputStream inputStream) {
            return new C1765k(inputStream, this.f6544a);
        }
    }

    public C1765k(InputStream inputStream, C1802b bVar) {
        C2049w wVar = new C2049w(inputStream, bVar);
        this.f6543a = wVar;
        wVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo7682b() {
        this.f6543a.mo8149p();
    }

    /* renamed from: c */
    public void mo7719c() {
        this.f6543a.mo8146d();
    }

    /* renamed from: d */
    public InputStream mo7681a() throws IOException {
        this.f6543a.reset();
        return this.f6543a;
    }
}
