package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3277g0;
import com.google.android.gms.common.internal.zaaa;
import p159f.p243f.p245b.p246a.p247a.C4862d;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: g */
    private int f10306g;

    /* renamed from: h */
    private int f10307h;

    /* renamed from: i */
    private View f10308i;

    /* renamed from: j */
    private View.OnClickListener f10309j;

    public SignInButton(@RecentlyNonNull Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final void m13762b(Context context) {
        View view = this.f10308i;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f10308i = C3277g0.m14208c(context, this.f10306g, this.f10307h);
        } catch (C4866c.C4867a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i = this.f10306g;
            int i2 = this.f10307h;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.mo11898a(context.getResources(), i, i2);
            this.f10308i = zaaa;
        }
        addView(this.f10308i);
        this.f10308i.setEnabled(isEnabled());
        this.f10308i.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo11463a(int i, int i2) {
        this.f10306g = i;
        this.f10307h = i2;
        m13762b(getContext());
    }

    public void onClick(@RecentlyNonNull View view) {
        View.OnClickListener onClickListener = this.f10309j;
        if (onClickListener != null && view == this.f10308i) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        mo11463a(this.f10306g, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f10308i.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10309j = onClickListener;
        View view = this.f10308i;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@RecentlyNonNull Scope[] scopeArr) {
        mo11463a(this.f10306g, this.f10307h);
    }

    public void setSize(int i) {
        mo11463a(i, this.f10307h);
    }

    public SignInButton(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@RecentlyNonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10309j = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4862d.SignInButton, 0, 0);
        try {
            this.f10306g = obtainStyledAttributes.getInt(C4862d.SignInButton_buttonSize, 0);
            this.f10307h = obtainStyledAttributes.getInt(C4862d.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            mo11463a(this.f10306g, this.f10307h);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
