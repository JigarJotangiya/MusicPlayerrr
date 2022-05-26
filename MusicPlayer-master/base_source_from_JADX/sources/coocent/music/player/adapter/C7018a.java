package coocent.music.player.adapter;

import android.view.MotionEvent;
import android.view.View;
import com.coocent.music.base.data.entity.Music;

/* renamed from: coocent.music.player.adapter.a */
/* compiled from: lambda */
public final /* synthetic */ class C7018a implements View.OnTouchListener {

    /* renamed from: g */
    public final /* synthetic */ TrackAdapter f31113g;

    /* renamed from: h */
    public final /* synthetic */ Music f31114h;

    public /* synthetic */ C7018a(TrackAdapter trackAdapter, Music music) {
        this.f31113g = trackAdapter;
        this.f31114h = music;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f31113g.mo26914m(this.f31114h, view, motionEvent);
    }
}
