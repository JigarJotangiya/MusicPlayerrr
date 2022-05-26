package p342g.p343a.p344a.p358i;

import android.app.Activity;
import coocent.music.player.base.BaseApplication;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: g.a.a.i.e */
/* compiled from: AnimationUtils */
public class C8313e {
    /* renamed from: a */
    public static int m45967a() {
        switch (BaseApplication.f31152p) {
            case 0:
                return R.anim.fade_in;
            case 1:
                return R.anim.left_in;
            case 2:
                return R.anim.anim_in;
            case 3:
                return R.anim.down_in;
            case 4:
                return R.anim.flip_horizontal_in;
            case 5:
                return R.anim.flip_vertical_in;
            case 6:
                return R.anim.zoomin;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static int m45968b() {
        switch (BaseApplication.f31152p) {
            case 0:
                return R.anim.fade_out;
            case 1:
                return R.anim.right_out;
            case 2:
                return R.anim.anim_out;
            case 3:
                return R.anim.down_out;
            case 4:
                return R.anim.flip_horizontal_out;
            case 5:
                return R.anim.flip_vertical_out;
            case 6:
                return R.anim.zoomout;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    public static int m45969c() {
        switch (BaseApplication.f31152p) {
            case 0:
                return R.anim.fade_in;
            case 1:
                return R.anim.right_in;
            case 2:
                return R.anim.anim_in;
            case 3:
                return R.anim.up_in;
            case 4:
                return R.anim.flip_horizontal_in;
            case 5:
                return R.anim.flip_vertical_in;
            case 6:
                return R.anim.zoomin;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static int m45970d() {
        switch (BaseApplication.f31152p) {
            case 0:
                return R.anim.fade_out;
            case 1:
                return R.anim.right_out;
            case 2:
                return R.anim.anim_out;
            case 3:
                return R.anim.down_out;
            case 4:
                return R.anim.flip_horizontal_out;
            case 5:
                return R.anim.flip_vertical_out;
            case 6:
                return R.anim.zoomout;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    public static void m45971e(Activity activity) {
        if (activity != null) {
            switch (BaseApplication.f31152p) {
                case 0:
                    activity.setTheme(R.style.fadeAnimationTheme);
                    return;
                case 1:
                    activity.setTheme(R.style.leftToRightAnimationTheme);
                    return;
                case 2:
                    activity.setTheme(R.style.immersionAndDiffusionAnimationTheme);
                    return;
                case 3:
                    activity.setTheme(R.style.updowAnimationTheme);
                    return;
                case 4:
                    activity.setTheme(R.style.flipHorizontalAnimationTheme);
                    return;
                case 5:
                    activity.setTheme(R.style.flipVerticalAnimationTheme);
                    return;
                case 6:
                    activity.setTheme(R.style.sinkVerticalAnimationTheme);
                    return;
                case 7:
                    activity.setTheme(R.style.NoneAnimationTheme);
                    return;
                default:
                    return;
            }
        }
    }
}
