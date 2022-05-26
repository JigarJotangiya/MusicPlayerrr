package retrofit.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

public class UrlConnectionClient implements Client {
    private static final int CHUNK_SIZE = 4096;

    private static class TypedInputStream implements TypedInput {
        private final long length;
        private final String mimeType;
        private final InputStream stream;

        /* renamed from: in */
        public InputStream mo33641in() throws IOException {
            return this.stream;
        }

        public long length() {
            return this.length;
        }

        public String mimeType() {
            return this.mimeType;
        }

        private TypedInputStream(String str, long j, InputStream inputStream) {
            this.mimeType = str;
            this.length = j;
            this.stream = inputStream;
        }
    }

    public Response execute(Request request) throws IOException {
        HttpURLConnection openConnection = openConnection(request);
        prepareRequest(openConnection, request);
        return readResponse(openConnection);
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection openConnection(Request request) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(request.getUrl()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    /* access modifiers changed from: package-private */
    public void prepareRequest(HttpURLConnection httpURLConnection, Request request) throws IOException {
        httpURLConnection.setRequestMethod(request.getMethod());
        httpURLConnection.setDoInput(true);
        for (Header next : request.getHeaders()) {
            httpURLConnection.addRequestProperty(next.getName(), next.getValue());
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", body.mimeType());
            long length = body.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                httpURLConnection.addRequestProperty("Content-Length", String.valueOf(length));
            } else {
                httpURLConnection.setChunkedStreamingMode(4096);
            }
            body.writeTo(httpURLConnection.getOutputStream());
        }
    }

    /* access modifiers changed from: package-private */
    public Response readResponse(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = BuildConfig.FLAVOR;
        }
        String str = responseMessage;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str2 = (String) entry.getKey();
            for (String header : (List) entry.getValue()) {
                arrayList.add(new Header(str2, header));
            }
        }
        String contentType = httpURLConnection.getContentType();
        int contentLength = httpURLConnection.getContentLength();
        if (responseCode >= 400) {
            inputStream = httpURLConnection.getErrorStream();
        } else {
            inputStream = httpURLConnection.getInputStream();
        }
        return new Response(httpURLConnection.getURL().toString(), responseCode, str, arrayList, new TypedInputStream(contentType, (long) contentLength, inputStream));
    }
}
