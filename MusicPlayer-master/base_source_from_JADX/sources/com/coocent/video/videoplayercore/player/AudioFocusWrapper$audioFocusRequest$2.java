package com.coocent.video.videoplayercore.player;

import android.media.AudioFocusRequest;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p389d.C8595m;

/* compiled from: AudioFocusWrapper.kt */
final class AudioFocusWrapper$audioFocusRequest$2 extends C8595m implements C8559a<AudioFocusRequest> {
    final /* synthetic */ AudioFocusWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AudioFocusWrapper$audioFocusRequest$2(AudioFocusWrapper audioFocusWrapper) {
        super(0);
        this.this$0 = audioFocusWrapper;
    }

    public final AudioFocusRequest invoke() {
        return this.this$0.buildFocusRequest();
    }
}
