package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kk3 extends ThreadLocal<Mac> {

    /* renamed from: a */
    final /* synthetic */ lk3 f18906a;

    kk3(lk3 lk3) {
        this.f18906a = lk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac a = yj3.f26379f.mo22204a(this.f18906a.f19450b);
            a.init(this.f18906a.f19451c);
            return a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
