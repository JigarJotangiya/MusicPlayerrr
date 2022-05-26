package com.bumptech.glide.load.p034o.p035y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.data.p029o.C1771b;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p034o.C1952o;
import com.bumptech.glide.load.p034o.C1958r;
import com.bumptech.glide.p050r.C2178d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.y.d */
/* compiled from: QMediaStoreUriLoader */
public final class C1988d<DataT> implements C1950n<Uri, DataT> {

    /* renamed from: a */
    private final Context f6980a;

    /* renamed from: b */
    private final C1950n<File, DataT> f6981b;

    /* renamed from: c */
    private final C1950n<Uri, DataT> f6982c;

    /* renamed from: d */
    private final Class<DataT> f6983d;

    /* renamed from: com.bumptech.glide.load.o.y.d$a */
    /* compiled from: QMediaStoreUriLoader */
    private static abstract class C1989a<DataT> implements C1952o<Uri, DataT> {

        /* renamed from: a */
        private final Context f6984a;

        /* renamed from: b */
        private final Class<DataT> f6985b;

        C1989a(Context context, Class<DataT> cls) {
            this.f6984a = context;
            this.f6985b = cls;
        }

        /* renamed from: b */
        public final C1950n<Uri, DataT> mo8008b(C1958r rVar) {
            return new C1988d(this.f6984a, rVar.mo8062d(File.class, this.f6985b), rVar.mo8062d(Uri.class, this.f6985b), this.f6985b);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.y.d$b */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1990b extends C1989a<ParcelFileDescriptor> {
        public C1990b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.y.d$c */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C1991c extends C1989a<InputStream> {
        public C1991c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.y.d$d */
    /* compiled from: QMediaStoreUriLoader */
    private static final class C1992d<DataT> implements C1752d<DataT> {

        /* renamed from: q */
        private static final String[] f6986q = {"_data"};

        /* renamed from: g */
        private final Context f6987g;

        /* renamed from: h */
        private final C1950n<File, DataT> f6988h;

        /* renamed from: i */
        private final C1950n<Uri, DataT> f6989i;

        /* renamed from: j */
        private final Uri f6990j;

        /* renamed from: k */
        private final int f6991k;

        /* renamed from: l */
        private final int f6992l;

        /* renamed from: m */
        private final C1790i f6993m;

        /* renamed from: n */
        private final Class<DataT> f6994n;

        /* renamed from: o */
        private volatile boolean f6995o;

        /* renamed from: p */
        private volatile C1752d<DataT> f6996p;

        C1992d(Context context, C1950n<File, DataT> nVar, C1950n<Uri, DataT> nVar2, Uri uri, int i, int i2, C1790i iVar, Class<DataT> cls) {
            this.f6987g = context.getApplicationContext();
            this.f6988h = nVar;
            this.f6989i = nVar2;
            this.f6990j = uri;
            this.f6991k = i;
            this.f6992l = i2;
            this.f6993m = iVar;
            this.f6994n = cls;
        }

        /* renamed from: c */
        private C1950n.C1951a<DataT> m9426c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f6988h.mo8004b(m9429h(this.f6990j), this.f6991k, this.f6992l, this.f6993m);
            }
            return this.f6989i.mo8004b(m9428g() ? MediaStore.setRequireOriginal(this.f6990j) : this.f6990j, this.f6991k, this.f6992l, this.f6993m);
        }

        /* renamed from: f */
        private C1752d<DataT> m9427f() throws FileNotFoundException {
            C1950n.C1951a c = m9426c();
            if (c != null) {
                return c.f6932c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m9428g() {
            return this.f6987g.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        private File m9429h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.f6987g.getContentResolver().query(uri, f6986q, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }

        /* renamed from: a */
        public Class<DataT> mo7688a() {
            return this.f6994n;
        }

        /* renamed from: b */
        public void mo7693b() {
            C1752d<DataT> dVar = this.f6996p;
            if (dVar != null) {
                dVar.mo7693b();
            }
        }

        public void cancel() {
            this.f6995o = true;
            C1752d<DataT> dVar = this.f6996p;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* renamed from: d */
        public C1744a mo7696d() {
            return C1744a.LOCAL;
        }

        /* renamed from: e */
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super DataT> aVar) {
            try {
                C1752d<DataT> f = m9427f();
                if (f == null) {
                    aVar.mo7704c(new IllegalArgumentException("Failed to build fetcher for: " + this.f6990j));
                    return;
                }
                this.f6996p = f;
                if (this.f6995o) {
                    cancel();
                } else {
                    f.mo7697e(gVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo7704c(e);
            }
        }
    }

    C1988d(Context context, C1950n<File, DataT> nVar, C1950n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f6980a = context.getApplicationContext();
        this.f6981b = nVar;
        this.f6982c = nVar2;
        this.f6983d = cls;
    }

    /* renamed from: c */
    public C1950n.C1951a<DataT> mo8004b(Uri uri, int i, int i2, C1790i iVar) {
        return new C1950n.C1951a<>(new C2178d(uri), new C1992d(this.f6980a, this.f6981b, this.f6982c, uri, i, i2, iVar, this.f6983d));
    }

    /* renamed from: d */
    public boolean mo8003a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C1771b.m8784b(uri);
    }
}
