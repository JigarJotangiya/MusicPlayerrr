package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C6092l;
import com.google.android.material.textfield.TextInputLayout;
import p082e.p083a.p084k.p085a.C3410a;
import p159f.p243f.p245b.p304b.C7493e;
import p159f.p243f.p245b.p304b.C7498j;

/* renamed from: com.google.android.material.textfield.h */
/* compiled from: PasswordToggleEndIconDelegate */
class C6254h extends C6250e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f29173d = new C6255a();

    /* renamed from: e */
    private final TextInputLayout.C6222f f29174e = new C6256b();

    /* renamed from: f */
    private final TextInputLayout.C6223g f29175f = new C6257c();

    /* renamed from: com.google.android.material.textfield.h$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C6255a extends C6092l {
        C6255a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C6254h hVar = C6254h.this;
            hVar.f29146c.setChecked(!hVar.m37369g());
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C6256b implements TextInputLayout.C6222f {
        C6256b() {
        }

        /* renamed from: a */
        public void mo25025a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C6254h hVar = C6254h.this;
            hVar.f29146c.setChecked(!hVar.m37369g());
            editText.removeTextChangedListener(C6254h.this.f29173d);
            editText.addTextChangedListener(C6254h.this.f29173d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C6257c implements TextInputLayout.C6223g {

        /* renamed from: com.google.android.material.textfield.h$c$a */
        /* compiled from: PasswordToggleEndIconDelegate */
        class C6258a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ EditText f29179g;

            C6258a(EditText editText) {
                this.f29179g = editText;
            }

            public void run() {
                this.f29179g.removeTextChangedListener(C6254h.this.f29173d);
            }
        }

        C6257c() {
        }

        /* renamed from: a */
        public void mo25026a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C6258a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C6259d implements View.OnClickListener {
        C6259d() {
        }

        public void onClick(View view) {
            EditText editText = C6254h.this.f29144a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C6254h.this.m37369g()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C6254h.this.f29144a.mo24859V();
            }
        }
    }

    C6254h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m37369g() {
        EditText editText = this.f29144a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m37370h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25027a() {
        this.f29144a.setEndIconDrawable(C3410a.m14543d(this.f29145b, C7493e.design_password_eye));
        TextInputLayout textInputLayout = this.f29144a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C7498j.password_toggle_content_description));
        this.f29144a.setEndIconOnClickListener(new C6259d());
        this.f29144a.mo24867e(this.f29174e);
        this.f29144a.mo24869f(this.f29175f);
        EditText editText = this.f29144a.getEditText();
        if (m37370h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
