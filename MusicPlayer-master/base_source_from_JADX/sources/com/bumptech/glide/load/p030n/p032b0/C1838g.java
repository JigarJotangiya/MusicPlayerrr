package com.bumptech.glide.load.p030n.p032b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p030n.p032b0.C1839h;
import com.bumptech.glide.p051s.C2189g;

/* renamed from: com.bumptech.glide.load.n.b0.g */
/* compiled from: LruResourceCache */
public class C1838g extends C2189g<C1786g, C1902v<?>> implements C1839h {

    /* renamed from: d */
    private C1839h.C1840a f6648d;

    public C1838g(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo7830a(int i) {
        if (i >= 40) {
            mo8493b();
        } else if (i >= 20 || i == 15) {
            mo8498m(mo8495h() / 2);
        }
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C1902v mo7831c(C1786g gVar, C1902v vVar) {
        return (C1902v) super.mo8496k(gVar, vVar);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C1902v mo7832d(C1786g gVar) {
        return (C1902v) super.mo8497l(gVar);
    }

    /* renamed from: e */
    public void mo7833e(C1839h.C1840a aVar) {
        this.f6648d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo7834i(C1902v<?> vVar) {
        if (vVar == null) {
            return super.mo7834i(null);
        }
        return vVar.mo7967c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7835j(C1786g gVar, C1902v<?> vVar) {
        C1839h.C1840a aVar = this.f6648d;
        if (aVar != null && vVar != null) {
            aVar.mo7839a(vVar);
        }
    }
}
