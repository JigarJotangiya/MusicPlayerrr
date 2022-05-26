package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.C3258c;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3248a implements Runnable {

    /* renamed from: g */
    private final Uri f10521g;

    /* renamed from: h */
    private final ParcelFileDescriptor f10522h;

    /* renamed from: i */
    final /* synthetic */ ImageManager f10523i;

    public C3248a(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f10521g = uri;
        this.f10522h = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        C3258c.m14105b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f10522h;
        Bitmap bitmap2 = null;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                String valueOf = String.valueOf(this.f10521g);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("OOM while loading bitmap for uri: ");
                sb.append(valueOf);
                Log.e("ImageManager", sb.toString(), e);
                z2 = true;
            }
            try {
                this.f10522h.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            bitmap = null;
            z = false;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f10523i.f10508b.post(new C3249b(this.f10523i, this.f10521g, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            String valueOf2 = String.valueOf(this.f10521g);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
            sb2.append("Latch interrupted while posting ");
            sb2.append(valueOf2);
            Log.w("ImageManager", sb2.toString());
        }
    }
}
