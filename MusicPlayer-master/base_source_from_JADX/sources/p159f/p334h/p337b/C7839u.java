package p159f.p334h.p337b;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import p159f.p334h.p337b.p338z.C7859h;
import p394k.C8620a0;
import p394k.C8636f;
import p394k.C8645n;

/* renamed from: f.h.b.u */
/* compiled from: RequestBody */
public abstract class C7839u {

    /* renamed from: f.h.b.u$a */
    /* compiled from: RequestBody */
    static class C7840a extends C7839u {

        /* renamed from: a */
        final /* synthetic */ C7832q f33334a;

        /* renamed from: b */
        final /* synthetic */ int f33335b;

        /* renamed from: c */
        final /* synthetic */ byte[] f33336c;

        /* renamed from: d */
        final /* synthetic */ int f33337d;

        C7840a(C7832q qVar, int i, byte[] bArr, int i2) {
            this.f33334a = qVar;
            this.f33335b = i;
            this.f33336c = bArr;
            this.f33337d = i2;
        }

        public long contentLength() {
            return (long) this.f33335b;
        }

        public C7832q contentType() {
            return this.f33334a;
        }

        public void writeTo(C8636f fVar) throws IOException {
            fVar.mo30693Z(this.f33336c, this.f33337d, this.f33335b);
        }
    }

    /* renamed from: f.h.b.u$b */
    /* compiled from: RequestBody */
    static class C7841b extends C7839u {

        /* renamed from: a */
        final /* synthetic */ C7832q f33338a;

        /* renamed from: b */
        final /* synthetic */ File f33339b;

        C7841b(C7832q qVar, File file) {
            this.f33338a = qVar;
            this.f33339b = file;
        }

        public long contentLength() {
            return this.f33339b.length();
        }

        public C7832q contentType() {
            return this.f33338a;
        }

        public void writeTo(C8636f fVar) throws IOException {
            C8620a0 a0Var = null;
            try {
                a0Var = C8645n.m46988e(this.f33339b);
                fVar.mo30703e0(a0Var);
            } finally {
                C7859h.m43079c(a0Var);
            }
        }
    }

    public static C7839u create(C7832q qVar, String str) {
        Charset charset = C7859h.f33392c;
        if (qVar != null) {
            Charset a = qVar.mo29169a();
            if (a == null) {
                qVar = C7832q.m42898b(qVar + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        return create(qVar, str.getBytes(charset));
    }

    public abstract long contentLength() throws IOException;

    public abstract C7832q contentType();

    public abstract void writeTo(C8636f fVar) throws IOException;

    public static C7839u create(C7832q qVar, byte[] bArr) {
        return create(qVar, bArr, 0, bArr.length);
    }

    public static C7839u create(C7832q qVar, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C7859h.m43077a((long) bArr.length, (long) i, (long) i2);
        return new C7840a(qVar, i2, bArr, i);
    }

    public static C7839u create(C7832q qVar, File file) {
        Objects.requireNonNull(file, "content == null");
        return new C7841b(qVar, file);
    }
}
