package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C0558m;
import p082e.p083a.C3400a;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3772t;

public class AppCompatRadioButton extends RadioButton implements C0558m, C3772t {

    /* renamed from: g */
    private final C0273e f945g;

    /* renamed from: h */
    private final C0271d f946h;

    /* renamed from: i */
    private final C0292l f947i;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f946h;
        if (dVar != null) {
            dVar.mo1944b();
        }
        C0292l lVar = this.f947i;
        if (lVar != null) {
            lVar.mo2062b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0273e eVar = this.f945g;
        return eVar != null ? eVar.mo1958b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f946h;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f946h;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0273e eVar = this.f945g;
        if (eVar != null) {
            return eVar.mo1959c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0273e eVar = this.f945g;
        if (eVar != null) {
            return eVar.mo1960d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f946h;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f946h;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0273e eVar = this.f945g;
        if (eVar != null) {
            eVar.mo1962f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f946h;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f946h;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0273e eVar = this.f945g;
        if (eVar != null) {
            eVar.mo1963g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0273e eVar = this.f945g;
        if (eVar != null) {
            eVar.mo1964h(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0273e eVar = new C0273e(this);
        this.f945g = eVar;
        eVar.mo1961e(attributeSet, i);
        C0271d dVar = new C0271d(this);
        this.f946h = dVar;
        dVar.mo1947e(attributeSet, i);
        C0292l lVar = new C0292l(this);
        this.f947i = lVar;
        lVar.mo2072m(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C3410a.m14543d(getContext(), i));
    }
}
