package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
/* compiled from: StreamAssetPathFetcher */
public class C1768m extends C1750b<InputStream> {
    public C1768m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<InputStream> mo7688a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7694c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo7698f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
