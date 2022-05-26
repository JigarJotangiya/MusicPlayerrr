package com.bumptech.glide.load.p034o;

import android.net.Uri;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p034o.C1950n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.x */
/* compiled from: UrlUriLoader */
public class C1980x<Data> implements C1950n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f6971b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    private final C1950n<C1937g, Data> f6972a;

    /* renamed from: com.bumptech.glide.load.o.x$a */
    /* compiled from: UrlUriLoader */
    public static class C1981a implements C1952o<Uri, InputStream> {
        /* renamed from: b */
        public C1950n<Uri, InputStream> mo8008b(C1958r rVar) {
            return new C1980x(rVar.mo8062d(C1937g.class, InputStream.class));
        }
    }

    public C1980x(C1950n<C1937g, Data> nVar) {
        this.f6972a = nVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        return this.f6972a.mo8004b(new C1937g(uri.toString()), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        return f6971b.contains(uri.getScheme());
    }
}
