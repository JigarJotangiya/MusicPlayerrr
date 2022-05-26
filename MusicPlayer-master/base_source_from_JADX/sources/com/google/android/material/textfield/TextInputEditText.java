package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.C6066d;
import com.google.android.material.internal.C6093m;
import com.google.android.material.theme.p249a.C6260a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class TextInputEditText extends AppCompatEditText {

    /* renamed from: j */
    private final Rect f28995j;

    /* renamed from: k */
    private boolean f28996k;

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private String m37170a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        if (Build.VERSION.SDK_INT >= 17) {
            setLabelFor(C7494f.textinput_helper_text);
        }
        String str = BuildConfig.FLAVOR;
        String charSequence = z2 ? hint.toString() : str;
        if (!z) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb.append(str);
        return sb.toString();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f28996k && rect != null) {
            textInputLayout.getFocusedRect(this.f28995j);
            rect.bottom = this.f28995j.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f28996k || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f28995j, point);
            rect.bottom = this.f28995j.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.mo24857O()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo24857O() && super.getHint() == null && C6066d.m36468a()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(m37170a(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f28996k) {
            this.f28995j.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C7492d.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f28995j, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f28996k = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C6260a.m37386c(context, attributeSet, i, 0), attributeSet, i);
        this.f28995j = new Rect();
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.TextInputEditText, i, C7499k.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h.getBoolean(C7500l.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        h.recycle();
    }
}
