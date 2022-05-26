package p342g.p343a.p344a.p358i;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p177d.C4341a;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.i.n */
/* compiled from: MusicPreference */
public class C8337n {

    /* renamed from: b */
    public static C8337n f34770b;

    /* renamed from: a */
    public SharedPreferences f34771a;

    public C8337n(Context context) {
        this.f34771a = context.getSharedPreferences("music_preference", 0);
    }

    /* renamed from: k0 */
    public static C8337n m46065k0(Context context) {
        if (f34770b == null) {
            f34770b = new C8337n(context);
        }
        return f34770b;
    }

    /* renamed from: A */
    public int mo30074A() {
        return this.f34771a.getInt("custom_theme_color_accent", C8345u.m46326g(R.color.colorAccent));
    }

    /* renamed from: A0 */
    public boolean mo30075A0() {
        return this.f34771a.getBoolean("reverse", false);
    }

    /* renamed from: A1 */
    public void mo30076A1(boolean z) {
        this.f34771a.edit().putBoolean("custom_pitch_enable", z).commit();
    }

    /* renamed from: A2 */
    public void mo30077A2(float f) {
        this.f34771a.edit().putFloat("shake_threshold", f).commit();
    }

    /* renamed from: B */
    public int mo30078B() {
        return this.f34771a.getInt("custom_theme_color_bg", C8345u.m46326g(R.color.bg_color1));
    }

    /* renamed from: B0 */
    public float mo30079B0() {
        return this.f34771a.getFloat("reverse_value", 0.0f);
    }

    /* renamed from: B1 */
    public void mo30080B1(boolean z) {
        this.f34771a.edit().putBoolean("custom_reverse_enable", z).commit();
    }

    /* renamed from: B2 */
    public void mo30081B2(int i) {
        this.f34771a.edit().putInt("bg_signature_key", i).apply();
    }

    /* renamed from: C */
    public float mo30082C() {
        return this.f34771a.getFloat("custom_theme_custom_color_x", -1.0f);
    }

    /* renamed from: C0 */
    public float mo30083C0() {
        return this.f34771a.getFloat("rotate_degree", 50.0f);
    }

    /* renamed from: C1 */
    public void mo30084C1(boolean z) {
        this.f34771a.edit().putBoolean("custom_rotate_enable", z).commit();
    }

    /* renamed from: C2 */
    public void mo30085C2(int i) {
        this.f34771a.edit().putInt("simeplate_progress", i).commit();
    }

    /* renamed from: D */
    public float mo30086D() {
        return this.f34771a.getFloat("custom_theme_hsb", 0.0f);
    }

    /* renamed from: D0 */
    public boolean mo30087D0() {
        return this.f34771a.getBoolean("rotate", false);
    }

    /* renamed from: D1 */
    public void mo30088D1(float f) {
        this.f34771a.edit().putFloat("custom_theme_alpha", f).apply();
    }

    /* renamed from: D2 */
    public void mo30089D2(float f) {
        this.f34771a.edit().putFloat("simplerate", f).commit();
    }

    /* renamed from: E */
    public boolean mo30090E() {
        return this.f34771a.getBoolean("custom_theme_is_color_bg", true);
    }

    /* renamed from: E0 */
    public float mo30091E0() {
        return this.f34771a.getFloat("rotate_value", 0.0f);
    }

    /* renamed from: E1 */
    public void mo30092E1(float f) {
        this.f34771a.edit().putFloat("custom_theme_blur", f).apply();
    }

    /* renamed from: E2 */
    public void mo30093E2(int i) {
        this.f34771a.edit().putInt("timer_index", i).commit();
    }

    /* renamed from: F */
    public Uri mo30094F() {
        return Uri.parse(this.f34771a.getString("custom_theme_uri", BuildConfig.FLAVOR));
    }

    /* renamed from: F0 */
    public float mo30095F0(float f) {
        return this.f34771a.getFloat("shake_threshold", f);
    }

    /* renamed from: F1 */
    public void mo30096F1(int i) {
        this.f34771a.edit().putInt("custom_theme_color_accent", i).apply();
    }

    /* renamed from: F2 */
    public void mo30097F2(boolean z) {
        this.f34771a.edit().putBoolean("sliding_to_skip", z).commit();
    }

    /* renamed from: G */
    public boolean mo30098G() {
        return this.f34771a.getBoolean("custom_tone_enable", false);
    }

    /* renamed from: G0 */
    public int mo30099G0() {
        return this.f34771a.getInt("bg_signature_key", 0);
    }

    /* renamed from: G1 */
    public void mo30100G1(int i) {
        this.f34771a.edit().putInt("custom_theme_color_bg", i).apply();
    }

    /* renamed from: G2 */
    public void mo30101G2(int i) {
        this.f34771a.edit().putInt("sound_effect_position", i).commit();
    }

    /* renamed from: H */
    public boolean mo30102H() {
        return this.f34771a.getBoolean("custom_volume_booster_enable", false);
    }

    /* renamed from: H0 */
    public int mo30103H0() {
        return this.f34771a.getInt("simeplate_progress", 13230);
    }

    /* renamed from: H1 */
    public void mo30104H1(float f) {
        this.f34771a.edit().putFloat("custom_theme_custom_color_x", f).apply();
    }

    /* renamed from: H2 */
    public void mo30105H2(int i) {
        this.f34771a.edit().putInt("sound_effect_reget", i).commit();
    }

    /* renamed from: I */
    public boolean mo30106I() {
        return this.f34771a.getBoolean("desktop_lyric", false);
    }

    /* renamed from: I0 */
    public float mo30107I0() {
        return this.f34771a.getFloat("simplerate", 44100.0f);
    }

    /* renamed from: I1 */
    public void mo30108I1(float f) {
        this.f34771a.edit().putFloat("custom_theme_hsb", f).apply();
    }

    /* renamed from: I2 */
    public void mo30109I2(boolean z) {
        this.f34771a.edit().putBoolean("sound_effect_high_tone_high_user", z).commit();
    }

    /* renamed from: J */
    public boolean mo30110J() {
        return this.f34771a.getBoolean("desktop_lyric_lock", false);
    }

    /* renamed from: J0 */
    public int mo30111J0() {
        return this.f34771a.getInt("timer_index", 0);
    }

    /* renamed from: J1 */
    public void mo30112J1(boolean z) {
        this.f34771a.edit().putBoolean("custom_theme_is_color_bg", z).apply();
    }

    /* renamed from: J2 */
    public void mo30113J2(boolean z) {
        this.f34771a.edit().putBoolean("sound_effect_low_tone_user", z).commit();
    }

    /* renamed from: K */
    public int mo30114K() {
        return this.f34771a.getInt("desktop_text_color", C9332d.m49405b(C8345u.m46327h(), R.color.colorAccent));
    }

    /* renamed from: K0 */
    public boolean mo30115K0() {
        return this.f34771a.getBoolean("sliding_to_skip", false);
    }

    /* renamed from: K1 */
    public void mo30116K1(String str) {
        this.f34771a.edit().putString("custom_theme_uri", str).apply();
    }

    /* renamed from: K2 */
    public void mo30117K2(boolean z) {
        this.f34771a.edit().putBoolean("splashskinselect", z).commit();
    }

    /* renamed from: L */
    public int mo30118L() {
        return this.f34771a.getInt("desktop_text_size", (int) C4341a.m18951a());
    }

    /* renamed from: L0 */
    public int mo30119L0() {
        return this.f34771a.getInt("sound_effect_position", -1);
    }

    /* renamed from: L1 */
    public void mo30120L1(boolean z) {
        this.f34771a.edit().putBoolean("custom_tone_enable", z).commit();
    }

    /* renamed from: L2 */
    public void mo30121L2(int i) {
        this.f34771a.edit().putInt("tabPostion", i).commit();
    }

    /* renamed from: M */
    public int mo30122M() {
        return this.f34771a.getInt("distortion_press", -1);
    }

    /* renamed from: M0 */
    public int mo30123M0() {
        return this.f34771a.getInt("sound_effect_reget", 0);
    }

    /* renamed from: M1 */
    public void mo30124M1(boolean z) {
        this.f34771a.edit().putBoolean("custom_volume_booster_enable", z).commit();
    }

    /* renamed from: M2 */
    public void mo30125M2(float f) {
        this.f34771a.edit().putFloat("tempo", f).commit();
    }

    /* renamed from: N */
    public boolean mo30126N() {
        return this.f34771a.getBoolean("eq_enable", true);
    }

    /* renamed from: N0 */
    public boolean mo30127N0() {
        return this.f34771a.getBoolean("sound_effect_high_tone_high_user", false);
    }

    /* renamed from: N1 */
    public void mo30128N1(boolean z) {
        this.f34771a.edit().putBoolean("desktop_lyric", z).commit();
    }

    /* renamed from: N2 */
    public void mo30129N2(int i) {
        this.f34771a.edit().putInt("tempo_rogress", i).commit();
    }

    /* renamed from: O */
    public int mo30130O() {
        return this.f34771a.getInt("eq_style", 0);
    }

    /* renamed from: O0 */
    public boolean mo30131O0() {
        return this.f34771a.getBoolean("sound_effect_low_tone_user", false);
    }

    /* renamed from: O1 */
    public void mo30132O1(boolean z) {
        this.f34771a.edit().putBoolean("desktop_lyric_lock", z).commit();
    }

    /* renamed from: O2 */
    public void mo30133O2(int i) {
        this.f34771a.edit().putInt("trackLayoutOutType", i).commit();
    }

    /* renamed from: P */
    public boolean mo30134P() {
        return this.f34771a.getBoolean("effect", true);
    }

    /* renamed from: P0 */
    public float mo30135P0() {
        return this.f34771a.getFloat("tempo", 0.0f);
    }

    /* renamed from: P1 */
    public void mo30136P1(int i) {
        this.f34771a.edit().putInt("desktop_text_color", i).commit();
    }

    /* renamed from: P2 */
    public void mo30137P2(int i) {
        this.f34771a.edit().putInt("transitionAnimation", i).commit();
    }

    /* renamed from: Q */
    public int mo30138Q() {
        return this.f34771a.getInt("effect_press", 38);
    }

    /* renamed from: Q0 */
    public int mo30139Q0() {
        return this.f34771a.getInt("tempo_rogress", 30);
    }

    /* renamed from: Q1 */
    public void mo30140Q1(int i) {
        this.f34771a.edit().putInt("desktop_text_size", i).commit();
    }

    /* renamed from: Q2 */
    public void mo30141Q2(int i) {
        this.f34771a.edit().putInt("user_autoWah_press", i).commit();
    }

    /* renamed from: R */
    public float mo30142R() {
        return this.f34771a.getFloat("sound_effect_rotate_progress", 60.0f);
    }

    /* renamed from: R0 */
    public int mo30143R0() {
        return this.f34771a.getInt("trackLayoutOutType", 1);
    }

    /* renamed from: R1 */
    public void mo30144R1(boolean z) {
        this.f34771a.edit().putBoolean("effect", z).commit();
    }

    /* renamed from: R2 */
    public void mo30145R2(int i) {
        this.f34771a.edit().putInt("user_chorus_press", i).commit();
    }

    /* renamed from: S */
    public float mo30146S() {
        return this.f34771a.getFloat("sound_effect_tone_high_progress", 50.0f);
    }

    /* renamed from: S0 */
    public int mo30147S0(int i) {
        return this.f34771a.getInt("transitionAnimation", i);
    }

    /* renamed from: S1 */
    public void mo30148S1(int i) {
        this.f34771a.edit().putInt("effect_press", i).commit();
    }

    /* renamed from: S2 */
    public void mo30149S2(int i) {
        this.f34771a.edit().putInt("user_compress_press", i).commit();
    }

    /* renamed from: T */
    public float mo30150T() {
        return this.f34771a.getFloat("sound_effect_tone_low_progress", 120.0f);
    }

    /* renamed from: T0 */
    public int mo30151T0() {
        return this.f34771a.getInt("user_effect_press", 38);
    }

    /* renamed from: T1 */
    public void mo30152T1(boolean z) {
        this.f34771a.edit().putBoolean("enable_fade", z).commit();
    }

    /* renamed from: T2 */
    public void mo30153T2(int i) {
        this.f34771a.edit().putInt("user_effect_press", i).commit();
    }

    /* renamed from: U */
    public boolean mo30154U() {
        return this.f34771a.getBoolean("enable_fade", true);
    }

    /* renamed from: U0 */
    public boolean mo30155U0() {
        return this.f34771a.getBoolean("first_skin", true);
    }

    /* renamed from: U1 */
    public void mo30156U1(boolean z) {
        this.f34771a.edit().putBoolean("enable_share", z).commit();
    }

    /* renamed from: U2 */
    public void mo30157U2(boolean z) {
        this.f34771a.edit().putBoolean("first_skin", z).apply();
    }

    /* renamed from: V */
    public boolean mo30158V() {
        return this.f34771a.getBoolean("enable_share", false);
    }

    /* renamed from: V0 */
    public float mo30159V0() {
        return this.f34771a.getFloat("user_simplerate", 44100.0f);
    }

    /* renamed from: V1 */
    public void mo30160V1(int i) {
        this.f34771a.edit().putInt("eq_page_num", i).commit();
    }

    /* renamed from: V2 */
    public void mo30161V2(int i) {
        this.f34771a.edit().putInt("user_phaser_press", i).commit();
    }

    /* renamed from: W */
    public int mo30162W() {
        return this.f34771a.getInt("eq_page_num", 0);
    }

    /* renamed from: W0 */
    public float mo30163W0() {
        return this.f34771a.getFloat("user_tempo", 0.0f);
    }

    /* renamed from: W1 */
    public void mo30164W1() {
        this.f34771a.edit().putBoolean("eqPointCheck", true).commit();
    }

    /* renamed from: W2 */
    public void mo30165W2(float f) {
        this.f34771a.edit().putFloat("user_simplerate", f).commit();
    }

    /* renamed from: X */
    public boolean mo30166X() {
        return this.f34771a.getBoolean("eqPointCheck", false);
    }

    /* renamed from: X0 */
    public boolean mo30167X0() {
        return this.f34771a.getBoolean("enable_vb", true);
    }

    /* renamed from: X1 */
    public void mo30168X1(int i) {
        this.f34771a.edit().putInt("filter_duration", i).commit();
    }

    /* renamed from: X2 */
    public void mo30169X2(float f) {
        this.f34771a.edit().putFloat("user_tempo", f).commit();
    }

    /* renamed from: Y */
    public int mo30170Y(int i) {
        return this.f34771a.getInt("filter_duration", i);
    }

    /* renamed from: Y0 */
    public float mo30171Y0() {
        return this.f34771a.getFloat("volume", 0.8f);
    }

    /* renamed from: Y1 */
    public void mo30172Y1(boolean z) {
        this.f34771a.edit().putBoolean("first_loudness", z).apply();
    }

    /* renamed from: Y2 */
    public void mo30173Y2(boolean z) {
        this.f34771a.edit().putBoolean("enable_vb", z).commit();
    }

    /* renamed from: Z */
    public boolean mo30174Z() {
        return this.f34771a.getBoolean("first_loudness", true);
    }

    /* renamed from: Z0 */
    public boolean mo30175Z0() {
        return this.f34771a.getBoolean("volume_booster_enable", false);
    }

    /* renamed from: Z1 */
    public void mo30176Z1(int i) {
        this.f34771a.edit().putInt("folderDetailLayoutOutType", i).commit();
    }

    /* renamed from: Z2 */
    public void mo30177Z2(float f) {
        this.f34771a.edit().putFloat("volume", f).commit();
    }

    /* renamed from: a */
    public int mo30178a() {
        return this.f34771a.getInt("albumDetailLayoutOutType", 1);
    }

    /* renamed from: a0 */
    public int mo30179a0() {
        return this.f34771a.getInt("folderDetailLayoutOutType", 1);
    }

    /* renamed from: a1 */
    public boolean mo30180a1() {
        return this.f34771a.getBoolean("volume_enable", true);
    }

    /* renamed from: a2 */
    public void mo30181a2(int i) {
        this.f34771a.edit().putInt("folderLayoutOutType", i).commit();
    }

    /* renamed from: a3 */
    public void mo30182a3(boolean z) {
        this.f34771a.edit().putBoolean("volume_booster_enable", z).commit();
    }

    /* renamed from: b */
    public int mo30183b() {
        return this.f34771a.getInt("albumLayoutOutType", 1);
    }

    /* renamed from: b0 */
    public int mo30184b0() {
        return this.f34771a.getInt("folderLayoutOutType", 1);
    }

    /* renamed from: b1 */
    public void mo30185b1(float f) {
        this.f34771a.edit().putFloat("bar1", f).commit();
    }

    /* renamed from: b2 */
    public void mo30186b2(int i) {
        this.f34771a.edit().putInt("genresDetailLayoutOutType", i).commit();
    }

    /* renamed from: b3 */
    public void mo30187b3(boolean z) {
        this.f34771a.edit().putBoolean("volume_enable", z).commit();
    }

    /* renamed from: c */
    public int mo30188c() {
        return this.f34771a.getInt("artistAlbumLayoutOutType", 1);
    }

    /* renamed from: c0 */
    public int mo30189c0() {
        return this.f34771a.getInt("genresDetailLayoutOutType", 1);
    }

    /* renamed from: c1 */
    public void mo30190c1(float f) {
        this.f34771a.edit().putFloat("bar10", f).commit();
    }

    /* renamed from: c2 */
    public void mo30191c2(int i) {
        this.f34771a.edit().putInt("genresLayoutOutType", i).commit();
    }

    /* renamed from: d */
    public int mo30192d() {
        return this.f34771a.getInt("artistLayoutOutType", 1);
    }

    /* renamed from: d0 */
    public int mo30193d0() {
        return this.f34771a.getInt("genresLayoutOutType", 1);
    }

    /* renamed from: d1 */
    public void mo30194d1(float f) {
        this.f34771a.edit().putFloat("bar2", f).commit();
    }

    /* renamed from: d2 */
    public void mo30195d2(boolean z) {
        this.f34771a.edit().putBoolean("guide_next_show", z).commit();
    }

    /* renamed from: e */
    public int mo30196e() {
        return this.f34771a.getInt("artistTrackLayoutOutType", 1);
    }

    /* renamed from: e0 */
    public boolean mo30197e0() {
        return this.f34771a.getBoolean("guide_next_show", true);
    }

    /* renamed from: e1 */
    public void mo30198e1(float f) {
        this.f34771a.edit().putFloat("bar3", f).commit();
    }

    /* renamed from: e2 */
    public void mo30199e2(boolean z) {
        this.f34771a.edit().putBoolean("head_set_double_click", z).commit();
    }

    /* renamed from: f */
    public boolean mo30200f() {
        return this.f34771a.getBoolean("is_auto_nowplaying", false);
    }

    /* renamed from: f0 */
    public boolean mo30201f0() {
        return this.f34771a.getBoolean("head_set_double_click", true);
    }

    /* renamed from: f1 */
    public void mo30202f1(float f) {
        this.f34771a.edit().putFloat("bar4", f).commit();
    }

    /* renamed from: f2 */
    public void mo30203f2(boolean z) {
        this.f34771a.edit().putBoolean("head_set_one_click", z).commit();
    }

    /* renamed from: g */
    public int mo30204g() {
        return this.f34771a.getInt("autoWah_press", -1);
    }

    /* renamed from: g0 */
    public boolean mo30205g0() {
        return this.f34771a.getBoolean("head_set_one_click", true);
    }

    /* renamed from: g1 */
    public void mo30206g1(float f) {
        this.f34771a.edit().putFloat("bar5", f).commit();
    }

    /* renamed from: g2 */
    public void mo30207g2(boolean z) {
        this.f34771a.edit().putBoolean("head_set_plug_play", z).commit();
    }

    /* renamed from: h */
    public float mo30208h() {
        return this.f34771a.getFloat("bar1", 0.0f);
    }

    /* renamed from: h0 */
    public boolean mo30209h0() {
        return this.f34771a.getBoolean("head_set_plug_play", false);
    }

    /* renamed from: h1 */
    public void mo30210h1(float f) {
        this.f34771a.edit().putFloat("bar6", f).commit();
    }

    /* renamed from: h2 */
    public void mo30211h2(boolean z) {
        this.f34771a.edit().putBoolean("head_set_pull_out_pause", z).commit();
    }

    /* renamed from: i */
    public float mo30212i() {
        return this.f34771a.getFloat("bar10", 0.0f);
    }

    /* renamed from: i0 */
    public boolean mo30213i0() {
        return this.f34771a.getBoolean("head_set_pull_out_pause", true);
    }

    /* renamed from: i1 */
    public void mo30214i1(float f) {
        this.f34771a.edit().putFloat("bar7", f).commit();
    }

    /* renamed from: i2 */
    public void mo30215i2(boolean z) {
        this.f34771a.edit().putBoolean("head_set_third_click", z).commit();
    }

    /* renamed from: j */
    public float mo30216j() {
        return this.f34771a.getFloat("bar2", 0.0f);
    }

    /* renamed from: j0 */
    public boolean mo30217j0() {
        return this.f34771a.getBoolean("head_set_third_click", true);
    }

    /* renamed from: j1 */
    public void mo30218j1(float f) {
        this.f34771a.edit().putFloat("bar8", f).commit();
    }

    /* renamed from: j2 */
    public void mo30219j2() {
        this.f34771a.edit().putBoolean("lamPointCheck", true).commit();
    }

    /* renamed from: k */
    public float mo30220k() {
        return this.f34771a.getFloat("bar3", 0.0f);
    }

    /* renamed from: k1 */
    public void mo30221k1(float f) {
        this.f34771a.edit().putFloat("bar9", f).commit();
    }

    /* renamed from: k2 */
    public void mo30222k2(int i) {
        this.f34771a.edit().putInt("library_position", i).commit();
    }

    /* renamed from: l */
    public float mo30223l() {
        return this.f34771a.getFloat("bar4", 0.0f);
    }

    /* renamed from: l0 */
    public boolean mo30224l0() {
        return this.f34771a.getBoolean("lamPointCheck", false);
    }

    /* renamed from: l1 */
    public void mo30225l1(boolean z) {
        this.f34771a.edit().putBoolean("custom_eq_enable", z).commit();
    }

    /* renamed from: l2 */
    public void mo30226l2(boolean z) {
        this.f34771a.edit().putBoolean("lock_screen_enable", z).commit();
    }

    /* renamed from: m */
    public float mo30227m() {
        return this.f34771a.getFloat("bar5", 0.0f);
    }

    /* renamed from: m0 */
    public int mo30228m0() {
        return this.f34771a.getInt("library_position", 0);
    }

    /* renamed from: m1 */
    public void mo30229m1(boolean z) {
        this.f34771a.edit().putBoolean("eq_enable", z).commit();
    }

    /* renamed from: m2 */
    public void mo30230m2(boolean z) {
        this.f34771a.edit().putBoolean("openTimeOverToStop", z).apply();
    }

    /* renamed from: n */
    public float mo30231n() {
        return this.f34771a.getFloat("bar6", 0.0f);
    }

    /* renamed from: n0 */
    public boolean mo30232n0() {
        return this.f34771a.getBoolean("lock_screen_enable", false);
    }

    /* renamed from: n1 */
    public void mo30233n1(int i) {
        this.f34771a.edit().putInt("eq_style", i).commit();
    }

    /* renamed from: n2 */
    public void mo30234n2(float f) {
        this.f34771a.edit().putFloat("pan", f).commit();
    }

    /* renamed from: o */
    public float mo30235o() {
        return this.f34771a.getFloat("bar7", 0.0f);
    }

    /* renamed from: o0 */
    public boolean mo30236o0() {
        return this.f34771a.getBoolean("openTimeOverToStop", false);
    }

    /* renamed from: o1 */
    public void mo30237o1(int i) {
        this.f34771a.edit().putFloat("sound_effect_tone_high_progress", (float) i).commit();
    }

    /* renamed from: o2 */
    public void mo30238o2(boolean z) {
        this.f34771a.edit().putBoolean("pan_enable", z).commit();
    }

    /* renamed from: p */
    public float mo30239p() {
        return this.f34771a.getFloat("bar8", 0.0f);
    }

    /* renamed from: p0 */
    public float mo30240p0() {
        return this.f34771a.getFloat("pan", 0.0f);
    }

    /* renamed from: p1 */
    public void mo30241p1(int i) {
        this.f34771a.edit().putFloat("sound_effect_tone_low_progress", (float) i).commit();
    }

    /* renamed from: p2 */
    public void mo30242p2(float f) {
        this.f34771a.edit().putFloat("pitch", f).commit();
    }

    /* renamed from: q */
    public float mo30243q() {
        return this.f34771a.getFloat("bar9", 0.0f);
    }

    /* renamed from: q0 */
    public boolean mo30244q0() {
        return this.f34771a.getBoolean("pan_enable", false);
    }

    /* renamed from: q1 */
    public void mo30245q1(float f) {
        this.f34771a.edit().putFloat("reverse_degree", f).commit();
    }

    /* renamed from: q2 */
    public void mo30246q2(boolean z) {
        this.f34771a.edit().putBoolean("pitch_enable", z).commit();
    }

    /* renamed from: r */
    public int mo30247r() {
        return this.f34771a.getInt("chorus_press", -1);
    }

    /* renamed from: r0 */
    public int mo30248r0() {
        return this.f34771a.getInt("phaser_press", -1);
    }

    /* renamed from: r1 */
    public void mo30249r1(float f) {
        this.f34771a.edit().putFloat("rotate_degree", f).commit();
    }

    /* renamed from: r2 */
    public void mo30250r2(int i) {
        this.f34771a.edit().putInt("playlistDetailLayoutOutType", i).commit();
    }

    /* renamed from: s */
    public int mo30251s() {
        return this.f34771a.getInt("compress_press", -1);
    }

    /* renamed from: s0 */
    public float mo30252s0() {
        return this.f34771a.getFloat("pitch", 0.0f);
    }

    /* renamed from: s1 */
    public void mo30253s1(int i) {
        this.f34771a.edit().putInt("albumDetailLayoutOutType", i).commit();
    }

    /* renamed from: s2 */
    public void mo30254s2(int i) {
        this.f34771a.edit().putInt("playlistLayoutOutType", i).commit();
    }

    /* renamed from: t */
    public int mo30255t() {
        return this.f34771a.getInt("current_skin", 1);
    }

    /* renamed from: t0 */
    public boolean mo30256t0() {
        return this.f34771a.getBoolean("pitch_enable", true);
    }

    /* renamed from: t1 */
    public void mo30257t1(int i) {
        this.f34771a.edit().putInt("albumLayoutOutType", i).commit();
    }

    /* renamed from: t2 */
    public void mo30258t2(int i) {
        this.f34771a.edit().putInt("recent_add_week", i).apply();
    }

    /* renamed from: u */
    public boolean mo30259u() {
        return this.f34771a.getBoolean("custom_balance_enable", false);
    }

    /* renamed from: u0 */
    public int mo30260u0() {
        return this.f34771a.getInt("playlistDetailLayoutOutType", 1);
    }

    /* renamed from: u1 */
    public void mo30261u1(String str, long j, String str2) {
        SharedPreferences.Editor edit = this.f34771a.edit();
        edit.putString(str + "_artwork_id_" + j, str2).commit();
    }

    /* renamed from: u2 */
    public void mo30262u2(int i) {
        this.f34771a.edit().putInt("recentLayoutOutType", i).commit();
    }

    /* renamed from: v */
    public boolean mo30263v() {
        return this.f34771a.getBoolean("custom_pitch_enable", false);
    }

    /* renamed from: v0 */
    public int mo30264v0() {
        return this.f34771a.getInt("playlistLayoutOutType", 1);
    }

    /* renamed from: v1 */
    public void mo30265v1(int i) {
        this.f34771a.edit().putInt("artistAlbumLayoutOutType", i).commit();
    }

    /* renamed from: v2 */
    public void mo30266v2(int i) {
        this.f34771a.edit().putInt("recent_play_week", i).apply();
    }

    /* renamed from: w */
    public boolean mo30267w() {
        return this.f34771a.getBoolean("custom_reverse_enable", false);
    }

    /* renamed from: w0 */
    public int mo30268w0() {
        return this.f34771a.getInt("recent_add_week", 0);
    }

    /* renamed from: w1 */
    public void mo30269w1(int i) {
        this.f34771a.edit().putInt("artistLayoutOutType", i).commit();
    }

    /* renamed from: w2 */
    public void mo30270w2(boolean z) {
        this.f34771a.edit().putBoolean("reverse", z).commit();
    }

    /* renamed from: x */
    public boolean mo30271x() {
        return this.f34771a.getBoolean("custom_rotate_enable", false);
    }

    /* renamed from: x0 */
    public int mo30272x0() {
        return this.f34771a.getInt("recentLayoutOutType", 1);
    }

    /* renamed from: x1 */
    public void mo30273x1(int i) {
        this.f34771a.edit().putInt("artistTrackLayoutOutType", i).commit();
    }

    /* renamed from: x2 */
    public void mo30274x2(float f) {
        this.f34771a.edit().putFloat("reverse_value", f).commit();
    }

    /* renamed from: y */
    public float mo30275y() {
        return this.f34771a.getFloat("custom_theme_alpha", 1.0f);
    }

    /* renamed from: y0 */
    public int mo30276y0() {
        return this.f34771a.getInt("recent_play_week", 0);
    }

    /* renamed from: y1 */
    public void mo30277y1(int i) {
        this.f34771a.edit().putInt("current_skin", i).commit();
    }

    /* renamed from: y2 */
    public void mo30278y2(boolean z) {
        Log.e("rotateEnable", "edit setRotateEnable:" + z);
        this.f34771a.edit().putBoolean("rotate", z).commit();
    }

    /* renamed from: z */
    public float mo30279z() {
        return this.f34771a.getFloat("custom_theme_blur", 1.0f);
    }

    /* renamed from: z0 */
    public float mo30280z0() {
        return this.f34771a.getFloat("reverse_degree", 50.0f);
    }

    /* renamed from: z1 */
    public void mo30281z1(boolean z) {
        this.f34771a.edit().putBoolean("custom_balance_enable", z).commit();
    }

    /* renamed from: z2 */
    public void mo30282z2(float f) {
        this.f34771a.edit().putFloat("rotate_value", f).commit();
    }
}
