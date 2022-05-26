package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C6092l;
import com.google.android.material.textfield.TextInputLayout;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7496h;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Chip f29184g;

    /* renamed from: h */
    private final TextInputLayout f29185h;

    /* renamed from: i */
    private final EditText f29186i;

    /* renamed from: j */
    private TextWatcher f29187j;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    private class C6262b extends C6092l {
        private C6262b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f29184g.setText(ChipTextInputComboView.this.m37389c("00"));
            } else {
                ChipTextInputComboView.this.f29184g.setText(ChipTextInputComboView.this.m37389c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m37389c(CharSequence charSequence) {
        return TimeModel.m37423a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m37390d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f29186i.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f29184g.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m37390d();
    }

    public void setChecked(boolean z) {
        this.f29184g.setChecked(z);
        int i = 0;
        this.f29186i.setVisibility(z ? 0 : 4);
        Chip chip = this.f29184g;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            this.f29186i.requestFocus();
            if (!TextUtils.isEmpty(this.f29186i.getText())) {
                EditText editText = this.f29186i;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f29184g.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f29184g.setTag(i, obj);
    }

    public void toggle() {
        this.f29184g.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C7496h.material_time_chip, this, false);
        this.f29184g = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C7496h.material_time_input, this, false);
        this.f29185h = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f29186i = editText;
        editText.setVisibility(4);
        C6262b bVar = new C6262b();
        this.f29187j = bVar;
        editText.addTextChangedListener(bVar);
        m37390d();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(C7494f.material_label);
        editText.setSaveEnabled(false);
    }
}
