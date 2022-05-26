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

public class Widget4x4Grid extends AppWidgetProvider {

    /* renamed from: b */
    public static final String f31808b = Widget4x4Grid.class.getSimpleName();

    /* renamed from: c */
    private static Widget4x4Grid f31809c;

    /* renamed from: a */
    private int[] f31810a = null;

    /* renamed from: coocent.music.player.widget.desktop.Widget4x4Grid$a */
    class C7183a extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ RemoteViews f31811j;

        /* renamed from: k */
        final /* synthetic */ MusicService f31812k;

        C7183a(RemoteViews remoteViews, MusicService musicService) {
            this.f31811j = remoteViews;
            this.f31812k = musicService;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f31811j.setImageViewBitmap(R.id.widget_iv_album_pic, ((BitmapDrawable) drawable).getBitmap());
            Widget4x4Grid.this.mo27703e(this.f31812k, this.f31811j);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f31811j.setImageViewResource(R.id.widget_iv_album_pic, R.drawable.homepage_album_cover_default2);
            Widget4x4Grid.this.mo27703e(this.f31812k, this.f31811j);
        }
    }

    /* renamed from: a */
    private void m40853a(MusicService musicService, RemoteViews remoteViews, Music music) {
        if (music != null) {
            C1719b.m8597t(musicService).mo7665u(C8314f.m45973b(C8345u.m46327h(), 0, music.mo9215k(), music.mo9205d())).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8386h()).mo8375Z(R.drawable.homepage_album_cover_default2)).mo8391j(R.drawable.homepage_album_cover_default2)).mo8374X(C8345u.m46323d(100), C8345u.m46323d(100))).mo8379c()).mo7643w0(new C7183a(remoteViews, musicService));
        }
    }

    /* renamed from: b */
    public static synchronized Widget4x4Grid m40854b() {
        Widget4x4Grid widget4x4Grid;
        synchronized (Widget4x4Grid.class) {
            if (f31809c == null) {
                f31809c = new Widget4x4Grid();
            }
            widget4x4Grid = f31809c;
        }
        return widget4x4Grid;
    }

    /* renamed from: c */
    public RemoteViews mo27701c(Context context, String str) {
        return new RemoteViews(context.getPackageName(), R.layout.widget_4x4_grid);
    }

    /* renamed from: d */
    public void mo27702d(MusicService musicService) {
        Log.e("widget", "performUpdate");
        RemoteViews remoteViews = new RemoteViews(musicService.getPackageName(), R.layout.widget_4x4_grid);
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
        m40853a(musicService, remoteViews, s);
        remoteViews.setOnClickPendingIntent(R.id.widgetLayout, PendingIntent.getActivity(musicService, 0, new Intent(musicService, LibraryActivity.class), 134217728));
        mo27703e(musicService, remoteViews);
    }

    /* renamed from: e */
    public void mo27703e(Context context, RemoteViews remoteViews) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.f31810a;
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
            this.f31810a = iArr;
            Intent intent = new Intent(f31808b);
            intent.addFlags(1073741824);
            context.sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
