package net.coocent.android.xmlparser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: net.coocent.android.xmlparser.p */
/* compiled from: HttpService */
public class C9487p {
    /* renamed from: a */
    public static HttpEntity m49878a(String str, ArrayList<BasicNameValuePair> arrayList, int i) throws IOException {
        HttpUriRequest httpUriRequest;
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        defaultHttpClient.getParams().setParameter("http.connection.timeout", 3000);
        if (i == 1) {
            StringBuilder sb = new StringBuilder(str);
            if (arrayList != null && !arrayList.isEmpty()) {
                sb.append('?');
                Iterator<BasicNameValuePair> it = arrayList.iterator();
                while (it.hasNext()) {
                    BasicNameValuePair next = it.next();
                    sb.append(next.getName());
                    sb.append('=');
                    sb.append(next.getValue());
                    sb.append('&');
                }
                sb.deleteCharAt(sb.length() - 1);
            }
            httpUriRequest = new HttpGet(sb.toString());
        } else if (i != 2) {
            httpUriRequest = null;
        } else {
            httpUriRequest = new HttpPost(str);
            if (arrayList != null && !arrayList.isEmpty()) {
                httpUriRequest.setEntity(new UrlEncodedFormEntity(arrayList));
            }
        }
        HttpResponse execute = defaultHttpClient.execute(httpUriRequest);
        if (execute.getStatusLine().getStatusCode() == 200) {
            return execute.getEntity();
        }
        return null;
    }

    /* renamed from: b */
    public static InputStream m49879b(String str, ArrayList<BasicNameValuePair> arrayList, int i) throws IOException {
        HttpEntity a = m49878a(str, arrayList, i);
        if (a != null) {
            return a.getContent();
        }
        return null;
    }
}
