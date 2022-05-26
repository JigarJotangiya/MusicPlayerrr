package p342g.p343a.p344a.p358i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import p159f.p166c.p181e.p182a.p183a.p184a.C4362b;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p355g.C8287e;

/* renamed from: g.a.a.i.f */
/* compiled from: ArtWorkUtils */
public class C8314f {
    /* renamed from: a */
    public static String m45972a(Context context, int i, long j) {
        return C4477c.m19602V(context, j, i);
    }

    /* renamed from: b */
    public static String m45973b(Context context, int i, long j, long j2) {
        return C4477c.m19603W(context, j, j2, i);
    }

    /* renamed from: c */
    public static void m45974c(Activity activity, long j, int i, int i2) {
        C4477c.m19610b0(activity, j, i2, i, (C4362b) activity);
    }

    /* renamed from: d */
    public static void m45975d(Fragment fragment, long j, int i, int i2) {
        C4477c.m19612c0(fragment, j, i2, i, (C4362b) fragment);
    }

    /* renamed from: e */
    public static void m45976e(Activity activity, int i, long j, int i2, String str) {
        C4477c.m19618f0(activity, j, i, i2, str, (C4362b) activity);
    }

    /* renamed from: f */
    public static void m45977f(Fragment fragment, int i, long j, int i2, String str) {
        C4477c.m19620g0(fragment, j, i, i2, str, (C4362b) fragment);
    }

    /* renamed from: g */
    public static void m45978g(BaseQuickAdapter baseQuickAdapter, int i, long j) {
        C4477c.m19630l0(C8345u.m46327h(), j, i);
        if (!(i == 0 || i == 1 || baseQuickAdapter == null)) {
            baseQuickAdapter.notifyDataSetChanged();
        }
        if (C8345u.m46327h() != null) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.track_artwork_item_notify").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.recent_artwork_item_notify").setPackage(C8345u.m46327h().getPackageName()));
        }
        if (C8287e.m45873v() != null && j == C8287e.m45873v().mo9215k() && C8345u.m46327h() != null) {
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.artwork_update_page").setPackage(C8345u.m46327h().getPackageName()));
            C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_widget").setPackage(C8345u.m46327h().getPackageName()));
        }
    }
}
