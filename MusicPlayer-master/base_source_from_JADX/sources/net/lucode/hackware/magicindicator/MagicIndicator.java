package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.p462a.C9567a;

public class MagicIndicator extends FrameLayout {

    /* renamed from: g */
    private C9567a f36727g;

    public MagicIndicator(Context context) {
        super(context);
    }

    public C9567a getNavigator() {
        return this.f36727g;
    }

    public void setNavigator(C9567a aVar) {
        C9567a aVar2 = this.f36727g;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo32955b();
            }
            this.f36727g = aVar;
            removeAllViews();
            if (this.f36727g instanceof View) {
                addView((View) this.f36727g, new FrameLayout.LayoutParams(-1, -1));
                this.f36727g.mo32954a();
            }
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
