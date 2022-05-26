package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0548d;
import androidx.core.widget.C0556l;
import androidx.core.widget.C0559n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p110h.C3626d;
import p082e.p109h.p117n.C3683c;
import p082e.p109h.p119p.C3772t;

public class AppCompatTextView extends TextView implements C3772t, C0559n, C0548d {

    /* renamed from: g */
    private final C0271d f978g;

    /* renamed from: h */
    private final C0292l f979h;

    /* renamed from: i */
    private final C0290k f980i;

    /* renamed from: j */
    private Future<C3683c> f981j;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: o */
    private void m1348o() {
        Future<C3683c> future = this.f981j;
        if (future != null) {
            try {
                this.f981j = null;
                C0556l.m3434p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f978g;
        if (dVar != null) {
            dVar.mo1944b();
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2062b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0548d.f2816a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            return lVar.mo2064e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0548d.f2816a) {
            return super.getAutoSizeMinTextSize();
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            return lVar.mo2065f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0548d.f2816a) {
            return super.getAutoSizeStepGranularity();
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            return lVar.mo2066g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0548d.f2816a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0292l lVar = this.f979h;
        return lVar != null ? lVar.mo2067h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0548d.f2816a) {
            C0292l lVar = this.f979h;
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

    public int getFirstBaselineToTopHeight() {
        return C0556l.m3420b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0556l.m3421c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f978g;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f978g;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f979h.mo2069j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f979h.mo2070k();
    }

    public CharSequence getText() {
        m1348o();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0290k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f980i) == null) {
            return super.getTextClassifier();
        }
        return kVar.mo2057a();
    }

    public C3683c.C3684a getTextMetricsParamsCompat() {
        return C0556l.m3425g(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0278g.m1624a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2074o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1348o();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0292l lVar = this.f979h;
        if (lVar != null && !C0548d.f2816a && lVar.mo2071l()) {
            this.f979h.mo2063c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0548d.f2816a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2078s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0548d.f2816a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2079t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0548d.f2816a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2080u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f978g;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f978g;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2075p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2075p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2075p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2075p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0556l.m3437s(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0556l.m3431m(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0556l.m3432n(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0556l.m3433o(this, i);
    }

    public void setPrecomputedText(C3683c cVar) {
        C0556l.m3434p(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f978g;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f978g;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f979h.mo2081v(colorStateList);
        this.f979h.mo2062b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f979h.mo2082w(mode);
        this.f979h.mo2062b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2076q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0290k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f980i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kVar.mo2058b(textClassifier);
        }
    }

    public void setTextFuture(Future<C3683c> future) {
        this.f981j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C3683c.C3684a aVar) {
        C0556l.m3436r(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0548d.f2816a) {
            super.setTextSize(i, f);
            return;
        }
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2083z(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C3626d.m15616a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0271d dVar = new C0271d(this);
        this.f978g = dVar;
        dVar.mo1947e(attributeSet, i);
        C0292l lVar = new C0292l(this);
        this.f979h = lVar;
        lVar.mo2072m(attributeSet, i);
        lVar.mo2062b();
        this.f980i = new C0290k(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C3410a.m14543d(context, i) : null;
        Drawable d2 = i2 != 0 ? C3410a.m14543d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C3410a.m14543d(context, i3) : null;
        if (i4 != 0) {
            drawable = C3410a.m14543d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2075p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C3410a.m14543d(context, i) : null;
        Drawable d2 = i2 != 0 ? C3410a.m14543d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C3410a.m14543d(context, i3) : null;
        if (i4 != 0) {
            drawable = C3410a.m14543d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        C0292l lVar = this.f979h;
        if (lVar != null) {
            lVar.mo2075p();
        }
    }
}
