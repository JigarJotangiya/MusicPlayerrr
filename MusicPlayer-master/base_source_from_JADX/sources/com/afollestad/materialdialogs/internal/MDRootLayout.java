package com.afollestad.materialdialogs.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p159f.p160a.p161a.C4267e;
import p159f.p160a.p161a.C4284g;
import p159f.p160a.p161a.C4286i;
import p159f.p160a.p161a.C4288k;
import p159f.p160a.p161a.C4291n;
import p159f.p160a.p161a.C4292o;
import p159f.p160a.p161a.p163r.C4297a;

public class MDRootLayout extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final MDButton[] f5492g = new MDButton[3];

    /* renamed from: h */
    private int f5493h;

    /* renamed from: i */
    private View f5494i;

    /* renamed from: j */
    private View f5495j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5496k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5497l = false;

    /* renamed from: m */
    private C4292o f5498m = C4292o.ADAPTIVE;

    /* renamed from: n */
    private boolean f5499n = false;

    /* renamed from: o */
    private boolean f5500o = true;

    /* renamed from: p */
    private boolean f5501p;

    /* renamed from: q */
    private boolean f5502q;

    /* renamed from: r */
    private int f5503r;

    /* renamed from: s */
    private int f5504s;

    /* renamed from: t */
    private int f5505t;

    /* renamed from: u */
    private C4267e f5506u = C4267e.START;

    /* renamed from: v */
    private int f5507v;

    /* renamed from: w */
    private Paint f5508w;

    /* renamed from: x */
    private ViewTreeObserver.OnScrollChangedListener f5509x;

    /* renamed from: y */
    private ViewTreeObserver.OnScrollChangedListener f5510y;

    /* renamed from: z */
    private int f5511z;

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$a */
    class C1429a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: g */
        final /* synthetic */ View f5512g;

        /* renamed from: h */
        final /* synthetic */ boolean f5513h;

        /* renamed from: i */
        final /* synthetic */ boolean f5514i;

        C1429a(View view, boolean z, boolean z2) {
            this.f5512g = view;
            this.f5513h = z;
            this.f5514i = z2;
        }

        public boolean onPreDraw() {
            if (this.f5512g.getMeasuredHeight() == 0) {
                return true;
            }
            if (!MDRootLayout.m7521l((WebView) this.f5512g)) {
                if (this.f5513h) {
                    boolean unused = MDRootLayout.this.f5496k = false;
                }
                if (this.f5514i) {
                    boolean unused2 = MDRootLayout.this.f5497l = false;
                }
            } else {
                MDRootLayout.this.m7517h((ViewGroup) this.f5512g, this.f5513h, this.f5514i);
            }
            this.f5512g.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$b */
    class C1430b extends RecyclerView.C0817t {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5516a;

        /* renamed from: b */
        final /* synthetic */ boolean f5517b;

        /* renamed from: c */
        final /* synthetic */ boolean f5518c;

        C1430b(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f5516a = viewGroup;
            this.f5517b = z;
            this.f5518c = z2;
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            super.mo4985b(recyclerView, i, i2);
            MDButton[] e = MDRootLayout.this.f5492g;
            int length = e.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    MDButton mDButton = e[i3];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m7525p(this.f5516a, this.f5517b, this.f5518c, z);
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$c */
    class C1431c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: g */
        final /* synthetic */ ViewGroup f5520g;

        /* renamed from: h */
        final /* synthetic */ boolean f5521h;

        /* renamed from: i */
        final /* synthetic */ boolean f5522i;

        C1431c(ViewGroup viewGroup, boolean z, boolean z2) {
            this.f5520g = viewGroup;
            this.f5521h = z;
            this.f5522i = z2;
        }

        public void onScrollChanged() {
            MDButton[] e = MDRootLayout.this.f5492g;
            int length = e.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    MDButton mDButton = e[i];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f5520g;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m7526q((WebView) viewGroup, this.f5521h, this.f5522i, z);
            } else {
                MDRootLayout.this.m7525p(viewGroup, this.f5521h, this.f5522i, z);
            }
            MDRootLayout.this.invalidate();
        }
    }

    /* renamed from: com.afollestad.materialdialogs.internal.MDRootLayout$d */
    static /* synthetic */ class C1432d {

        /* renamed from: a */
        static final /* synthetic */ int[] f5524a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                f.a.a.e[] r0 = p159f.p160a.p161a.C4267e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5524a = r0
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5524a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.e r1 = p159f.p160a.p161a.C4267e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.C1432d.<clinit>():void");
        }
    }

    public MDRootLayout(Context context) {
        super(context);
        m7524o(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m7517h(ViewGroup viewGroup, boolean z, boolean z2) {
        if ((!z2 && this.f5509x == null) || (z2 && this.f5510y == null)) {
            if (viewGroup instanceof RecyclerView) {
                C1430b bVar = new C1430b(viewGroup, z, z2);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.mo4634l(bVar);
                bVar.mo4985b(recyclerView, 0, 0);
                return;
            }
            C1431c cVar = new C1431c(viewGroup, z, z2);
            if (!z2) {
                this.f5509x = cVar;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f5509x);
            } else {
                this.f5510y = cVar;
                viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f5510y);
            }
            cVar.onScrollChanged();
        }
    }

    /* renamed from: i */
    private static boolean m7518i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        boolean z = adapterView.getFirstVisiblePosition() == 0;
        boolean z2 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
        if (!z || !z2 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m7519j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().mo4496m()) ? false : true;
    }

    /* renamed from: k */
    private static boolean m7520k(ScrollView scrollView) {
        if (scrollView.getChildCount() != 0 && (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m7521l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: m */
    private static View m7522m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    private static View m7523n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: o */
    private void m7524o(Context context, AttributeSet attributeSet, int i) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4291n.MDRootLayout, i, 0);
        this.f5501p = obtainStyledAttributes.getBoolean(C4291n.MDRootLayout_md_reduce_padding_no_title_no_buttons, true);
        obtainStyledAttributes.recycle();
        this.f5503r = resources.getDimensionPixelSize(C4286i.md_notitle_vertical_padding);
        this.f5504s = resources.getDimensionPixelSize(C4286i.md_button_frame_vertical_padding);
        this.f5507v = resources.getDimensionPixelSize(C4286i.md_button_padding_frame_side);
        this.f5505t = resources.getDimensionPixelSize(C4286i.md_button_height);
        this.f5508w = new Paint();
        this.f5511z = resources.getDimensionPixelSize(C4286i.md_divider_height);
        this.f5508w.setColor(C4297a.m18798l(context, C4284g.md_divider_color));
        setWillNotDraw(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m7525p(ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z && viewGroup.getChildCount() > 0) {
            View view = this.f5494i;
            this.f5496k = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (z2 && viewGroup.getChildCount() > 0) {
            if (!z3 || (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() >= viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom()) {
                z4 = false;
            }
            this.f5497l = z4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m7526q(WebView webView, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        if (z) {
            View view = this.f5494i;
            this.f5496k = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z2) {
            if (!z3 || ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) >= ((float) webView.getContentHeight()) * webView.getScale()) {
                z4 = false;
            }
            this.f5497l = z4;
        }
    }

    /* renamed from: r */
    private void m7527r() {
        if (Build.VERSION.SDK_INT >= 17 && getResources().getConfiguration().getLayoutDirection() == 1) {
            int i = C1432d.f5524a[this.f5506u.ordinal()];
            if (i == 1) {
                this.f5506u = C4267e.END;
            } else if (i == 2) {
                this.f5506u = C4267e.START;
            }
        }
    }

    /* renamed from: s */
    private static boolean m7528s(View view) {
        boolean z = true;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!z2 || !(view instanceof MDButton)) {
            return z2;
        }
        if (((MDButton) view).getText().toString().trim().length() <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: u */
    private void m7529u(View view, boolean z, boolean z2) {
        if (view != null) {
            if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (m7520k(scrollView)) {
                    m7517h(scrollView, z, z2);
                    return;
                }
                if (z) {
                    this.f5496k = false;
                }
                if (z2) {
                    this.f5497l = false;
                }
            } else if (view instanceof AdapterView) {
                AdapterView adapterView = (AdapterView) view;
                if (m7518i(adapterView)) {
                    m7517h(adapterView, z, z2);
                    return;
                }
                if (z) {
                    this.f5496k = false;
                }
                if (z2) {
                    this.f5497l = false;
                }
            } else if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new C1429a(view, z, z2));
            } else if (view instanceof RecyclerView) {
                boolean j = m7519j((RecyclerView) view);
                if (z) {
                    this.f5496k = j;
                }
                if (z2) {
                    this.f5497l = j;
                }
                if (j) {
                    m7517h((ViewGroup) view, z, z2);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                View n = m7523n(viewGroup);
                m7529u(n, z, z2);
                View m = m7522m(viewGroup);
                if (m != n) {
                    m7529u(m, false, true);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f5495j;
        if (view != null) {
            if (this.f5496k) {
                int top = view.getTop();
                canvas.drawRect(0.0f, (float) (top - this.f5511z), (float) getMeasuredWidth(), (float) top, this.f5508w);
            }
            if (this.f5497l) {
                int bottom = this.f5495j.getBottom();
                canvas.drawRect(0.0f, (float) bottom, (float) getMeasuredWidth(), (float) (bottom + this.f5511z), this.f5508w);
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() == C4288k.md_titleFrame) {
                this.f5494i = childAt;
            } else if (childAt.getId() == C4288k.md_buttonDefaultNeutral) {
                this.f5492g[0] = (MDButton) childAt;
            } else if (childAt.getId() == C4288k.md_buttonDefaultNegative) {
                this.f5492g[1] = (MDButton) childAt;
            } else if (childAt.getId() == C4288k.md_buttonDefaultPositive) {
                this.f5492g[2] = (MDButton) childAt;
            } else {
                this.f5495j = childAt;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (m7528s(this.f5494i)) {
            int measuredHeight = this.f5494i.getMeasuredHeight() + i2;
            this.f5494i.layout(i, i2, i3, measuredHeight);
            i2 = measuredHeight;
        } else if (!this.f5502q && this.f5500o) {
            i2 += this.f5503r;
        }
        if (m7528s(this.f5495j)) {
            View view = this.f5495j;
            view.layout(i, i2, i3, view.getMeasuredHeight() + i2);
        }
        if (this.f5499n) {
            int i14 = i4 - this.f5504s;
            for (MDButton mDButton : this.f5492g) {
                if (m7528s(mDButton)) {
                    mDButton.layout(i, i14 - mDButton.getMeasuredHeight(), i3, i14);
                    i14 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f5500o) {
                i4 -= this.f5504s;
            }
            int i15 = i4 - this.f5505t;
            int i16 = this.f5507v;
            if (m7528s(this.f5492g[2])) {
                if (this.f5506u == C4267e.END) {
                    i13 = i + i16;
                    i12 = this.f5492g[2].getMeasuredWidth() + i13;
                    i5 = -1;
                } else {
                    int i17 = i3 - i16;
                    i13 = i17 - this.f5492g[2].getMeasuredWidth();
                    i12 = i17;
                    i5 = i13;
                }
                this.f5492g[2].layout(i13, i15, i12, i4);
                i16 += this.f5492g[2].getMeasuredWidth();
            } else {
                i5 = -1;
            }
            if (m7528s(this.f5492g[1])) {
                C4267e eVar = this.f5506u;
                if (eVar == C4267e.END) {
                    i11 = i16 + i;
                    i10 = this.f5492g[1].getMeasuredWidth() + i11;
                } else if (eVar == C4267e.START) {
                    i10 = i3 - i16;
                    i11 = i10 - this.f5492g[1].getMeasuredWidth();
                } else {
                    i11 = this.f5507v + i;
                    i10 = this.f5492g[1].getMeasuredWidth() + i11;
                    i6 = i10;
                    this.f5492g[1].layout(i11, i15, i10, i4);
                }
                i6 = -1;
                this.f5492g[1].layout(i11, i15, i10, i4);
            } else {
                i6 = -1;
            }
            if (m7528s(this.f5492g[0])) {
                C4267e eVar2 = this.f5506u;
                if (eVar2 == C4267e.END) {
                    i7 = i3 - this.f5507v;
                    i8 = i7 - this.f5492g[0].getMeasuredWidth();
                } else if (eVar2 == C4267e.START) {
                    i8 = i + this.f5507v;
                    i7 = this.f5492g[0].getMeasuredWidth() + i8;
                } else {
                    if (i6 != -1 || i5 == -1) {
                        if (i5 == -1 && i6 != -1) {
                            i9 = this.f5492g[0].getMeasuredWidth();
                        } else if (i5 == -1) {
                            i6 = ((i3 - i) / 2) - (this.f5492g[0].getMeasuredWidth() / 2);
                            i9 = this.f5492g[0].getMeasuredWidth();
                        }
                        i5 = i6 + i9;
                    } else {
                        i6 = i5 - this.f5492g[0].getMeasuredWidth();
                    }
                    i7 = i5;
                    i8 = i6;
                }
                this.f5492g[0].layout(i8, i15, i7, i4);
            }
        }
        m7529u(this.f5495j, true, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r2 = r11.f5493h
            if (r1 <= r2) goto L_0x000d
            r1 = r2
        L_0x000d:
            r2 = 1
            r11.f5500o = r2
            f.a.a.o r3 = r11.f5498m
            f.a.a.o r4 = p159f.p160a.p161a.C4292o.ALWAYS
            r5 = 0
            if (r3 != r4) goto L_0x001a
            r3 = 1
        L_0x0018:
            r8 = 0
            goto L_0x0058
        L_0x001a:
            f.a.a.o r4 = p159f.p160a.p161a.C4292o.NEVER
            if (r3 != r4) goto L_0x0020
            r3 = 0
            goto L_0x0018
        L_0x0020:
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f5492g
            int r4 = r3.length
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0026:
            if (r6 >= r4) goto L_0x0041
            r9 = r3[r6]
            if (r9 == 0) goto L_0x003e
            boolean r10 = m7528s(r9)
            if (r10 == 0) goto L_0x003e
            r9.mo6849b(r5, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredWidth()
            int r7 = r7 + r8
            r8 = 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0041:
            android.content.Context r3 = r11.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = p159f.p160a.p161a.C4286i.md_neutral_button_margin
            int r3 = r3.getDimensionPixelSize(r4)
            int r3 = r3 * 2
            int r3 = r0 - r3
            if (r7 <= r3) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            r11.f5499n = r3
            if (r3 == 0) goto L_0x007c
            com.afollestad.materialdialogs.internal.MDButton[] r3 = r11.f5492g
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x0061:
            if (r6 >= r4) goto L_0x007d
            r9 = r3[r6]
            if (r9 == 0) goto L_0x0079
            boolean r10 = m7528s(r9)
            if (r10 == 0) goto L_0x0079
            r9.mo6849b(r2, r5)
            r11.measureChild(r9, r12, r13)
            int r8 = r9.getMeasuredHeight()
            int r7 = r7 + r8
            r8 = 1
        L_0x0079:
            int r6 = r6 + 1
            goto L_0x0061
        L_0x007c:
            r7 = 0
        L_0x007d:
            if (r8 == 0) goto L_0x0099
            boolean r12 = r11.f5499n
            if (r12 == 0) goto L_0x008e
            int r12 = r1 - r7
            int r13 = r11.f5504s
            int r3 = r13 * 2
            int r3 = r3 + r5
            int r13 = r13 * 2
            int r13 = r13 + r5
            goto L_0x00a1
        L_0x008e:
            int r12 = r11.f5505t
            int r12 = r1 - r12
            int r13 = r11.f5504s
            int r13 = r13 * 2
            int r3 = r13 + 0
            goto L_0x00a0
        L_0x0099:
            int r12 = r11.f5504s
            int r12 = r12 * 2
            int r3 = r12 + 0
            r12 = r1
        L_0x00a0:
            r13 = 0
        L_0x00a1:
            android.view.View r4 = r11.f5494i
            boolean r4 = m7528s(r4)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x00bc
            android.view.View r4 = r11.f5494i
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r4.measure(r7, r5)
            android.view.View r4 = r11.f5494i
            int r4 = r4.getMeasuredHeight()
            int r12 = r12 - r4
            goto L_0x00c3
        L_0x00bc:
            boolean r4 = r11.f5502q
            if (r4 != 0) goto L_0x00c3
            int r4 = r11.f5503r
            int r3 = r3 + r4
        L_0x00c3:
            android.view.View r4 = r11.f5495j
            boolean r4 = m7528s(r4)
            if (r4 == 0) goto L_0x0110
            android.view.View r4 = r11.f5495j
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r7 = r12 - r13
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r4.measure(r6, r7)
            android.view.View r4 = r11.f5495j
            int r4 = r4.getMeasuredHeight()
            int r6 = r12 - r3
            if (r4 > r6) goto L_0x010d
            boolean r4 = r11.f5501p
            if (r4 == 0) goto L_0x0101
            android.view.View r4 = r11.f5494i
            boolean r4 = m7528s(r4)
            if (r4 != 0) goto L_0x0101
            if (r8 == 0) goto L_0x00f5
            goto L_0x0101
        L_0x00f5:
            r11.f5500o = r5
            android.view.View r2 = r11.f5495j
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r13
            int r5 = r12 - r2
            goto L_0x0111
        L_0x0101:
            r11.f5500o = r2
            android.view.View r13 = r11.f5495j
            int r13 = r13.getMeasuredHeight()
            int r13 = r13 + r3
            int r5 = r12 - r13
            goto L_0x0111
        L_0x010d:
            r11.f5500o = r5
            goto L_0x0111
        L_0x0110:
            r5 = r12
        L_0x0111:
            int r1 = r1 - r5
            r11.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(C4267e eVar) {
        this.f5506u = eVar;
        m7527r();
    }

    public void setButtonStackedGravity(C4267e eVar) {
        for (MDButton mDButton : this.f5492g) {
            if (mDButton != null) {
                mDButton.setStackedGravity(eVar);
            }
        }
    }

    public void setDividerColor(int i) {
        this.f5508w.setColor(i);
        invalidate();
    }

    public void setMaxHeight(int i) {
        this.f5493h = i;
    }

    public void setStackingBehavior(C4292o oVar) {
        this.f5498m = oVar;
        invalidate();
    }

    /* renamed from: t */
    public void mo6863t() {
        this.f5502q = true;
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7524o(context, attributeSet, 0);
    }

    @TargetApi(11)
    public MDRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7524o(context, attributeSet, i);
    }
}
