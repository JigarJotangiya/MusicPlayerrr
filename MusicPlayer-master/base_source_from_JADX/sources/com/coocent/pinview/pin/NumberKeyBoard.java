package com.coocent.pinview.pin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import com.coocent.pinview.C2492i;
import com.coocent.pinview.C2496m;

public class NumberKeyBoard extends GridLayout implements View.OnClickListener {

    /* renamed from: g */
    private Button f8814g;

    /* renamed from: h */
    private Button f8815h;

    /* renamed from: i */
    private Button f8816i;

    /* renamed from: j */
    private Button f8817j;

    /* renamed from: k */
    private Button f8818k;

    /* renamed from: l */
    private Button f8819l;

    /* renamed from: m */
    private Button f8820m;

    /* renamed from: n */
    private Button f8821n;

    /* renamed from: o */
    private Button f8822o;

    /* renamed from: p */
    private Button f8823p;

    /* renamed from: q */
    private ImageButton f8824q;

    /* renamed from: r */
    private IndicatorDots f8825r;

    /* renamed from: s */
    private C2511d f8826s;

    /* renamed from: t */
    private StringBuilder f8827t = new StringBuilder();

    /* renamed from: u */
    private int f8828u;

    public NumberKeyBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11677d(attributeSet, 0);
    }

    /* renamed from: d */
    private void m11677d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2496m.PinLockView);
        try {
            this.f8828u = obtainStyledAttributes.getInt(C2496m.PinLockView_pinLength, 4);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: n */
    private void m11678n() {
        if (mo9650f()) {
            this.f8825r.mo9642d(this.f8827t.length());
        }
        if (this.f8827t.length() == 0) {
            this.f8824q.setVisibility(8);
        } else {
            this.f8824q.setVisibility(0);
        }
        if (this.f8826s == null) {
            return;
        }
        if (this.f8827t.length() == this.f8828u) {
            this.f8826s.mo9605I0(this.f8827t.toString());
        } else {
            this.f8826s.mo9609t0(this.f8827t.length(), this.f8827t.toString());
        }
    }

    /* renamed from: a */
    public void mo9648a(IndicatorDots indicatorDots) {
        this.f8825r = indicatorDots;
    }

    /* renamed from: b */
    public void mo9649b() {
        StringBuilder sb = this.f8827t;
        sb.delete(0, sb.length());
        m11678n();
    }

    /* renamed from: f */
    public boolean mo9650f() {
        return this.f8825r != null;
    }

    public String getPassword() {
        return this.f8827t.toString();
    }

    public int getPinLength() {
        return this.f8828u;
    }

    public void onClick(View view) {
        int id = view.getId();
        int i = 0;
        if (id == C2492i.cgallery_number_delete) {
            int length = this.f8827t.length() - 1;
            int length2 = this.f8827t.length();
            if (length <= 0) {
                length = 0;
            }
            if (length2 > 0) {
                i = length2;
            }
            Log.d("NumberKeyBoard", "+" + this.f8827t.toString());
            this.f8827t.delete(length, i);
            Log.d("NumberKeyBoard", "-" + this.f8827t.toString());
            m11678n();
        } else if (this.f8827t.length() != this.f8828u) {
            if (id == C2492i.cgallery_number1) {
                this.f8827t.append(1);
            } else if (id == C2492i.cgallery_number2) {
                this.f8827t.append(2);
            } else if (id == C2492i.cgallery_number3) {
                this.f8827t.append(3);
            } else if (id == C2492i.cgallery_number4) {
                this.f8827t.append(4);
            } else if (id == C2492i.cgallery_number5) {
                this.f8827t.append(5);
            } else if (id == C2492i.cgallery_number6) {
                this.f8827t.append(6);
            } else if (id == C2492i.cgallery_number7) {
                this.f8827t.append(7);
            } else if (id == C2492i.cgallery_number8) {
                this.f8827t.append(8);
            } else if (id == C2492i.cgallery_number9) {
                this.f8827t.append(9);
            } else if (id == C2492i.cgallery_number0) {
                this.f8827t.append(0);
            }
            m11678n();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8814g = (Button) findViewById(C2492i.cgallery_number1);
        this.f8815h = (Button) findViewById(C2492i.cgallery_number2);
        this.f8816i = (Button) findViewById(C2492i.cgallery_number3);
        this.f8817j = (Button) findViewById(C2492i.cgallery_number4);
        this.f8818k = (Button) findViewById(C2492i.cgallery_number5);
        this.f8819l = (Button) findViewById(C2492i.cgallery_number6);
        this.f8820m = (Button) findViewById(C2492i.cgallery_number7);
        this.f8821n = (Button) findViewById(C2492i.cgallery_number8);
        this.f8822o = (Button) findViewById(C2492i.cgallery_number9);
        this.f8823p = (Button) findViewById(C2492i.cgallery_number0);
        this.f8824q = (ImageButton) findViewById(C2492i.cgallery_number_delete);
        this.f8814g.setOnClickListener(this);
        this.f8815h.setOnClickListener(this);
        this.f8816i.setOnClickListener(this);
        this.f8817j.setOnClickListener(this);
        this.f8818k.setOnClickListener(this);
        this.f8819l.setOnClickListener(this);
        this.f8820m.setOnClickListener(this);
        this.f8821n.setOnClickListener(this);
        this.f8822o.setOnClickListener(this);
        this.f8823p.setOnClickListener(this);
        this.f8824q.setOnClickListener(this);
    }

    public void setPassword(String str) {
        this.f8827t.append(str);
    }

    public void setPinLength(int i) {
        this.f8828u = i;
        if (mo9650f()) {
            this.f8825r.setPinLength(i);
        }
    }

    public void setPinLockListener(C2511d dVar) {
        this.f8826s = dVar;
    }

    public NumberKeyBoard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11677d(attributeSet, i);
    }
}
