package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.data.C1752d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* compiled from: AssetPathFetcher */
public abstract class C1750b<T> implements C1752d<T> {

    /* renamed from: g */
    private final String f6521g;

    /* renamed from: h */
    private final AssetManager f6522h;

    /* renamed from: i */
    private T f6523i;

    public C1750b(AssetManager assetManager, String str) {
        this.f6522h = assetManager;
        this.f6521g = str;
    }

    /* renamed from: b */
    public void mo7693b() {
        T t = this.f6523i;
        if (t != null) {
            try {
                mo7694c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7694c(T t) throws IOException;

    public void cancel() {
    }

    /* renamed from: d */
    public C1744a mo7696d() {
        return C1744a.LOCAL;
    }

    /* renamed from: e */
    public void mo7697e(C1730g gVar, C1752d.C1753a<? super T> aVar) {
        try {
            T f = mo7698f(this.f6522h, this.f6521g);
            this.f6523i = f;
            aVar.mo7705f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo7704c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo7698f(AssetManager assetManager, String str) throws IOException;
}
