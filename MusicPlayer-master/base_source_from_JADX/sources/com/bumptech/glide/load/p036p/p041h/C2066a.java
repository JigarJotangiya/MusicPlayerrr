package com.bumptech.glide.load.p036p.p041h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C1745b;
import com.bumptech.glide.load.C1778f;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p036p.C1999c;
import com.bumptech.glide.p044n.C2125a;
import com.bumptech.glide.p044n.C2128c;
import com.bumptech.glide.p044n.C2129d;
import com.bumptech.glide.p044n.C2130e;
import com.bumptech.glide.p051s.C2188f;
import com.bumptech.glide.p051s.C2194k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.p.h.a */
/* compiled from: ByteBufferGifDecoder */
public class C2066a implements C1792k<ByteBuffer, C2070c> {

    /* renamed from: f */
    private static final C2067a f7104f = new C2067a();

    /* renamed from: g */
    private static final C2068b f7105g = new C2068b();

    /* renamed from: a */
    private final Context f7106a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f7107b;

    /* renamed from: c */
    private final C2068b f7108c;

    /* renamed from: d */
    private final C2067a f7109d;

    /* renamed from: e */
    private final C2069b f7110e;

    /* renamed from: com.bumptech.glide.load.p.h.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C2067a {
        C2067a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2125a mo8176a(C2125a.C2126a aVar, C2128c cVar, ByteBuffer byteBuffer, int i) {
            return new C2130e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.h.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C2068b {

        /* renamed from: a */
        private final Queue<C2129d> f7111a = C2194k.m10276f(0);

        C2068b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C2129d mo8177a(ByteBuffer byteBuffer) {
            C2129d poll;
            poll = this.f7111a.poll();
            if (poll == null) {
                poll = new C2129d();
            }
            poll.mo8328p(byteBuffer);
            return poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo8178b(C2129d dVar) {
            dVar.mo8326a();
            this.f7111a.offer(dVar);
        }
    }

    public C2066a(Context context, List<ImageHeaderParser> list, C1807e eVar, C1802b bVar) {
        this(context, list, eVar, bVar, f7105g, f7104f);
    }

    /* renamed from: c */
    private C2073e m9686c(ByteBuffer byteBuffer, int i, int i2, C2129d dVar, C1790i iVar) {
        Bitmap.Config config;
        long b = C2188f.m10253b();
        try {
            C2128c c = dVar.mo8327c();
            if (c.mo8323b() > 0) {
                if (c.mo8324c() == 0) {
                    if (iVar.mo7744c(C2081i.f7152a) == C1745b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    C2125a a = this.f7109d.mo8176a(this.f7110e, c, byteBuffer, m9687e(c, i, i2));
                    a.mo8318f(config);
                    a.mo8314c();
                    Bitmap a2 = a.mo8312a();
                    if (a2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2188f.m10252a(b));
                        }
                        return null;
                    }
                    C2073e eVar = new C2073e(new C2070c(this.f7106a, a, C1999c.m9447c(), i, i2, a2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2188f.m10252a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2188f.m10252a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m9687e(C2128c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo8322a() / i2, cVar.mo8325d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo8325d() + "x" + cVar.mo8322a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C2073e mo7749b(ByteBuffer byteBuffer, int i, int i2, C1790i iVar) {
        C2129d a = this.f7108c.mo8177a(byteBuffer);
        try {
            return m9686c(byteBuffer, i, i2, a, iVar);
        } finally {
            this.f7108c.mo8178b(a);
        }
    }

    /* renamed from: f */
    public boolean mo7748a(ByteBuffer byteBuffer, C1790i iVar) throws IOException {
        return !((Boolean) iVar.mo7744c(C2081i.f7153b)).booleanValue() && C1778f.m8808f(this.f7107b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C2066a(Context context, List<ImageHeaderParser> list, C1807e eVar, C1802b bVar, C2068b bVar2, C2067a aVar) {
        this.f7106a = context.getApplicationContext();
        this.f7107b = list;
        this.f7109d = aVar;
        this.f7110e = new C2069b(eVar, bVar);
        this.f7108c = bVar2;
    }
}
