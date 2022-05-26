package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.p051s.C2179a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.d.t */
/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class C2046t implements C1792k<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2015d f7079a = new C2015d();

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(InputStream inputStream, int i, int i2, C1790i iVar) throws IOException {
        return this.f7079a.mo7749b(ImageDecoder.createSource(C2179a.m10236b(inputStream)), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7748a(InputStream inputStream, C1790i iVar) throws IOException {
        return true;
    }
}
