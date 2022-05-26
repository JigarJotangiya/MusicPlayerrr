package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
/* compiled from: FileDescriptorAssetPathFetcher */
public class C1760h extends C1750b<ParcelFileDescriptor> {
    public C1760h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo7688a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7694c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ParcelFileDescriptor mo7698f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
