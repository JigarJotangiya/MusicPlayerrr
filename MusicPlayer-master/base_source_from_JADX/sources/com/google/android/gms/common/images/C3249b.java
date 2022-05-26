package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C3258c;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
final class C3249b implements Runnable {

    /* renamed from: g */
    private final Uri f10524g;

    /* renamed from: h */
    private final Bitmap f10525h;

    /* renamed from: i */
    private final CountDownLatch f10526i;

    /* renamed from: j */
    final /* synthetic */ ImageManager f10527j;

    public C3249b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f10524g = uri;
        this.f10525h = bitmap;
        this.f10526i = countDownLatch;
    }

    public final void run() {
        C3258c.m14104a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f10525h;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f10527j.f10512f.remove(this.f10524g);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f10515h;
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C3250c cVar = (C3250c) a.get(i);
                if (this.f10525h == null || bitmap == null) {
                    this.f10527j.f10513g.put(this.f10524g, Long.valueOf(SystemClock.elapsedRealtime()));
                    cVar.mo11720c(this.f10527j.f10507a, this.f10527j.f10510d, false);
                } else {
                    cVar.mo11719b(this.f10527j.f10507a, this.f10525h, false);
                }
                this.f10527j.f10511e.remove(cVar);
            }
        }
        this.f10526i.countDown();
        synchronized (ImageManager.f10505h) {
            ImageManager.f10506i.remove(this.f10524g);
        }
    }
}
