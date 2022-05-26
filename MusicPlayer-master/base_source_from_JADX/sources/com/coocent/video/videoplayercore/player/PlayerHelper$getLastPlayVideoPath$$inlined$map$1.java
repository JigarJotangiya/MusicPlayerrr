package com.coocent.video.videoplayercore.player;

import kotlinx.coroutines.p397f3.C8729b;
import kotlinx.coroutines.p397f3.C8730c;
import p082e.p126k.p129c.p130i.C3884d;
import p369i.C8457t;
import p369i.p379w.C8508d;

/* compiled from: SafeCollector.common.kt */
public final class PlayerHelper$getLastPlayVideoPath$$inlined$map$1 implements C8729b<String> {
    final /* synthetic */ C8729b $this_unsafeTransform$inlined;

    public PlayerHelper$getLastPlayVideoPath$$inlined$map$1(C8729b bVar) {
        this.$this_unsafeTransform$inlined = bVar;
    }

    public Object collect(final C8730c cVar, C8508d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C8730c<C3884d>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoPath$$inlined$map$1.C25272.C25281
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoPath$$inlined$map$1$2$1 r0 = (com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoPath$$inlined$map$1.C25272.C25281) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoPath$$inlined$map$1$2$1 r0 = new com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoPath$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0051
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r3
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    java.lang.String r2 = "last_play_video_path"
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16601f(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 != 0) goto L_0x0048
                    java.lang.String r5 = ""
                L_0x0048:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0051
                    return r1
                L_0x0051:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.player.PlayerHelper$getLastPlayVideoPath$$inlined$map$1.C25272.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C8527d.m46722d()) {
            return collect;
        }
        return C8457t.f34900a;
    }
}
