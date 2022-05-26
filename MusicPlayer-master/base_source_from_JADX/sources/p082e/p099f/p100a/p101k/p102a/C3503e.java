package p082e.p099f.p100a.p101k.p102a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: e.f.a.k.a.e */
/* compiled from: KeyCycleOscillator */
public abstract class C3503e {

    /* renamed from: a */
    private C3505b f11196a;

    /* renamed from: b */
    private String f11197b;

    /* renamed from: c */
    private int f11198c = 0;

    /* renamed from: d */
    private String f11199d = null;

    /* renamed from: e */
    public int f11200e = 0;

    /* renamed from: f */
    ArrayList<C3506c> f11201f = new ArrayList<>();

    /* renamed from: e.f.a.k.a.e$a */
    /* compiled from: KeyCycleOscillator */
    class C3504a implements Comparator<C3506c> {
        C3504a(C3503e eVar) {
        }

        /* renamed from: a */
        public int compare(C3506c cVar, C3506c cVar2) {
            return Integer.compare(cVar.f11211a, cVar2.f11211a);
        }
    }

    /* renamed from: e.f.a.k.a.e$b */
    /* compiled from: KeyCycleOscillator */
    static class C3505b {

        /* renamed from: a */
        C3509h f11202a;

        /* renamed from: b */
        float[] f11203b;

        /* renamed from: c */
        double[] f11204c;

        /* renamed from: d */
        float[] f11205d;

        /* renamed from: e */
        float[] f11206e;

        /* renamed from: f */
        float[] f11207f;

        /* renamed from: g */
        C3498b f11208g;

        /* renamed from: h */
        double[] f11209h;

        /* renamed from: i */
        double[] f11210i;

        C3505b(int i, String str, int i2, int i3) {
            C3509h hVar = new C3509h();
            this.f11202a = hVar;
            hVar.mo12549g(i, str);
            this.f11203b = new float[i3];
            this.f11204c = new double[i3];
            this.f11205d = new float[i3];
            this.f11206e = new float[i3];
            this.f11207f = new float[i3];
            float[] fArr = new float[i3];
        }

        /* renamed from: a */
        public double mo12539a(float f) {
            C3498b bVar = this.f11208g;
            if (bVar != null) {
                double d = (double) f;
                bVar.mo12511g(d, this.f11210i);
                this.f11208g.mo12508d(d, this.f11209h);
            } else {
                double[] dArr = this.f11210i;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = (double) f;
            double e = this.f11202a.mo12547e(d2, this.f11209h[1]);
            double d3 = this.f11202a.mo12546d(d2, this.f11209h[1], this.f11210i[1]);
            double[] dArr2 = this.f11210i;
            return dArr2[0] + (e * dArr2[2]) + (d3 * this.f11209h[2]);
        }

        /* renamed from: b */
        public double mo12540b(float f) {
            C3498b bVar = this.f11208g;
            if (bVar != null) {
                bVar.mo12508d((double) f, this.f11209h);
            } else {
                double[] dArr = this.f11209h;
                dArr[0] = (double) this.f11206e[0];
                dArr[1] = (double) this.f11207f[0];
                dArr[2] = (double) this.f11203b[0];
            }
            double[] dArr2 = this.f11209h;
            return dArr2[0] + (this.f11202a.mo12547e((double) f, dArr2[1]) * this.f11209h[2]);
        }

        /* renamed from: c */
        public void mo12541c(int i, int i2, float f, float f2, float f3, float f4) {
            this.f11204c[i] = ((double) i2) / 100.0d;
            this.f11205d[i] = f;
            this.f11206e[i] = f2;
            this.f11207f[i] = f3;
            this.f11203b[i] = f4;
        }

        /* renamed from: d */
        public void mo12542d(float f) {
            int length = this.f11204c.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.f11203b;
            this.f11209h = new double[(fArr.length + 2)];
            this.f11210i = new double[(fArr.length + 2)];
            if (this.f11204c[0] > 0.0d) {
                this.f11202a.mo12543a(0.0d, this.f11205d[0]);
            }
            double[] dArr2 = this.f11204c;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f11202a.mo12543a(1.0d, this.f11205d[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.f11206e[i];
                dArr[i][1] = (double) this.f11207f[i];
                dArr[i][2] = (double) this.f11203b[i];
                this.f11202a.mo12543a(this.f11204c[i], this.f11205d[i]);
            }
            this.f11202a.mo12548f();
            double[] dArr3 = this.f11204c;
            if (dArr3.length > 1) {
                this.f11208g = C3498b.m15003a(0, dArr3, dArr);
            } else {
                this.f11208g = null;
            }
        }
    }

    /* renamed from: e.f.a.k.a.e$c */
    /* compiled from: KeyCycleOscillator */
    static class C3506c {

        /* renamed from: a */
        int f11211a;

        /* renamed from: b */
        float f11212b;

        /* renamed from: c */
        float f11213c;

        /* renamed from: d */
        float f11214d;

        /* renamed from: e */
        float f11215e;

        public C3506c(int i, float f, float f2, float f3, float f4) {
            this.f11211a = i;
            this.f11212b = f4;
            this.f11213c = f2;
            this.f11214d = f;
            this.f11215e = f3;
        }
    }

    /* renamed from: a */
    public float mo12528a(float f) {
        return (float) this.f11196a.mo12540b(f);
    }

    /* renamed from: b */
    public float mo12529b(float f) {
        return (float) this.f11196a.mo12539a(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12530c(Object obj) {
    }

    /* renamed from: d */
    public void mo12531d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        int i4 = i3;
        this.f11201f.add(new C3506c(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f11200e = i4;
        }
        this.f11198c = i2;
        this.f11199d = str;
    }

    /* renamed from: e */
    public void mo12532e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        int i4 = i3;
        this.f11201f.add(new C3506c(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f11200e = i4;
        }
        this.f11198c = i2;
        mo12530c(obj);
        this.f11199d = str;
    }

    /* renamed from: f */
    public void mo12533f(String str) {
        this.f11197b = str;
    }

    /* renamed from: g */
    public void mo12534g(float f) {
        int size = this.f11201f.size();
        if (size != 0) {
            Collections.sort(this.f11201f, new C3504a(this));
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.f11196a = new C3505b(this.f11198c, this.f11199d, this.f11200e, size);
            Iterator<C3506c> it = this.f11201f.iterator();
            int i = 0;
            while (it.hasNext()) {
                C3506c next = it.next();
                float f2 = next.f11214d;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.f11212b;
                dArr3[c] = (double) f3;
                double[] dArr4 = dArr2[i];
                float f4 = next.f11213c;
                dArr4[1] = (double) f4;
                double[] dArr5 = dArr2[i];
                float f5 = next.f11215e;
                dArr5[2] = (double) f5;
                this.f11196a.mo12541c(i, next.f11211a, f2, f4, f5, f3);
                i++;
                c = 0;
            }
            this.f11196a.mo12542d(f);
            C3498b.m15003a(0, dArr, dArr2);
        }
    }

    /* renamed from: h */
    public boolean mo12535h() {
        return this.f11200e == 1;
    }

    public String toString() {
        String str = this.f11197b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C3506c> it = this.f11201f.iterator();
        while (it.hasNext()) {
            C3506c next = it.next();
            str = str + "[" + next.f11211a + " , " + decimalFormat.format((double) next.f11212b) + "] ";
        }
        return str;
    }
}
