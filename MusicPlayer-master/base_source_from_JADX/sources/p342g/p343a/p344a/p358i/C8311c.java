package p342g.p343a.p344a.p358i;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.i.c */
/* compiled from: ActionUtil */
public class C8311c {

    /* renamed from: a */
    public static String f34734a = "action_track_current_item_notify";

    /* renamed from: b */
    public static String f34735b = "cutter_folder_notify";

    /* renamed from: c */
    public static String f34736c = "media.musicplayer.audioplayer.videoplayer.cutter_folder_detail_notify";

    /* renamed from: d */
    public static String f34737d = "media.musicplayer.audioplayer.videoplayer.skin_change_notify";

    /* renamed from: e */
    public static String f34738e = "media.musicplayer.audioplayer.videoplayer.list_over";

    /* renamed from: a */
    public static String m45962a(int i) {
        switch (i) {
            case 0:
                return "media.musicplayer.audioplayer.videoplayer.track_artwork_item_notify";
            case 1:
                return "media.musicplayer.audioplayer.videoplayer.recent_artwork_item_notify";
            case 2:
                return "media.musicplayer.audioplayer.videoplayer.artist_artwork_item_notify";
            case 3:
                return "media.musicplayer.audioplayer.videoplayer.album_artwork_item_notify";
            case 4:
            case 10:
                return "media.musicplayer.audioplayer.videoplayer.artist_track_artwork_item_notify";
            case 5:
                return "media.musicplayer.audioplayer.videoplayer.album_track_artwork_item_notify";
            case 6:
                return "media.musicplayer.audioplayer.videoplayer.folder_track_artwork_item_notify";
            case 7:
                return "media.musicplayer.audioplayer.videoplayer.playlist_track_artwork_item_notify";
            case 8:
                return "media.musicplayer.audioplayer.videoplayer.toprate_track_artwork_item_notify";
            case 9:
                return "media.musicplayer.audioplayer.videoplayer.genres_track_artwork_item_notify";
            default:
                return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: b */
    public static String m45963b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "song";
            case 2:
                return "artist";
            case 3:
                return "album";
            default:
                return BuildConfig.FLAVOR;
        }
    }
}
