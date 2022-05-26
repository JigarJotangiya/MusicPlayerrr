package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0556l;
import p082e.p083a.p084k.p085a.C3410a;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: h */
    private static final int[] f933h = {16843016};

    /* renamed from: g */
    private final C0292l f934g;

    public AppCompatCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0292l lVar = this.f934g;
        if (lVar != null) {
            lVar.mo2062b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0278g.m1624a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C3410a.m14543d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0556l.m3437s(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0292l lVar = this.f934g;
        if (lVar != null) {
            lVar.mo2076q(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0272d0.m1593b(context), attributeSet, i);
        C0268b0.m1570a(this, getContext());
        C0292l lVar = new C0292l(this);
        this.f934g = lVar;
        lVar.mo2072m(attributeSet, i);
        lVar.mo2062b();
        C0279g0 v = C0279g0.m1627v(getContext(), attributeSet, f933h, i, 0);
        setCheckMarkDrawable(v.mo1982g(0));
        v.mo1995w();
    }
}
