package com.coocent.video.videoplayercore.player;

import android.media.AudioManager;

/* renamed from: com.coocent.video.videoplayercore.player.a */
/* compiled from: lambda */
public final /* synthetic */ class C2536a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ PlayerHelper f8940a;

    public /* synthetic */ C2536a(PlayerHelper playerHelper) {
        this.f8940a = playerHelper;
    }

    public final void onAudioFocusChange(int i) {
        PlayerHelper.m50315mOnAudioFocusListener$lambda22(this.f8940a, i);
    }
}
