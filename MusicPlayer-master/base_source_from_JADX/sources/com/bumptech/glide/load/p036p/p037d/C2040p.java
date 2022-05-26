package com.bumptech.glide.load.p036p.p037d;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p082e.p134m.p135a.C4087a;

/* renamed from: com.bumptech.glide.load.p.d.p */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C2040p implements ImageHeaderParser {
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7676a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public ImageHeaderParser.ImageType mo7677b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public int mo7678c(InputStream inputStream, C1802b bVar) throws IOException {
        int e = new C4087a(inputStream).mo14156e("Orientation", 1);
        if (e == 0) {
            return -1;
        }
        return e;
    }
}
