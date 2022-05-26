package com.bumptech.glide.load;

import com.bumptech.glide.load.p030n.p031a0.C1802b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: a */
    ImageType mo7676a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: b */
    ImageType mo7677b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    int mo7678c(InputStream inputStream, C1802b bVar) throws IOException;
}
