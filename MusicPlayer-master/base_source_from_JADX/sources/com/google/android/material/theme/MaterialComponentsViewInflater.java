package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0139g;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

public class MaterialComponentsViewInflater extends C0139g {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatAutoCompleteTextView mo663b(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatButton mo664c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatCheckBox mo665d(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatRadioButton mo671j(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatTextView mo675n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
