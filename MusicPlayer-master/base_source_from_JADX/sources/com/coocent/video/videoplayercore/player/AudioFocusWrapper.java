package com.coocent.video.videoplayercore.player;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;
import p369i.C8418f;
import p369i.p387z.p389d.C8594l;

/* compiled from: AudioFocusWrapper.kt */
public final class AudioFocusWrapper {
    private final C8418f audioFocusRequest$delegate = C8443h.m46573a(new AudioFocusWrapper$audioFocusRequest$2(this));
    private final AudioAttributesCompat mAudioAttributes;
    private final AudioManager.OnAudioFocusChangeListener mAudioFocusListener;
    private final AudioManager mAudioManager;

    public AudioFocusWrapper(AudioAttributesCompat audioAttributesCompat, AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        C8594l.m46771e(audioAttributesCompat, "mAudioAttributes");
        C8594l.m46771e(audioManager, "mAudioManager");
        C8594l.m46771e(onAudioFocusChangeListener, "mAudioFocusListener");
        this.mAudioAttributes = audioAttributesCompat;
        this.mAudioManager = audioManager;
        this.mAudioFocusListener = onAudioFocusChangeListener;
    }

    private final int abandonAudioFocusOreo() {
        return this.mAudioManager.abandonAudioFocusRequest(getAudioFocusRequest());
    }

    /* access modifiers changed from: private */
    @TargetApi(26)
    public final AudioFocusRequest buildFocusRequest() {
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
        Object d = this.mAudioAttributes.mo4273d();
        Objects.requireNonNull(d, "null cannot be cast to non-null type android.media.AudioAttributes");
        AudioFocusRequest build = builder.setAudioAttributes((AudioAttributes) d).setOnAudioFocusChangeListener(this.mAudioFocusListener).build();
        C8594l.m46770d(build, "Builder(AudioManager.AUD…ner)\n            .build()");
        return build;
    }

    private final AudioFocusRequest getAudioFocusRequest() {
        return (AudioFocusRequest) this.audioFocusRequest$delegate.getValue();
    }

    private final int requestAudioFocusOreo() {
        return this.mAudioManager.requestAudioFocus(getAudioFocusRequest());
    }

    public final void abandonAudioFocus() {
        if (Build.VERSION.SDK_INT >= 26) {
            abandonAudioFocusOreo();
        } else {
            this.mAudioManager.abandonAudioFocus(this.mAudioFocusListener);
        }
    }

    public final void requestAudioFocus() {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = requestAudioFocusOreo();
        } else {
            i = this.mAudioManager.requestAudioFocus(this.mAudioFocusListener, this.mAudioAttributes.mo4272a(), 1);
        }
        if (i == 1) {
            this.mAudioFocusListener.onAudioFocusChange(1);
        }
    }
}
