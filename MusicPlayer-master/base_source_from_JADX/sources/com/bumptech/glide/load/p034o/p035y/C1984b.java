package com.bumptech.glide.load.p034o.p035y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.p029o.C1771b;
import com.bumptech.glide.load.data.p029o.C1772c;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p034o.C1952o;
import com.bumptech.glide.load.p034o.C1958r;
import com.bumptech.glide.p050r.C2178d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.b */
/* compiled from: MediaStoreImageThumbLoader */
public class C1984b implements C1950n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f6976a;

    /* renamed from: com.bumptech.glide.load.o.y.b$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C1985a implements C1952o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f6977a;

        public C1985a(Context context) {
            this.f6977a = context;
        }

        /* renamed from: b */
        public C1950n<Uri, InputStream> mo8008b(C1958r rVar) {
            return new C1984b(this.f6977a);
        }
    }

    public C1984b(Context context) {
        this.f6976a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C1950n.C1951a<InputStream> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        if (C1771b.m8786d(i, i2)) {
            return new C1950n.C1951a<>(new C2178d(uri), C1772c.m8789f(this.f6976a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        return C1771b.m8783a(uri);
    }
}
