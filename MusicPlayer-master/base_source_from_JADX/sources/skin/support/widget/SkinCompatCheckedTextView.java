package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import p443m.p444a.p446d.C9322a;
import p443m.p444a.p447e.p448a.C9335g;

public class SkinCompatCheckedTextView extends AppCompatCheckedTextView implements C9716g {

    /* renamed from: l */
    private static final int[] f36762l = {16843016};

    /* renamed from: i */
    private int f36763i;

    /* renamed from: j */
    private C9717h f36764j;

    /* renamed from: k */
    private C9710a f36765k;

    public SkinCompatCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m50256a() {
        int a = C9712c.m50287a(this.f36763i);
        this.f36763i = a;
        if (a != 0) {
            setCheckMarkDrawable(C9335g.m49448a(getContext(), this.f36763i));
        }
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36765k;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9717h hVar = this.f36764j;
        if (hVar != null) {
            hVar.mo33882d();
        }
        m50256a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36765k;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        this.f36763i = i;
        m50256a();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36764j;
        if (hVar != null) {
            hVar.mo33885j(i, i2, i3, i4);
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        C9717h hVar = this.f36764j;
        if (hVar != null) {
            hVar.mo33886k(i, i2, i3, i4);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(getContext(), i);
    }

    public SkinCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9322a.checkedTextViewStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C9717h hVar = this.f36764j;
        if (hVar != null) {
            hVar.mo33887l(context, i);
        }
    }

    public SkinCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36763i = 0;
        C9710a aVar = new C9710a(this);
        this.f36765k = aVar;
        aVar.mo33870c(attributeSet, i);
        C9717h g = C9717h.m50302g(this);
        this.f36764j = g;
        g.mo33884i(attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36762l, i, 0);
        this.f36763i = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        m50256a();
    }
}
