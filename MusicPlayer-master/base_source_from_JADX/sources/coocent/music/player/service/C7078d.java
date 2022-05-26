package coocent.music.player.service;

import com.coocent.music.base.data.entity.Music;

/* renamed from: coocent.music.player.service.d */
/* compiled from: lambda */
public final /* synthetic */ class C7078d implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ MusicService f31351g;

    /* renamed from: h */
    public final /* synthetic */ Music f31352h;

    public /* synthetic */ C7078d(MusicService musicService, Music music) {
        this.f31351g = musicService;
        this.f31352h = music;
    }

    public final void run() {
        this.f31351g.mo27116n1(this.f31352h);
    }
}
