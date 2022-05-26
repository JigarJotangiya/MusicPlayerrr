package coocent.music.player.widget.desktop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.coocent.music.base.data.entity.Music;
import java.lang.ref.SoftReference;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p347d.C7973c;
import p342g.p343a.p344a.p358i.C8312d;

/* renamed from: coocent.music.player.widget.desktop.a */
/* compiled from: MyRemoteViewsFactory */
public class C7184a implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    private final Context f31816a;

    /* renamed from: b */
    private List<Music> f31817b;

    public C7184a(Context context, Intent intent) {
        this.f31816a = context;
        List<Music> e = C7973c.m43649d(context).mo29507e();
        this.f31817b = e;
        if (e != null && e.size() > 0) {
            Widget4x4List.f31815b = true;
        }
    }

    /* renamed from: a */
    private RemoteViews m40861a(int i) {
        RemoteViews remoteViews = new RemoteViews(this.f31816a.getPackageName(), R.layout.widget_4x4_item);
        List<Music> list = this.f31817b;
        if (!(list == null || list.size() <= 0 || this.f31817b.get(i) == null)) {
            remoteViews.setTextViewText(R.id.titleTxt, this.f31817b.get(i).mo9218n());
            remoteViews.setTextViewText(R.id.artistTxt, this.f31817b.get(i).mo9210g());
            remoteViews.setTextViewText(R.id.timeTxt, m40862b(this.f31817b.get(i).mo9214j()));
            SoftReference<Bitmap> b = C8312d.m45965b(this.f31816a, (int) this.f31817b.get(i).mo9205d());
            if (b == null || b.get() == null) {
                remoteViews.setImageViewResource(R.id.circleMusic, R.drawable.icon_white);
            } else {
                remoteViews.setImageViewBitmap(R.id.circleMusic, b.get());
            }
        }
        return remoteViews;
    }

    /* renamed from: b */
    private String m40862b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 1000;
        if (i2 > 60) {
            sb.append(i2 / 60);
            sb.append(":");
            i2 %= 60;
        } else {
            sb.append("0:");
        }
        if (i2 < 10) {
            sb.append("0");
        }
        sb.append(i2);
        return sb.toString();
    }

    public int getCount() {
        List<Music> list = this.f31817b;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f31817b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i) {
        if (this.f31817b == null) {
            this.f31817b = C7973c.m43649d(this.f31816a).mo29507e();
        }
        if (i < 0 || i >= this.f31817b.size()) {
            return null;
        }
        RemoteViews a = m40861a(i);
        Intent intent = new Intent();
        intent.putExtra("LIST_POSITION", i);
        a.setOnClickFillInIntent(R.id.rl_item_layout, intent);
        return a;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
    }

    public void onDataSetChanged() {
    }

    public void onDestroy() {
    }
}
