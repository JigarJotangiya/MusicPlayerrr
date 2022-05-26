package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class iz1 implements y73 {
    public /* synthetic */ iz1(wz1 wz1) {
    }

    /* renamed from: b */
    public final d93 mo10692b(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        hm0.f17708a.execute(new mq2((InputStream) obj, createPipe[1]));
        return s83.m30607i(parcelFileDescriptor);
    }
}
