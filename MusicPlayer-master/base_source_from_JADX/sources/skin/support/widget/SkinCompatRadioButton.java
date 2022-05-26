package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import p443m.p444a.p446d.C9322a;

public class SkinCompatRadioButton extends AppCompatRadioButton implements C9716g {

    /* renamed from: j */
    private C9717h f36779j;

    /* renamed from: k */
    private C9711b f36780k;

    /* renamed from: l */
    private C9710a f36781l;

    public SkinCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36781l;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9711b bVar = this.f36780k;
        if (bVar != null) {
            bVar.mo33872b();
        }
        C9717h hVar = this.f36779j;
        if (hVar != null) {
            hVar.mo33882d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36781l;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setButtonDrawable(int i) {
        super.setButtonDrawable(i);
        C9711b bVar = this.f36780k;
        if (bVar != null) {
            bVar.mo33874d(i);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36779j;
        if (hVar != null) {
            hVar.mo33885j(i, i2, i3, i4);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36779j;
        if (hVar != null) {
            hVar.mo33886k(i, i2, i3, i4);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    public SkinCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.radioButtonStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9717h hVar = this.f36779j;
        if (hVar != null) {
            hVar.mo33887l(context, i);
        }
    }

    public SkinCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9711b bVar = new C9711b(this);
        this.f36780k = bVar;
        bVar.mo33873c(attributeSet, i);
        C9717h g = C9717h.m50302g(this);
        this.f36779j = g;
        g.mo33884i(attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36781l = aVar;
        aVar.mo33870c(attributeSet, i);
    }
}
