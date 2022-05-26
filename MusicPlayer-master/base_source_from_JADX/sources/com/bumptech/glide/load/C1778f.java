package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p036p.p037d.C2049w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
/* compiled from: ImageHeaderParserUtils */
public final class C1778f {

    /* renamed from: com.bumptech.glide.load.f$a */
    /* compiled from: ImageHeaderParserUtils */
    class C1779a implements C1785g {

        /* renamed from: a */
        final /* synthetic */ InputStream f6562a;

        C1779a(InputStream inputStream) {
            this.f6562a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7733a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo7677b(this.f6562a);
            } finally {
                this.f6562a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$b */
    /* compiled from: ImageHeaderParserUtils */
    class C1780b implements C1785g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f6563a;

        C1780b(ByteBuffer byteBuffer) {
            this.f6563a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo7733a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo7676a(this.f6563a);
        }
    }

    /* renamed from: com.bumptech.glide.load.f$c */
    /* compiled from: ImageHeaderParserUtils */
    class C1781c implements C1785g {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f6564a;

        /* renamed from: b */
        final /* synthetic */ C1802b f6565b;

        C1781c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C1802b bVar) {
            this.f6564a = parcelFileDescriptorRewinder;
            this.f6565b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo7733a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.p.d.w r1 = new com.bumptech.glide.load.p.d.w     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f6564a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo7681a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.n.a0.b r3 = r4.f6565b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo7677b(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6564a
                r0.mo7681a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6564a
                r0.mo7681a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1778f.C1781c.mo7733a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$d */
    /* compiled from: ImageHeaderParserUtils */
    class C1782d implements C1784f {

        /* renamed from: a */
        final /* synthetic */ InputStream f6566a;

        /* renamed from: b */
        final /* synthetic */ C1802b f6567b;

        C1782d(InputStream inputStream, C1802b bVar) {
            this.f6566a = inputStream;
            this.f6567b = bVar;
        }

        /* renamed from: a */
        public int mo7734a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo7678c(this.f6566a, this.f6567b);
            } finally {
                this.f6566a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$e */
    /* compiled from: ImageHeaderParserUtils */
    class C1783e implements C1784f {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f6568a;

        /* renamed from: b */
        final /* synthetic */ C1802b f6569b;

        C1783e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C1802b bVar) {
            this.f6568a = parcelFileDescriptorRewinder;
            this.f6569b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo7734a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.p.d.w r1 = new com.bumptech.glide.load.p.d.w     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f6568a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo7681a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.n.a0.b r3 = r4.f6569b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.n.a0.b r0 = r4.f6569b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo7678c(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6568a
                r0.mo7681a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f6568a
                r0.mo7681a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1778f.C1783e.mo7734a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$f */
    /* compiled from: ImageHeaderParserUtils */
    private interface C1784f {
        /* renamed from: a */
        int mo7734a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.f$g */
    /* compiled from: ImageHeaderParserUtils */
    private interface C1785g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo7733a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: a */
    public static int m8803a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C1802b bVar) throws IOException {
        return m8805c(list, new C1783e(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: b */
    public static int m8804b(List<ImageHeaderParser> list, InputStream inputStream, C1802b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2049w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m8805c(list, new C1782d(inputStream, bVar));
    }

    /* renamed from: c */
    private static int m8805c(List<ImageHeaderParser> list, C1784f fVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo7734a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m8806d(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C1802b bVar) throws IOException {
        return m8809g(list, new C1781c(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m8807e(List<ImageHeaderParser> list, InputStream inputStream, C1802b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2049w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m8809g(list, new C1779a(inputStream));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m8808f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m8809g(list, new C1780b(byteBuffer));
    }

    /* renamed from: g */
    private static ImageHeaderParser.ImageType m8809g(List<ImageHeaderParser> list, C1785g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = gVar.mo7733a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
