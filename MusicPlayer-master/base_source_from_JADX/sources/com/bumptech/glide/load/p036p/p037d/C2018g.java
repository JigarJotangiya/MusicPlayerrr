package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.p051s.C2179a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d.g */
/* compiled from: ByteBufferBitmapDecoder */
public class C2018g implements C1792k<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C2034m f7028a;

    public C2018g(C2034m mVar) {
        this.f7028a = mVar;
    }

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(ByteBuffer byteBuffer, int i, int i2, C1790i iVar) throws IOException {
        return this.f7028a.mo8125f(C2179a.m10240f(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7748a(ByteBuffer byteBuffer, C1790i iVar) {
        return this.f7028a.mo8129q(byteBuffer);
    }
}
