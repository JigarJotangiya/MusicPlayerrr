package com.bumptech.glide.load.data.p029o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.data.C1759g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.o.c */
/* compiled from: ThumbFetcher */
public class C1772c implements C1752d<InputStream> {

    /* renamed from: g */
    private final Uri f6549g;

    /* renamed from: h */
    private final C1776e f6550h;

    /* renamed from: i */
    private InputStream f6551i;

    /* renamed from: com.bumptech.glide.load.data.o.c$a */
    /* compiled from: ThumbFetcher */
    static class C1773a implements C1775d {

        /* renamed from: b */
        private static final String[] f6552b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f6553a;

        C1773a(ContentResolver contentResolver) {
            this.f6553a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo7729a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6553a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6552b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.o.c$b */
    /* compiled from: ThumbFetcher */
    static class C1774b implements C1775d {

        /* renamed from: b */
        private static final String[] f6554b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f6555a;

        C1774b(ContentResolver contentResolver) {
            this.f6555a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo7729a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6555a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6554b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    C1772c(Uri uri, C1776e eVar) {
        this.f6549g = uri;
        this.f6550h = eVar;
    }

    /* renamed from: c */
    private static C1772c m8788c(Context context, Uri uri, C1775d dVar) {
        return new C1772c(uri, new C1776e(C1719b.m8591c(context).mo7588j().mo7617g(), dVar, C1719b.m8591c(context).mo7583e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C1772c m8789f(Context context, Uri uri) {
        return m8788c(context, uri, new C1773a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C1772c m8790g(Context context, Uri uri) {
        return m8788c(context, uri, new C1774b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m8791h() throws FileNotFoundException {
        InputStream d = this.f6550h.mo7731d(this.f6549g);
        int a = d != null ? this.f6550h.mo7730a(this.f6549g) : -1;
        return a != -1 ? new C1759g(d, a) : d;
    }

    /* renamed from: a */
    public Class<InputStream> mo7688a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo7693b() {
        InputStream inputStream = this.f6551i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public void cancel() {
    }

    /* renamed from: d */
    public C1744a mo7696d() {
        return C1744a.LOCAL;
    }

    /* renamed from: e */
    public void mo7697e(C1730g gVar, C1752d.C1753a<? super InputStream> aVar) {
        try {
            InputStream h = m8791h();
            this.f6551i = h;
            aVar.mo7705f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo7704c(e);
        }
    }
}
