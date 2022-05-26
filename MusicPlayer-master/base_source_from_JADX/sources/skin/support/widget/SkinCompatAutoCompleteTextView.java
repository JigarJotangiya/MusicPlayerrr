package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import p443m.p444a.p446d.C9322a;
import p443m.p444a.p447e.p448a.C9335g;

public class SkinCompatAutoCompleteTextView extends AppCompatAutoCompleteTextView implements C9716g {

    /* renamed from: m */
    private static final int[] f36753m = {16843126};

    /* renamed from: j */
    private int f36754j;

    /* renamed from: k */
    private C9717h f36755k;

    /* renamed from: l */
    private C9710a f36756l;

    public SkinCompatAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m50252a() {
        Drawable a;
        int a2 = C9712c.m50287a(this.f36754j);
        this.f36754j = a2;
        if (a2 != 0 && (a = C9335g.m49448a(getContext(), this.f36754j)) != null) {
            setDropDownBackgroundDrawable(a);
        }
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36756l;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9717h hVar = this.f36755k;
        if (hVar != null) {
            hVar.mo33882d();
        }
        m50252a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36756l;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36755k;
        if (hVar != null) {
            hVar.mo33885j(i, i2, i3, i4);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36755k;
        if (hVar != null) {
            hVar.mo33886k(i, i2, i3, i4);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        super.setDropDownBackgroundResource(i);
        this.f36754j = i;
        m50252a();
    }

    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    public SkinCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.autoCompleteTextViewStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9717h hVar = this.f36755k;
        if (hVar != null) {
            hVar.mo33887l(context, i);
        }
    }

    public SkinCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36754j = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36753m, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f36754j = obtainStyledAttributes.getResourceId(0, 0);
        }
        obtainStyledAttributes.recycle();
        m50252a();
        C9710a aVar = new C9710a(this);
        this.f36756l = aVar;
        aVar.mo33870c(attributeSet, i);
        C9717h g = C9717h.m50302g(this);
        this.f36755k = g;
        g.mo33884i(attributeSet, i);
    }
}
