package net.coocent.android.xmlparser.widget.dialog;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.C0133c;
import net.coocent.android.xmlparser.update.UpdateResult;

/* renamed from: net.coocent.android.xmlparser.widget.dialog.d */
/* compiled from: lambda */
public final /* synthetic */ class C9523d implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ UpdateResult f36556g;

    /* renamed from: h */
    public final /* synthetic */ Context f36557h;

    /* renamed from: i */
    public final /* synthetic */ C0133c f36558i;

    public /* synthetic */ C9523d(UpdateResult updateResult, Context context, C0133c cVar) {
        this.f36556g = updateResult;
        this.f36557h = context;
        this.f36558i = cVar;
    }

    public final void onClick(View view) {
        DialogHelper.m50005f(this.f36556g, this.f36557h, this.f36558i, view);
    }
}
