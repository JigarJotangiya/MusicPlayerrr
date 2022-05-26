package retrofit.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.C7832q;
import p159f.p334h.p337b.C7833r;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7839u;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.C7845w;
import p394k.C8636f;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

public class OkClient implements Client {
    private final C7833r client;

    public OkClient() {
        this(generateDefaultOkHttp());
    }

    private static List<Header> createHeaders(C7827o oVar) {
        int f = oVar.mo29160f();
        ArrayList arrayList = new ArrayList(f);
        for (int i = 0; i < f; i++) {
            arrayList.add(new Header(oVar.mo29158d(i), oVar.mo29161g(i)));
        }
        return arrayList;
    }

    static C7836t createRequest(Request request) {
        C7836t.C7838b bVar = new C7836t.C7838b();
        bVar.mo29230l(request.getUrl());
        bVar.mo29228j(request.getMethod(), createRequestBody(request.getBody()));
        List<Header> headers = request.getHeaders();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            Header header = headers.get(i);
            String value = header.getValue();
            if (value == null) {
                value = BuildConfig.FLAVOR;
            }
            bVar.mo29225g(header.getName(), value);
        }
        return bVar.mo29226h();
    }

    private static C7839u createRequestBody(final TypedOutput typedOutput) {
        if (typedOutput == null) {
            return null;
        }
        final C7832q b = C7832q.m42898b(typedOutput.mimeType());
        return new C7839u() {
            public long contentLength() {
                return typedOutput.length();
            }

            public C7832q contentType() {
                return b;
            }

            public void writeTo(C8636f fVar) throws IOException {
                typedOutput.writeTo(fVar.mo30674J0());
            }
        };
    }

    private static TypedInput createResponseBody(final C7845w wVar) {
        if (wVar.mo29263d() == 0) {
            return null;
        }
        return new TypedInput() {
            /* renamed from: in */
            public InputStream mo33641in() throws IOException {
                return wVar.mo29261c();
            }

            public long length() {
                return wVar.mo29263d();
            }

            public String mimeType() {
                C7832q p = wVar.mo29264p();
                if (p == null) {
                    return null;
                }
                return p.toString();
            }
        };
    }

    private static C7833r generateDefaultOkHttp() {
        C7833r rVar = new C7833r();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rVar.mo29177E(15000, timeUnit);
        rVar.mo29178F(20000, timeUnit);
        return rVar;
    }

    static Response parseResponse(C7842v vVar) {
        return new Response(vVar.mo29247v().mo29223p(), vVar.mo29238n(), vVar.mo29243s(), createHeaders(vVar.mo29242r()), createResponseBody(vVar.mo29235k()));
    }

    public Response execute(Request request) throws IOException {
        return parseResponse(this.client.mo29175C(createRequest(request)).mo29100b());
    }

    public OkClient(C7833r rVar) {
        Objects.requireNonNull(rVar, "client == null");
        this.client = rVar;
    }
}
