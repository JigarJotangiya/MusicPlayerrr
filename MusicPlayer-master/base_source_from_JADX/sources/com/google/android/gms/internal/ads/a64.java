package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a64 extends n81 {

    /* renamed from: e */
    private RandomAccessFile f13794e;

    /* renamed from: f */
    private Uri f13795f;

    /* renamed from: g */
    private long f13796g;

    /* renamed from: h */
    private boolean f13797h;

    public a64() {
        super(false);
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws z54 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13796g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f13794e;
            int i3 = wy2.f25579a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f13796g -= (long) read;
                mo19649n(read);
            }
            return read;
        } catch (IOException e) {
            throw new z54(e, 2000);
        }
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f13795f;
    }

    /* renamed from: h */
    public final void mo15697h() throws z54 {
        this.f13795f = null;
        try {
            RandomAccessFile randomAccessFile = this.f13794e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f13794e = null;
            if (this.f13797h) {
                this.f13797h = false;
                mo19650o();
            }
        } catch (IOException e) {
            throw new z54(e, 2000);
        } catch (Throwable th) {
            this.f13794e = null;
            if (this.f13797h) {
                this.f13797h = false;
                mo19650o();
            }
            throw th;
        }
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws z54 {
        Uri uri = uf1.f24320a;
        this.f13795f = uri;
        mo19651p(uf1);
        int i = 2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f13794e = randomAccessFile;
            try {
                randomAccessFile.seek(uf1.f24325f);
                long j = uf1.f24326g;
                if (j == -1) {
                    j = this.f13794e.length() - uf1.f24325f;
                }
                this.f13796g = j;
                if (j >= 0) {
                    this.f13797h = true;
                    mo19652q(uf1);
                    return this.f13796g;
                }
                throw new z54((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new z54(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new z54(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (wy2.f25579a < 21 || !y54.m34040b(e2.getCause())) {
                i = 2005;
            }
            throw new z54(e2, i);
        } catch (SecurityException e3) {
            throw new z54(e3, 2006);
        } catch (RuntimeException e4) {
            throw new z54(e4, 2000);
        }
    }
}
