package com.bumptech.glide.load.p036p.p041h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.bumptech.glide.C1740k;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1873j;
import com.bumptech.glide.load.p030n.p031a0.C1807e;
import com.bumptech.glide.p044n.C2125a;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2160c;
import com.bumptech.glide.p047q.p049m.C2172b;
import com.bumptech.glide.p050r.C2178d;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.C2194k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.h.g */
/* compiled from: GifFrameLoader */
class C2075g {

    /* renamed from: a */
    private final C2125a f7127a;

    /* renamed from: b */
    private final Handler f7128b;

    /* renamed from: c */
    private final List<C2077b> f7129c;

    /* renamed from: d */
    final C1740k f7130d;

    /* renamed from: e */
    private final C1807e f7131e;

    /* renamed from: f */
    private boolean f7132f;

    /* renamed from: g */
    private boolean f7133g;

    /* renamed from: h */
    private boolean f7134h;

    /* renamed from: i */
    private C1738j<Bitmap> f7135i;

    /* renamed from: j */
    private C2076a f7136j;

    /* renamed from: k */
    private boolean f7137k;

    /* renamed from: l */
    private C2076a f7138l;

    /* renamed from: m */
    private Bitmap f7139m;

    /* renamed from: n */
    private C1794m<Bitmap> f7140n;

    /* renamed from: o */
    private C2076a f7141o;

    /* renamed from: p */
    private C2079d f7142p;

    /* renamed from: q */
    private int f7143q;

    /* renamed from: r */
    private int f7144r;

    /* renamed from: s */
    private int f7145s;

    /* renamed from: com.bumptech.glide.load.p.h.g$a */
    /* compiled from: GifFrameLoader */
    static class C2076a extends C2160c<Bitmap> {

        /* renamed from: j */
        private final Handler f7146j;

        /* renamed from: k */
        final int f7147k;

        /* renamed from: l */
        private final long f7148l;

        /* renamed from: m */
        private Bitmap f7149m;

        C2076a(Handler handler, int i, long j) {
            this.f7146j = handler;
            this.f7147k = i;
            this.f7148l = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Bitmap mo8223d() {
            return this.f7149m;
        }

        /* renamed from: h */
        public void mo8222c(Bitmap bitmap, C2172b<? super Bitmap> bVar) {
            this.f7149m = bitmap;
            this.f7146j.sendMessageAtTime(this.f7146j.obtainMessage(1, this), this.f7148l);
        }

        /* renamed from: k */
        public void mo8225k(Drawable drawable) {
            this.f7149m = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.h.g$b */
    /* compiled from: GifFrameLoader */
    public interface C2077b {
        /* renamed from: a */
        void mo8185a();
    }

    /* renamed from: com.bumptech.glide.load.p.h.g$c */
    /* compiled from: GifFrameLoader */
    private class C2078c implements Handler.Callback {
        C2078c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C2075g.this.mo8218m((C2076a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C2075g.this.f7130d.mo7653n((C2076a) message.obj);
                return false;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.h.g$d */
    /* compiled from: GifFrameLoader */
    interface C2079d {
        /* renamed from: a */
        void mo8227a();
    }

    C2075g(C1719b bVar, C2125a aVar, int i, int i2, C1794m<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.mo7584f(), C1719b.m8597t(bVar.mo7586h()), aVar, (Handler) null, m9726i(C1719b.m8597t(bVar.mo7586h()), i, i2), mVar, bitmap);
    }

    /* renamed from: g */
    private static C1786g m9725g() {
        return new C2178d(Double.valueOf(Math.random()));
    }

    /* renamed from: i */
    private static C1738j<Bitmap> m9726i(C1740k kVar, int i, int i2) {
        return kVar.mo7651h().mo7637a(((C2153h) ((C2153h) C2153h.m10110p0(C1873j.f6766a).mo8400n0(true)).mo8390i0(true)).mo8374X(i, i2));
    }

    /* renamed from: l */
    private void m9727l() {
        if (this.f7132f && !this.f7133g) {
            if (this.f7134h) {
                C2193j.m10266a(this.f7141o == null, "Pending target must be null when starting from the first frame");
                this.f7127a.mo8319g();
                this.f7134h = false;
            }
            C2076a aVar = this.f7141o;
            if (aVar != null) {
                this.f7141o = null;
                mo8218m(aVar);
                return;
            }
            this.f7133g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f7127a.mo8317e());
            this.f7127a.mo8314c();
            this.f7138l = new C2076a(this.f7128b, this.f7127a.mo8320h(), uptimeMillis);
            this.f7135i.mo7637a(C2153h.m10111q0(m9725g())).mo7632E0(this.f7127a).mo7643w0(this.f7138l);
        }
    }

    /* renamed from: n */
    private void m9728n() {
        Bitmap bitmap = this.f7139m;
        if (bitmap != null) {
            this.f7131e.mo7791c(bitmap);
            this.f7139m = null;
        }
    }

    /* renamed from: p */
    private void m9729p() {
        if (!this.f7132f) {
            this.f7132f = true;
            this.f7137k = false;
            m9727l();
        }
    }

    /* renamed from: q */
    private void m9730q() {
        this.f7132f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8209a() {
        this.f7129c.clear();
        m9728n();
        m9730q();
        C2076a aVar = this.f7136j;
        if (aVar != null) {
            this.f7130d.mo7653n(aVar);
            this.f7136j = null;
        }
        C2076a aVar2 = this.f7138l;
        if (aVar2 != null) {
            this.f7130d.mo7653n(aVar2);
            this.f7138l = null;
        }
        C2076a aVar3 = this.f7141o;
        if (aVar3 != null) {
            this.f7130d.mo7653n(aVar3);
            this.f7141o = null;
        }
        this.f7127a.clear();
        this.f7137k = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ByteBuffer mo8210b() {
        return this.f7127a.mo8313b().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo8211c() {
        C2076a aVar = this.f7136j;
        return aVar != null ? aVar.mo8223d() : this.f7139m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8212d() {
        C2076a aVar = this.f7136j;
        if (aVar != null) {
            return aVar.f7147k;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo8213e() {
        return this.f7139m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8214f() {
        return this.f7127a.mo8316d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8215h() {
        return this.f7145s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo8216j() {
        return this.f7127a.mo8321i() + this.f7143q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo8217k() {
        return this.f7144r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8218m(C2076a aVar) {
        C2079d dVar = this.f7142p;
        if (dVar != null) {
            dVar.mo8227a();
        }
        this.f7133g = false;
        if (this.f7137k) {
            this.f7128b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f7132f) {
            if (aVar.mo8223d() != null) {
                m9728n();
                C2076a aVar2 = this.f7136j;
                this.f7136j = aVar;
                for (int size = this.f7129c.size() - 1; size >= 0; size--) {
                    this.f7129c.get(size).mo8185a();
                }
                if (aVar2 != null) {
                    this.f7128b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            m9727l();
        } else if (this.f7134h) {
            this.f7128b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f7141o = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8219o(C1794m<Bitmap> mVar, Bitmap bitmap) {
        C2193j.m10269d(mVar);
        this.f7140n = mVar;
        C2193j.m10269d(bitmap);
        this.f7139m = bitmap;
        this.f7135i = this.f7135i.mo7637a(new C2153h().mo8392j0(mVar));
        this.f7143q = C2194k.m10278h(bitmap);
        this.f7144r = bitmap.getWidth();
        this.f7145s = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8220r(C2077b bVar) {
        if (this.f7137k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f7129c.contains(bVar)) {
            boolean isEmpty = this.f7129c.isEmpty();
            this.f7129c.add(bVar);
            if (isEmpty) {
                m9729p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8221s(C2077b bVar) {
        this.f7129c.remove(bVar);
        if (this.f7129c.isEmpty()) {
            m9730q();
        }
    }

    C2075g(C1807e eVar, C1740k kVar, C2125a aVar, Handler handler, C1738j<Bitmap> jVar, C1794m<Bitmap> mVar, Bitmap bitmap) {
        this.f7129c = new ArrayList();
        this.f7130d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C2078c()) : handler;
        this.f7131e = eVar;
        this.f7128b = handler;
        this.f7135i = jVar;
        this.f7127a = aVar;
        mo8219o(mVar, bitmap);
    }
}
