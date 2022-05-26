package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ed */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5036ed {

    /* renamed from: a */
    private final C5701wb f15924a;

    /* renamed from: b */
    private final String f15925b;

    /* renamed from: c */
    private final String f15926c;

    /* renamed from: d */
    private volatile Method f15927d = null;

    /* renamed from: e */
    private final Class<?>[] f15928e;

    /* renamed from: f */
    private final CountDownLatch f15929f = new CountDownLatch(1);

    public C5036ed(C5701wb wbVar, String str, String str2, Class<?>... clsArr) {
        this.f15924a = wbVar;
        this.f15925b = str;
        this.f15926c = str2;
        this.f15928e = clsArr;
        wbVar.mo21786k().submit(new C4999dd(this));
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m22962b(C5036ed edVar) {
        CountDownLatch countDownLatch;
        try {
            Class loadClass = edVar.f15924a.mo21784i().loadClass(edVar.m22963c(edVar.f15924a.mo21794u(), edVar.f15925b));
            if (loadClass == null) {
                countDownLatch = edVar.f15929f;
            } else {
                edVar.f15927d = loadClass.getMethod(edVar.m22963c(edVar.f15924a.mo21794u(), edVar.f15926c), edVar.f15928e);
                if (edVar.f15927d == null) {
                    countDownLatch = edVar.f15929f;
                }
                countDownLatch = edVar.f15929f;
            }
        } catch (C4923bb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = edVar.f15929f;
        } catch (Throwable th) {
            edVar.f15929f.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    /* renamed from: c */
    private final String m22963c(byte[] bArr, String str) throws C4923bb, UnsupportedEncodingException {
        return new String(this.f15924a.mo21781e().mo16583b(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo17176a() {
        if (this.f15927d != null) {
            return this.f15927d;
        }
        try {
            if (!this.f15929f.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f15927d;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
