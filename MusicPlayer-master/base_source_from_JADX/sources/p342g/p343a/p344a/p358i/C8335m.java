package p342g.p343a.p344a.p358i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.core.content.p003d.C0524f;
import com.coocent.marquee.C2280j;
import com.coocent.marquee.C2297n;
import com.coocent.marquee.C2298o;
import com.coocent.marquee.MarqueeSmallCircleView;
import com.coocent.marquee.p053ui.MarqueeSettings2Activity;
import com.coocent.marquee.view.MarqueeView;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8287e;

/* renamed from: g.a.a.i.m */
/* compiled from: MarqueeMyUtils */
public class C8335m {

    /* renamed from: g.a.a.i.m$a */
    /* compiled from: MarqueeMyUtils */
    class C8336a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Context f34768g;

        /* renamed from: h */
        final /* synthetic */ MarqueeView f34769h;

        C8336a(Context context, MarqueeView marqueeView) {
            this.f34768g = context;
            this.f34769h = marqueeView;
        }

        public void run() {
            C8335m.m46062h(this.f34768g, this.f34769h);
        }
    }

    /* renamed from: a */
    public static void m46055a(MarqueeView marqueeView, MarqueeSmallCircleView marqueeSmallCircleView) {
        C2280j.m10617c();
    }

    /* renamed from: b */
    public static void m46056b(Activity activity) {
        C2297n.m10665b(activity, true);
    }

    /* renamed from: c */
    public static void m46057c(Application application) {
        C2280j.m10616b(application);
    }

    /* renamed from: d */
    public static void m46058d(Activity activity) {
        activity.startActivityForResult(new Intent(activity, MarqueeSettings2Activity.class), 1013);
    }

    /* renamed from: e */
    public static void m46059e(Activity activity, int i) {
    }

    /* renamed from: f */
    public static void m46060f(Context context, MarqueeView marqueeView) {
        if (marqueeView != null) {
            marqueeView.post(new C8336a(context, marqueeView));
        }
    }

    /* renamed from: g */
    public static void m46061g(Context context, MarqueeSmallCircleView marqueeSmallCircleView) {
        C2280j.m10619e(context, marqueeSmallCircleView);
    }

    /* renamed from: h */
    public static void m46062h(Context context, MarqueeView marqueeView) {
        boolean z = false;
        if (C8287e.m45802Q() != null) {
            if (context.getSharedPreferences("setting_preference", 0).getBoolean("marquee_enable", false) && C8287e.m45812V()) {
                z = true;
            }
            C2280j.m10621g(context, marqueeView, z);
            return;
        }
        C2280j.m10621g(context, marqueeView, false);
    }

    /* renamed from: i */
    public static void m46063i(Context context) {
        C2298o.C2299a aVar = new C2298o.C2299a();
        aVar.mo9027e(C0524f.m3223d(context.getResources(), R.color.marquee_color_default_1, (Resources.Theme) null));
        aVar.mo9029g(C0524f.m3223d(context.getResources(), R.color.marquee_color_default_2, (Resources.Theme) null));
        aVar.mo9031i(C0524f.m3223d(context.getResources(), R.color.marquee_color_default_3, (Resources.Theme) null));
        aVar.mo9042u(C0524f.m3223d(context.getResources(), R.color.splashBackgroundColor, (Resources.Theme) null));
        aVar.mo9039q(C0524f.m3225f(context.getResources(), R.drawable.marquee_home_button1_open, (Resources.Theme) null));
        aVar.mo9040r(C0524f.m3225f(context.getResources(), R.drawable.marquee_home_button_no, (Resources.Theme) null));
        aVar.mo9024b(C0524f.m3225f(context.getResources(), R.drawable.eq_sound_effect_tempo_button01, (Resources.Theme) null));
        aVar.mo9025c(C0524f.m3225f(context.getResources(), R.drawable.eq_sound_effect_tempo_button01_off, (Resources.Theme) null));
        aVar.mo9034l(C0524f.m3223d(context.getResources(), R.color.marquee_seek_bar_color_bg_default, (Resources.Theme) null));
        aVar.mo9036n(C0524f.m3223d(context.getResources(), R.color.marquee_seek_bar_bg, (Resources.Theme) null));
        aVar.mo9035m(C0524f.m3223d(context.getResources(), R.color.seek_bar_color_bg_un_enable_default, (Resources.Theme) null));
        aVar.mo9032j(C8343s.m46300h());
        aVar.mo9033k(false);
        aVar.mo9041t(C0524f.m3223d(context.getResources(), R.color.bg_gray, (Resources.Theme) null));
        aVar.mo9023a();
    }

    /* renamed from: j */
    public static void m46064j(Context context, boolean z, MarqueeView marqueeView) {
        C2280j.m10624j(context, marqueeView, z);
    }
}
