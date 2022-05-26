package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.do */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5010do {

    /* renamed from: a */
    ByteArrayOutputStream f15682a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    Base64OutputStream f15683b = new Base64OutputStream(this.f15682a, 10);

    public final String toString() {
        try {
            this.f15683b.close();
        } catch (IOException e) {
            ul0.m31860e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f15682a.close();
            return this.f15682a.toString();
        } catch (IOException e2) {
            ul0.m31860e("HashManager: Unable to convert to Base64.", e2);
            return BuildConfig.FLAVOR;
        } finally {
            this.f15682a = null;
            this.f15683b = null;
        }
    }
}
