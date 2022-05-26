package com.bumptech.glide.load.p034o.p035y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.p029o.C1771b;
import com.bumptech.glide.load.data.p029o.C1772c;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p034o.C1952o;
import com.bumptech.glide.load.p034o.C1958r;
import com.bumptech.glide.load.p036p.p037d.C2004b0;
import com.bumptech.glide.p050r.C2178d;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.c */
/* compiled from: MediaStoreVideoThumbLoader */
public class C1986c implements C1950n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f6978a;

    /* renamed from: com.bumptech.glide.load.o.y.c$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C1987a implements C1952o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f6979a;

        public C1987a(Context context) {
            this.f6979a = context;
        }

        /* renamed from: b */
        public C1950n<Uri, InputStream> mo8008b(C1958r rVar) {
            return new C1986c(this.f6979a);
        }
    }

    public C1986c(Context context) {
        this.f6978a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m9415e(C1790i iVar) {
        Long l = (Long) iVar.mo7744c(C2004b0.f7013d);
        return l != null && l.longValue() == -1;
    }

    /* renamed from: c */
    public C1950n.C1951a<InputStream> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        if (!C1771b.m8786d(i, i2) || !m9415e(iVar)) {
            return null;
        }
        return new C1950n.C1951a<>(new C2178d(uri), C1772c.m8790g(this.f6978a, uri));
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        return C1771b.m8785c(uri);
    }
}
