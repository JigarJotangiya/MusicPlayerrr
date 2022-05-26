package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;

public class SkinCompatRadioGroup extends RadioGroup implements C9716g {

    /* renamed from: g */
    private C9710a f36782g;

    public SkinCompatRadioGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36782g;
        if (aVar != null) {
            aVar.mo33869b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36782g;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public SkinCompatRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9710a aVar = new C9710a(this);
        this.f36782g = aVar;
        aVar.mo33870c(attributeSet, 0);
    }
}
