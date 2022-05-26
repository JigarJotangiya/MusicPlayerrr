package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3535i;
import p082e.p099f.p100a.p104m.C3536j;

public abstract class ConstraintHelper extends View {

    /* renamed from: g */
    protected int[] f2155g = new int[32];

    /* renamed from: h */
    protected int f2156h;

    /* renamed from: i */
    protected Context f2157i;

    /* renamed from: j */
    protected C3535i f2158j;

    /* renamed from: k */
    protected boolean f2159k = false;

    /* renamed from: l */
    protected String f2160l;

    /* renamed from: m */
    protected String f2161m;

    /* renamed from: n */
    private View[] f2162n = null;

    /* renamed from: o */
    protected HashMap<Integer, String> f2163o = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f2157i = context;
        mo2380o((AttributeSet) null);
    }

    /* renamed from: e */
    private void m2672e(String str) {
        if (str != null && str.length() != 0 && this.f2157i != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int m = m2677m(trim);
            if (m != 0) {
                this.f2163o.put(Integer.valueOf(m), trim);
                m2673f(m);
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(trim).length() + 23);
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
            Log.w("ConstraintHelper", sb.toString());
        }
    }

    /* renamed from: f */
    private void m2673f(int i) {
        if (i != getId()) {
            int i2 = this.f2156h + 1;
            int[] iArr = this.f2155g;
            if (i2 > iArr.length) {
                this.f2155g = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2155g;
            int i3 = this.f2156h;
            iArr2[i3] = i;
            this.f2156h = i3 + 1;
        }
    }

    /* renamed from: g */
    private void m2674g(String str) {
        if (str != null && str.length() != 0 && this.f2157i != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).f2209Z)) {
                    if (childAt.getId() == -1) {
                        String simpleName = childAt.getClass().getSimpleName();
                        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 42);
                        sb.append("to use ConstraintTag view ");
                        sb.append(simpleName);
                        sb.append(" must have an ID");
                        Log.w("ConstraintHelper", sb.toString());
                    } else {
                        m2673f(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private int[] m2675k(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String trim : split) {
            int m = m2677m(trim.trim());
            if (m != 0) {
                iArr[i] = m;
                i++;
            }
        }
        return i != split.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    /* renamed from: l */
    private int m2676l(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2157i.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: m */
    private int m2677m(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g = constraintLayout.mo2864g(0, str);
            if (g instanceof Integer) {
                i = ((Integer) g).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m2676l(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0438e.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f2157i.getResources().getIdentifier(str, "id", this.f2157i.getPackageName()) : i;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2155g, this.f2156h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo2848h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo2849i((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2849i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f2156h; i++) {
            View i2 = constraintLayout.mo2873i(this.f2155g[i]);
            if (i2 != null) {
                i2.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    i2.setTranslationZ(i2.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo2411j(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public View[] mo2850n(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2162n;
        if (viewArr == null || viewArr.length != this.f2156h) {
            this.f2162n = new View[this.f2156h];
        }
        for (int i = 0; i < this.f2156h; i++) {
            this.f2162n[i] = constraintLayout.mo2873i(this.f2155g[i]);
        }
        return this.f2162n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo2380o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2160l = string;
                    setIds(string);
                } else if (index == C0439f.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2161m = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2160l;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2161m;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2159k) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo2384p(C0430c.C0431a aVar, C3536j jVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C3527e> sparseArray) {
        C0430c.C0433b bVar = aVar.f2329e;
        int[] iArr = bVar.f2389i0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f2391j0;
            if (str != null) {
                if (str.length() > 0) {
                    C0430c.C0433b bVar2 = aVar.f2329e;
                    bVar2.f2389i0 = m2675k(this, bVar2.f2391j0);
                } else {
                    aVar.f2329e.f2389i0 = null;
                }
            }
        }
        if (jVar != null) {
            jVar.mo12787a();
            if (aVar.f2329e.f2389i0 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = aVar.f2329e.f2389i0;
                    if (i < iArr2.length) {
                        C3527e eVar = sparseArray.get(iArr2[i]);
                        if (eVar != null) {
                            jVar.mo12788b(eVar);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo2385q(C3527e eVar, boolean z) {
    }

    /* renamed from: r */
    public void mo2412r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public void mo2852s(ConstraintLayout constraintLayout) {
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f2160l = str;
        if (str != null) {
            int i = 0;
            this.f2156h = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2672e(str.substring(i));
                    return;
                } else {
                    m2672e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f2161m = str;
        if (str != null) {
            int i = 0;
            this.f2156h = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2674g(str.substring(i));
                    return;
                } else {
                    m2674g(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2160l = null;
        this.f2156h = 0;
        for (int f : iArr) {
            m2673f(f);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2160l == null) {
            m2673f(i);
        }
    }

    /* renamed from: t */
    public void mo2422t(ConstraintLayout constraintLayout) {
    }

    /* renamed from: u */
    public void mo2426u(C3530f fVar, C3535i iVar, SparseArray<C3527e> sparseArray) {
        iVar.mo12787a();
        for (int i = 0; i < this.f2156h; i++) {
            iVar.mo12788b(sparseArray.get(this.f2155g[i]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f2163o.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2857v(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f2160l
            r5.setIds(r0)
        L_0x000b:
            e.f.a.m.i r0 = r5.f2158j
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo12787a()
            r0 = 0
        L_0x0014:
            int r1 = r5.f2156h
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f2155g
            r1 = r1[r0]
            android.view.View r2 = r6.mo2873i(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f2163o
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.m2676l(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f2155g
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f2163o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.mo2873i(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            e.f.a.m.i r1 = r5.f2158j
            e.f.a.m.e r2 = r6.mo2874p(r2)
            r1.mo12788b(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            e.f.a.m.i r0 = r5.f2158j
            e.f.a.m.f r6 = r6.f2167i
            r0.mo12789c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.mo2857v(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: w */
    public void mo2858w() {
        if (this.f2158j != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2247s0 = (C3527e) this.f2158j;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2157i = context;
        mo2380o(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2157i = context;
        mo2380o(attributeSet);
    }
}
