package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C0809p implements RecyclerView.C0823y.C0825b {

    /* renamed from: A */
    boolean f3725A = false;

    /* renamed from: B */
    private BitSet f3726B;

    /* renamed from: C */
    int f3727C = -1;

    /* renamed from: D */
    int f3728D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f3729E = new LazySpanLookup();

    /* renamed from: F */
    private int f3730F = 2;

    /* renamed from: G */
    private boolean f3731G;

    /* renamed from: H */
    private boolean f3732H;

    /* renamed from: I */
    private SavedState f3733I;

    /* renamed from: J */
    private int f3734J;

    /* renamed from: K */
    private final Rect f3735K = new Rect();

    /* renamed from: L */
    private final C0830b f3736L = new C0830b();

    /* renamed from: M */
    private boolean f3737M = false;

    /* renamed from: N */
    private boolean f3738N = true;

    /* renamed from: O */
    private int[] f3739O;

    /* renamed from: P */
    private final Runnable f3740P = new C0829a();

    /* renamed from: s */
    private int f3741s = -1;

    /* renamed from: t */
    C0831c[] f3742t;

    /* renamed from: u */
    C0908u f3743u;

    /* renamed from: v */
    C0908u f3744v;

    /* renamed from: w */
    private int f3745w;

    /* renamed from: x */
    private int f3746x;

    /* renamed from: y */
    private final C0900o f3747y;

    /* renamed from: z */
    boolean f3748z = false;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        C0831c f3749e;

        /* renamed from: f */
        boolean f3750f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean mo5085e() {
            return this.f3750f;
        }

        /* renamed from: f */
        public void mo5086f(boolean z) {
            this.f3750f = z;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0828a();

        /* renamed from: g */
        int f3757g;

        /* renamed from: h */
        int f3758h;

        /* renamed from: i */
        int f3759i;

        /* renamed from: j */
        int[] f3760j;

        /* renamed from: k */
        int f3761k;

        /* renamed from: l */
        int[] f3762l;

        /* renamed from: m */
        List<LazySpanLookup.FullSpanItem> f3763m;

        /* renamed from: n */
        boolean f3764n;

        /* renamed from: o */
        boolean f3765o;

        /* renamed from: p */
        boolean f3766p;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        class C0828a implements Parcelable.Creator<SavedState> {
            C0828a() {
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
        public void mo5107a() {
            this.f3760j = null;
            this.f3759i = 0;
            this.f3757g = -1;
            this.f3758h = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5108b() {
            this.f3760j = null;
            this.f3759i = 0;
            this.f3761k = 0;
            this.f3762l = null;
            this.f3763m = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3757g);
            parcel.writeInt(this.f3758h);
            parcel.writeInt(this.f3759i);
            if (this.f3759i > 0) {
                parcel.writeIntArray(this.f3760j);
            }
            parcel.writeInt(this.f3761k);
            if (this.f3761k > 0) {
                parcel.writeIntArray(this.f3762l);
            }
            parcel.writeInt(this.f3764n ? 1 : 0);
            parcel.writeInt(this.f3765o ? 1 : 0);
            parcel.writeInt(this.f3766p ? 1 : 0);
            parcel.writeList(this.f3763m);
        }

        SavedState(Parcel parcel) {
            this.f3757g = parcel.readInt();
            this.f3758h = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3759i = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3760j = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3761k = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3762l = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3764n = parcel.readInt() == 1;
            this.f3765o = parcel.readInt() == 1;
            this.f3766p = parcel.readInt() == 1 ? true : z;
            this.f3763m = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3759i = savedState.f3759i;
            this.f3757g = savedState.f3757g;
            this.f3758h = savedState.f3758h;
            this.f3760j = savedState.f3760j;
            this.f3761k = savedState.f3761k;
            this.f3762l = savedState.f3762l;
            this.f3764n = savedState.f3764n;
            this.f3765o = savedState.f3765o;
            this.f3766p = savedState.f3766p;
            this.f3763m = savedState.f3763m;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0829a implements Runnable {
        C0829a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5074T1();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0830b {

        /* renamed from: a */
        int f3768a;

        /* renamed from: b */
        int f3769b;

        /* renamed from: c */
        boolean f3770c;

        /* renamed from: d */
        boolean f3771d;

        /* renamed from: e */
        boolean f3772e;

        /* renamed from: f */
        int[] f3773f;

        C0830b() {
            mo5118c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5116a() {
            int i;
            if (this.f3770c) {
                i = StaggeredGridLayoutManager.this.f3743u.mo5392i();
            } else {
                i = StaggeredGridLayoutManager.this.f3743u.mo5396m();
            }
            this.f3769b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5117b(int i) {
            if (this.f3770c) {
                this.f3769b = StaggeredGridLayoutManager.this.f3743u.mo5392i() - i;
            } else {
                this.f3769b = StaggeredGridLayoutManager.this.f3743u.mo5396m() + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5118c() {
            this.f3768a = -1;
            this.f3769b = Integer.MIN_VALUE;
            this.f3770c = false;
            this.f3771d = false;
            this.f3772e = false;
            int[] iArr = this.f3773f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5119d(C0831c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f3773f;
            if (iArr == null || iArr.length < length) {
                this.f3773f = new int[StaggeredGridLayoutManager.this.f3742t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3773f[i] = cVarArr[i].mo5137r(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    class C0831c {

        /* renamed from: a */
        ArrayList<View> f3775a = new ArrayList<>();

        /* renamed from: b */
        int f3776b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3777c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3778d = 0;

        /* renamed from: e */
        final int f3779e;

        C0831c(int i) {
            this.f3779e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5120a(View view) {
            LayoutParams p = mo5135p(view);
            p.f3749e = this;
            this.f3775a.add(view);
            this.f3777c = Integer.MIN_VALUE;
            if (this.f3775a.size() == 1) {
                this.f3776b = Integer.MIN_VALUE;
            }
            if (p.mo4708c() || p.mo4707b()) {
                this.f3778d += StaggeredGridLayoutManager.this.f3743u.mo5388e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5121b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo5133n(Integer.MIN_VALUE);
            } else {
                i2 = mo5137r(Integer.MIN_VALUE);
            }
            mo5124e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f3743u.mo5392i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f3743u.mo5396m()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f3777c = i2;
                    this.f3776b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5122c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.f3775a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams p = mo5135p(view);
            this.f3777c = StaggeredGridLayoutManager.this.f3743u.mo5387d(view);
            if (p.f3750f && (f = StaggeredGridLayoutManager.this.f3729E.mo5092f(p.mo4706a())) != null && f.f3754h == 1) {
                this.f3777c += f.mo5099a(this.f3779e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5123d() {
            LazySpanLookup.FullSpanItem f;
            View view = this.f3775a.get(0);
            LayoutParams p = mo5135p(view);
            this.f3776b = StaggeredGridLayoutManager.this.f3743u.mo5390g(view);
            if (p.f3750f && (f = StaggeredGridLayoutManager.this.f3729E.mo5092f(p.mo4706a())) != null && f.f3754h == -1) {
                this.f3776b -= f.mo5099a(this.f3779e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5124e() {
            this.f3775a.clear();
            mo5138s();
            this.f3778d = 0;
        }

        /* renamed from: f */
        public int mo5125f() {
            if (StaggeredGridLayoutManager.this.f3748z) {
                return mo5129j(this.f3775a.size() - 1, -1, true);
            }
            return mo5129j(0, this.f3775a.size(), true);
        }

        /* renamed from: g */
        public int mo5126g() {
            if (StaggeredGridLayoutManager.this.f3748z) {
                return mo5130k(0, this.f3775a.size(), true);
            }
            return mo5130k(this.f3775a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int mo5127h() {
            if (StaggeredGridLayoutManager.this.f3748z) {
                return mo5129j(0, this.f3775a.size(), true);
            }
            return mo5129j(this.f3775a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo5128i(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f3743u.mo5396m();
            int i3 = StaggeredGridLayoutManager.this.f3743u.mo5392i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3775a.get(i);
                int g = StaggeredGridLayoutManager.this.f3743u.mo5390g(view);
                int d = StaggeredGridLayoutManager.this.f3743u.mo5387d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo4941i0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.mo4941i0(view);
                        }
                    } else if (g >= m && d <= i3) {
                        return StaggeredGridLayoutManager.this.mo4941i0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo5129j(int i, int i2, boolean z) {
            return mo5128i(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo5130k(int i, int i2, boolean z) {
            return mo5128i(i, i2, z, true, false);
        }

        /* renamed from: l */
        public int mo5131l() {
            return this.f3778d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo5132m() {
            int i = this.f3777c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5122c();
            return this.f3777c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo5133n(int i) {
            int i2 = this.f3777c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3775a.size() == 0) {
                return i;
            }
            mo5122c();
            return this.f3777c;
        }

        /* renamed from: o */
        public View mo5134o(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3775a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3775a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3748z && staggeredGridLayoutManager.mo4941i0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3748z && staggeredGridLayoutManager2.mo4941i0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3775a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3775a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3748z && staggeredGridLayoutManager3.mo4941i0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3748z && staggeredGridLayoutManager4.mo4941i0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public LayoutParams mo5135p(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public int mo5136q() {
            int i = this.f3776b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5123d();
            return this.f3776b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo5137r(int i) {
            int i2 = this.f3776b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3775a.size() == 0) {
                return i;
            }
            mo5123d();
            return this.f3776b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5138s() {
            this.f3776b = Integer.MIN_VALUE;
            this.f3777c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5139t(int i) {
            int i2 = this.f3776b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3776b = i2 + i;
            }
            int i3 = this.f3777c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3777c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5140u() {
            int size = this.f3775a.size();
            View remove = this.f3775a.remove(size - 1);
            LayoutParams p = mo5135p(remove);
            p.f3749e = null;
            if (p.mo4708c() || p.mo4707b()) {
                this.f3778d -= StaggeredGridLayoutManager.this.f3743u.mo5388e(remove);
            }
            if (size == 1) {
                this.f3776b = Integer.MIN_VALUE;
            }
            this.f3777c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5141v() {
            View remove = this.f3775a.remove(0);
            LayoutParams p = mo5135p(remove);
            p.f3749e = null;
            if (this.f3775a.size() == 0) {
                this.f3777c = Integer.MIN_VALUE;
            }
            if (p.mo4708c() || p.mo4707b()) {
                this.f3778d -= StaggeredGridLayoutManager.this.f3743u.mo5388e(remove);
            }
            this.f3776b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5142w(View view) {
            LayoutParams p = mo5135p(view);
            p.f3749e = this;
            this.f3775a.add(0, view);
            this.f3776b = Integer.MIN_VALUE;
            if (this.f3775a.size() == 1) {
                this.f3777c = Integer.MIN_VALUE;
            }
            if (p.mo4708c() || p.mo4707b()) {
                this.f3778d += StaggeredGridLayoutManager.this.f3743u.mo5388e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5143x(int i) {
            this.f3776b = i;
            this.f3777c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C0809p.C0813d j0 = RecyclerView.C0809p.m4847j0(context, attributeSet, i, i2);
        mo5066K2(j0.f3673a);
        mo5068M2(j0.f3674b);
        mo5067L2(j0.f3675c);
        this.f3747y = new C0900o();
        m5113b2();
    }

    /* renamed from: A2 */
    private boolean m5089A2(int i) {
        if (this.f3745w == 0) {
            if ((i == -1) != this.f3725A) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.f3725A) == mo5084w2()) {
            return true;
        }
        return false;
    }

    /* renamed from: C2 */
    private void m5090C2(View view) {
        for (int i = this.f3741s - 1; i >= 0; i--) {
            this.f3742t[i].mo5142w(view);
        }
    }

    /* renamed from: D2 */
    private void m5091D2(RecyclerView.C0820v vVar, C0900o oVar) {
        int i;
        int i2;
        if (oVar.f4029a && !oVar.f4037i) {
            if (oVar.f4030b == 0) {
                if (oVar.f4033e == -1) {
                    m5092E2(vVar, oVar.f4035g);
                } else {
                    m5093F2(vVar, oVar.f4034f);
                }
            } else if (oVar.f4033e == -1) {
                int i3 = oVar.f4034f;
                int o2 = i3 - m5120o2(i3);
                if (o2 < 0) {
                    i2 = oVar.f4035g;
                } else {
                    i2 = oVar.f4035g - Math.min(o2, oVar.f4030b);
                }
                m5092E2(vVar, i2);
            } else {
                int p2 = m5121p2(oVar.f4035g) - oVar.f4035g;
                if (p2 < 0) {
                    i = oVar.f4034f;
                } else {
                    i = Math.min(p2, oVar.f4030b) + oVar.f4034f;
                }
                m5093F2(vVar, i);
            }
        }
    }

    /* renamed from: E2 */
    private void m5092E2(RecyclerView.C0820v vVar, int i) {
        int K = mo4901K() - 1;
        while (K >= 0) {
            View J = mo4900J(K);
            if (this.f3743u.mo5390g(J) >= i && this.f3743u.mo5400q(J) >= i) {
                LayoutParams layoutParams = (LayoutParams) J.getLayoutParams();
                if (layoutParams.f3750f) {
                    int i2 = 0;
                    while (i2 < this.f3741s) {
                        if (this.f3742t[i2].f3775a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3741s; i3++) {
                        this.f3742t[i3].mo5140u();
                    }
                } else if (layoutParams.f3749e.f3775a.size() != 1) {
                    layoutParams.f3749e.mo5140u();
                } else {
                    return;
                }
                mo4952n1(J, vVar);
                K--;
            } else {
                return;
            }
        }
    }

    /* renamed from: F2 */
    private void m5093F2(RecyclerView.C0820v vVar, int i) {
        while (mo4901K() > 0) {
            View J = mo4900J(0);
            if (this.f3743u.mo5387d(J) <= i && this.f3743u.mo5399p(J) <= i) {
                LayoutParams layoutParams = (LayoutParams) J.getLayoutParams();
                if (layoutParams.f3750f) {
                    int i2 = 0;
                    while (i2 < this.f3741s) {
                        if (this.f3742t[i2].f3775a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3741s; i3++) {
                        this.f3742t[i3].mo5141v();
                    }
                } else if (layoutParams.f3749e.f3775a.size() != 1) {
                    layoutParams.f3749e.mo5141v();
                } else {
                    return;
                }
                mo4952n1(J, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: G2 */
    private void m5094G2() {
        if (this.f3744v.mo5394k() != 1073741824) {
            float f = 0.0f;
            int K = mo4901K();
            for (int i = 0; i < K; i++) {
                View J = mo4900J(i);
                float e = (float) this.f3744v.mo5388e(J);
                if (e >= f) {
                    if (((LayoutParams) J.getLayoutParams()).mo5085e()) {
                        e = (e * 1.0f) / ((float) this.f3741s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f3746x;
            int round = Math.round(f * ((float) this.f3741s));
            if (this.f3744v.mo5394k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3744v.mo5397n());
            }
            mo5073S2(round);
            if (this.f3746x != i2) {
                for (int i3 = 0; i3 < K; i3++) {
                    View J2 = mo4900J(i3);
                    LayoutParams layoutParams = (LayoutParams) J2.getLayoutParams();
                    if (!layoutParams.f3750f) {
                        if (!mo5084w2() || this.f3745w != 1) {
                            int i4 = layoutParams.f3749e.f3779e;
                            int i5 = this.f3746x * i4;
                            int i6 = i4 * i2;
                            if (this.f3745w == 1) {
                                J2.offsetLeftAndRight(i5 - i6);
                            } else {
                                J2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f3741s;
                            int i8 = layoutParams.f3749e.f3779e;
                            J2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3746x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: H2 */
    private void m5095H2() {
        if (this.f3745w == 1 || !mo5084w2()) {
            this.f3725A = this.f3748z;
        } else {
            this.f3725A = !this.f3748z;
        }
    }

    /* renamed from: J2 */
    private void m5096J2(int i) {
        C0900o oVar = this.f3747y;
        oVar.f4033e = i;
        int i2 = 1;
        if (this.f3725A != (i == -1)) {
            i2 = -1;
        }
        oVar.f4032d = i2;
    }

    /* renamed from: N1 */
    private void m5097N1(View view) {
        for (int i = this.f3741s - 1; i >= 0; i--) {
            this.f3742t[i].mo5120a(view);
        }
    }

    /* renamed from: N2 */
    private void m5098N2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3741s; i3++) {
            if (!this.f3742t[i3].f3775a.isEmpty()) {
                m5104T2(this.f3742t[i3], i, i2);
            }
        }
    }

    /* renamed from: O1 */
    private void m5099O1(C0830b bVar) {
        int i;
        SavedState savedState = this.f3733I;
        int i2 = savedState.f3759i;
        if (i2 > 0) {
            if (i2 == this.f3741s) {
                for (int i3 = 0; i3 < this.f3741s; i3++) {
                    this.f3742t[i3].mo5124e();
                    SavedState savedState2 = this.f3733I;
                    int i4 = savedState2.f3760j[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f3765o) {
                            i = this.f3743u.mo5392i();
                        } else {
                            i = this.f3743u.mo5396m();
                        }
                        i4 += i;
                    }
                    this.f3742t[i3].mo5143x(i4);
                }
            } else {
                savedState.mo5108b();
                SavedState savedState3 = this.f3733I;
                savedState3.f3757g = savedState3.f3758h;
            }
        }
        SavedState savedState4 = this.f3733I;
        this.f3732H = savedState4.f3766p;
        mo5067L2(savedState4.f3764n);
        m5095H2();
        SavedState savedState5 = this.f3733I;
        int i5 = savedState5.f3757g;
        if (i5 != -1) {
            this.f3727C = i5;
            bVar.f3770c = savedState5.f3765o;
        } else {
            bVar.f3770c = this.f3725A;
        }
        if (savedState5.f3761k > 1) {
            LazySpanLookup lazySpanLookup = this.f3729E;
            lazySpanLookup.f3751a = savedState5.f3762l;
            lazySpanLookup.f3752b = savedState5.f3763m;
        }
    }

    /* renamed from: O2 */
    private boolean m5100O2(RecyclerView.C0826z zVar, C0830b bVar) {
        int i;
        if (this.f3731G) {
            i = m5116i2(zVar.mo5057b());
        } else {
            i = m5115d2(zVar.mo5057b());
        }
        bVar.f3768a = i;
        bVar.f3769b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: R1 */
    private void m5101R1(View view, LayoutParams layoutParams, C0900o oVar) {
        if (oVar.f4033e == 1) {
            if (layoutParams.f3750f) {
                m5097N1(view);
            } else {
                layoutParams.f3749e.mo5120a(view);
            }
        } else if (layoutParams.f3750f) {
            m5090C2(view);
        } else {
            layoutParams.f3749e.mo5142w(view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: R2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5102R2(int r5, androidx.recyclerview.widget.RecyclerView.C0826z r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.o r0 = r4.f3747y
            r1 = 0
            r0.f4030b = r1
            r0.f4031c = r5
            boolean r0 = r4.mo4970y0()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo5058c()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f3725A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.u r5 = r4.f3743u
            int r5 = r5.mo5397n()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.u r5 = r4.f3743u
            int r5 = r5.mo5397n()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo4905N()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.o r0 = r4.f3747y
            androidx.recyclerview.widget.u r3 = r4.f3743u
            int r3 = r3.mo5396m()
            int r3 = r3 - r6
            r0.f4034f = r3
            androidx.recyclerview.widget.o r6 = r4.f3747y
            androidx.recyclerview.widget.u r0 = r4.f3743u
            int r0 = r0.mo5392i()
            int r0 = r0 + r5
            r6.f4035g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.o r0 = r4.f3747y
            androidx.recyclerview.widget.u r3 = r4.f3743u
            int r3 = r3.mo5391h()
            int r3 = r3 + r5
            r0.f4035g = r3
            androidx.recyclerview.widget.o r5 = r4.f3747y
            int r6 = -r6
            r5.f4034f = r6
        L_0x005d:
            androidx.recyclerview.widget.o r5 = r4.f3747y
            r5.f4036h = r1
            r5.f4029a = r2
            androidx.recyclerview.widget.u r6 = r4.f3743u
            int r6 = r6.mo5394k()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.u r6 = r4.f3743u
            int r6 = r6.mo5391h()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f4037i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5102R2(int, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    /* renamed from: S1 */
    private int m5103S1(int i) {
        if (mo4901K() != 0) {
            if ((i < mo5079l2()) != this.f3725A) {
                return -1;
            }
            return 1;
        } else if (this.f3725A) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: T2 */
    private void m5104T2(C0831c cVar, int i, int i2) {
        int l = cVar.mo5131l();
        if (i == -1) {
            if (cVar.mo5136q() + l <= i2) {
                this.f3726B.set(cVar.f3779e, false);
            }
        } else if (cVar.mo5132m() - l >= i2) {
            this.f3726B.set(cVar.f3779e, false);
        }
    }

    /* renamed from: U1 */
    private boolean m5105U1(C0831c cVar) {
        if (this.f3725A) {
            if (cVar.mo5132m() < this.f3743u.mo5392i()) {
                ArrayList<View> arrayList = cVar.f3775a;
                return !cVar.mo5135p(arrayList.get(arrayList.size() - 1)).f3750f;
            }
        } else if (cVar.mo5136q() > this.f3743u.mo5396m()) {
            return !cVar.mo5135p(cVar.f3775a.get(0)).f3750f;
        }
        return false;
    }

    /* renamed from: U2 */
    private int m5106U2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: V1 */
    private int m5107V1(RecyclerView.C0826z zVar) {
        if (mo4901K() == 0) {
            return 0;
        }
        return C0915x.m5633a(zVar, this.f3743u, mo5076f2(!this.f3738N), mo5075e2(!this.f3738N), this, this.f3738N);
    }

    /* renamed from: W1 */
    private int m5108W1(RecyclerView.C0826z zVar) {
        if (mo4901K() == 0) {
            return 0;
        }
        return C0915x.m5634b(zVar, this.f3743u, mo5076f2(!this.f3738N), mo5075e2(!this.f3738N), this, this.f3738N, this.f3725A);
    }

    /* renamed from: X1 */
    private int m5109X1(RecyclerView.C0826z zVar) {
        if (mo4901K() == 0) {
            return 0;
        }
        return C0915x.m5635c(zVar, this.f3743u, mo5076f2(!this.f3738N), mo5075e2(!this.f3738N), this, this.f3738N);
    }

    /* renamed from: Y1 */
    private int m5110Y1(int i) {
        if (i == 1) {
            return (this.f3745w != 1 && mo5084w2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3745w != 1 && mo5084w2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.f3745w == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.f3745w == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.f3745w == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f3745w == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: Z1 */
    private LazySpanLookup.FullSpanItem m5111Z1(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3755i = new int[this.f3741s];
        for (int i2 = 0; i2 < this.f3741s; i2++) {
            fullSpanItem.f3755i[i2] = i - this.f3742t[i2].mo5133n(i);
        }
        return fullSpanItem;
    }

    /* renamed from: a2 */
    private LazySpanLookup.FullSpanItem m5112a2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f3755i = new int[this.f3741s];
        for (int i2 = 0; i2 < this.f3741s; i2++) {
            fullSpanItem.f3755i[i2] = this.f3742t[i2].mo5137r(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: b2 */
    private void m5113b2() {
        this.f3743u = C0908u.m5557b(this, this.f3745w);
        this.f3744v = C0908u.m5557b(this, 1 - this.f3745w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: c2 */
    private int m5114c2(RecyclerView.C0820v vVar, C0900o oVar, RecyclerView.C0826z zVar) {
        int i;
        int i2;
        int i3;
        C0831c cVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        RecyclerView.C0820v vVar2 = vVar;
        C0900o oVar2 = oVar;
        ? r9 = 0;
        this.f3726B.set(0, this.f3741s, true);
        if (this.f3747y.f4037i) {
            i = oVar2.f4033e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (oVar2.f4033e == 1) {
                i12 = oVar2.f4035g + oVar2.f4030b;
            } else {
                i12 = oVar2.f4034f - oVar2.f4030b;
            }
            i = i12;
        }
        m5098N2(oVar2.f4033e, i);
        if (this.f3725A) {
            i2 = this.f3743u.mo5392i();
        } else {
            i2 = this.f3743u.mo5396m();
        }
        int i13 = i2;
        boolean z2 = false;
        while (oVar.mo5365a(zVar) && (this.f3747y.f4037i || !this.f3726B.isEmpty())) {
            View b = oVar2.mo5366b(vVar2);
            LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
            int a = layoutParams.mo4706a();
            int g = this.f3729E.mo5093g(a);
            boolean z3 = g == -1;
            if (z3) {
                cVar = layoutParams.f3750f ? this.f3742t[r9] : m5123r2(oVar2);
                this.f3729E.mo5097n(a, cVar);
            } else {
                cVar = this.f3742t[g];
            }
            C0831c cVar2 = cVar;
            layoutParams.f3749e = cVar2;
            if (oVar2.f4033e == 1) {
                mo4931e(b);
            } else {
                mo4933f(b, r9);
            }
            m5126y2(b, layoutParams, r9);
            if (oVar2.f4033e == 1) {
                if (layoutParams.f3750f) {
                    i11 = m5119n2(i13);
                } else {
                    i11 = cVar2.mo5133n(i13);
                }
                int e = this.f3743u.mo5388e(b) + i11;
                if (z3 && layoutParams.f3750f) {
                    LazySpanLookup.FullSpanItem Z1 = m5111Z1(i11);
                    Z1.f3754h = -1;
                    Z1.f3753g = a;
                    this.f3729E.mo5087a(Z1);
                }
                i4 = e;
                i5 = i11;
            } else {
                if (layoutParams.f3750f) {
                    i10 = m5122q2(i13);
                } else {
                    i10 = cVar2.mo5137r(i13);
                }
                i5 = i10 - this.f3743u.mo5388e(b);
                if (z3 && layoutParams.f3750f) {
                    LazySpanLookup.FullSpanItem a2 = m5112a2(i10);
                    a2.f3754h = 1;
                    a2.f3753g = a;
                    this.f3729E.mo5087a(a2);
                }
                i4 = i10;
            }
            if (layoutParams.f3750f && oVar2.f4032d == -1) {
                if (z3) {
                    this.f3737M = true;
                } else {
                    if (oVar2.f4033e == 1) {
                        z = mo5069P1();
                    } else {
                        z = mo5071Q1();
                    }
                    if (!z) {
                        LazySpanLookup.FullSpanItem f = this.f3729E.mo5092f(a);
                        if (f != null) {
                            f.f3756j = true;
                        }
                        this.f3737M = true;
                    }
                }
            }
            m5101R1(b, layoutParams, oVar2);
            if (!mo5084w2() || this.f3745w != 1) {
                if (layoutParams.f3750f) {
                    i8 = this.f3744v.mo5396m();
                } else {
                    i8 = (cVar2.f3779e * this.f3746x) + this.f3744v.mo5396m();
                }
                i7 = i8;
                i6 = this.f3744v.mo5388e(b) + i8;
            } else {
                if (layoutParams.f3750f) {
                    i9 = this.f3744v.mo5392i();
                } else {
                    i9 = this.f3744v.mo5392i() - (((this.f3741s - 1) - cVar2.f3779e) * this.f3746x);
                }
                i6 = i9;
                i7 = i9 - this.f3744v.mo5388e(b);
            }
            if (this.f3745w == 1) {
                mo4880A0(b, i7, i5, i6, i4);
            } else {
                mo4880A0(b, i5, i7, i4, i6);
            }
            if (layoutParams.f3750f) {
                m5098N2(this.f3747y.f4033e, i);
            } else {
                m5104T2(cVar2, this.f3747y.f4033e, i);
            }
            m5091D2(vVar2, this.f3747y);
            if (this.f3747y.f4036h && b.hasFocusable()) {
                if (layoutParams.f3750f) {
                    this.f3726B.clear();
                } else {
                    this.f3726B.set(cVar2.f3779e, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            m5091D2(vVar2, this.f3747y);
        }
        if (this.f3747y.f4033e == -1) {
            i3 = this.f3743u.mo5396m() - m5122q2(this.f3743u.mo5396m());
        } else {
            i3 = m5119n2(this.f3743u.mo5392i()) - this.f3743u.mo5392i();
        }
        if (i3 > 0) {
            return Math.min(oVar2.f4030b, i3);
        }
        return 0;
    }

    /* renamed from: d2 */
    private int m5115d2(int i) {
        int K = mo4901K();
        for (int i2 = 0; i2 < K; i2++) {
            int i0 = mo4941i0(mo4900J(i2));
            if (i0 >= 0 && i0 < i) {
                return i0;
            }
        }
        return 0;
    }

    /* renamed from: i2 */
    private int m5116i2(int i) {
        for (int K = mo4901K() - 1; K >= 0; K--) {
            int i0 = mo4941i0(mo4900J(K));
            if (i0 >= 0 && i0 < i) {
                return i0;
            }
        }
        return 0;
    }

    /* renamed from: j2 */
    private void m5117j2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, boolean z) {
        int i;
        int n2 = m5119n2(Integer.MIN_VALUE);
        if (n2 != Integer.MIN_VALUE && (i = this.f3743u.mo5392i() - n2) > 0) {
            int i2 = i - (-mo5065I2(-i, vVar, zVar));
            if (z && i2 > 0) {
                this.f3743u.mo5401r(i2);
            }
        }
    }

    /* renamed from: k2 */
    private void m5118k2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, boolean z) {
        int m;
        int q2 = m5122q2(Integer.MAX_VALUE);
        if (q2 != Integer.MAX_VALUE && (m = q2 - this.f3743u.mo5396m()) > 0) {
            int I2 = m - mo5065I2(m, vVar, zVar);
            if (z && I2 > 0) {
                this.f3743u.mo5401r(-I2);
            }
        }
    }

    /* renamed from: n2 */
    private int m5119n2(int i) {
        int n = this.f3742t[0].mo5133n(i);
        for (int i2 = 1; i2 < this.f3741s; i2++) {
            int n2 = this.f3742t[i2].mo5133n(i);
            if (n2 > n) {
                n = n2;
            }
        }
        return n;
    }

    /* renamed from: o2 */
    private int m5120o2(int i) {
        int r = this.f3742t[0].mo5137r(i);
        for (int i2 = 1; i2 < this.f3741s; i2++) {
            int r2 = this.f3742t[i2].mo5137r(i);
            if (r2 > r) {
                r = r2;
            }
        }
        return r;
    }

    /* renamed from: p2 */
    private int m5121p2(int i) {
        int n = this.f3742t[0].mo5133n(i);
        for (int i2 = 1; i2 < this.f3741s; i2++) {
            int n2 = this.f3742t[i2].mo5133n(i);
            if (n2 < n) {
                n = n2;
            }
        }
        return n;
    }

    /* renamed from: q2 */
    private int m5122q2(int i) {
        int r = this.f3742t[0].mo5137r(i);
        for (int i2 = 1; i2 < this.f3741s; i2++) {
            int r2 = this.f3742t[i2].mo5137r(i);
            if (r2 < r) {
                r = r2;
            }
        }
        return r;
    }

    /* renamed from: r2 */
    private C0831c m5123r2(C0900o oVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m5089A2(oVar.f4033e)) {
            i2 = this.f3741s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3741s;
            i = 1;
        }
        C0831c cVar = null;
        if (oVar.f4033e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f3743u.mo5396m();
            while (i2 != i3) {
                C0831c cVar2 = this.f3742t[i2];
                int n = cVar2.mo5133n(m);
                if (n < i4) {
                    cVar = cVar2;
                    i4 = n;
                }
                i2 += i;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f3743u.mo5392i();
        while (i2 != i3) {
            C0831c cVar3 = this.f3742t[i2];
            int r = cVar3.mo5137r(i6);
            if (r > i5) {
                cVar = cVar3;
                i5 = r;
            }
            i2 += i;
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5124t2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3725A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5080m2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5079l2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f3729E
            r4.mo5094h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3729E
            r9.mo5096k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f3729E
            r7.mo5095j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3729E
            r9.mo5096k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3729E
            r9.mo5095j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f3725A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo5079l2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo5080m2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo4964u1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5124t2(int, int, int):void");
    }

    /* renamed from: x2 */
    private void m5125x2(View view, int i, int i2, boolean z) {
        boolean z2;
        mo4945k(view, this.f3735K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f3735K;
        int U2 = m5106U2(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f3735K;
        int U22 = m5106U2(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo4899I1(view, U2, U22, layoutParams);
        } else {
            z2 = mo4894G1(view, U2, U22, layoutParams);
        }
        if (z2) {
            view.measure(U2, U22);
        }
    }

    /* renamed from: y2 */
    private void m5126y2(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f3750f) {
            if (this.f3745w == 1) {
                m5125x2(view, this.f3734J, RecyclerView.C0809p.m4844L(mo4919X(), mo4920Y(), mo4938h0() + mo4932e0(), layoutParams.height, true), z);
            } else {
                m5125x2(view, RecyclerView.C0809p.m4844L(mo4955p0(), mo4957q0(), mo4934f0() + mo4936g0(), layoutParams.width, true), this.f3734J, z);
            }
        } else if (this.f3745w == 1) {
            m5125x2(view, RecyclerView.C0809p.m4844L(this.f3746x, mo4957q0(), 0, layoutParams.width, false), RecyclerView.C0809p.m4844L(mo4919X(), mo4920Y(), mo4938h0() + mo4932e0(), layoutParams.height, true), z);
        } else {
            m5125x2(view, RecyclerView.C0809p.m4844L(mo4955p0(), mo4957q0(), mo4934f0() + mo4936g0(), layoutParams.width, true), RecyclerView.C0809p.m4844L(this.f3746x, mo4920Y(), 0, layoutParams.height, false), z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo5074T1() != false) goto L_0x015b;
     */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5127z2(androidx.recyclerview.widget.RecyclerView.C0820v r9, androidx.recyclerview.widget.RecyclerView.C0826z r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f3736L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f3733I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3727C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo5057b()
            if (r1 != 0) goto L_0x0018
            r8.mo4948l1(r9)
            r0.mo5118c()
            return
        L_0x0018:
            boolean r1 = r0.f3772e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3727C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f3733I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo5118c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3733I
            if (r5 == 0) goto L_0x0037
            r8.m5099O1(r0)
            goto L_0x003e
        L_0x0037:
            r8.m5095H2()
            boolean r5 = r8.f3725A
            r0.f3770c = r5
        L_0x003e:
            r8.mo5072Q2(r10, r0)
            r0.f3772e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3733I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3727C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3770c
            boolean r6 = r8.f3731G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo5084w2()
            boolean r6 = r8.f3732H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f3729E
            r5.mo5088b()
            r0.f3771d = r4
        L_0x0060:
            int r5 = r8.mo4901K()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3733I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f3759i
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3771d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f3741s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3742t
            r5 = r5[r1]
            r5.mo5124e()
            int r5 = r0.f3769b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r8.f3742t
            r6 = r6[r1]
            r6.mo5143x(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3736L
            int[] r1 = r1.f3773f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f3741s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3742t
            r5 = r5[r1]
            r5.mo5124e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f3736L
            int[] r6 = r6.f3773f
            r6 = r6[r1]
            r5.mo5143x(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f3741s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3742t
            r5 = r5[r1]
            boolean r6 = r8.f3725A
            int r7 = r0.f3769b
            r5.mo5121b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f3736L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3742t
            r1.mo5119d(r5)
        L_0x00c9:
            r8.mo4968x(r9)
            androidx.recyclerview.widget.o r1 = r8.f3747y
            r1.f4029a = r3
            r8.f3737M = r3
            androidx.recyclerview.widget.u r1 = r8.f3744v
            int r1 = r1.mo5397n()
            r8.mo5073S2(r1)
            int r1 = r0.f3768a
            r8.m5102R2(r1, r10)
            boolean r1 = r0.f3770c
            if (r1 == 0) goto L_0x00fc
            r8.m5096J2(r2)
            androidx.recyclerview.widget.o r1 = r8.f3747y
            r8.m5114c2(r9, r1, r10)
            r8.m5096J2(r4)
            androidx.recyclerview.widget.o r1 = r8.f3747y
            int r2 = r0.f3768a
            int r5 = r1.f4032d
            int r2 = r2 + r5
            r1.f4031c = r2
            r8.m5114c2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m5096J2(r4)
            androidx.recyclerview.widget.o r1 = r8.f3747y
            r8.m5114c2(r9, r1, r10)
            r8.m5096J2(r2)
            androidx.recyclerview.widget.o r1 = r8.f3747y
            int r2 = r0.f3768a
            int r5 = r1.f4032d
            int r2 = r2 + r5
            r1.f4031c = r2
            r8.m5114c2(r9, r1, r10)
        L_0x0113:
            r8.m5094G2()
            int r1 = r8.mo4901K()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f3725A
            if (r1 == 0) goto L_0x0127
            r8.m5117j2(r9, r10, r4)
            r8.m5118k2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m5118k2(r9, r10, r4)
            r8.m5117j2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo5060e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f3730F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo4901K()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f3737M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo5082u2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f3740P
            r8.mo4956p1(r11)
            boolean r11 = r8.mo5074T1()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo5060e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3736L
            r11.mo5118c()
        L_0x0166:
            boolean r11 = r0.f3770c
            r8.f3731G = r11
            boolean r11 = r8.mo5084w2()
            r8.f3732H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f3736L
            r11.mo5118c()
            r8.m5127z2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5127z2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public void mo5064B2(int i, RecyclerView.C0826z zVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5080m2();
            i2 = 1;
        } else {
            i3 = mo5079l2();
            i2 = -1;
        }
        this.f3747y.f4029a = true;
        m5102R2(i3, zVar);
        m5096J2(i2);
        C0900o oVar = this.f3747y;
        oVar.f4031c = i3 + oVar.f4032d;
        oVar.f4030b = Math.abs(i);
    }

    /* renamed from: D0 */
    public void mo4888D0(int i) {
        super.mo4888D0(i);
        for (int i2 = 0; i2 < this.f3741s; i2++) {
            this.f3742t[i2].mo5139t(i);
        }
    }

    /* renamed from: D1 */
    public void mo4425D1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int f0 = mo4934f0() + mo4936g0();
        int h0 = mo4938h0() + mo4932e0();
        if (this.f3745w == 1) {
            i4 = RecyclerView.C0809p.m4848o(i2, rect.height() + h0, mo4927c0());
            i3 = RecyclerView.C0809p.m4848o(i, (this.f3746x * this.f3741s) + f0, mo4930d0());
        } else {
            i3 = RecyclerView.C0809p.m4848o(i, rect.width() + f0, mo4930d0());
            i4 = RecyclerView.C0809p.m4848o(i2, (this.f3746x * this.f3741s) + h0, mo4927c0());
        }
        mo4887C1(i3, i4);
    }

    /* renamed from: E */
    public RecyclerView.LayoutParams mo4427E() {
        if (this.f3745w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: E0 */
    public void mo4889E0(int i) {
        super.mo4889E0(i);
        for (int i2 = 0; i2 < this.f3741s; i2++) {
            this.f3742t[i2].mo5139t(i);
        }
    }

    /* renamed from: F */
    public RecyclerView.LayoutParams mo4428F(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: F0 */
    public void mo4891F0(RecyclerView.C0797h hVar, RecyclerView.C0797h hVar2) {
        this.f3729E.mo5088b();
        for (int i = 0; i < this.f3741s; i++) {
            this.f3742t[i].mo5124e();
        }
    }

    /* renamed from: G */
    public RecyclerView.LayoutParams mo4429G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I2 */
    public int mo5065I2(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (mo4901K() == 0 || i == 0) {
            return 0;
        }
        mo5064B2(i, zVar);
        int c2 = m5114c2(vVar, this.f3747y, zVar);
        if (this.f3747y.f4030b >= c2) {
            i = i < 0 ? -c2 : c2;
        }
        this.f3743u.mo5401r(-i);
        this.f3731G = this.f3725A;
        C0900o oVar = this.f3747y;
        oVar.f4030b = 0;
        m5091D2(vVar, oVar);
        return i;
    }

    /* renamed from: J0 */
    public void mo4475J0(RecyclerView recyclerView, RecyclerView.C0820v vVar) {
        super.mo4475J0(recyclerView, vVar);
        mo4956p1(this.f3740P);
        for (int i = 0; i < this.f3741s; i++) {
            this.f3742t[i].mo5124e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: J1 */
    public void mo4476J1(RecyclerView recyclerView, RecyclerView.C0826z zVar, int i) {
        C0901p pVar = new C0901p(recyclerView.getContext());
        pVar.mo5049p(i);
        mo4902K1(pVar);
    }

    /* renamed from: K0 */
    public View mo4430K0(View view, int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        View C;
        int i2;
        int i3;
        int i4;
        int i5;
        View o;
        if (mo4901K() == 0 || (C = mo4885C(view)) == null) {
            return null;
        }
        m5095H2();
        int Y1 = m5110Y1(i);
        if (Y1 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) C.getLayoutParams();
        boolean z = layoutParams.f3750f;
        C0831c cVar = layoutParams.f3749e;
        if (Y1 == 1) {
            i2 = mo5080m2();
        } else {
            i2 = mo5079l2();
        }
        m5102R2(i2, zVar);
        m5096J2(Y1);
        C0900o oVar = this.f3747y;
        oVar.f4031c = oVar.f4032d + i2;
        oVar.f4030b = (int) (((float) this.f3743u.mo5397n()) * 0.33333334f);
        C0900o oVar2 = this.f3747y;
        oVar2.f4036h = true;
        oVar2.f4029a = false;
        m5114c2(vVar, oVar2, zVar);
        this.f3731G = this.f3725A;
        if (!z && (o = cVar.mo5134o(i2, Y1)) != null && o != C) {
            return o;
        }
        if (m5089A2(Y1)) {
            for (int i6 = this.f3741s - 1; i6 >= 0; i6--) {
                View o2 = this.f3742t[i6].mo5134o(i2, Y1);
                if (o2 != null && o2 != C) {
                    return o2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f3741s; i7++) {
                View o3 = this.f3742t[i7].mo5134o(i2, Y1);
                if (o3 != null && o3 != C) {
                    return o3;
                }
            }
        }
        boolean z2 = (this.f3748z ^ true) == (Y1 == -1);
        if (!z) {
            if (z2) {
                i5 = cVar.mo5125f();
            } else {
                i5 = cVar.mo5127h();
            }
            View D = mo4473D(i5);
            if (!(D == null || D == C)) {
                return D;
            }
        }
        if (m5089A2(Y1)) {
            for (int i8 = this.f3741s - 1; i8 >= 0; i8--) {
                if (i8 != cVar.f3779e) {
                    if (z2) {
                        i4 = this.f3742t[i8].mo5125f();
                    } else {
                        i4 = this.f3742t[i8].mo5127h();
                    }
                    View D2 = mo4473D(i4);
                    if (!(D2 == null || D2 == C)) {
                        return D2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f3741s; i9++) {
                if (z2) {
                    i3 = this.f3742t[i9].mo5125f();
                } else {
                    i3 = this.f3742t[i9].mo5127h();
                }
                View D3 = mo4473D(i3);
                if (D3 != null && D3 != C) {
                    return D3;
                }
            }
        }
        return null;
    }

    /* renamed from: K2 */
    public void mo5066K2(int i) {
        if (i == 0 || i == 1) {
            mo4494h((String) null);
            if (i != this.f3745w) {
                this.f3745w = i;
                C0908u uVar = this.f3743u;
                this.f3743u = this.f3744v;
                this.f3744v = uVar;
                mo4964u1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: L0 */
    public void mo4477L0(AccessibilityEvent accessibilityEvent) {
        super.mo4477L0(accessibilityEvent);
        if (mo4901K() > 0) {
            View f2 = mo5076f2(false);
            View e2 = mo5075e2(false);
            if (f2 != null && e2 != null) {
                int i0 = mo4941i0(f2);
                int i02 = mo4941i0(e2);
                if (i0 < i02) {
                    accessibilityEvent.setFromIndex(i0);
                    accessibilityEvent.setToIndex(i02);
                    return;
                }
                accessibilityEvent.setFromIndex(i02);
                accessibilityEvent.setToIndex(i0);
            }
        }
    }

    /* renamed from: L2 */
    public void mo5067L2(boolean z) {
        mo4494h((String) null);
        SavedState savedState = this.f3733I;
        if (!(savedState == null || savedState.f3764n == z)) {
            savedState.f3764n = z;
        }
        this.f3748z = z;
        mo4964u1();
    }

    /* renamed from: M1 */
    public boolean mo4431M1() {
        return this.f3733I == null;
    }

    /* renamed from: M2 */
    public void mo5068M2(int i) {
        mo4494h((String) null);
        if (i != this.f3741s) {
            mo5083v2();
            this.f3741s = i;
            this.f3726B = new BitSet(this.f3741s);
            this.f3742t = new C0831c[this.f3741s];
            for (int i2 = 0; i2 < this.f3741s; i2++) {
                this.f3742t[i2] = new C0831c(i2);
            }
            mo4964u1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P1 */
    public boolean mo5069P1() {
        int n = this.f3742t[0].mo5133n(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3741s; i++) {
            if (this.f3742t[i].mo5133n(Integer.MIN_VALUE) != n) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P2 */
    public boolean mo5070P2(RecyclerView.C0826z zVar, C0830b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!zVar.mo5060e() && (i = this.f3727C) != -1) {
            if (i < 0 || i >= zVar.mo5057b()) {
                this.f3727C = -1;
                this.f3728D = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f3733I;
                if (savedState == null || savedState.f3757g == -1 || savedState.f3759i < 1) {
                    View D = mo4473D(this.f3727C);
                    if (D != null) {
                        if (this.f3725A) {
                            i2 = mo5080m2();
                        } else {
                            i2 = mo5079l2();
                        }
                        bVar.f3768a = i2;
                        if (this.f3728D != Integer.MIN_VALUE) {
                            if (bVar.f3770c) {
                                bVar.f3769b = (this.f3743u.mo5392i() - this.f3728D) - this.f3743u.mo5387d(D);
                            } else {
                                bVar.f3769b = (this.f3743u.mo5396m() + this.f3728D) - this.f3743u.mo5390g(D);
                            }
                            return true;
                        } else if (this.f3743u.mo5388e(D) > this.f3743u.mo5397n()) {
                            if (bVar.f3770c) {
                                i3 = this.f3743u.mo5392i();
                            } else {
                                i3 = this.f3743u.mo5396m();
                            }
                            bVar.f3769b = i3;
                            return true;
                        } else {
                            int g = this.f3743u.mo5390g(D) - this.f3743u.mo5396m();
                            if (g < 0) {
                                bVar.f3769b = -g;
                                return true;
                            }
                            int i4 = this.f3743u.mo5392i() - this.f3743u.mo5387d(D);
                            if (i4 < 0) {
                                bVar.f3769b = i4;
                                return true;
                            }
                            bVar.f3769b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f3727C;
                        bVar.f3768a = i5;
                        int i6 = this.f3728D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m5103S1(i5) == 1) {
                                z = true;
                            }
                            bVar.f3770c = z;
                            bVar.mo5116a();
                        } else {
                            bVar.mo5117b(i6);
                        }
                        bVar.f3771d = true;
                    }
                } else {
                    bVar.f3769b = Integer.MIN_VALUE;
                    bVar.f3768a = this.f3727C;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q1 */
    public boolean mo5071Q1() {
        int r = this.f3742t[0].mo5137r(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3741s; i++) {
            if (this.f3742t[i].mo5137r(Integer.MIN_VALUE) != r) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q2 */
    public void mo5072Q2(RecyclerView.C0826z zVar, C0830b bVar) {
        if (!mo5070P2(zVar, bVar) && !m5100O2(zVar, bVar)) {
            bVar.mo5116a();
            bVar.f3768a = 0;
        }
    }

    /* renamed from: S0 */
    public void mo4435S0(RecyclerView recyclerView, int i, int i2) {
        m5124t2(i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S2 */
    public void mo5073S2(int i) {
        this.f3746x = i / this.f3741s;
        this.f3734J = View.MeasureSpec.makeMeasureSpec(i, this.f3744v.mo5394k());
    }

    /* renamed from: T0 */
    public void mo4436T0(RecyclerView recyclerView) {
        this.f3729E.mo5088b();
        mo4964u1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public boolean mo5074T1() {
        int i;
        int i2;
        if (mo4901K() == 0 || this.f3730F == 0 || !mo4961s0()) {
            return false;
        }
        if (this.f3725A) {
            i2 = mo5080m2();
            i = mo5079l2();
        } else {
            i2 = mo5079l2();
            i = mo5080m2();
        }
        if (i2 == 0 && mo5082u2() != null) {
            this.f3729E.mo5088b();
            mo4966v1();
            mo4964u1();
            return true;
        } else if (!this.f3737M) {
            return false;
        } else {
            int i3 = this.f3725A ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e = this.f3729E.mo5091e(i2, i4, i3, true);
            if (e == null) {
                this.f3737M = false;
                this.f3729E.mo5090d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.f3729E.mo5091e(i2, e.f3753g, i3 * -1, true);
            if (e2 == null) {
                this.f3729E.mo5090d(e.f3753g);
            } else {
                this.f3729E.mo5090d(e2.f3753g + 1);
            }
            mo4966v1();
            mo4964u1();
            return true;
        }
    }

    /* renamed from: U0 */
    public void mo4437U0(RecyclerView recyclerView, int i, int i2, int i3) {
        m5124t2(i, i2, 8);
    }

    /* renamed from: V0 */
    public void mo4438V0(RecyclerView recyclerView, int i, int i2) {
        m5124t2(i, i2, 2);
    }

    /* renamed from: X0 */
    public void mo4441X0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5124t2(i, i2, 4);
    }

    /* renamed from: Y0 */
    public void mo4442Y0(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        m5127z2(vVar, zVar, true);
    }

    /* renamed from: Z0 */
    public void mo4443Z0(RecyclerView.C0826z zVar) {
        super.mo4443Z0(zVar);
        this.f3727C = -1;
        this.f3728D = Integer.MIN_VALUE;
        this.f3733I = null;
        this.f3736L.mo5118c();
    }

    /* renamed from: a */
    public PointF mo4486a(int i) {
        int S1 = m5103S1(i);
        PointF pointF = new PointF();
        if (S1 == 0) {
            return null;
        }
        if (this.f3745w == 0) {
            pointF.x = (float) S1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) S1;
        }
        return pointF;
    }

    /* renamed from: d1 */
    public void mo4490d1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f3733I = savedState;
            if (this.f3727C != -1) {
                savedState.mo5107a();
                this.f3733I.mo5108b();
            }
            mo4964u1();
        }
    }

    /* renamed from: e1 */
    public Parcelable mo4492e1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f3733I != null) {
            return new SavedState(this.f3733I);
        }
        SavedState savedState = new SavedState();
        savedState.f3764n = this.f3748z;
        savedState.f3765o = this.f3731G;
        savedState.f3766p = this.f3732H;
        LazySpanLookup lazySpanLookup = this.f3729E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3751a) == null) {
            savedState.f3761k = 0;
        } else {
            savedState.f3762l = iArr;
            savedState.f3761k = iArr.length;
            savedState.f3763m = lazySpanLookup.f3752b;
        }
        if (mo4901K() > 0) {
            if (this.f3731G) {
                i = mo5080m2();
            } else {
                i = mo5079l2();
            }
            savedState.f3757g = i;
            savedState.f3758h = mo5077g2();
            int i4 = this.f3741s;
            savedState.f3759i = i4;
            savedState.f3760j = new int[i4];
            for (int i5 = 0; i5 < this.f3741s; i5++) {
                if (this.f3731G) {
                    i2 = this.f3742t[i5].mo5133n(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f3743u.mo5392i();
                    } else {
                        savedState.f3760j[i5] = i2;
                    }
                } else {
                    i2 = this.f3742t[i5].mo5137r(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f3743u.mo5396m();
                    } else {
                        savedState.f3760j[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f3760j[i5] = i2;
            }
        } else {
            savedState.f3757g = -1;
            savedState.f3758h = -1;
            savedState.f3759i = 0;
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public View mo5075e2(boolean z) {
        int m = this.f3743u.mo5396m();
        int i = this.f3743u.mo5392i();
        View view = null;
        for (int K = mo4901K() - 1; K >= 0; K--) {
            View J = mo4900J(K);
            int g = this.f3743u.mo5390g(J);
            int d = this.f3743u.mo5387d(J);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return J;
                }
                if (view == null) {
                    view = J;
                }
            }
        }
        return view;
    }

    /* renamed from: f1 */
    public void mo4935f1(int i) {
        if (i == 0) {
            mo5074T1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public View mo5076f2(boolean z) {
        int m = this.f3743u.mo5396m();
        int i = this.f3743u.mo5392i();
        int K = mo4901K();
        View view = null;
        for (int i2 = 0; i2 < K; i2++) {
            View J = mo4900J(i2);
            int g = this.f3743u.mo5390g(J);
            if (this.f3743u.mo5387d(J) > m && g < i) {
                if (g >= m || !z) {
                    return J;
                }
                if (view == null) {
                    view = J;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public int mo5077g2() {
        View view;
        if (this.f3725A) {
            view = mo5075e2(true);
        } else {
            view = mo5076f2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo4941i0(view);
    }

    /* renamed from: h */
    public void mo4494h(String str) {
        if (this.f3733I == null) {
            super.mo4494h(str);
        }
    }

    /* renamed from: h2 */
    public int[] mo5078h2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3741s];
        } else if (iArr.length < this.f3741s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3741s + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f3741s; i++) {
            iArr[i] = this.f3742t[i].mo5126g();
        }
        return iArr;
    }

    /* renamed from: l */
    public boolean mo4495l() {
        return this.f3745w == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public int mo5079l2() {
        if (mo4901K() == 0) {
            return 0;
        }
        return mo4941i0(mo4900J(0));
    }

    /* renamed from: m */
    public boolean mo4496m() {
        return this.f3745w == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public int mo5080m2() {
        int K = mo4901K();
        if (K == 0) {
            return 0;
        }
        return mo4941i0(mo4900J(K - 1));
    }

    /* renamed from: n */
    public boolean mo4448n(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: p */
    public void mo4500p(int i, int i2, RecyclerView.C0826z zVar, RecyclerView.C0809p.C0812c cVar) {
        int i3;
        int i4;
        if (this.f3745w != 0) {
            i = i2;
        }
        if (mo4901K() != 0 && i != 0) {
            mo5064B2(i, zVar);
            int[] iArr = this.f3739O;
            if (iArr == null || iArr.length < this.f3741s) {
                this.f3739O = new int[this.f3741s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3741s; i6++) {
                C0900o oVar = this.f3747y;
                if (oVar.f4032d == -1) {
                    i4 = oVar.f4034f;
                    i3 = this.f3742t[i6].mo5137r(i4);
                } else {
                    i4 = this.f3742t[i6].mo5133n(oVar.f4035g);
                    i3 = this.f3747y.f4035g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3739O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3739O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3747y.mo5365a(zVar); i8++) {
                cVar.mo4977a(this.f3747y.f4031c, this.f3739O[i8]);
                C0900o oVar2 = this.f3747y;
                oVar2.f4031c += oVar2.f4032d;
            }
        }
    }

    /* renamed from: r */
    public int mo4503r(RecyclerView.C0826z zVar) {
        return m5107V1(zVar);
    }

    /* renamed from: s */
    public int mo4450s(RecyclerView.C0826z zVar) {
        return m5108W1(zVar);
    }

    /* renamed from: s2 */
    public int mo5081s2() {
        return this.f3741s;
    }

    /* renamed from: t */
    public int mo4452t(RecyclerView.C0826z zVar) {
        return m5109X1(zVar);
    }

    /* renamed from: t0 */
    public boolean mo4504t0() {
        return this.f3730F != 0;
    }

    /* renamed from: u */
    public int mo4505u(RecyclerView.C0826z zVar) {
        return m5107V1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5082u2() {
        /*
            r12 = this;
            int r0 = r12.mo4901K()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3741s
            r2.<init>(r3)
            int r3 = r12.f3741s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3745w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo5084w2()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3725A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4900J(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3749e
            int r9 = r9.f3779e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3749e
            boolean r9 = r12.m5105U1(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f3749e
            int r9 = r9.f3779e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3750f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4900J(r9)
            boolean r10 = r12.f3725A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.u r10 = r12.f3743u
            int r10 = r10.mo5387d(r7)
            androidx.recyclerview.widget.u r11 = r12.f3743u
            int r11 = r11.mo5387d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.u r10 = r12.f3743u
            int r10 = r10.mo5390g(r7)
            androidx.recyclerview.widget.u r11 = r12.f3743u
            int r11 = r11.mo5390g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f3749e
            int r8 = r8.f3779e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f3749e
            int r9 = r9.f3779e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo5082u2():android.view.View");
    }

    /* renamed from: v */
    public int mo4453v(RecyclerView.C0826z zVar) {
        return m5108W1(zVar);
    }

    /* renamed from: v2 */
    public void mo5083v2() {
        this.f3729E.mo5088b();
        mo4964u1();
    }

    /* renamed from: w */
    public int mo4454w(RecyclerView.C0826z zVar) {
        return m5109X1(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w2 */
    public boolean mo5084w2() {
        return mo4922a0() == 1;
    }

    /* renamed from: x1 */
    public int mo4455x1(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        return mo5065I2(i, vVar, zVar);
    }

    /* renamed from: y1 */
    public void mo4507y1(int i) {
        SavedState savedState = this.f3733I;
        if (!(savedState == null || savedState.f3757g == i)) {
            savedState.mo5107a();
        }
        this.f3727C = i;
        this.f3728D = Integer.MIN_VALUE;
        mo4964u1();
    }

    /* renamed from: z1 */
    public int mo4456z1(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        return mo5065I2(i, vVar, zVar);
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f3751a;

        /* renamed from: b */
        List<FullSpanItem> f3752b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m5189i(int i) {
            if (this.f3752b == null) {
                return -1;
            }
            FullSpanItem f = mo5092f(i);
            if (f != null) {
                this.f3752b.remove(f);
            }
            int size = this.f3752b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3752b.get(i2).f3753g >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3752b.remove(i2);
            return this.f3752b.get(i2).f3753g;
        }

        /* renamed from: l */
        private void m5190l(int i, int i2) {
            List<FullSpanItem> list = this.f3752b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3752b.get(size);
                    int i3 = fullSpanItem.f3753g;
                    if (i3 >= i) {
                        fullSpanItem.f3753g = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m5191m(int i, int i2) {
            List<FullSpanItem> list = this.f3752b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3752b.get(size);
                    int i4 = fullSpanItem.f3753g;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3752b.remove(size);
                        } else {
                            fullSpanItem.f3753g = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5087a(FullSpanItem fullSpanItem) {
            if (this.f3752b == null) {
                this.f3752b = new ArrayList();
            }
            int size = this.f3752b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f3752b.get(i);
                if (fullSpanItem2.f3753g == fullSpanItem.f3753g) {
                    this.f3752b.remove(i);
                }
                if (fullSpanItem2.f3753g >= fullSpanItem.f3753g) {
                    this.f3752b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f3752b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5088b() {
            int[] iArr = this.f3751a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3752b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5089c(int i) {
            int[] iArr = this.f3751a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f3751a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo5098o(i)];
                this.f3751a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3751a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5090d(int i) {
            List<FullSpanItem> list = this.f3752b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3752b.get(size).f3753g >= i) {
                        this.f3752b.remove(size);
                    }
                }
            }
            return mo5094h(i);
        }

        /* renamed from: e */
        public FullSpanItem mo5091e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f3752b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f3752b.get(i4);
                int i5 = fullSpanItem.f3753g;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f3754h == i3 || (z && fullSpanItem.f3756j))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem mo5092f(int i) {
            List<FullSpanItem> list = this.f3752b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3752b.get(size);
                if (fullSpanItem.f3753g == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo5093g(int i) {
            int[] iArr = this.f3751a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5094h(int i) {
            int[] iArr = this.f3751a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m5189i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f3751a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3751a.length;
            }
            int min = Math.min(i2 + 1, this.f3751a.length);
            Arrays.fill(this.f3751a, i, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5095j(int i, int i2) {
            int[] iArr = this.f3751a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5089c(i3);
                int[] iArr2 = this.f3751a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3751a, i, i3, -1);
                m5190l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5096k(int i, int i2) {
            int[] iArr = this.f3751a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5089c(i3);
                int[] iArr2 = this.f3751a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3751a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m5191m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5097n(int i, C0831c cVar) {
            mo5089c(i);
            this.f3751a[i] = cVar.f3779e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5098o(int i) {
            int length = this.f3751a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0827a();

            /* renamed from: g */
            int f3753g;

            /* renamed from: h */
            int f3754h;

            /* renamed from: i */
            int[] f3755i;

            /* renamed from: j */
            boolean f3756j;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            class C0827a implements Parcelable.Creator<FullSpanItem> {
                C0827a() {
                }

                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f3753g = parcel.readInt();
                this.f3754h = parcel.readInt();
                this.f3756j = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3755i = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo5099a(int i) {
                int[] iArr = this.f3755i;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3753g + ", mGapDir=" + this.f3754h + ", mHasUnwantedGapAfter=" + this.f3756j + ", mGapPerSpan=" + Arrays.toString(this.f3755i) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3753g);
                parcel.writeInt(this.f3754h);
                parcel.writeInt(this.f3756j ? 1 : 0);
                int[] iArr = this.f3755i;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3755i);
            }

            FullSpanItem() {
            }
        }
    }
}
