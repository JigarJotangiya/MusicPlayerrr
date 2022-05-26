package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p082e.p091b.p092a.p094b.C3451b;
import p082e.p149u.p150a.C4213a;
import p082e.p149u.p150a.C4214b;
import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.k0 */
/* compiled from: InvalidationTracker */
public class C0967k0 {

    /* renamed from: m */
    private static final String[] f4152m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap<String, Integer> f4153a;

    /* renamed from: b */
    final String[] f4154b;

    /* renamed from: c */
    private Map<String, Set<String>> f4155c;

    /* renamed from: d */
    C1017y f4156d = null;

    /* renamed from: e */
    final C0994s0 f4157e;

    /* renamed from: f */
    AtomicBoolean f4158f;

    /* renamed from: g */
    private volatile boolean f4159g;

    /* renamed from: h */
    volatile C4222f f4160h;

    /* renamed from: i */
    private C0969b f4161i;

    /* renamed from: j */
    private final C0965j0 f4162j;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: k */
    final C3451b<C0970c, C0971d> f4163k;

    /* renamed from: l */
    Runnable f4164l;

    /* renamed from: androidx.room.k0$a */
    /* compiled from: InvalidationTracker */
    class C0968a implements Runnable {
        C0968a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m5759a() {
            HashSet hashSet = new HashSet();
            Cursor z = C0967k0.this.f4157e.mo5594z(new C4213a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (z.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(z.getInt(0)));
                } catch (Throwable th) {
                    z.close();
                    throw th;
                }
            }
            z.close();
            if (!hashSet.isEmpty()) {
                C0967k0.this.f4160h.mo5568u();
            }
            return hashSet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
            if (r0 != null) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
            r0.mo5633b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
            if (r0 == null) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
            if (r1.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
            r0 = r5.f4165g.f4163k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            r2 = r5.f4165g.f4163k.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b4, code lost:
            if (r2.hasNext() == false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
            ((androidx.room.C0967k0.C0971d) r2.next().getValue()).mo5515a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c6, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.s0 r0 = r0.f4157e
                java.util.concurrent.locks.Lock r0 = r0.mo5582i()
                r0.lock()
                r1 = 0
                androidx.room.k0 r2 = androidx.room.C0967k0.this     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                boolean r2 = r2.mo5497f()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                if (r2 != 0) goto L_0x0021
                r0.unlock()
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.y r0 = r0.f4156d
                if (r0 == 0) goto L_0x0020
                r0.mo5633b()
            L_0x0020:
                return
            L_0x0021:
                androidx.room.k0 r2 = androidx.room.C0967k0.this     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f4158f     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                r3 = 1
                r4 = 0
                boolean r2 = r2.compareAndSet(r3, r4)     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                if (r2 != 0) goto L_0x003a
                r0.unlock()
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.y r0 = r0.f4156d
                if (r0 == 0) goto L_0x0039
                r0.mo5633b()
            L_0x0039:
                return
            L_0x003a:
                androidx.room.k0 r2 = androidx.room.C0967k0.this     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                androidx.room.s0 r2 = r2.f4157e     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                boolean r2 = r2.mo5588o()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                if (r2 == 0) goto L_0x0051
                r0.unlock()
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.y r0 = r0.f4156d
                if (r0 == 0) goto L_0x0050
                r0.mo5633b()
            L_0x0050:
                return
            L_0x0051:
                androidx.room.k0 r2 = androidx.room.C0967k0.this     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                androidx.room.s0 r2 = r2.f4157e     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                boolean r3 = r2.f4232g     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                if (r3 == 0) goto L_0x0074
                e.u.a.c r2 = r2.mo5584k()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                e.u.a.b r2 = r2.mo5551V()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                r2.mo5529P()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                java.util.Set r1 = r5.m5759a()     // Catch:{ all -> 0x006f }
                r2.mo5527M()     // Catch:{ all -> 0x006f }
                r2.mo5533a0()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                goto L_0x0078
            L_0x006f:
                r3 = move-exception
                r2.mo5533a0()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
                throw r3     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
            L_0x0074:
                java.util.Set r1 = r5.m5759a()     // Catch:{ IllegalStateException -> 0x0089, SQLiteException -> 0x0087 }
            L_0x0078:
                r0.unlock()
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.y r0 = r0.f4156d
                if (r0 == 0) goto L_0x009b
            L_0x0081:
                r0.mo5633b()
                goto L_0x009b
            L_0x0085:
                r1 = move-exception
                goto L_0x00cc
            L_0x0087:
                r2 = move-exception
                goto L_0x008a
            L_0x0089:
                r2 = move-exception
            L_0x008a:
                java.lang.String r3 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0085 }
                r0.unlock()
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.y r0 = r0.f4156d
                if (r0 == 0) goto L_0x009b
                goto L_0x0081
            L_0x009b:
                if (r1 == 0) goto L_0x00cb
                boolean r0 = r1.isEmpty()
                if (r0 != 0) goto L_0x00cb
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                e.b.a.b.b<androidx.room.k0$c, androidx.room.k0$d> r0 = r0.f4163k
                monitor-enter(r0)
                androidx.room.k0 r2 = androidx.room.C0967k0.this     // Catch:{ all -> 0x00c8 }
                e.b.a.b.b<androidx.room.k0$c, androidx.room.k0$d> r2 = r2.f4163k     // Catch:{ all -> 0x00c8 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c8 }
            L_0x00b0:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00c8 }
                if (r3 == 0) goto L_0x00c6
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00c8 }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00c8 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00c8 }
                androidx.room.k0$d r3 = (androidx.room.C0967k0.C0971d) r3     // Catch:{ all -> 0x00c8 }
                r3.mo5515a(r1)     // Catch:{ all -> 0x00c8 }
                goto L_0x00b0
            L_0x00c6:
                monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
                goto L_0x00cb
            L_0x00c8:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00c8 }
                throw r1
            L_0x00cb:
                return
            L_0x00cc:
                r0.unlock()
                androidx.room.k0 r0 = androidx.room.C0967k0.this
                androidx.room.y r0 = r0.f4156d
                if (r0 == 0) goto L_0x00d8
                r0.mo5633b()
            L_0x00d8:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0967k0.C0968a.run():void");
        }
    }

    /* renamed from: androidx.room.k0$b */
    /* compiled from: InvalidationTracker */
    static class C0969b {

        /* renamed from: a */
        final long[] f4166a;

        /* renamed from: b */
        final boolean[] f4167b;

        /* renamed from: c */
        final int[] f4168c;

        /* renamed from: d */
        boolean f4169d;

        /* renamed from: e */
        boolean f4170e;

        C0969b(int i) {
            long[] jArr = new long[i];
            this.f4166a = jArr;
            boolean[] zArr = new boolean[i];
            this.f4167b = zArr;
            this.f4168c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo5508a() {
            synchronized (this) {
                if (this.f4169d) {
                    if (!this.f4170e) {
                        int length = this.f4166a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f4166a[i] > 0;
                                boolean[] zArr = this.f4167b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f4168c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f4168c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f4170e = true;
                                this.f4169d = false;
                                int[] iArr2 = this.f4168c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5509b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f4166a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f4169d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5510c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f4166a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f4169d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5511d() {
            synchronized (this) {
                this.f4170e = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5512e() {
            synchronized (this) {
                Arrays.fill(this.f4167b, false);
                this.f4169d = true;
            }
        }
    }

    /* renamed from: androidx.room.k0$c */
    /* compiled from: InvalidationTracker */
    public static abstract class C0970c {

        /* renamed from: a */
        final String[] f4171a;

        public C0970c(String[] strArr) {
            this.f4171a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5513a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo5514b(Set<String> set);
    }

    /* renamed from: androidx.room.k0$d */
    /* compiled from: InvalidationTracker */
    static class C0971d {

        /* renamed from: a */
        final int[] f4172a;

        /* renamed from: b */
        private final String[] f4173b;

        /* renamed from: c */
        final C0970c f4174c;

        /* renamed from: d */
        private final Set<String> f4175d;

        C0971d(C0970c cVar, int[] iArr, String[] strArr) {
            this.f4174c = cVar;
            this.f4172a = iArr;
            this.f4173b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f4175d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f4175d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5515a(Set<Integer> set) {
            int length = this.f4172a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f4172a[i]))) {
                    if (length == 1) {
                        set2 = this.f4175d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f4173b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f4174c.mo5514b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5516b(String[] strArr) {
            Set<String> set = null;
            if (this.f4173b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f4173b[0])) {
                        set = this.f4175d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4173b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4174c.mo5514b(set);
            }
        }
    }

    /* renamed from: androidx.room.k0$e */
    /* compiled from: InvalidationTracker */
    static class C0972e extends C0970c {

        /* renamed from: b */
        final C0967k0 f4176b;

        /* renamed from: c */
        final WeakReference<C0970c> f4177c;

        C0972e(C0967k0 k0Var, C0970c cVar) {
            super(cVar.f4171a);
            this.f4176b = k0Var;
            this.f4177c = new WeakReference<>(cVar);
        }

        /* renamed from: b */
        public void mo5514b(Set<String> set) {
            C0970c cVar = (C0970c) this.f4177c.get();
            if (cVar == null) {
                this.f4176b.mo5502k(this);
            } else {
                cVar.mo5514b(set);
            }
        }
    }

    public C0967k0(C0994s0 s0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4158f = new AtomicBoolean(false);
        this.f4159g = false;
        this.f4163k = new C3451b<>();
        this.f4164l = new C0968a();
        this.f4157e = s0Var;
        this.f4161i = new C0969b(strArr.length);
        this.f4153a = new HashMap<>();
        this.f4155c = map2;
        this.f4162j = new C0965j0(s0Var);
        int length = strArr.length;
        this.f4154b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4153a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f4154b[i] = str2.toLowerCase(locale);
            } else {
                this.f4154b[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f4153a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4153a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: c */
    private static void m5740c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: d */
    private static void m5741d(C4214b bVar) {
        if (Build.VERSION.SDK_INT < 16 || !bVar.mo5547x0()) {
            bVar.mo5539m();
        } else {
            bVar.mo5529P();
        }
    }

    /* renamed from: l */
    private String[] m5742l(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4155c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4155c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: o */
    private void m5743o(C4214b bVar, int i) {
        bVar.mo5543q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f4154b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4152m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m5740c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.mo5543q(sb.toString());
        }
    }

    /* renamed from: p */
    private void m5744p(C4214b bVar, int i) {
        String str = this.f4154b[i];
        StringBuilder sb = new StringBuilder();
        for (String c : f4152m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m5740c(sb, str, c);
            bVar.mo5543q(sb.toString());
        }
    }

    /* renamed from: s */
    private String[] m5745s(String[] strArr) {
        String[] l = m5742l(strArr);
        int length = l.length;
        int i = 0;
        while (i < length) {
            String str = l[i];
            if (this.f4153a.containsKey(str.toLowerCase(Locale.US))) {
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return l;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo5494a(C0970c cVar) {
        C0971d v;
        String[] l = m5742l(cVar.f4171a);
        int[] iArr = new int[l.length];
        int length = l.length;
        int i = 0;
        while (i < length) {
            Integer num = this.f4153a.get(l[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + l[i]);
            }
        }
        C0971d dVar = new C0971d(cVar, iArr, l);
        synchronized (this.f4163k) {
            v = this.f4163k.mo12236v(cVar, dVar);
        }
        if (v == null && this.f4161i.mo5509b(iArr)) {
            mo5505q();
        }
    }

    /* renamed from: b */
    public void mo5495b(C0970c cVar) {
        mo5494a(new C0972e(this, cVar));
    }

    /* renamed from: e */
    public <T> LiveData<T> mo5496e(String[] strArr, boolean z, Callable<T> callable) {
        return this.f4162j.mo5490a(m5745s(strArr), z, callable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo5497f() {
        if (!this.f4157e.mo5591u()) {
            return false;
        }
        if (!this.f4159g) {
            this.f4157e.mo5584k().mo5551V();
        }
        if (this.f4159g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5498g(C4214b bVar) {
        synchronized (this) {
            if (this.f4159g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.mo5543q("PRAGMA temp_store = MEMORY;");
            bVar.mo5543q("PRAGMA recursive_triggers='ON';");
            bVar.mo5543q("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo5506r(bVar);
            this.f4160h = bVar.mo5545v("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4159g = true;
        }
    }

    /* renamed from: h */
    public void mo5499h(String... strArr) {
        synchronized (this.f4163k) {
            Iterator<Map.Entry<C0970c, C0971d>> it = this.f4163k.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C0970c) next.getKey()).mo5513a()) {
                    ((C0971d) next.getValue()).mo5516b(strArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5500i() {
        synchronized (this) {
            this.f4159g = false;
            this.f4161i.mo5512e();
        }
    }

    /* renamed from: j */
    public void mo5501j() {
        if (this.f4158f.compareAndSet(false, true)) {
            C1017y yVar = this.f4156d;
            if (yVar != null) {
                yVar.mo5636e();
            }
            this.f4157e.mo5585l().execute(this.f4164l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: k */
    public void mo5502k(C0970c cVar) {
        C0971d x;
        synchronized (this.f4163k) {
            x = this.f4163k.mo12237x(cVar);
        }
        if (x != null && this.f4161i.mo5510c(x.f4172a)) {
            mo5505q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5503m(C1017y yVar) {
        this.f4156d = yVar;
        yVar.mo5639h(new C1009w(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5504n(Context context, String str) {
        new C0974l0(context, str, this, this.f4157e.mo5585l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5505q() {
        if (this.f4157e.mo5591u()) {
            mo5506r(this.f4157e.mo5584k().mo5551V());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5506r(C4214b bVar) {
        if (!bVar.mo5544r0()) {
            while (true) {
                try {
                    Lock i = this.f4157e.mo5582i();
                    i.lock();
                    try {
                        int[] a = this.f4161i.mo5508a();
                        if (a == null) {
                            i.unlock();
                            return;
                        }
                        int length = a.length;
                        m5741d(bVar);
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a[i2];
                            if (i3 == 1) {
                                m5743o(bVar, i2);
                            } else if (i3 == 2) {
                                m5744p(bVar, i2);
                            }
                        }
                        bVar.mo5527M();
                        bVar.mo5533a0();
                        this.f4161i.mo5511d();
                        i.unlock();
                    } catch (Throwable th) {
                        i.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }
}
