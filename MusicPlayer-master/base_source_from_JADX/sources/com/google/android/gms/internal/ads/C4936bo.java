package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.bo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C4936bo {

    /* renamed from: b */
    private static MessageDigest f14574b;

    /* renamed from: a */
    protected final Object f14575a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo16328a() {
        synchronized (this.f14575a) {
            MessageDigest messageDigest = f14574b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f14574b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f14574b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte[] mo16329b(String str);
}
