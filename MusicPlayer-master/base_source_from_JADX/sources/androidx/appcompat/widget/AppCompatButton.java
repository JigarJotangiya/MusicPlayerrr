package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0548d;
import androidx.core.widget.C0556l;
import androidx.core.widget.C0559n;
import p082e.p083a.C3400a;
import p082e.p109h.p119p.C3772t;

public class AppCompatButton extends Button implements C3772t, C0548d, C0559n {

    /* renamed from: g */
    private final C0271d f928g;

    /* renamed from: h */
    private final C0292l f929h;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f928g;
        if (dVar != null) {
            dVar.mo1944b();
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2062b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0548d.f2816a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            return lVar.mo2064e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0548d.f2816a) {
            return super.getAutoSizeMinTextSize();
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            return lVar.mo2065f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0548d.f2816a) {
            return super.getAutoSizeStepGranularity();
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            return lVar.mo2066g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0548d.f2816a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0292l lVar = this.f929h;
        return lVar != null ? lVar.mo2067h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0548d.f2816a) {
            C0292l lVar = this.f929h;
            if (lVar != null) {
                return lVar.mo2068i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f928g;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f928g;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f929h.mo2069j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f929h.mo2070k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2074o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0292l lVar = this.f929h;
        if (lVar != null && !C0548d.f2816a && lVar.mo2071l()) {
            this.f929h.mo2063c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0548d.f2816a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2078s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0548d.f2816a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2079t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0548d.f2816a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2080u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f928g;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f928g;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0556l.m3437s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2077r(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f928g;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f928g;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f929h.mo2081v(colorStateList);
        this.f929h.mo2062b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f929h.mo2082w(mode);
        this.f929h.mo2062b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2076q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0548d.f2816a) {
            super.setTextSize(i, f);
            return;
        }
        C0292l lVar = this.f929h;
        if (lVar != null) {
            lVar.mo2083z(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0271d dVar = new C0271d(this);
        this.f928g = dVar;
        dVar.mo1947e(attributeSet, i);
        C0292l lVar = new C0292l(this);
        this.f929h = lVar;
        lVar.mo2072m(attributeSet, i);
        lVar.mo2062b();
    }
}
