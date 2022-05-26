package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p082e.p083a.C3400a;

public class SkinCompatButton extends AppCompatButton implements C9716g {

    /* renamed from: i */
    private C9717h f36757i;

    /* renamed from: j */
    private C9710a f36758j;

    public SkinCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36758j;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9717h hVar = this.f36757i;
        if (hVar != null) {
            hVar.mo33882d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36758j;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36757i;
        if (hVar != null) {
            hVar.mo33885j(i, i2, i3, i4);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36757i;
        if (hVar != null) {
            hVar.mo33886k(i, i2, i3, i4);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    public SkinCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.buttonStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9717h hVar = this.f36757i;
        if (hVar != null) {
            hVar.mo33887l(context, i);
        }
    }

    public SkinCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36758j = aVar;
        aVar.mo33870c(attributeSet, i);
        C9717h g = C9717h.m50302g(this);
        this.f36757i = g;
        g.mo33884i(attributeSet, i);
    }
}
