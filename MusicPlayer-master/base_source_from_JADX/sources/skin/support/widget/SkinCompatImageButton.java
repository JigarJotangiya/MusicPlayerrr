package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import p082e.p083a.C3400a;

public class SkinCompatImageButton extends AppCompatImageButton implements C9716g {

    /* renamed from: i */
    private C9710a f36769i;

    /* renamed from: j */
    private C9713d f36770j;

    public SkinCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36769i;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9713d dVar = this.f36770j;
        if (dVar != null) {
            dVar.mo33875b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36769i;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setImageResource(int i) {
        C9713d dVar = this.f36770j;
        if (dVar != null) {
            dVar.mo33877d(i);
        }
    }

    public SkinCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.imageButtonStyle);
    }

    public SkinCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36769i = aVar;
        aVar.mo33870c(attributeSet, i);
        C9713d dVar = new C9713d(this);
        this.f36770j = dVar;
        dVar.mo33876c(attributeSet, i);
    }
}
