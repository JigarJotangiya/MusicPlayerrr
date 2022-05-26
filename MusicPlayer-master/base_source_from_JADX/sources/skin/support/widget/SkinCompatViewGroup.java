package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class SkinCompatViewGroup extends ViewGroup implements C9716g {

    /* renamed from: g */
    private C9710a f36798g;

    public SkinCompatViewGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36798g;
        if (aVar != null) {
            aVar.mo33869b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36798g;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public SkinCompatViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinCompatViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36798g = aVar;
        aVar.mo33870c(attributeSet, i);
    }
}
