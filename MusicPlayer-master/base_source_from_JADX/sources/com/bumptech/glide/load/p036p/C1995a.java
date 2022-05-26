package com.bumptech.glide.load.p036p;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C1745b;
import com.bumptech.glide.load.C1787h;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1791j;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p036p.p037d.C2028l;
import com.bumptech.glide.load.p036p.p037d.C2034m;
import com.bumptech.glide.load.p036p.p037d.C2042r;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.p.a */
/* compiled from: ImageDecoderResourceDecoder */
public abstract class C1995a<T> implements C1792k<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C2042r f6998a = C2042r.m9589b();

    /* renamed from: com.bumptech.glide.load.p.a$a */
    /* compiled from: ImageDecoderResourceDecoder */
    class C1996a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f6999a;

        /* renamed from: b */
        final /* synthetic */ int f7000b;

        /* renamed from: c */
        final /* synthetic */ boolean f7001c;

        /* renamed from: d */
        final /* synthetic */ C1745b f7002d;

        /* renamed from: e */
        final /* synthetic */ C2028l f7003e;

        /* renamed from: f */
        final /* synthetic */ C1791j f7004f;

        /* renamed from: com.bumptech.glide.load.p.a$a$a */
        /* compiled from: ImageDecoderResourceDecoder */
        class C1997a implements ImageDecoder.OnPartialImageListener {
            C1997a(C1996a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C1996a(int i, int i2, boolean z, C1745b bVar, C2028l lVar, C1791j jVar) {
            this.f6999a = i;
            this.f7000b = i2;
            this.f7001c = z;
            this.f7002d = bVar;
            this.f7003e = lVar;
            this.f7004f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (C1995a.this.f6998a.mo8133e(this.f6999a, this.f7000b, this.f7001c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f7002d == C1745b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1997a(this));
            Size size = imageInfo.getSize();
            int i = this.f6999a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f7000b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f7003e.mo8123b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f7004f == C1791j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C1902v<T> mo8088c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: d */
    public final C1902v<T> mo7749b(ImageDecoder.Source source, int i, int i2, C1790i iVar) throws IOException {
        C1745b bVar = (C1745b) iVar.mo7744c(C2034m.f7045f);
        C2028l lVar = (C2028l) iVar.mo7744c(C2028l.f7042f);
        C1787h hVar = C2034m.f7048i;
        return mo8088c(source, i, i2, new C1996a(i, i2, iVar.mo7744c(hVar) != null && ((Boolean) iVar.mo7744c(hVar)).booleanValue(), bVar, lVar, (C1791j) iVar.mo7744c(C2034m.f7046g)));
    }

    /* renamed from: e */
    public final boolean mo7748a(ImageDecoder.Source source, C1790i iVar) {
        return true;
    }
}
