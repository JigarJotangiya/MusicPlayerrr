package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5511r6 {

    /* renamed from: a */
    private final int f22746a;

    /* renamed from: b */
    private final List<C5251k5> f22747b;

    /* renamed from: c */
    private final int f22748c;

    /* renamed from: d */
    private final InputStream f22749d;

    public C5511r6(int i, List<C5251k5> list, int i2, InputStream inputStream) {
        this.f22746a = i;
        this.f22747b = list;
        this.f22748c = i2;
        this.f22749d = inputStream;
    }

    /* renamed from: a */
    public final int mo20594a() {
        return this.f22748c;
    }

    /* renamed from: b */
    public final int mo20595b() {
        return this.f22746a;
    }

    /* renamed from: c */
    public final InputStream mo20596c() {
        InputStream inputStream = this.f22749d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List<C5251k5> mo20597d() {
        return Collections.unmodifiableList(this.f22747b);
    }
}
