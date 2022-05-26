package com.coocent.sleeptimer.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.C0506a;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p218l.C4601a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class WheelView extends ScrollView {

    /* renamed from: g */
    private int f8887g;

    /* renamed from: h */
    private int f8888h;

    /* renamed from: i */
    private int f8889i;

    /* renamed from: j */
    private int f8890j;

    /* renamed from: k */
    private Context f8891k;

    /* renamed from: l */
    private LinearLayout f8892l;

    /* renamed from: m */
    private List<String> f8893m;

    /* renamed from: n */
    private List<String> f8894n;

    /* renamed from: o */
    int f8895o;

    /* renamed from: p */
    int f8896p;

    /* renamed from: q */
    int f8897q;

    /* renamed from: r */
    int f8898r;

    /* renamed from: s */
    Runnable f8899s;

    /* renamed from: t */
    int f8900t;

    /* renamed from: u */
    int f8901u;

    /* renamed from: v */
    int f8902v;

    /* renamed from: w */
    int f8903w;

    /* renamed from: x */
    private C2519c f8904x;

    /* renamed from: com.coocent.sleeptimer.view.WheelView$a */
    class C2515a implements Runnable {

        /* renamed from: com.coocent.sleeptimer.view.WheelView$a$a */
        class C2516a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f8906g;

            /* renamed from: h */
            final /* synthetic */ int f8907h;

            C2516a(int i, int i2) {
                this.f8906g = i;
                this.f8907h = i2;
            }

            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.smoothScrollTo(0, (wheelView.f8898r - this.f8906g) + wheelView.f8901u);
                WheelView wheelView2 = WheelView.this;
                wheelView2.f8897q = this.f8907h + 1;
                wheelView2.m11746g();
            }
        }

        /* renamed from: com.coocent.sleeptimer.view.WheelView$a$b */
        class C2517b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f8909g;

            /* renamed from: h */
            final /* synthetic */ int f8910h;

            C2517b(int i, int i2) {
                this.f8909g = i;
                this.f8910h = i2;
            }

            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.smoothScrollTo(0, wheelView.f8898r - this.f8909g);
                WheelView wheelView2 = WheelView.this;
                wheelView2.f8897q = this.f8910h;
                wheelView2.m11746g();
            }
        }

        C2515a() {
        }

        public void run() {
            int scrollY = WheelView.this.getScrollY();
            WheelView wheelView = WheelView.this;
            int i = wheelView.f8898r;
            if (i - scrollY == 0) {
                int i2 = wheelView.f8901u;
                int i3 = i % i2;
                int i4 = i / i2;
                if (i3 == 0) {
                    wheelView.f8897q = i4;
                    wheelView.m11746g();
                } else if (i3 > i2 / 2) {
                    wheelView.post(new C2516a(i3, i4));
                } else {
                    wheelView.post(new C2517b(i3, i4));
                }
            } else {
                wheelView.f8898r = wheelView.getScrollY();
                WheelView wheelView2 = WheelView.this;
                wheelView2.postDelayed(wheelView2.f8899s, (long) wheelView2.f8900t);
            }
        }
    }

    /* renamed from: com.coocent.sleeptimer.view.WheelView$b */
    class C2518b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f8912g;

        C2518b(int i) {
            this.f8912g = i;
        }

        public void run() {
            WheelView wheelView = WheelView.this;
            wheelView.smoothScrollTo(0, this.f8912g * wheelView.f8901u);
            WheelView.this.m11746g();
        }
    }

    /* renamed from: com.coocent.sleeptimer.view.WheelView$c */
    public interface C2519c {
        /* renamed from: a */
        void mo9738a(int i, String str);
    }

    public WheelView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private TextView m11741b(String str) {
        int c = m11742c(15.0f);
        TextView textView = new TextView(this.f8891k);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setSingleLine(true);
        textView.setTextSize((float) this.f8888h);
        textView.setText(str);
        textView.setGravity(17);
        textView.setPadding(0, c, 0, c);
        TextView textView2 = new TextView(this.f8891k);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView2.setSingleLine(true);
        textView2.setTextSize((float) this.f8887g);
        textView2.setText(str);
        textView2.setGravity(17);
        textView2.setPadding(0, c, 0, c);
        if (this.f8901u == 0) {
            this.f8901u = m11743d(textView);
            int d = m11743d(textView2);
            this.f8902v = d;
            this.f8903w = d + ((this.f8896p - 1) * this.f8901u);
            this.f8892l.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f8903w));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = this.f8903w;
            setLayoutParams(layoutParams);
        }
        return textView;
    }

    /* renamed from: c */
    private int m11742c(float f) {
        return (int) ((f * this.f8891k.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    private int m11743d(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }

    /* renamed from: e */
    private void m11744e(Context context) {
        this.f8891k = context;
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8892l = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f8892l);
        this.f8889i = C0506a.m3150b(getContext(), C4601a.colorAccent);
        this.f8890j = C0506a.m3150b(getContext(), C4601a.transBlack);
        this.f8899s = new C2515a();
    }

    /* renamed from: f */
    private void m11745f() {
        this.f8896p = (this.f8895o * 2) + 1;
        this.f8892l.removeAllViews();
        for (String b : this.f8893m) {
            this.f8892l.addView(m11741b(b));
        }
        m11747h(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11746g() {
        C2519c cVar = this.f8904x;
        if (cVar != null) {
            cVar.mo9738a(this.f8897q, getSeletedItem());
        }
    }

    /* renamed from: h */
    private void m11747h(int i) {
        int i2 = this.f8901u;
        int i3 = this.f8895o;
        int i4 = (i / i2) + i3;
        int i5 = i % i2;
        int i6 = i / i2;
        if (i5 == 0) {
            i4 = i6 + i3;
        } else if (i5 > i2 / 2) {
            i4 = i6 + i3 + 1;
        }
        int childCount = this.f8892l.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            TextView textView = (TextView) this.f8892l.getChildAt(i7);
            if (textView != null) {
                if (i4 == i7) {
                    textView.setTextSize((float) this.f8887g);
                    textView.setTypeface(Typeface.DEFAULT, 1);
                    textView.setTextColor(this.f8889i);
                } else {
                    textView.setTextSize((float) this.f8888h);
                    textView.setTypeface(Typeface.DEFAULT, 0);
                    textView.setTextColor(this.f8890j);
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void fling(int i) {
        super.fling(i / 3);
    }

    public List<String> getItems() {
        return this.f8893m;
    }

    public int getOffset() {
        return this.f8895o;
    }

    public int getSeletedIndex() {
        return this.f8897q;
    }

    public String getSeletedItem() {
        return this.f8894n.get(this.f8897q);
    }

    /* renamed from: i */
    public void mo9725i(int i, int i2) {
        this.f8889i = i;
        this.f8890j = i2;
    }

    /* renamed from: j */
    public void mo9726j() {
        this.f8898r = getScrollY();
        postDelayed(this.f8899s, (long) this.f8900t);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m11747h(i2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setBackground((Drawable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo9726j();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setItems(List<String> list) {
        this.f8894n = list;
        if (this.f8893m == null) {
            this.f8893m = new ArrayList();
        }
        this.f8893m.clear();
        this.f8893m.addAll(list);
        for (int i = 0; i < this.f8895o; i++) {
            this.f8893m.add(0, BuildConfig.FLAVOR);
            this.f8893m.add(BuildConfig.FLAVOR);
        }
        m11745f();
    }

    public void setOffset(int i) {
        this.f8895o = i;
    }

    public void setOnWheelViewListener(C2519c cVar) {
        this.f8904x = cVar;
    }

    public void setSeletion(int i) {
        this.f8897q = i;
        post(new C2518b(i));
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8887g = 20;
        this.f8888h = 15;
        this.f8895o = 1;
        this.f8897q = 0;
        this.f8900t = 50;
        this.f8901u = 0;
        this.f8902v = 0;
        this.f8903w = 0;
        m11744e(context);
    }
}
