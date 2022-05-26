package com.bumptech.glide.load.p036p.p039f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.p030n.C1902v;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.f.d */
/* compiled from: ResourceDrawableDecoder */
public class C2062d implements C1792k<Uri, Drawable> {

    /* renamed from: a */
    private final Context f7103a;

    public C2062d(Context context) {
        this.f7103a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m9670d(Uri uri, String str) {
        if (str.equals(this.f7103a.getPackageName())) {
            return this.f7103a;
        }
        try {
            return this.f7103a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f7103a.getPackageName())) {
                return this.f7103a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    private int m9671e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m9672f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m9673g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m9672f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m9671e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public C1902v<Drawable> mo7749b(Uri uri, int i, int i2, C1790i iVar) {
        Context d = m9670d(uri, uri.getAuthority());
        return C2061c.m9666f(C2059a.m9660b(this.f7103a, d, m9673g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo7748a(Uri uri, C1790i iVar) {
        return uri.getScheme().equals("android.resource");
    }
}
