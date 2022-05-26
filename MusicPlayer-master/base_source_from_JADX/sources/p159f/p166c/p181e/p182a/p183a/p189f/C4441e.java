package p159f.p166c.p181e.p182a.p183a.p189f;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.f.e */
/* compiled from: MusicPreference */
public class C4441e {

    /* renamed from: b */
    public static C4441e f13015b;

    /* renamed from: a */
    public SharedPreferences f13016a;

    private C4441e(Context context, String str) {
        this.f13016a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: L */
    private void m19453L(String str, String str2) {
        SharedPreferences.Editor edit = this.f13016a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: n */
    public static C4441e m19454n(Context context) {
        return m19455o(context, "music_preference");
    }

    /* renamed from: o */
    public static C4441e m19455o(Context context, String str) {
        if (f13015b == null) {
            f13015b = new C4441e(context, str);
        }
        return f13015b;
    }

    /* renamed from: A */
    public void mo15097A(String str) {
        m19453L("artist_song_sort_order", str);
    }

    /* renamed from: B */
    public void mo15098B(int i) {
        SharedPreferences.Editor edit = this.f13016a.edit();
        edit.putInt("song_filter_duration", i);
        edit.apply();
    }

    /* renamed from: C */
    public void mo15099C(boolean z) {
        SharedPreferences.Editor edit = this.f13016a.edit();
        edit.putBoolean("first_open_app", z);
        edit.apply();
    }

    /* renamed from: D */
    public void mo15100D(String str) {
        m19453L("folder_sort_order", str);
    }

    /* renamed from: E */
    public void mo15101E(String str) {
        m19453L("folder_song_sort_order", str);
    }

    /* renamed from: F */
    public void mo15102F(String str) {
        m19453L("genres_sort_order", str);
    }

    /* renamed from: G */
    public void mo15103G(String str) {
        m19453L("genres_song_sort_order", str);
    }

    /* renamed from: H */
    public void mo15104H(String str) {
        this.f13016a.edit().putString("modifyAllMusic", str).apply();
    }

    /* renamed from: I */
    public void mo15105I(long j, String str, String str2, String str3) {
        this.f13016a.edit().putString("modify" + j, str + "," + str2 + "," + str3).apply();
    }

    /* renamed from: J */
    public void mo15106J(String str) {
        m19453L("playlist_song_sort_order", str);
    }

    /* renamed from: K */
    public void mo15107K(String str) {
        m19453L("playlist_sort_order", str);
    }

    /* renamed from: M */
    public void mo15108M(String str) {
        m19453L("song_sort_order", str);
    }

    /* renamed from: a */
    public String mo15109a() {
        return this.f13016a.getString("album_sort_order", "album_key");
    }

    /* renamed from: b */
    public String mo15110b() {
        return this.f13016a.getString("album_song_sort_order", "title_key");
    }

    /* renamed from: c */
    public String mo15111c(String str, long j) {
        SharedPreferences sharedPreferences = this.f13016a;
        return sharedPreferences.getString(str + "_artwork_id_" + j, BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public String mo15112d() {
        return this.f13016a.getString("artist_album_sort_order", "album_key");
    }

    /* renamed from: e */
    public String mo15113e() {
        return this.f13016a.getString("artist_sort_order", "artist_key");
    }

    /* renamed from: f */
    public String mo15114f() {
        return this.f13016a.getString("artist_song_sort_order", "title_key");
    }

    /* renamed from: g */
    public int mo15115g() {
        return this.f13016a.getInt("song_filter_duration", 30);
    }

    /* renamed from: h */
    public List<String> mo15116h() {
        String[] split;
        ArrayList arrayList = new ArrayList();
        try {
            String string = this.f13016a.getString("song_filter_folder_paths", BuildConfig.FLAVOR);
            if (!(string == null || string.isEmpty() || (split = string.split(",")) == null)) {
                for (String str : split) {
                    if (str != null && !str.isEmpty()) {
                        arrayList.add(str);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: i */
    public boolean mo15117i() {
        return this.f13016a.getBoolean("first_open_app", true);
    }

    /* renamed from: j */
    public String mo15118j() {
        return this.f13016a.getString("folder_sort_order", "_data");
    }

    /* renamed from: k */
    public String mo15119k() {
        return this.f13016a.getString("folder_song_sort_order", "title_key");
    }

    /* renamed from: l */
    public String mo15120l() {
        return this.f13016a.getString("genres_sort_order", "name");
    }

    /* renamed from: m */
    public String mo15121m() {
        return this.f13016a.getString("genres_song_sort_order", "title_key");
    }

    /* renamed from: p */
    public String mo15122p() {
        return this.f13016a.getString("modifyAllMusic", BuildConfig.FLAVOR);
    }

    /* renamed from: q */
    public String mo15123q(long j) {
        SharedPreferences sharedPreferences = this.f13016a;
        return sharedPreferences.getString("modify" + j, BuildConfig.FLAVOR);
    }

    /* renamed from: r */
    public String mo15124r() {
        return this.f13016a.getString("playlist_song_sort_order", "title_key");
    }

    /* renamed from: s */
    public String mo15125s() {
        return this.f13016a.getString("playlist_sort_order", "name");
    }

    /* renamed from: t */
    public String mo15126t() {
        return this.f13016a.getString("song_sort_order", "title_key");
    }

    /* renamed from: u */
    public void mo15127u(long j) {
        SharedPreferences.Editor edit = this.f13016a.edit();
        edit.remove("modify" + j).apply();
    }

    /* renamed from: v */
    public void mo15128v(String str) {
        m19453L("album_sort_order", str);
    }

    /* renamed from: w */
    public void mo15129w(String str) {
        m19453L("album_song_sort_order", str);
    }

    /* renamed from: x */
    public void mo15130x(String str, long j, String str2) {
        SharedPreferences.Editor edit = this.f13016a.edit();
        edit.putString(str + "_artwork_id_" + j, str2).apply();
    }

    /* renamed from: y */
    public void mo15131y(String str) {
        m19453L("artist_album_sort_order", str);
    }

    /* renamed from: z */
    public void mo15132z(String str) {
        m19453L("artist_sort_order", str);
    }
}
