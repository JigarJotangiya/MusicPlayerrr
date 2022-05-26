package com.bumptech.glide.load.p030n.p032b0;

import android.content.Context;
import com.bumptech.glide.load.p030n.p032b0.C1833d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.b0.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C1836f extends C1833d {

    /* renamed from: com.bumptech.glide.load.n.b0.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C1837a implements C1833d.C1834a {

        /* renamed from: a */
        final /* synthetic */ Context f6646a;

        /* renamed from: b */
        final /* synthetic */ String f6647b;

        C1837a(Context context, String str) {
            this.f6646a = context;
            this.f6647b = str;
        }

        /* renamed from: a */
        public File mo7829a() {
            File cacheDir = this.f6646a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f6647b != null ? new File(cacheDir, this.f6647b) : cacheDir;
        }
    }

    public C1836f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C1836f(Context context, String str, long j) {
        super(new C1837a(context, str), j);
    }
}
