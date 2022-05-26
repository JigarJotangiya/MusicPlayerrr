package com.airbnb.lottie.p023w;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.airbnb.lottie.w.b */
/* compiled from: DefaultLottieNetworkFetcher */
public class C1621b implements C1625f {
    /* renamed from: a */
    public C1623d mo7404a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C1620a(httpURLConnection);
    }
}
