package com.bumptech.glide.p047q.p048l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.q.l.f */
/* compiled from: ImageViewTargetFactory */
public class C2163f {
    /* renamed from: a */
    public <Z> C2167j<ImageView, Z> mo8451a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C2159b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2161d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
