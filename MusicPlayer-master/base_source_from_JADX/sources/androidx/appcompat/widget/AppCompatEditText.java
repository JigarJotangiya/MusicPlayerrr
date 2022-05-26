package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.C0556l;
import p082e.p083a.C3400a;
import p082e.p109h.p119p.C3772t;

public class AppCompatEditText extends EditText implements C3772t {

    /* renamed from: g */
    private final C0271d f935g;

    /* renamed from: h */
    private final C0292l f936h;

    /* renamed from: i */
    private final C0290k f937i;

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0271d dVar = this.f935g;
        if (dVar != null) {
            dVar.mo1944b();
        }
        C0292l lVar = this.f936h;
        if (lVar != null) {
            lVar.mo2062b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271d dVar = this.f935g;
        if (dVar != null) {
            return dVar.mo1945c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271d dVar = this.f935g;
        if (dVar != null) {
            return dVar.mo1946d();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        C0290k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f937i) == null) {
            return super.getTextClassifier();
        }
        return kVar.mo2057a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0278g.m1624a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271d dVar = this.f935g;
        if (dVar != null) {
            dVar.mo1948f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271d dVar = this.f935g;
        if (dVar != null) {
            dVar.mo1949g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0556l.m3437s(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271d dVar = this.f935g;
        if (dVar != null) {
            dVar.mo1951i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271d dVar = this.f935g;
        if (dVar != null) {
            dVar.mo1952j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0292l lVar = this.f936h;
        if (lVar != null) {
            lVar.mo2076q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0290k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f937i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kVar.mo2058b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0271d dVar = new C0271d(this);
        this.f935g = dVar;
        dVar.mo1947e(attributeSet, i);
        C0292l lVar = new C0292l(this);
        this.f936h = lVar;
        lVar.mo2072m(attributeSet, i);
        lVar.mo2062b();
        this.f937i = new C0290k(this);
    }
}
