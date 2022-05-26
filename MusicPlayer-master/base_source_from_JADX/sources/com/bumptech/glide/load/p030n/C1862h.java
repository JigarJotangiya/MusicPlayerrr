package com.bumptech.glide.load.p030n;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1726d;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1787h;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1793l;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.data.C1754e;
import com.bumptech.glide.load.p030n.C1859f;
import com.bumptech.glide.load.p030n.C1871i;
import com.bumptech.glide.load.p030n.p032b0.C1826a;
import com.bumptech.glide.load.p036p.p037d.C2034m;
import com.bumptech.glide.p051s.C2188f;
import com.bumptech.glide.p051s.p052l.C2196a;
import com.bumptech.glide.p051s.p052l.C2204b;
import com.bumptech.glide.p051s.p052l.C2205c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p082e.p109h.p118o.C3700f;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.bumptech.glide.load.n.h */
/* compiled from: DecodeJob */
class C1862h<R> implements C1859f.C1860a, Runnable, Comparable<C1862h<?>>, C2196a.C2202f {

    /* renamed from: A */
    private boolean f6716A;

    /* renamed from: B */
    private Object f6717B;

    /* renamed from: C */
    private Thread f6718C;

    /* renamed from: D */
    private C1786g f6719D;

    /* renamed from: E */
    private C1786g f6720E;

    /* renamed from: F */
    private Object f6721F;

    /* renamed from: G */
    private C1744a f6722G;

    /* renamed from: H */
    private C1752d<?> f6723H;

    /* renamed from: I */
    private volatile C1859f f6724I;

    /* renamed from: J */
    private volatile boolean f6725J;

    /* renamed from: K */
    private volatile boolean f6726K;

    /* renamed from: L */
    private boolean f6727L;

    /* renamed from: g */
    private final C1861g<R> f6728g = new C1861g<>();

    /* renamed from: h */
    private final List<Throwable> f6729h = new ArrayList();

    /* renamed from: i */
    private final C2205c f6730i = C2205c.m10314a();

    /* renamed from: j */
    private final C1867e f6731j;

    /* renamed from: k */
    private final C3700f<C1862h<?>> f6732k;

    /* renamed from: l */
    private final C1866d<?> f6733l = new C1866d<>();

    /* renamed from: m */
    private final C1868f f6734m = new C1868f();

    /* renamed from: n */
    private C1726d f6735n;

    /* renamed from: o */
    private C1786g f6736o;

    /* renamed from: p */
    private C1730g f6737p;

    /* renamed from: q */
    private C1891n f6738q;

    /* renamed from: r */
    private int f6739r;

    /* renamed from: s */
    private int f6740s;

    /* renamed from: t */
    private C1873j f6741t;

    /* renamed from: u */
    private C1790i f6742u;

    /* renamed from: v */
    private C1864b<R> f6743v;

    /* renamed from: w */
    private int f6744w;

    /* renamed from: x */
    private C1870h f6745x;

    /* renamed from: y */
    private C1869g f6746y;

    /* renamed from: z */
    private long f6747z;

    /* renamed from: com.bumptech.glide.load.n.h$a */
    /* compiled from: DecodeJob */
    static /* synthetic */ class C1863a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6748a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6749b;

        /* renamed from: c */
        static final /* synthetic */ int[] f6750c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.C1746c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6750c = r0
                r1 = 1
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.C1746c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6750c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.C1746c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.n.h$h[] r2 = com.bumptech.glide.load.p030n.C1862h.C1870h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f6749b = r2
                com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p030n.C1862h.C1870h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f6749b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.n.h$h r3 = com.bumptech.glide.load.p030n.C1862h.C1870h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f6749b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p030n.C1862h.C1870h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f6749b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p030n.C1862h.C1870h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f6749b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.n.h$h r4 = com.bumptech.glide.load.p030n.C1862h.C1870h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.n.h$g[] r3 = com.bumptech.glide.load.p030n.C1862h.C1869g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6748a = r3
                com.bumptech.glide.load.n.h$g r4 = com.bumptech.glide.load.p030n.C1862h.C1869g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f6748a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.n.h$g r3 = com.bumptech.glide.load.p030n.C1862h.C1869g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f6748a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.n.h$g r1 = com.bumptech.glide.load.p030n.C1862h.C1869g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p030n.C1862h.C1863a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$b */
    /* compiled from: DecodeJob */
    interface C1864b<R> {
        /* renamed from: a */
        void mo7909a(C1895q qVar);

        /* renamed from: c */
        void mo7910c(C1902v<R> vVar, C1744a aVar, boolean z);

        /* renamed from: d */
        void mo7911d(C1862h<?> hVar);
    }

    /* renamed from: com.bumptech.glide.load.n.h$c */
    /* compiled from: DecodeJob */
    private final class C1865c<Z> implements C1871i.C1872a<Z> {

        /* renamed from: a */
        private final C1744a f6751a;

        C1865c(C1744a aVar) {
            this.f6751a = aVar;
        }

        /* renamed from: a */
        public C1902v<Z> mo7912a(C1902v<Z> vVar) {
            return C1862h.this.mo7901D(this.f6751a, vVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$d */
    /* compiled from: DecodeJob */
    private static class C1866d<Z> {

        /* renamed from: a */
        private C1786g f6753a;

        /* renamed from: b */
        private C1793l<Z> f6754b;

        /* renamed from: c */
        private C1900u<Z> f6755c;

        C1866d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7913a() {
            this.f6753a = null;
            this.f6754b = null;
            this.f6755c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7914b(C1867e eVar, C1790i iVar) {
            C2204b.m10310a("DecodeJob.encode");
            try {
                eVar.mo7917a().mo7821a(this.f6753a, new C1858e(this.f6754b, this.f6755c, iVar));
            } finally {
                this.f6755c.mo7995g();
                C2204b.m10313d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo7915c() {
            return this.f6755c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <X> void mo7916d(C1786g gVar, C1793l<X> lVar, C1900u<X> uVar) {
            this.f6753a = gVar;
            this.f6754b = lVar;
            this.f6755c = uVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$e */
    /* compiled from: DecodeJob */
    interface C1867e {
        /* renamed from: a */
        C1826a mo7917a();
    }

    /* renamed from: com.bumptech.glide.load.n.h$f */
    /* compiled from: DecodeJob */
    private static class C1868f {

        /* renamed from: a */
        private boolean f6756a;

        /* renamed from: b */
        private boolean f6757b;

        /* renamed from: c */
        private boolean f6758c;

        C1868f() {
        }

        /* renamed from: a */
        private boolean m9094a(boolean z) {
            return (this.f6758c || z || this.f6757b) && this.f6756a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo7918b() {
            this.f6757b = true;
            return m9094a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo7919c() {
            this.f6758c = true;
            return m9094a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo7920d(boolean z) {
            this.f6756a = true;
            return m9094a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo7921e() {
            this.f6757b = false;
            this.f6756a = false;
            this.f6758c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.h$g */
    /* compiled from: DecodeJob */
    private enum C1869g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.n.h$h */
    /* compiled from: DecodeJob */
    private enum C1870h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C1862h(C1867e eVar, C3700f<C1862h<?>> fVar) {
        this.f6731j = eVar;
        this.f6732k = fVar;
    }

    /* renamed from: A */
    private void m9056A() {
        m9063J();
        this.f6743v.mo7909a(new C1895q("Failed to load resource", (List<Throwable>) new ArrayList(this.f6729h)));
        m9058C();
    }

    /* renamed from: B */
    private void m9057B() {
        if (this.f6734m.mo7918b()) {
            m9059F();
        }
    }

    /* renamed from: C */
    private void m9058C() {
        if (this.f6734m.mo7919c()) {
            m9059F();
        }
    }

    /* renamed from: F */
    private void m9059F() {
        this.f6734m.mo7921e();
        this.f6733l.mo7913a();
        this.f6728g.mo7877a();
        this.f6725J = false;
        this.f6735n = null;
        this.f6736o = null;
        this.f6742u = null;
        this.f6737p = null;
        this.f6738q = null;
        this.f6743v = null;
        this.f6745x = null;
        this.f6724I = null;
        this.f6718C = null;
        this.f6719D = null;
        this.f6721F = null;
        this.f6722G = null;
        this.f6723H = null;
        this.f6747z = 0;
        this.f6726K = false;
        this.f6717B = null;
        this.f6729h.clear();
        this.f6732k.mo8512a(this);
    }

    /* renamed from: G */
    private void m9060G() {
        this.f6718C = Thread.currentThread();
        this.f6747z = C2188f.m10253b();
        boolean z = false;
        while (!this.f6726K && this.f6724I != null && !(z = this.f6724I.mo7850a())) {
            this.f6745x = m9068s(this.f6745x);
            this.f6724I = m9067r();
            if (this.f6745x == C1870h.SOURCE) {
                mo7875d();
                return;
            }
        }
        if ((this.f6745x == C1870h.FINISHED || this.f6726K) && !z) {
            m9056A();
        }
    }

    /* renamed from: H */
    private <Data, ResourceType> C1902v<R> m9061H(Data data, C1744a aVar, C1899t<Data, ResourceType, R> tVar) throws C1895q {
        C1790i t = m9069t(aVar);
        C1754e l = this.f6735n.mo7608i().mo7622l(data);
        try {
            return tVar.mo7993a(l, t, this.f6739r, this.f6740s, new C1865c(aVar));
        } finally {
            l.mo7682b();
        }
    }

    /* renamed from: I */
    private void m9062I() {
        int i = C1863a.f6748a[this.f6746y.ordinal()];
        if (i == 1) {
            this.f6745x = m9068s(C1870h.INITIALIZE);
            this.f6724I = m9067r();
            m9060G();
        } else if (i == 2) {
            m9060G();
        } else if (i == 3) {
            m9066q();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f6746y);
        }
    }

    /* renamed from: J */
    private void m9063J() {
        Throwable th;
        this.f6730i.mo8515c();
        if (this.f6725J) {
            if (this.f6729h.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f6729h;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f6725J = true;
    }

    /* renamed from: o */
    private <Data> C1902v<R> m9064o(C1752d<?> dVar, Data data, C1744a aVar) throws C1895q {
        if (data == null) {
            dVar.mo7693b();
            return null;
        }
        try {
            long b = C2188f.m10253b();
            C1902v<R> p = m9065p(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m9071w("Decoded result " + p, b);
            }
            return p;
        } finally {
            dVar.mo7693b();
        }
    }

    /* renamed from: p */
    private <Data> C1902v<R> m9065p(Data data, C1744a aVar) throws C1895q {
        return m9061H(data, aVar, this.f6728g.mo7884h(data.getClass()));
    }

    /* renamed from: q */
    private void m9066q() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f6747z;
            m9072x("Retrieved data", j, "data: " + this.f6721F + ", cache key: " + this.f6719D + ", fetcher: " + this.f6723H);
        }
        C1902v<R> vVar = null;
        try {
            vVar = m9064o(this.f6723H, this.f6721F, this.f6722G);
        } catch (C1895q e) {
            e.setLoggingDetails(this.f6720E, this.f6722G);
            this.f6729h.add(e);
        }
        if (vVar != null) {
            m9074z(vVar, this.f6722G, this.f6727L);
        } else {
            m9060G();
        }
    }

    /* renamed from: r */
    private C1859f m9067r() {
        int i = C1863a.f6749b[this.f6745x.ordinal()];
        if (i == 1) {
            return new C1903w(this.f6728g, this);
        }
        if (i == 2) {
            return new C1848c(this.f6728g, this);
        }
        if (i == 3) {
            return new C1907z(this.f6728g, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f6745x);
    }

    /* renamed from: s */
    private C1870h m9068s(C1870h hVar) {
        int i = C1863a.f6749b[hVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f6716A ? C1870h.FINISHED : C1870h.SOURCE;
            }
            if (i == 3 || i == 4) {
                return C1870h.FINISHED;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unrecognized stage: " + hVar);
            } else if (this.f6741t.mo7925b()) {
                return C1870h.RESOURCE_CACHE;
            } else {
                return m9068s(C1870h.RESOURCE_CACHE);
            }
        } else if (this.f6741t.mo7924a()) {
            return C1870h.DATA_CACHE;
        } else {
            return m9068s(C1870h.DATA_CACHE);
        }
    }

    /* renamed from: t */
    private C1790i m9069t(C1744a aVar) {
        C1790i iVar = this.f6742u;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == C1744a.RESOURCE_DISK_CACHE || this.f6728g.mo7899w();
        C1787h hVar = C2034m.f7048i;
        Boolean bool = (Boolean) iVar.mo7744c(hVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        C1790i iVar2 = new C1790i();
        iVar2.mo7745d(this.f6742u);
        iVar2.mo7746e(hVar, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: u */
    private int m9070u() {
        return this.f6737p.ordinal();
    }

    /* renamed from: w */
    private void m9071w(String str, long j) {
        m9072x(str, j, (String) null);
    }

    /* renamed from: x */
    private void m9072x(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2188f.m10252a(j));
        sb.append(", load key: ");
        sb.append(this.f6738q);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: y */
    private void m9073y(C1902v<R> vVar, C1744a aVar, boolean z) {
        m9063J();
        this.f6743v.mo7910c(vVar, aVar, z);
    }

    /* renamed from: z */
    private void m9074z(C1902v<R> vVar, C1744a aVar, boolean z) {
        if (vVar instanceof C1897r) {
            ((C1897r) vVar).mo7989b();
        }
        C1900u<R> uVar = null;
        C1900u<R> uVar2 = vVar;
        if (this.f6733l.mo7915c()) {
            C1900u<R> e = C1900u.m9190e(vVar);
            uVar = e;
            uVar2 = e;
        }
        m9073y(uVar2, aVar, z);
        this.f6745x = C1870h.ENCODE;
        try {
            if (this.f6733l.mo7915c()) {
                this.f6733l.mo7914b(this.f6731j, this.f6742u);
            }
            m9057B();
        } finally {
            if (uVar != null) {
                uVar.mo7995g();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.n.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.n.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.n.x} */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.g] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.p030n.C1902v<Z> mo7901D(com.bumptech.glide.load.C1744a r12, com.bumptech.glide.load.p030n.C1902v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C1744a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.n.g<R> r0 = r11.f6728g
            com.bumptech.glide.load.m r0 = r0.mo7894r(r8)
            com.bumptech.glide.d r2 = r11.f6735n
            int r3 = r11.f6739r
            int r4 = r11.f6740s
            com.bumptech.glide.load.n.v r2 = r0.mo7751b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo7965a()
        L_0x002b:
            com.bumptech.glide.load.n.g<R> r13 = r11.f6728g
            boolean r13 = r13.mo7898v(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.n.g<R> r13 = r11.f6728g
            com.bumptech.glide.load.l r1 = r13.mo7890n(r0)
            com.bumptech.glide.load.i r13 = r11.f6742u
            com.bumptech.glide.load.c r13 = r1.mo7750b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.C1746c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.n.g<R> r1 = r11.f6728g
            com.bumptech.glide.load.g r2 = r11.f6719D
            boolean r1 = r1.mo7900x(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.n.j r3 = r11.f6741t
            boolean r12 = r3.mo7927d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.p030n.C1862h.C1863a.f6750c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.n.x r12 = new com.bumptech.glide.load.n.x
            com.bumptech.glide.load.n.g<R> r13 = r11.f6728g
            com.bumptech.glide.load.n.a0.b r2 = r13.mo7878b()
            com.bumptech.glide.load.g r3 = r11.f6719D
            com.bumptech.glide.load.g r4 = r11.f6736o
            int r5 = r11.f6739r
            int r6 = r11.f6740s
            com.bumptech.glide.load.i r9 = r11.f6742u
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.n.d r12 = new com.bumptech.glide.load.n.d
            com.bumptech.glide.load.g r13 = r11.f6719D
            com.bumptech.glide.load.g r1 = r11.f6736o
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.n.u r0 = com.bumptech.glide.load.p030n.C1900u.m9190e(r0)
            com.bumptech.glide.load.n.h$d<?> r13 = r11.f6733l
            r13.mo7916d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.i$d r12 = new com.bumptech.glide.i$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p030n.C1862h.mo7901D(com.bumptech.glide.load.a, com.bumptech.glide.load.n.v):com.bumptech.glide.load.n.v");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo7902E(boolean z) {
        if (this.f6734m.mo7920d(z)) {
            m9059F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo7903K() {
        C1870h s = m9068s(C1870h.INITIALIZE);
        return s == C1870h.RESOURCE_CACHE || s == C1870h.DATA_CACHE;
    }

    /* renamed from: c */
    public void mo7874c(C1786g gVar, Exception exc, C1752d<?> dVar, C1744a aVar) {
        dVar.mo7693b();
        C1895q qVar = new C1895q("Fetching data failed", (Throwable) exc);
        qVar.setLoggingDetails(gVar, aVar, dVar.mo7688a());
        this.f6729h.add(qVar);
        if (Thread.currentThread() != this.f6718C) {
            this.f6746y = C1869g.SWITCH_TO_SOURCE_SERVICE;
            this.f6743v.mo7911d(this);
            return;
        }
        m9060G();
    }

    /* renamed from: d */
    public void mo7875d() {
        this.f6746y = C1869g.SWITCH_TO_SOURCE_SERVICE;
        this.f6743v.mo7911d(this);
    }

    /* renamed from: h */
    public void mo7876h(C1786g gVar, Object obj, C1752d<?> dVar, C1744a aVar, C1786g gVar2) {
        this.f6719D = gVar;
        this.f6721F = obj;
        this.f6723H = dVar;
        this.f6722G = aVar;
        this.f6720E = gVar2;
        boolean z = false;
        if (gVar != this.f6728g.mo7879c().get(0)) {
            z = true;
        }
        this.f6727L = z;
        if (Thread.currentThread() != this.f6718C) {
            this.f6746y = C1869g.DECODE_DATA;
            this.f6743v.mo7911d(this);
            return;
        }
        C2204b.m10310a("DecodeJob.decodeFromRetrievedData");
        try {
            m9066q();
        } finally {
            C2204b.m10313d();
        }
    }

    /* renamed from: j */
    public C2205c mo7849j() {
        return this.f6730i;
    }

    /* renamed from: k */
    public void mo7905k() {
        this.f6726K = true;
        C1859f fVar = this.f6724I;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: l */
    public int compareTo(C1862h<?> hVar) {
        int u = m9070u() - hVar.m9070u();
        return u == 0 ? this.f6744w - hVar.f6744w : u;
    }

    public void run() {
        C2204b.m10311b("DecodeJob#run(model=%s)", this.f6717B);
        C1752d<?> dVar = this.f6723H;
        try {
            if (this.f6726K) {
                m9056A();
                if (dVar != null) {
                    dVar.mo7693b();
                }
                C2204b.m10313d();
                return;
            }
            m9062I();
            if (dVar != null) {
                dVar.mo7693b();
            }
            C2204b.m10313d();
        } catch (C1825b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo7693b();
            }
            C2204b.m10313d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C1862h<R> mo7908v(C1726d dVar, Object obj, C1891n nVar, C1786g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C1730g gVar2, C1873j jVar, Map<Class<?>, C1794m<?>> map, boolean z, boolean z2, boolean z3, C1790i iVar, C1864b<R> bVar, int i3) {
        this.f6728g.mo7897u(dVar, obj, gVar, i, i2, jVar, cls, cls2, gVar2, iVar, map, z, z2, this.f6731j);
        this.f6735n = dVar;
        this.f6736o = gVar;
        this.f6737p = gVar2;
        this.f6738q = nVar;
        this.f6739r = i;
        this.f6740s = i2;
        this.f6741t = jVar;
        this.f6716A = z3;
        this.f6742u = iVar;
        this.f6743v = bVar;
        this.f6744w = i3;
        this.f6746y = C1869g.INITIALIZE;
        this.f6717B = obj;
        return this;
    }
}
