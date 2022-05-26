package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1778f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1765k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.p051s.C2193j;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.d.s */
/* compiled from: ImageReader */
interface C2043s {

    /* renamed from: com.bumptech.glide.load.p.d.s$a */
    /* compiled from: ImageReader */
    public static final class C2044a implements C2043s {

        /* renamed from: a */
        private final C1765k f7073a;

        /* renamed from: b */
        private final C1802b f7074b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f7075c;

        C2044a(InputStream inputStream, List<ImageHeaderParser> list, C1802b bVar) {
            C2193j.m10269d(bVar);
            this.f7074b = bVar;
            C2193j.m10269d(list);
            this.f7075c = list;
            this.f7073a = new C1765k(inputStream, bVar);
        }

        /* renamed from: a */
        public int mo8135a() throws IOException {
            return C1778f.m8804b(this.f7075c, this.f7073a.mo7681a(), this.f7074b);
        }

        /* renamed from: b */
        public Bitmap mo8136b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f7073a.mo7681a(), (Rect) null, options);
        }

        /* renamed from: c */
        public void mo8137c() {
            this.f7073a.mo7719c();
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo8138d() throws IOException {
            return C1778f.m8807e(this.f7075c, this.f7073a.mo7681a(), this.f7074b);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.s$b */
    /* compiled from: ImageReader */
    public static final class C2045b implements C2043s {

        /* renamed from: a */
        private final C1802b f7076a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f7077b;

        /* renamed from: c */
        private final ParcelFileDescriptorRewinder f7078c;

        C2045b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C1802b bVar) {
            C2193j.m10269d(bVar);
            this.f7076a = bVar;
            C2193j.m10269d(list);
            this.f7077b = list;
            this.f7078c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* renamed from: a */
        public int mo8135a() throws IOException {
            return C1778f.m8803a(this.f7077b, this.f7078c, this.f7076a);
        }

        /* renamed from: b */
        public Bitmap mo8136b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f7078c.mo7681a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: c */
        public void mo8137c() {
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo8138d() throws IOException {
            return C1778f.m8806d(this.f7077b, this.f7078c, this.f7076a);
        }
    }

    /* renamed from: a */
    int mo8135a() throws IOException;

    /* renamed from: b */
    Bitmap mo8136b(BitmapFactory.Options options) throws IOException;

    /* renamed from: c */
    void mo8137c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo8138d() throws IOException;
}
