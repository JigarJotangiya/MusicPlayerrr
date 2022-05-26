package com.coocent.video.videoplayercore.service;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.p030n.C1895q;
import com.bumptech.glide.p047q.C2152g;
import com.bumptech.glide.p047q.p048l.C2166i;
import com.coocent.video.videoplayercore.C2520R;
import p369i.p387z.p389d.C8594l;

/* compiled from: AudioPlayServiceManager.kt */
public final class AudioPlayServiceManager$setMediaSession$2 implements C2152g<Bitmap> {
    final /* synthetic */ MediaMetadataCompat.C0031b $builder;
    final /* synthetic */ AudioPlayServiceManager this$0;

    AudioPlayServiceManager$setMediaSession$2(MediaMetadataCompat.C0031b bVar, AudioPlayServiceManager audioPlayServiceManager) {
        this.$builder = bVar;
        this.this$0 = audioPlayServiceManager;
    }

    public boolean onLoadFailed(C1895q qVar, Object obj, C2166i<Bitmap> iVar, boolean z) {
        C8594l.m46771e(obj, "model");
        MediaMetadataCompat.C0031b bVar = this.$builder;
        AudioPlayService access$getContext$p = this.this$0.context;
        if (access$getContext$p != null) {
            bVar.mo101b("android.media.metadata.ALBUM_ART", BitmapFactory.decodeResource(access$getContext$p.getResources(), C2520R.C2522drawable.video_ic_play_arrow_black_24dp));
            MediaSessionCompat access$getMMediaSession$p = this.this$0.mMediaSession;
            if (access$getMMediaSession$p == null) {
                return false;
            }
            access$getMMediaSession$p.mo167l(this.$builder.mo100a());
            return false;
        }
        C8594l.m46783q("context");
        throw null;
    }

    public boolean onResourceReady(Bitmap bitmap, Object obj, C2166i<Bitmap> iVar, C1744a aVar, boolean z) {
        this.$builder.mo101b("android.media.metadata.ALBUM_ART", bitmap);
        MediaSessionCompat access$getMMediaSession$p = this.this$0.mMediaSession;
        if (access$getMMediaSession$p == null) {
            return false;
        }
        access$getMMediaSession$p.mo167l(this.$builder.mo100a());
        return false;
    }
}
