package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0191p;
import androidx.core.widget.C0554j;
import java.lang.reflect.Method;
import p082e.p083a.C3400a;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

public class ListPopupWindow implements C0191p {

    /* renamed from: L */
    private static Method f1013L;

    /* renamed from: M */
    private static Method f1014M;

    /* renamed from: N */
    private static Method f1015N;

    /* renamed from: A */
    private AdapterView.OnItemClickListener f1016A;

    /* renamed from: B */
    private AdapterView.OnItemSelectedListener f1017B;

    /* renamed from: C */
    final C0237f f1018C;

    /* renamed from: D */
    private final C0236e f1019D;

    /* renamed from: E */
    private final C0235d f1020E;

    /* renamed from: F */
    private final C0233b f1021F;

    /* renamed from: G */
    final Handler f1022G;

    /* renamed from: H */
    private final Rect f1023H;

    /* renamed from: I */
    private Rect f1024I;

    /* renamed from: J */
    private boolean f1025J;

    /* renamed from: K */
    PopupWindow f1026K;

    /* renamed from: g */
    private Context f1027g;

    /* renamed from: h */
    private ListAdapter f1028h;

    /* renamed from: i */
    C0304q f1029i;

    /* renamed from: j */
    private int f1030j;

    /* renamed from: k */
    private int f1031k;

    /* renamed from: l */
    private int f1032l;

    /* renamed from: m */
    private int f1033m;

    /* renamed from: n */
    private int f1034n;

    /* renamed from: o */
    private boolean f1035o;

    /* renamed from: p */
    private boolean f1036p;

    /* renamed from: q */
    private boolean f1037q;

    /* renamed from: r */
    private int f1038r;

    /* renamed from: s */
    private boolean f1039s;

    /* renamed from: t */
    private boolean f1040t;

    /* renamed from: u */
    int f1041u;

    /* renamed from: v */
    private View f1042v;

    /* renamed from: w */
    private int f1043w;

    /* renamed from: x */
    private DataSetObserver f1044x;

    /* renamed from: y */
    private View f1045y;

    /* renamed from: z */
    private Drawable f1046z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    class C0232a implements AdapterView.OnItemSelectedListener {
        C0232a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0304q qVar;
            if (i != -1 && (qVar = ListPopupWindow.this.f1029i) != null) {
                qVar.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    private class C0233b implements Runnable {
        C0233b() {
        }

        public void run() {
            ListPopupWindow.this.mo1633r();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    private class C0234c extends DataSetObserver {
        C0234c() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.mo839a()) {
                ListPopupWindow.this.mo840b();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    private class C0235d implements AbsListView.OnScrollListener {
        C0235d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo1612A() && ListPopupWindow.this.f1026K.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1022G.removeCallbacks(listPopupWindow.f1018C);
                ListPopupWindow.this.f1018C.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    private class C0236e implements View.OnTouchListener {
        C0236e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f1026K) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1026K.getWidth() && y >= 0 && y < ListPopupWindow.this.f1026K.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1022G.postDelayed(listPopupWindow.f1018C, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f1022G.removeCallbacks(listPopupWindow2.f1018C);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    private class C0237f implements Runnable {
        C0237f() {
        }

        public void run() {
            C0304q qVar = ListPopupWindow.this.f1029i;
            if (qVar != null && C3774v.m16180S(qVar) && ListPopupWindow.this.f1029i.getCount() > ListPopupWindow.this.f1029i.getChildCount()) {
                int childCount = ListPopupWindow.this.f1029i.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f1041u) {
                    listPopupWindow.f1026K.setInputMethodMode(2);
                    ListPopupWindow.this.mo840b();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1013L = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1015N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1014M = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, C3400a.listPopupWindowStyle);
    }

    /* renamed from: C */
    private void m1375C() {
        View view = this.f1042v;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1042v);
            }
        }
    }

    /* renamed from: N */
    private void m1376N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1013L;
            if (method != null) {
                try {
                    method.invoke(this.f1026K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1026K.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: androidx.appcompat.widget.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1377q() {
        /*
            r12 = this;
            androidx.appcompat.widget.q r0 = r12.f1029i
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b8
            android.content.Context r0 = r12.f1027g
            boolean r5 = r12.f1025J
            r5 = r5 ^ r3
            androidx.appcompat.widget.q r5 = r12.mo1634s(r0, r5)
            r12.f1029i = r5
            android.graphics.drawable.Drawable r6 = r12.f1046z
            if (r6 == 0) goto L_0x001b
            r5.setSelector(r6)
        L_0x001b:
            androidx.appcompat.widget.q r5 = r12.f1029i
            android.widget.ListAdapter r6 = r12.f1028h
            r5.setAdapter(r6)
            androidx.appcompat.widget.q r5 = r12.f1029i
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1016A
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.q r5 = r12.f1029i
            r5.setFocusable(r3)
            androidx.appcompat.widget.q r5 = r12.f1029i
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.q r5 = r12.f1029i
            androidx.appcompat.widget.ListPopupWindow$a r6 = new androidx.appcompat.widget.ListPopupWindow$a
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.q r5 = r12.f1029i
            androidx.appcompat.widget.ListPopupWindow$d r6 = r12.f1020E
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1017B
            if (r5 == 0) goto L_0x004d
            androidx.appcompat.widget.q r6 = r12.f1029i
            r6.setOnItemSelectedListener(r5)
        L_0x004d:
            androidx.appcompat.widget.q r5 = r12.f1029i
            android.view.View r6 = r12.f1042v
            if (r6 == 0) goto L_0x00b1
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1043w
            if (r8 == 0) goto L_0x0088
            if (r8 == r3) goto L_0x0081
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1043w
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x008e
        L_0x0081:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008e
        L_0x0088:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008e:
            int r0 = r12.f1031k
            if (r0 < 0) goto L_0x0095
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0097
        L_0x0095:
            r0 = 0
            r5 = 0
        L_0x0097:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            android.widget.PopupWindow r6 = r12.f1026K
            r6.setContentView(r5)
            goto L_0x00d6
        L_0x00b8:
            android.widget.PopupWindow r0 = r12.f1026K
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1042v
            if (r0 == 0) goto L_0x00d5
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            android.widget.PopupWindow r5 = r12.f1026K
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f2
            android.graphics.Rect r6 = r12.f1023H
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1023H
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1035o
            if (r7 != 0) goto L_0x00f8
            int r6 = -r6
            r12.f1033m = r6
            goto L_0x00f8
        L_0x00f2:
            android.graphics.Rect r5 = r12.f1023H
            r5.setEmpty()
            r5 = 0
        L_0x00f8:
            android.widget.PopupWindow r6 = r12.f1026K
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            android.view.View r4 = r12.mo1635t()
            int r6 = r12.f1033m
            int r3 = r12.m1378u(r4, r6, r3)
            boolean r4 = r12.f1039s
            if (r4 != 0) goto L_0x0174
            int r4 = r12.f1030j
            if (r4 != r2) goto L_0x0116
            goto L_0x0174
        L_0x0116:
            int r4 = r12.f1031k
            r6 = -2
            if (r4 == r6) goto L_0x013d
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0124
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0155
        L_0x0124:
            android.content.Context r2 = r12.f1027g
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1023H
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x0155
        L_0x013d:
            android.content.Context r2 = r12.f1027g
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1023H
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0155:
            r7 = r1
            androidx.appcompat.widget.q r6 = r12.f1029i
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2105d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0172
            androidx.appcompat.widget.q r2 = r12.f1029i
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.q r3 = r12.f1029i
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0172:
            int r1 = r1 + r0
            return r1
        L_0x0174:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.m1377q():int");
    }

    /* renamed from: u */
    private int m1378u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1026K.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1014M;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1026K, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1026K.getMaxAvailableHeight(view, i);
    }

    /* renamed from: A */
    public boolean mo1612A() {
        return this.f1026K.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean mo1613B() {
        return this.f1025J;
    }

    /* renamed from: D */
    public void mo1614D(View view) {
        this.f1045y = view;
    }

    /* renamed from: E */
    public void mo1615E(int i) {
        this.f1026K.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void mo1616F(int i) {
        Drawable background = this.f1026K.getBackground();
        if (background != null) {
            background.getPadding(this.f1023H);
            Rect rect = this.f1023H;
            this.f1031k = rect.left + rect.right + i;
            return;
        }
        mo1626Q(i);
    }

    /* renamed from: G */
    public void mo1617G(int i) {
        this.f1038r = i;
    }

    /* renamed from: H */
    public void mo1618H(Rect rect) {
        this.f1024I = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void mo1619I(int i) {
        this.f1026K.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void mo1620J(boolean z) {
        this.f1025J = z;
        this.f1026K.setFocusable(z);
    }

    /* renamed from: K */
    public void mo1621K(PopupWindow.OnDismissListener onDismissListener) {
        this.f1026K.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void mo1622L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1016A = onItemClickListener;
    }

    /* renamed from: M */
    public void mo1623M(boolean z) {
        this.f1037q = true;
        this.f1036p = z;
    }

    /* renamed from: O */
    public void mo1624O(int i) {
        this.f1043w = i;
    }

    /* renamed from: P */
    public void mo1625P(int i) {
        C0304q qVar = this.f1029i;
        if (mo839a() && qVar != null) {
            qVar.setListSelectionHidden(false);
            qVar.setSelection(i);
            if (qVar.getChoiceMode() != 0) {
                qVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: Q */
    public void mo1626Q(int i) {
        this.f1031k = i;
    }

    /* renamed from: a */
    public boolean mo839a() {
        return this.f1026K.isShowing();
    }

    /* renamed from: b */
    public void mo840b() {
        int q = m1377q();
        boolean A = mo1612A();
        C0554j.m3408b(this.f1026K, this.f1034n);
        boolean z = true;
        if (!this.f1026K.isShowing()) {
            int i = this.f1031k;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1635t().getWidth();
            }
            int i2 = this.f1030j;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f1026K.setWidth(i);
            this.f1026K.setHeight(q);
            m1376N(true);
            this.f1026K.setOutsideTouchable(!this.f1040t && !this.f1039s);
            this.f1026K.setTouchInterceptor(this.f1019D);
            if (this.f1037q) {
                C0554j.m3407a(this.f1026K, this.f1036p);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1015N;
                if (method != null) {
                    try {
                        method.invoke(this.f1026K, new Object[]{this.f1024I});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1026K.setEpicenterBounds(this.f1024I);
            }
            C0554j.m3409c(this.f1026K, mo1635t(), this.f1032l, this.f1033m, this.f1038r);
            this.f1029i.setSelection(-1);
            if (!this.f1025J || this.f1029i.isInTouchMode()) {
                mo1633r();
            }
            if (!this.f1025J) {
                this.f1022G.post(this.f1021F);
            }
        } else if (C3774v.m16180S(mo1635t())) {
            int i3 = this.f1031k;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1635t().getWidth();
            }
            int i4 = this.f1030j;
            if (i4 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    this.f1026K.setWidth(this.f1031k == -1 ? -1 : 0);
                    this.f1026K.setHeight(0);
                } else {
                    this.f1026K.setWidth(this.f1031k == -1 ? -1 : 0);
                    this.f1026K.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f1026K;
            if (this.f1040t || this.f1039s) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1026K.update(mo1635t(), this.f1032l, this.f1033m, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: c */
    public void mo1627c(Drawable drawable) {
        this.f1026K.setBackgroundDrawable(drawable);
    }

    /* renamed from: d */
    public int mo1628d() {
        return this.f1032l;
    }

    public void dismiss() {
        this.f1026K.dismiss();
        m1375C();
        this.f1026K.setContentView((View) null);
        this.f1029i = null;
        this.f1022G.removeCallbacks(this.f1018C);
    }

    /* renamed from: f */
    public void mo1629f(int i) {
        this.f1032l = i;
    }

    /* renamed from: i */
    public Drawable mo1630i() {
        return this.f1026K.getBackground();
    }

    /* renamed from: j */
    public ListView mo845j() {
        return this.f1029i;
    }

    /* renamed from: l */
    public void mo1631l(int i) {
        this.f1033m = i;
        this.f1035o = true;
    }

    /* renamed from: o */
    public int mo1632o() {
        if (!this.f1035o) {
            return 0;
        }
        return this.f1033m;
    }

    /* renamed from: p */
    public void mo1496p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1044x;
        if (dataSetObserver == null) {
            this.f1044x = new C0234c();
        } else {
            ListAdapter listAdapter2 = this.f1028h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1028h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1044x);
        }
        C0304q qVar = this.f1029i;
        if (qVar != null) {
            qVar.setAdapter(this.f1028h);
        }
    }

    /* renamed from: r */
    public void mo1633r() {
        C0304q qVar = this.f1029i;
        if (qVar != null) {
            qVar.setListSelectionHidden(true);
            qVar.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0304q mo1634s(Context context, boolean z) {
        return new C0304q(context, z);
    }

    /* renamed from: t */
    public View mo1635t() {
        return this.f1045y;
    }

    /* renamed from: v */
    public Object mo1636v() {
        if (!mo839a()) {
            return null;
        }
        return this.f1029i.getSelectedItem();
    }

    /* renamed from: w */
    public long mo1637w() {
        if (!mo839a()) {
            return Long.MIN_VALUE;
        }
        return this.f1029i.getSelectedItemId();
    }

    /* renamed from: x */
    public int mo1638x() {
        if (!mo839a()) {
            return -1;
        }
        return this.f1029i.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View mo1639y() {
        if (!mo839a()) {
            return null;
        }
        return this.f1029i.getSelectedView();
    }

    /* renamed from: z */
    public int mo1640z() {
        return this.f1031k;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1030j = -2;
        this.f1031k = -2;
        this.f1034n = 1002;
        this.f1038r = 0;
        this.f1039s = false;
        this.f1040t = false;
        this.f1041u = Integer.MAX_VALUE;
        this.f1043w = 0;
        this.f1018C = new C0237f();
        this.f1019D = new C0236e();
        this.f1020E = new C0235d();
        this.f1021F = new C0233b();
        this.f1023H = new Rect();
        this.f1027g = context;
        this.f1022G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.ListPopupWindow, i, i2);
        this.f1032l = obtainStyledAttributes.getDimensionPixelOffset(C3409j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C3409j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1033m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1035o = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f1026K = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
