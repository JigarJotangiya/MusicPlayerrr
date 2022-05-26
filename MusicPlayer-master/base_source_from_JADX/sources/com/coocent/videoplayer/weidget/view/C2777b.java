package com.coocent.videoplayer.weidget.view;

import android.view.View;
import com.coocent.video.videoplayercore.service.AudioPlayService;

/* renamed from: com.coocent.videoplayer.weidget.view.b */
/* compiled from: lambda */
public final /* synthetic */ class C2777b implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ AudioPlayService f9502g;

    public /* synthetic */ C2777b(AudioPlayService audioPlayService) {
        this.f9502g = audioPlayService;
    }

    public final void onClick(View view) {
        AudioPlayBackItemView.m12530i(this.f9502g, view);
    }
}
