package coocent.music.player.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import skin.support.widget.SkinCompatImageView;

public class PositionImageView extends SkinCompatImageView {

    /* renamed from: i */
    private C7145b f31618i;

    /* renamed from: coocent.music.player.widget.PositionImageView$b */
    private class C7145b extends Handler {
        private C7145b() {
        }

        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            if (message.what == 0) {
                PositionImageView.this.mo27547r();
            }
        }
    }

    public PositionImageView(Context context) {
        super(context);
    }

    /* renamed from: p */
    private void m40712p() {
        if (this.f31618i == null) {
            this.f31618i = new C7145b();
        }
    }

    /* renamed from: d */
    public void mo27543d() {
        try {
            C7145b bVar = this.f31618i;
            if (bVar != null) {
                bVar.removeCallbacksAndMessages((Object) null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public void mo27544n() {
        C7145b bVar = this.f31618i;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages((Object) null);
            this.f31618i = null;
        }
    }

    /* renamed from: o */
    public void mo27545o() {
        setVisibility(0);
        mo27546q();
    }

    /* renamed from: q */
    public void mo27546q() {
        try {
            if (this.f31618i != null) {
                mo27543d();
                Message message = new Message();
                message.what = 0;
                this.f31618i.sendMessageDelayed(message, 3000);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: r */
    public void mo27547r() {
        setVisibility(8);
    }

    public PositionImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40712p();
    }

    public PositionImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
