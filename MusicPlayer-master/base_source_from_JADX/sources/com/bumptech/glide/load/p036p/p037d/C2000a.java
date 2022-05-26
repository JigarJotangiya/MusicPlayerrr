package com.bumptech.glide.load.p036p.p037d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.p051s.C2193j;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.d.a */
/* compiled from: BitmapDrawableDecoder */
public class C2000a<DataType> implements C1792k<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C1792k<DataType, Bitmap> f7008a;

    /* renamed from: b */
    private final Resources f7009b;

    public C2000a(Resources resources, C1792k<DataType, Bitmap> kVar) {
        C2193j.m10269d(resources);
        this.f7009b = resources;
        C2193j.m10269d(kVar);
        this.f7008a = kVar;
    }

    /* renamed from: a */
    public boolean mo7748a(DataType datatype, C1790i iVar) throws IOException {
        return this.f7008a.mo7748a(datatype, iVar);
    }

    /* renamed from: b */
    public C1902v<BitmapDrawable> mo7749b(DataType datatype, int i, int i2, C1790i iVar) throws IOException {
        return C2047u.m9613f(this.f7009b, this.f7008a.mo7749b(datatype, i, i2, iVar));
    }
}
