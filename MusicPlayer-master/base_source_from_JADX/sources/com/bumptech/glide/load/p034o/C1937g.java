package com.bumptech.glide.load.p034o;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.p051s.C2193j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.g */
/* compiled from: GlideUrl */
public class C1937g implements C1786g {

    /* renamed from: b */
    private final C1938h f6906b;

    /* renamed from: c */
    private final URL f6907c;

    /* renamed from: d */
    private final String f6908d;

    /* renamed from: e */
    private String f6909e;

    /* renamed from: f */
    private URL f6910f;

    /* renamed from: g */
    private volatile byte[] f6911g;

    /* renamed from: h */
    private int f6912h;

    public C1937g(URL url) {
        this(url, C1938h.f6913a);
    }

    /* renamed from: d */
    private byte[] m9296d() {
        if (this.f6911g == null) {
            this.f6911g = mo8032c().getBytes(C1786g.f6570a);
        }
        return this.f6911g;
    }

    /* renamed from: f */
    private String m9297f() {
        if (TextUtils.isEmpty(this.f6909e)) {
            String str = this.f6908d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f6907c;
                C2193j.m10269d(url);
                str = url.toString();
            }
            this.f6909e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f6909e;
    }

    /* renamed from: g */
    private URL m9298g() throws MalformedURLException {
        if (this.f6910f == null) {
            this.f6910f = new URL(m9297f());
        }
        return this.f6910f;
    }

    /* renamed from: a */
    public void mo7735a(MessageDigest messageDigest) {
        messageDigest.update(m9296d());
    }

    /* renamed from: c */
    public String mo8032c() {
        String str = this.f6908d;
        if (str != null) {
            return str;
        }
        URL url = this.f6907c;
        C2193j.m10269d(url);
        return url.toString();
    }

    /* renamed from: e */
    public Map<String, String> mo8033e() {
        return this.f6906b.mo8036a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1937g)) {
            return false;
        }
        C1937g gVar = (C1937g) obj;
        if (!mo8032c().equals(gVar.mo8032c()) || !this.f6906b.equals(gVar.f6906b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public URL mo8034h() throws MalformedURLException {
        return m9298g();
    }

    public int hashCode() {
        if (this.f6912h == 0) {
            int hashCode = mo8032c().hashCode();
            this.f6912h = hashCode;
            this.f6912h = (hashCode * 31) + this.f6906b.hashCode();
        }
        return this.f6912h;
    }

    public String toString() {
        return mo8032c();
    }

    public C1937g(String str) {
        this(str, C1938h.f6913a);
    }

    public C1937g(URL url, C1938h hVar) {
        C2193j.m10269d(url);
        this.f6907c = url;
        this.f6908d = null;
        C2193j.m10269d(hVar);
        this.f6906b = hVar;
    }

    public C1937g(String str, C1938h hVar) {
        this.f6907c = null;
        C2193j.m10267b(str);
        this.f6908d = str;
        C2193j.m10269d(hVar);
        this.f6906b = hVar;
    }
}
