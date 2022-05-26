package p159f.p166c.p181e.p182a.p183a.p187d;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.coocent.music.base.data.entity.Genres;
import com.coocent.music.base.data.entity.Music;
import com.coocent.music.base.data.entity.Playlist;
import p159f.p166c.p181e.p182a.p183a.p185b.C4370d;
import p159f.p166c.p181e.p182a.p183a.p188e.C4423k;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.d.b */
/* compiled from: EntityKit.kt */
public final class C4377b {

    /* renamed from: a */
    public static final C4377b f12966a = new C4377b();

    private C4377b() {
    }

    /* renamed from: d */
    public static final String[] m19244d(Context context, long j, String str, String str2, String str3) {
        String[] b;
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "title");
        C8594l.m46771e(str2, "album");
        C8594l.m46771e(str3, "artist");
        String[] strArr = {str, str2, str3};
        if (Build.VERSION.SDK_INT >= 29 && (b = C4389e.m19271b(context, j)) != null) {
            strArr[0] = b[0];
            strArr[1] = b[1];
            strArr[2] = b[2];
        }
        return strArr;
    }

    /* renamed from: a */
    public final Genres mo14928a(Cursor cursor) {
        C8594l.m46771e(cursor, "cursor");
        Genres genres = new Genres();
        genres.mo9191g(cursor.getLong(cursor.getColumnIndex("_id")));
        genres.f8207i = cursor.getString(cursor.getColumnIndex("name"));
        return genres;
    }

    /* renamed from: b */
    public final Music mo14929b(Context context, Cursor cursor) {
        Cursor cursor2 = cursor;
        Context context2 = context;
        C8594l.m46771e(context2, "context");
        C8594l.m46771e(cursor2, "it");
        long j = cursor2.getLong(cursor2.getColumnIndex("_id"));
        String string = cursor2.getString(cursor2.getColumnIndex("title"));
        C8594l.m46770d(string, "it.getString(it.getColum…Store.Audio.Media.TITLE))");
        String string2 = cursor2.getString(cursor2.getColumnIndex("artist"));
        C8594l.m46770d(string2, "it.getString(it.getColum…    .Audio.Media.ARTIST))");
        String string3 = cursor2.getString(cursor2.getColumnIndex("album"));
        C8594l.m46770d(string3, "it.getString(it.getColum…     .Audio.Media.ALBUM))");
        int i = cursor2.getInt(cursor2.getColumnIndex("duration"));
        long j2 = cursor2.getLong(cursor2.getColumnIndex("artist_id"));
        long j3 = cursor2.getLong(cursor2.getColumnIndex("album_id"));
        String string4 = cursor2.getString(cursor2.getColumnIndex("_data"));
        C8594l.m46770d(string4, "it.getString(it.getColum…      .Audio.Media.DATA))");
        long j4 = cursor2.getLong(cursor2.getColumnIndex("_size"));
        int i2 = cursor2.getInt(cursor2.getColumnIndex("year"));
        int i3 = cursor2.getInt(cursor2.getColumnIndex("date_added"));
        String string5 = cursor2.getString(cursor2.getColumnIndex("_display_name"));
        C8594l.m46770d(string5, "it.getString(it.getColum…udio.Media.DISPLAY_NAME))");
        String str = string5;
        String[] d = m19244d(context2, j, string, string3, string2);
        int i4 = i3;
        Music music = r2;
        Music music2 = new Music(j, j2, j3, d[0], d[2], d[1], string4, i, j4);
        music.mo9204F(i2);
        music.mo9227v(i4);
        music.mo9228w(str);
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
        C8594l.m46770d(withAppendedId, "ContentUris.withAppended…EXTERNAL_CONTENT_URI, id)");
        music.mo9203D(withAppendedId);
        return music;
    }

    /* renamed from: c */
    public final Playlist mo14930c(Context context, Cursor cursor) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(cursor, "cursor");
        Playlist playlist = new Playlist();
        String string = cursor.getString(cursor.getColumnIndex("name"));
        C8594l.m46770d(string, "cursor.getString(cursor.…aylistDao.PLAYLIST_NAME))");
        playlist.mo9251o(string);
        playlist.mo9249m(cursor.getLong(cursor.getColumnIndex("_ID")));
        playlist.mo9252p(cursor.getInt(cursor.getColumnIndex("songCount")));
        boolean z = false;
        playlist.mo9248l(cursor.getInt(cursor.getColumnIndex("favorite")) > 0);
        String string2 = cursor.getString(cursor.getColumnIndex("thumbnail"));
        if (string2 != null) {
            playlist.mo9253q(string2);
        }
        String string3 = cursor.getString(cursor.getColumnIndex("describe"));
        if (string3 != null) {
            playlist.mo9247k(string3);
        }
        String string4 = cursor.getString(cursor.getColumnIndex("allMusicIds"));
        C4370d a = C4370d.f12958c.mo14843a(context);
        C8594l.m46770d(string4, "musicIdsString");
        long[] D = a.mo14820D(string4);
        if (D.length == 0) {
            z = true;
        }
        if (!z) {
            playlist.mo9250n(C4423k.f13002a.mo14994j(context, D));
            playlist.mo9252p(playlist.mo9241f().length);
        } else {
            playlist.mo9250n(D);
        }
        return playlist;
    }
}
