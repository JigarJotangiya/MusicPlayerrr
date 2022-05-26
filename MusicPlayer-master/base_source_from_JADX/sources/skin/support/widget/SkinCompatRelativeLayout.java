package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SkinCompatRelativeLayout extends RelativeLayout implements C9716g {

    /* renamed from: g */
    private C9710a f36784g;

    public SkinCompatRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36784g;
        if (aVar != null) {
            aVar.mo33869b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36784g;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public SkinCompatRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinCompatRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36784g = aVar;
        aVar.mo33870c(attributeSet, i);
    }
}
