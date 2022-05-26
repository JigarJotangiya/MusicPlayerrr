package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class SkinCompatImageView extends AppCompatImageView implements C9716g {

    /* renamed from: g */
    private C9710a f36771g;

    /* renamed from: h */
    private C9713d f36772h;

    public SkinCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public void mo33834f() {
        C9710a aVar = this.f36771g;
        if (aVar != null) {
            aVar.mo33869b();
        }
        C9713d dVar = this.f36772h;
        if (dVar != null) {
            dVar.mo33875b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C9710a aVar = this.f36771g;
        if (aVar != null) {
            aVar.mo33871d(i);
        }
    }

    public void setImageResource(int i) {
        C9713d dVar = this.f36772h;
        if (dVar != null) {
            dVar.mo33877d(i);
        }
    }

    public SkinCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9710a aVar = new C9710a(this);
        this.f36771g = aVar;
        aVar.mo33870c(attributeSet, i);
        C9713d dVar = new C9713d(this);
        this.f36772h = dVar;
        dVar.mo33876c(attributeSet, i);
    }
}
