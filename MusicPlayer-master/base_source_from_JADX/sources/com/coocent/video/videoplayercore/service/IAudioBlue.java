package com.coocent.video.videoplayercore.service;

import p369i.p387z.p389d.C8594l;

/* compiled from: IAudioBlue.kt */
public interface IAudioBlue {

    /* compiled from: IAudioBlue.kt */
    public static final class DefaultImpls {
        public static void onBlueNext(IAudioBlue iAudioBlue) {
            C8594l.m46771e(iAudioBlue, "this");
        }

        public static void onBluePause(IAudioBlue iAudioBlue) {
            C8594l.m46771e(iAudioBlue, "this");
        }

        public static void onBluePlay(IAudioBlue iAudioBlue) {
            C8594l.m46771e(iAudioBlue, "this");
        }

        public static void onBluePrevious(IAudioBlue iAudioBlue) {
            C8594l.m46771e(iAudioBlue, "this");
        }
    }

    void onBlueNext();

    void onBluePause();

    void onBluePlay();

    void onBluePrevious();
}
