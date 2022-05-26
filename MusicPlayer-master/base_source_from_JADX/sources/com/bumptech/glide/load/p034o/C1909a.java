package com.bumptech.glide.load.p034o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.data.C1760h;
import com.bumptech.glide.load.data.C1768m;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.a */
/* compiled from: AssetUriLoader */
public class C1909a<Data> implements C1950n<Uri, Data> {

    /* renamed from: c */
    private static final int f6887c = 22;

    /* renamed from: a */
    private final AssetManager f6888a;

    /* renamed from: b */
    private final C1910a<Data> f6889b;

    /* renamed from: com.bumptech.glide.load.o.a$a */
    /* compiled from: AssetUriLoader */
    public interface C1910a<Data> {
        /* renamed from: a */
        C1752d<Data> mo8007a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.o.a$b */
    /* compiled from: AssetUriLoader */
    public static class C1911b implements C1952o<Uri, ParcelFileDescriptor>, C1910a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f6890a;

        public C1911b(AssetManager assetManager) {
            this.f6890a = assetManager;
        }

        /* renamed from: a */
        public C1752d<ParcelFileDescriptor> mo8007a(AssetManager assetManager, String str) {
            return new C1760h(assetManager, str);
        }

        /* renamed from: b */
        public C1950n<Uri, ParcelFileDescriptor> mo8008b(C1958r rVar) {
            return new C1909a(this.f6890a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a$c */
    /* compiled from: AssetUriLoader */
    public static class C1912c implements C1952o<Uri, InputStream>, C1910a<InputStream> {

        /* renamed from: a */
        private final AssetManager f6891a;

        public C1912c(AssetManager assetManager) {
            this.f6891a = assetManager;
        }

        /* renamed from: a */
        public C1752d<InputStream> mo8007a(AssetManager assetManager, String str) {
            return new C1768m(assetManager, str);
        }

        /* renamed from: b */
        public C1950n<Uri, InputStream> mo8008b(C1958r rVar) {
            return new C1909a(this.f6891a, this);
        }
    }

    public C1909a(AssetManager assetManager, C1910a<Data> aVar) {
        this.f6888a = assetManager;
        this.f6889b = aVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(uri), this.f6889b.mo8007a(this.f6888a, uri.toString().substring(f6887c)));
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
