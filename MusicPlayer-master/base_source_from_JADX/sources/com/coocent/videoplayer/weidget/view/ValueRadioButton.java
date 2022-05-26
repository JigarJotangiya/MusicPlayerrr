package com.coocent.videoplayer.weidget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.coocent.videoplayer.C2710q;

public class ValueRadioButton extends AppCompatRadioButton {

    /* renamed from: j */
    private String f9494j;

    public ValueRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public String getValue() {
        return this.f9494j;
    }

    public void setValue(String str) {
        this.f9494j = str;
    }

    public ValueRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842878);
    }

    public ValueRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2710q.ValueRadioButton);
        this.f9494j = obtainStyledAttributes.getString(C2710q.ValueRadioButton_value);
        obtainStyledAttributes.recycle();
    }
}
