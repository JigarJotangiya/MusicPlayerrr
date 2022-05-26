package com.coocent.musiccutter.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p199f.C4488b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class WheelView extends ScrollView {

    /* renamed from: g */
    private int f8589g = 20;

    /* renamed from: h */
    private int f8590h = 15;

    /* renamed from: i */
    private Context f8591i;

    /* renamed from: j */
    private LinearLayout f8592j;

    /* renamed from: k */
    private List<String> f8593k;

    /* renamed from: l */
    private List<String> f8594l;

    /* renamed from: m */
    int f8595m = 1;

    /* renamed from: n */
    int f8596n;

    /* renamed from: o */
    int f8597o = 0;

    /* renamed from: p */
    int f8598p;

    /* renamed from: q */
    Runnable f8599q;

    /* renamed from: r */
    int f8600r = 50;

    /* renamed from: s */
    int f8601s = 0;

    /* renamed from: t */
    private C2452c f8602t;

    /* renamed from: com.coocent.musiccutter.view.WheelView$a */
    class C2448a implements Runnable {

        /* renamed from: com.coocent.musiccutter.view.WheelView$a$a */
        class C2449a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f8604g;

            /* renamed from: h */
            final /* synthetic */ int f8605h;

            C2449a(int i, int i2) {
                this.f8604g = i;
                this.f8605h = i2;
            }

            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.smoothScrollTo(0, (wheelView.f8598p - this.f8604g) + wheelView.f8601s);
                WheelView wheelView2 = WheelView.this;
                wheelView2.f8597o = this.f8605h + 1;
                wheelView2.m11475g();
            }
        }

        /* renamed from: com.coocent.musiccutter.view.WheelView$a$b */
        class C2450b implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f8607g;

            /* renamed from: h */
            final /* synthetic */ int f8608h;

            C2450b(int i, int i2) {
                this.f8607g = i;
                this.f8608h = i2;
            }

            public void run() {
                WheelView wheelView = WheelView.this;
                wheelView.smoothScrollTo(0, wheelView.f8598p - this.f8607g);
                WheelView wheelView2 = WheelView.this;
                wheelView2.f8597o = this.f8608h;
                wheelView2.m11475g();
            }
        }

        C2448a() {
        }

        public void run() {
            int scrollY = WheelView.this.getScrollY();
            WheelView wheelView = WheelView.this;
            int i = wheelView.f8598p;
            if (i - scrollY == 0) {
                int i2 = wheelView.f8601s;
                int i3 = i % i2;
                int i4 = i / i2;
                if (i3 == 0) {
                    wheelView.f8597o = i4;
                    wheelView.m11475g();
                } else if (i3 > i2 / 2) {
                    wheelView.post(new C2449a(i3, i4));
                } else {
                    wheelView.post(new C2450b(i3, i4));
                }
            } else {
                wheelView.f8598p = wheelView.getScrollY();
                WheelView wheelView2 = WheelView.this;
                wheelView2.postDelayed(wheelView2.f8599q, (long) wheelView2.f8600r);
            }
        }
    }

    /* renamed from: com.coocent.musiccutter.view.WheelView$b */
    class C2451b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ int f8610g;

        C2451b(int i) {
            this.f8610g = i;
        }

        public void run() {
            WheelView wheelView = WheelView.this;
            wheelView.smoothScrollTo(0, this.f8610g * wheelView.f8601s);
        }
    }

    /* renamed from: com.coocent.musiccutter.view.WheelView$c */
    public interface C2452c {
        /* renamed from: a */
        void mo9512a(int i, String str);
    }

    public WheelView(Context context) {
        super(context);
        m11473e(context);
    }

    /* renamed from: b */
    private TextView m11470b(String str) {
        TextView textView = new TextView(this.f8591i);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView.setSingleLine(true);
        textView.setTextSize((float) this.f8590h);
        textView.setText(str);
        textView.setGravity(17);
        int c = m11471c(15.0f);
        textView.setPadding(c, c, c, c);
        TextView textView2 = new TextView(this.f8591i);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView2.setSingleLine(true);
        textView2.setTextSize((float) this.f8589g);
        textView2.setText(str);
        textView2.setGravity(17);
        textView2.setPadding(c, c, c, c);
        if (this.f8601s == 0) {
            this.f8601s = m11472d(textView);
            int d = m11472d(textView2) + ((this.f8596n - 1) * this.f8601s);
            this.f8592j.setLayoutParams(new FrameLayout.LayoutParams(-1, d));
            setLayoutParams(new LinearLayout.LayoutParams(((LinearLayout.LayoutParams) getLayoutParams()).width, d));
        }
        return textView;
    }

    /* renamed from: c */
    private int m11471c(float f) {
        return (int) ((f * this.f8591i.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    private int m11472d(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }

    /* renamed from: e */
    private void m11473e(Context context) {
        this.f8591i = context;
        setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8592j = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.f8592j);
        this.f8599q = new C2448a();
    }

    /* renamed from: f */
    private void m11474f() {
        this.f8596n = (this.f8595m * 2) + 1;
        this.f8592j.removeAllViews();
        for (String b : this.f8593k) {
            this.f8592j.addView(m11470b(b));
        }
        m11476h(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11475g() {
        C2452c cVar = this.f8602t;
        if (cVar != null) {
            cVar.mo9512a(this.f8597o, getSeletedItem());
        }
    }

    /* renamed from: h */
    private void m11476h(int i) {
        int i2 = this.f8601s;
        int i3 = this.f8595m;
        int i4 = (i / i2) + i3;
        int i5 = i % i2;
        int i6 = i / i2;
        if (i5 == 0) {
            i4 = i6 + i3;
        } else if (i5 > i2 / 2) {
            i4 = i6 + i3 + 1;
        }
        int childCount = this.f8592j.getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            TextView textView = (TextView) this.f8592j.getChildAt(i7);
            if (textView != null) {
                if (i4 == i7) {
                    textView.setTextSize((float) this.f8589g);
                    textView.setTypeface(Typeface.DEFAULT, 1);
                    textView.setTextColor(getResources().getColor(C4488b.crop_light_color));
                } else {
                    textView.setTextSize((float) this.f8590h);
                    textView.setTextColor(getResources().getColor(C4488b.white));
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
        return this.f8593k;
    }

    public int getOffset() {
        return this.f8595m;
    }

    public int getSeletedIndex() {
        return this.f8597o;
    }

    public String getSeletedItem() {
        return this.f8594l.get(this.f8597o);
    }

    /* renamed from: i */
    public void mo9500i() {
        this.f8598p = getScrollY();
        postDelayed(this.f8599q, (long) this.f8600r);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m11476h(i2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setBackgroundDrawable((Drawable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo9500i();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setItems(List<String> list) {
        this.f8594l = list;
        if (this.f8593k == null) {
            this.f8593k = new ArrayList();
        }
        this.f8593k.clear();
        this.f8593k.addAll(list);
        for (int i = 0; i < this.f8595m; i++) {
            this.f8593k.add(0, BuildConfig.FLAVOR);
            this.f8593k.add(BuildConfig.FLAVOR);
        }
        m11474f();
    }

    public void setOffset(int i) {
        this.f8595m = i;
    }

    public void setOnWheelViewListener(C2452c cVar) {
        this.f8602t = cVar;
    }

    public void setSeletion(int i) {
        this.f8597o = i;
        post(new C2451b(i));
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11473e(context);
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11473e(context);
    }
}
