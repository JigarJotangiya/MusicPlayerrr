package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.v */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class C3374v extends C3354t {

    /* renamed from: i */
    private static final WeakReference<byte[]> f10774i = new WeakReference<>((Object) null);

    /* renamed from: h */
    private WeakReference<byte[]> f10775h = f10774i;

    C3374v(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public final byte[] mo11985K0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f10775h.get();
            if (bArr == null) {
                bArr = mo11921l3();
                this.f10775h = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public abstract byte[] mo11921l3();
}
