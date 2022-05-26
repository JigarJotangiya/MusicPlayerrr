package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3032r0;
import com.google.android.gms.common.util.C3359d;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lm1 {

    /* renamed from: a */
    private final C3032r0 f19456a;

    /* renamed from: b */
    private final C3359d f19457b;

    /* renamed from: c */
    private final Executor f19458c;

    public lm1(C3032r0 r0Var, C3359d dVar, Executor executor) {
        this.f19456a = r0Var;
        this.f19457b = dVar;
        this.f19458c = executor;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Bitmap m26782a(lm1 lm1, byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22448W3)).booleanValue()) {
            options.inJustDecodeBounds = true;
            lm1.m26783c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22455X3)).intValue())) / 2);
            }
        }
        return lm1.m26783c(bArr, options);
    }

    /* renamed from: c */
    private final Bitmap m26783c(byte[] bArr, BitmapFactory.Options options) {
        long b = this.f19457b.mo11989b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = this.f19457b.mo11989b();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b2 - b;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            C3018m1.m13388k(sb.toString());
        }
        return decodeByteArray;
    }

    /* renamed from: b */
    public final d93<Bitmap> mo19185b(String str, double d, boolean z) {
        return s83.m30611m(this.f19456a.mo11109a(str), new km1(this, d, z), this.f19458c);
    }
}
