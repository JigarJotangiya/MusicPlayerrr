package com.coocent.marquee;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class MarqueeSwitchButton extends AppCompatImageView implements View.OnTouchListener {

    /* renamed from: g */
    private boolean f7788g;

    /* renamed from: h */
    private int f7789h;

    /* renamed from: i */
    private int f7790i;

    /* renamed from: j */
    private String f7791j = "setting_preference";

    /* renamed from: k */
    private String f7792k = "preference_title";

    /* renamed from: l */
    private boolean f7793l = false;

    /* renamed from: m */
    private C2262a f7794m = null;

    /* renamed from: n */
    private Context f7795n;

    /* renamed from: o */
    private SharedPreferences f7796o;

    /* renamed from: com.coocent.marquee.MarqueeSwitchButton$a */
    public interface C2262a {
        /* renamed from: a */
        void mo8897a(boolean z);
    }

    public MarqueeSwitchButton(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        String str;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2328w.MarqueeSwitchButton);
            this.f7789h = obtainStyledAttributes.getResourceId(C2328w.MarqueeSwitchButton_marqueeOnImage, C2298o.m10694I1());
            this.f7790i = obtainStyledAttributes.getResourceId(C2328w.MarqueeSwitchButton_marqueeOffImage, C2298o.m10700K1());
            this.f7793l = obtainStyledAttributes.getBoolean(C2328w.MarqueeSwitchButton_marqueeSavePreference, false);
            this.f7792k = obtainStyledAttributes.getString(C2328w.MarqueeSwitchButton_marqueePreferenceTitle);
            obtainStyledAttributes.recycle();
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f7789h);
            decodeResource.getWidth();
            decodeResource.getHeight();
            decodeResource.recycle();
        }
        this.f7795n = context;
        setOnTouchListener(this);
        if (this.f7793l && (str = this.f7792k) != null && !str.isEmpty()) {
            SharedPreferences sharedPreferences = this.f7795n.getSharedPreferences(this.f7791j, 0);
            this.f7796o = sharedPreferences;
            this.f7788g = sharedPreferences.getBoolean(this.f7792k, true);
        }
    }

    /* renamed from: d */
    public boolean mo8963d() {
        return this.f7788g;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7788g) {
            if (C2298o.m10697J1() != null) {
                setImageDrawable(C2298o.m10697J1());
                return;
            }
            int i = this.f7789h;
            if (i != 0) {
                setImageResource(i);
            }
        } else if (C2298o.m10703L1() != null) {
            setImageDrawable(C2298o.m10703L1());
        } else {
            int i2 = this.f7790i;
            if (i2 != 0) {
                setImageResource(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        SharedPreferences sharedPreferences;
        try {
            if (motionEvent.getAction() == 1) {
                boolean z = !this.f7788g;
                this.f7788g = z;
                C2262a aVar = this.f7794m;
                if (aVar != null) {
                    aVar.mo8897a(z);
                }
                if (this.f7793l && (sharedPreferences = this.f7796o) != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean(this.f7792k, this.f7788g);
                    edit.apply();
                }
            }
            invalidate();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void setIsShow(boolean z) {
        this.f7788g = z;
        invalidate();
    }

    public void setOffBitmap(int i) {
        this.f7790i = i;
        invalidate();
    }

    public void setOnBitmap(int i) {
        this.f7789h = i;
        invalidate();
    }

    public void setOnchangeListener(C2262a aVar) {
        this.f7794m = aVar;
    }

    public void setPreferenceTitle(String str) {
        this.f7792k = str;
    }

    public void setSavePreference(boolean z) {
        this.f7793l = z;
    }

    public void setSavePreferenceTitle(String str) {
        this.f7791j = str;
    }

    public MarqueeSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }
}
