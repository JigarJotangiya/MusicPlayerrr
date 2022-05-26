package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class SkinCompatTextView extends AppCompatTextView implements C9716g {

    /* renamed from: k */
    private C9717h f36791k;

    /* renamed from: l */
    private C9710a f36792l;

    public SkinCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36792l;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9717h hVar = this.f36791k;
        if (hVar != null) {
            hVar.mo33882d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36792l;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36791k;
        if (hVar != null) {
            hVar.mo33885j(i, i2, i3, i4);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36791k;
        if (hVar != null) {
            hVar.mo33886k(i, i2, i3, i4);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    public SkinCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9717h hVar = this.f36791k;
        if (hVar != null) {
            hVar.mo33887l(context, i);
        }
    }

    public SkinCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36792l = aVar;
        aVar.mo33870c(attributeSet, i);
        C9717h g = C9717h.m50302g(this);
        this.f36791k = g;
        g.mo33884i(attributeSet, i);
    }
}
