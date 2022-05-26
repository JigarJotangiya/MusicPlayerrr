package p082e.p099f.p100a;

import java.util.Arrays;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.f.a.i */
/* compiled from: SolverVariable */
public class C3493i implements Comparable<C3493i> {

    /* renamed from: w */
    private static int f11131w = 1;

    /* renamed from: g */
    public boolean f11132g;

    /* renamed from: h */
    private String f11133h;

    /* renamed from: i */
    public int f11134i = -1;

    /* renamed from: j */
    int f11135j = -1;

    /* renamed from: k */
    public int f11136k = 0;

    /* renamed from: l */
    public float f11137l;

    /* renamed from: m */
    public boolean f11138m = false;

    /* renamed from: n */
    float[] f11139n = new float[9];

    /* renamed from: o */
    float[] f11140o = new float[9];

    /* renamed from: p */
    C3494a f11141p;

    /* renamed from: q */
    C3481b[] f11142q = new C3481b[16];

    /* renamed from: r */
    int f11143r = 0;

    /* renamed from: s */
    public int f11144s = 0;

    /* renamed from: t */
    boolean f11145t = false;

    /* renamed from: u */
    int f11146u = -1;

    /* renamed from: v */
    float f11147v = 0.0f;

    /* renamed from: e.f.a.i$a */
    /* compiled from: SolverVariable */
    public enum C3494a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C3493i(C3494a aVar, String str) {
        this.f11141p = aVar;
    }

    /* renamed from: h */
    static void m14960h() {
        f11131w++;
    }

    /* renamed from: c */
    public final void mo12496c(C3481b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f11143r;
            if (i >= i2) {
                C3481b[] bVarArr = this.f11142q;
                if (i2 >= bVarArr.length) {
                    this.f11142q = (C3481b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C3481b[] bVarArr2 = this.f11142q;
                int i3 = this.f11143r;
                bVarArr2[i3] = bVar;
                this.f11143r = i3 + 1;
                return;
            } else if (this.f11142q[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public int compareTo(C3493i iVar) {
        return this.f11134i - iVar.f11134i;
    }

    /* renamed from: j */
    public final void mo12499j(C3481b bVar) {
        int i = this.f11143r;
        int i2 = 0;
        while (i2 < i) {
            if (this.f11142q[i2] == bVar) {
                while (i2 < i - 1) {
                    C3481b[] bVarArr = this.f11142q;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f11143r--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: k */
    public void mo12500k() {
        this.f11133h = null;
        this.f11141p = C3494a.UNKNOWN;
        this.f11136k = 0;
        this.f11134i = -1;
        this.f11135j = -1;
        this.f11137l = 0.0f;
        this.f11138m = false;
        this.f11145t = false;
        this.f11146u = -1;
        this.f11147v = 0.0f;
        int i = this.f11143r;
        for (int i2 = 0; i2 < i; i2++) {
            this.f11142q[i2] = null;
        }
        this.f11143r = 0;
        this.f11144s = 0;
        this.f11132g = false;
        Arrays.fill(this.f11140o, 0.0f);
    }

    /* renamed from: l */
    public void mo12501l(C3484d dVar, float f) {
        this.f11137l = f;
        this.f11138m = true;
        this.f11145t = false;
        this.f11146u = -1;
        this.f11147v = 0.0f;
        int i = this.f11143r;
        this.f11135j = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f11142q[i2].mo12432A(dVar, this, false);
        }
        this.f11143r = 0;
    }

    /* renamed from: o */
    public void mo12502o(C3494a aVar, String str) {
        this.f11141p = aVar;
    }

    /* renamed from: p */
    public final void mo12503p(C3484d dVar, C3481b bVar) {
        int i = this.f11143r;
        for (int i2 = 0; i2 < i; i2++) {
            this.f11142q[i2].mo12433B(dVar, bVar, false);
        }
        this.f11143r = 0;
    }

    public String toString() {
        if (this.f11133h != null) {
            return BuildConfig.FLAVOR + this.f11133h;
        }
        return BuildConfig.FLAVOR + this.f11134i;
    }
}
