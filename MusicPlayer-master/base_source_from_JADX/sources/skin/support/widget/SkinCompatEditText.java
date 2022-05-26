package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import p082e.p083a.C3400a;

public class SkinCompatEditText extends AppCompatEditText implements C9716g {

    /* renamed from: j */
    private C9717h f36766j;

    /* renamed from: k */
    private C9710a f36767k;

    public SkinCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36767k;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9717h hVar = this.f36766j;
        if (hVar != null) {
            hVar.mo33882d();
        }
    }

    public int getTextColorResId() {
        C9717h hVar = this.f36766j;
        if (hVar != null) {
            return hVar.mo33883h();
        }
        return 0;
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36767k;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36766j;
        if (hVar != null) {
            hVar.mo33885j(i, i2, i3, i4);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36766j;
        if (hVar != null) {
            hVar.mo33886k(i, i2, i3, i4);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    public SkinCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.editTextStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9717h hVar = this.f36766j;
        if (hVar != null) {
            hVar.mo33887l(context, i);
        }
    }

    public SkinCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36767k = aVar;
        aVar.mo33870c(attributeSet, i);
        C9717h g = C9717h.m50302g(this);
        this.f36766j = g;
        g.mo33884i(attributeSet, i);
    }
}
