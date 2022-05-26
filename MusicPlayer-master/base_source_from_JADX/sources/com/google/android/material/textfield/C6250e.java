package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
/* compiled from: EndIconDelegate */
abstract class C6250e {

    /* renamed from: a */
    TextInputLayout f29144a;

    /* renamed from: b */
    Context f29145b;

    /* renamed from: c */
    CheckableImageButton f29146c;

    C6250e(TextInputLayout textInputLayout) {
        this.f29144a = textInputLayout;
        this.f29145b = textInputLayout.getContext();
        this.f29146c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo25027a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo25043b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo25028c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo25044d() {
        return false;
    }
}
