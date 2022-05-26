package com.bumptech.glide.load.p034o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.data.p029o.C1771b;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p050r.C2178d;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.o.k */
/* compiled from: MediaStoreFileLoader */
public final class C1943k implements C1950n<Uri, File> {

    /* renamed from: a */
    private final Context f6920a;

    /* renamed from: com.bumptech.glide.load.o.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C1944a implements C1952o<Uri, File> {

        /* renamed from: a */
        private final Context f6921a;

        public C1944a(Context context) {
            this.f6921a = context;
        }

        /* renamed from: b */
        public C1950n<Uri, File> mo8008b(C1958r rVar) {
            return new C1943k(this.f6921a);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C1945b implements C1752d<File> {

        /* renamed from: i */
        private static final String[] f6922i = {"_data"};

        /* renamed from: g */
        private final Context f6923g;

        /* renamed from: h */
        private final Uri f6924h;

        C1945b(Context context, Uri uri) {
            this.f6923g = context;
            this.f6924h = uri;
        }

        /* renamed from: a */
        public Class<File> mo7688a() {
            return File.class;
        }

        /* renamed from: b */
        public void mo7693b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C1744a mo7696d() {
            return C1744a.LOCAL;
        }

        /* renamed from: e */
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super File> aVar) {
            Cursor query = this.f6923g.getContentResolver().query(this.f6924h, f6922i, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo7704c(new FileNotFoundException("Failed to find file path for: " + this.f6924h));
                return;
            }
            aVar.mo7705f(new File(str));
        }
    }

    public C1943k(Context context) {
        this.f6920a = context;
    }

    /* renamed from: c */
    public C1950n.C1951a<File> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(uri), new C1945b(this.f6920a, uri));
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        return C1771b.m8784b(uri);
    }
}
