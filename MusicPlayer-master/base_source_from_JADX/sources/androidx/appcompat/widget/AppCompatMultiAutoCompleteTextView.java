package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p082e.p083a.C3400a;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3772t;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements C3772t {

    /* renamed from: i */
    private static final int[] f940i = {16843126};

    /* renamed from: g */
    private final C0271d f941g;

    /* renamed from: h */
    private final C0292l f942h;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f941g;
        if (dVar != null) {
            dVar.mo1944b();
        }
        C0292l lVar = this.f942h;
        if (lVar != null) {
            lVar.mo2062b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f941g;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f941g;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0278g.m1624a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f941g;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f941g;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C3410a.m14543d(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f941g;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f941g;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0292l lVar = this.f942h;
        if (lVar != null) {
            lVar.mo2076q(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0279g0 v = C0279g0.m1627v(getContext(), attributeSet, f940i, i, 0);
        if (v.mo1994s(0)) {
            setDropDownBackgroundDrawable(v.mo1982g(0));
        }
        v.mo1995w();
        C0271d dVar = new C0271d(this);
        this.f941g = dVar;
        dVar.mo1947e(attributeSet, i);
        C0292l lVar = new C0292l(this);
        this.f942h = lVar;
        lVar.mo2072m(attributeSet, i);
        lVar.mo2062b();
    }
}
