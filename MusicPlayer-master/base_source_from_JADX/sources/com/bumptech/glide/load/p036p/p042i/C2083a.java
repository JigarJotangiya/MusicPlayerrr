package com.bumptech.glide.load.p036p.p042i;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p036p.p038e.C2058b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.p.i.a */
/* compiled from: BitmapBytesTranscoder */
public class C2083a implements C2087e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f7157a;

    /* renamed from: b */
    private final int f7158b;

    public C2083a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    /* renamed from: a */
    public C1902v<byte[]> mo8232a(C1902v<Bitmap> vVar, C1790i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f7157a, this.f7158b, byteArrayOutputStream);
        vVar.mo7965a();
        return new C2058b(byteArrayOutputStream.toByteArray());
    }

    public C2083a(Bitmap.CompressFormat compressFormat, int i) {
        this.f7157a = compressFormat;
        this.f7158b = i;
    }
}
