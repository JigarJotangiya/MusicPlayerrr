package com.coocent.pinview.fragment;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0506a;
import com.coocent.pinview.C2482f;
import com.coocent.pinview.C2491h;
import com.coocent.pinview.C2492i;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class InputLayout extends ConstraintLayout implements TextWatcher {

    /* renamed from: A */
    private AppCompatEditText f8769A;

    /* renamed from: B */
    private AppCompatImageView f8770B;

    /* renamed from: C */
    private C2483a f8771C;

    /* renamed from: com.coocent.pinview.fragment.InputLayout$a */
    public interface C2483a {
        /* renamed from: T */
        void mo9606T();
    }

    public InputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void mo9621D(View view) {
        this.f8769A.setText(BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo9622F(String str) {
        this.f8769A.setText(str);
        this.f8769A.setSelection(str.length());
    }

    /* renamed from: B */
    public void mo9620B() {
        this.f8769A.setText(BuildConfig.FLAVOR);
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public String getText() {
        Editable text = this.f8769A.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public IBinder getWindowToken() {
        return this.f8769A.getWindowToken();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(C2492i.question_input);
        this.f8769A = appCompatEditText;
        appCompatEditText.addTextChangedListener(this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(C2492i.question_clear);
        this.f8770B = appCompatImageView;
        appCompatImageView.setOnClickListener(new C2484a(this));
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.toString().isEmpty()) {
            this.f8770B.setVisibility(8);
        } else {
            this.f8770B.setVisibility(0);
        }
        C2483a aVar = this.f8771C;
        if (aVar != null) {
            aVar.mo9606T();
        }
    }

    public void setDarkMode(boolean z) {
        this.f8769A.setBackgroundResource(z ? C2491h.dark_input_layout_edit_bg : C2491h.input_layout_edit_bg);
        this.f8769A.setTextColor(C0506a.m3150b(getContext(), z ? C2482f.dark_input_layout_edit_text_color : C2482f.input_layout_edit_text_color));
    }

    public void setInputHint(int i) {
        this.f8769A.setHint(i);
    }

    public void setInputSelected(boolean z) {
        this.f8769A.setSelected(z);
    }

    public void setOnTextChangeCallback(C2483a aVar) {
        this.f8771C = aVar;
    }

    public void setSecret(boolean z) {
        if (z) {
            this.f8769A.setInputType(129);
        } else {
            this.f8769A.setInputType(1);
        }
    }

    public void setText(String str) {
        this.f8769A.post(new C2485b(this, str));
    }

    public InputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
