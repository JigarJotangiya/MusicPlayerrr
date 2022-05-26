package net.coocent.android.xmlparser;

import android.app.Activity;
import android.widget.PopupWindow;

/* renamed from: net.coocent.android.xmlparser.e */
/* compiled from: lambda */
public final /* synthetic */ class C9395e implements PopupWindow.OnDismissListener {

    /* renamed from: g */
    public final /* synthetic */ Activity f36265g;

    public /* synthetic */ C9395e(Activity activity) {
        this.f36265g = activity;
    }

    public final void onDismiss() {
        this.f36265g.finish();
    }
}
