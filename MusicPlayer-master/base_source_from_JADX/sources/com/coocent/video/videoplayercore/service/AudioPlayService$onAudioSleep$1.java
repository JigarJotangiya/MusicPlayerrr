package com.coocent.video.videoplayercore.service;

import android.os.CountDownTimer;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import p369i.p387z.p389d.C8594l;

/* compiled from: AudioPlayService.kt */
public final class AudioPlayService$onAudioSleep$1 extends CountDownTimer {
    final /* synthetic */ long $sleepTimeMs;
    final /* synthetic */ AudioPlayService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AudioPlayService$onAudioSleep$1(AudioPlayService audioPlayService, long j) {
        super(j, 1000);
        this.this$0 = audioPlayService;
        this.$sleepTimeMs = j;
    }

    public void onFinish() {
        this.this$0.onAudioRelease();
    }

    public void onTick(long j) {
        PlayerHelper access$getMPlayerHelper$p = this.this$0.mPlayerHelper;
        if (access$getMPlayerHelper$p != null) {
            access$getMPlayerHelper$p.setSleepTime(j);
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }
}
