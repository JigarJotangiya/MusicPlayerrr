package net.coocent.android.xmlparser.update;

import android.content.DialogInterface;

/* renamed from: net.coocent.android.xmlparser.update.c */
/* compiled from: lambda */
public final /* synthetic */ class C9499c implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    public static final /* synthetic */ C9499c f36487g = new C9499c();

    private /* synthetic */ C9499c() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        UpdateManager.mDownloadCompletedDialogShowed = false;
    }
}
