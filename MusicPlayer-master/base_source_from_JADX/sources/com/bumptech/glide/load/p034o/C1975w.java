package com.bumptech.glide.load.p034o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1749a;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.data.C1761i;
import com.bumptech.glide.load.data.C1769n;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.w */
/* compiled from: UriLoader */
public class C1975w<Data> implements C1950n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f6966b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C1978c<Data> f6967a;

    /* renamed from: com.bumptech.glide.load.o.w$a */
    /* compiled from: UriLoader */
    public static final class C1976a implements C1952o<Uri, AssetFileDescriptor>, C1978c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f6968a;

        public C1976a(ContentResolver contentResolver) {
            this.f6968a = contentResolver;
        }

        /* renamed from: a */
        public C1752d<AssetFileDescriptor> mo8075a(Uri uri) {
            return new C1749a(this.f6968a, uri);
        }

        /* renamed from: b */
        public C1950n<Uri, AssetFileDescriptor> mo8008b(C1958r rVar) {
            return new C1975w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.w$b */
    /* compiled from: UriLoader */
    public static class C1977b implements C1952o<Uri, ParcelFileDescriptor>, C1978c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f6969a;

        public C1977b(ContentResolver contentResolver) {
            this.f6969a = contentResolver;
        }

        /* renamed from: a */
        public C1752d<ParcelFileDescriptor> mo8075a(Uri uri) {
            return new C1761i(this.f6969a, uri);
        }

        /* renamed from: b */
        public C1950n<Uri, ParcelFileDescriptor> mo8008b(C1958r rVar) {
            return new C1975w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.w$c */
    /* compiled from: UriLoader */
    public interface C1978c<Data> {
        /* renamed from: a */
        C1752d<Data> mo8075a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.o.w$d */
    /* compiled from: UriLoader */
    public static class C1979d implements C1952o<Uri, InputStream>, C1978c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f6970a;

        public C1979d(ContentResolver contentResolver) {
            this.f6970a = contentResolver;
        }

        /* renamed from: a */
        public C1752d<InputStream> mo8075a(Uri uri) {
            return new C1769n(this.f6970a, uri);
        }

        /* renamed from: b */
        public C1950n<Uri, InputStream> mo8008b(C1958r rVar) {
            return new C1975w(this);
        }
    }

    public C1975w(C1978c<Data> cVar) {
        this.f6967a = cVar;
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(uri), this.f6967a.mo8075a(uri));
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        return f6966b.contains(uri.getScheme());
    }
}
