package com.coocent.video.videoplayercore.service;

import android.support.p001v4.media.session.MediaSessionCompat;

/* compiled from: AudioPlayServiceManager.kt */
public final class AudioPlayServiceManager$initMediaSession$1 extends MediaSessionCompat.C0045b {
    final /* synthetic */ AudioPlayServiceManager this$0;

    AudioPlayServiceManager$initMediaSession$1(AudioPlayServiceManager audioPlayServiceManager) {
        this.this$0 = audioPlayServiceManager;
    }

    public void onPause() {
        super.onPause();
        IAudioBlue access$getMIAudioBlue$p = this.this$0.mIAudioBlue;
        if (access$getMIAudioBlue$p != null) {
            access$getMIAudioBlue$p.onBluePause();
        }
    }

    public void onPlay() {
        super.onPlay();
        IAudioBlue access$getMIAudioBlue$p = this.this$0.mIAudioBlue;
        if (access$getMIAudioBlue$p != null) {
            access$getMIAudioBlue$p.onBluePlay();
        }
    }

    public void onSkipToNext() {
        super.onSkipToNext();
        IAudioBlue access$getMIAudioBlue$p = this.this$0.mIAudioBlue;
        if (access$getMIAudioBlue$p != null) {
            access$getMIAudioBlue$p.onBlueNext();
        }
    }

    public void onSkipToPrevious() {
        super.onSkipToPrevious();
        IAudioBlue access$getMIAudioBlue$p = this.this$0.mIAudioBlue;
        if (access$getMIAudioBlue$p != null) {
            access$getMIAudioBlue$p.onBluePrevious();
        }
    }
}
