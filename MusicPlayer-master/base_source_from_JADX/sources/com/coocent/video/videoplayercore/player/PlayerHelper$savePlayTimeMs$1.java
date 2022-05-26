package com.coocent.video.videoplayercore.player;

import com.coocent.videostore.p066db.C2799c;
import com.coocent.videostore.p066db.VideoStoreDatabase;
import com.coocent.videostore.p067po.Video;
import kotlinx.coroutines.C8902r0;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;

@C8533f(mo30599c = "com.coocent.video.videoplayercore.player.PlayerHelper$savePlayTimeMs$1", mo30600f = "PlayerHelper.kt", mo30601l = {539}, mo30602m = "invokeSuspend")
/* compiled from: PlayerHelper.kt */
final class PlayerHelper$savePlayTimeMs$1 extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
    final /* synthetic */ long $playTimeMs;
    final /* synthetic */ Video $video;
    int label;
    final /* synthetic */ PlayerHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PlayerHelper$savePlayTimeMs$1(PlayerHelper playerHelper, Video video, long j, C8508d<? super PlayerHelper$savePlayTimeMs$1> dVar) {
        super(2, dVar);
        this.this$0 = playerHelper;
        this.$video = video;
        this.$playTimeMs = j;
    }

    public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
        return new PlayerHelper$savePlayTimeMs$1(this.this$0, this.$video, this.$playTimeMs, dVar);
    }

    public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
        return ((PlayerHelper$savePlayTimeMs$1) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = C8527d.m46722d();
        int i = this.label;
        if (i == 0) {
            C8450m.m46575b(obj);
            C2799c F = ((VideoStoreDatabase) VideoStoreDatabase.f9515n.mo15566a(this.this$0.mApplicationContext)).mo10390F();
            long l = this.$video.mo10553l();
            long j = this.$playTimeMs;
            this.label = 1;
            if (F.mo10408i(l, j, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C8450m.m46575b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C8457t.f34900a;
    }
}
