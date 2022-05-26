package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.p005c1.C0936a;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p082e.p091b.p092a.p093a.C3445a;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4215c;
import p082e.p149u.p150a.C4221e;
import p082e.p149u.p150a.C4222f;
import p082e.p149u.p150a.p151g.C4229c;

/* renamed from: androidx.room.s0 */
/* compiled from: RoomDatabase */
public abstract class C0994s0 {
    @Deprecated

    /* renamed from: a */
    protected volatile C4214b f4226a;

    /* renamed from: b */
    private Executor f4227b;

    /* renamed from: c */
    private Executor f4228c;

    /* renamed from: d */
    private C4215c f4229d;

    /* renamed from: e */
    private final C0967k0 f4230e = mo5578e();

    /* renamed from: f */
    private boolean f4231f;

    /* renamed from: g */
    boolean f4232g;
    @Deprecated

    /* renamed from: h */
    protected List<C0996b> f4233h;

    /* renamed from: i */
    private final ReentrantReadWriteLock f4234i = new ReentrantReadWriteLock();

    /* renamed from: j */
    private C1017y f4235j;

    /* renamed from: k */
    private final ThreadLocal<Integer> f4236k = new ThreadLocal<>();

    /* renamed from: l */
    private final Map<String, Object> f4237l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private final Map<Class<?>, Object> f4238m = new HashMap();

    /* renamed from: androidx.room.s0$a */
    /* compiled from: RoomDatabase */
    public static class C0995a<T extends C0994s0> {

        /* renamed from: a */
        private final Class<T> f4239a;

        /* renamed from: b */
        private final String f4240b;

        /* renamed from: c */
        private final Context f4241c;

        /* renamed from: d */
        private ArrayList<C0996b> f4242d;

        /* renamed from: e */
        private C0999e f4243e;

        /* renamed from: f */
        private C1000f f4244f;

        /* renamed from: g */
        private Executor f4245g;

        /* renamed from: h */
        private List<Object> f4246h;

        /* renamed from: i */
        private Executor f4247i;

        /* renamed from: j */
        private Executor f4248j;

        /* renamed from: k */
        private C4215c.C4219c f4249k;

        /* renamed from: l */
        private boolean f4250l;

        /* renamed from: m */
        private C0997c f4251m;

        /* renamed from: n */
        private boolean f4252n;

        /* renamed from: o */
        private boolean f4253o;

        /* renamed from: p */
        private boolean f4254p;

        /* renamed from: q */
        private long f4255q = -1;

        /* renamed from: r */
        private TimeUnit f4256r;

        /* renamed from: s */
        private final C0998d f4257s;

        /* renamed from: t */
        private Set<Integer> f4258t;

        /* renamed from: u */
        private Set<Integer> f4259u;

        /* renamed from: v */
        private String f4260v;

        /* renamed from: w */
        private File f4261w;

        /* renamed from: x */
        private Callable<InputStream> f4262x;

        C0995a(Context context, Class<T> cls, String str) {
            this.f4241c = context;
            this.f4239a = cls;
            this.f4240b = str;
            this.f4251m = C0997c.AUTOMATIC;
            this.f4253o = true;
            this.f4257s = new C0998d();
        }

        /* renamed from: a */
        public C0995a<T> mo5595a(C0996b bVar) {
            if (this.f4242d == null) {
                this.f4242d = new ArrayList<>();
            }
            this.f4242d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public C0995a<T> mo5596b(C0936a... aVarArr) {
            if (this.f4259u == null) {
                this.f4259u = new HashSet();
            }
            for (C0936a aVar : aVarArr) {
                this.f4259u.add(Integer.valueOf(aVar.f4089a));
                this.f4259u.add(Integer.valueOf(aVar.f4090b));
            }
            this.f4257s.mo5606b(aVarArr);
            return this;
        }

        /* renamed from: c */
        public C0995a<T> mo5597c() {
            this.f4250l = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        public T mo5598d() {
            Executor executor;
            if (this.f4241c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4239a != null) {
                Executor executor2 = this.f4247i;
                if (executor2 == null && this.f4248j == null) {
                    Executor e = C3445a.m14717e();
                    this.f4248j = e;
                    this.f4247i = e;
                } else if (executor2 != null && this.f4248j == null) {
                    this.f4248j = executor2;
                } else if (executor2 == null && (executor = this.f4248j) != null) {
                    this.f4247i = executor;
                }
                Set<Integer> set = this.f4259u;
                if (!(set == null || this.f4258t == null)) {
                    for (Integer next : set) {
                        if (this.f4258t.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                C0923a0 a0Var = this.f4249k;
                if (a0Var == null) {
                    a0Var = new C4229c();
                }
                long j = this.f4255q;
                if (j > 0) {
                    if (this.f4240b != null) {
                        a0Var = new C0923a0(a0Var, new C1017y(j, this.f4256r, this.f4248j));
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                String str = this.f4260v;
                if (!(str == null && this.f4261w == null && this.f4262x == null)) {
                    if (this.f4240b != null) {
                        int i = 0;
                        int i2 = str == null ? 0 : 1;
                        File file = this.f4261w;
                        int i3 = i2 + (file == null ? 0 : 1);
                        Callable<InputStream> callable = this.f4262x;
                        if (callable != null) {
                            i = 1;
                        }
                        if (i3 + i == 1) {
                            a0Var = new C1020y0(str, file, callable, a0Var);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
                C1000f fVar = this.f4244f;
                C0986o0 o0Var = fVar != null ? new C0986o0(a0Var, fVar, this.f4245g) : a0Var;
                Context context = this.f4241c;
                C0938d0 d0Var = new C0938d0(context, this.f4240b, o0Var, this.f4257s, this.f4242d, this.f4250l, this.f4251m.resolve(context), this.f4247i, this.f4248j, this.f4252n, this.f4253o, this.f4254p, this.f4258t, this.f4260v, this.f4261w, this.f4262x, this.f4243e, this.f4246h);
                T t = (C0994s0) C0992r0.m5828b(this.f4239a, "_Impl");
                t.mo5589p(d0Var);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: e */
        public C0995a<T> mo5599e() {
            this.f4253o = false;
            this.f4254p = true;
            return this;
        }

        /* renamed from: f */
        public C0995a<T> mo5600f(C4215c.C4219c cVar) {
            this.f4249k = cVar;
            return this;
        }

        /* renamed from: g */
        public C0995a<T> mo5601g(Executor executor) {
            this.f4247i = executor;
            return this;
        }
    }

    /* renamed from: androidx.room.s0$b */
    /* compiled from: RoomDatabase */
    public static abstract class C0996b {
        /* renamed from: a */
        public void mo5602a(C4214b bVar) {
        }

        /* renamed from: b */
        public void mo5603b(C4214b bVar) {
        }

        /* renamed from: c */
        public void mo5604c(C4214b bVar) {
        }
    }

    /* renamed from: androidx.room.s0$c */
    /* compiled from: RoomDatabase */
    public enum C0997c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: c */
        private static boolean m5870c(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        public C0997c resolve(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m5870c(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: androidx.room.s0$d */
    /* compiled from: RoomDatabase */
    public static class C0998d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, C0936a>> f4264a = new HashMap<>();

        /* renamed from: a */
        private void m5871a(C0936a aVar) {
            int i = aVar.f4089a;
            int i2 = aVar.f4090b;
            TreeMap treeMap = this.f4264a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f4264a.put(Integer.valueOf(i), treeMap);
            }
            C0936a aVar2 = (C0936a) treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        /* renamed from: d */
        private List<C0936a> m5872d(List<C0936a> list, boolean z, int i, int i2) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f4264a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add((C0936a) treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        /* renamed from: b */
        public void mo5606b(C0936a... aVarArr) {
            for (C0936a a : aVarArr) {
                m5871a(a);
            }
        }

        /* renamed from: c */
        public List<C0936a> mo5607c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m5872d(new ArrayList(), i2 > i, i, i2);
        }
    }

    /* renamed from: androidx.room.s0$e */
    /* compiled from: RoomDatabase */
    public static abstract class C0999e {
        /* renamed from: a */
        public abstract void mo5608a(C4214b bVar);
    }

    /* renamed from: androidx.room.s0$f */
    /* compiled from: RoomDatabase */
    public interface C1000f {
        /* renamed from: a */
        void mo5609a(String str, List<Object> list);
    }

    /* renamed from: D */
    private <T> T m5830D(Class<T> cls, C4215c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof C0951e0) {
            return m5830D(cls, ((C0951e0) cVar).mo5474c());
        }
        return null;
    }

    /* renamed from: q */
    private void m5831q() {
        mo5574a();
        C4214b V = this.f4229d.mo5551V();
        this.f4230e.mo5506r(V);
        if (Build.VERSION.SDK_INT < 16 || !V.mo5547x0()) {
            V.mo5539m();
        } else {
            V.mo5529P();
        }
    }

    /* renamed from: r */
    private void m5832r() {
        this.f4229d.mo5551V().mo5533a0();
        if (!mo5588o()) {
            this.f4230e.mo5501j();
        }
    }

    /* renamed from: t */
    private static boolean m5833t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ Object mo5592w(C4214b bVar) {
        m5831q();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ Object mo5593y(C4214b bVar) {
        m5832r();
        return null;
    }

    /* renamed from: A */
    public Cursor mo5571A(C4221e eVar, CancellationSignal cancellationSignal) {
        mo5574a();
        mo5575b();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f4229d.mo5551V().mo5538j0(eVar);
        }
        return this.f4229d.mo5551V().mo5524D(eVar, cancellationSignal);
    }

    /* renamed from: B */
    public void mo5572B(Runnable runnable) {
        mo5576c();
        try {
            runnable.run();
            mo5573C();
        } finally {
            mo5580g();
        }
    }

    @Deprecated
    /* renamed from: C */
    public void mo5573C() {
        this.f4229d.mo5551V().mo5527M();
    }

    /* renamed from: a */
    public void mo5574a() {
        if (!this.f4231f && m5833t()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public void mo5575b() {
        if (!mo5588o() && this.f4236k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo5576c() {
        mo5574a();
        C1017y yVar = this.f4235j;
        if (yVar == null) {
            m5831q();
        } else {
            yVar.mo5634c(new C0993s(this));
        }
    }

    /* renamed from: d */
    public C4222f mo5577d(String str) {
        mo5574a();
        mo5575b();
        return this.f4229d.mo5551V().mo5545v(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C0967k0 mo5578e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C4215c mo5579f(C0938d0 d0Var);

    @Deprecated
    /* renamed from: g */
    public void mo5580g() {
        C1017y yVar = this.f4235j;
        if (yVar == null) {
            m5832r();
        } else {
            yVar.mo5634c(new C1001t(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<String, Object> mo5581h() {
        return this.f4237l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Lock mo5582i() {
        return this.f4234i.readLock();
    }

    /* renamed from: j */
    public C0967k0 mo5583j() {
        return this.f4230e;
    }

    /* renamed from: k */
    public C4215c mo5584k() {
        return this.f4229d;
    }

    /* renamed from: l */
    public Executor mo5585l() {
        return this.f4227b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<Class<?>, List<Class<?>>> mo5586m() {
        return Collections.emptyMap();
    }

    /* renamed from: n */
    public Executor mo5587n() {
        return this.f4228c;
    }

    /* renamed from: o */
    public boolean mo5588o() {
        return this.f4229d.mo5551V().mo5544r0();
    }

    /* renamed from: p */
    public void mo5589p(C0938d0 d0Var) {
        C4215c f = mo5579f(d0Var);
        this.f4229d = f;
        C1015x0 x0Var = (C1015x0) m5830D(C1015x0.class, f);
        if (x0Var != null) {
            x0Var.mo5631E(d0Var);
        }
        C1021z zVar = (C1021z) m5830D(C1021z.class, this.f4229d);
        if (zVar != null) {
            C1017y d = zVar.mo5642d();
            this.f4235j = d;
            this.f4230e.mo5503m(d);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (d0Var.f4100i == C0997c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f4229d.setWriteAheadLoggingEnabled(z);
        }
        this.f4233h = d0Var.f4096e;
        this.f4227b = d0Var.f4101j;
        this.f4228c = new C0932b1(d0Var.f4102k);
        this.f4231f = d0Var.f4099h;
        this.f4232g = z;
        if (d0Var.f4103l) {
            this.f4230e.mo5504n(d0Var.f4093b, d0Var.f4094c);
        }
        Map<Class<?>, List<Class<?>>> m = mo5586m();
        BitSet bitSet = new BitSet();
        for (Map.Entry next : m.entrySet()) {
            Class cls = (Class) next.getKey();
            Iterator it = ((List) next.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls2 = (Class) it.next();
                    int size = d0Var.f4098g.size() - 1;
                    while (true) {
                        if (size < 0) {
                            size = -1;
                            break;
                        } else if (cls2.isAssignableFrom(d0Var.f4098g.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (size >= 0) {
                        this.f4238m.put(cls2, d0Var.f4098g.get(size));
                    } else {
                        throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.");
                    }
                }
            }
        }
        int size2 = d0Var.f4098g.size() - 1;
        while (size2 >= 0) {
            if (bitSet.get(size2)) {
                size2--;
            } else {
                throw new IllegalArgumentException("Unexpected type converter " + d0Var.f4098g.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo5590s(C4214b bVar) {
        this.f4230e.mo5498g(bVar);
    }

    /* renamed from: u */
    public boolean mo5591u() {
        C1017y yVar = this.f4235j;
        if (yVar != null) {
            return yVar.mo5638g();
        }
        C4214b bVar = this.f4226a;
        return bVar != null && bVar.isOpen();
    }

    /* renamed from: z */
    public Cursor mo5594z(C4221e eVar) {
        return mo5571A(eVar, (CancellationSignal) null);
    }
}
