package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class i14 implements i24 {

    /* renamed from: a */
    private final ArrayList<h24> f17866a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<h24> f17867b = new HashSet<>(1);

    /* renamed from: c */
    private final p24 f17868c = new p24();

    /* renamed from: d */
    private final iz3 f17869d = new iz3();

    /* renamed from: e */
    private Looper f17870e;

    /* renamed from: f */
    private bg0 f17871f;

    /* renamed from: a */
    public final void mo18257a(Handler handler, jz3 jz3) {
        Objects.requireNonNull(jz3);
        this.f17869d.mo18526b(handler, jz3);
    }

    /* renamed from: b */
    public final void mo18258b(h24 h24) {
        Objects.requireNonNull(this.f17870e);
        boolean isEmpty = this.f17867b.isEmpty();
        this.f17867b.add(h24);
        if (isEmpty) {
            mo18271r();
        }
    }

    /* renamed from: c */
    public final void mo18259c(q24 q24) {
        this.f17868c.mo20202m(q24);
    }

    /* renamed from: f */
    public final void mo18260f(h24 h24) {
        this.f17866a.remove(h24);
        if (this.f17866a.isEmpty()) {
            this.f17870e = null;
            this.f17871f = null;
            this.f17867b.clear();
            mo16026v();
            return;
        }
        mo18264k(h24);
    }

    /* renamed from: g */
    public final void mo18261g(Handler handler, q24 q24) {
        Objects.requireNonNull(q24);
        this.f17868c.mo20191b(handler, q24);
    }

    /* renamed from: h */
    public final void mo18262h(jz3 jz3) {
        this.f17869d.mo18527c(jz3);
    }

    /* renamed from: j */
    public final void mo18263j(h24 h24, fr1 fr1) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f17870e;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        gs1.m24486d(z);
        bg0 bg0 = this.f17871f;
        this.f17866a.add(h24);
        if (this.f17870e == null) {
            this.f17870e = myLooper;
            this.f17867b.add(h24);
            mo16024s(fr1);
        } else if (bg0 != null) {
            mo18258b(h24);
            h24.mo18062a(this, bg0);
        }
    }

    /* renamed from: k */
    public final void mo18264k(h24 h24) {
        boolean isEmpty = this.f17867b.isEmpty();
        this.f17867b.remove(h24);
        if ((!isEmpty) && this.f17867b.isEmpty()) {
            mo18270q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final iz3 mo18265l(f24 f24) {
        return this.f17869d.mo18525a(0, f24);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final iz3 mo18266m(int i, f24 f24) {
        return this.f17869d.mo18525a(i, f24);
    }

    /* renamed from: n */
    public final /* synthetic */ boolean mo18267n() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final p24 mo18268o(f24 f24) {
        return this.f17868c.mo20190a(0, f24, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final p24 mo18269p(int i, f24 f24, long j) {
        return this.f17868c.mo20190a(i, f24, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo18270q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo18271r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo16024s(fr1 fr1);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo18272u(bg0 bg0) {
        this.f17871f = bg0;
        ArrayList<h24> arrayList = this.f17866a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo18062a(this, bg0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo16026v();

    /* renamed from: w */
    public final /* synthetic */ bg0 mo18273w() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo18274y() {
        return !this.f17867b.isEmpty();
    }
}
