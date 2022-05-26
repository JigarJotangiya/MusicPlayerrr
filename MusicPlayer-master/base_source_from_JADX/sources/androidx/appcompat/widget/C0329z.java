package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import p082e.p083a.C3400a;
import p082e.p083a.p090o.C3431a;

/* renamed from: androidx.appcompat.widget.z */
/* compiled from: ScrollingTabContainerView */
public class C0329z extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: g */
    Runnable f1451g;

    /* renamed from: h */
    private C0332c f1452h;

    /* renamed from: i */
    LinearLayoutCompat f1453i;

    /* renamed from: j */
    private Spinner f1454j;

    /* renamed from: k */
    private boolean f1455k;

    /* renamed from: l */
    int f1456l;

    /* renamed from: m */
    int f1457m;

    /* renamed from: n */
    private int f1458n;

    /* renamed from: o */
    private int f1459o;

    /* renamed from: p */
    protected ViewPropertyAnimator f1460p;

    /* renamed from: androidx.appcompat.widget.z$a */
    /* compiled from: ScrollingTabContainerView */
    class C0330a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f1461g;

        C0330a(View view) {
            this.f1461g = view;
        }

        public void run() {
            C0329z.this.smoothScrollTo(this.f1461g.getLeft() - ((C0329z.this.getWidth() - this.f1461g.getWidth()) / 2), 0);
            C0329z.this.f1451g = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0331b extends BaseAdapter {
        C0331b() {
        }

        public int getCount() {
            return C0329z.this.f1453i.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0333d) C0329z.this.f1453i.getChildAt(i)).mo2226b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0329z.this.mo2209d((ActionBar.C0087b) getItem(i), true);
            }
            ((C0333d) view).mo2225a((ActionBar.C0087b) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.z$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0332c implements View.OnClickListener {
        C0332c() {
        }

        public void onClick(View view) {
            ((C0333d) view).mo2226b().mo433e();
            int childCount = C0329z.this.f1453i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0329z.this.f1453i.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0333d extends LinearLayout {

        /* renamed from: g */
        private final int[] f1465g;

        /* renamed from: h */
        private ActionBar.C0087b f1466h;

        /* renamed from: i */
        private TextView f1467i;

        /* renamed from: j */
        private ImageView f1468j;

        /* renamed from: k */
        private View f1469k;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0333d(android.content.Context r6, androidx.appcompat.app.ActionBar.C0087b r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0329z.this = r5
                int r5 = p082e.p083a.C3400a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1465g = r1
                r4.f1466h = r7
                androidx.appcompat.widget.g0 r5 = androidx.appcompat.widget.C0279g0.m1627v(r6, r0, r1, r5, r3)
                boolean r6 = r5.mo1994s(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.mo1982g(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.mo1995w()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.mo2227c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0329z.C0333d.<init>(androidx.appcompat.widget.z, android.content.Context, androidx.appcompat.app.ActionBar$b, boolean):void");
        }

        /* renamed from: a */
        public void mo2225a(ActionBar.C0087b bVar) {
            this.f1466h = bVar;
            mo2227c();
        }

        /* renamed from: b */
        public ActionBar.C0087b mo2226b() {
            return this.f1466h;
        }

        /* renamed from: c */
        public void mo2227c() {
            ActionBar.C0087b bVar = this.f1466h;
            View b = bVar.mo430b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1469k = b;
                TextView textView = this.f1467i;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1468j;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1468j.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f1469k;
            if (view != null) {
                removeView(view);
                this.f1469k = null;
            }
            Drawable c = bVar.mo431c();
            CharSequence d = bVar.mo432d();
            if (c != null) {
                if (this.f1468j == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1468j = appCompatImageView;
                }
                this.f1468j.setImageDrawable(c);
                this.f1468j.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1468j;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1468j.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1467i == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C3400a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1467i = appCompatTextView;
                }
                this.f1467i.setText(d);
                this.f1467i.setVisibility(0);
            } else {
                TextView textView2 = this.f1467i;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1467i.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1468j;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.mo429a());
            }
            if (!z) {
                charSequence = bVar.mo429a();
            }
            C0285i0.m1700a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (C0329z.this.f1456l > 0 && getMeasuredWidth() > (i3 = C0329z.this.f1456l)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$e */
    /* compiled from: ScrollingTabContainerView */
    protected class C0334e extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f1471a = false;

        /* renamed from: b */
        private int f1472b;

        protected C0334e() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f1471a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1471a) {
                C0329z zVar = C0329z.this;
                zVar.f1460p = null;
                zVar.setVisibility(this.f1472b);
            }
        }

        public void onAnimationStart(Animator animator) {
            C0329z.this.setVisibility(0);
            this.f1471a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public C0329z(Context context) {
        super(context);
        new C0334e();
        setHorizontalScrollBarEnabled(false);
        C3431a b = C3431a.m14635b(context);
        setContentHeight(b.mo12162f());
        this.f1457m = b.mo12161e();
        LinearLayoutCompat c = m1919c();
        this.f1453i = c;
        addView(c, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: b */
    private Spinner m1918b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C3400a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    private LinearLayoutCompat m1919c() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, C3400a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: e */
    private boolean m1920e() {
        Spinner spinner = this.f1454j;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: f */
    private void m1921f() {
        if (!m1920e()) {
            if (this.f1454j == null) {
                this.f1454j = m1918b();
            }
            removeView(this.f1453i);
            addView(this.f1454j, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1454j.getAdapter() == null) {
                this.f1454j.setAdapter(new C0331b());
            }
            Runnable runnable = this.f1451g;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1451g = null;
            }
            this.f1454j.setSelection(this.f1459o);
        }
    }

    /* renamed from: g */
    private boolean m1922g() {
        if (!m1920e()) {
            return false;
        }
        removeView(this.f1454j);
        addView(this.f1453i, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1454j.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2208a(int i) {
        View childAt = this.f1453i.getChildAt(i);
        Runnable runnable = this.f1451g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0330a aVar = new C0330a(childAt);
        this.f1451g = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0333d mo2209d(ActionBar.C0087b bVar, boolean z) {
        C0333d dVar = new C0333d(getContext(), bVar, z);
        if (z) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1458n));
        } else {
            dVar.setFocusable(true);
            if (this.f1452h == null) {
                this.f1452h = new C0332c();
            }
            dVar.setOnClickListener(this.f1452h);
        }
        return dVar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1451g;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3431a b = C3431a.m14635b(getContext());
        setContentHeight(b.mo12162f());
        this.f1457m = b.mo12161e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1451g;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0333d) view).mo2226b().mo433e();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1453i.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1456l = -1;
        } else {
            if (childCount > 2) {
                this.f1456l = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1456l = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1456l = Math.min(this.f1456l, this.f1457m);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1458n, 1073741824);
        if (z2 || !this.f1455k) {
            z = false;
        }
        if (z) {
            this.f1453i.measure(0, makeMeasureSpec);
            if (this.f1453i.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m1921f();
            } else {
                m1922g();
            }
        } else {
            m1922g();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1459o);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1455k = z;
    }

    public void setContentHeight(int i) {
        this.f1458n = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1459o = i;
        int childCount = this.f1453i.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1453i.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2208a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1454j;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
