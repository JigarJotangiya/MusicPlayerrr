package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class gq0 implements q03 {

    /* renamed from: a */
    public final /* synthetic */ String f17228a;

    public /* synthetic */ gq0(String str) {
        this.f17228a = str;
    }

    public final URLConnection zza() {
        String str;
        String str2;
        String str3 = this.f17228a;
        int i = hq0.f17742n;
        C2971s.m13221x();
        int intValue = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22608r)).intValue();
        URL url = new URL(str3);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    tl0 tl0 = new tl0((String) null);
                    tl0.mo21105c(httpURLConnection, (byte[]) null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    tl0.mo21107e(httpURLConnection, responseCode);
                    if (responseCode / 100 != 3) {
                        return httpURLConnection;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            throw new IOException("Protocol is null");
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            if (headerField.length() != 0) {
                                str = "Redirecting to ".concat(headerField);
                            } else {
                                str = new String("Redirecting to ");
                            }
                            ul0.m31857b(str);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            if (protocol.length() != 0) {
                                str2 = "Unsupported scheme: ".concat(protocol);
                            } else {
                                str2 = new String("Unsupported scheme: ");
                            }
                            throw new IOException(str2);
                        }
                    } else {
                        throw new IOException("Missing Location header in redirect");
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }
}
