package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
/* compiled from: HttpException */
public final class C1777e extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public C1777e(int i) {
        this("Http request failed", i);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Deprecated
    public C1777e(String str) {
        this(str, -1);
    }

    public C1777e(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public C1777e(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
        this.statusCode = i;
    }
}
