package com.bumptech.glide.load.p034o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p034o.C1950n;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.u */
/* compiled from: StringLoader */
public class C1968u<Data> implements C1950n<String, Data> {

    /* renamed from: a */
    private final C1950n<Uri, Data> f6962a;

    /* renamed from: com.bumptech.glide.load.o.u$a */
    /* compiled from: StringLoader */
    public static final class C1969a implements C1952o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public C1950n<String, AssetFileDescriptor> mo8008b(C1958r rVar) {
            return new C1968u(rVar.mo8062d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.u$b */
    /* compiled from: StringLoader */
    public static class C1970b implements C1952o<String, ParcelFileDescriptor> {
        /* renamed from: b */
        public C1950n<String, ParcelFileDescriptor> mo8008b(C1958r rVar) {
            return new C1968u(rVar.mo8062d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.u$c */
    /* compiled from: StringLoader */
    public static class C1971c implements C1952o<String, InputStream> {
        /* renamed from: b */
        public C1950n<String, InputStream> mo8008b(C1958r rVar) {
            return new C1968u(rVar.mo8062d(Uri.class, InputStream.class));
        }
    }

    public C1968u(C1950n<Uri, Data> nVar) {
        this.f6962a = nVar;
    }

    /* renamed from: e */
    private static Uri m9371e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m9372f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m9372f(str) : parse;
    }

    /* renamed from: f */
    private static Uri m9372f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(String str, int i, int i2, C1790i iVar) {
        Uri e = m9371e(str);
        if (e == null || !this.f6962a.mo8003a(e)) {
            return null;
        }
        return this.f6962a.mo8004b(e, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo8003a(String str) {
        return true;
    }
}
