package com.coocent.videoplayer;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* renamed from: com.coocent.videoplayer.f */
/* compiled from: lambda */
public final /* synthetic */ class C2696f implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a */
    public final /* synthetic */ VideoPlayerActivity f9241a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f9242b;

    public /* synthetic */ C2696f(VideoPlayerActivity videoPlayerActivity, Bitmap bitmap) {
        this.f9241a = videoPlayerActivity;
        this.f9242b = bitmap;
    }

    public final void onPixelCopyFinished(int i) {
        VideoPlayerActivity.m12195H2(this.f9241a, this.f9242b, i);
    }
}
