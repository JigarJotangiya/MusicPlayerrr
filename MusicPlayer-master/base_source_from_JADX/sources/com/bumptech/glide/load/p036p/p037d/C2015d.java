package com.bumptech.glide.load.p036p.p037d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.load.p030n.p031a0.C1808f;
import com.bumptech.glide.load.p036p.C1995a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.d.d */
/* compiled from: BitmapImageDecoderResourceDecoder */
public final class C2015d extends C1995a<Bitmap> {

    /* renamed from: b */
    private final C1807e f7025b = new C1808f();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1902v<Bitmap> mo8088c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C2016e(decodeBitmap, this.f7025b);
    }
}
