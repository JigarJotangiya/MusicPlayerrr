package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xd0 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    final /* synthetic */ String f25756g;

    /* renamed from: h */
    final /* synthetic */ String f25757h;

    /* renamed from: i */
    final /* synthetic */ zd0 f25758i;

    xd0(zd0 zd0, String str, String str2) {
        this.f25758i = zd0;
        this.f25756g = str;
        this.f25757h = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f25758i.f26742d.getSystemService("download");
        try {
            String str = this.f25756g;
            String str2 = this.f25757h;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C2971s.m13214q();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f25758i.mo16610c("Could not store picture.");
        }
    }
}
