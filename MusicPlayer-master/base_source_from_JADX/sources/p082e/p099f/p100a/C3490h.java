package p082e.p099f.p100a;

import java.util.Arrays;
import java.util.Comparator;
import p082e.p099f.p100a.C3481b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.f.a.h */
/* compiled from: PriorityGoalRow */
public class C3490h extends C3481b {

    /* renamed from: g */
    private int f11124g = 128;

    /* renamed from: h */
    private C3493i[] f11125h = new C3493i[128];

    /* renamed from: i */
    private C3493i[] f11126i = new C3493i[128];

    /* renamed from: j */
    private int f11127j = 0;

    /* renamed from: k */
    C3492b f11128k = new C3492b(this);

    /* renamed from: e.f.a.h$a */
    /* compiled from: PriorityGoalRow */
    class C3491a implements Comparator<C3493i> {
        C3491a(C3490h hVar) {
        }

        /* renamed from: a */
        public int compare(C3493i iVar, C3493i iVar2) {
            return iVar.f11134i - iVar2.f11134i;
        }
    }

    /* renamed from: e.f.a.h$b */
    /* compiled from: PriorityGoalRow */
    class C3492b {

        /* renamed from: a */
        C3493i f11129a;

        public C3492b(C3490h hVar) {
        }

        /* renamed from: a */
        public boolean mo12490a(C3493i iVar, float f) {
            boolean z = true;
            if (this.f11129a.f11132g) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f11129a.f11140o;
                    fArr[i] = fArr[i] + (iVar.f11140o[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f11129a.f11140o[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C3490h.this.m14950G(this.f11129a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f11140o[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f11129a.f11140o[i2] = f3;
                } else {
                    this.f11129a.f11140o[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo12491b(C3493i iVar) {
            this.f11129a = iVar;
        }

        /* renamed from: c */
        public final boolean mo12492c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f11129a.f11140o[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo12493d(C3493i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f11140o[i];
                float f2 = this.f11129a.f11140o[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo12494e() {
            Arrays.fill(this.f11129a.f11140o, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f11129a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f11129a.f11140o[i] + " ";
                }
            }
            return str + "] " + this.f11129a;
        }
    }

    public C3490h(C3483c cVar) {
        super(cVar);
    }

    /* renamed from: F */
    private final void m14949F(C3493i iVar) {
        int i;
        int i2 = this.f11127j + 1;
        C3493i[] iVarArr = this.f11125h;
        if (i2 > iVarArr.length) {
            C3493i[] iVarArr2 = (C3493i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f11125h = iVarArr2;
            this.f11126i = (C3493i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C3493i[] iVarArr3 = this.f11125h;
        int i3 = this.f11127j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f11127j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f11134i > iVar.f11134i) {
            int i5 = 0;
            while (true) {
                i = this.f11127j;
                if (i5 >= i) {
                    break;
                }
                this.f11126i[i5] = this.f11125h[i5];
                i5++;
            }
            Arrays.sort(this.f11126i, 0, i, new C3491a(this));
            for (int i6 = 0; i6 < this.f11127j; i6++) {
                this.f11125h[i6] = this.f11126i[i6];
            }
        }
        iVar.f11132g = true;
        iVar.mo12496c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m14950G(C3493i iVar) {
        int i = 0;
        while (i < this.f11127j) {
            if (this.f11125h[i] == iVar) {
                while (true) {
                    int i2 = this.f11127j;
                    if (i < i2 - 1) {
                        C3493i[] iVarArr = this.f11125h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f11127j = i2 - 1;
                        iVar.f11132g = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: B */
    public void mo12433B(C3484d dVar, C3481b bVar, boolean z) {
        C3493i iVar = bVar.f11059a;
        if (iVar != null) {
            C3481b.C3482a aVar = bVar.f11063e;
            int a = aVar.mo12419a();
            for (int i = 0; i < a; i++) {
                C3493i e = aVar.mo12424e(i);
                float h = aVar.mo12427h(i);
                this.f11128k.mo12491b(e);
                if (this.f11128k.mo12490a(iVar, h)) {
                    m14949F(e);
                }
                this.f11060b += bVar.f11060b * h;
            }
            m14950G(iVar);
        }
    }

    /* renamed from: b */
    public C3493i mo12437b(C3484d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f11127j; i2++) {
            C3493i iVar = this.f11125h[i2];
            if (!zArr[iVar.f11134i]) {
                this.f11128k.mo12491b(iVar);
                if (i == -1) {
                    if (!this.f11128k.mo12492c()) {
                    }
                } else if (!this.f11128k.mo12493d(this.f11125h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f11125h[i];
    }

    /* renamed from: c */
    public void mo12438c(C3493i iVar) {
        this.f11128k.mo12491b(iVar);
        this.f11128k.mo12494e();
        iVar.f11140o[iVar.f11136k] = 1.0f;
        m14949F(iVar);
    }

    public void clear() {
        this.f11127j = 0;
        this.f11060b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f11127j == 0;
    }

    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f11060b + ") : ";
        for (int i = 0; i < this.f11127j; i++) {
            this.f11128k.mo12491b(this.f11125h[i]);
            str = str + this.f11128k + " ";
        }
        return str;
    }
}
