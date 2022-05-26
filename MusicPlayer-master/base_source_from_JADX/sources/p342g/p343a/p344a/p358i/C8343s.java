package p342g.p343a.p344a.p358i;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0534a;
import androidx.recyclerview.widget.C0885l;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.mode.C7057b;
import coocent.music.player.widget.VerticalSeekBar;
import java.util.Objects;
import media.musicplayer.audioplayer.videoplayer.R;
import p369i.p387z.p389d.C8594l;
import p443m.p444a.C9317b;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.i.s */
/* compiled from: ThemeUtils.kt */
public final class C8343s {

    /* renamed from: a */
    public static final C8343s f34786a = new C8343s();

    /* renamed from: b */
    public static boolean f34787b = false;

    /* renamed from: c */
    public static int f34788c = -1;

    /* renamed from: d */
    private static C7057b f34789d = new C7057b();

    private C8343s() {
    }

    /* renamed from: a */
    public static final void m46293a(VerticalSeekBar verticalSeekBar) {
        C8594l.m46771e(verticalSeekBar, "bar10");
        Drawable progressDrawable = verticalSeekBar.getProgressDrawable();
        Objects.requireNonNull(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        ((LayerDrawable) progressDrawable).getDrawable(1).setTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842910}}, new int[]{C9332d.m49405b(C8345u.m46327h(), R.color.app_sub_title_color), m46300h()}));
    }

    /* renamed from: b */
    public static final void m46294b() {
        f34789d.mo27083p(Uri.parse(BuildConfig.FLAVOR));
        f34789d.mo27078k(C8345u.m46326g(R.color.colorAccent));
        f34789d.mo27082o(1.0f);
        f34789d.mo27076i(0.5f);
        f34789d.mo27077j(1.0f);
        f34789d.mo27081n(-1.0f);
        f34789d.mo27079l(C8345u.m46326g(R.color.bg_color1));
        f34789d.mo27080m(true);
        C8337n.m46065k0(C8345u.m46327h()).mo30116K1(BuildConfig.FLAVOR);
        C8337n.m46065k0(C8345u.m46327h()).mo30096F1(0);
        C8337n.m46065k0(C8345u.m46327h()).mo30108I1(1.0f);
        C8337n.m46065k0(C8345u.m46327h()).mo30088D1(0.5f);
        C8337n.m46065k0(C8345u.m46327h()).mo30092E1(1.0f);
        C8337n.m46065k0(C8345u.m46327h()).mo30104H1(-1.0f);
        C8337n.m46065k0(C8345u.m46327h()).mo30112J1(true);
        C8337n.m46065k0(C8345u.m46327h()).mo30100G1(C8345u.m46326g(R.color.bg_color1));
    }

    /* renamed from: c */
    public static final int m46295c(int i) {
        return C9332d.m49405b(C8345u.m46327h(), i);
    }

    /* renamed from: d */
    public static final String m46296d() {
        return BaseApplication.f31160x + "/skin" + f34788c + "/skin" + f34788c + ".skin";
    }

    /* renamed from: e */
    public static final C7057b m46297e() {
        return f34789d;
    }

    /* renamed from: f */
    public static final Drawable m46298f(int i) {
        Drawable d = C9332d.m49407d(C8345u.m46327h(), i);
        C8594l.m46770d(d, "getDrawable(UiUtils.getContext(), drawableResource)");
        return d;
    }

    /* renamed from: g */
    public static final Drawable m46299g() {
        Drawable j = C8345u.m46329j(R.drawable.accent_color_shape);
        C8594l.m46770d(j, "getDrawalbe(R.drawable.accent_color_shape)");
        return m46312t(j, f34789d.mo27071d());
    }

    /* renamed from: h */
    public static final int m46300h() {
        if (f34787b) {
            return f34789d.mo27070c();
        }
        return C9332d.m49405b(C8345u.m46327h(), R.color.colorAccent);
    }

    /* renamed from: i */
    public static final int m46301i(int i) {
        if (f34787b) {
            return f34789d.mo27070c();
        }
        return C9332d.m49405b(C8345u.m46327h(), i);
    }

    /* renamed from: j */
    public static final ColorStateList m46302j() {
        return new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C9332d.m49405b(C8345u.m46327h(), R.color.app_sub_title_color), m46300h()});
    }

    /* renamed from: k */
    public static final Drawable m46303k(int i, int i2) {
        if (f34787b) {
            Drawable j = C8345u.m46329j(i);
            C8594l.m46770d(j, "getDrawalbe(drawableResource)");
            return m46312t(j, f34789d.mo27070c());
        }
        Drawable j2 = C8345u.m46329j(i);
        C8594l.m46770d(j2, "getDrawalbe(drawableResource)");
        return m46312t(j2, C9332d.m49405b(C8345u.m46327h(), i2));
    }

    /* renamed from: l */
    public static final Drawable m46304l(int i, int i2) {
        Drawable j = C8345u.m46329j(i);
        C8594l.m46770d(j, "getDrawalbe(drawableResource)");
        return m46312t(j, C9332d.m49405b(C8345u.m46327h(), i2));
    }

    /* renamed from: m */
    public static final void m46305m() {
        Uri F = C8337n.m46065k0(C8345u.m46327h()).mo30094F();
        int A = C8337n.m46065k0(C8345u.m46327h()).mo30074A();
        int B = C8337n.m46065k0(C8345u.m46327h()).mo30078B();
        boolean E = C8337n.m46065k0(C8345u.m46327h()).mo30090E();
        float D = C8337n.m46065k0(C8345u.m46327h()).mo30086D();
        float y = C8337n.m46065k0(C8345u.m46327h()).mo30275y();
        float z = C8337n.m46065k0(C8345u.m46327h()).mo30279z();
        float C = C8337n.m46065k0(C8345u.m46327h()).mo30082C();
        f34789d.mo27083p(F);
        f34789d.mo27078k(A);
        f34789d.mo27079l(B);
        f34789d.mo27080m(E);
        f34789d.mo27082o(D);
        f34789d.mo27076i(y);
        f34789d.mo27077j(z);
        f34789d.mo27081n(C);
    }

    /* renamed from: n */
    public static final void m46306n(int i) {
        f34788c = i;
        boolean z = true;
        C9317b.m49321m().mo32283w(C8594l.m46777k("skin", Integer.valueOf(f34788c)), 1);
        if (i != 0) {
            z = false;
        }
        f34787b = z;
    }

    /* renamed from: o */
    public static final void m46307o(ImageView imageView, boolean z) {
        C8594l.m46771e(imageView, "imageView");
        if (f34787b || z) {
            if (f34789d.mo27075h()) {
                imageView.setImageDrawable(m46299g());
            } else {
                C8321j.m46010p(f34789d.mo27074g(), imageView, C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION), C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION), (int) f34789d.mo27069b(), 1);
            }
            imageView.setAlpha(f34789d.mo27068a());
            return;
        }
        imageView.setImageDrawable(C9332d.m49407d(C8345u.m46327h(), R.drawable.splash_skin_1_bg_shape));
    }

    /* renamed from: p */
    public static final void m46308p(int i) {
        m46306n(i);
        C8337n.m46065k0(C8345u.m46327h()).mo30277y1(i);
        C8345u.m46327h().sendBroadcast(new Intent(C8311c.f34737d).setPackage(C8345u.m46327h().getPackageName()));
    }

    /* renamed from: q */
    public static final void m46309q() {
        C8337n.m46065k0(C8345u.m46327h()).mo30116K1(f34789d.mo27074g().toString());
        C8337n.m46065k0(C8345u.m46327h()).mo30096F1(f34789d.mo27070c());
        C8337n.m46065k0(C8345u.m46327h()).mo30108I1(f34789d.mo27073f());
        C8337n.m46065k0(C8345u.m46327h()).mo30088D1(f34789d.mo27068a());
        C8337n.m46065k0(C8345u.m46327h()).mo30092E1(f34789d.mo27069b());
        C8337n.m46065k0(C8345u.m46327h()).mo30104H1(f34789d.mo27072e());
        C8337n.m46065k0(C8345u.m46327h()).mo30100G1(f34789d.mo27071d());
        C8337n.m46065k0(C8345u.m46327h()).mo30112J1(f34789d.mo27075h());
    }

    /* renamed from: r */
    public static final void m46310r(boolean z) {
        f34789d.mo27078k(C8345u.m46326g(R.color.colorAccent));
        f34789d.mo27082o(1.0f);
        f34789d.mo27076i(0.5f);
        f34789d.mo27077j(1.0f);
        f34789d.mo27081n(-1.0f);
        f34789d.mo27083p(Uri.parse(BuildConfig.FLAVOR));
        f34789d.mo27079l(C8345u.m46326g(R.color.bg_color1));
        f34789d.mo27080m(z);
    }

    /* renamed from: s */
    public static final void m46311s(ImageView imageView, boolean z) {
        C8594l.m46771e(imageView, "imageView");
        if (f34787b) {
            if (f34789d.mo27075h()) {
                imageView.setImageDrawable(m46299g());
            } else {
                C8321j.m46010p(f34789d.mo27074g(), imageView, C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION), C8345u.m46323d(C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION), (int) f34789d.mo27069b(), 1);
            }
            imageView.setAlpha(C8337n.m46065k0(C8345u.m46327h()).mo30275y());
        } else if (z) {
            imageView.setImageDrawable(m46298f(R.drawable.popup_bg_now));
        } else {
            imageView.setImageDrawable(m46298f(R.drawable.popup_bg));
        }
    }

    /* renamed from: t */
    public static final Drawable m46312t(Drawable drawable, int i) {
        C8594l.m46771e(drawable, "drawable");
        Drawable r = C0534a.m3292r(drawable);
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C8594l.m46770d(valueOf, "valueOf(colors)");
        C0534a.m3289o(r, valueOf);
        C8594l.m46770d(r, "wrappedDrawable");
        return r;
    }
}
