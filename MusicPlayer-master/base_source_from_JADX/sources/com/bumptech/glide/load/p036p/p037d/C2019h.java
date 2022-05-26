package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d.h */
/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class C2019h implements C1792k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C2015d f7029a = new C2015d();

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(ByteBuffer byteBuffer, int i, int i2, C1790i iVar) throws IOException {
        return this.f7029a.mo7749b(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7748a(ByteBuffer byteBuffer, C1790i iVar) throws IOException {
        return true;
    }
}
