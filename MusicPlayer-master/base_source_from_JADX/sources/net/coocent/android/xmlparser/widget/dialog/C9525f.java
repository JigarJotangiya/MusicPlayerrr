package net.coocent.android.xmlparser.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.C0133c;
import net.coocent.android.xmlparser.update.UpdateResult;

/* renamed from: net.coocent.android.xmlparser.widget.dialog.f */
/* compiled from: lambda */
public final /* synthetic */ class C9525f implements DialogInterface.OnShowListener {

    /* renamed from: g */
    public final /* synthetic */ C0133c f36560g;

    /* renamed from: h */
    public final /* synthetic */ UpdateResult f36561h;

    /* renamed from: i */
    public final /* synthetic */ Context f36562i;

    public /* synthetic */ C9525f(C0133c cVar, UpdateResult updateResult, Context context) {
        this.f36560g = cVar;
        this.f36561h = updateResult;
        this.f36562i = context;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f36560g.mo624e(-1).setOnClickListener(new C9523d(this.f36561h, this.f36562i, this.f36560g));
    }
}
