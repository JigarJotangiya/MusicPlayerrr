package com.bumptech.glide.load.p034o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.p034o.C1950n;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.s */
/* compiled from: ResourceLoader */
public class C1962s<Data> implements C1950n<Integer, Data> {

    /* renamed from: a */
    private final C1950n<Uri, Data> f6955a;

    /* renamed from: b */
    private final Resources f6956b;

    /* renamed from: com.bumptech.glide.load.o.s$a */
    /* compiled from: ResourceLoader */
    public static final class C1963a implements C1952o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f6957a;

        public C1963a(Resources resources) {
            this.f6957a = resources;
        }

        /* renamed from: b */
        public C1950n<Integer, AssetFileDescriptor> mo8008b(C1958r rVar) {
            return new C1962s(this.f6957a, rVar.mo8062d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$b */
    /* compiled from: ResourceLoader */
    public static class C1964b implements C1952o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f6958a;

        public C1964b(Resources resources) {
            this.f6958a = resources;
        }

        /* renamed from: b */
        public C1950n<Integer, ParcelFileDescriptor> mo8008b(C1958r rVar) {
            return new C1962s(this.f6958a, rVar.mo8062d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$c */
    /* compiled from: ResourceLoader */
    public static class C1965c implements C1952o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f6959a;

        public C1965c(Resources resources) {
            this.f6959a = resources;
        }

        /* renamed from: b */
        public C1950n<Integer, InputStream> mo8008b(C1958r rVar) {
            return new C1962s(this.f6959a, rVar.mo8062d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.s$d */
    /* compiled from: ResourceLoader */
    public static class C1966d implements C1952o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f6960a;

        public C1966d(Resources resources) {
            this.f6960a = resources;
        }

        /* renamed from: b */
        public C1950n<Integer, Uri> mo8008b(C1958r rVar) {
            return new C1962s(this.f6960a, C1972v.m9380c());
        }
    }

    public C1962s(Resources resources, C1950n<Uri, Data> nVar) {
        this.f6956b = resources;
        this.f6955a = nVar;
    }

    /* renamed from: d */
    private Uri m9360d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f6956b.getResourcePackageName(num.intValue()) + '/' + this.f6956b.getResourceTypeName(num.intValue()) + '/' + this.f6956b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public C1950n.C1951a<Data> mo8004b(Integer num, int i, int i2, C1790i iVar) {
        Uri d = m9360d(num);
        if (d == null) {
            return null;
        }
        return this.f6955a.mo8004b(d, i, i2, iVar);
    }

    /* renamed from: e */
    public boolean mo8003a(Integer num) {
        return true;
    }
}
