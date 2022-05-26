package com.airbnb.lottie.p023w;

import com.airbnb.lottie.p026y.C1679d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: com.airbnb.lottie.w.a */
/* compiled from: DefaultLottieFetchResult */
public class C1620a implements C1623d {

    /* renamed from: g */
    private final HttpURLConnection f6220g;

    public C1620a(HttpURLConnection httpURLConnection) {
        this.f6220g = httpURLConnection;
    }

    /* renamed from: c */
    private String m8236c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* renamed from: W */
    public String mo7399W() {
        try {
            if (mo7403q0()) {
                return null;
            }
            return "Unable to fetch " + this.f6220g.getURL() + ". Failed with " + this.f6220g.getResponseCode() + "\n" + m8236c(this.f6220g);
        } catch (IOException e) {
            C1679d.m8417d("get error failed ", e);
            return e.getMessage();
        }
    }

    /* renamed from: c0 */
    public InputStream mo7400c0() throws IOException {
        return this.f6220g.getInputStream();
    }

    public void close() {
        this.f6220g.disconnect();
    }

    public String contentType() {
        return this.f6220g.getContentType();
    }

    /* renamed from: q0 */
    public boolean mo7403q0() {
        try {
            return this.f6220g.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
