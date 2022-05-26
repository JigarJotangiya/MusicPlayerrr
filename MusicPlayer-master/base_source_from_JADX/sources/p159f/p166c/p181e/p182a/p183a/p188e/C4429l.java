package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.coocent.music.base.data.entity.Playlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.l */
/* compiled from: PlaylistLoader.kt */
public final class C4429l {

    /* renamed from: a */
    public static final C4429l f13003a = new C4429l();

    private C4429l() {
    }

    /* renamed from: b */
    private final Cursor m19353b(Context context) {
        try {
            return context.getContentResolver().query(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"_id", "name"}, (String) null, (String[]) null, (String) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private final Cursor m19354c(Context context, long j) {
        return context.getContentResolver().query(MediaStore.Audio.Playlists.Members.getContentUri("external", j), new String[]{"audio_id"}, (String) null, (String[]) null, "play_order");
    }

    /* renamed from: a */
    public final List<Playlist> mo15006a(Context context) {
        int i;
        boolean z;
        Cursor c;
        C8594l.m46771e(context, "context");
        ArrayList arrayList = new ArrayList();
        Cursor b = m19353b(context);
        if (b != null && b.moveToFirst()) {
            do {
                try {
                    long j = b.getLong(b.getColumnIndex("_id"));
                    String string = b.getString(b.getColumnIndex("name"));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        i = 0;
                        if (it.hasNext()) {
                            if (C8594l.m46767a(((Playlist) it.next()).mo9242g(), string)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        ArrayList arrayList2 = new ArrayList();
                        c = m19354c(context, j);
                        if (c != null) {
                            i = c.getCount();
                        }
                        if (c != null && c.moveToFirst()) {
                            do {
                                try {
                                    arrayList2.add(Long.valueOf(c.getLong(c.getColumnIndexOrThrow("audio_id"))));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            } while (c.moveToNext());
                            c.close();
                        }
                        arrayList.add(new Playlist(j, string, i, false, C8490t.m46676A(arrayList2)));
                    }
                } catch (Exception e2) {
                    try {
                        e2.printStackTrace();
                    } catch (Throwable th) {
                        b.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    c.close();
                    throw th2;
                }
            } while (b.moveToNext());
            b.close();
        }
        return arrayList;
    }
}
