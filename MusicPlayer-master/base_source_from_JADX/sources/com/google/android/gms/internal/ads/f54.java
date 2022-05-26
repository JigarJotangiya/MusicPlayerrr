package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f54 extends n81 {

    /* renamed from: e */
    private final AssetManager f16441e;

    /* renamed from: f */
    private Uri f16442f;

    /* renamed from: g */
    private InputStream f16443g;

    /* renamed from: h */
    private long f16444h;

    /* renamed from: i */
    private boolean f16445i;

    public f54(Context context) {
        super(false);
        this.f16441e = context.getAssets();
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws e54 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f16444h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new e54(e, 2000);
            }
        }
        InputStream inputStream = this.f16443g;
        int i3 = wy2.f25579a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f16444h;
        if (j2 != -1) {
            this.f16444h = j2 - ((long) read);
        }
        mo19649n(read);
        return read;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f16442f;
    }

    /* renamed from: h */
    public final void mo15697h() throws e54 {
        this.f16442f = null;
        try {
            InputStream inputStream = this.f16443g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f16443g = null;
            if (this.f16445i) {
                this.f16445i = false;
                mo19650o();
            }
        } catch (IOException e) {
            throw new e54(e, 2000);
        } catch (Throwable th) {
            this.f16443g = null;
            if (this.f16445i) {
                this.f16445i = false;
                mo19650o();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws e54 {
        try {
            Uri uri = uf1.f24320a;
            this.f16442f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo19651p(uf1);
            InputStream open = this.f16441e.open(path, 1);
            this.f16443g = open;
            if (open.skip(uf1.f24325f) >= uf1.f24325f) {
                long j = uf1.f24326g;
                if (j != -1) {
                    this.f16444h = j;
                } else {
                    long available = (long) this.f16443g.available();
                    this.f16444h = available;
                    if (available == 2147483647L) {
                        this.f16444h = -1;
                    }
                }
                this.f16445i = true;
                mo19652q(uf1);
                return this.f16444h;
            }
            throw new e54((Throwable) null, 2008);
        } catch (e54 e) {
            throw e;
        } catch (IOException e2) {
            throw new e54(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}
