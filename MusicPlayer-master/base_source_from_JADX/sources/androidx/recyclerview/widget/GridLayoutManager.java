package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p082e.p109h.p119p.p120e0.C3736c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3487I = false;

    /* renamed from: J */
    int f3488J = -1;

    /* renamed from: K */
    int[] f3489K;

    /* renamed from: L */
    View[] f3490L;

    /* renamed from: M */
    final SparseIntArray f3491M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3492N = new SparseIntArray();

    /* renamed from: O */
    C0781b f3493O = new C0780a();

    /* renamed from: P */
    final Rect f3494P = new Rect();

    /* renamed from: Q */
    private boolean f3495Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0780a extends C0781b {
        public int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        public int getSpanSize(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C0781b {
        private boolean mCacheSpanGroupIndices = false;
        private boolean mCacheSpanIndices = false;
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        final SparseIntArray mSpanIndexCache = new SparseIntArray();

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        public int getCachedSpanGroupIndex(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanGroupIndex = getSpanGroupIndex(i, i2);
            this.mSpanGroupIndexCache.put(i, spanGroupIndex);
            return spanGroupIndex;
        }

        /* access modifiers changed from: package-private */
        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int spanIndex = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, spanIndex);
            return spanIndex;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int getSpanGroupIndex(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.getSpanSize(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0781b.getSpanGroupIndex(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C0781b.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4444d3(RecyclerView.C0809p.m4847j0(context, attributeSet, i, i2).f3674b);
    }

    /* renamed from: M2 */
    private void m4471M2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3490L[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int Z2 = m4482Z2(vVar, zVar, mo4941i0(view));
            layoutParams.f3497f = Z2;
            layoutParams.f3496e = i4;
            i4 += Z2;
            i3 += i2;
        }
    }

    /* renamed from: N2 */
    private void m4472N2() {
        int K = mo4901K();
        for (int i = 0; i < K; i++) {
            LayoutParams layoutParams = (LayoutParams) mo4900J(i).getLayoutParams();
            int a = layoutParams.mo4706a();
            this.f3491M.put(a, layoutParams.mo4458f());
            this.f3492N.put(a, layoutParams.mo4457e());
        }
    }

    /* renamed from: O2 */
    private void m4473O2(int i) {
        this.f3489K = m4474P2(this.f3489K, this.f3488J, i);
    }

    /* renamed from: P2 */
    static int[] m4474P2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: Q2 */
    private void m4475Q2() {
        this.f3491M.clear();
        this.f3492N.clear();
    }

    /* renamed from: R2 */
    private int m4476R2(RecyclerView.C0826z zVar) {
        int i;
        if (!(mo4901K() == 0 || zVar.mo5057b() == 0)) {
            mo4481U1();
            boolean p2 = mo4501p2();
            View Y1 = mo4484Y1(!p2, true);
            View X1 = mo4483X1(!p2, true);
            if (!(Y1 == null || X1 == null)) {
                int cachedSpanGroupIndex = this.f3493O.getCachedSpanGroupIndex(mo4941i0(Y1), this.f3488J);
                int cachedSpanGroupIndex2 = this.f3493O.getCachedSpanGroupIndex(mo4941i0(X1), this.f3488J);
                int min = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int max = Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.f3493O.getCachedSpanGroupIndex(zVar.mo5057b() - 1, this.f3488J) + 1;
                if (this.f3511x) {
                    i = Math.max(0, (cachedSpanGroupIndex3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!p2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f3508u.mo5387d(X1) - this.f3508u.mo5390g(Y1))) / ((float) ((this.f3493O.getCachedSpanGroupIndex(mo4941i0(X1), this.f3488J) - this.f3493O.getCachedSpanGroupIndex(mo4941i0(Y1), this.f3488J)) + 1)))) + ((float) (this.f3508u.mo5396m() - this.f3508u.mo5390g(Y1))));
            }
        }
        return 0;
    }

    /* renamed from: S2 */
    private int m4477S2(RecyclerView.C0826z zVar) {
        if (!(mo4901K() == 0 || zVar.mo5057b() == 0)) {
            mo4481U1();
            View Y1 = mo4484Y1(!mo4501p2(), true);
            View X1 = mo4483X1(!mo4501p2(), true);
            if (!(Y1 == null || X1 == null)) {
                if (!mo4501p2()) {
                    return this.f3493O.getCachedSpanGroupIndex(zVar.mo5057b() - 1, this.f3488J) + 1;
                }
                int d = this.f3508u.mo5387d(X1) - this.f3508u.mo5390g(Y1);
                int cachedSpanGroupIndex = this.f3493O.getCachedSpanGroupIndex(mo4941i0(Y1), this.f3488J);
                return (int) ((((float) d) / ((float) ((this.f3493O.getCachedSpanGroupIndex(mo4941i0(X1), this.f3488J) - cachedSpanGroupIndex) + 1))) * ((float) (this.f3493O.getCachedSpanGroupIndex(zVar.mo5057b() - 1, this.f3488J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: T2 */
    private void m4478T2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, LinearLayoutManager.C0783a aVar, int i) {
        boolean z = i == 1;
        int Y2 = m4481Y2(vVar, zVar, aVar.f3518b);
        if (z) {
            while (Y2 > 0) {
                int i2 = aVar.f3518b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f3518b = i3;
                    Y2 = m4481Y2(vVar, zVar, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = zVar.mo5057b() - 1;
        int i4 = aVar.f3518b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int Y22 = m4481Y2(vVar, zVar, i5);
            if (Y22 <= Y2) {
                break;
            }
            i4 = i5;
            Y2 = Y22;
        }
        aVar.f3518b = i4;
    }

    /* renamed from: U2 */
    private void m4479U2() {
        View[] viewArr = this.f3490L;
        if (viewArr == null || viewArr.length != this.f3488J) {
            this.f3490L = new View[this.f3488J];
        }
    }

    /* renamed from: X2 */
    private int m4480X2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, int i) {
        if (!zVar.mo5060e()) {
            return this.f3493O.getCachedSpanGroupIndex(i, this.f3488J);
        }
        int f = vVar.mo5013f(i);
        if (f != -1) {
            return this.f3493O.getCachedSpanGroupIndex(f, this.f3488J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: Y2 */
    private int m4481Y2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, int i) {
        if (!zVar.mo5060e()) {
            return this.f3493O.getCachedSpanIndex(i, this.f3488J);
        }
        int i2 = this.f3492N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo5013f(i);
        if (f != -1) {
            return this.f3493O.getCachedSpanIndex(f, this.f3488J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: Z2 */
    private int m4482Z2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, int i) {
        if (!zVar.mo5060e()) {
            return this.f3493O.getSpanSize(i);
        }
        int i2 = this.f3491M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo5013f(i);
        if (f != -1) {
            return this.f3493O.getSpanSize(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: a3 */
    private void m4483a3(float f, int i) {
        m4473O2(Math.max(Math.round(f * ((float) this.f3488J)), i));
    }

    /* renamed from: b3 */
    private void m4484b3(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f3626b;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int V2 = mo4439V2(layoutParams.f3496e, layoutParams.f3497f);
        if (this.f3506s == 1) {
            i2 = RecyclerView.C0809p.m4844L(V2, i, i5, layoutParams.width, false);
            i3 = RecyclerView.C0809p.m4844L(this.f3508u.mo5397n(), mo4920Y(), i4, layoutParams.height, true);
        } else {
            int L = RecyclerView.C0809p.m4844L(V2, i, i4, layoutParams.height, false);
            int L2 = RecyclerView.C0809p.m4844L(this.f3508u.mo5397n(), mo4957q0(), i5, layoutParams.width, true);
            i3 = L;
            i2 = L2;
        }
        m4485c3(view, i2, i3, z);
    }

    /* renamed from: c3 */
    private void m4485c3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = mo4899I1(view, i, i2, layoutParams);
        } else {
            z2 = mo4894G1(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: f3 */
    private void m4486f3() {
        int i;
        int i2;
        if (mo4498n2() == 1) {
            i2 = mo4955p0() - mo4936g0();
            i = mo4934f0();
        } else {
            i2 = mo4919X() - mo4932e0();
            i = mo4938h0();
        }
        m4473O2(i2 - i);
    }

    /* renamed from: D1 */
    public void mo4425D1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3489K == null) {
            super.mo4425D1(rect, i, i2);
        }
        int f0 = mo4934f0() + mo4936g0();
        int h0 = mo4938h0() + mo4932e0();
        if (this.f3506s == 1) {
            i4 = RecyclerView.C0809p.m4848o(i2, rect.height() + h0, mo4927c0());
            int[] iArr = this.f3489K;
            i3 = RecyclerView.C0809p.m4848o(i, iArr[iArr.length - 1] + f0, mo4930d0());
        } else {
            i3 = RecyclerView.C0809p.m4848o(i, rect.width() + f0, mo4930d0());
            int[] iArr2 = this.f3489K;
            i4 = RecyclerView.C0809p.m4848o(i2, iArr2[iArr2.length - 1] + h0, mo4927c0());
        }
        mo4887C1(i3, i4);
    }

    /* renamed from: D2 */
    public void mo4426D2(boolean z) {
        if (!z) {
            super.mo4426D2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: E */
    public RecyclerView.LayoutParams mo4427E() {
        if (this.f3506s == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: F */
    public RecyclerView.LayoutParams mo4428F(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: G */
    public RecyclerView.LayoutParams mo4429G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4430K0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0820v r26, androidx.recyclerview.widget.RecyclerView.C0826z r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo4885C(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f3496e
            int r5 = r5.f3497f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4430K0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo4479S1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3511x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo4901K()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo4901K()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f3506s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4499o2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m4480X2(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m4480X2(r1, r2, r10)
            android.view.View r1 = r0.mo4900J(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f3496e
            r18 = r3
            int r3 = r9.f3497f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo4971z0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f3496e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f3496e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4430K0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    /* renamed from: M1 */
    public boolean mo4431M1() {
        return this.f3501D == null && !this.f3487I;
    }

    /* renamed from: O */
    public int mo4432O(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (this.f3506s == 1) {
            return this.f3488J;
        }
        if (zVar.mo5057b() < 1) {
            return 0;
        }
        return m4480X2(vVar, zVar, zVar.mo5057b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O1 */
    public void mo4433O1(RecyclerView.C0826z zVar, LinearLayoutManager.C0785c cVar, RecyclerView.C0809p.C0812c cVar2) {
        int i = this.f3488J;
        for (int i2 = 0; i2 < this.f3488J && cVar.mo4526c(zVar) && i > 0; i2++) {
            int i3 = cVar.f3529d;
            cVar2.mo4977a(i3, Math.max(0, cVar.f3532g));
            i -= this.f3493O.getSpanSize(i3);
            cVar.f3529d += cVar.f3530e;
        }
    }

    /* renamed from: Q0 */
    public void mo4434Q0(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, View view, C3736c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo4909P0(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int X2 = m4480X2(vVar, zVar, layoutParams2.mo4706a());
        if (this.f3506s == 0) {
            cVar.mo13120f0(C3736c.C3739c.m16068a(layoutParams2.mo4457e(), layoutParams2.mo4458f(), X2, 1, false, false));
            return;
        }
        cVar.mo13120f0(C3736c.C3739c.m16068a(X2, 1, layoutParams2.mo4457e(), layoutParams2.mo4458f(), false, false));
    }

    /* renamed from: S0 */
    public void mo4435S0(RecyclerView recyclerView, int i, int i2) {
        this.f3493O.invalidateSpanIndexCache();
        this.f3493O.invalidateSpanGroupIndexCache();
    }

    /* renamed from: T0 */
    public void mo4436T0(RecyclerView recyclerView) {
        this.f3493O.invalidateSpanIndexCache();
        this.f3493O.invalidateSpanGroupIndexCache();
    }

    /* renamed from: U0 */
    public void mo4437U0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3493O.invalidateSpanIndexCache();
        this.f3493O.invalidateSpanGroupIndexCache();
    }

    /* renamed from: V0 */
    public void mo4438V0(RecyclerView recyclerView, int i, int i2) {
        this.f3493O.invalidateSpanIndexCache();
        this.f3493O.invalidateSpanGroupIndexCache();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V2 */
    public int mo4439V2(int i, int i2) {
        if (this.f3506s != 1 || !mo4499o2()) {
            int[] iArr = this.f3489K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3489K;
        int i3 = this.f3488J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: W2 */
    public int mo4440W2() {
        return this.f3488J;
    }

    /* renamed from: X0 */
    public void mo4441X0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3493O.invalidateSpanIndexCache();
        this.f3493O.invalidateSpanGroupIndexCache();
    }

    /* renamed from: Y0 */
    public void mo4442Y0(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (zVar.mo5060e()) {
            m4472N2();
        }
        super.mo4442Y0(vVar, zVar);
        m4475Q2();
    }

    /* renamed from: Z0 */
    public void mo4443Z0(RecyclerView.C0826z zVar) {
        super.mo4443Z0(zVar);
        this.f3487I = false;
    }

    /* renamed from: d3 */
    public void mo4444d3(int i) {
        if (i != this.f3488J) {
            this.f3487I = true;
            if (i >= 1) {
                this.f3488J = i;
                this.f3493O.invalidateSpanIndexCache();
                mo4964u1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: e3 */
    public void mo4445e3(C0781b bVar) {
        this.f3493O = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public View mo4446h2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, boolean z, boolean z2) {
        int i;
        int K = mo4901K();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = mo4901K() - 1;
            i3 = -1;
        } else {
            i2 = K;
            i = 0;
        }
        int b = zVar.mo5057b();
        mo4481U1();
        int m = this.f3508u.mo5396m();
        int i4 = this.f3508u.mo5392i();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View J = mo4900J(i);
            int i0 = mo4941i0(J);
            if (i0 >= 0 && i0 < b && m4481Y2(vVar, zVar, i0) == 0) {
                if (((RecyclerView.LayoutParams) J.getLayoutParams()).mo4708c()) {
                    if (view2 == null) {
                        view2 = J;
                    }
                } else if (this.f3508u.mo5390g(J) < i4 && this.f3508u.mo5387d(J) >= m) {
                    return J;
                } else {
                    if (view == null) {
                        view = J;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    /* renamed from: l0 */
    public int mo4447l0(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        if (this.f3506s == 0) {
            return this.f3488J;
        }
        if (zVar.mo5057b() < 1) {
            return 0;
        }
        return m4480X2(vVar, zVar, zVar.mo5057b() - 1) + 1;
    }

    /* renamed from: n */
    public boolean mo4448n(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo4449q2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, LinearLayoutManager.C0785c cVar, LinearLayoutManager.C0784b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        View d;
        RecyclerView.C0820v vVar2 = vVar;
        RecyclerView.C0826z zVar2 = zVar;
        LinearLayoutManager.C0785c cVar2 = cVar;
        LinearLayoutManager.C0784b bVar2 = bVar;
        int l = this.f3508u.mo5395l();
        boolean z = false;
        boolean z2 = l != 1073741824;
        int i11 = mo4901K() > 0 ? this.f3489K[this.f3488J] : 0;
        if (z2) {
            m4486f3();
        }
        boolean z3 = cVar2.f3530e == 1;
        int i12 = this.f3488J;
        if (!z3) {
            i12 = m4481Y2(vVar2, zVar2, cVar2.f3529d) + m4482Z2(vVar2, zVar2, cVar2.f3529d);
        }
        int i13 = 0;
        while (i13 < this.f3488J && cVar2.mo4526c(zVar2) && i12 > 0) {
            int i14 = cVar2.f3529d;
            int Z2 = m4482Z2(vVar2, zVar2, i14);
            if (Z2 <= this.f3488J) {
                i12 -= Z2;
                if (i12 < 0 || (d = cVar2.mo4527d(vVar2)) == null) {
                    break;
                }
                this.f3490L[i13] = d;
                i13++;
            } else {
                throw new IllegalArgumentException("Item at position " + i14 + " requires " + Z2 + " spans but GridLayoutManager has only " + this.f3488J + " spans.");
            }
        }
        if (i13 == 0) {
            bVar2.f3523b = true;
            return;
        }
        float f = 0.0f;
        m4471M2(vVar2, zVar2, i13, z3);
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            View view = this.f3490L[i15];
            if (cVar2.f3537l == null) {
                if (z3) {
                    mo4931e(view);
                } else {
                    mo4933f(view, z);
                }
            } else if (z3) {
                mo4926c(view);
            } else {
                mo4929d(view, z ? 1 : 0);
            }
            mo4945k(view, this.f3494P);
            m4484b3(view, l, z);
            int e = this.f3508u.mo5388e(view);
            if (e > i16) {
                i16 = e;
            }
            float f2 = (((float) this.f3508u.mo5389f(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f3497f);
            if (f2 > f) {
                f = f2;
            }
            i15++;
            z = false;
        }
        if (z2) {
            m4483a3(f, i11);
            i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.f3490L[i17];
                m4484b3(view2, 1073741824, true);
                int e2 = this.f3508u.mo5388e(view2);
                if (e2 > i16) {
                    i16 = e2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.f3490L[i18];
            if (this.f3508u.mo5388e(view3) != i16) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f3626b;
                int i19 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i20 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int V2 = mo4439V2(layoutParams.f3496e, layoutParams.f3497f);
                if (this.f3506s == 1) {
                    i10 = RecyclerView.C0809p.m4844L(V2, 1073741824, i20, layoutParams.width, false);
                    i9 = View.MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    i9 = RecyclerView.C0809p.m4844L(V2, 1073741824, i19, layoutParams.height, false);
                    i10 = makeMeasureSpec;
                }
                m4485c3(view3, i10, i9, true);
            }
        }
        int i21 = 0;
        bVar2.f3522a = i16;
        if (this.f3506s == 1) {
            if (cVar2.f3531f == -1) {
                i4 = cVar2.f3527b;
                i = i4 - i16;
            } else {
                int i22 = cVar2.f3527b;
                i = i22;
                i4 = i16 + i22;
            }
            i3 = 0;
            i2 = 0;
        } else if (cVar2.f3531f == -1) {
            int i23 = cVar2.f3527b;
            i2 = i23 - i16;
            i = 0;
            i3 = i23;
            i4 = 0;
        } else {
            int i24 = cVar2.f3527b;
            i3 = i16 + i24;
            i2 = i24;
            i4 = 0;
            i = 0;
        }
        while (i21 < i13) {
            View view4 = this.f3490L[i21];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f3506s == 1) {
                if (mo4499o2()) {
                    int f0 = mo4934f0() + this.f3489K[this.f3488J - layoutParams2.f3496e];
                    i8 = i4;
                    i7 = f0;
                    i6 = f0 - this.f3508u.mo5389f(view4);
                } else {
                    int f02 = mo4934f0() + this.f3489K[layoutParams2.f3496e];
                    i8 = i4;
                    i6 = f02;
                    i7 = this.f3508u.mo5389f(view4) + f02;
                }
                i5 = i;
            } else {
                int h0 = mo4938h0() + this.f3489K[layoutParams2.f3496e];
                i5 = h0;
                i7 = i3;
                i6 = i2;
                i8 = this.f3508u.mo5389f(view4) + h0;
            }
            mo4880A0(view4, i6, i5, i7, i8);
            if (layoutParams2.mo4708c() || layoutParams2.mo4707b()) {
                bVar2.f3524c = true;
            }
            bVar2.f3525d |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.f3490L, (Object) null);
    }

    /* renamed from: s */
    public int mo4450s(RecyclerView.C0826z zVar) {
        if (this.f3495Q) {
            return m4476R2(zVar);
        }
        return super.mo4450s(zVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo4451s2(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, LinearLayoutManager.C0783a aVar, int i) {
        super.mo4451s2(vVar, zVar, aVar, i);
        m4486f3();
        if (zVar.mo5057b() > 0 && !zVar.mo5060e()) {
            m4478T2(vVar, zVar, aVar, i);
        }
        m4479U2();
    }

    /* renamed from: t */
    public int mo4452t(RecyclerView.C0826z zVar) {
        if (this.f3495Q) {
            return m4477S2(zVar);
        }
        return super.mo4452t(zVar);
    }

    /* renamed from: v */
    public int mo4453v(RecyclerView.C0826z zVar) {
        if (this.f3495Q) {
            return m4476R2(zVar);
        }
        return super.mo4453v(zVar);
    }

    /* renamed from: w */
    public int mo4454w(RecyclerView.C0826z zVar) {
        if (this.f3495Q) {
            return m4477S2(zVar);
        }
        return super.mo4454w(zVar);
    }

    /* renamed from: x1 */
    public int mo4455x1(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        m4486f3();
        m4479U2();
        return super.mo4455x1(i, vVar, zVar);
    }

    /* renamed from: z1 */
    public int mo4456z1(int i, RecyclerView.C0820v vVar, RecyclerView.C0826z zVar) {
        m4486f3();
        m4479U2();
        return super.mo4456z1(i, vVar, zVar);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        int f3496e = -1;

        /* renamed from: f */
        int f3497f = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public int mo4457e() {
            return this.f3496e;
        }

        /* renamed from: f */
        public int mo4458f() {
            return this.f3497f;
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

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo4444d3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo4444d3(i);
    }
}
