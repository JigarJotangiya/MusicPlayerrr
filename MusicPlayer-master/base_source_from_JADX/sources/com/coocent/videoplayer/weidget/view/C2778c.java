package com.coocent.videoplayer.weidget.view;

import android.content.DialogInterface;
import com.coocent.video.videoplayercore.service.AudioPlayService;

/* renamed from: com.coocent.videoplayer.weidget.view.c */
/* compiled from: lambda */
public final /* synthetic */ class C2778c implements DialogInterface.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ AudioPlayService f9503g;

    public /* synthetic */ C2778c(AudioPlayService audioPlayService) {
        this.f9503g = audioPlayService;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AudioPlayBackItemView.m12533l(this.f9503g, dialogInterface, i);
    }
}
