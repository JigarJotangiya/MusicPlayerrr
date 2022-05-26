package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C0885l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C0809p implements C0885l.C0897i, RecyclerView.C0823y.C0825b {

    /* renamed from: A */
    int f3498A;

    /* renamed from: B */
    int f3499B;

    /* renamed from: C */
    private boolean f3500C;

    /* renamed from: D */
    SavedState f3501D;

    /* renamed from: E */
    final C0783a f3502E;

    /* renamed from: F */
    private final C0784b f3503F;

    /* renamed from: G */
    private int f3504G;

    /* renamed from: H */
    private int[] f3505H;

    /* renamed from: s */
    int f3506s;

    /* renamed from: t */
    private C0785c f3507t;

    /* renamed from: u */
    C0908u f3508u;

    /* renamed from: v */
    private boolean f3509v;

    /* renamed from: w */
    private boolean f3510w;

    /* renamed from: x */
    boolean f3511x;

    /* renamed from: y */
    private boolean f3512y;

    /* renamed from: z */
    private boolean f3513z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0782a();

        /* renamed from: g */
        int f3514g;

        /* renamed from: h */
        int f3515h;

        /* renamed from: i */
        boolean f3516i;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        class C0782a implements Parcelable.Creator<SavedState> {
            C0782a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4509a() {
            return this.f3514g >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4510b() {
            this.f3514g = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3514g);
            parcel.writeInt(this.f3515h);
            parcel.writeInt(this.f3516i ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f3514g = parcel.readInt();
            this.f3515h = parcel.readInt();
            this.f3516i = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f3514g = savedState.f3514g;
            this.f3515h = savedState.f3515h;
            this.f3516i = savedState.f3516i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0783a {

        /* renamed from: a */
        C0908u f3517a;

        /* renamed from: b */
        int f3518b;

        /* renamed from: c */
        int f3519c;

        /* renamed from: d */
        boolean f3520d;

        /* renamed from: e */
        boolean f3521e;

        C0783a() {
            mo4521e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4517a() {
            int i;
            if (this.f3520d) {
                i = this.f3517a.mo5392i();
            } else {
                i = this.f3517a.mo5396m();
            }
            this.f3519c = i;
        }

        /* renamed from: b */
        public void mo4518b(View view, int i) {
            if (this.f3520d) {
                this.f3519c = this.f3517a.mo5387d(view) + this.f3517a.mo5398o();
            } else {
                this.f3519c = this.f3517a.mo5390g(view);
            }
            this.f3518b = i;
        }

        /* renamed from: c */
        public void mo4519c(View view, int i) {
            int o = this.f3517a.mo5398o();
            if (o >= 0) {
                mo4518b(view, i);
                return;
            }
            this.f3518b = i;
            if (this.f3520d) {
                int i2 = (this.f3517a.mo5392i() - o) - this.f3517a.mo5387d(view);
                this.f3519c = this.f3517a.mo5392i() - i2;
                if (i2 > 0) {
                    int e = this.f3519c - this.f3517a.mo5388e(view);
                    int m = this.f3517a.mo5396m();
                    int min = e - (m + Math.min(this.f3517a.mo5390g(view) - m, 0));
                    if (min < 0) {
                        this.f3519c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3517a.mo5390g(view);
            int m2 = g - this.f3517a.mo5396m();
            this.f3519c = g;
            if (m2 > 0) {
                int i3 = (this.f3517a.mo5392i() - Math.min(0, (this.f3517a.mo5392i() - o) - this.f3517a.mo5387d(view))) - (g + this.f3517a.mo5388e(view));
                if (i3 < 0) {
                    this.f3519c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4520d(View view, RecyclerView.C0826z zVar) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.mo4708c() && layoutParams.mo4706a() >= 0 && layoutParams.mo4706a() < zVar.mo5057b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4521e() {
            this.f3518b = -1;
            this.f3519c = Integer.MIN_VALUE;
            this.f3520d = false;
            this.f3521e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3518b + ", mCoordinate=" + this.f3519c + ", mLayoutFromEnd=" + this.f3520d + ", mValid=" + this.f3521e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0784b {

        /* renamed from: a */
        public int f3522a;

        /* renamed from: b */
        public boolean f3523b;

        /* renamed from: c */
        public boolean f3524c;

        /* renamed from: d */
        public boolean f3525d;

        protected C0784b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4523a() {
            this.f3522a = 0;
            this.f3523b = false;
            this.f3524c = false;
            this.f3525d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0785c {

        /* renamed from: a */
        boolean f3526a = true;

        /* renamed from: b */
        int f3527b;

        /* renamed from: c */
        int f3528c;

        /* renamed from: d */
        int f3529d;

        /* renamed from: e */
        int f3530e;

        /* renamed from: f */
        int f3531f;

        /* renamed from: g */
        int f3532g;

        /* renamed from: h */
        int f3533h = 0;

        /* renamed from: i */
        int f3534i = 0;

        /* renamed from: j */
        boolean f3535j;

        /* renamed from: k */
        int f3536k;

        /* renamed from: l */
        List<RecyclerView.C0792c0> f3537l = null;

        /* renamed from: m */
        boolean f3538m;

        C0785c() {
        }

        /* renamed from: e */
        private View m4611e() {
            int size = this.f3537l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3537l.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.mo4708c() && this.f3529d == layoutParams.mo4706a()) {
                    mo4525b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4524a() {
            mo4525b((View) null);
        }

        /* renamed from: b */
        public void mo4525b(View view) {
            View f = mo4528f(view);
            if (f == null) {
                this.f3529d = -1;
            } else {
                this.f3529d = ((RecyclerView.LayoutParams) f.getLayoutParams()).mo4706a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4526c(RecyclerView.C0826z zVar) {
            int i = this.f3529d;
            return i >= 0 && i < zVar.mo5057b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo4527d(RecyclerView.C0820v vVar) {
            if (this.f3537l != null) {
                return m4611e();
            }
            View o = vVar.mo5022o(this.f3529d);
            this.f3529d += this.f3530e;
            return o;
        }

        /* renamed from: f */
        public View mo4528f(View view) {
            int a;
            int size = this.f3537l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3537l.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo4708c() && (a = (layoutParams.mo4706a() - this.f3529d) * this.f3530e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: E2 */
    private boolean m4521E2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, C0783a aVar) {
        View h2;
        boolean z = false;
        if (mo4901K() == 0) {
            return false;
        }
        View W = mo4917W();
        if (W == null || !aVar.mo4520d(W, zVar)) {
            boolean z2 = this.f3509v;
            boolean z3 = this.f3512y;
            if (z2 != z3 || (h2 = mo4446h2(vVar, zVar, aVar.f3520d, z3)) == null) {
                return false;
            }
            aVar.mo4518b(h2, mo4941i0(h2));
            if (!zVar.mo5060e() && mo4431M1()) {
                int g = this.f3508u.mo5390g(h2);
                int d = this.f3508u.mo5387d(h2);
                int m = this.f3508u.mo5396m();
                int i = this.f3508u.mo5392i();
                boolean z4 = d <= m && g < m;
                if (g >= i && d > i) {
                    z = true;
                }
                if (z4 || z) {
                    if (aVar.f3520d) {
                        m = i;
                    }
                    aVar.f3519c = m;
                }
            }
            return true;
        }
        aVar.mo4519c(W, mo4941i0(W));
        return true;
    }

    /* renamed from: F2 */
    private boolean m4522F2(RecyclerView.C0826z zVar, C0783a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (!zVar.mo5060e() && (i = this.f3498A) != -1) {
            if (i < 0 || i >= zVar.mo5057b()) {
                this.f3498A = -1;
                this.f3499B = Integer.MIN_VALUE;
            } else {
                aVar.f3518b = this.f3498A;
                SavedState savedState = this.f3501D;
                if (savedState != null && savedState.mo4509a()) {
                    boolean z2 = this.f3501D.f3516i;
                    aVar.f3520d = z2;
                    if (z2) {
                        aVar.f3519c = this.f3508u.mo5392i() - this.f3501D.f3515h;
                    } else {
                        aVar.f3519c = this.f3508u.mo5396m() + this.f3501D.f3515h;
                    }
                    return true;
                } else if (this.f3499B == Integer.MIN_VALUE) {
                    View D = mo4473D(this.f3498A);
                    if (D == null) {
                        if (mo4901K() > 0) {
                            if ((this.f3498A < mo4941i0(mo4900J(0))) == this.f3511x) {
                                z = true;
                            }
                            aVar.f3520d = z;
                        }
                        aVar.mo4517a();
                    } else if (this.f3508u.mo5388e(D) > this.f3508u.mo5397n()) {
                        aVar.mo4517a();
                        return true;
                    } else if (this.f3508u.mo5390g(D) - this.f3508u.mo5396m() < 0) {
                        aVar.f3519c = this.f3508u.mo5396m();
                        aVar.f3520d = false;
                        return true;
                    } else if (this.f3508u.mo5392i() - this.f3508u.mo5387d(D) < 0) {
                        aVar.f3519c = this.f3508u.mo5392i();
                        aVar.f3520d = true;
                        return true;
                    } else {
                        if (aVar.f3520d) {
                            i2 = this.f3508u.mo5387d(D) + this.f3508u.mo5398o();
                        } else {
                            i2 = this.f3508u.mo5390g(D);
                        }
                        aVar.f3519c = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.f3511x;
                    aVar.f3520d = z3;
                    if (z3) {
                        aVar.f3519c = this.f3508u.mo5392i() - this.f3499B;
                    } else {
                        aVar.f3519c = this.f3508u.mo5396m() + this.f3499B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G2 */
    private void m4523G2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, C0783a aVar) {
        if (!m4522F2(zVar, aVar) && !m4521E2(vVar, zVar, aVar)) {
            aVar.mo4517a();
            aVar.f3518b = this.f3512y ? zVar.mo5057b() - 1 : 0;
        }
    }

    /* renamed from: H2 */
    private void m4524H2(int i, int i2, boolean z, RecyclerView.C0826z zVar) {
        int i3;
        this.f3507t.f3538m = mo4506x2();
        this.f3507t.f3531f = i;
        int[] iArr = this.f3505H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo4478N1(zVar, iArr);
        int max = Math.max(0, this.f3505H[0]);
        int max2 = Math.max(0, this.f3505H[1]);
        if (i == 1) {
            z2 = true;
        }
        C0785c cVar = this.f3507t;
        int i5 = z2 ? max2 : max;
        cVar.f3533h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f3534i = max;
        if (z2) {
            cVar.f3533h = i5 + this.f3508u.mo5393j();
            View k2 = m4538k2();
            C0785c cVar2 = this.f3507t;
            if (this.f3511x) {
                i4 = -1;
            }
            cVar2.f3530e = i4;
            int i0 = mo4941i0(k2);
            C0785c cVar3 = this.f3507t;
            cVar2.f3529d = i0 + cVar3.f3530e;
            cVar3.f3527b = this.f3508u.mo5387d(k2);
            i3 = this.f3508u.mo5387d(k2) - this.f3508u.mo5392i();
        } else {
            View l2 = m4539l2();
            this.f3507t.f3533h += this.f3508u.mo5396m();
            C0785c cVar4 = this.f3507t;
            if (!this.f3511x) {
                i4 = -1;
            }
            cVar4.f3530e = i4;
            int i02 = mo4941i0(l2);
            C0785c cVar5 = this.f3507t;
            cVar4.f3529d = i02 + cVar5.f3530e;
            cVar5.f3527b = this.f3508u.mo5390g(l2);
            i3 = (-this.f3508u.mo5390g(l2)) + this.f3508u.mo5396m();
        }
        C0785c cVar6 = this.f3507t;
        cVar6.f3528c = i2;
        if (z) {
            cVar6.f3528c = i2 - i3;
        }
        cVar6.f3532g = i3;
    }

    /* renamed from: I2 */
    private void m4525I2(int i, int i2) {
        this.f3507t.f3528c = this.f3508u.mo5392i() - i2;
        C0785c cVar = this.f3507t;
        cVar.f3530e = this.f3511x ? -1 : 1;
        cVar.f3529d = i;
        cVar.f3531f = 1;
        cVar.f3527b = i2;
        cVar.f3532g = Integer.MIN_VALUE;
    }

    /* renamed from: J2 */
    private void m4526J2(C0783a aVar) {
        m4525I2(aVar.f3518b, aVar.f3519c);
    }

    /* renamed from: K2 */
    private void m4527K2(int i, int i2) {
        this.f3507t.f3528c = i2 - this.f3508u.mo5396m();
        C0785c cVar = this.f3507t;
        cVar.f3529d = i;
        cVar.f3530e = this.f3511x ? 1 : -1;
        cVar.f3531f = -1;
        cVar.f3527b = i2;
        cVar.f3532g = Integer.MIN_VALUE;
    }

    /* renamed from: L2 */
    private void m4528L2(C0783a aVar) {
        m4527K2(aVar.f3518b, aVar.f3519c);
    }

    /* renamed from: P1 */
    private int m4529P1(RecyclerView.C0826z zVar) {
        if (mo4901K() == 0) {
            return 0;
        }
        mo4481U1();
        C0908u uVar = this.f3508u;
        View Y1 = mo4484Y1(!this.f3513z, true);
        return C0915x.m5633a(zVar, uVar, Y1, mo4483X1(!this.f3513z, true), this, this.f3513z);
    }

    /* renamed from: Q1 */
    private int m4530Q1(RecyclerView.C0826z zVar) {
        if (mo4901K() == 0) {
            return 0;
        }
        mo4481U1();
        C0908u uVar = this.f3508u;
        View Y1 = mo4484Y1(!this.f3513z, true);
        return C0915x.m5634b(zVar, uVar, Y1, mo4483X1(!this.f3513z, true), this, this.f3513z, this.f3511x);
    }

    /* renamed from: R1 */
    private int m4531R1(RecyclerView.C0826z zVar) {
        if (mo4901K() == 0) {
            return 0;
        }
        mo4481U1();
        C0908u uVar = this.f3508u;
        View Y1 = mo4484Y1(!this.f3513z, true);
        return C0915x.m5635c(zVar, uVar, Y1, mo4483X1(!this.f3513z, true), this, this.f3513z);
    }

    /* renamed from: W1 */
    private View m4532W1() {
        return mo4491d2(0, mo4901K());
    }

    /* renamed from: b2 */
    private View m4533b2() {
        return mo4491d2(mo4901K() - 1, -1);
    }

    /* renamed from: f2 */
    private View m4534f2() {
        if (this.f3511x) {
            return m4532W1();
        }
        return m4533b2();
    }

    /* renamed from: g2 */
    private View m4535g2() {
        if (this.f3511x) {
            return m4533b2();
        }
        return m4532W1();
    }

    /* renamed from: i2 */
    private int m4536i2(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, boolean z) {
        int i2;
        int i3 = this.f3508u.mo5392i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo4508z2(-i3, vVar, zVar);
        int i5 = i + i4;
        if (!z || (i2 = this.f3508u.mo5392i() - i5) <= 0) {
            return i4;
        }
        this.f3508u.mo5401r(i2);
        return i2 + i4;
    }

    /* renamed from: j2 */
    private int m4537j2(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, boolean z) {
        int m;
        int m2 = i - this.f3508u.mo5396m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo4508z2(m2, vVar, zVar);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3508u.mo5396m()) <= 0) {
            return i2;
        }
        this.f3508u.mo5401r(-m);
        return i2 - m;
    }

    /* renamed from: k2 */
    private View m4538k2() {
        return mo4900J(this.f3511x ? 0 : mo4901K() - 1);
    }

    /* renamed from: l2 */
    private View m4539l2() {
        return mo4900J(this.f3511x ? mo4901K() - 1 : 0);
    }

    /* renamed from: r2 */
    private void m4540r2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, int i, int i2) {
        RecyclerView.C0820v vVar2 = vVar;
        RecyclerView.C0826z zVar2 = zVar;
        if (zVar.mo5062g() && mo4901K() != 0 && !zVar.mo5060e() && mo4431M1()) {
            List<RecyclerView.C0792c0> k = vVar.mo5018k();
            int size = k.size();
            int i0 = mo4941i0(mo4900J(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C0792c0 c0Var = k.get(i5);
                if (!c0Var.isRemoved()) {
                    char c = 1;
                    if ((c0Var.getLayoutPosition() < i0) != this.f3511x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f3508u.mo5388e(c0Var.itemView);
                    } else {
                        i4 += this.f3508u.mo5388e(c0Var.itemView);
                    }
                }
            }
            this.f3507t.f3537l = k;
            if (i3 > 0) {
                m4527K2(mo4941i0(m4539l2()), i);
                C0785c cVar = this.f3507t;
                cVar.f3533h = i3;
                cVar.f3528c = 0;
                cVar.mo4524a();
                mo4482V1(vVar2, this.f3507t, zVar2, false);
            }
            if (i4 > 0) {
                m4525I2(mo4941i0(m4538k2()), i2);
                C0785c cVar2 = this.f3507t;
                cVar2.f3533h = i4;
                cVar2.f3528c = 0;
                cVar2.mo4524a();
                mo4482V1(vVar2, this.f3507t, zVar2, false);
            }
            this.f3507t.f3537l = null;
        }
    }

    /* renamed from: t2 */
    private void m4541t2(RecyclerView.C0820v vVar, C0785c cVar) {
        if (cVar.f3526a && !cVar.f3538m) {
            int i = cVar.f3532g;
            int i2 = cVar.f3534i;
            if (cVar.f3531f == -1) {
                m4543v2(vVar, i, i2);
            } else {
                m4544w2(vVar, i, i2);
            }
        }
    }

    /* renamed from: u2 */
    private void m4542u2(RecyclerView.C0820v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4954o1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo4954o1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: v2 */
    private void m4543v2(RecyclerView.C0820v vVar, int i, int i2) {
        int K = mo4901K();
        if (i >= 0) {
            int h = (this.f3508u.mo5391h() - i) + i2;
            if (this.f3511x) {
                for (int i3 = 0; i3 < K; i3++) {
                    View J = mo4900J(i3);
                    if (this.f3508u.mo5390g(J) < h || this.f3508u.mo5400q(J) < h) {
                        m4542u2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = K - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View J2 = mo4900J(i5);
                if (this.f3508u.mo5390g(J2) < h || this.f3508u.mo5400q(J2) < h) {
                    m4542u2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: w2 */
    private void m4544w2(RecyclerView.C0820v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int K = mo4901K();
            if (this.f3511x) {
                int i4 = K - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View J = mo4900J(i5);
                    if (this.f3508u.mo5387d(J) > i3 || this.f3508u.mo5399p(J) > i3) {
                        m4542u2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < K; i6++) {
                View J2 = mo4900J(i6);
                if (this.f3508u.mo5387d(J2) > i3 || this.f3508u.mo5399p(J2) > i3) {
                    m4542u2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: y2 */
    private void m4545y2() {
        if (this.f3506s == 1 || !mo4499o2()) {
            this.f3511x = this.f3510w;
        } else {
            this.f3511x = !this.f3510w;
        }
    }

    /* renamed from: A2 */
    public void mo4470A2(int i, int i2) {
        this.f3498A = i;
        this.f3499B = i2;
        SavedState savedState = this.f3501D;
        if (savedState != null) {
            savedState.mo4510b();
        }
        mo4964u1();
    }

    /* renamed from: B2 */
    public void mo4471B2(int i) {
        if (i == 0 || i == 1) {
            mo4494h((String) null);
            if (i != this.f3506s || this.f3508u == null) {
                C0908u b = C0908u.m5557b(this, i);
                this.f3508u = b;
                this.f3502E.f3517a = b;
                this.f3506s = i;
                mo4964u1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: C2 */
    public void mo4472C2(boolean z) {
        mo4494h((String) null);
        if (z != this.f3510w) {
            this.f3510w = z;
            mo4964u1();
        }
    }

    /* renamed from: D */
    public View mo4473D(int i) {
        int K = mo4901K();
        if (K == 0) {
            return null;
        }
        int i0 = i - mo4941i0(mo4900J(0));
        if (i0 >= 0 && i0 < K) {
            View J = mo4900J(i0);
            if (mo4941i0(J) == i) {
                return J;
            }
        }
        return super.mo4473D(i);
    }

    /* renamed from: D2 */
    public void mo4426D2(boolean z) {
        mo4494h((String) null);
        if (this.f3512y != z) {
            this.f3512y = z;
            mo4964u1();
        }
    }

    /* renamed from: E */
    public RecyclerView.LayoutParams mo4427E() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public boolean mo4474H1() {
        return (mo4920Y() == 1073741824 || mo4957q0() == 1073741824 || !mo4959r0()) ? false : true;
    }

    /* renamed from: J0 */
    public void mo4475J0(RecyclerView recyclerView, RecyclerView.C0820v vVar) {
        super.mo4475J0(recyclerView, vVar);
        if (this.f3500C) {
            mo4948l1(vVar);
            vVar.mo5010c();
        }
    }

    /* renamed from: J1 */
    public void mo4476J1(RecyclerView recyclerView, RecyclerView.C0826z zVar, int i) {
        C0901p pVar = new C0901p(recyclerView.getContext());
        pVar.mo5049p(i);
        mo4902K1(pVar);
    }

    /* renamed from: K0 */
    public View mo4430K0(View view, int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        int S1;
        View view2;
        View view3;
        m4545y2();
        if (mo4901K() == 0 || (S1 = mo4479S1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo4481U1();
        m4524H2(S1, (int) (((float) this.f3508u.mo5397n()) * 0.33333334f), false, zVar);
        C0785c cVar = this.f3507t;
        cVar.f3532g = Integer.MIN_VALUE;
        cVar.f3526a = false;
        mo4482V1(vVar, cVar, zVar, true);
        if (S1 == -1) {
            view2 = m4535g2();
        } else {
            view2 = m4534f2();
        }
        if (S1 == -1) {
            view3 = m4539l2();
        } else {
            view3 = m4538k2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: L0 */
    public void mo4477L0(AccessibilityEvent accessibilityEvent) {
        super.mo4477L0(accessibilityEvent);
        if (mo4901K() > 0) {
            accessibilityEvent.setFromIndex(mo4485Z1());
            accessibilityEvent.setToIndex(mo4489c2());
        }
    }

    /* renamed from: M1 */
    public boolean mo4431M1() {
        return this.f3501D == null && this.f3509v == this.f3512y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N1 */
    public void mo4478N1(RecyclerView.C0826z zVar, int[] iArr) {
        int i;
        int m2 = mo4497m2(zVar);
        if (this.f3507t.f3531f == -1) {
            i = 0;
        } else {
            i = m2;
            m2 = 0;
        }
        iArr[0] = m2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void mo4433O1(RecyclerView.C0826z zVar, C0785c cVar, RecyclerView.C0809p.C0812c cVar2) {
        int i = cVar.f3529d;
        if (i >= 0 && i < zVar.mo5057b()) {
            cVar2.mo4977a(i, Math.max(0, cVar.f3532g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public int mo4479S1(int i) {
        if (i == 1) {
            return (this.f3506s != 1 && mo4499o2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3506s != 1 && mo4499o2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.f3506s == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f3506s == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f3506s == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f3506s == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public C0785c mo4480T1() {
        return new C0785c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public void mo4481U1() {
        if (this.f3507t == null) {
            this.f3507t = mo4480T1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public int mo4482V1(RecyclerView.C0820v vVar, C0785c cVar, RecyclerView.C0826z zVar, boolean z) {
        int i = cVar.f3528c;
        int i2 = cVar.f3532g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3532g = i2 + i;
            }
            m4541t2(vVar, cVar);
        }
        int i3 = cVar.f3528c + cVar.f3533h;
        C0784b bVar = this.f3503F;
        while (true) {
            if ((!cVar.f3538m && i3 <= 0) || !cVar.mo4526c(zVar)) {
                break;
            }
            bVar.mo4523a();
            mo4449q2(vVar, zVar, cVar, bVar);
            if (!bVar.f3523b) {
                cVar.f3527b += bVar.f3522a * cVar.f3531f;
                if (!bVar.f3524c || cVar.f3537l != null || !zVar.mo5060e()) {
                    int i4 = cVar.f3528c;
                    int i5 = bVar.f3522a;
                    cVar.f3528c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3532g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3522a;
                    cVar.f3532g = i7;
                    int i8 = cVar.f3528c;
                    if (i8 < 0) {
                        cVar.f3532g = i7 + i8;
                    }
                    m4541t2(vVar, cVar);
                }
                if (z && bVar.f3525d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3528c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public View mo4483X1(boolean z, boolean z2) {
        if (this.f3511x) {
            return mo4493e2(0, mo4901K(), z, z2);
        }
        return mo4493e2(mo4901K() - 1, -1, z, z2);
    }

    /* renamed from: Y0 */
    public void mo4442Y0(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View D;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3501D == null && this.f3498A == -1) && zVar.mo5057b() == 0) {
            mo4948l1(vVar);
            return;
        }
        SavedState savedState = this.f3501D;
        if (savedState != null && savedState.mo4509a()) {
            this.f3498A = this.f3501D.f3514g;
        }
        mo4481U1();
        this.f3507t.f3526a = false;
        m4545y2();
        View W = mo4917W();
        C0783a aVar = this.f3502E;
        if (!aVar.f3521e || this.f3498A != -1 || this.f3501D != null) {
            aVar.mo4521e();
            C0783a aVar2 = this.f3502E;
            aVar2.f3520d = this.f3511x ^ this.f3512y;
            m4523G2(vVar, zVar, aVar2);
            this.f3502E.f3521e = true;
        } else if (W != null && (this.f3508u.mo5390g(W) >= this.f3508u.mo5392i() || this.f3508u.mo5387d(W) <= this.f3508u.mo5396m())) {
            this.f3502E.mo4519c(W, mo4941i0(W));
        }
        C0785c cVar = this.f3507t;
        cVar.f3531f = cVar.f3536k >= 0 ? 1 : -1;
        int[] iArr = this.f3505H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4478N1(zVar, iArr);
        int max = Math.max(0, this.f3505H[0]) + this.f3508u.mo5396m();
        int max2 = Math.max(0, this.f3505H[1]) + this.f3508u.mo5393j();
        if (!(!zVar.mo5060e() || (i6 = this.f3498A) == -1 || this.f3499B == Integer.MIN_VALUE || (D = mo4473D(i6)) == null)) {
            if (this.f3511x) {
                i7 = this.f3508u.mo5392i() - this.f3508u.mo5387d(D);
                i8 = this.f3499B;
            } else {
                i8 = this.f3508u.mo5390g(D) - this.f3508u.mo5396m();
                i7 = this.f3499B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C0783a aVar3 = this.f3502E;
        if (!aVar3.f3520d ? !this.f3511x : this.f3511x) {
            i9 = 1;
        }
        mo4451s2(vVar, zVar, aVar3, i9);
        mo4968x(vVar);
        this.f3507t.f3538m = mo4506x2();
        this.f3507t.f3535j = zVar.mo5060e();
        this.f3507t.f3534i = 0;
        C0783a aVar4 = this.f3502E;
        if (aVar4.f3520d) {
            m4528L2(aVar4);
            C0785c cVar2 = this.f3507t;
            cVar2.f3533h = max;
            mo4482V1(vVar, cVar2, zVar, false);
            C0785c cVar3 = this.f3507t;
            i2 = cVar3.f3527b;
            int i11 = cVar3.f3529d;
            int i12 = cVar3.f3528c;
            if (i12 > 0) {
                max2 += i12;
            }
            m4526J2(this.f3502E);
            C0785c cVar4 = this.f3507t;
            cVar4.f3533h = max2;
            cVar4.f3529d += cVar4.f3530e;
            mo4482V1(vVar, cVar4, zVar, false);
            C0785c cVar5 = this.f3507t;
            i = cVar5.f3527b;
            int i13 = cVar5.f3528c;
            if (i13 > 0) {
                m4527K2(i11, i2);
                C0785c cVar6 = this.f3507t;
                cVar6.f3533h = i13;
                mo4482V1(vVar, cVar6, zVar, false);
                i2 = this.f3507t.f3527b;
            }
        } else {
            m4526J2(aVar4);
            C0785c cVar7 = this.f3507t;
            cVar7.f3533h = max2;
            mo4482V1(vVar, cVar7, zVar, false);
            C0785c cVar8 = this.f3507t;
            i = cVar8.f3527b;
            int i14 = cVar8.f3529d;
            int i15 = cVar8.f3528c;
            if (i15 > 0) {
                max += i15;
            }
            m4528L2(this.f3502E);
            C0785c cVar9 = this.f3507t;
            cVar9.f3533h = max;
            cVar9.f3529d += cVar9.f3530e;
            mo4482V1(vVar, cVar9, zVar, false);
            C0785c cVar10 = this.f3507t;
            i2 = cVar10.f3527b;
            int i16 = cVar10.f3528c;
            if (i16 > 0) {
                m4525I2(i14, i);
                C0785c cVar11 = this.f3507t;
                cVar11.f3533h = i16;
                mo4482V1(vVar, cVar11, zVar, false);
                i = this.f3507t.f3527b;
            }
        }
        if (mo4901K() > 0) {
            if (this.f3511x ^ this.f3512y) {
                int i22 = m4536i2(i, vVar, zVar, true);
                i4 = i2 + i22;
                i3 = i + i22;
                i5 = m4537j2(i4, vVar, zVar, false);
            } else {
                int j2 = m4537j2(i2, vVar, zVar, true);
                i4 = i2 + j2;
                i3 = i + j2;
                i5 = m4536i2(i3, vVar, zVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m4540r2(vVar, zVar, i2, i);
        if (!zVar.mo5060e()) {
            this.f3508u.mo5402s();
        } else {
            this.f3502E.mo4521e();
        }
        this.f3509v = this.f3512y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public View mo4484Y1(boolean z, boolean z2) {
        if (this.f3511x) {
            return mo4493e2(mo4901K() - 1, -1, z, z2);
        }
        return mo4493e2(0, mo4901K(), z, z2);
    }

    /* renamed from: Z0 */
    public void mo4443Z0(RecyclerView.C0826z zVar) {
        super.mo4443Z0(zVar);
        this.f3501D = null;
        this.f3498A = -1;
        this.f3499B = Integer.MIN_VALUE;
        this.f3502E.mo4521e();
    }

    /* renamed from: Z1 */
    public int mo4485Z1() {
        View e2 = mo4493e2(0, mo4901K(), false, true);
        if (e2 == null) {
            return -1;
        }
        return mo4941i0(e2);
    }

    /* renamed from: a */
    public PointF mo4486a(int i) {
        if (mo4901K() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4941i0(mo4900J(0))) {
            z = true;
        }
        if (z != this.f3511x) {
            i2 = -1;
        }
        if (this.f3506s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: a2 */
    public int mo4487a2() {
        View e2 = mo4493e2(mo4901K() - 1, -1, true, false);
        if (e2 == null) {
            return -1;
        }
        return mo4941i0(e2);
    }

    /* renamed from: b */
    public void mo4488b(View view, View view2, int i, int i2) {
        mo4494h("Cannot drop a view during a scroll or layout calculation");
        mo4481U1();
        m4545y2();
        int i0 = mo4941i0(view);
        int i02 = mo4941i0(view2);
        char c = i0 < i02 ? (char) 1 : 65535;
        if (this.f3511x) {
            if (c == 1) {
                mo4470A2(i02, this.f3508u.mo5392i() - (this.f3508u.mo5390g(view2) + this.f3508u.mo5388e(view)));
            } else {
                mo4470A2(i02, this.f3508u.mo5392i() - this.f3508u.mo5387d(view2));
            }
        } else if (c == 65535) {
            mo4470A2(i02, this.f3508u.mo5390g(view2));
        } else {
            mo4470A2(i02, this.f3508u.mo5387d(view2) - this.f3508u.mo5388e(view));
        }
    }

    /* renamed from: c2 */
    public int mo4489c2() {
        View e2 = mo4493e2(mo4901K() - 1, -1, false, true);
        if (e2 == null) {
            return -1;
        }
        return mo4941i0(e2);
    }

    /* renamed from: d1 */
    public void mo4490d1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f3501D = savedState;
            if (this.f3498A != -1) {
                savedState.mo4510b();
            }
            mo4964u1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public View mo4491d2(int i, int i2) {
        int i3;
        int i4;
        mo4481U1();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4900J(i);
        }
        if (this.f3508u.mo5390g(mo4900J(i)) < this.f3508u.mo5396m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f3506s == 0) {
            return this.f3657e.mo5166a(i, i2, i4, i3);
        }
        return this.f3658f.mo5166a(i, i2, i4, i3);
    }

    /* renamed from: e1 */
    public Parcelable mo4492e1() {
        if (this.f3501D != null) {
            return new SavedState(this.f3501D);
        }
        SavedState savedState = new SavedState();
        if (mo4901K() > 0) {
            mo4481U1();
            boolean z = this.f3509v ^ this.f3511x;
            savedState.f3516i = z;
            if (z) {
                View k2 = m4538k2();
                savedState.f3515h = this.f3508u.mo5392i() - this.f3508u.mo5387d(k2);
                savedState.f3514g = mo4941i0(k2);
            } else {
                View l2 = m4539l2();
                savedState.f3514g = mo4941i0(l2);
                savedState.f3515h = this.f3508u.mo5390g(l2) - this.f3508u.mo5396m();
            }
        } else {
            savedState.mo4510b();
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo4493e2(int i, int i2, boolean z, boolean z2) {
        mo4481U1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f3506s == 0) {
            return this.f3657e.mo5166a(i, i2, i4, i3);
        }
        return this.f3658f.mo5166a(i, i2, i4, i3);
    }

    /* renamed from: h */
    public void mo4494h(String str) {
        if (this.f3501D == null) {
            super.mo4494h(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo4446h2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, boolean z, boolean z2) {
        int i;
        int i2;
        mo4481U1();
        int K = mo4901K();
        int i3 = -1;
        if (z2) {
            i2 = mo4901K() - 1;
            i = -1;
        } else {
            i3 = K;
            i2 = 0;
            i = 1;
        }
        int b = zVar.mo5057b();
        int m = this.f3508u.mo5396m();
        int i4 = this.f3508u.mo5392i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View J = mo4900J(i2);
            int i0 = mo4941i0(J);
            int g = this.f3508u.mo5390g(J);
            int d = this.f3508u.mo5387d(J);
            if (i0 >= 0 && i0 < b) {
                if (!((RecyclerView.LayoutParams) J.getLayoutParams()).mo4708c()) {
                    boolean z3 = d <= m && g < m;
                    boolean z4 = g >= i4 && d > i4;
                    if (!z3 && !z4) {
                        return J;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = J;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = J;
                    }
                    view2 = J;
                } else if (view3 == null) {
                    view3 = J;
                }
            }
            i2 += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* renamed from: l */
    public boolean mo4495l() {
        return this.f3506s == 0;
    }

    /* renamed from: m */
    public boolean mo4496m() {
        return this.f3506s == 1;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: m2 */
    public int mo4497m2(RecyclerView.C0826z zVar) {
        if (zVar.mo5059d()) {
            return this.f3508u.mo5397n();
        }
        return 0;
    }

    /* renamed from: n2 */
    public int mo4498n2() {
        return this.f3506s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public boolean mo4499o2() {
        return mo4922a0() == 1;
    }

    /* renamed from: p */
    public void mo4500p(int i, int i2, RecyclerView.C0826z zVar, RecyclerView.C0809p.C0812c cVar) {
        if (this.f3506s != 0) {
            i = i2;
        }
        if (mo4901K() != 0 && i != 0) {
            mo4481U1();
            m4524H2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
            mo4433O1(zVar, this.f3507t, cVar);
        }
    }

    /* renamed from: p2 */
    public boolean mo4501p2() {
        return this.f3513z;
    }

    /* renamed from: q */
    public void mo4502q(int i, RecyclerView.C0809p.C0812c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f3501D;
        int i3 = -1;
        if (savedState == null || !savedState.mo4509a()) {
            m4545y2();
            z = this.f3511x;
            i2 = this.f3498A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f3501D;
            z = savedState2.f3516i;
            i2 = savedState2.f3514g;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3504G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo4977a(i2, 0);
            i2 += i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo4449q2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, C0785c cVar, C0784b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo4527d(vVar);
        if (d == null) {
            bVar.f3523b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) d.getLayoutParams();
        if (cVar.f3537l == null) {
            if (this.f3511x == (cVar.f3531f == -1)) {
                mo4931e(d);
            } else {
                mo4933f(d, 0);
            }
        } else {
            if (this.f3511x == (cVar.f3531f == -1)) {
                mo4926c(d);
            } else {
                mo4929d(d, 0);
            }
        }
        mo4883B0(d, 0, 0);
        bVar.f3522a = this.f3508u.mo5388e(d);
        if (this.f3506s == 1) {
            if (mo4499o2()) {
                i5 = mo4955p0() - mo4936g0();
                i4 = i5 - this.f3508u.mo5389f(d);
            } else {
                i4 = mo4934f0();
                i5 = this.f3508u.mo5389f(d) + i4;
            }
            if (cVar.f3531f == -1) {
                int i6 = cVar.f3527b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f3522a;
            } else {
                int i7 = cVar.f3527b;
                i3 = i7;
                i2 = i5;
                i = bVar.f3522a + i7;
            }
        } else {
            int h0 = mo4938h0();
            int f = this.f3508u.mo5389f(d) + h0;
            if (cVar.f3531f == -1) {
                int i8 = cVar.f3527b;
                i2 = i8;
                i3 = h0;
                i = f;
                i4 = i8 - bVar.f3522a;
            } else {
                int i9 = cVar.f3527b;
                i3 = h0;
                i2 = bVar.f3522a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo4880A0(d, i4, i3, i2, i);
        if (layoutParams.mo4708c() || layoutParams.mo4707b()) {
            bVar.f3524c = true;
        }
        bVar.f3525d = d.hasFocusable();
    }

    /* renamed from: r */
    public int mo4503r(RecyclerView.C0826z zVar) {
        return m4529P1(zVar);
    }

    /* renamed from: s */
    public int mo4450s(RecyclerView.C0826z zVar) {
        return m4530Q1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo4451s2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, C0783a aVar, int i) {
    }

    /* renamed from: t */
    public int mo4452t(RecyclerView.C0826z zVar) {
        return m4531R1(zVar);
    }

    /* renamed from: t0 */
    public boolean mo4504t0() {
        return true;
    }

    /* renamed from: u */
    public int mo4505u(RecyclerView.C0826z zVar) {
        return m4529P1(zVar);
    }

    /* renamed from: v */
    public int mo4453v(RecyclerView.C0826z zVar) {
        return m4530Q1(zVar);
    }

    /* renamed from: w */
    public int mo4454w(RecyclerView.C0826z zVar) {
        return m4531R1(zVar);
    }

    /* renamed from: x1 */
    public int mo4455x1(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (this.f3506s == 1) {
            return 0;
        }
        return mo4508z2(i, vVar, zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x2 */
    public boolean mo4506x2() {
        return this.f3508u.mo5394k() == 0 && this.f3508u.mo5391h() == 0;
    }

    /* renamed from: y1 */
    public void mo4507y1(int i) {
        this.f3498A = i;
        this.f3499B = Integer.MIN_VALUE;
        SavedState savedState = this.f3501D;
        if (savedState != null) {
            savedState.mo4510b();
        }
        mo4964u1();
    }

    /* renamed from: z1 */
    public int mo4456z1(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (this.f3506s == 0) {
            return 0;
        }
        return mo4508z2(i, vVar, zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public int mo4508z2(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (mo4901K() == 0 || i == 0) {
            return 0;
        }
        mo4481U1();
        this.f3507t.f3526a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4524H2(i2, abs, true, zVar);
        C0785c cVar = this.f3507t;
        int V1 = cVar.f3532g + mo4482V1(vVar, cVar, zVar, false);
        if (V1 < 0) {
            return 0;
        }
        if (abs > V1) {
            i = i2 * V1;
        }
        this.f3508u.mo5401r(-i);
        this.f3507t.f3536k = i;
        return i;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3506s = 1;
        this.f3510w = false;
        this.f3511x = false;
        this.f3512y = false;
        this.f3513z = true;
        this.f3498A = -1;
        this.f3499B = Integer.MIN_VALUE;
        this.f3501D = null;
        this.f3502E = new C0783a();
        this.f3503F = new C0784b();
        this.f3504G = 2;
        this.f3505H = new int[2];
        mo4471B2(i);
        mo4472C2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3506s = 1;
        this.f3510w = false;
        this.f3511x = false;
        this.f3512y = false;
        this.f3513z = true;
        this.f3498A = -1;
        this.f3499B = Integer.MIN_VALUE;
        this.f3501D = null;
        this.f3502E = new C0783a();
        this.f3503F = new C0784b();
        this.f3504G = 2;
        this.f3505H = new int[2];
        RecyclerView.C0809p.C0813d j0 = RecyclerView.C0809p.m4847j0(context, attributeSet, i, i2);
        mo4471B2(j0.f3673a);
        mo4472C2(j0.f3675c);
        mo4426D2(j0.f3676d);
    }
}
