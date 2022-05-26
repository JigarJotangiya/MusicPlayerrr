package com.coocent.video.videoplayercore.player;

import kotlinx.coroutines.p397f3.C8729b;
import kotlinx.coroutines.p397f3.C8730c;
import p082e.p126k.p129c.p130i.C3884d;
import p369i.C8457t;
import p369i.p379w.C8508d;

/* compiled from: SafeCollector.common.kt */
public final class PlayerHelper$getLastPlayVideoId$$inlined$map$1 implements C8729b<Long> {
    final /* synthetic */ boolean $isEncrypted$inlined;
    final /* synthetic */ C8729b $this_unsafeTransform$inlined;

    public PlayerHelper$getLastPlayVideoId$$inlined$map$1(C8729b bVar, boolean z) {
        this.$this_unsafeTransform$inlined = bVar;
        this.$isEncrypted$inlined = z;
    }

    public Object collect(final C8730c cVar, C8508d dVar) {
        C8729b bVar = this.$this_unsafeTransform$inlined;
        final boolean z = this.$isEncrypted$inlined;
        Object collect = bVar.collect(new C8730c<C3884d>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r7, p369i.p379w.C8508d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoId$$inlined$map$1.C25252.C25261
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoId$$inlined$map$1$2$1 r0 = (com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoId$$inlined$map$1.C25252.C25261) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoId$$inlined$map$1$2$1 r0 = new com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoId$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r8)
                    goto L_0x0061
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    p369i.C8450m.m46575b(r8)
                    kotlinx.coroutines.f3.c r8 = r4
                    e.k.c.i.d r7 = (p082e.p126k.p129c.p130i.C3884d) r7
                    boolean r2 = r2
                    if (r2 == 0) goto L_0x003f
                    java.lang.String r2 = "last_play_encrypted_video_id"
                    goto L_0x0041
                L_0x003f:
                    java.lang.String r2 = "last_play_video_id"
                L_0x0041:
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16600e(r2)
                    java.lang.Object r7 = r7.mo13377b(r2)
                    java.lang.Long r7 = (java.lang.Long) r7
                    if (r7 != 0) goto L_0x0050
                    r4 = -1
                    goto L_0x0054
                L_0x0050:
                    long r4 = r7.longValue()
                L_0x0054:
                    java.lang.Long r7 = p369i.p379w.p381j.p382a.C8529b.m46725c(r4)
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x0061
                    return r1
                L_0x0061:
                    i.t r7 = p369i.C8457t.f34900a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoId$$inlined$map$1.C25252.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C8527d.m46722d()) {
            return collect;
        }
        return C8457t.f34900a;
    }
}
