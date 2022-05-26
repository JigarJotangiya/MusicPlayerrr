package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p159f.p160a.p161a.C4267e;
import p159f.p160a.p161a.C4286i;
import p159f.p160a.p161a.p163r.C4297a;

@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {

    /* renamed from: g */
    private boolean f5487g = false;

    /* renamed from: h */
    private C4267e f5488h;

    /* renamed from: i */
    private int f5489i;

    /* renamed from: j */
    private Drawable f5490j;

    /* renamed from: k */
    private Drawable f5491k;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7508a(context);
    }

    /* renamed from: a */
    private void m7508a(Context context) {
        this.f5489i = context.getResources().getDimensionPixelSize(C4286i.md_dialog_frame_margin);
        this.f5488h = C4267e.END;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6849b(boolean z, boolean z2) {
        if (this.f5487g != z || z2) {
            setGravity(z ? this.f5488h.getGravityInt() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.f5488h.getTextAlignment() : 4);
            }
            C4297a.m18806t(this, z ? this.f5490j : this.f5491k);
            if (z) {
                setPadding(this.f5489i, getPaddingTop(), this.f5489i, getPaddingBottom());
            }
            this.f5487g = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 14) {
            setAllCaps(z);
        } else if (z) {
            setTransformationMethod(new C1433a(getContext()));
        } else {
            setTransformationMethod((TransformationMethod) null);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f5491k = drawable;
        if (!this.f5487g) {
            mo6849b(false, true);
        }
    }

    public void setStackedGravity(C4267e eVar) {
        this.f5488h = eVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f5490j = drawable;
        if (this.f5487g) {
            mo6849b(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7508a(context);
    }
}
