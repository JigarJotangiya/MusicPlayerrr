package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p307o.C7513a;

public class SnackbarContentLayout extends LinearLayout implements C6189a {

    /* renamed from: g */
    private TextView f28868g;

    /* renamed from: h */
    private Button f28869h;

    /* renamed from: i */
    private int f28870i;

    /* renamed from: j */
    private int f28871j;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private static void m37010d(View view, int i, int i2) {
        if (C3774v.m16183V(view)) {
            C3774v.m16156D0(view, C3774v.m16161G(view), i, C3774v.m16159F(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m37011e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f28868g.getPaddingTop() == i2 && this.f28868g.getPaddingBottom() == i3) {
            return z;
        }
        m37010d(this.f28868g, i2, i3);
        return true;
    }

    /* renamed from: a */
    public void mo24692a(int i, int i2) {
        this.f28868g.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f28868g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f28869h.getVisibility() == 0) {
            this.f28869h.setAlpha(0.0f);
            this.f28869h.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* renamed from: b */
    public void mo24693b(int i, int i2) {
        this.f28868g.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f28868g.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f28869h.getVisibility() == 0) {
            this.f28869h.setAlpha(1.0f);
            this.f28869h.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24694c(float f) {
        if (f != 1.0f) {
            this.f28869h.setTextColor(C7513a.m41983g(C7513a.m41980d(this, C7490b.colorSurface), this.f28869h.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f28869h;
    }

    public TextView getMessageView() {
        return this.f28868g;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f28868g = (TextView) findViewById(C7494f.snackbar_text);
        this.f28869h = (Button) findViewById(C7494f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m37011e(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m37011e(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f28870i
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f28870i
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p159f.p243f.p245b.p304b.C7492d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p159f.p243f.p245b.p304b.C7492d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f28868g
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f28871j
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f28869h
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f28871j
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m37011e(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m37011e(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f28871j = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.SnackbarLayout);
        this.f28870i = obtainStyledAttributes.getDimensionPixelSize(C7500l.SnackbarLayout_android_maxWidth, -1);
        this.f28871j = obtainStyledAttributes.getDimensionPixelSize(C7500l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }
}
