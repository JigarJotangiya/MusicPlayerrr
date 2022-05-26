package com.bumptech.glide.load.p036p.p037d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1787h;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.b0 */
/* compiled from: VideoDecoder */
public class C2004b0<T> implements C1792k<T, Bitmap> {

    /* renamed from: d */
    public static final C1787h<Long> f7013d = C1787h.m8818a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2005a());

    /* renamed from: e */
    public static final C1787h<Integer> f7014e = C1787h.m8818a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2006b());

    /* renamed from: f */
    private static final C2010e f7015f = new C2010e();

    /* renamed from: a */
    private final C2011f<T> f7016a;

    /* renamed from: b */
    private final C1807e f7017b;

    /* renamed from: c */
    private final C2010e f7018c;

    /* renamed from: com.bumptech.glide.load.p.d.b0$a */
    /* compiled from: VideoDecoder */
    class C2005a implements C1787h.C1789b<Long> {

        /* renamed from: a */
        private final ByteBuffer f7019a = ByteBuffer.allocate(8);

        C2005a() {
        }

        /* renamed from: b */
        public void mo7743a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f7019a) {
                this.f7019a.position(0);
                messageDigest.update(this.f7019a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$b */
    /* compiled from: VideoDecoder */
    class C2006b implements C1787h.C1789b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f7020a = ByteBuffer.allocate(4);

        C2006b() {
        }

        /* renamed from: b */
        public void mo7743a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f7020a) {
                    this.f7020a.position(0);
                    messageDigest.update(this.f7020a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$c */
    /* compiled from: VideoDecoder */
    private static final class C2007c implements C2011f<AssetFileDescriptor> {
        private C2007c() {
        }

        /* renamed from: b */
        public void mo8099a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ C2007c(C2005a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$d */
    /* compiled from: VideoDecoder */
    static final class C2008d implements C2011f<ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.p.d.b0$d$a */
        /* compiled from: VideoDecoder */
        class C2009a extends MediaDataSource {

            /* renamed from: g */
            final /* synthetic */ ByteBuffer f7021g;

            C2009a(C2008d dVar, ByteBuffer byteBuffer) {
                this.f7021g = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f7021g.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f7021g.limit())) {
                    return -1;
                }
                this.f7021g.position((int) j);
                int min = Math.min(i2, this.f7021g.remaining());
                this.f7021g.get(bArr, i, min);
                return min;
            }
        }

        C2008d() {
        }

        /* renamed from: b */
        public void mo8099a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C2009a(this, byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$e */
    /* compiled from: VideoDecoder */
    static class C2010e {
        C2010e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo8105a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$f */
    /* compiled from: VideoDecoder */
    interface C2011f<T> {
        /* renamed from: a */
        void mo8099a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$g */
    /* compiled from: VideoDecoder */
    static final class C2012g implements C2011f<ParcelFileDescriptor> {
        C2012g() {
        }

        /* renamed from: b */
        public void mo8099a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.b0$h */
    /* compiled from: VideoDecoder */
    private static final class C2013h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        C2013h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    C2004b0(C1807e eVar, C2011f<T> fVar) {
        this(eVar, fVar, f7015f);
    }

    /* renamed from: c */
    public static C1792k<AssetFileDescriptor, Bitmap> m9463c(C1807e eVar) {
        return new C2004b0(eVar, new C2007c((C2005a) null));
    }

    /* renamed from: d */
    public static C1792k<ByteBuffer, Bitmap> m9464d(C1807e eVar) {
        return new C2004b0(eVar, new C2008d());
    }

    /* renamed from: e */
    private static Bitmap m9465e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C2028l lVar) {
        Bitmap g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || lVar == C2028l.f7040d) ? null : m9467g(mediaMetadataRetriever, j, i, i2, i3, lVar);
        if (g == null) {
            g = m9466f(mediaMetadataRetriever, j, i);
        }
        if (g != null) {
            return g;
        }
        throw new C2013h();
    }

    /* renamed from: f */
    private static Bitmap m9466f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: g */
    private static Bitmap m9467g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C2028l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = lVar.mo8123b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    /* renamed from: h */
    public static C1792k<ParcelFileDescriptor, Bitmap> m9468h(C1807e eVar) {
        return new C2004b0(eVar, new C2012g());
    }

    /* renamed from: a */
    public boolean mo7748a(T t, C1790i iVar) {
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public C1902v<Bitmap> mo7749b(T t, int i, int i2, C1790i iVar) throws IOException {
        long longValue = ((Long) iVar.mo7744c(f7013d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo7744c(f7014e);
            if (num == null) {
                num = 2;
            }
            C2028l lVar = (C2028l) iVar.mo7744c(C2028l.f7042f);
            if (lVar == null) {
                lVar = C2028l.f7041e;
            }
            C2028l lVar2 = lVar;
            MediaMetadataRetriever a = this.f7018c.mo8105a();
            try {
                this.f7016a.mo8099a(a, t);
                Bitmap e = m9465e(a, longValue, num.intValue(), i, i2, lVar2);
                a.release();
                return C2016e.m9488f(e, this.f7017b);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    C2004b0(C1807e eVar, C2011f<T> fVar, C2010e eVar2) {
        this.f7017b = eVar;
        this.f7016a = fVar;
        this.f7018c = eVar2;
    }
}
