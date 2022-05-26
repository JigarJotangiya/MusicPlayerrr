package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1777e;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p034o.C1937g;
import com.bumptech.glide.p051s.C2183c;
import com.bumptech.glide.p051s.C2188f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.j */
/* compiled from: HttpUrlFetcher */
public class C1762j implements C1752d<InputStream> {

    /* renamed from: m */
    static final C1764b f6536m = new C1763a();

    /* renamed from: g */
    private final C1937g f6537g;

    /* renamed from: h */
    private final int f6538h;

    /* renamed from: i */
    private final C1764b f6539i;

    /* renamed from: j */
    private HttpURLConnection f6540j;

    /* renamed from: k */
    private InputStream f6541k;

    /* renamed from: l */
    private volatile boolean f6542l;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C1763a implements C1764b {
        C1763a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo7718a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C1764b {
        /* renamed from: a */
        HttpURLConnection mo7718a(URL url) throws IOException;
    }

    public C1762j(C1937g gVar, int i) {
        this(gVar, i, f6536m);
    }

    /* renamed from: c */
    private HttpURLConnection m8744c(URL url, Map<String, String> map) throws C1777e {
        try {
            HttpURLConnection a = this.f6539i.mo7718a(url);
            for (Map.Entry next : map.entrySet()) {
                a.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            a.setConnectTimeout(this.f6538h);
            a.setReadTimeout(this.f6538h);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setInstanceFollowRedirects(false);
            return a;
        } catch (IOException e) {
            throw new C1777e("URL.openConnection threw", 0, e);
        }
    }

    /* renamed from: f */
    private static int m8745f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    /* renamed from: g */
    private InputStream m8746g(HttpURLConnection httpURLConnection) throws C1777e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f6541k = C2183c.m10245d(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f6541k = httpURLConnection.getInputStream();
            }
            return this.f6541k;
        } catch (IOException e) {
            throw new C1777e("Failed to obtain InputStream", m8745f(httpURLConnection), e);
        }
    }

    /* renamed from: h */
    private static boolean m8747h(int i) {
        return i / 100 == 2;
    }

    /* renamed from: i */
    private static boolean m8748i(int i) {
        return i / 100 == 3;
    }

    /* renamed from: j */
    private InputStream m8749j(URL url, int i, URL url2, Map<String, String> map) throws C1777e {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C1777e("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = m8744c(url, map);
            this.f6540j = c;
            try {
                c.connect();
                this.f6541k = this.f6540j.getInputStream();
                if (this.f6542l) {
                    return null;
                }
                int f = m8745f(this.f6540j);
                if (m8747h(f)) {
                    return m8746g(this.f6540j);
                }
                if (m8748i(f)) {
                    String headerField = this.f6540j.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo7693b();
                            return m8749j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new C1777e("Bad redirect url: " + headerField, f, e);
                        }
                    } else {
                        throw new C1777e("Received empty or null redirect url", f);
                    }
                } else if (f == -1) {
                    throw new C1777e(f);
                } else {
                    try {
                        throw new C1777e(this.f6540j.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new C1777e("Failed to get a response message", f, e2);
                    }
                }
            } catch (IOException e3) {
                throw new C1777e("Failed to connect or obtain data", m8745f(this.f6540j), e3);
            }
        } else {
            throw new C1777e("Too many (> 5) redirects!", -1);
        }
    }

    /* renamed from: a */
    public Class<InputStream> mo7688a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo7693b() {
        InputStream inputStream = this.f6541k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6540j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6540j = null;
    }

    public void cancel() {
        this.f6542l = true;
    }

    /* renamed from: d */
    public C1744a mo7696d() {
        return C1744a.REMOTE;
    }

    /* renamed from: e */
    public void mo7697e(C1730g gVar, C1752d.C1753a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C2188f.m10253b();
        try {
            aVar.mo7705f(m8749j(this.f6537g.mo8034h(), 0, (URL) null, this.f6537g.mo8033e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C2188f.m10252a(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo7704c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C2188f.m10252a(b));
            }
            throw th;
        }
    }

    C1762j(C1937g gVar, int i, C1764b bVar) {
        this.f6537g = gVar;
        this.f6538h = i;
        this.f6539i = bVar;
    }
}
