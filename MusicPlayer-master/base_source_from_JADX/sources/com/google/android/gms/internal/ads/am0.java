package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import com.google.android.gms.common.util.C3358c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class am0 implements ml0 {

    /* renamed from: a */
    private final String f13977a;

    public am0() {
        this.f13977a = null;
    }

    public am0(String str) {
        this.f13977a = str;
    }

    /* renamed from: p */
    public void mo11120p(String str) {
        String str2;
        HttpURLConnection httpURLConnection;
        try {
            if (C3358c.m14436a()) {
                TrafficStats.setThreadStatsTag(263);
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Pinging URL: ".concat(valueOf);
            } else {
                str2 = new String("Pinging URL: ");
            }
            ul0.m31857b(str2);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            C4980cv.m22123b();
            String str3 = this.f13977a;
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setReadTimeout(60000);
            if (str3 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str3);
            }
            httpURLConnection.setUseCaches(false);
            tl0 tl0 = new tl0((String) null);
            tl0.mo21105c(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            tl0.mo21107e(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                ul0.m31862g(sb.toString());
            }
            httpURLConnection.disconnect();
            if (C3358c.m14436a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            ul0.m31862g(sb2.toString());
            if (C3358c.m14436a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                ul0.m31862g(sb3.toString());
            } finally {
                if (C3358c.m14436a()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
