package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C1746c;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1793l;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.p.d.b */
/* compiled from: BitmapDrawableEncoder */
public class C2003b implements C1793l<BitmapDrawable> {

    /* renamed from: a */
    private final C1807e f7011a;

    /* renamed from: b */
    private final C1793l<Bitmap> f7012b;

    public C2003b(C1807e eVar, C1793l<Bitmap> lVar) {
        this.f7011a = eVar;
        this.f7012b = lVar;
    }

    /* renamed from: b */
    public C1746c mo7750b(C1790i iVar) {
        return this.f7012b.mo7750b(iVar);
    }

    /* renamed from: c */
    public boolean mo7680a(C1902v<BitmapDrawable> vVar, File file, C1790i iVar) {
        return this.f7012b.mo7680a(new C2016e(vVar.get().getBitmap(), this.f7011a), file, iVar);
    }
}
