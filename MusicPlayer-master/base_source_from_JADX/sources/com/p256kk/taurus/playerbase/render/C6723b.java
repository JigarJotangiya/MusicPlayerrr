package com.p256kk.taurus.playerbase.render;

import android.view.View;
import com.p256kk.taurus.playerbase.player.C6709a;

/* renamed from: com.kk.taurus.playerbase.render.b */
/* compiled from: IRender */
public interface C6723b {

    /* renamed from: com.kk.taurus.playerbase.render.b$a */
    /* compiled from: IRender */
    public interface C6724a {
        /* renamed from: a */
        void mo25884a(C6725b bVar);

        /* renamed from: b */
        void mo25885b(C6725b bVar, int i, int i2, int i3);

        /* renamed from: c */
        void mo25886c(C6725b bVar, int i, int i2);
    }

    /* renamed from: com.kk.taurus.playerbase.render.b$b */
    /* compiled from: IRender */
    public interface C6725b {
        /* renamed from: a */
        void mo26130a(C6709a aVar);
    }

    /* renamed from: a */
    void mo26118a();

    /* renamed from: b */
    void mo26119b(int i, int i2);

    /* renamed from: c */
    void mo26120c(C6722a aVar);

    /* renamed from: d */
    void mo26121d(int i, int i2);

    /* renamed from: e */
    boolean mo26122e();

    View getRenderView();

    void setRenderCallback(C6724a aVar);

    void setVideoRotation(int i);
}
