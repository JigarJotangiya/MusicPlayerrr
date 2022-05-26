package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.data.C1752d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
/* compiled from: LocalUriFetcher */
public abstract class C1767l<T> implements C1752d<T> {

    /* renamed from: g */
    private final Uri f6545g;

    /* renamed from: h */
    private final ContentResolver f6546h;

    /* renamed from: i */
    private T f6547i;

    public C1767l(ContentResolver contentResolver, Uri uri) {
        this.f6546h = contentResolver;
        this.f6545g = uri;
    }

    /* renamed from: b */
    public void mo7693b() {
        T t = this.f6547i;
        if (t != null) {
            try {
                mo7689c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo7689c(T t) throws IOException;

    public void cancel() {
    }

    /* renamed from: d */
    public C1744a mo7696d() {
        return C1744a.LOCAL;
    }

    /* renamed from: e */
    public final void mo7697e(C1730g gVar, C1752d.C1753a<? super T> aVar) {
        try {
            T f = mo7690f(this.f6545g, this.f6546h);
            this.f6547i = f;
            aVar.mo7705f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo7704c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo7690f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
