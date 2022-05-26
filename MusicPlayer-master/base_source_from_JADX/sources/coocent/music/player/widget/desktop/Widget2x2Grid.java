package coocent.music.player.widget.desktop;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.RemoteViews;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2164g;
import com.bumptech.glide.p047q.p049m.C2172b;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import coocent.music.player.service.MusicService;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8345u;

public class Widget2x2Grid extends AppWidgetProvider {

    /* renamed from: b */
    public static final String f31796b = Widget2x2Grid.class.getSimpleName();

    /* renamed from: c */
    private static Widget2x2Grid f31797c;

    /* renamed from: a */
    private int[] f31798a = null;

    /* renamed from: coocent.music.player.widget.desktop.Widget2x2Grid$a */
    class C7181a extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ RemoteViews f31799j;

        /* renamed from: k */
        final /* synthetic */ MusicService f31800k;

        C7181a(RemoteViews remoteViews, MusicService musicService) {
            this.f31799j = remoteViews;
            this.f31800k = musicService;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f31799j.setImageViewBitmap(R.id.widget_iv_album_pic, ((BitmapDrawable) drawable).getBitmap());
            Widget2x2Grid.this.mo27693e(this.f31800k, this.f31799j);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f31799j.setImageViewResource(R.id.widget_iv_album_pic, R.drawable.homepage_album_cover_default2);
            Widget2x2Grid.this.mo27693e(this.f31800k, this.f31799j);
        }
    }

    /* renamed from: a */
    private void m40837a(MusicService musicService, RemoteViews remoteViews, Music music) {
        if (music != null) {
            C1719b.m8597t(musicService).mo7665u(C8314f.m45973b(C8345u.m46327h(), 0, music.mo9215k(), music.mo9205d())).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8386h()).mo8375Z(R.drawable.homepage_album_cover_default2)).mo8391j(R.drawable.homepage_album_cover_default2)).mo8374X(C8345u.m46323d(100), C8345u.m46323d(100))).mo8379c()).mo7643w0(new C7181a(remoteViews, musicService));
        }
    }

    /* renamed from: b */
    public static synchronized Widget2x2Grid m40838b() {
        Widget2x2Grid widget2x2Grid;
        synchronized (Widget2x2Grid.class) {
            if (f31797c == null) {
                f31797c = new Widget2x2Grid();
            }
            widget2x2Grid = f31797c;
        }
        return widget2x2Grid;
    }

    /* renamed from: c */
    public RemoteViews mo27691c(Context context, String str) {
        return new RemoteViews(context.getPackageName(), R.layout.widget_4x1);
    }

    /* renamed from: d */
    public void mo27692d(MusicService musicService) {
        Log.e("widget", "performUpdate");
        RemoteViews remoteViews = new RemoteViews(musicService.getPackageName(), R.layout.widget_2x2_grid);
        Music s = musicService.f31300x.mo27200s();
        if (s == null) {
            s = new Music();
            s.mo9202C("localVideo");
            s.mo9224t("unknown artist");
            s.mo9222r(0);
        }
        remoteViews.setTextViewText(R.id.widget_tv_small_music_title, s.mo9218n());
        remoteViews.setTextViewText(R.id.widget_tv_small_music_artist, s.mo9210g());
        remoteViews.setImageViewResource(R.id.btnPlay, musicService.f31300x.mo27162Q() ? R.drawable.desktop_4and1_button04_pause_select : R.drawable.desktop_4and1_button02_play_select);
        Intent intent = new Intent(musicService, MusicService.class);
        intent.setAction("media.musicplayer.audioplayer.videoplayer.toggle.openMusic.pause.action");
        intent.addFlags(32);
        remoteViews.setOnClickPendingIntent(R.id.btnPlay, PendingIntent.getService(musicService, 0, intent, 134217728));
        Intent intent2 = new Intent(musicService, MusicService.class);
        intent2.setAction("media.musicplayer.audioplayer.videoplayer.prve.openMusic.action");
        remoteViews.setOnClickPendingIntent(R.id.btnPrevious, PendingIntent.getService(musicService, 0, intent2, 134217728));
        Intent intent3 = new Intent(musicService, MusicService.class);
        intent3.setAction("media.musicplayer.audioplayer.videoplayer.next.openMusic.action");
        remoteViews.setOnClickPendingIntent(R.id.btnNext, PendingIntent.getService(musicService, 0, intent3, 134217728));
        m40837a(musicService, remoteViews, s);
        remoteViews.setOnClickPendingIntent(R.id.widgetLayout, PendingIntent.getActivity(musicService, 0, new Intent(musicService, LibraryActivity.class), 134217728));
        mo27693e(musicService, remoteViews);
    }

    /* renamed from: e */
    public void mo27693e(Context context, RemoteViews remoteViews) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.f31798a;
        if (iArr != null) {
            instance.updateAppWidget(iArr, remoteViews);
        } else {
            instance.updateAppWidget(new ComponentName(context, getClass()), remoteViews);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        try {
            context.startService(new Intent(context, MusicService.class));
            this.f31798a = iArr;
            Intent intent = new Intent(f31796b);
            intent.addFlags(1073741824);
            context.sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
