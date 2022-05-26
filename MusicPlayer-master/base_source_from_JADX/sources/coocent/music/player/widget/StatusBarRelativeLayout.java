package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import coocent.music.player.base.BaseApplication;

public class StatusBarRelativeLayout extends RelativeLayout {

    /* renamed from: coocent.music.player.widget.StatusBarRelativeLayout$a */
    class C7169a implements ViewTreeObserver.OnGlobalLayoutListener {
        C7169a() {
        }

        public void onGlobalLayout() {
            StatusBarRelativeLayout.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) StatusBarRelativeLayout.this.getLayoutParams();
            layoutParams.setMargins(0, BaseApplication.f31145H, 0, 0);
            StatusBarRelativeLayout.this.setLayoutParams(layoutParams);
        }
    }

    public StatusBarRelativeLayout(Context context) {
        super(context);
        m40811a();
    }

    /* renamed from: a */
    private void m40811a() {
        getViewTreeObserver().addOnGlobalLayoutListener(new C7169a());
    }

    public StatusBarRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40811a();
    }

    public StatusBarRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40811a();
    }
}
