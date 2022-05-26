package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p082e.p149u.p150a.C4220d;
import p082e.p149u.p150a.C4221e;

/* renamed from: androidx.room.v0 */
/* compiled from: RoomSQLiteQuery */
public class C1008v0 implements C4221e, C4220d {

    /* renamed from: o */
    static final TreeMap<Integer, C1008v0> f4275o = new TreeMap<>();

    /* renamed from: g */
    private volatile String f4276g;

    /* renamed from: h */
    final long[] f4277h;

    /* renamed from: i */
    final double[] f4278i;

    /* renamed from: j */
    final String[] f4279j;

    /* renamed from: k */
    final byte[][] f4280k;

    /* renamed from: l */
    private final int[] f4281l;

    /* renamed from: m */
    final int f4282m;

    /* renamed from: n */
    int f4283n;

    private C1008v0(int i) {
        this.f4282m = i;
        int i2 = i + 1;
        this.f4281l = new int[i2];
        this.f4277h = new long[i2];
        this.f4278i = new double[i2];
        this.f4279j = new String[i2];
        this.f4280k = new byte[i2][];
    }

    /* renamed from: E */
    private static void m5895E() {
        TreeMap<Integer, C1008v0> treeMap = f4275o;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    public static C1008v0 m5896p(String str, int i) {
        TreeMap<Integer, C1008v0> treeMap = f4275o;
        synchronized (treeMap) {
            Map.Entry<Integer, C1008v0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C1008v0 value = ceilingEntry.getValue();
                value.mo5626x(str, i);
                return value;
            }
            C1008v0 v0Var = new C1008v0(i);
            v0Var.mo5626x(str, i);
            return v0Var;
        }
    }

    /* renamed from: H */
    public void mo5622H() {
        TreeMap<Integer, C1008v0> treeMap = f4275o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f4282m), this);
            m5895E();
        }
    }

    /* renamed from: L */
    public void mo5557L(int i, long j) {
        this.f4281l[i] = 2;
        this.f4277h[i] = j;
    }

    /* renamed from: S */
    public void mo5558S(int i, byte[] bArr) {
        this.f4281l[i] = 5;
        this.f4280k[i] = bArr;
    }

    /* renamed from: c */
    public String mo5623c() {
        return this.f4276g;
    }

    public void close() {
    }

    /* renamed from: d */
    public void mo5625d(C4220d dVar) {
        for (int i = 1; i <= this.f4283n; i++) {
            int i2 = this.f4281l[i];
            if (i2 == 1) {
                dVar.mo5561k0(i);
            } else if (i2 == 2) {
                dVar.mo5557L(i, this.f4277h[i]);
            } else if (i2 == 3) {
                dVar.mo5563y(i, this.f4278i[i]);
            } else if (i2 == 4) {
                dVar.mo5562r(i, this.f4279j[i]);
            } else if (i2 == 5) {
                dVar.mo5558S(i, this.f4280k[i]);
            }
        }
    }

    /* renamed from: k0 */
    public void mo5561k0(int i) {
        this.f4281l[i] = 1;
    }

    /* renamed from: r */
    public void mo5562r(int i, String str) {
        this.f4281l[i] = 4;
        this.f4279j[i] = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5626x(String str, int i) {
        this.f4276g = str;
        this.f4283n = i;
    }

    /* renamed from: y */
    public void mo5563y(int i, double d) {
        this.f4281l[i] = 3;
        this.f4278i[i] = d;
    }
}
