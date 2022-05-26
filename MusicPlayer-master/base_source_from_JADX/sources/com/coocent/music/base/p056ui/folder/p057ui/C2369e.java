package com.coocent.music.base.p056ui.folder.p057ui;

import android.content.DialogInterface;

/* renamed from: com.coocent.music.base.ui.folder.ui.e */
/* compiled from: lambda */
public final /* synthetic */ class C2369e implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ FilePickerActivity f8293g;

    /* renamed from: h */
    public final /* synthetic */ String f8294h;

    public /* synthetic */ C2369e(FilePickerActivity filePickerActivity, String str) {
        this.f8293g = filePickerActivity;
        this.f8294h = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8293g.mo9305p2(this.f8294h, dialogInterface, i);
    }
}
