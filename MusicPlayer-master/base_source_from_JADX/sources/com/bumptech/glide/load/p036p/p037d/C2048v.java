package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.d.v */
/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class C2048v implements C1792k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C2034m f7082a;

    public C2048v(C2034m mVar) {
        this.f7082a = mVar;
    }

    /* renamed from: c */
    public C1902v<Bitmap> mo7749b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C1790i iVar) throws IOException {
        return this.f7082a.mo8124d(parcelFileDescriptor, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7748a(ParcelFileDescriptor parcelFileDescriptor, C1790i iVar) {
        return this.f7082a.mo8127o(parcelFileDescriptor);
    }
}
