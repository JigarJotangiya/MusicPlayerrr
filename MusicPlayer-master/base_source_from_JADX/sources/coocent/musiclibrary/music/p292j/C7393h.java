package coocent.musiclibrary.music.p292j;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.coocent.music.base.data.entity.Music;
import java.util.List;

/* renamed from: coocent.musiclibrary.music.j.h */
/* compiled from: PreferencesUtility */
public final class C7393h {

    /* renamed from: a */
    private static String f32487a = "isListStop";

    /* renamed from: b */
    private static C7393h f32488b;

    /* renamed from: c */
    private static SharedPreferences f32489c;

    public C7393h(Context context) {
        f32489c = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: f */
    public static final C7393h m41695f(Context context) {
        if (f32488b == null) {
            f32488b = new C7393h(context.getApplicationContext());
        }
        return f32488b;
    }

    /* renamed from: a */
    public int mo28180a(int i, List<Music> list) {
        if (mo28186h() != 4 && mo28186h() != 5) {
            return f32489c.getInt("current_position", 0);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).mo9215k() == mo28184e()) {
                return i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final String mo28181b() {
        return f32489c.getString("album_song_sort_order", "track, title_key");
    }

    /* renamed from: c */
    public boolean mo28182c() {
        return f32489c.getBoolean(f32487a, false);
    }

    /* renamed from: d */
    public int mo28183d() {
        return f32489c.getInt("current_audio_progress", 0);
    }

    /* renamed from: e */
    public long mo28184e() {
        return f32489c.getLong("current_audio_id", 0);
    }

    /* renamed from: g */
    public int mo28185g() {
        return f32489c.getInt("current_position", 0);
    }

    /* renamed from: h */
    public int mo28186h() {
        return f32489c.getInt("play_mode", 1);
    }

    /* renamed from: i */
    public final String mo28187i() {
        return f32489c.getString("song_sort_order", "title_key");
    }

    /* renamed from: j */
    public int mo28188j() {
        return f32489c.getInt("viewpager_type", 0);
    }

    /* renamed from: k */
    public void mo28189k(boolean z) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putBoolean(f32487a, z);
        edit.apply();
    }

    /* renamed from: l */
    public void mo28190l(double d) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putInt("current_audio_progress", (int) d);
        edit.apply();
    }

    /* renamed from: m */
    public void mo28191m(double d) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putInt("current_audio_total_time", (int) d);
        edit.apply();
    }

    /* renamed from: n */
    public void mo28192n(long j) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putLong("current_audio_id", j);
        edit.apply();
    }

    /* renamed from: o */
    public void mo28193o(int i) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putInt("current_position", i);
        edit.apply();
    }

    /* renamed from: p */
    public void mo28194p(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        f32489c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* renamed from: q */
    public void mo28195q(int i) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putInt("play_mode", i);
        edit.apply();
    }

    /* renamed from: r */
    public void mo28196r(int i) {
        SharedPreferences.Editor edit = f32489c.edit();
        edit.putInt("viewpager_type", i);
        edit.apply();
    }
}
