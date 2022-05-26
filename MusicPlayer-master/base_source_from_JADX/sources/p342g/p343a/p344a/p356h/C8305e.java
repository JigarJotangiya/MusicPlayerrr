package p342g.p343a.p344a.p356h;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: g.a.a.h.e */
/* compiled from: PopupWindowProxy */
public class C8305e extends PopupWindow {

    /* renamed from: a */
    private final boolean f34720a;

    /* renamed from: b */
    private final boolean f34721b;

    /* renamed from: c */
    private C8304d f34722c;

    public C8305e(View view, int i, int i2, C8304d dVar) {
        super(view, i, i2);
        int i3 = Build.VERSION.SDK_INT;
        boolean z = true;
        this.f34720a = i3 == 24;
        this.f34721b = i3 <= 24 ? false : z;
        this.f34722c = dVar;
    }

    /* renamed from: b */
    private void m45935b(View view) {
        if (view != null) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    view.setSystemUiVisibility(5894);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30036a() {
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo30037c(View view) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                if (view.getSystemUiVisibility() == 5894) {
                    m45935b(view);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dismiss() {
        C8304d dVar = this.f34722c;
        if (dVar != null && dVar.mo30014a() && this.f34722c.mo30015d()) {
            mo30036a();
        }
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (!this.f34720a || view == null) {
            if (this.f34721b) {
                setHeight(-2);
            }
            setFocusable(false);
            super.showAsDropDown(view, i, i2, i3);
            mo30037c(getContentView());
            setFocusable(true);
            update();
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setFocusable(false);
        super.showAtLocation(((Activity) view.getContext()).getWindow().getDecorView(), 0, iArr[0] + i, iArr[1] + view.getHeight() + i2);
        mo30037c(getContentView());
        setFocusable(true);
        update();
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        setFocusable(false);
        super.showAtLocation(view, i, i2, i3);
        mo30037c(getContentView());
        setFocusable(true);
        update();
    }
}
