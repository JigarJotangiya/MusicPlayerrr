package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7496h;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A */
    private final Chip f29231A;

    /* renamed from: B */
    private final Chip f29232B;

    /* renamed from: C */
    private final MaterialButtonToggleGroup f29233C;

    /* renamed from: D */
    private final View.OnClickListener f29234D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C6276f f29235E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C6277g f29236F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C6275e f29237G;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    class C6271a implements View.OnClickListener {
        C6271a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f29236F != null) {
                TimePickerView.this.f29236F.mo25128a(((Integer) view.getTag(C7494f.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    class C6272b implements MaterialButtonToggleGroup.C5948e {
        C6272b() {
        }

        /* renamed from: a */
        public void mo23161a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == C7494f.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.f29235E != null && z) {
                TimePickerView.this.f29235E.mo25127a(i2);
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    class C6273c extends GestureDetector.SimpleOnGestureListener {
        C6273c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f29237G != null) {
                TimePickerView.this.f29237G.mo25126a();
            }
            return onDoubleTap;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    class C6274d implements View.OnTouchListener {

        /* renamed from: g */
        final /* synthetic */ GestureDetector f29241g;

        C6274d(TimePickerView timePickerView, GestureDetector gestureDetector) {
            this.f29241g = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f29241g.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    interface C6275e {
        /* renamed from: a */
        void mo25126a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    interface C6276f {
        /* renamed from: a */
        void mo25127a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    interface C6277g {
        /* renamed from: a */
        void mo25128a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    private void m37431E() {
        Chip chip = this.f29231A;
        int i = C7494f.selection_type;
        chip.setTag(i, 12);
        this.f29232B.setTag(i, 10);
        this.f29231A.setOnClickListener(this.f29234D);
        this.f29232B.setOnClickListener(this.f29234D);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: F */
    private void m37432F() {
        C6274d dVar = new C6274d(this, new GestureDetector(getContext(), new C6273c()));
        this.f29231A.setOnTouchListener(dVar);
        this.f29232B.setOnTouchListener(dVar);
    }

    /* renamed from: G */
    private void m37433G() {
        if (this.f29233C.getVisibility() == 0) {
            C0430c cVar = new C0430c();
            cVar.mo2961p(this);
            int i = 1;
            if (C3774v.m16151B(this) == 0) {
                i = 2;
            }
            cVar.mo2959n(C7494f.material_clock_display, i);
            cVar.mo2955i(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m37433G();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m37433G();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29234D = new C6271a();
        LayoutInflater.from(context).inflate(C7496h.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(C7494f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C7494f.material_clock_period_toggle);
        this.f29233C = materialButtonToggleGroup;
        materialButtonToggleGroup.mo23144g(new C6272b());
        this.f29231A = (Chip) findViewById(C7494f.material_minute_tv);
        this.f29232B = (Chip) findViewById(C7494f.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(C7494f.material_clock_hand);
        m37432F();
        m37431E();
    }
}
