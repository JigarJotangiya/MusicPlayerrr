package com.bumptech.glide.load.p036p.p041h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.p044n.C2125a;

/* renamed from: com.bumptech.glide.load.p.h.b */
/* compiled from: GifBitmapProvider */
public final class C2069b implements C2125a.C2126a {

    /* renamed from: a */
    private final C1807e f7112a;

    /* renamed from: b */
    private final C1802b f7113b;

    public C2069b(C1807e eVar, C1802b bVar) {
        this.f7112a = eVar;
        this.f7113b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo8179a(int i, int i2, Bitmap.Config config) {
        return this.f7112a.mo7793e(i, i2, config);
    }

    /* renamed from: b */
    public int[] mo8180b(int i) {
        C1802b bVar = this.f7113b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo7771e(i, int[].class);
    }

    /* renamed from: c */
    public void mo8181c(Bitmap bitmap) {
        this.f7112a.mo7791c(bitmap);
    }

    /* renamed from: d */
    public void mo8182d(byte[] bArr) {
        C1802b bVar = this.f7113b;
        if (bVar != null) {
            bVar.mo7770d(bArr);
        }
    }

    /* renamed from: e */
    public byte[] mo8183e(int i) {
        C1802b bVar = this.f7113b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo7771e(i, byte[].class);
    }

    /* renamed from: f */
    public void mo8184f(int[] iArr) {
        C1802b bVar = this.f7113b;
        if (bVar != null) {
            bVar.mo7770d(iArr);
        }
    }
}
