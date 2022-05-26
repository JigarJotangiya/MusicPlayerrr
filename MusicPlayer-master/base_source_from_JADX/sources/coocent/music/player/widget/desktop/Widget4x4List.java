package coocent.music.player.widget.desktop;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import coocent.music.player.service.MusicService;
import p342g.p343a.p344a.p358i.C8345u;

public class Widget4x4List extends AppWidgetProvider {

    /* renamed from: a */
    public static final String f31814a = Widget4x4List.class.getSimpleName();

    /* renamed from: b */
    public static boolean f31815b;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if ("media.musicplayer.audioplayer.videoplayer.com.coocent.music.itemclick".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("LIST_POSITION", 0);
            Intent intent2 = new Intent("media.musicplayer.audioplayer.videoplayer.widget_list_item_click");
            intent2.putExtra("LIST_POSITION", intExtra);
            context.sendBroadcast(intent2.setPackage(C8345u.m46327h().getPackageName()));
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        try {
            context.startService(new Intent(context, MusicService.class));
            Intent intent = new Intent(f31814a);
            intent.addFlags(1073741824);
            context.sendBroadcast(intent.setPackage(C8345u.m46327h().getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
