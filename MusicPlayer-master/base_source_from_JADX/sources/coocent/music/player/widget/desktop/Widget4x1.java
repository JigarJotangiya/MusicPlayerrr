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

public class Widget4x1 extends AppWidgetProvider {

    /* renamed from: b */
    public static final String f31802b = Widget4x1.class.getSimpleName();

    /* renamed from: c */
    private static Widget4x1 f31803c;

    /* renamed from: a */
    private int[] f31804a = null;

    /* renamed from: coocent.music.player.widget.desktop.Widget4x1$a */
    class C7182a extends C2164g<Drawable> {

        /* renamed from: j */
        final /* synthetic */ RemoteViews f31805j;

        /* renamed from: k */
        final /* synthetic */ MusicService f31806k;

        C7182a(RemoteViews remoteViews, MusicService musicService) {
            this.f31805j = remoteViews;
            this.f31806k = musicService;
        }

        /* renamed from: d */
        public void mo8222c(Drawable drawable, C2172b<? super Drawable> bVar) {
            this.f31805j.setImageViewBitmap(R.id.widget_iv_album_pic, ((BitmapDrawable) drawable).getBitmap());
            Widget4x1.this.mo27698e(this.f31806k, this.f31805j);
        }

        /* renamed from: f */
        public void mo8430f(Drawable drawable) {
            super.mo8430f(drawable);
            this.f31805j.setImageViewResource(R.id.widget_iv_album_pic, R.drawable.homepage_album_cover_default2);
            Widget4x1.this.mo27698e(this.f31806k, this.f31805j);
        }
    }

    /* renamed from: a */
    private void m40845a(MusicService musicService, RemoteViews remoteViews, Music music) {
        if (music != null) {
            C1719b.m8597t(musicService).mo7665u(C8314f.m45973b(C8345u.m46327h(), 0, music.mo9215k(), music.mo9205d())).mo7637a((C2153h) ((C2153h) ((C2153h) ((C2153h) ((C2153h) new C2153h().mo8386h()).mo8375Z(R.drawable.homepage_album_cover_default2)).mo8391j(R.drawable.homepage_album_cover_default2)).mo8374X(C8345u.m46323d(100), C8345u.m46323d(100))).mo8379c()).mo7643w0(new C7182a(remoteViews, musicService));
        }
    }

    /* renamed from: b */
    public static synchronized Widget4x1 m40846b() {
        Widget4x1 widget4x1;
        synchronized (Widget4x1.class) {
            if (f31803c == null) {
                f31803c = new Widget4x1();
            }
            widget4x1 = f31803c;
        }
        return widget4x1;
    }

    /* renamed from: c */
    public RemoteViews mo27696c(Context context, String str) {
        return new RemoteViews(context.getPackageName(), R.layout.widget_4x1);
    }

    /* renamed from: d */
    public void mo27697d(MusicService musicService) {
        Log.e("widget", "performUpdate");
        RemoteViews remoteViews = new RemoteViews(musicService.getPackageName(), R.layout.widget_4x1);
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
        m40845a(musicService, remoteViews, s);
        remoteViews.setOnClickPendingIntent(R.id.widgetLayout, PendingIntent.getActivity(musicService, 0, new Intent(musicService, LibraryActivity.class), 134217728));
        mo27698e(musicService, remoteViews);
    }

    /* renamed from: e */
    public void mo27698e(Context context, RemoteViews remoteViews) {
        try {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            int[] iArr = this.f31804a;
            if (iArr != null) {
                instance.updateAppWidget(iArr, remoteViews);
            } else {
                instance.updateAppWidget(new ComponentName(context, getClass()), remoteViews);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        try {
            context.startService(new Intent(context, MusicService.class));
            this.f31804a = iArr;
            Intent intent = new Intent(f31802b);
            intent.addFlags(1073741824);
            context.sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
