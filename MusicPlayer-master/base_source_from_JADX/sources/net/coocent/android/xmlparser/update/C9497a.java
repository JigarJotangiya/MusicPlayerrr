package net.coocent.android.xmlparser.update;

import android.content.DialogInterface;

/* renamed from: net.coocent.android.xmlparser.update.a */
/* compiled from: lambda */
public final /* synthetic */ class C9497a implements DialogInterface.OnDismissListener {

    /* renamed from: g */
    public static final /* synthetic */ C9497a f36479g = new C9497a();

    private /* synthetic */ C9497a() {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        UpdateManager.mDownloadCompletedDialogShowed = false;
    }
}
